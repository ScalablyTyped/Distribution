package typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnapshotCreate extends js.Object {
  /** only exists when a password has been set otherwise it will be undefined */
  var salt: js.UndefOr[String] = js.undefined
  var snapshot: String
  var version: Double
}

object SnapshotCreate {
  @scala.inline
  def apply(snapshot: String, version: Double, salt: String = null): SnapshotCreate = {
    val __obj = js.Dynamic.literal(snapshot = snapshot, version = version)
    if (salt != null) __obj.updateDynamic("salt")(salt)
    __obj.asInstanceOf[SnapshotCreate]
  }
}

