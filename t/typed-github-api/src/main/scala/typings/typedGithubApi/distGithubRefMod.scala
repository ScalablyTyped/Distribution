package typings.typedGithubApi

import typings.typedGithubApi.distApiFetchMod.Options
import typings.typedGithubApi.distApiFetchMod.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distGithubRefMod {
  
  @JSImport("typed-github-api/dist/github-ref", "GitHubRef")
  @js.native
  open class GitHubRef protected ()
    extends StObject
       with OptionsOrRef {
    /* protected */ def this(options: OptionsOrRef) = this()
    
    def getAllPagesAsync[T](uri: String): js.Promise[js.Array[T] | Null] = js.native
    
    def getAsync[T](uri: String): js.Promise[Response[T] | Null] = js.native
    
    def getPreviewAsync[T](uri: String): js.Promise[Response[T] | Null] = js.native
    
    /* protected */ val options: Options = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.typedGithubApi.distApiFetchMod.Options
    - typings.typedGithubApi.distGithubRefMod.GitHubRef
  */
  trait OptionsOrRef extends StObject
}
