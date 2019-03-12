package typings
package tarDashFsLib.tarDashFsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PackOptions extends Options {
  var dereference: js.UndefOr[scala.Boolean] = js.undefined
  var entries: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  @JSName("finalize")
  var finalize_FPackOptions: js.UndefOr[scala.Boolean] = js.undefined
  var finish: js.UndefOr[js.Function1[/* pack */ js.Any, scala.Unit]] = js.undefined
}

object PackOptions {
  @scala.inline
  def apply(
    dereference: js.UndefOr[scala.Boolean] = js.undefined,
    dmode: scala.Int | scala.Double = null,
    entries: js.Array[java.lang.String] = null,
    filter: /* name */ java.lang.String => scala.Boolean = null,
    finalize: js.UndefOr[scala.Boolean] = js.undefined,
    finish: /* pack */ js.Any => scala.Unit = null,
    fmode: scala.Int | scala.Double = null,
    ignore: /* name */ java.lang.String => scala.Boolean = null,
    map: /* header */ Headers => Headers = null,
    mapStream: (/* fileStream */ nodeLib.fsMod.ReadStream, /* header */ Headers) => nodeLib.fsMod.ReadStream = null,
    readable: js.UndefOr[scala.Boolean] = js.undefined,
    strict: js.UndefOr[scala.Boolean] = js.undefined,
    writable: js.UndefOr[scala.Boolean] = js.undefined
  ): PackOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dereference)) __obj.updateDynamic("dereference")(dereference)
    if (dmode != null) __obj.updateDynamic("dmode")(dmode.asInstanceOf[js.Any])
    if (entries != null) __obj.updateDynamic("entries")(entries)
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1(filter))
    if (!js.isUndefined(finalize)) __obj.updateDynamic("finalize")(finalize)
    if (finish != null) __obj.updateDynamic("finish")(js.Any.fromFunction1(finish))
    if (fmode != null) __obj.updateDynamic("fmode")(fmode.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(js.Any.fromFunction1(ignore))
    if (map != null) __obj.updateDynamic("map")(js.Any.fromFunction1(map))
    if (mapStream != null) __obj.updateDynamic("mapStream")(js.Any.fromFunction2(mapStream))
    if (!js.isUndefined(readable)) __obj.updateDynamic("readable")(readable)
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    if (!js.isUndefined(writable)) __obj.updateDynamic("writable")(writable)
    __obj.asInstanceOf[PackOptions]
  }
}

