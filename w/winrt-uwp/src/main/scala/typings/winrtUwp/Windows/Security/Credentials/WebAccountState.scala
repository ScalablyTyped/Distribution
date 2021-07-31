package typings.winrtUwp.Windows.Security.Credentials

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WebAccountState extends StObject
/** Describes the state of a WebAccount object. */
@JSGlobal("Windows.Security.Credentials.WebAccountState")
@js.native
object WebAccountState extends StObject {
  
  /** The account is connected. */
  @js.native
  sealed trait connected
    extends StObject
       with WebAccountState
  
  /** The account was unable to connect. */
  @js.native
  sealed trait error
    extends StObject
       with WebAccountState
  
  /** The account is currently not connected. */
  @js.native
  sealed trait none
    extends StObject
       with WebAccountState
}
