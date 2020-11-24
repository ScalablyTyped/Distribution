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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  align :'left' | 'center' | 'right' | 'justify',   bold :'strong',   italic :'em',   underline :true,   strike :'del',   lineHeight :string,   letterSpacing :string,   marginTop :string,   marginBottom :string,   fontFamily :string,   fontSize :string,   color :string,   backgroundColor :string,   list :'checked' | 'unchecked' | 'ordered' | 'bullet',   indent :number,   header :number,   script :'sub' | 'super',   direction :'rtl'}> */
@js.native
trait Partialalignleftcenterrig extends js.Object {
  
  var align: js.UndefOr[left | center | right | justify] = js.native
  
  var backgroundColor: js.UndefOr[String] = js.native
  
  var bold: js.UndefOr[strong] = js.native
  
  var color: js.UndefOr[String] = js.native
  
  var direction: js.UndefOr[rtl] = js.native
  
  var fontFamily: js.UndefOr[String] = js.native
  
  var fontSize: js.UndefOr[String] = js.native
  
  var header: js.UndefOr[Double] = js.native
  
  var indent: js.UndefOr[Double] = js.native
  
  var italic: js.UndefOr[em] = js.native
  
  var letterSpacing: js.UndefOr[String] = js.native
  
  var lineHeight: js.UndefOr[String] = js.native
  
  var list: js.UndefOr[checked | unchecked | ordered | bullet] = js.native
  
  var marginBottom: js.UndefOr[String] = js.native
  
  var marginTop: js.UndefOr[String] = js.native
  
  var script: js.UndefOr[sub | `super`] = js.native
  
  var strike: js.UndefOr[del] = js.native
  
  var underline: js.UndefOr[`true`] = js.native
}
object Partialalignleftcenterrig {
  
  @scala.inline
  def apply(): Partialalignleftcenterrig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Partialalignleftcenterrig]
  }
  
  @scala.inline
  implicit class PartialalignleftcenterrigOps[Self <: Partialalignleftcenterrig] (val x: Self) extends AnyVal {
    
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
    def setAlign(value: left | center | right | justify): Self = this.set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    
    @scala.inline
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setBold(value: strong): Self = this.set("bold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBold: Self = this.set("bold", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setDirection(value: rtl): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    
    @scala.inline
    def setFontFamily(value: String): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontFamily: Self = this.set("fontFamily", js.undefined)
    
    @scala.inline
    def setFontSize(value: String): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    
    @scala.inline
    def setHeader(value: Double): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    
    @scala.inline
    def setIndent(value: Double): Self = this.set("indent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndent: Self = this.set("indent", js.undefined)
    
    @scala.inline
    def setItalic(value: em): Self = this.set("italic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItalic: Self = this.set("italic", js.undefined)
    
    @scala.inline
    def setLetterSpacing(value: String): Self = this.set("letterSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLetterSpacing: Self = this.set("letterSpacing", js.undefined)
    
    @scala.inline
    def setLineHeight(value: String): Self = this.set("lineHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineHeight: Self = this.set("lineHeight", js.undefined)
    
    @scala.inline
    def setList(value: checked | unchecked | ordered | bullet): Self = this.set("list", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteList: Self = this.set("list", js.undefined)
    
    @scala.inline
    def setMarginBottom(value: String): Self = this.set("marginBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarginBottom: Self = this.set("marginBottom", js.undefined)
    
    @scala.inline
    def setMarginTop(value: String): Self = this.set("marginTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarginTop: Self = this.set("marginTop", js.undefined)
    
    @scala.inline
    def setScript(value: sub | `super`): Self = this.set("script", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScript: Self = this.set("script", js.undefined)
    
    @scala.inline
    def setStrike(value: del): Self = this.set("strike", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrike: Self = this.set("strike", js.undefined)
    
    @scala.inline
    def setUnderline(value: `true`): Self = this.set("underline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnderline: Self = this.set("underline", js.undefined)
  }
}
