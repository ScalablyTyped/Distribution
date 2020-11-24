package typings.typedoc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/models/types/abstract", JSImport.Namespace)
@js.native
object typesAbstractMod extends js.Object {
  
  @js.native
  abstract class Type () extends js.Object {
    
    def equals(`type`: Type): Boolean = js.native
    
    val `type`: String = js.native
  }
  /* static members */
  @js.native
  object Type extends js.Object {
    
    def isTypeListEqual(a: js.Array[Type], b: js.Array[Type]): Boolean = js.native
    
    def isTypeListSimilar(a: js.Array[Type], b: js.Array[Type]): Boolean = js.native
  }
}
