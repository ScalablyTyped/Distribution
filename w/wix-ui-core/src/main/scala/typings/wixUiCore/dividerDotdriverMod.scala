package typings.wixUiCore

import typings.wixUiCore.anon.ElementAny
import typings.wixUiCore.anon.IsVertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dividerDotdriverMod {
  
  @JSImport("wix-ui-core/dist/standalone/src/components/deprecated/divider/Divider.driver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def dividerDriverFactory(hasElement: ElementAny): IsVertical = ^.asInstanceOf[js.Dynamic].applyDynamic("dividerDriverFactory")(hasElement.asInstanceOf[js.Any]).asInstanceOf[IsVertical]
}
