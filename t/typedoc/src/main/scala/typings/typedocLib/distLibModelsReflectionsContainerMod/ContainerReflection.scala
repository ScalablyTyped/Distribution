package typings
package typedocLib.distLibModelsReflectionsContainerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/models/reflections/container", "ContainerReflection")
@js.native
class ContainerReflection ()
  extends typedocLib.distLibModelsReflectionsAbstractMod.Reflection {
  var categories: js.UndefOr[js.Array[typedocLib.distLibModelsReflectionCategoryMod.ReflectionCategory]] = js.native
  var children: js.UndefOr[
    js.Array[typedocLib.distLibModelsReflectionsDeclarationMod.DeclarationReflection]
  ] = js.native
  var groups: js.UndefOr[js.Array[typedocLib.distLibModelsReflectionGroupMod.ReflectionGroup]] = js.native
  def getChildrenByKind(kind: typedocLib.distLibModelsReflectionsAbstractMod.ReflectionKind): js.Array[typedocLib.distLibModelsReflectionsDeclarationMod.DeclarationReflection] = js.native
}

