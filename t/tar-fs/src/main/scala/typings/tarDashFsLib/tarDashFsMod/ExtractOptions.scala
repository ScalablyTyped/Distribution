package typings
package tarDashFsLib.tarDashFsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtractOptions extends Options {
  @JSName("filter")
  var filter_ExtractOptions: js.UndefOr[
    js.Function2[/* name */ java.lang.String, /* header */ js.UndefOr[Headers], scala.Boolean]
  ] = js.undefined
  @JSName("ignore")
  var ignore_ExtractOptions: js.UndefOr[
    js.Function2[/* name */ java.lang.String, /* header */ js.UndefOr[Headers], scala.Boolean]
  ] = js.undefined
}

object ExtractOptions {
  @scala.inline
  def apply(
    dmode: scala.Int | scala.Double = null,
    filter: js.Function2[/* name */ java.lang.String, /* header */ js.UndefOr[Headers], scala.Boolean] = null,
    fmode: scala.Int | scala.Double = null,
    ignore: js.Function2[/* name */ java.lang.String, /* header */ js.UndefOr[Headers], scala.Boolean] = null,
    map: js.Function1[/* header */ Headers, Headers] = null,
    mapStream: js.Function2[
      /* fileStream */ nodeLib.fsMod.ReadStream, 
      /* header */ Headers, 
      nodeLib.fsMod.ReadStream
    ] = null,
    readable: js.UndefOr[scala.Boolean] = js.undefined,
    strict: js.UndefOr[scala.Boolean] = js.undefined,
    writable: js.UndefOr[scala.Boolean] = js.undefined
  ): ExtractOptions = {
    val __obj = js.Dynamic.literal()
    if (dmode != null) __obj.updateDynamic("dmode")(dmode.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (fmode != null) __obj.updateDynamic("fmode")(fmode.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore)
    if (map != null) __obj.updateDynamic("map")(map)
    if (mapStream != null) __obj.updateDynamic("mapStream")(mapStream)
    if (!js.isUndefined(readable)) __obj.updateDynamic("readable")(readable)
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    if (!js.isUndefined(writable)) __obj.updateDynamic("writable")(writable)
    __obj.asInstanceOf[ExtractOptions]
  }
}

