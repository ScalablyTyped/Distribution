package typings.typedoc

import typings.typedoc.applicationMod.Application
import typings.typedoc.componentMod.ChildableComponent
import typings.typedoc.outputComponentsMod.RendererComponent
import typings.typedoc.projectMod.ProjectReflection
import typings.typedoc.themeMod.Theme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/output/renderer", JSImport.Namespace)
@js.native
object rendererMod extends js.Object {
  
  @js.native
  class Renderer () extends ChildableComponent[Application, RendererComponent] {
    
    var disableOutputCheck: Boolean = js.native
    
    var entryPoint: String = js.native
    
    var gaID: String = js.native
    
    var gaSite: String = js.native
    
    var hideGenerator: Boolean = js.native
    
    var prepareOutputDirectory: js.Any = js.native
    
    var prepareTheme: js.Any = js.native
    
    def render(project: ProjectReflection, outputDirectory: String): Unit = js.native
    
    var renderDocument: js.Any = js.native
    
    var theme: js.UndefOr[Theme] = js.native
    
    var themeName: String = js.native
    
    var toc: js.Array[String] = js.native
  }
  /* static members */
  @js.native
  object Renderer extends js.Object {
    
    def getDefaultTheme(): String = js.native
    
    def getThemeDirectory(): String = js.native
  }
}
