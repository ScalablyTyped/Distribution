package typings
package tarDashFsLib.tarDashFsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var dmode: js.UndefOr[scala.Double] = js.undefined
  var filter: js.UndefOr[js.Function1[/* name */ java.lang.String, scala.Boolean]] = js.undefined
  var fmode: js.UndefOr[scala.Double] = js.undefined
  var ignore: js.UndefOr[js.Function1[/* name */ java.lang.String, scala.Boolean]] = js.undefined
  var map: js.UndefOr[js.Function1[/* header */ Headers, Headers]] = js.undefined
  var mapStream: js.UndefOr[
    js.Function2[
      /* fileStream */ nodeLib.fsMod.ReadStream, 
      /* header */ Headers, 
      nodeLib.fsMod.ReadStream
    ]
  ] = js.undefined
  var readable: js.UndefOr[scala.Boolean] = js.undefined
  var strict: js.UndefOr[scala.Boolean] = js.undefined
  var writable: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    dmode: scala.Int | scala.Double = null,
    filter: /* name */ java.lang.String => scala.Boolean = null,
    fmode: scala.Int | scala.Double = null,
    ignore: /* name */ java.lang.String => scala.Boolean = null,
    map: /* header */ Headers => Headers = null,
    mapStream: (/* fileStream */ nodeLib.fsMod.ReadStream, /* header */ Headers) => nodeLib.fsMod.ReadStream = null,
    readable: js.UndefOr[scala.Boolean] = js.undefined,
    strict: js.UndefOr[scala.Boolean] = js.undefined,
    writable: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (dmode != null) __obj.updateDynamic("dmode")(dmode.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1(filter))
    if (fmode != null) __obj.updateDynamic("fmode")(fmode.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(js.Any.fromFunction1(ignore))
    if (map != null) __obj.updateDynamic("map")(js.Any.fromFunction1(map))
    if (mapStream != null) __obj.updateDynamic("mapStream")(js.Any.fromFunction2(mapStream))
    if (!js.isUndefined(readable)) __obj.updateDynamic("readable")(readable)
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    if (!js.isUndefined(writable)) __obj.updateDynamic("writable")(writable)
    __obj.asInstanceOf[Options]
  }
}

