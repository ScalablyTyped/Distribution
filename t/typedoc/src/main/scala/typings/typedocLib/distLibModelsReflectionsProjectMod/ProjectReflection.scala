package typings
package typedocLib.distLibModelsReflectionsProjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/models/reflections/project", "ProjectReflection")
@js.native
class ProjectReflection protected ()
  extends typedocLib.distLibModelsReflectionsContainerMod.ContainerReflection {
  def this(name: java.lang.String) = this()
  var directory: typedocLib.distLibModelsSourcesMod.SourceDirectory = js.native
  var files: js.Array[typedocLib.distLibModelsSourcesMod.SourceFile] = js.native
  var packageInfo: js.Any = js.native
  var readme: java.lang.String = js.native
  var reflections: ScalablyTyped.runtime.NumberDictionary[typedocLib.distLibModelsReflectionsAbstractMod.Reflection] = js.native
  var symbolMapping: ScalablyTyped.runtime.NumberDictionary[scala.Double] = js.native
  def getReflectionsByKind(kind: typedocLib.distLibModelsReflectionsAbstractMod.ReflectionKind): js.Array[typedocLib.distLibModelsReflectionsAbstractMod.Reflection] = js.native
}

