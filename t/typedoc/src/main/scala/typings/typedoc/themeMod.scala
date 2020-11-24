package typings.typedoc

import typings.typedoc.componentMod.AbstractComponent
import typings.typedoc.navigationItemMod.NavigationItem
import typings.typedoc.projectMod.ProjectReflection
import typings.typedoc.rendererMod.Renderer
import typings.typedoc.resourcesMod.Resources
import typings.typedoc.urlMappingMod.UrlMapping
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/output/theme", JSImport.Namespace)
@js.native
object themeMod extends js.Object {
  
  @js.native
  abstract class Theme protected () extends AbstractComponent[Renderer] {
    def this(renderer: Renderer, basePath: String) = this()
    
    var basePath: String = js.native
    
    def getNavigation(project: ProjectReflection): NavigationItem = js.native
    
    def getUrls(project: ProjectReflection): js.Array[UrlMapping] = js.native
    
    def isOutputDirectory(path: String): Boolean = js.native
    
    var resources: Resources = js.native
  }
}
