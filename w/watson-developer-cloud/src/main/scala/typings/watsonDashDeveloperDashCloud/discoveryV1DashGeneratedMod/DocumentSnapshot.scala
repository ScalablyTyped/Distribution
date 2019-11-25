package typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** DocumentSnapshot. */
trait DocumentSnapshot extends js.Object {
  /** Snapshot of the conversion. */
  var snapshot: js.UndefOr[js.Object] = js.undefined
  /** The step in the document conversion process that the snapshot object represents. */
  var step: js.UndefOr[String] = js.undefined
}

object DocumentSnapshot {
  @scala.inline
  def apply(snapshot: js.Object = null, step: String = null): DocumentSnapshot = {
    val __obj = js.Dynamic.literal()
    if (snapshot != null) __obj.updateDynamic("snapshot")(snapshot.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentSnapshot]
  }
}

