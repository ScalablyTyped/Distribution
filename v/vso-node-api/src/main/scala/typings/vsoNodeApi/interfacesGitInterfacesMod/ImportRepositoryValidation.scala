package typings.vsoNodeApi.interfacesGitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportRepositoryValidation extends StObject {
  
  var gitSource: GitImportGitSource
  
  var password: String
  
  var tfvcSource: GitImportTfvcSource
  
  var username: String
}
object ImportRepositoryValidation {
  
  inline def apply(gitSource: GitImportGitSource, password: String, tfvcSource: GitImportTfvcSource, username: String): ImportRepositoryValidation = {
    val __obj = js.Dynamic.literal(gitSource = gitSource.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], tfvcSource = tfvcSource.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportRepositoryValidation]
  }
  
  extension [Self <: ImportRepositoryValidation](x: Self) {
    
    inline def setGitSource(value: GitImportGitSource): Self = StObject.set(x, "gitSource", value.asInstanceOf[js.Any])
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setTfvcSource(value: GitImportTfvcSource): Self = StObject.set(x, "tfvcSource", value.asInstanceOf[js.Any])
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
