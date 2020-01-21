package typings.typedoc

import typings.typedoc.componentsMod.ConverterNodeComponent
import typings.typedoc.contextMod.Context
import typings.typedoc.modelsMod.Reflection
import typings.typescript.mod.FunctionDeclaration
import typings.typescript.mod.MethodDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/nodes/function", JSImport.Namespace)
@js.native
object functionMod extends js.Object {
  @js.native
  class FunctionConverter () extends ConverterNodeComponent[FunctionDeclaration | MethodDeclaration] {
    def convert(context: Context, node: FunctionDeclaration): js.UndefOr[Reflection] = js.native
    def convert(context: Context, node: MethodDeclaration): js.UndefOr[Reflection] = js.native
  }
  
}

