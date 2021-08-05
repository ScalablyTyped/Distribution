package typings.wixUiCore

import typings.wixUiCore.anon.Element
import typings.wixUiCore.anon.GetForAttribute
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object labelDotdriverMod {
  
  @JSImport("wix-ui-core/dist/standalone/src/components/deprecated/label/Label.driver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def labelDriverFactory(hasElementEventTrigger: Element): GetForAttribute = ^.asInstanceOf[js.Dynamic].applyDynamic("labelDriverFactory")(hasElementEventTrigger.asInstanceOf[js.Any]).asInstanceOf[GetForAttribute]
}
