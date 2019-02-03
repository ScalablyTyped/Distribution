package typings
package typedocLib.distLibApplicationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/application", "Application")
@js.native
class Application ()
  extends typedocLib.distLibUtilsComponentMod.ChildableComponent[Application, typedocLib.distLibUtilsComponentMod.AbstractComponent[Application]] {
  def this(options: js.Object) = this()
  var converter: typedocLib.distLibConverterMod.Converter = js.native
  var exclude: js.Array[java.lang.String] = js.native
  var ignoreCompilerErrors: scala.Boolean = js.native
  val isCLI: scala.Boolean = js.native
  var logger: typedocLib.distLibUtilsMod.Logger = js.native
  var loggerType: java.lang.String | js.Function = js.native
  var options: typedocLib.distLibUtilsOptionsMod.Options = js.native
  var plugins: typedocLib.distLibUtilsMod.PluginHost = js.native
  var renderer: typedocLib.distLibOutputRendererMod.Renderer = js.native
  var serializer: typedocLib.distLibSerializationMod.Serializer = js.native
  /* protected */ def bootstrap(): typedocLib.distLibUtilsOptionsOptionsMod.OptionsReadResult = js.native
  /* protected */ def bootstrap(options: js.Object): typedocLib.distLibUtilsOptionsOptionsMod.OptionsReadResult = js.native
  def convert(src: js.Array[java.lang.String]): js.UndefOr[typedocLib.distLibModelsMod.ProjectReflection] = js.native
  def expandInputFiles(): js.Array[java.lang.String] = js.native
  def expandInputFiles(inputFiles: js.Array[java.lang.String]): js.Array[java.lang.String] = js.native
  def generateDocs(project: typedocLib.distLibModelsMod.ProjectReflection, out: java.lang.String): scala.Boolean = js.native
  def generateDocs(src: js.Array[java.lang.String], out: java.lang.String): scala.Boolean = js.native
  def generateJson(project: typedocLib.distLibModelsMod.ProjectReflection, out: java.lang.String): scala.Boolean = js.native
  def generateJson(src: js.Array[java.lang.String], out: java.lang.String): scala.Boolean = js.native
  def getTypeScriptPath(): java.lang.String = js.native
  def getTypeScriptVersion(): java.lang.String = js.native
}

/* static members */
@JSImport("typedoc/dist/lib/application", "Application")
@js.native
object Application extends js.Object {
  var VERSION: java.lang.String = js.native
}

