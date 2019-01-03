package typings
package typedocLib.distLibConverterTypesArrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/types/array", "ArrayConverter")
@js.native
class ArrayConverter ()
  extends typedocLib.distLibConverterComponentsMod.TypeConverter[
      typescriptLib.typescriptMod.tsNs.TypeReference, 
      typescriptLib.typescriptMod.tsNs.ArrayTypeNode
    ] {
  def convertNode(
    context: typedocLib.distLibConverterContextMod.Context,
    node: typescriptLib.typescriptMod.tsNs.ArrayTypeNode
  ): js.UndefOr[typedocLib.distLibModelsMod.Type] = js.native
  def supportsNode(
    context: typedocLib.distLibConverterContextMod.Context,
    node: typescriptLib.typescriptMod.tsNs.ArrayTypeNode
  ): scala.Boolean = js.native
}

