package typings
package tsDashNodeLib.tsDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Register extends js.Object {
  var cachedir: java.lang.String = js.native
  var cwd: java.lang.String = js.native
  var extensions: js.Array[java.lang.String] = js.native
  var ts: TSCommon = js.native
  def compile(code: java.lang.String, fileName: java.lang.String): java.lang.String = js.native
  def compile(code: java.lang.String, fileName: java.lang.String, lineOffset: scala.Double): java.lang.String = js.native
  def getTypeInfo(code: java.lang.String, fileName: java.lang.String, position: scala.Double): TypeInfo = js.native
}

