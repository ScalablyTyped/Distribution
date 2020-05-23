package typings.tarFs.mod

import typings.node.fsMod.ReadStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtractOptions extends Options {
  @JSName("filter")
  var filter_ExtractOptions: js.UndefOr[js.Function2[/* name */ String, /* header */ js.UndefOr[Headers], Boolean]] = js.undefined
  @JSName("ignore")
  var ignore_ExtractOptions: js.UndefOr[js.Function2[/* name */ String, /* header */ js.UndefOr[Headers], Boolean]] = js.undefined
  var strip: js.UndefOr[Double] = js.undefined
}

object ExtractOptions {
  @scala.inline
  def apply(
    dmode: js.UndefOr[Double] = js.undefined,
    filter: (/* name */ String, /* header */ js.UndefOr[Headers]) => Boolean = null,
    fmode: js.UndefOr[Double] = js.undefined,
    ignore: (/* name */ String, /* header */ js.UndefOr[Headers]) => Boolean = null,
    map: /* header */ Headers => Headers = null,
    mapStream: (/* fileStream */ ReadStream, /* header */ Headers) => ReadStream = null,
    readable: js.UndefOr[Boolean] = js.undefined,
    strict: js.UndefOr[Boolean] = js.undefined,
    strip: js.UndefOr[Double] = js.undefined,
    writable: js.UndefOr[Boolean] = js.undefined
  ): ExtractOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dmode)) __obj.updateDynamic("dmode")(dmode.get.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction2(filter))
    if (!js.isUndefined(fmode)) __obj.updateDynamic("fmode")(fmode.get.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(js.Any.fromFunction2(ignore))
    if (map != null) __obj.updateDynamic("map")(js.Any.fromFunction1(map))
    if (mapStream != null) __obj.updateDynamic("mapStream")(js.Any.fromFunction2(mapStream))
    if (!js.isUndefined(readable)) __obj.updateDynamic("readable")(readable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.get.asInstanceOf[js.Any])
    if (!js.isUndefined(strip)) __obj.updateDynamic("strip")(strip.get.asInstanceOf[js.Any])
    if (!js.isUndefined(writable)) __obj.updateDynamic("writable")(writable.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtractOptions]
  }
}

