package typings.uws.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("uws", JSImport.Namespace)
@js.native
class ^ protected () extends WebSocket {
  def this(address: String) = this()
  def this(address: String, options: IClientOptions) = this()
  def this(address: String, protocols: String) = this()
  def this(address: String, protocols: js.Array[String]) = this()
  def this(address: String, protocols: js.UndefOr[scala.Nothing], options: IClientOptions) = this()
  def this(address: String, protocols: String, options: IClientOptions) = this()
  def this(address: String, protocols: js.Array[String], options: IClientOptions) = this()
}
@JSImport("uws", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  var CLOSED: Double = js.native
  
  var CLOSING: Double = js.native
  
  var CONNECTING: Double = js.native
  
  var OPEN: Double = js.native
}
