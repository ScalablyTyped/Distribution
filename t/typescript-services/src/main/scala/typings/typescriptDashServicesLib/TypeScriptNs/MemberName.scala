package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.MemberName")
@js.native
class MemberName () extends js.Object {
  var prefix: java.lang.String = js.native
  var suffix: java.lang.String = js.native
  def isArray(): scala.Boolean = js.native
  def isMarker(): scala.Boolean = js.native
  def isString(): scala.Boolean = js.native
}

/* static members */
@JSGlobal("TypeScript.MemberName")
@js.native
object MemberName extends js.Object {
  def create(
    entry: typescriptDashServicesLib.TypeScriptNs.MemberName,
    prefix: java.lang.String,
    suffix: java.lang.String
  ): typescriptDashServicesLib.TypeScriptNs.MemberName = js.native
  def create(text: java.lang.String): typescriptDashServicesLib.TypeScriptNs.MemberName = js.native
  def memberNameToString(memberName: typescriptDashServicesLib.TypeScriptNs.MemberName): java.lang.String = js.native
  def memberNameToString(memberName: typescriptDashServicesLib.TypeScriptNs.MemberName, markerInfo: js.Array[scala.Double]): java.lang.String = js.native
  def memberNameToString(
    memberName: typescriptDashServicesLib.TypeScriptNs.MemberName,
    markerInfo: js.Array[scala.Double],
    markerBaseLength: scala.Double
  ): java.lang.String = js.native
}

