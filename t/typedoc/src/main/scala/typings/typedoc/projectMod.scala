package typings.typedoc

import org.scalablytyped.runtime.NumberDictionary
import typings.typedoc.abstractMod.Reflection
import typings.typedoc.abstractMod.ReflectionKind
import typings.typedoc.containerMod.ContainerReflection
import typings.typedoc.sourcesMod.SourceDirectory
import typings.typedoc.sourcesMod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/models/reflections/project", JSImport.Namespace)
@js.native
object projectMod extends js.Object {
  @js.native
  class ProjectReflection protected () extends ContainerReflection {
    def this(name: String) = this()
    var directory: SourceDirectory = js.native
    var files: js.Array[SourceFile] = js.native
    var fqnToReflectionIdMap: js.Any = js.native
    var getReferenceGraph: js.Any = js.native
    var packageInfo: js.Any = js.native
    var readme: js.UndefOr[String] = js.native
    var referenceGraph: js.UndefOr[js.Any] = js.native
    var reflectionToSymbolIdMap: js.Any = js.native
    var reflections: NumberDictionary[Reflection] = js.native
    var symbolIdToReflectionIdMap: js.Any = js.native
    def getDanglingReferences(): js.Array[String] = js.native
    def getReflectionById(id: Double): js.UndefOr[Reflection] = js.native
    def getReflectionFromFQN(fqn: String): js.UndefOr[Reflection] = js.native
    def getReflectionsByKind(kind: ReflectionKind): js.Array[Reflection] = js.native
    def registerReflection(reflection: Reflection): Unit = js.native
    def registerReflection(reflection: Reflection, fqn: String): Unit = js.native
    def removeReflection(reflection: Reflection): Unit = js.native
    def removeReflection(reflection: Reflection, removeReferences: Boolean): Unit = js.native
  }
  
}

