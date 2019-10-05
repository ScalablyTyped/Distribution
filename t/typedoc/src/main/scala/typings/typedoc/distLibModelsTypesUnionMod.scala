package typings.typedoc

import typings.typedoc.distLibModelsTypesAbstractMod.Type
import typings.typedoc.distLibModelsTypesUnionMod.UnionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/models/types/union", JSImport.Namespace)
@js.native
object distLibModelsTypesUnionMod extends js.Object {
  @js.native
  class UnionType protected () extends Type {
    def this(types: js.Array[Type]) = this()
    var types: js.Array[Type] = js.native
    def equals(`type`: UnionType): Boolean = js.native
  }
  
}

