package typings
package typedocLib.distLibModelsSourcesFileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/models/sources/file", "SourceFile")
@js.native
class SourceFile protected () extends js.Object {
  def this(fullFileName: java.lang.String) = this()
  var categories: js.UndefOr[js.Array[typedocLib.distLibModelsReflectionCategoryMod.ReflectionCategory]] = js.native
  var fileName: java.lang.String = js.native
  var fullFileName: java.lang.String = js.native
  var groups: js.UndefOr[js.Array[typedocLib.distLibModelsReflectionGroupMod.ReflectionGroup]] = js.native
  var name: java.lang.String = js.native
  var parent: js.UndefOr[typedocLib.distLibModelsSourcesDirectoryMod.SourceDirectory] = js.native
  var reflections: js.Array[typedocLib.distLibModelsReflectionsAbstractMod.Reflection] = js.native
  var url: js.UndefOr[java.lang.String] = js.native
}

