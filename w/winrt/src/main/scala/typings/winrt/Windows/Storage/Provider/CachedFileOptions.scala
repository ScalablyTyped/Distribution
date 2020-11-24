package typings.winrt.Windows.Storage.Provider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
