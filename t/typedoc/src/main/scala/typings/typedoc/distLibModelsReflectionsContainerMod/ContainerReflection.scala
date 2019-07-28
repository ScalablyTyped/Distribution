package typings.typedoc.distLibModelsReflectionsContainerMod

import typings.typedoc.distLibModelsReflectionCategoryMod.ReflectionCategory
import typings.typedoc.distLibModelsReflectionGroupMod.ReflectionGroup
import typings.typedoc.distLibModelsReflectionsAbstractMod.Reflection
import typings.typedoc.distLibModelsReflectionsAbstractMod.ReflectionKind
import typings.typedoc.distLibModelsReflectionsDeclarationMod.DeclarationReflection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/models/reflections/container", "ContainerReflection")
@js.native
class ContainerReflection () extends Reflection {
  var categories: js.UndefOr[js.Array[ReflectionCategory]] = js.native
  var children: js.UndefOr[js.Array[DeclarationReflection]] = js.native
  var groups: js.UndefOr[js.Array[ReflectionGroup]] = js.native
  def getChildrenByKind(kind: ReflectionKind): js.Array[DeclarationReflection] = js.native
}

