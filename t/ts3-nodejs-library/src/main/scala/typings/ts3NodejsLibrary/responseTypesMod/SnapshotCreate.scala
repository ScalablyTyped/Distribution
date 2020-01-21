package typings.ts3NodejsLibrary.responseTypesMod

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
    val __obj = js.Dynamic.literal(snapshot = snapshot.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (salt != null) __obj.updateDynamic("salt")(salt.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotCreate]
  }
}

