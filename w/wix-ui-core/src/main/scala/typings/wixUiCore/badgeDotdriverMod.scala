package typings.wixUiCore

import typings.wixUiTestUtils.createDriverFactoryMod.BaseDriver
import typings.wixUiTestUtils.createDriverFactoryMod.ComponentFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object badgeDotdriverMod {
  
  @JSImport("wix-ui-core/dist/standalone/src/components/deprecated/stylable-badge/Badge.driver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def badgeDriverFactory(hasElement: ComponentFactory): BadgeDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("badgeDriverFactory")(hasElement.asInstanceOf[js.Any]).asInstanceOf[BadgeDriver]
  
  trait BadgeDriver
    extends StObject
       with BaseDriver {
    
    /** returns elements innerHtml */
    def getContent(): String
    
    /** returns elements innerText */
    def text(): String
  }
  object BadgeDriver {
    
    inline def apply(exists: () => Boolean, getContent: () => String, text: () => String): BadgeDriver = {
      val __obj = js.Dynamic.literal(exists = js.Any.fromFunction0(exists), getContent = js.Any.fromFunction0(getContent), text = js.Any.fromFunction0(text))
      __obj.asInstanceOf[BadgeDriver]
    }
    
    extension [Self <: BadgeDriver](x: Self) {
      
      inline def setGetContent(value: () => String): Self = StObject.set(x, "getContent", js.Any.fromFunction0(value))
      
      inline def setText(value: () => String): Self = StObject.set(x, "text", js.Any.fromFunction0(value))
    }
  }
}
