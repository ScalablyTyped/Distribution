package typings.winrtUwp.global.Windows.Storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies whether a deleted item is moved to the Recycle Bin or permanently deleted. */
@JSGlobal("Windows.Storage.StorageDeleteOption")
@js.native
object StorageDeleteOption extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Storage.StorageDeleteOption & Double] = js.native
  
  /* 0 */ val default: typings.winrtUwp.Windows.Storage.StorageDeleteOption.default & Double = js.native
  
  /* 1 */ val permanentDelete: typings.winrtUwp.Windows.Storage.StorageDeleteOption.permanentDelete & Double = js.native
}
