package typings.twineSugarcube.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Android extends StObject {
  
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
  implicit class AndroidMutableBuilder[Self <: Android] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAndroid(value: Boolean): Self = StObject.set(x, "Android", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAny(value: () => Boolean): Self = StObject.set(x, "any", js.Any.fromFunction0(value))
    
    @scala.inline
    def setBlackBerry(value: Boolean): Self = StObject.set(x, "BlackBerry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIOS(value: Boolean): Self = StObject.set(x, "iOS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpera(value: Boolean): Self = StObject.set(x, "Opera", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindows(value: Boolean): Self = StObject.set(x, "Windows", value.asInstanceOf[js.Any])
  }
}
