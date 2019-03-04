package typings
package vegaDashTypingsLib.typesSpecMarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextMark
  extends BaseMark
     with vegaDashTypingsLib.typesSpecEncodeMod.Encodable[vegaDashTypingsLib.typesSpecEncodeMod.TextEncodeEntry]
     with Mark {
  var `type`: vegaDashTypingsLib.vegaDashTypingsLibStrings.text
}

object TextMark {
  @scala.inline
  def apply(
    `type`: vegaDashTypingsLib.vegaDashTypingsLibStrings.text,
    clip: Clip = null,
    description: java.lang.String = null,
    encode: vegaDashTypingsLib.typesSpecEncodeMod.Encode[vegaDashTypingsLib.typesSpecEncodeMod.TextEncodeEntry] = null,
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
  ): TextMark = {
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
    __obj.asInstanceOf[TextMark]
  }
}

