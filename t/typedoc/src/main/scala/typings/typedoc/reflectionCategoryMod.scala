package typings.typedoc

import typings.typedoc.modelsMod.DeclarationReflection
import typings.typedoc.serializationMod.Serializer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reflectionCategoryMod {
  
  @JSImport("typedoc/dist/lib/models/ReflectionCategory", "ReflectionCategory")
  @js.native
  open class ReflectionCategory protected () extends StObject {
    /**
      * Create a new ReflectionCategory instance.
      *
      * @param title The title of this category.
      */
    def this(title: String) = this()
    
    /**
      * Do all children of this category have a separate document?
      */
    def allChildrenHaveOwnDocument(): Boolean = js.native
    
    /**
      * All reflections of this category.
      */
    var children: js.Array[DeclarationReflection] = js.native
    
    /**
      * The title, a string representation of this category.
      */
    var title: String = js.native
    
    def toObject(_serializer: Serializer): typings.typedoc.schemaMod.ReflectionCategory = js.native
  }
}
