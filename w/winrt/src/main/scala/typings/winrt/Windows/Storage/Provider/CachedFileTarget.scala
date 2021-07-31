package typings.winrt.Windows.Storage.Provider

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CachedFileTarget extends StObject
@JSGlobal("Windows.Storage.Provider.CachedFileTarget")
@js.native
object CachedFileTarget extends StObject {
  
  @js.native
  sealed trait local
    extends StObject
       with CachedFileTarget
  
  @js.native
  sealed trait remote
    extends StObject
       with CachedFileTarget
}
