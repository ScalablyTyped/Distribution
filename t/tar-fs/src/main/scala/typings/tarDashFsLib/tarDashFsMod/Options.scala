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

