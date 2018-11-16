package typings
package tabulatorLib.tabulatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*~ Write your module's methods and properties in this class */

trait Tabulator extends js.Object {
  // myMethod(opts: Tabulator.chartType): number;
  var defaultShowAttribute: java.lang.String
  def toHtmlTable(matrix: js.Object): js.Any
  def toMatrix(datum: js.Object): js.Object
}

