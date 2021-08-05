package typings.typedoc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    
    @JSImport("typedoc/dist/lib/models/types/abstract", "Type")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isTypeListEqual(a: js.Array[Type], b: js.Array[Type]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTypeListEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def isTypeListSimilar(a: js.Array[Type], b: js.Array[Type]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTypeListSimilar")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  }
}
