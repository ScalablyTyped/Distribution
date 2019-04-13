package typings
package typedocLib.distLibConverterNodesBlockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/nodes/block", "BlockConverter")
@js.native
class BlockConverter ()
  extends typedocLib.distLibConverterComponentsMod.ConverterNodeComponent[
      typescriptLib.typescriptMod.SourceFile | typescriptLib.typescriptMod.Block | typescriptLib.typescriptMod.ModuleBlock
    ] {
  var convertSourceFile: js.Any = js.native
  var convertStatements: js.Any = js.native
  var mode: SourceFileMode = js.native
  def convert(context: typedocLib.distLibConverterContextMod.Context, node: typescriptLib.typescriptMod.Block): typedocLib.distLibModelsMod.Reflection = js.native
  def convert(
    context: typedocLib.distLibConverterContextMod.Context,
    node: typescriptLib.typescriptMod.ModuleBlock
  ): typedocLib.distLibModelsMod.Reflection = js.native
  def convert(
    context: typedocLib.distLibConverterContextMod.Context,
    node: typescriptLib.typescriptMod.SourceFile
  ): typedocLib.distLibModelsMod.Reflection = js.native
}

