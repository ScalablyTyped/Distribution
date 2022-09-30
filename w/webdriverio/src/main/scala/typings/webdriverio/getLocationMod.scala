package typings.webdriverio

import typings.webdriverio.webdriverioStrings.x
import typings.webdriverio.webdriverioStrings.y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getLocationMod {
  
  @JSImport("webdriverio/build/commands/element/getLocation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.Promise[Location] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Promise[Location]]
  inline def default(prop: x | y): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(prop.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Double]]
  
  /* Inlined std.Pick<@wdio/protocols.@wdio/protocols.RectReturn, 'x' | 'y'> */
  trait Location extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object Location {
    
    inline def apply(x: Double, y: Double): Location = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Location]
    }
    
    extension [Self <: Location](x: Self) {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
