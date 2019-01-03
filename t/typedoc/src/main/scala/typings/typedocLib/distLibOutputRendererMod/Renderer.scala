package typings
package typedocLib.distLibOutputRendererMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/output/renderer", "Renderer")
@js.native
class Renderer ()
  extends typedocLib.distLibUtilsComponentMod.ChildableComponent[
      typedocLib.distLibApplicationMod.Application, 
      typedocLib.distLibOutputComponentsMod.RendererComponent
    ] {
  var disableOutputCheck: scala.Boolean = js.native
  var entryPoint: java.lang.String = js.native
  var gaID: java.lang.String = js.native
  var gaSite: java.lang.String = js.native
  var hideGenerator: scala.Boolean = js.native
  var prepareOutputDirectory: js.Any = js.native
  var prepareTheme: js.Any = js.native
  var renderDocument: js.Any = js.native
  var theme: js.UndefOr[typedocLib.distLibOutputThemeMod.Theme] = js.native
  var themeName: java.lang.String = js.native
  var toc: js.Array[java.lang.String] = js.native
  def render(
    project: typedocLib.distLibModelsReflectionsProjectMod.ProjectReflection,
    outputDirectory: java.lang.String
  ): scala.Unit = js.native
}

@JSImport("typedoc/dist/lib/output/renderer", "Renderer")
@js.native
object Renderer extends js.Object {
  def getDefaultTheme(): java.lang.String = js.native
  def getThemeDirectory(): java.lang.String = js.native
}

