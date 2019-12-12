package typings.winrt.Windows.Storage.Provider

import org.scalablytyped.runtime.TopLevel
import typings.winrt.Windows.Storage.Provider.CachedFileOptions.denyAccessWhenOffline
import typings.winrt.Windows.Storage.Provider.CachedFileOptions.none
import typings.winrt.Windows.Storage.Provider.CachedFileOptions.requireUpdateOnAccess
import typings.winrt.Windows.Storage.Provider.CachedFileOptions.useCachedFileWhenOffline
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CachedFileOptions extends js.Object

@JSGlobal("Windows.Storage.Provider.CachedFileOptions")
@js.native
object CachedFileOptions extends js.Object {
  @js.native
  sealed trait denyAccessWhenOffline extends CachedFileOptions
  
  @js.native
  sealed trait none extends CachedFileOptions
  
  @js.native
  sealed trait requireUpdateOnAccess extends CachedFileOptions
  
  @js.native
  sealed trait useCachedFileWhenOffline extends CachedFileOptions
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CachedFileOptions with Double] = js.native
  /* 3 */ @js.native
  object denyAccessWhenOffline extends TopLevel[denyAccessWhenOffline with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 1 */ @js.native
  object requireUpdateOnAccess extends TopLevel[requireUpdateOnAccess with Double]
  
  /* 2 */ @js.native
  object useCachedFileWhenOffline extends TopLevel[useCachedFileWhenOffline with Double]
  
}

