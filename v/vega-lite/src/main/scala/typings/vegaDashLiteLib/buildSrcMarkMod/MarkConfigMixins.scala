package typings
package vegaDashLiteLib.buildSrcMarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkConfigMixins extends js.Object {
  /** Area-Specific Config */
  var area: js.UndefOr[AreaConfig] = js.undefined
  /** Bar-Specific Config */
  var bar: js.UndefOr[BarConfig] = js.undefined
  /** Circle-Specific Config */
  var circle: js.UndefOr[MarkConfig] = js.undefined
  /** Geoshape-Specific Config */
  var geoshape: js.UndefOr[MarkConfig] = js.undefined
  /** Line-Specific Config */
  var line: js.UndefOr[LineConfig] = js.undefined
  /** Mark Config */
  var mark: js.UndefOr[MarkConfig] = js.undefined
  /** Point-Specific Config */
  var point: js.UndefOr[MarkConfig] = js.undefined
  /** Rect-Specific Config */
  var rect: js.UndefOr[MarkConfig] = js.undefined
  /** Rule-Specific Config */
  var rule: js.UndefOr[MarkConfig] = js.undefined
  /** Square-Specific Config */
  var square: js.UndefOr[MarkConfig] = js.undefined
  /** Text-Specific Config */
  var text: js.UndefOr[TextConfig] = js.undefined
  /** Tick-Specific Config */
  var tick: js.UndefOr[TickConfig] = js.undefined
  /** Trail-Specific Config */
  var trail: js.UndefOr[LineConfig] = js.undefined
}

object MarkConfigMixins {
  @scala.inline
  def apply(
    area: AreaConfig = null,
    bar: BarConfig = null,
    circle: MarkConfig = null,
    geoshape: MarkConfig = null,
    line: LineConfig = null,
    mark: MarkConfig = null,
    point: MarkConfig = null,
    rect: MarkConfig = null,
    rule: MarkConfig = null,
    square: MarkConfig = null,
    text: TextConfig = null,
    tick: TickConfig = null,
    trail: LineConfig = null
  ): MarkConfigMixins = {
    val __obj = js.Dynamic.literal()
    if (area != null) __obj.updateDynamic("area")(area)
    if (bar != null) __obj.updateDynamic("bar")(bar)
    if (circle != null) __obj.updateDynamic("circle")(circle)
    if (geoshape != null) __obj.updateDynamic("geoshape")(geoshape)
    if (line != null) __obj.updateDynamic("line")(line)
    if (mark != null) __obj.updateDynamic("mark")(mark)
    if (point != null) __obj.updateDynamic("point")(point)
    if (rect != null) __obj.updateDynamic("rect")(rect)
    if (rule != null) __obj.updateDynamic("rule")(rule)
    if (square != null) __obj.updateDynamic("square")(square)
    if (text != null) __obj.updateDynamic("text")(text)
    if (tick != null) __obj.updateDynamic("tick")(tick)
    if (trail != null) __obj.updateDynamic("trail")(trail)
    __obj.asInstanceOf[MarkConfigMixins]
  }
}

