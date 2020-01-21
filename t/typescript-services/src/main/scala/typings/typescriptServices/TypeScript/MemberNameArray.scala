package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.MemberNameArray")
@js.native
class MemberNameArray () extends MemberName {
  var delim: String = js.native
  var entries: js.Array[MemberName] = js.native
  def add(entry: MemberName): Unit = js.native
  def addAll(entries: js.Array[MemberName]): Unit = js.native
}

