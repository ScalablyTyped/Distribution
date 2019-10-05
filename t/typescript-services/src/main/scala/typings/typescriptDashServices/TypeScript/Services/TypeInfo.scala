package typings.typescriptDashServices.TypeScript.Services

import typings.typescriptDashServices.TypeScript.MemberName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Services.TypeInfo")
@js.native
class TypeInfo protected () extends js.Object {
  def this(
    memberName: MemberName,
    docComment: String,
    fullSymbolName: String,
    kind: String,
    minChar: Double,
    limChar: Double
  ) = this()
  var docComment: String = js.native
  var fullSymbolName: String = js.native
  var kind: String = js.native
  var limChar: Double = js.native
  var memberName: MemberName = js.native
  var minChar: Double = js.native
}

