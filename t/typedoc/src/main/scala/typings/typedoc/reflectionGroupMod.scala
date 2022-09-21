package typings.typedoc

import typings.typedoc.modelsMod.DeclarationReflection
import typings.typedoc.reflectionCategoryMod.ReflectionCategory
import typings.typedoc.serializationMod.Serializer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reflectionGroupMod {
  
  @JSImport("typedoc/dist/lib/models/ReflectionGroup", "ReflectionGroup")
  @js.native
  open class ReflectionGroup protected () extends StObject {
    /**
      * Create a new ReflectionGroup instance.
      *
      * @param title The title of this group.
      */
    def this(title: String) = this()
    
    /**
      * Do all children of this group have a separate document?
      */
    def allChildrenHaveOwnDocument(): Boolean = js.native
    
    /**
      * Categories contained within this group.
      */
    var categories: js.UndefOr[js.Array[ReflectionCategory]] = js.native
    
    /**
      * All reflections of this group.
      */
    var children: js.Array[DeclarationReflection] = js.native
    
    /**
      * The title, a string representation of the typescript kind, of this group.
      */
    var title: String = js.native
    
    def toObject(serializer: Serializer): typings.typedoc.schemaMod.ReflectionGroup = js.native
  }
}
