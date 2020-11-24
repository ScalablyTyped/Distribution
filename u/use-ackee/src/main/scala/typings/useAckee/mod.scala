package typings.useAckee

import typings.ackeeTracker.mod.ServerDetails
import typings.ackeeTracker.mod.TrackingOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("use-ackee", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(pathname: String, server: ServerDetails): Unit = js.native
  def apply(pathname: String, server: ServerDetails, opts: TrackingOptions): Unit = js.native
  def apply(pathname: Null, server: ServerDetails): Unit = js.native
  def apply(pathname: Null, server: ServerDetails, opts: TrackingOptions): Unit = js.native
  
  def useAckee(pathname: String, server: ServerDetails): Unit = js.native
  def useAckee(pathname: String, server: ServerDetails, opts: TrackingOptions): Unit = js.native
  def useAckee(pathname: Null, server: ServerDetails): Unit = js.native
  def useAckee(pathname: Null, server: ServerDetails, opts: TrackingOptions): Unit = js.native
}
