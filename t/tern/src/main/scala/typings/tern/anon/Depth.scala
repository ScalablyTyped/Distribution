package typings.tern.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Depth extends js.Object {
  var depth: js.UndefOr[Double] = js.undefined
  var doc: js.UndefOr[String] = js.undefined
  var name: String
  var origin: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object Depth {
  @scala.inline
  def apply(
    name: String,
    depth: js.UndefOr[Double] = js.undefined,
    doc: String = null,
    origin: String = null,
    `type`: String = null,
    url: String = null
  ): Depth = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (!js.isUndefined(depth)) __obj.updateDynamic("depth")(depth.get.asInstanceOf[js.Any])
    if (doc != null) __obj.updateDynamic("doc")(doc.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Depth]
  }
}

