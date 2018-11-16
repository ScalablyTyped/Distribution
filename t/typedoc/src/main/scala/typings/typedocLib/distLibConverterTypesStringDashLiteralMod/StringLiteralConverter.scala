package typings
package typedocLib.distLibConverterTypesStringDashLiteralMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/types/string-literal", "StringLiteralConverter")
@js.native
class StringLiteralConverter ()
  extends typedocLib.distLibConverterComponentsMod.TypeConverter[
      typescriptLib.typescriptMod.tsNs.LiteralType, 
      typescriptLib.typescriptMod.tsNs.StringLiteral
    ] {
  def convertNode(
    context: typedocLib.distLibConverterContextMod.Context,
    node: typescriptLib.typescriptMod.tsNs.StringLiteral
  ): typedocLib.distLibModelsTypesMod.Type = js.native
  def supportsNode(
    context: typedocLib.distLibConverterContextMod.Context,
    node: typescriptLib.typescriptMod.tsNs.StringLiteral
  ): scala.Boolean = js.native
}

