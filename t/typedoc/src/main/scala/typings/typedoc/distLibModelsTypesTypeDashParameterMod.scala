package typings.typedoc

import typings.typedoc.distLibModelsTypesAbstractMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/models/types/type-parameter", JSImport.Namespace)
@js.native
object distLibModelsTypesTypeDashParameterMod extends js.Object {
  @js.native
  class TypeParameterType protected () extends Type {
    def this(name: String) = this()
    var constraint: js.UndefOr[Type] = js.native
    val name: String = js.native
    def equals(`type`: TypeParameterType): Boolean = js.native
  }
  
}

