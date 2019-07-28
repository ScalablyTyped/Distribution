package typings.typescriptDashServices.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.MemberName")
@js.native
class MemberName () extends js.Object {
  var prefix: String = js.native
  var suffix: String = js.native
  def isArray(): Boolean = js.native
  def isMarker(): Boolean = js.native
  def isString(): Boolean = js.native
}

/* static members */
@JSGlobal("TypeScript.MemberName")
@js.native
object MemberName extends js.Object {
  def create(entry: MemberName, prefix: String, suffix: String): MemberName = js.native
  def create(text: String): MemberName = js.native
  def memberNameToString(memberName: MemberName): String = js.native
  def memberNameToString(memberName: MemberName, markerInfo: js.Array[Double]): String = js.native
  def memberNameToString(memberName: MemberName, markerInfo: js.Array[Double], markerBaseLength: Double): String = js.native
}

