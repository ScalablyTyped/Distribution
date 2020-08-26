package typings.xmlJs.mod.Options

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JS2XML
  extends ChangingKeyNames
     with IgnoreOptions {
  var attributeNameFn: js.UndefOr[
    js.Function4[
      /* attributeName */ String, 
      /* attributeValue */ String, 
      /* currentElementName */ String, 
      /* currentElementObj */ js.Object, 
      Unit
    ]
  ] = js.native
  var attributeValueFn: js.UndefOr[
    js.Function4[
      /* attributeValue */ String, 
      /* attributeName */ String, 
      /* currentElementName */ String, 
      /* currentElementObj */ js.Object, 
      Unit
    ]
  ] = js.native
  var attributesFn: js.UndefOr[
    js.Function3[
      /* value */ String, 
      /* currentElementName */ String, 
      /* currentElementObj */ js.Object, 
      Unit
    ]
  ] = js.native
  var cdataFn: js.UndefOr[
    js.Function3[
      /* value */ String, 
      /* currentElementName */ String, 
      /* currentElementObj */ js.Object, 
      Unit
    ]
  ] = js.native
  var commentFn: js.UndefOr[
    js.Function3[
      /* value */ String, 
      /* currentElementName */ String, 
      /* currentElementObj */ js.Object, 
      Unit
    ]
  ] = js.native
  var compact: js.UndefOr[Boolean] = js.native
  var doctypeFn: js.UndefOr[
    js.Function3[
      /* value */ String, 
      /* currentElementName */ String, 
      /* currentElementObj */ js.Object, 
      Unit
    ]
  ] = js.native
  var elementNameFn: js.UndefOr[
    js.Function3[
      /* value */ String, 
      /* currentElementName */ String, 
      /* currentElementObj */ js.Object, 
      Unit
    ]
  ] = js.native
  var fullTagEmptyElement: js.UndefOr[Boolean] = js.native
  var fullTagEmptyElementFn: js.UndefOr[
    js.Function2[/* currentElementName */ String, /* currentElementObj */ js.Object, Unit]
  ] = js.native
  var indentAttributes: js.UndefOr[Boolean] = js.native
  var indentCdata: js.UndefOr[Boolean] = js.native
  var indentInstruction: js.UndefOr[Boolean] = js.native
  var indentText: js.UndefOr[Boolean] = js.native
  var instructionFn: js.UndefOr[
    js.Function4[
      /* instructionValue */ String, 
      /* instructionName */ String, 
      /* currentElementName */ String, 
      /* currentElementObj */ js.Object, 
      Unit
    ]
  ] = js.native
  var instructionNameFn: js.UndefOr[
    js.Function4[
      /* instructionName */ String, 
      /* instructionValue */ String, 
      /* currentElementName */ String, 
      /* currentElementObj */ js.Object, 
      Unit
    ]
  ] = js.native
  var noQuotesForNativeAttributes: js.UndefOr[Boolean] = js.native
  var spaces: js.UndefOr[Double | String] = js.native
  var textFn: js.UndefOr[
    js.Function3[
      /* value */ String, 
      /* currentElementName */ String, 
      /* currentElementObj */ js.Object, 
      Unit
    ]
  ] = js.native
}

