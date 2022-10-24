package typings.testingLibraryUserEvent

import typings.std.Range
import typings.testingLibraryUserEvent.anon.ClickCount
import typings.testingLibraryUserEvent.distTypesEventSelectionMod.SelectionRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesEventSelectionSetSelectionPerMouseMod {
  
  @JSImport("@testing-library/user-event/dist/types/event/selection/setSelectionPerMouse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def setSelectionPerMouseDown(param0: ClickCount): js.UndefOr[Range | SelectionRange] = ^.asInstanceOf[js.Dynamic].applyDynamic("setSelectionPerMouseDown")(param0.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Range | SelectionRange]]
}
