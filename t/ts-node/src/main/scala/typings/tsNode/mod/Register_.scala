package typings.tsNode.mod

import typings.typescript.mod.ParsedCommandLine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Register_ extends js.Object {
  var config: ParsedCommandLine = js.native
  var ts: TSCommon = js.native
  def compile(code: String, fileName: String): String = js.native
  def compile(code: String, fileName: String, lineOffset: Double): String = js.native
  def enabled(): Boolean = js.native
  def enabled(enabled: Boolean): Boolean = js.native
  def getTypeInfo(code: String, fileName: String, position: Double): TypeInfo = js.native
  def ignored(fileName: String): Boolean = js.native
}

