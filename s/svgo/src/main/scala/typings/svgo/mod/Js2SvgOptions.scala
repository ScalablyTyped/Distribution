package typings.svgo.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Js2SvgOptions extends js.Object {
  
  /** @default '"' */
  var attrEnd: js.UndefOr[String] = js.native
  
  /** @default '="' */
  var attrStart: js.UndefOr[String] = js.native
  
  /** @default ']]>' */
  var cdataEnd: js.UndefOr[String] = js.native
  
  /** @default '<![CDATA[' */
  var cdataStart: js.UndefOr[String] = js.native
  
  /** @default '-->' */
  var commentEnd: js.UndefOr[String] = js.native
  
  /** @default '<!--' */
  var commentStart: js.UndefOr[String] = js.native
  
  /** @default '>' */
  var doctypeEnd: js.UndefOr[String] = js.native
  
  /** @default '<!DOCTYPE' */
  var doctypeStart: js.UndefOr[String] = js.native
  
  /** @default encodeEntity */
  var encodeEntity: js.UndefOr[js.Function1[/* char */ js.UndefOr[String], String]] = js.native
  
  /** @default 4 */
  var indent: js.UndefOr[Double] = js.native
  
  /** @default false */
  var pretty: js.UndefOr[Boolean] = js.native
  
  /** @default '?>' */
  var procInstEnd: js.UndefOr[String] = js.native
  
  /** @default '<?' */
  var procInstStart: js.UndefOr[String] = js.native
  
  /** @default /[&'"<>]/g */
  var regEntities: js.UndefOr[RegExp] = js.native
  
  /** @default /[&"<>]/g */
  var regValEntities: js.UndefOr[RegExp] = js.native
  
  /** @default '>' */
  var tagCloseEnd: js.UndefOr[String] = js.native
  
  /** @default '</' */
  var tagCloseStart: js.UndefOr[String] = js.native
  
  /** @default '>' */
  var tagOpenEnd: js.UndefOr[String] = js.native
  
  /** @default '<' */
  var tagOpenStart: js.UndefOr[String] = js.native
  
  /** @default '/>' */
  var tagShortEnd: js.UndefOr[String] = js.native
  
  /** @default '<' */
  var tagShortStart: js.UndefOr[String] = js.native
  
  /** @default '' */
  var textEnd: js.UndefOr[String] = js.native
  
  /** @default '' */
  var textStart: js.UndefOr[String] = js.native
  
  /** @default true */
  var useShortTags: js.UndefOr[Boolean] = js.native
}
object Js2SvgOptions {
  
  @scala.inline
  def apply(): Js2SvgOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Js2SvgOptions]
  }
  
  @scala.inline
  implicit class Js2SvgOptionsOps[Self <: Js2SvgOptions] (val x: Self) extends AnyVal {
    
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
    def setAttrEnd(value: String): Self = this.set("attrEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttrEnd: Self = this.set("attrEnd", js.undefined)
    
    @scala.inline
    def setAttrStart(value: String): Self = this.set("attrStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttrStart: Self = this.set("attrStart", js.undefined)
    
    @scala.inline
    def setCdataEnd(value: String): Self = this.set("cdataEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCdataEnd: Self = this.set("cdataEnd", js.undefined)
    
    @scala.inline
    def setCdataStart(value: String): Self = this.set("cdataStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCdataStart: Self = this.set("cdataStart", js.undefined)
    
    @scala.inline
    def setCommentEnd(value: String): Self = this.set("commentEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommentEnd: Self = this.set("commentEnd", js.undefined)
    
    @scala.inline
    def setCommentStart(value: String): Self = this.set("commentStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommentStart: Self = this.set("commentStart", js.undefined)
    
    @scala.inline
    def setDoctypeEnd(value: String): Self = this.set("doctypeEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDoctypeEnd: Self = this.set("doctypeEnd", js.undefined)
    
    @scala.inline
    def setDoctypeStart(value: String): Self = this.set("doctypeStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDoctypeStart: Self = this.set("doctypeStart", js.undefined)
    
    @scala.inline
    def setEncodeEntity(value: /* char */ js.UndefOr[String] => String): Self = this.set("encodeEntity", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteEncodeEntity: Self = this.set("encodeEntity", js.undefined)
    
    @scala.inline
    def setIndent(value: Double): Self = this.set("indent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndent: Self = this.set("indent", js.undefined)
    
    @scala.inline
    def setPretty(value: Boolean): Self = this.set("pretty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePretty: Self = this.set("pretty", js.undefined)
    
    @scala.inline
    def setProcInstEnd(value: String): Self = this.set("procInstEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProcInstEnd: Self = this.set("procInstEnd", js.undefined)
    
    @scala.inline
    def setProcInstStart(value: String): Self = this.set("procInstStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProcInstStart: Self = this.set("procInstStart", js.undefined)
    
    @scala.inline
    def setRegEntities(value: RegExp): Self = this.set("regEntities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegEntities: Self = this.set("regEntities", js.undefined)
    
    @scala.inline
    def setRegValEntities(value: RegExp): Self = this.set("regValEntities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegValEntities: Self = this.set("regValEntities", js.undefined)
    
    @scala.inline
    def setTagCloseEnd(value: String): Self = this.set("tagCloseEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagCloseEnd: Self = this.set("tagCloseEnd", js.undefined)
    
    @scala.inline
    def setTagCloseStart(value: String): Self = this.set("tagCloseStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagCloseStart: Self = this.set("tagCloseStart", js.undefined)
    
    @scala.inline
    def setTagOpenEnd(value: String): Self = this.set("tagOpenEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagOpenEnd: Self = this.set("tagOpenEnd", js.undefined)
    
    @scala.inline
    def setTagOpenStart(value: String): Self = this.set("tagOpenStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagOpenStart: Self = this.set("tagOpenStart", js.undefined)
    
    @scala.inline
    def setTagShortEnd(value: String): Self = this.set("tagShortEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagShortEnd: Self = this.set("tagShortEnd", js.undefined)
    
    @scala.inline
    def setTagShortStart(value: String): Self = this.set("tagShortStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagShortStart: Self = this.set("tagShortStart", js.undefined)
    
    @scala.inline
    def setTextEnd(value: String): Self = this.set("textEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextEnd: Self = this.set("textEnd", js.undefined)
    
    @scala.inline
    def setTextStart(value: String): Self = this.set("textStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextStart: Self = this.set("textStart", js.undefined)
    
    @scala.inline
    def setUseShortTags(value: Boolean): Self = this.set("useShortTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseShortTags: Self = this.set("useShortTags", js.undefined)
  }
}
