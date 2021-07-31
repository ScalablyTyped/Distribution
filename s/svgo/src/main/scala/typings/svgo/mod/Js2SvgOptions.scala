package typings.svgo.mod

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Js2SvgOptions extends StObject {
  
  /** @default '"' */
  var attrEnd: js.UndefOr[String] = js.undefined
  
  /** @default '="' */
  var attrStart: js.UndefOr[String] = js.undefined
  
  /** @default ']]>' */
  var cdataEnd: js.UndefOr[String] = js.undefined
  
  /** @default '<![CDATA[' */
  var cdataStart: js.UndefOr[String] = js.undefined
  
  /** @default '-->' */
  var commentEnd: js.UndefOr[String] = js.undefined
  
  /** @default '<!--' */
  var commentStart: js.UndefOr[String] = js.undefined
  
  /** @default '>' */
  var doctypeEnd: js.UndefOr[String] = js.undefined
  
  /** @default '<!DOCTYPE' */
  var doctypeStart: js.UndefOr[String] = js.undefined
  
  /** @default encodeEntity */
  var encodeEntity: js.UndefOr[js.Function1[/* char */ js.UndefOr[String], String]] = js.undefined
  
  /** @default 4 */
  var indent: js.UndefOr[Double] = js.undefined
  
  /** @default false */
  var pretty: js.UndefOr[Boolean] = js.undefined
  
  /** @default '?>' */
  var procInstEnd: js.UndefOr[String] = js.undefined
  
  /** @default '<?' */
  var procInstStart: js.UndefOr[String] = js.undefined
  
  /** @default /[&'"<>]/g */
  var regEntities: js.UndefOr[RegExp] = js.undefined
  
  /** @default /[&"<>]/g */
  var regValEntities: js.UndefOr[RegExp] = js.undefined
  
  /** @default '>' */
  var tagCloseEnd: js.UndefOr[String] = js.undefined
  
  /** @default '</' */
  var tagCloseStart: js.UndefOr[String] = js.undefined
  
  /** @default '>' */
  var tagOpenEnd: js.UndefOr[String] = js.undefined
  
  /** @default '<' */
  var tagOpenStart: js.UndefOr[String] = js.undefined
  
  /** @default '/>' */
  var tagShortEnd: js.UndefOr[String] = js.undefined
  
  /** @default '<' */
  var tagShortStart: js.UndefOr[String] = js.undefined
  
  /** @default '' */
  var textEnd: js.UndefOr[String] = js.undefined
  
  /** @default '' */
  var textStart: js.UndefOr[String] = js.undefined
  
  /** @default true */
  var useShortTags: js.UndefOr[Boolean] = js.undefined
}
object Js2SvgOptions {
  
  @scala.inline
  def apply(): Js2SvgOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Js2SvgOptions]
  }
  
  @scala.inline
  implicit class Js2SvgOptionsMutableBuilder[Self <: Js2SvgOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttrEnd(value: String): Self = StObject.set(x, "attrEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttrEndUndefined: Self = StObject.set(x, "attrEnd", js.undefined)
    
    @scala.inline
    def setAttrStart(value: String): Self = StObject.set(x, "attrStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttrStartUndefined: Self = StObject.set(x, "attrStart", js.undefined)
    
    @scala.inline
    def setCdataEnd(value: String): Self = StObject.set(x, "cdataEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCdataEndUndefined: Self = StObject.set(x, "cdataEnd", js.undefined)
    
    @scala.inline
    def setCdataStart(value: String): Self = StObject.set(x, "cdataStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCdataStartUndefined: Self = StObject.set(x, "cdataStart", js.undefined)
    
    @scala.inline
    def setCommentEnd(value: String): Self = StObject.set(x, "commentEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentEndUndefined: Self = StObject.set(x, "commentEnd", js.undefined)
    
    @scala.inline
    def setCommentStart(value: String): Self = StObject.set(x, "commentStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentStartUndefined: Self = StObject.set(x, "commentStart", js.undefined)
    
    @scala.inline
    def setDoctypeEnd(value: String): Self = StObject.set(x, "doctypeEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoctypeEndUndefined: Self = StObject.set(x, "doctypeEnd", js.undefined)
    
    @scala.inline
    def setDoctypeStart(value: String): Self = StObject.set(x, "doctypeStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoctypeStartUndefined: Self = StObject.set(x, "doctypeStart", js.undefined)
    
    @scala.inline
    def setEncodeEntity(value: /* char */ js.UndefOr[String] => String): Self = StObject.set(x, "encodeEntity", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEncodeEntityUndefined: Self = StObject.set(x, "encodeEntity", js.undefined)
    
    @scala.inline
    def setIndent(value: Double): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
    
    @scala.inline
    def setPretty(value: Boolean): Self = StObject.set(x, "pretty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrettyUndefined: Self = StObject.set(x, "pretty", js.undefined)
    
    @scala.inline
    def setProcInstEnd(value: String): Self = StObject.set(x, "procInstEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcInstEndUndefined: Self = StObject.set(x, "procInstEnd", js.undefined)
    
    @scala.inline
    def setProcInstStart(value: String): Self = StObject.set(x, "procInstStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcInstStartUndefined: Self = StObject.set(x, "procInstStart", js.undefined)
    
    @scala.inline
    def setRegEntities(value: RegExp): Self = StObject.set(x, "regEntities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegEntitiesUndefined: Self = StObject.set(x, "regEntities", js.undefined)
    
    @scala.inline
    def setRegValEntities(value: RegExp): Self = StObject.set(x, "regValEntities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegValEntitiesUndefined: Self = StObject.set(x, "regValEntities", js.undefined)
    
    @scala.inline
    def setTagCloseEnd(value: String): Self = StObject.set(x, "tagCloseEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagCloseEndUndefined: Self = StObject.set(x, "tagCloseEnd", js.undefined)
    
    @scala.inline
    def setTagCloseStart(value: String): Self = StObject.set(x, "tagCloseStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagCloseStartUndefined: Self = StObject.set(x, "tagCloseStart", js.undefined)
    
    @scala.inline
    def setTagOpenEnd(value: String): Self = StObject.set(x, "tagOpenEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagOpenEndUndefined: Self = StObject.set(x, "tagOpenEnd", js.undefined)
    
    @scala.inline
    def setTagOpenStart(value: String): Self = StObject.set(x, "tagOpenStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagOpenStartUndefined: Self = StObject.set(x, "tagOpenStart", js.undefined)
    
    @scala.inline
    def setTagShortEnd(value: String): Self = StObject.set(x, "tagShortEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagShortEndUndefined: Self = StObject.set(x, "tagShortEnd", js.undefined)
    
    @scala.inline
    def setTagShortStart(value: String): Self = StObject.set(x, "tagShortStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagShortStartUndefined: Self = StObject.set(x, "tagShortStart", js.undefined)
    
    @scala.inline
    def setTextEnd(value: String): Self = StObject.set(x, "textEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextEndUndefined: Self = StObject.set(x, "textEnd", js.undefined)
    
    @scala.inline
    def setTextStart(value: String): Self = StObject.set(x, "textStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextStartUndefined: Self = StObject.set(x, "textStart", js.undefined)
    
    @scala.inline
    def setUseShortTags(value: Boolean): Self = StObject.set(x, "useShortTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseShortTagsUndefined: Self = StObject.set(x, "useShortTags", js.undefined)
  }
}
