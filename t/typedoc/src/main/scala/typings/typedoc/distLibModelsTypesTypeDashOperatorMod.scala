package typings.typedoc

import typings.typedoc.distLibModelsTypesAbstractMod.Type
import typings.typedoc.typedocStrings.keyof
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/models/types/type-operator", JSImport.Namespace)
@js.native
object distLibModelsTypesTypeDashOperatorMod extends js.Object {
  @js.native
  class TypeOperatorType protected () extends Type {
    def this(target: Type) = this()
    val operator: keyof = js.native
    var target: Type = js.native
    def equals(`type`: TypeOperatorType): Boolean = js.native
  }
  
}

