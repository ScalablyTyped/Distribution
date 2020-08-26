package typings.xmlJs.mod.Options

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XML2JS
  extends ChangingKeyNames
     with IgnoreOptions {
  var addParent: js.UndefOr[Boolean] = js.native
  var alwaysArray: js.UndefOr[Boolean | js.Array[String]] = js.native
  var alwaysChildren: js.UndefOr[Boolean] = js.native
  var attributeNameFn: js.UndefOr[
    js.Function3[
      /* attributeName */ String, 
      /* attributeValue */ String, 
      /* parentElement */ String, 
      Unit
    ]
  ] = js.native
  var attributeValueFn: js.UndefOr[
    js.Function3[
      /* attributeValue */ String, 
      /* attributeName */ String, 
      /* parentElement */ String, 
      Unit
    ]
  ] = js.native
  var attributesFn: js.UndefOr[js.Function2[/* value */ String, /* parentElement */ String, Unit]] = js.native
  var captureSpacesBetweenElements: js.UndefOr[Boolean] = js.native
  var cdataFn: js.UndefOr[js.Function2[/* value */ String, /* parentElement */ js.Object, Unit]] = js.native
  var commentFn: js.UndefOr[js.Function2[/* value */ String, /* parentElement */ js.Object, Unit]] = js.native
  var compact: js.UndefOr[Boolean] = js.native
  var doctypeFn: js.UndefOr[js.Function2[/* value */ String, /* parentElement */ js.Object, Unit]] = js.native
  var elementNameFn: js.UndefOr[js.Function2[/* value */ String, /* parentElement */ js.Object, Unit]] = js.native
  var instructionFn: js.UndefOr[
    js.Function3[
      /* instructionValue */ String, 
      /* instructionName */ String, 
      /* parentElement */ String, 
      Unit
    ]
  ] = js.native
  var instructionHasAttributes: js.UndefOr[Boolean] = js.native
  var instructionNameFn: js.UndefOr[
    js.Function3[
      /* instructionName */ String, 
      /* instructionValue */ String, 
      /* parentElement */ String, 
      Unit
    ]
  ] = js.native
  var nativeType: js.UndefOr[Boolean] = js.native
  var sanitize: js.UndefOr[Boolean] = js.native
  var textFn: js.UndefOr[js.Function2[/* value */ String, /* parentElement */ js.Object, Unit]] = js.native
  var trim: js.UndefOr[Boolean] = js.native
}

object XML2JS {
  @scala.inline
  def apply(): XML2JS = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XML2JS]
  }
  @scala.inline
  implicit class XML2JSOps[Self <: XML2JS] (val x: Self) extends AnyVal {
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
    def setAddParent(value: Boolean): Self = this.set("addParent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddParent: Self = this.set("addParent", js.undefined)
    @scala.inline
    def setAlwaysArrayVarargs(value: String*): Self = this.set("alwaysArray", js.Array(value :_*))
    @scala.inline
    def setAlwaysArray(value: Boolean | js.Array[String]): Self = this.set("alwaysArray", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlwaysArray: Self = this.set("alwaysArray", js.undefined)
    @scala.inline
    def setAlwaysChildren(value: Boolean): Self = this.set("alwaysChildren", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlwaysChildren: Self = this.set("alwaysChildren", js.undefined)
    @scala.inline
    def setAttributeNameFn(
      value: (/* attributeName */ String, /* attributeValue */ String, /* parentElement */ String) => Unit
    ): Self = this.set("attributeNameFn", js.Any.fromFunction3(value))
    @scala.inline
    def deleteAttributeNameFn: Self = this.set("attributeNameFn", js.undefined)
    @scala.inline
    def setAttributeValueFn(
      value: (/* attributeValue */ String, /* attributeName */ String, /* parentElement */ String) => Unit
    ): Self = this.set("attributeValueFn", js.Any.fromFunction3(value))
    @scala.inline
    def deleteAttributeValueFn: Self = this.set("attributeValueFn", js.undefined)
    @scala.inline
    def setAttributesFn(value: (/* value */ String, /* parentElement */ String) => Unit): Self = this.set("attributesFn", js.Any.fromFunction2(value))
    @scala.inline
    def deleteAttributesFn: Self = this.set("attributesFn", js.undefined)
    @scala.inline
    def setCaptureSpacesBetweenElements(value: Boolean): Self = this.set("captureSpacesBetweenElements", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaptureSpacesBetweenElements: Self = this.set("captureSpacesBetweenElements", js.undefined)
    @scala.inline
    def setCdataFn(value: (/* value */ String, /* parentElement */ js.Object) => Unit): Self = this.set("cdataFn", js.Any.fromFunction2(value))
    @scala.inline
    def deleteCdataFn: Self = this.set("cdataFn", js.undefined)
    @scala.inline
    def setCommentFn(value: (/* value */ String, /* parentElement */ js.Object) => Unit): Self = this.set("commentFn", js.Any.fromFunction2(value))
    @scala.inline
    def deleteCommentFn: Self = this.set("commentFn", js.undefined)
    @scala.inline
    def setCompact(value: Boolean): Self = this.set("compact", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompact: Self = this.set("compact", js.undefined)
    @scala.inline
    def setDoctypeFn(value: (/* value */ String, /* parentElement */ js.Object) => Unit): Self = this.set("doctypeFn", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDoctypeFn: Self = this.set("doctypeFn", js.undefined)
    @scala.inline
    def setElementNameFn(value: (/* value */ String, /* parentElement */ js.Object) => Unit): Self = this.set("elementNameFn", js.Any.fromFunction2(value))
    @scala.inline
    def deleteElementNameFn: Self = this.set("elementNameFn", js.undefined)
    @scala.inline
    def setInstructionFn(
      value: (/* instructionValue */ String, /* instructionName */ String, /* parentElement */ String) => Unit
    ): Self = this.set("instructionFn", js.Any.fromFunction3(value))
    @scala.inline
    def deleteInstructionFn: Self = this.set("instructionFn", js.undefined)
    @scala.inline
    def setInstructionHasAttributes(value: Boolean): Self = this.set("instructionHasAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstructionHasAttributes: Self = this.set("instructionHasAttributes", js.undefined)
    @scala.inline
    def setInstructionNameFn(
      value: (/* instructionName */ String, /* instructionValue */ String, /* parentElement */ String) => Unit
    ): Self = this.set("instructionNameFn", js.Any.fromFunction3(value))
    @scala.inline
    def deleteInstructionNameFn: Self = this.set("instructionNameFn", js.undefined)
    @scala.inline
    def setNativeType(value: Boolean): Self = this.set("nativeType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNativeType: Self = this.set("nativeType", js.undefined)
    @scala.inline
    def setSanitize(value: Boolean): Self = this.set("sanitize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSanitize: Self = this.set("sanitize", js.undefined)
    @scala.inline
    def setTextFn(value: (/* value */ String, /* parentElement */ js.Object) => Unit): Self = this.set("textFn", js.Any.fromFunction2(value))
    @scala.inline
    def deleteTextFn: Self = this.set("textFn", js.undefined)
    @scala.inline
    def setTrim(value: Boolean): Self = this.set("trim", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrim: Self = this.set("trim", js.undefined)
  }
  
}

