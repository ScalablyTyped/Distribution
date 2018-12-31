package typings
package terserLib.terserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MinifyOutput extends js.Object {
  var ast: js.UndefOr[scala.Boolean | AST_Toplevel] = js.undefined
  var code: java.lang.String
  var error: js.UndefOr[java.lang.String] = js.undefined
  var map: java.lang.String
  var warnings: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

