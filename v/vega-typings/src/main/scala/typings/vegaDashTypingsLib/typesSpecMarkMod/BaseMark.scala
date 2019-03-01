package typings
package vegaDashTypingsLib.typesSpecMarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseMark extends js.Object {
  var clip: js.UndefOr[Clip] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var from: js.UndefOr[From] = js.undefined
  var interactive: js.UndefOr[scala.Boolean | vegaDashTypingsLib.typesSpecSignalMod.SignalRef] = js.undefined
  var key: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var on: js.UndefOr[js.Array[vegaDashTypingsLib.typesSpecOnDashTriggerMod.OnMarkTrigger]] = js.undefined
  var role: js.UndefOr[java.lang.String] = js.undefined
  var sort: js.UndefOr[Compare] = js.undefined
  var style: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var transform: js.UndefOr[js.Array[vegaDashTypingsLib.typesSpecTransformMod.Transforms]] = js.undefined
  var zindex: js.UndefOr[scala.Double] = js.undefined
}

object BaseMark {
  @scala.inline
  def apply(
    clip: Clip = null,
    description: java.lang.String = null,
    from: From = null,
    interactive: scala.Boolean | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    key: java.lang.String = null,
    name: java.lang.String = null,
    on: js.Array[vegaDashTypingsLib.typesSpecOnDashTriggerMod.OnMarkTrigger] = null,
    role: java.lang.String = null,
    sort: Compare = null,
    style: java.lang.String | js.Array[java.lang.String] = null,
    transform: js.Array[vegaDashTypingsLib.typesSpecTransformMod.Transforms] = null,
    zindex: scala.Int | scala.Double = null
  ): BaseMark = {
    val __obj = js.Dynamic.literal()
    if (clip != null) __obj.updateDynamic("clip")(clip.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description)
    if (from != null) __obj.updateDynamic("from")(from)
    if (interactive != null) __obj.updateDynamic("interactive")(interactive.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key)
    if (name != null) __obj.updateDynamic("name")(name)
    if (on != null) __obj.updateDynamic("on")(on)
    if (role != null) __obj.updateDynamic("role")(role)
    if (sort != null) __obj.updateDynamic("sort")(sort)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform)
    if (zindex != null) __obj.updateDynamic("zindex")(zindex.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseMark]
  }
}

