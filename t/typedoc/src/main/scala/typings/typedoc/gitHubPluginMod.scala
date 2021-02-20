package typings.typedoc

import typings.typedoc.componentsMod.ConverterComponent
import typings.typedoc.converterConverterMod.Converter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gitHubPluginMod {
  
  @JSImport("typedoc/dist/lib/converter/plugins/GitHubPlugin", "GitHubPlugin")
  @js.native
  class GitHubPlugin protected () extends ConverterComponent {
    def this(owner: js.Symbol) = this()
    def this(owner: Converter) = this()
    
    var getRepository: js.Any = js.native
    
    val gitRemote: String = js.native
    
    val gitRevision: String = js.native
    
    var ignoredPaths: js.Any = js.native
    
    var onEndResolve: js.Any = js.native
    
    var repositories: js.Any = js.native
  }
  
  @JSImport("typedoc/dist/lib/converter/plugins/GitHubPlugin", "Repository")
  @js.native
  class Repository protected () extends StObject {
    def this(path: String, gitRevision: String, repoLinks: js.Array[String]) = this()
    
    var branch: String = js.native
    
    def contains(fileName: String): Boolean = js.native
    
    var files: js.Array[String] = js.native
    
    def getGitHubURL(fileName: String): js.UndefOr[String] = js.native
    
    var gitHubHostname: String = js.native
    
    var gitHubProject: js.UndefOr[String] = js.native
    
    var gitHubUser: js.UndefOr[String] = js.native
    
    var path: String = js.native
  }
  /* static members */
  object Repository {
    
    @JSImport("typedoc/dist/lib/converter/plugins/GitHubPlugin", "Repository.tryCreateRepository")
    @js.native
    def tryCreateRepository(path: String, gitRevision: String, gitRemote: String): js.UndefOr[Repository] = js.native
  }
}
