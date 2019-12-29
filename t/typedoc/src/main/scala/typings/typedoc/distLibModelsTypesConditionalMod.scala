package typings.typedoc

import typings.typedoc.distLibModelsTypesAbstractMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/models/types/conditional", JSImport.Namespace)
@js.native
object distLibModelsTypesConditionalMod extends js.Object {
  @js.native
  class ConditionalType protected () extends Type {
    def this(checkType: Type, extendsType: Type, trueType: Type, falseType: Type) = this()
    var checkType: Type = js.native
    var extendsType: Type = js.native
    var falseType: Type = js.native
    var trueType: Type = js.native
    def equals(`type`: js.Any): Boolean = js.native
  }
  
}

