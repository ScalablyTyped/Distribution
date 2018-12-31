package typings
package xlsxLib.xlsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefinedName extends js.Object {
  /** Name comment */
  var Comment: js.UndefOr[java.lang.String] = js.undefined
  /** Name */
  var Name: java.lang.String
  /** Reference */
  var Ref: java.lang.String
  /** Scope (undefined for workbook scope) */
  var Sheet: js.UndefOr[scala.Double] = js.undefined
}

