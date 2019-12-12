package typings.winrtDashUwp.Windows.Storage.Provider

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Storage.Provider.CachedFileTarget.local
import typings.winrtDashUwp.Windows.Storage.Provider.CachedFileTarget.remote
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CachedFileTarget extends js.Object

/** Indicates whether updates should be applied to the locally cached copy or the remote version of the file. */
@JSGlobal("Windows.Storage.Provider.CachedFileTarget")
@js.native
object CachedFileTarget extends js.Object {
  /** Update the locally cached copy of the file. */
  @js.native
  sealed trait local extends CachedFileTarget
  
  /** Update the remote version of the file. */
  @js.native
  sealed trait remote extends CachedFileTarget
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CachedFileTarget with Double] = js.native
  /* 0 */ @js.native
  object local extends TopLevel[local with Double]
  
  /* 1 */ @js.native
  object remote extends TopLevel[remote with Double]
  
}

