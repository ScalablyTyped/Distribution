package typings.tern

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDepth extends js.Object {
  var depth: js.UndefOr[Double] = js.undefined
  var doc: js.UndefOr[String] = js.undefined
  var name: String
  var origin: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object AnonDepth {
  @scala.inline
  def apply(
    name: String,
    depth: Int | Double = null,
    doc: String = null,
    origin: String = null,
    `type`: String = null,
    url: String = null
  ): AnonDepth = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (depth != null) __obj.updateDynamic("depth")(depth.asInstanceOf[js.Any])
    if (doc != null) __obj.updateDynamic("doc")(doc.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDepth]
  }
}

