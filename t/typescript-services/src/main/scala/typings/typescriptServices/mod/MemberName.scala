package typings.typescriptServices.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "MemberName")
@js.native
class MemberName ()
  extends typings.typescriptServices.TypeScript.MemberName

/* static members */
@JSImport("typescript-services", "MemberName")
@js.native
object MemberName extends js.Object {
  def create(entry: typings.typescriptServices.TypeScript.MemberName, prefix: String, suffix: String): typings.typescriptServices.TypeScript.MemberName = js.native
  def create(text: String): typings.typescriptServices.TypeScript.MemberName = js.native
  def memberNameToString(memberName: typings.typescriptServices.TypeScript.MemberName): String = js.native
  def memberNameToString(memberName: typings.typescriptServices.TypeScript.MemberName, markerInfo: js.Array[Double]): String = js.native
  def memberNameToString(
    memberName: typings.typescriptServices.TypeScript.MemberName,
    markerInfo: js.Array[Double],
    markerBaseLength: Double
  ): String = js.native
}

