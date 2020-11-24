package typings.swiper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FadeEffectOptions extends js.Object {
  
  var crossFade: js.UndefOr[Boolean] = js.native
}
object FadeEffectOptions {
  
  @scala.inline
  def apply(): FadeEffectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FadeEffectOptions]
  }
  
  @scala.inline
  implicit class FadeEffectOptionsOps[Self <: FadeEffectOptions] (val x: Self) extends AnyVal {
    
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
    def setCrossFade(value: Boolean): Self = this.set("crossFade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrossFade: Self = this.set("crossFade", js.undefined)
  }
}
