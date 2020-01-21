package typings.tsNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Register_ extends js.Object {
  var cachedir: String = js.native
  var cwd: String = js.native
  var extensions: js.Array[String] = js.native
  var ts: TSCommon = js.native
  def compile(code: String, fileName: String): String = js.native
  def compile(code: String, fileName: String, lineOffset: Double): String = js.native
  def getTypeInfo(code: String, fileName: String, position: Double): TypeInfo = js.native
}

