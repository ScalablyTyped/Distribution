package typings
package typedocLib.distLibModelsSourcesDirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/models/sources/directory", "SourceDirectory")
@js.native
class SourceDirectory () extends js.Object {
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, parent: SourceDirectory) = this()
  var categories: js.UndefOr[js.Array[typedocLib.distLibModelsReflectionCategoryMod.ReflectionCategory]] = js.native
  var dirName: js.UndefOr[java.lang.String] = js.native
  var directories: org.scalablytyped.runtime.StringDictionary[SourceDirectory] = js.native
  var files: js.Array[typedocLib.distLibModelsSourcesFileMod.SourceFile] = js.native
  var groups: js.UndefOr[js.Array[typedocLib.distLibModelsReflectionGroupMod.ReflectionGroup]] = js.native
  var name: js.UndefOr[java.lang.String] = js.native
  var parent: js.UndefOr[SourceDirectory] = js.native
  var url: js.UndefOr[java.lang.String] = js.native
  def getAllReflections(): js.Array[typedocLib.distLibModelsReflectionsAbstractMod.Reflection] = js.native
  def toString(indent: java.lang.String): java.lang.String = js.native
}

