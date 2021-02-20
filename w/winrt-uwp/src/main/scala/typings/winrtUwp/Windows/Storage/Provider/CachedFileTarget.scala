package typings.winrtUwp.Windows.Storage.Provider

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CachedFileTarget extends StObject
/** Indicates whether updates should be applied to the locally cached copy or the remote version of the file. */
@JSGlobal("Windows.Storage.Provider.CachedFileTarget")
@js.native
object CachedFileTarget extends StObject {
  
  /** Update the locally cached copy of the file. */
  @js.native
  sealed trait local extends CachedFileTarget
  
  /** Update the remote version of the file. */
  @js.native
  sealed trait remote extends CachedFileTarget
}
