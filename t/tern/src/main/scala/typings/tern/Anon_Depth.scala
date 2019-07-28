package typings.tern

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Depth extends js.Object {
  var depth: js.UndefOr[Double] = js.undefined
  var doc: js.UndefOr[String] = js.undefined
  var name: String
  var origin: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object Anon_Depth {
  @scala.inline
  def apply(
    name: String,
    depth: Int | Double = null,
    doc: String = null,
    origin: String = null,
    `type`: String = null,
    url: String = null
  ): Anon_Depth = {
    val __obj = js.Dynamic.literal(name = name)
    if (depth != null) __obj.updateDynamic("depth")(depth.asInstanceOf[js.Any])
    if (doc != null) __obj.updateDynamic("doc")(doc)
    if (origin != null) __obj.updateDynamic("origin")(origin)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Anon_Depth]
  }
}

