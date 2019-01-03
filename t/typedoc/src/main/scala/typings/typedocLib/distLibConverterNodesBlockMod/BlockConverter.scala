package typings
package typedocLib.distLibConverterNodesBlockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/nodes/block", "BlockConverter")
@js.native
class BlockConverter ()
  extends typedocLib.distLibConverterComponentsMod.ConverterNodeComponent[
      typescriptLib.typescriptMod.tsNs.SourceFile | typescriptLib.typescriptMod.tsNs.Block | typescriptLib.typescriptMod.tsNs.ModuleBlock
    ] {
  var convertSourceFile: js.Any = js.native
  var convertStatements: js.Any = js.native
  var mode: SourceFileMode = js.native
  def convert(
    context: typedocLib.distLibConverterContextMod.Context,
    node: typescriptLib.typescriptMod.tsNs.Block
  ): typedocLib.distLibModelsMod.Reflection = js.native
  def convert(
    context: typedocLib.distLibConverterContextMod.Context,
    node: typescriptLib.typescriptMod.tsNs.ModuleBlock
  ): typedocLib.distLibModelsMod.Reflection = js.native
  def convert(
    context: typedocLib.distLibConverterContextMod.Context,
    node: typescriptLib.typescriptMod.tsNs.SourceFile
  ): typedocLib.distLibModelsMod.Reflection = js.native
}

