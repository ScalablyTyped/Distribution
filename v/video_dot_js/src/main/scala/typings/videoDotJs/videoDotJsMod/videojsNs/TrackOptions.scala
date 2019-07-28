package typings.videoDotJs.videoDotJsMod.videojsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrackOptions extends js.Object {
  var id: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var language: js.UndefOr[String] = js.undefined
}

object TrackOptions {
  @scala.inline
  def apply(id: String = null, kind: String = null, label: String = null, language: String = null): TrackOptions = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (label != null) __obj.updateDynamic("label")(label)
    if (language != null) __obj.updateDynamic("language")(language)
    __obj.asInstanceOf[TrackOptions]
  }
}

