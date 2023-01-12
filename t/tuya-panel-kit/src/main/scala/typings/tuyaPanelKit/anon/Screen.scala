package typings.tuyaPanelKit.anon

import typings.tuyaPanelKit.`@reactNavigationStackTypesMod`.Layout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Screen extends StObject {
  
  /**
    * Layout of the whole screen.
    */
  var screen: Layout
}
object Screen {
  
  inline def apply(screen: Layout): Screen = {
    val __obj = js.Dynamic.literal(screen = screen.asInstanceOf[js.Any])
    __obj.asInstanceOf[Screen]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Screen] (val x: Self) extends AnyVal {
    
    inline def setScreen(value: Layout): Self = StObject.set(x, "screen", value.asInstanceOf[js.Any])
  }
}
