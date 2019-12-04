package typings.twilioDashSync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio-sync/lib/utils/sanitize", JSImport.Namespace)
@js.native
object libUtilsSanitizeMod extends js.Object {
  def deepClone[T](obj: T): T = js.native
  def validateMandatoryTtl(ttl: Double): Unit = js.native
  def validateOptionalTtl(ttl: Double): Unit = js.native
  def validatePageSize(pageSize: Double): Unit = js.native
}

