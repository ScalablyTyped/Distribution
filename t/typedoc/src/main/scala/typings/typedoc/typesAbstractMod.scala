package typings.typedoc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/models/types/abstract", JSImport.Namespace)
@js.native
object typesAbstractMod extends js.Object {
  @js.native
  abstract class Type () extends js.Object {
    val `type`: String = js.native
    def equals(`type`: Type): Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Type extends js.Object {
    def isTypeListEqual(a: js.Array[Type], b: js.Array[Type]): Boolean = js.native
    def isTypeListSimilar(a: js.Array[Type], b: js.Array[Type]): Boolean = js.native
  }
  
}

