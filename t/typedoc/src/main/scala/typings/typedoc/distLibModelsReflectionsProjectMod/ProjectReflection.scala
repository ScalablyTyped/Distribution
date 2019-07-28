package typings.typedoc.distLibModelsReflectionsProjectMod

import org.scalablytyped.runtime.NumberDictionary
import typings.typedoc.distLibModelsReflectionsAbstractMod.Reflection
import typings.typedoc.distLibModelsReflectionsAbstractMod.ReflectionKind
import typings.typedoc.distLibModelsReflectionsContainerMod.ContainerReflection
import typings.typedoc.distLibModelsSourcesMod.SourceDirectory
import typings.typedoc.distLibModelsSourcesMod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/models/reflections/project", "ProjectReflection")
@js.native
class ProjectReflection protected () extends ContainerReflection {
  def this(name: String) = this()
  var directory: SourceDirectory = js.native
  var files: js.Array[SourceFile] = js.native
  var packageInfo: js.Any = js.native
  var readme: js.UndefOr[String] = js.native
  var reflections: NumberDictionary[Reflection] = js.native
  var symbolMapping: NumberDictionary[Double] = js.native
  def getReflectionsByKind(kind: ReflectionKind): js.Array[Reflection] = js.native
}

