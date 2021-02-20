package typings.winrtUwp.Windows.Storage.Pickers

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PickerViewMode extends StObject
/** Indicates the view mode that the file picker is using to present items. */
@JSGlobal("Windows.Storage.Pickers.PickerViewMode")
@js.native
object PickerViewMode extends StObject {
  
  /** A list of items. */
  @js.native
  sealed trait list extends PickerViewMode
  
  /** A set of thumbnail images. */
  @js.native
  sealed trait thumbnail extends PickerViewMode
}
