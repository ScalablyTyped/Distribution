package typings.wechatMiniprogram.anon

import typings.wechatMiniprogram.wechatMiniprogramBooleans.`true`
import typings.wechatMiniprogram.wechatMiniprogramStrings.`super`
import typings.wechatMiniprogram.wechatMiniprogramStrings.bullet
import typings.wechatMiniprogram.wechatMiniprogramStrings.center
import typings.wechatMiniprogram.wechatMiniprogramStrings.checked
import typings.wechatMiniprogram.wechatMiniprogramStrings.del
import typings.wechatMiniprogram.wechatMiniprogramStrings.em
import typings.wechatMiniprogram.wechatMiniprogramStrings.justify
import typings.wechatMiniprogram.wechatMiniprogramStrings.left
import typings.wechatMiniprogram.wechatMiniprogramStrings.ordered
import typings.wechatMiniprogram.wechatMiniprogramStrings.right
import typings.wechatMiniprogram.wechatMiniprogramStrings.rtl
import typings.wechatMiniprogram.wechatMiniprogramStrings.strong
import typings.wechatMiniprogram.wechatMiniprogramStrings.sub
import typings.wechatMiniprogram.wechatMiniprogramStrings.unchecked
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  align :'left' | 'center' | 'right' | 'justify',   bold :'strong',   italic :'em',   underline :true,   strike :'del',   lineHeight :string,   letterSpacing :string,   marginTop :string,   marginBottom :string,   fontFamily :string,   fontSize :string,   color :string,   backgroundColor :string,   list :'checked' | 'unchecked' | 'ordered' | 'bullet',   indent :number,   header :number,   script :'sub' | 'super',   direction :'rtl'}> */
trait Partialalignleftcenterrig extends StObject {
  
  var align: js.UndefOr[left | center | right | justify] = js.undefined
  
  var backgroundColor: js.UndefOr[String] = js.undefined
  
  var bold: js.UndefOr[strong] = js.undefined
  
  var color: js.UndefOr[String] = js.undefined
  
  var direction: js.UndefOr[rtl] = js.undefined
  
  var fontFamily: js.UndefOr[String] = js.undefined
  
  var fontSize: js.UndefOr[String] = js.undefined
  
  var header: js.UndefOr[Double] = js.undefined
  
  var indent: js.UndefOr[Double] = js.undefined
  
  var italic: js.UndefOr[em] = js.undefined
  
  var letterSpacing: js.UndefOr[String] = js.undefined
  
  var lineHeight: js.UndefOr[String] = js.undefined
  
  var list: js.UndefOr[checked | unchecked | ordered | bullet] = js.undefined
  
  var marginBottom: js.UndefOr[String] = js.undefined
  
  var marginTop: js.UndefOr[String] = js.undefined
  
  var script: js.UndefOr[sub | `super`] = js.undefined
  
  var strike: js.UndefOr[del] = js.undefined
  
  var underline: js.UndefOr[`true`] = js.undefined
}
object Partialalignleftcenterrig {
  
  inline def apply(): Partialalignleftcenterrig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Partialalignleftcenterrig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Partialalignleftcenterrig] (val x: Self) extends AnyVal {
    
    inline def setAlign(value: left | center | right | justify): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setBold(value: strong): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
    
    inline def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDirection(value: rtl): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
    
    inline def setFontSize(value: String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    inline def setHeader(value: Double): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setIndent(value: Double): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
    
    inline def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
    
    inline def setItalic(value: em): Self = StObject.set(x, "italic", value.asInstanceOf[js.Any])
    
    inline def setItalicUndefined: Self = StObject.set(x, "italic", js.undefined)
    
    inline def setLetterSpacing(value: String): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
    
    inline def setLetterSpacingUndefined: Self = StObject.set(x, "letterSpacing", js.undefined)
    
    inline def setLineHeight(value: String): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
    
    inline def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
    
    inline def setList(value: checked | unchecked | ordered | bullet): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
    
    inline def setListUndefined: Self = StObject.set(x, "list", js.undefined)
    
    inline def setMarginBottom(value: String): Self = StObject.set(x, "marginBottom", value.asInstanceOf[js.Any])
    
    inline def setMarginBottomUndefined: Self = StObject.set(x, "marginBottom", js.undefined)
    
    inline def setMarginTop(value: String): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
    
    inline def setMarginTopUndefined: Self = StObject.set(x, "marginTop", js.undefined)
    
    inline def setScript(value: sub | `super`): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
    
    inline def setScriptUndefined: Self = StObject.set(x, "script", js.undefined)
    
    inline def setStrike(value: del): Self = StObject.set(x, "strike", value.asInstanceOf[js.Any])
    
    inline def setStrikeUndefined: Self = StObject.set(x, "strike", js.undefined)
    
    inline def setUnderline(value: `true`): Self = StObject.set(x, "underline", value.asInstanceOf[js.Any])
    
    inline def setUnderlineUndefined: Self = StObject.set(x, "underline", js.undefined)
  }
}
