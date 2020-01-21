package typings.typedoc

import typings.typedoc.componentsMod.TypeNodeConverter
import typings.typescript.mod.Type
import typings.typescript.mod.TypeOperatorNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/types/type-operator", JSImport.Namespace)
@js.native
object typeOperatorMod extends js.Object {
  @js.native
  class TypeOperatorConverter () extends TypeNodeConverter[Type, TypeOperatorNode]
  
}

