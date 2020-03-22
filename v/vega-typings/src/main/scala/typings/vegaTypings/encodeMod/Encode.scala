package typings.vegaTypings.encodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Record<vega-typings.vega-typings/types/spec/encode.EncodeEntryName, T>> */
trait Encode[T] extends js.Object {
  var enter: js.UndefOr[T] = js.undefined
  var exit: js.UndefOr[T] = js.undefined
  var hover: js.UndefOr[T] = js.undefined
  var leave: js.UndefOr[T] = js.undefined
  var release: js.UndefOr[T] = js.undefined
  var select: js.UndefOr[T] = js.undefined
  var update: js.UndefOr[T] = js.undefined
}

object Encode {
  @scala.inline
  def apply[T](
    enter: T = null,
    exit: T = null,
    hover: T = null,
    leave: T = null,
    release: T = null,
    select: T = null,
    update: T = null
  ): Encode[T] = {
    val __obj = js.Dynamic.literal()
    if (enter != null) __obj.updateDynamic("enter")(enter.asInstanceOf[js.Any])
    if (exit != null) __obj.updateDynamic("exit")(exit.asInstanceOf[js.Any])
    if (hover != null) __obj.updateDynamic("hover")(hover.asInstanceOf[js.Any])
    if (leave != null) __obj.updateDynamic("leave")(leave.asInstanceOf[js.Any])
    if (release != null) __obj.updateDynamic("release")(release.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(select.asInstanceOf[js.Any])
    if (update != null) __obj.updateDynamic("update")(update.asInstanceOf[js.Any])
    __obj.asInstanceOf[Encode[T]]
  }
}

