package typings
package typedocLib.distLibConverterPluginsGroupPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/plugins/GroupPlugin", "GroupPlugin")
@js.native
class GroupPlugin ()
  extends typedocLib.distLibConverterComponentsMod.ConverterComponent {
  var onEndResolve: js.Any = js.native
  var onResolve: js.Any = js.native
}

@JSImport("typedoc/dist/lib/converter/plugins/GroupPlugin", "GroupPlugin")
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

