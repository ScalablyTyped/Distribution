package typings.typescriptServices.global.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.MemberName")
@js.native
class MemberName ()
  extends typings.typescriptServices.TypeScript.MemberName {
  /* CompleteClass */
  override var prefix: String = js.native
  /* CompleteClass */
  override var suffix: String = js.native
  /* CompleteClass */
  override def isArray(): Boolean = js.native
  /* CompleteClass */
  override def isMarker(): Boolean = js.native
  /* CompleteClass */
  override def isString(): Boolean = js.native
}

/* static members */
@JSGlobal("TypeScript.MemberName")
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

