package typings.typedoc

import typings.typedoc.distLibModelsReflectionCategoryMod.ReflectionCategory
import typings.typedoc.distLibModelsReflectionGroupMod.ReflectionGroup
import typings.typedoc.distLibModelsReflectionsAbstractMod.Reflection
import typings.typedoc.distLibModelsReflectionsDeclarationMod.DeclarationReflection
import typings.typedoc.distLibModelsReflectionsKindMod.ReflectionKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibModelsReflectionsContainerMod {
  
  @JSImport("typedoc/dist/lib/models/reflections/container", "ContainerReflection")
  @js.native
  open class ContainerReflection protected () extends Reflection {
    def this(name: String, kind: ReflectionKind) = this()
    def this(name: String, kind: ReflectionKind, parent: Reflection) = this()
    
    /**
      * All children grouped by their category.
      */
    var categories: js.UndefOr[js.Array[ReflectionCategory]] = js.native
    
    /**
      * The children of this reflection.
      */
    var children: js.UndefOr[js.Array[DeclarationReflection]] = js.native
    
    /**
      * Return a list of all children of a certain kind.
      *
      * @param kind  The desired kind of children.
      * @returns     An array containing all children with the desired kind.
      */
    def getChildrenByKind(kind: ReflectionKind): js.Array[DeclarationReflection] = js.native
    
    /**
      * All children grouped by their kind.
      */
    var groups: js.UndefOr[js.Array[ReflectionGroup]] = js.native
    
    /**
      * A precomputed boost derived from the searchCategoryBoosts and searchGroupBoosts options, used when
      * boosting search relevance scores at runtime. May be modified by plugins.
      */
    var relevanceBoost: js.UndefOr[Double] = js.native
  }
}
