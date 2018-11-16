package typings
package typedocLib.distLibConverterTypesBindingDashObjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/types/binding-object", "BindingObjectConverter")
@js.native
class BindingObjectConverter ()
  extends typedocLib.distLibConverterComponentsMod.TypeNodeConverter[
      typescriptLib.typescriptMod.tsNs.Type, 
      typescriptLib.typescriptMod.tsNs.BindingPattern
    ] {
  def convertNode(
    context: typedocLib.distLibConverterContextMod.Context,
    node: typescriptLib.typescriptMod.tsNs.BindingPattern
  ): typedocLib.distLibModelsMod.Type = js.native
  def supportsNode(
    context: typedocLib.distLibConverterContextMod.Context,
    node: typescriptLib.typescriptMod.tsNs.BindingPattern
  ): scala.Boolean = js.native
}

