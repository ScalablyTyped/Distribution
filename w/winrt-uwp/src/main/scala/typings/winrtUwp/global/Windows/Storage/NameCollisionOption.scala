package typings.winrtUwp.global.Windows.Storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies what to do if a file or folder with the specified name already exists in the current folder when you copy, move, or rename a file or folder. */
@JSGlobal("Windows.Storage.NameCollisionOption")
@js.native
object NameCollisionOption extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Storage.NameCollisionOption with Double] = js.native
  
  /* 2 */ val failIfExists: typings.winrtUwp.Windows.Storage.NameCollisionOption.failIfExists with Double = js.native
  
  /* 0 */ val generateUniqueName: typings.winrtUwp.Windows.Storage.NameCollisionOption.generateUniqueName with Double = js.native
  
  /* 1 */ val replaceExisting: typings.winrtUwp.Windows.Storage.NameCollisionOption.replaceExisting with Double = js.native
}
