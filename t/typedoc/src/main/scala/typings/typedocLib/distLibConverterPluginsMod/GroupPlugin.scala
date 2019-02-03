package typings
package typedocLib.distLibConverterPluginsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/plugins", "GroupPlugin")
@js.native
class GroupPlugin ()
  extends typedocLib.distLibConverterPluginsGroupPluginMod.GroupPlugin

/* static members */
@JSImport("typedoc/dist/lib/converter/plugins", "GroupPlugin")
@js.native
object GroupPlugin extends js.Object {
  var WEIGHTS: js.Array[typedocLib.distLibModelsReflectionsAbstractMod.ReflectionKind] = js.native
  var getKindString: js.Any = js.native
  def getKindPlural(kind: typedocLib.distLibModelsReflectionsAbstractMod.ReflectionKind): java.lang.String = js.native
  def getKindSingular(kind: typedocLib.distLibModelsReflectionsAbstractMod.ReflectionKind): java.lang.String = js.native
  def getReflectionGroups(reflections: js.Array[typedocLib.distLibModelsReflectionsMod.Reflection]): js.Array[typedocLib.distLibModelsReflectionGroupMod.ReflectionGroup] = js.native
  def sortCallback(
    a: typedocLib.distLibModelsReflectionsMod.Reflection,
    b: typedocLib.distLibModelsReflectionsMod.Reflection
  ): scala.Double = js.native
}

