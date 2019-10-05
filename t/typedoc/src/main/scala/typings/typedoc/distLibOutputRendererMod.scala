package typings.typedoc

import typings.typedoc.distLibApplicationMod.Application
import typings.typedoc.distLibModelsReflectionsProjectMod.ProjectReflection
import typings.typedoc.distLibOutputComponentsMod.RendererComponent
import typings.typedoc.distLibOutputThemeMod.Theme
import typings.typedoc.distLibUtilsComponentMod.ChildableComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/output/renderer", JSImport.Namespace)
@js.native
object distLibOutputRendererMod extends js.Object {
  @js.native
  class Renderer () extends ChildableComponent[Application, RendererComponent] {
    var disableOutputCheck: Boolean = js.native
    var entryPoint: String = js.native
    var gaID: String = js.native
    var gaSite: String = js.native
    var hideGenerator: Boolean = js.native
    var prepareOutputDirectory: js.Any = js.native
    var prepareTheme: js.Any = js.native
    var renderDocument: js.Any = js.native
    var theme: js.UndefOr[Theme] = js.native
    var themeName: String = js.native
    var toc: js.Array[String] = js.native
    def render(project: ProjectReflection, outputDirectory: String): Unit = js.native
  }
  
  /* static members */
  @js.native
  object Renderer extends js.Object {
    def getDefaultTheme(): String = js.native
    def getThemeDirectory(): String = js.native
  }
  
}

