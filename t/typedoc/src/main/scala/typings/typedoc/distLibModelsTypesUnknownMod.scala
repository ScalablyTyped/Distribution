package typings.typedoc

import typings.typedoc.distLibModelsTypesAbstractMod.Type
import typings.typedoc.distLibModelsTypesUnknownMod.UnknownType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/models/types/unknown", JSImport.Namespace)
@js.native
object distLibModelsTypesUnknownMod extends js.Object {
  @js.native
  class UnknownType protected () extends Type {
    def this(name: String) = this()
    var name: String = js.native
    def equals(`type`: UnknownType): Boolean = js.native
  }
  
}

