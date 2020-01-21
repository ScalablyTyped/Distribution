package typings.vegaTypings.markMod

import typings.vegaTypings.onTriggerMod.OnMarkTrigger
import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.transformMod.Transforms
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseMark extends js.Object {
  var clip: js.UndefOr[Clip] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var from: js.UndefOr[From] = js.undefined
  var interactive: js.UndefOr[Boolean | SignalRef] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var on: js.UndefOr[js.Array[OnMarkTrigger]] = js.undefined
  var role: js.UndefOr[String] = js.undefined
  var sort: js.UndefOr[Compare] = js.undefined
  var style: js.UndefOr[String | js.Array[String]] = js.undefined
  var transform: js.UndefOr[js.Array[Transforms]] = js.undefined
  var zindex: js.UndefOr[Double] = js.undefined
}

object BaseMark {
  @scala.inline
  def apply(
    clip: Clip = null,
    description: String = null,
    from: From = null,
    interactive: Boolean | SignalRef = null,
    key: String = null,
    name: String = null,
    on: js.Array[OnMarkTrigger] = null,
    role: String = null,
    sort: Compare = null,
    style: String | js.Array[String] = null,
    transform: js.Array[Transforms] = null,
    zindex: Int | Double = null
  ): BaseMark = {
    val __obj = js.Dynamic.literal()
    if (clip != null) __obj.updateDynamic("clip")(clip.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (interactive != null) __obj.updateDynamic("interactive")(interactive.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (on != null) __obj.updateDynamic("on")(on.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    if (zindex != null) __obj.updateDynamic("zindex")(zindex.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseMark]
  }
}

