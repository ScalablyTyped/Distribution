package typings.typedoc

import typings.typedoc.typedocStrings.tuple
import typings.typedoc.typesAbstractMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/models/types/tuple", JSImport.Namespace)
@js.native
object typesTupleMod extends js.Object {
  @js.native
  class TupleType protected () extends Type {
    def this(elements: js.Array[Type]) = this()
    var elements: js.Array[Type] = js.native
    @JSName("type")
    val type_TupleType: tuple = js.native
    def equals(`type`: TupleType): Boolean = js.native
  }
  
}

