package typings
package webcolaLib.distSrcLayoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Group extends js.Object {
  var bounds: js.UndefOr[webcolaLib.distSrcRectangleMod.Rectangle] = js.undefined
  var groups: js.UndefOr[js.Array[Group]] = js.undefined
  var leaves: js.UndefOr[js.Array[Node]] = js.undefined
  var padding: scala.Double
}

