package typings.tuyaPanelKit.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TintColor extends StObject {
  
  var tintColor: js.UndefOr[String] = js.native
}
object TintColor {
  
  @scala.inline
  def apply(): TintColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TintColor]
  }
  
  @scala.inline
  implicit class TintColorMutableBuilder[Self <: TintColor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTintColor(value: String): Self = StObject.set(x, "tintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTintColorUndefined: Self = StObject.set(x, "tintColor", js.undefined)
  }
}
