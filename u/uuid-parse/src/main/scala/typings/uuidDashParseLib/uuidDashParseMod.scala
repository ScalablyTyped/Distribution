package typings
package uuidDashParseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("uuid-parse", JSImport.Namespace)
@js.native
object uuidDashParseMod extends js.Object {
  def parse(id: java.lang.String): nodeLib.Buffer = js.native
  def parse(id: java.lang.String, buffer: js.Array[_]): nodeLib.Buffer = js.native
  def parse(id: java.lang.String, buffer: js.Array[_], offset: scala.Double): nodeLib.Buffer = js.native
  def parse(id: java.lang.String, buffer: nodeLib.Buffer): nodeLib.Buffer = js.native
  def parse(id: java.lang.String, buffer: nodeLib.Buffer, offset: scala.Double): nodeLib.Buffer = js.native
  def unparse(buffer: nodeLib.Buffer): java.lang.String = js.native
  def unparse(buffer: nodeLib.Buffer, offset: scala.Double): java.lang.String = js.native
}

