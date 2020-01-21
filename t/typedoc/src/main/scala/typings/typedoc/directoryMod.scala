package typings.typedoc

import org.scalablytyped.runtime.StringDictionary
import typings.typedoc.abstractMod.Reflection
import typings.typedoc.fileMod.SourceFile
import typings.typedoc.reflectionGroupMod.ReflectionGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/models/sources/directory", JSImport.Namespace)
@js.native
object directoryMod extends js.Object {
  @js.native
  class SourceDirectory () extends js.Object {
    def this(name: String) = this()
    def this(name: String, parent: SourceDirectory) = this()
    var dirName: js.UndefOr[String] = js.native
    var directories: StringDictionary[SourceDirectory] = js.native
    var files: js.Array[SourceFile] = js.native
    var groups: js.UndefOr[js.Array[ReflectionGroup]] = js.native
    var name: js.UndefOr[String] = js.native
    var parent: js.UndefOr[SourceDirectory] = js.native
    var url: js.UndefOr[String] = js.native
    def getAllReflections(): js.Array[Reflection] = js.native
    def toString(indent: String): String = js.native
  }
  
}

