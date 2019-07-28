package typings.vscodeDashLanguageserver.vscodeDashLanguageserverMod

import typings.vscodeDashJsonrpc.libEventsMod.Disposable
import typings.vscodeDashJsonrpc.libMessagesMod.MessageType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BulkUnregistration extends Disposable {
  /**
    * Disposes a single registration. It will be removed from the
    * `BulkUnregistration`.
    */
  def disposeSingle(arg: String): Boolean = js.native
  def disposeSingle(arg: MessageType): Boolean = js.native
}

