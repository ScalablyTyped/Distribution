package typings
package ternLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Depth extends js.Object {
  var depth: js.UndefOr[scala.Double] = js.undefined
  var doc: js.UndefOr[java.lang.String] = js.undefined
  var name: java.lang.String
  var origin: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Depth {
  @scala.inline
  def apply(
    name: java.lang.String,
    depth: scala.Int | scala.Double = null,
    doc: java.lang.String = null,
    origin: java.lang.String = null,
    `type`: java.lang.String = null,
    url: java.lang.String = null
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

