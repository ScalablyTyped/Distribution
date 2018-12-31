package typings
package vscodeDashLanguageserverLib.libMainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BulkUnregistration
  extends vscodeDashJsonrpcLib.libEventsMod.Disposable {
  /**
    * Disposes a single registration. It will be removed from the
    * `BulkUnregistration`.
    */
  def disposeSingle(arg: java.lang.String): scala.Boolean = js.native
  def disposeSingle(arg: vscodeDashJsonrpcLib.libMessagesMod.MessageType): scala.Boolean = js.native
}

