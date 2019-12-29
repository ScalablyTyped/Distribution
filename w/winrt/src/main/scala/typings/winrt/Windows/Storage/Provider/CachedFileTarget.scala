package typings.winrt.Windows.Storage.Provider

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CachedFileTarget extends js.Object

@JSGlobal("Windows.Storage.Provider.CachedFileTarget")
@js.native
object CachedFileTarget extends js.Object {
  @js.native
  sealed trait local extends CachedFileTarget
  
  @js.native
  sealed trait remote extends CachedFileTarget
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CachedFileTarget with Double] = js.native
  /* 0 */ @js.native
  object local extends TopLevel[local with Double]
  
  /* 1 */ @js.native
  object remote extends TopLevel[remote with Double]
  
}

