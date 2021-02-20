package typings.typedoc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesAbstractMod {
  
  @JSImport("typedoc/dist/lib/models/types/abstract", "Type")
  @js.native
  abstract class Type () extends StObject {
    
    def equals(`type`: Type): Boolean = js.native
    
    val `type`: String = js.native
  }
  /* static members */
  object Type {
    
    @JSImport("typedoc/dist/lib/models/types/abstract", "Type.isTypeListEqual")
    @js.native
    def isTypeListEqual(a: js.Array[Type], b: js.Array[Type]): Boolean = js.native
    
    @JSImport("typedoc/dist/lib/models/types/abstract", "Type.isTypeListSimilar")
    @js.native
    def isTypeListSimilar(a: js.Array[Type], b: js.Array[Type]): Boolean = js.native
  }
}
