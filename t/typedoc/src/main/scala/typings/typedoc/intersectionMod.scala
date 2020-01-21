package typings.typedoc

import typings.typedoc.typesAbstractMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/models/types/intersection", JSImport.Namespace)
@js.native
object intersectionMod extends js.Object {
  @js.native
  class IntersectionType protected () extends Type {
    def this(types: js.Array[Type]) = this()
    var types: js.Array[Type] = js.native
    def equals(`type`: IntersectionType): Boolean = js.native
  }
  
}

