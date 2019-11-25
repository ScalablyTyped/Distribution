package typings.tarDashFs.tarDashFsMod

import typings.node.fsMod.ReadStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PackOptions extends Options {
  var dereference: js.UndefOr[Boolean] = js.undefined
  var entries: js.UndefOr[js.Array[String]] = js.undefined
  @JSName("finalize")
  var finalize_FPackOptions: js.UndefOr[Boolean] = js.undefined
  var finish: js.UndefOr[js.Function1[/* pack */ js.Any, Unit]] = js.undefined
}

object PackOptions {
  @scala.inline
  def apply(
    dereference: js.UndefOr[Boolean] = js.undefined,
    dmode: Int | Double = null,
    entries: js.Array[String] = null,
    filter: /* name */ String => Boolean = null,
    finalize: js.UndefOr[Boolean] = js.undefined,
    finish: /* pack */ js.Any => Unit = null,
    fmode: Int | Double = null,
    ignore: /* name */ String => Boolean = null,
    map: /* header */ Headers => Headers = null,
    mapStream: (/* fileStream */ ReadStream, /* header */ Headers) => ReadStream = null,
    readable: js.UndefOr[Boolean] = js.undefined,
    strict: js.UndefOr[Boolean] = js.undefined,
    writable: js.UndefOr[Boolean] = js.undefined
  ): PackOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dereference)) __obj.updateDynamic("dereference")(dereference.asInstanceOf[js.Any])
    if (dmode != null) __obj.updateDynamic("dmode")(dmode.asInstanceOf[js.Any])
    if (entries != null) __obj.updateDynamic("entries")(entries.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1(filter))
    if (!js.isUndefined(finalize)) __obj.updateDynamic("finalize")(finalize.asInstanceOf[js.Any])
    if (finish != null) __obj.updateDynamic("finish")(js.Any.fromFunction1(finish))
    if (fmode != null) __obj.updateDynamic("fmode")(fmode.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(js.Any.fromFunction1(ignore))
    if (map != null) __obj.updateDynamic("map")(js.Any.fromFunction1(map))
    if (mapStream != null) __obj.updateDynamic("mapStream")(js.Any.fromFunction2(mapStream))
    if (!js.isUndefined(readable)) __obj.updateDynamic("readable")(readable.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.asInstanceOf[js.Any])
    if (!js.isUndefined(writable)) __obj.updateDynamic("writable")(writable.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackOptions]
  }
}

