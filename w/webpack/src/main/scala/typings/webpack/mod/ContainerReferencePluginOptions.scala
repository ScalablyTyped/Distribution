package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainerReferencePluginOptions extends StObject {
  
  /**
  	 * The external type of the remote containers.
  	 */
  var remoteType: ExternalsType
  
  /**
  	 * Container locations and request scopes from which modules should be resolved and loaded at runtime. When provided, property name is used as request scope, otherwise request scope is automatically inferred from container location.
  	 */
  var remotes: Remotes
  
  /**
  	 * The name of the share scope shared with all remotes (defaults to 'default').
  	 */
  var shareScope: js.UndefOr[String] = js.undefined
}
object ContainerReferencePluginOptions {
  
  inline def apply(remoteType: ExternalsType, remotes: Remotes): ContainerReferencePluginOptions = {
    val __obj = js.Dynamic.literal(remoteType = remoteType.asInstanceOf[js.Any], remotes = remotes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerReferencePluginOptions]
  }
  
  extension [Self <: ContainerReferencePluginOptions](x: Self) {
    
    inline def setRemoteType(value: ExternalsType): Self = StObject.set(x, "remoteType", value.asInstanceOf[js.Any])
    
    inline def setRemotes(value: Remotes): Self = StObject.set(x, "remotes", value.asInstanceOf[js.Any])
    
    inline def setRemotesVarargs(value: (String | RemotesObject)*): Self = StObject.set(x, "remotes", js.Array(value*))
    
    inline def setShareScope(value: String): Self = StObject.set(x, "shareScope", value.asInstanceOf[js.Any])
    
    inline def setShareScopeUndefined: Self = StObject.set(x, "shareScope", js.undefined)
  }
}
