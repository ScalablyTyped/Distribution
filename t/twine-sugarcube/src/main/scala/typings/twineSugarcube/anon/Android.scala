package typings.twineSugarcube.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Android extends js.Object {
  
  val Android: Boolean = js.native
  
  val BlackBerry: Boolean = js.native
  
  val Opera: Boolean = js.native
  
  val Windows: Boolean = js.native
  
  def any(): Boolean = js.native
  
  val iOS: Boolean = js.native
}
object Android {
  
  @scala.inline
  def apply(
    Android: Boolean,
    BlackBerry: Boolean,
    Opera: Boolean,
    Windows: Boolean,
    any: () => Boolean,
    iOS: Boolean
  ): Android = {
    val __obj = js.Dynamic.literal(Android = Android.asInstanceOf[js.Any], BlackBerry = BlackBerry.asInstanceOf[js.Any], Opera = Opera.asInstanceOf[js.Any], Windows = Windows.asInstanceOf[js.Any], any = js.Any.fromFunction0(any), iOS = iOS.asInstanceOf[js.Any])
    __obj.asInstanceOf[Android]
  }
  
  @scala.inline
  implicit class AndroidOps[Self <: Android] (val x: Self) extends AnyVal {
    
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
    def setAndroid(value: Boolean): Self = this.set("Android", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlackBerry(value: Boolean): Self = this.set("BlackBerry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpera(value: Boolean): Self = this.set("Opera", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindows(value: Boolean): Self = this.set("Windows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAny(value: () => Boolean): Self = this.set("any", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIOS(value: Boolean): Self = this.set("iOS", value.asInstanceOf[js.Any])
  }
}
