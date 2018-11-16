package typings
package typedocLib.distLibConverterTypesTupleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/types/tuple", "TupleConverter")
@js.native
class TupleConverter ()
  extends typedocLib.distLibConverterComponentsMod.TypeConverter[
      typescriptLib.typescriptMod.tsNs.TypeReference, 
      typescriptLib.typescriptMod.tsNs.TupleTypeNode
    ] {
  def convertNode(
    context: typedocLib.distLibConverterContextMod.Context,
    node: typescriptLib.typescriptMod.tsNs.TupleTypeNode
  ): typedocLib.distLibModelsTypesMod.TupleType = js.native
  def supportsNode(
    context: typedocLib.distLibConverterContextMod.Context,
    node: typescriptLib.typescriptMod.tsNs.TupleTypeNode
  ): scala.Boolean = js.native
}

