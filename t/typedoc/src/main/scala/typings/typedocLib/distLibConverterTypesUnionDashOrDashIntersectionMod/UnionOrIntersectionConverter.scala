package typings
package typedocLib.distLibConverterTypesUnionDashOrDashIntersectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/types/union-or-intersection", "UnionOrIntersectionConverter")
@js.native
class UnionOrIntersectionConverter ()
  extends typedocLib.distLibConverterComponentsMod.TypeConverter[
      typescriptLib.typescriptMod.tsNs.UnionOrIntersectionType, 
      typescriptLib.typescriptMod.tsNs.UnionOrIntersectionTypeNode
    ] {
  def convertNode(
    context: typedocLib.distLibConverterContextMod.Context,
    node: typescriptLib.typescriptMod.tsNs.UnionOrIntersectionTypeNode
  ): typedocLib.distLibModelsTypesMod.UnionType | typedocLib.distLibModelsTypesMod.IntersectionType = js.native
  def supportsNode(
    context: typedocLib.distLibConverterContextMod.Context,
    node: typescriptLib.typescriptMod.tsNs.UnionOrIntersectionTypeNode
  ): scala.Boolean = js.native
}

