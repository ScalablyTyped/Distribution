package typings.winrt.Windows.Storage.Pickers.Provider

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AddFileResult extends StObject
@JSGlobal("Windows.Storage.Pickers.Provider.AddFileResult")
@js.native
object AddFileResult extends StObject {
  
  @js.native
  sealed trait added extends AddFileResult
  
  @js.native
  sealed trait alreadyAdded extends AddFileResult
  
  @js.native
  sealed trait notAllowed extends AddFileResult
  
  @js.native
  sealed trait unavailable extends AddFileResult
}
