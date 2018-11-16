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

