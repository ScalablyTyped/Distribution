package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.StringUtilities")
@js.native
class StringUtilities () extends js.Object

/* static members */
@JSGlobal("TypeScript.StringUtilities")
@js.native
object StringUtilities extends js.Object {
  def copyTo(
    source: String,
    sourceIndex: Double,
    destination: js.Array[Double],
    destinationIndex: Double,
    count: Double
  ): Unit = js.native
  def endsWith(string: String, value: String): Boolean = js.native
  def fromCharCodeArray(array: js.Array[Double]): String = js.native
  def isString(value: js.Any): Boolean = js.native
  def repeat(value: String, count: Double): String = js.native
  def startsWith(string: String, value: String): Boolean = js.native
  def stringEquals(val1: String, val2: String): Boolean = js.native
}

