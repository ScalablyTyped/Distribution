package typings.testingLibraryUserEvent

import typings.testingLibraryUserEvent.distTypesSetupSetupMod.Instance
import typings.testingLibraryUserEvent.distTypesUtilsPointerCssPointerEventsMod.global.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilsPointerCssPointerEventsMod {
  
  @JSImport("@testing-library/user-event/dist/types/utils/pointer/cssPointerEvents", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assertPointerEvents(instance: Instance, element: Element): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertPointerEvents")(instance.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def hasPointerEvents(instance: Instance, element: Element): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasPointerEvents")(instance.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  object global {
    
    @js.native
    trait Element extends StObject
  }
}
