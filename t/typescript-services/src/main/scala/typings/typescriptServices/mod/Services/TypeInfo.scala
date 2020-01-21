package typings.typescriptServices.mod.Services

import typings.typescriptServices.TypeScript.MemberName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "Services.TypeInfo")
@js.native
class TypeInfo protected ()
  extends typings.typescriptServices.TypeScript.Services.TypeInfo {
  def this(
    memberName: MemberName,
    docComment: String,
    fullSymbolName: String,
    kind: String,
    minChar: Double,
    limChar: Double
  ) = this()
}

