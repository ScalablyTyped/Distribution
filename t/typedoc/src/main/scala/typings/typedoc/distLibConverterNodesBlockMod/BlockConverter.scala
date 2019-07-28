package typings.typedoc.distLibConverterNodesBlockMod

import typings.typedoc.distLibConverterComponentsMod.ConverterNodeComponent
import typings.typedoc.distLibConverterContextMod.Context
import typings.typedoc.distLibModelsMod.Reflection
import typings.typescript.typescriptMod.Block
import typings.typescript.typescriptMod.ModuleBlock
import typings.typescript.typescriptMod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/nodes/block", "BlockConverter")
@js.native
class BlockConverter () extends ConverterNodeComponent[SourceFile | Block | ModuleBlock] {
  var convertSourceFile: js.Any = js.native
  var convertStatements: js.Any = js.native
  var mode: SourceFileMode = js.native
  def convert(context: Context, node: Block): Reflection = js.native
  def convert(context: Context, node: ModuleBlock): Reflection = js.native
  def convert(context: Context, node: SourceFile): Reflection = js.native
}

