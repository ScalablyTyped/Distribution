package typings.tarFs.mod

import typings.node.fsMod.ReadStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var dmode: js.UndefOr[Double] = js.undefined
  var filter: js.UndefOr[js.Function1[/* name */ String, Boolean]] = js.undefined
  var fmode: js.UndefOr[Double] = js.undefined
  var ignore: js.UndefOr[js.Function1[/* name */ String, Boolean]] = js.undefined
  var map: js.UndefOr[js.Function1[/* header */ Headers, Headers]] = js.undefined
  var mapStream: js.UndefOr[js.Function2[/* fileStream */ ReadStream, /* header */ Headers, ReadStream]] = js.undefined
  var readable: js.UndefOr[Boolean] = js.undefined
  var strict: js.UndefOr[Boolean] = js.undefined
  var writable: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    dmode: js.UndefOr[Double] = js.undefined,
    filter: /* name */ String => Boolean = null,
    fmode: js.UndefOr[Double] = js.undefined,
    ignore: /* name */ String => Boolean = null,
    map: /* header */ Headers => Headers = null,
    mapStream: (/* fileStream */ ReadStream, /* header */ Headers) => ReadStream = null,
    readable: js.UndefOr[Boolean] = js.undefined,
    strict: js.UndefOr[Boolean] = js.undefined,
    writable: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dmode)) __obj.updateDynamic("dmode")(dmode.get.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1(filter))
    if (!js.isUndefined(fmode)) __obj.updateDynamic("fmode")(fmode.get.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(js.Any.fromFunction1(ignore))
    if (map != null) __obj.updateDynamic("map")(js.Any.fromFunction1(map))
    if (mapStream != null) __obj.updateDynamic("mapStream")(js.Any.fromFunction2(mapStream))
    if (!js.isUndefined(readable)) __obj.updateDynamic("readable")(readable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.get.asInstanceOf[js.Any])
    if (!js.isUndefined(writable)) __obj.updateDynamic("writable")(writable.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

