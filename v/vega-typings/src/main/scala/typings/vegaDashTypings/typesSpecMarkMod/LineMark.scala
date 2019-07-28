package typings.vegaDashTypings.typesSpecMarkMod

import typings.vegaDashTypings.typesSpecEncodeMod.Encodable
import typings.vegaDashTypings.typesSpecEncodeMod.Encode
import typings.vegaDashTypings.typesSpecEncodeMod.LineEncodeEntry
import typings.vegaDashTypings.typesSpecOnDashTriggerMod.OnMarkTrigger
import typings.vegaDashTypings.typesSpecSignalMod.SignalRef
import typings.vegaDashTypings.typesSpecTransformMod.Transforms
import typings.vegaDashTypings.vegaDashTypingsStrings.line
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineMark
  extends BaseMark
     with Encodable[LineEncodeEntry]
     with Mark {
  var `type`: line
}

object LineMark {
  @scala.inline
  def apply(
    `type`: line,
    clip: Clip = null,
    description: String = null,
    encode: Encode[LineEncodeEntry] = null,
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
  ): LineMark = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (clip != null) __obj.updateDynamic("clip")(clip.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description)
    if (encode != null) __obj.updateDynamic("encode")(encode)
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
    __obj.asInstanceOf[LineMark]
  }
}

