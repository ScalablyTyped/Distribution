package typings
package textDashTableLib.textDashTableMod.tableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Options extends js.Object {
  /** An array of alignment types for each column, default ['l','l',...]. */
  var align: js.UndefOr[
    js.Array[
      textDashTableLib.textDashTableLibStrings.l | textDashTableLib.textDashTableLibStrings.r | textDashTableLib.textDashTableLibStrings.c | textDashTableLib.textDashTableLibStrings.DOT
    ]
  ] = js.undefined
  /** Separator to use between columns, (default: ' '). */
  var hsep: js.UndefOr[java.lang.String] = js.undefined
  /** A callback function to use when calculating the string length. */
  var stringLength: js.UndefOr[js.Function1[/* str */ java.lang.String, scala.Double]] = js.undefined
}

