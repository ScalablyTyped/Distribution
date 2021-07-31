package typings.wixUiCore

import typings.protractor.mod.ElementFinder
import typings.wixUiCore.commonBaseDriverProtractorMod.BaseDriver
import typings.wixUiCore.commonBaseDriverProtractorMod.DriverFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object badgeProtractorDotDriverMod {
  
  @JSImport("wix-ui-core/src/components/deprecated/stylable-badge/Badge.protractor.driver", "badgeDriverFactory")
  @js.native
  val badgeDriverFactory: DriverFactory[BadgeDriver] = js.native
  
  trait BadgeDriver
    extends StObject
       with BaseDriver {
    
    def text(): js.Promise[String]
  }
  object BadgeDriver {
    
    @scala.inline
    def apply(element: () => ElementFinder, text: () => js.Promise[String]): BadgeDriver = {
      val __obj = js.Dynamic.literal(element = js.Any.fromFunction0(element), text = js.Any.fromFunction0(text))
      __obj.asInstanceOf[BadgeDriver]
    }
    
    @scala.inline
    implicit class BadgeDriverMutableBuilder[Self <: BadgeDriver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setText(value: () => js.Promise[String]): Self = StObject.set(x, "text", js.Any.fromFunction0(value))
    }
  }
}
