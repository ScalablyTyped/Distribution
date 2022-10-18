package typings.typedoc

import typings.typedoc.distLibModelsMod.DeclarationReflection
import typings.typedoc.distLibModelsReflectionCategoryMod.ReflectionCategory
import typings.typedoc.distLibSerializationMod.Serializer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibModelsReflectionGroupMod {
  
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
    
    def toObject(serializer: Serializer): typings.typedoc.distLibSerializationSchemaMod.ReflectionGroup = js.native
  }
}
