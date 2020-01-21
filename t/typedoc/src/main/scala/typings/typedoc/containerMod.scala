package typings.typedoc

import typings.typedoc.abstractMod.Reflection
import typings.typedoc.abstractMod.ReflectionKind
import typings.typedoc.reflectionCategoryMod.ReflectionCategory
import typings.typedoc.reflectionGroupMod.ReflectionGroup
import typings.typedoc.reflectionsDeclarationMod.DeclarationReflection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/models/reflections/container", JSImport.Namespace)
@js.native
object containerMod extends js.Object {
  @js.native
  class ContainerReflection () extends Reflection {
    var categories: js.UndefOr[js.Array[ReflectionCategory]] = js.native
    var children: js.UndefOr[js.Array[DeclarationReflection]] = js.native
    var groups: js.UndefOr[js.Array[ReflectionGroup]] = js.native
    def getChildrenByKind(kind: ReflectionKind): js.Array[DeclarationReflection] = js.native
  }
  
}

