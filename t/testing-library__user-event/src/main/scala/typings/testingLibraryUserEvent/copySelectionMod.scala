package typings.testingLibraryUserEvent

import typings.std.DataTransfer
import typings.testingLibraryUserEvent.cssPointerEventsMod.global.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object copySelectionMod {
  
  @JSImport("@testing-library/user-event/dist/types/document/copySelection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def copySelection(target: Element): DataTransfer = ^.asInstanceOf[js.Dynamic].applyDynamic("copySelection")(target.asInstanceOf[js.Any]).asInstanceOf[DataTransfer]
}
