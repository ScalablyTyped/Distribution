package typings.typescript.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Metadata extends js.Object {
  var metadata: js.UndefOr[js.Any] = js.undefined
}

object Metadata {
  @scala.inline
  def apply(metadata: js.Any = null): Metadata = {
    val __obj = js.Dynamic.literal()
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metadata]
  }
}

