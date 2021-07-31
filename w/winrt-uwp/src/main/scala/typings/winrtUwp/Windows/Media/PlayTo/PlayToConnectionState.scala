package typings.winrtUwp.Windows.Media.PlayTo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PlayToConnectionState extends StObject
/** Describes the status of a Play To connection. */
@JSGlobal("Windows.Media.PlayTo.PlayToConnectionState")
@js.native
object PlayToConnectionState extends StObject {
  
  /** The connection is connected. */
  @js.native
  sealed trait connected
    extends StObject
       with PlayToConnectionState
  
  /** The connection is disconnected. */
  @js.native
  sealed trait disconnected
    extends StObject
       with PlayToConnectionState
  
  /** The connection is rendering media on the Play To target device. */
  @js.native
  sealed trait rendering
    extends StObject
       with PlayToConnectionState
}
