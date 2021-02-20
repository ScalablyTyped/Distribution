package typings.winrtUwp.Windows.Storage.Provider

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait UIStatus extends StObject
/** Indicates the status of the file picker UI. */
@JSGlobal("Windows.Storage.Provider.UIStatus")
@js.native
object UIStatus extends StObject {
  
  /** The file picker is currently showing UI and all */
  @js.native
  sealed trait complete extends UIStatus
  
  /** The file picker is not showing UI, but UI can be requested. */
  @js.native
  sealed trait hidden extends UIStatus
  
  /** The file picker is not showing UI and UI can't be requested. */
  @js.native
  sealed trait unavailable extends UIStatus
  
  /** The file picker is currently showing UI because UI was requested by the app. */
  @js.native
  sealed trait visible extends UIStatus
}
