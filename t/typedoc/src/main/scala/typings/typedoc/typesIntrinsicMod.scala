package typings.typedoc

import typings.typedoc.typedocStrings.intrinsic
import typings.typedoc.typesAbstractMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/models/types/intrinsic", JSImport.Namespace)
@js.native
object typesIntrinsicMod extends js.Object {
  @js.native
  class IntrinsicType protected () extends Type {
    def this(name: String) = this()
    var name: String = js.native
    @JSName("type")
    val type_IntrinsicType: intrinsic = js.native
    def equals(`type`: IntrinsicType): Boolean = js.native
  }
  
}

