package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.StringUtilities")
@js.native
class StringUtilities () extends js.Object

@JSGlobal("TypeScript.StringUtilities")
@js.native
object StringUtilities extends js.Object {
  def copyTo(
    source: java.lang.String,
    sourceIndex: scala.Double,
    destination: js.Array[scala.Double],
    destinationIndex: scala.Double,
    count: scala.Double
  ): scala.Unit = js.native
  def endsWith(string: java.lang.String, value: java.lang.String): scala.Boolean = js.native
  def fromCharCodeArray(array: js.Array[scala.Double]): java.lang.String = js.native
  def isString(value: js.Any): scala.Boolean = js.native
  def repeat(value: java.lang.String, count: scala.Double): java.lang.String = js.native
  def startsWith(string: java.lang.String, value: java.lang.String): scala.Boolean = js.native
  def stringEquals(val1: java.lang.String, val2: java.lang.String): scala.Boolean = js.native
}

