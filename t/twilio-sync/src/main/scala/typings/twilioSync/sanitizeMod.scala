package typings.twilioSync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio-sync/lib/utils/sanitize", JSImport.Namespace)
@js.native
object sanitizeMod extends js.Object {
  def deepClone[T](obj: T): T = js.native
  def validateId(id: js.Any): Unit = js.native
  def validateMandatoryTtl(ttl: Double): Unit = js.native
  def validateOptionalTtl(ttl: Double): Unit = js.native
  def validatePageSize(pageSize: Double): Unit = js.native
}

