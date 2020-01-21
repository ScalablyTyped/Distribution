package typings.typedoc

import typings.typedoc.componentsMod.ConverterNodeComponent
import typings.typescript.mod.TypeLiteralNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/nodes/literal-type", JSImport.Namespace)
@js.native
object literalTypeMod extends js.Object {
  @js.native
  class TypeLiteralConverter () extends ConverterNodeComponent[TypeLiteralNode]
  
}

