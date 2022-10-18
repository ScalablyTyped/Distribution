package typings.testingLibraryUserEvent

import typings.testingLibraryUserEvent.distTypesUtilsPointerCssPointerEventsMod.global.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesEventSelectionSelectAllMod {
  
  @JSImport("@testing-library/user-event/dist/types/event/selection/selectAll", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isAllSelected(target: Element): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAllSelected")(target.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def selectAll(target: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("selectAll")(target.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
