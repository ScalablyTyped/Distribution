package typings.winrt.Windows.Storage.Pickers.Provider

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SetFileNameResult extends StObject
@JSGlobal("Windows.Storage.Pickers.Provider.SetFileNameResult")
@js.native
object SetFileNameResult extends StObject {
  
  @js.native
  sealed trait notAllowed
    extends StObject
       with SetFileNameResult
  
  @js.native
  sealed trait succeeded
    extends StObject
       with SetFileNameResult
  
  @js.native
  sealed trait unavailable
    extends StObject
       with SetFileNameResult
}
