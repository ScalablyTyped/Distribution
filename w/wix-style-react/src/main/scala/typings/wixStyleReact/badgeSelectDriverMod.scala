package typings.wixStyleReact

import typings.wixUiTestUtils.createDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object badgeSelectDriverMod {
  
  trait BadgeSelectDriver
    extends StObject
       with BaseDriver {
    
    def clickAtOption(index: Double): Unit
  }
  object BadgeSelectDriver {
    
    inline def apply(clickAtOption: Double => Unit, exists: () => Boolean): BadgeSelectDriver = {
      val __obj = js.Dynamic.literal(clickAtOption = js.Any.fromFunction1(clickAtOption), exists = js.Any.fromFunction0(exists))
      __obj.asInstanceOf[BadgeSelectDriver]
    }
    
    extension [Self <: BadgeSelectDriver](x: Self) {
      
      inline def setClickAtOption(value: Double => Unit): Self = StObject.set(x, "clickAtOption", js.Any.fromFunction1(value))
    }
  }
}
