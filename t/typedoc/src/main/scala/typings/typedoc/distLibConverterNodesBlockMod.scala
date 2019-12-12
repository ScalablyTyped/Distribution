package typings.typedoc

import org.scalablytyped.runtime.TopLevel
import typings.typedoc.distLibConverterComponentsMod.ConverterNodeComponent
import typings.typedoc.distLibConverterContextMod.Context
import typings.typedoc.distLibConverterNodesBlockMod.SourceFileMode
import typings.typedoc.distLibConverterNodesBlockMod.SourceFileMode.File
import typings.typedoc.distLibConverterNodesBlockMod.SourceFileMode.Modules
import typings.typedoc.distLibModelsMod.Reflection
import typings.typescript.typescriptMod.Block
import typings.typescript.typescriptMod.ModuleBlock
import typings.typescript.typescriptMod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/nodes/block", JSImport.Namespace)
@js.native
object distLibConverterNodesBlockMod extends js.Object {
  @js.native
  class BlockConverter () extends ConverterNodeComponent[SourceFile | Block | ModuleBlock] {
    var convertSourceFile: js.Any = js.native
    var convertStatements: js.Any = js.native
    var mode: SourceFileMode = js.native
    def convert(context: Context, node: Block): Reflection = js.native
    def convert(context: Context, node: ModuleBlock): Reflection = js.native
    def convert(context: Context, node: SourceFile): Reflection = js.native
  }
  
  @js.native
  sealed trait SourceFileMode extends js.Object
  
  @js.native
  object SourceFileMode extends js.Object {
    @js.native
    sealed trait File extends SourceFileMode
    
    @js.native
    sealed trait Modules extends SourceFileMode
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[SourceFileMode with Double] = js.native
    /* 0 */ @js.native
    object File extends TopLevel[File with Double]
    
    /* 1 */ @js.native
    object Modules extends TopLevel[Modules with Double]
    
  }
  
}

