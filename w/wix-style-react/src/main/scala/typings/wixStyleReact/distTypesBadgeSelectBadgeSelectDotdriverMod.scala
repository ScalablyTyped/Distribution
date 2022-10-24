package typings.wixStyleReact

import typings.wixUiTestUtils.distSrcDriverFactoryCreateDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesBadgeSelectBadgeSelectDotdriverMod {
  
  trait BadgeSelectDriver
    extends StObject
       with BaseDriver {
    
    def clickAtOption(index: Double): Unit
    
    def text(): String
  }
  object BadgeSelectDriver {
    
    inline def apply(clickAtOption: Double => Unit, exists: () => Boolean, text: () => String): BadgeSelectDriver = {
      val __obj = js.Dynamic.literal(clickAtOption = js.Any.fromFunction1(clickAtOption), exists = js.Any.fromFunction0(exists), text = js.Any.fromFunction0(text))
      __obj.asInstanceOf[BadgeSelectDriver]
    }
    
    extension [Self <: BadgeSelectDriver](x: Self) {
      
      inline def setClickAtOption(value: Double => Unit): Self = StObject.set(x, "clickAtOption", js.Any.fromFunction1(value))
      
      inline def setText(value: () => String): Self = StObject.set(x, "text", js.Any.fromFunction0(value))
    }
  }
}
