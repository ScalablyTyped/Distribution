package typings.testingLibraryUserEvent

import typings.testingLibraryUserEvent.distTypesSetupSetupMod.Instance
import typings.testingLibraryUserEvent.distTypesUtilsPointerCssPointerEventsMod.global.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesEventInputMod {
  
  @JSImport("@testing-library/user-event/dist/types/event/input", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def input(instance: Instance, element: Element, data: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("input")(instance.asInstanceOf[js.Any], element.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def input(instance: Instance, element: Element, data: String, inputType: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("input")(instance.asInstanceOf[js.Any], element.asInstanceOf[js.Any], data.asInstanceOf[js.Any], inputType.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