object JS2XML {
  @scala.inline
  def apply(): JS2XML = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JS2XML]
  }
  @scala.inline
  implicit class JS2XMLOps[Self <: JS2XML] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAttributeNameFn(
      value: (/* attributeName */ String, /* attributeValue */ String, /* currentElementName */ String, /* currentElementObj */ js.Object) => Unit
    ): Self = this.set("attributeNameFn", js.Any.fromFunction4(value))
    @scala.inline
    def deleteAttributeNameFn: Self = this.set("attributeNameFn", js.undefined)
    @scala.inline
    def setAttributeValueFn(
      value: (/* attributeValue */ String, /* attributeName */ String, /* currentElementName */ String, /* currentElementObj */ js.Object) => Unit
    ): Self = this.set("attributeValueFn", js.Any.fromFunction4(value))
    @scala.inline
    def deleteAttributeValueFn: Self = this.set("attributeValueFn", js.undefined)
    @scala.inline
    def setAttributesFn(
      value: (/* value */ String, /* currentElementName */ String, /* currentElementObj */ js.Object) => Unit
    ): Self = this.set("attributesFn", js.Any.fromFunction3(value))
    @scala.inline
    def deleteAttributesFn: Self = this.set("attributesFn", js.undefined)
    @scala.inline
    def setCdataFn(
      value: (/* value */ String, /* currentElementName */ String, /* currentElementObj */ js.Object) => Unit
    ): Self = this.set("cdataFn", js.Any.fromFunction3(value))
    @scala.inline
    def deleteCdataFn: Self = this.set("cdataFn", js.undefined)
    @scala.inline
    def setCommentFn(
      value: (/* value */ String, /* currentElementName */ String, /* currentElementObj */ js.Object) => Unit
    ): Self = this.set("commentFn", js.Any.fromFunction3(value))
    @scala.inline
    def deleteCommentFn: Self = this.set("commentFn", js.undefined)
    @scala.inline
    def setCompact(value: Boolean): Self = this.set("compact", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompact: Self = this.set("compact", js.undefined)
    @scala.inline
    def setDoctypeFn(
      value: (/* value */ String, /* currentElementName */ String, /* currentElementObj */ js.Object) => Unit
    ): Self = this.set("doctypeFn", js.Any.fromFunction3(value))
    @scala.inline
    def deleteDoctypeFn: Self = this.set("doctypeFn", js.undefined)
    @scala.inline
    def setElementNameFn(
      value: (/* value */ String, /* currentElementName */ String, /* currentElementObj */ js.Object) => Unit
    ): Self = this.set("elementNameFn", js.Any.fromFunction3(value))
    @scala.inline
    def deleteElementNameFn: Self = this.set("elementNameFn", js.undefined)
    @scala.inline
    def setFullTagEmptyElement(value: Boolean): Self = this.set("fullTagEmptyElement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullTagEmptyElement: Self = this.set("fullTagEmptyElement", js.undefined)
    @scala.inline
    def setFullTagEmptyElementFn(value: (/* currentElementName */ String, /* currentElementObj */ js.Object) => Unit): Self = this.set("fullTagEmptyElementFn", js.Any.fromFunction2(value))
    @scala.inline
    def deleteFullTagEmptyElementFn: Self = this.set("fullTagEmptyElementFn", js.undefined)
    @scala.inline
    def setIndentAttributes(value: Boolean): Self = this.set("indentAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndentAttributes: Self = this.set("indentAttributes", js.undefined)
    @scala.inline
    def setIndentCdata(value: Boolean): Self = this.set("indentCdata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndentCdata: Self = this.set("indentCdata", js.undefined)
    @scala.inline
    def setIndentInstruction(value: Boolean): Self = this.set("indentInstruction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndentInstruction: Self = this.set("indentInstruction", js.undefined)
    @scala.inline
    def setIndentText(value: Boolean): Self = this.set("indentText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndentText: Self = this.set("indentText", js.undefined)
    @scala.inline
    def setInstructionFn(
      value: (/* instructionValue */ String, /* instructionName */ String, /* currentElementName */ String, /* currentElementObj */ js.Object) => Unit
    ): Self = this.set("instructionFn", js.Any.fromFunction4(value))
    @scala.inline
    def deleteInstructionFn: Self = this.set("instructionFn", js.undefined)
    @scala.inline
    def setInstructionNameFn(
      value: (/* instructionName */ String, /* instructionValue */ String, /* currentElementName */ String, /* currentElementObj */ js.Object) => Unit
    ): Self = this.set("instructionNameFn", js.Any.fromFunction4(value))
    @scala.inline
    def deleteInstructionNameFn: Self = this.set("instructionNameFn", js.undefined)
    @scala.inline
    def setNoQuotesForNativeAttributes(value: Boolean): Self = this.set("noQuotesForNativeAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoQuotesForNativeAttributes: Self = this.set("noQuotesForNativeAttributes", js.undefined)
    @scala.inline
    def setSpaces(value: Double | String): Self = this.set("spaces", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpaces: Self = this.set("spaces", js.undefined)
    @scala.inline
    def setTextFn(
      value: (/* value */ String, /* currentElementName */ String, /* currentElementObj */ js.Object) => Unit
    ): Self = this.set("textFn", js.Any.fromFunction3(value))
    @scala.inline
    def deleteTextFn: Self = this.set("textFn", js.undefined)
  }
  
}

