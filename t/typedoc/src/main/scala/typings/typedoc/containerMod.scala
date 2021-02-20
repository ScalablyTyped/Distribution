package typings.typedoc

import typings.typedoc.abstractMod.Reflection
import typings.typedoc.abstractMod.ReflectionKind
import typings.typedoc.reflectionCategoryMod.ReflectionCategory
import typings.typedoc.reflectionGroupMod.ReflectionGroup
import typings.typedoc.reflectionsDeclarationMod.DeclarationReflection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object containerMod {
  
  @JSImport("typedoc/dist/lib/models/reflections/container", "ContainerReflection")
  @js.native
  class ContainerReflection protected () extends Reflection {
    def this(name: String, kind: ReflectionKind) = this()
    def this(name: String, kind: ReflectionKind, parent: Reflection) = this()
    
    var categories: js.UndefOr[js.Array[ReflectionCategory]] = js.native
    
    var children: js.UndefOr[js.Array[DeclarationReflection]] = js.native
    
    def getChildrenByKind(kind: ReflectionKind): js.Array[DeclarationReflection] = js.native
    
    var groups: js.UndefOr[js.Array[ReflectionGroup]] = js.native
  }
}
