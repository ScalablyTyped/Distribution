package typings.typedoc.distLibConverterPluginsMod

import typings.typedoc.distLibModelsReflectionGroupMod.ReflectionGroup
import typings.typedoc.distLibModelsReflectionsAbstractMod.ReflectionKind
import typings.typedoc.distLibModelsReflectionsMod.Reflection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/plugins", "GroupPlugin")
@js.native
class GroupPlugin ()
  extends typings.typedoc.distLibConverterPluginsGroupPluginMod.GroupPlugin

/* static members */
@JSImport("typedoc/dist/lib/converter/plugins", "GroupPlugin")
@js.native
object GroupPlugin extends js.Object {
  var WEIGHTS: js.Array[ReflectionKind] = js.native
  var getKindString: js.Any = js.native
  def getKindPlural(kind: ReflectionKind): String = js.native
  def getKindSingular(kind: ReflectionKind): String = js.native
  def getReflectionGroups(reflections: js.Array[Reflection]): js.Array[ReflectionGroup] = js.native
  def sortCallback(a: Reflection, b: Reflection): Double = js.native
}

