package typings.useMediaAntdQuery.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Lg extends js.Object {
  
  var lg: MaxWidth = js.native
  
  var md: MaxWidth = js.native
  
  var sm: MaxWidth = js.native
  
  var xl: MaxWidth = js.native
  
  var xs: MatchMedia = js.native
  
  var xxl: MinWidth = js.native
}
object Lg {
  
  @scala.inline
  def apply(lg: MaxWidth, md: MaxWidth, sm: MaxWidth, xl: MaxWidth, xs: MatchMedia, xxl: MinWidth): Lg = {
    val __obj = js.Dynamic.literal(lg = lg.asInstanceOf[js.Any], md = md.asInstanceOf[js.Any], sm = sm.asInstanceOf[js.Any], xl = xl.asInstanceOf[js.Any], xs = xs.asInstanceOf[js.Any], xxl = xxl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lg]
  }
  
  @scala.inline
  implicit class LgOps[Self <: Lg] (val x: Self) extends AnyVal {
    
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
    def setLg(value: MaxWidth): Self = this.set("lg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMd(value: MaxWidth): Self = this.set("md", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSm(value: MaxWidth): Self = this.set("sm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXl(value: MaxWidth): Self = this.set("xl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXs(value: MatchMedia): Self = this.set("xs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXxl(value: MinWidth): Self = this.set("xxl", value.asInstanceOf[js.Any])
  }
}
