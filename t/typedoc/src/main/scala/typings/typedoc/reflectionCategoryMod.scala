package typings.typedoc

import typings.typedoc.abstractMod.Reflection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reflectionCategoryMod {
  
  @JSImport("typedoc/dist/lib/models/ReflectionCategory", "ReflectionCategory")
  @js.native
  class ReflectionCategory protected () extends StObject {
    def this(title: String) = this()
    
    var allChildrenHaveOwnDocument: js.Function = js.native
    
    var children: js.Array[Reflection] = js.native
    
    /* private */ var getAllChildrenHaveOwnDocument: js.Any = js.native
    
    var title: String = js.native
  }
}
