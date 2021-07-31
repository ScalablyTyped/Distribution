package typings.winrt.Windows.Storage.Pickers.Provider

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AddFileResult extends StObject
@JSGlobal("Windows.Storage.Pickers.Provider.AddFileResult")
@js.native
object AddFileResult extends StObject {
  
  @js.native
  sealed trait added
    extends StObject
       with AddFileResult
  
  @js.native
  sealed trait alreadyAdded
    extends StObject
       with AddFileResult
  
  @js.native
  sealed trait notAllowed
    extends StObject
       with AddFileResult
  
  @js.native
  sealed trait unavailable
    extends StObject
       with AddFileResult
}
