package typings.vsoNodeApi.interfacesGitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GitImportSucceededEvent extends StObject {
  
  var sourceRepositoryName: String
  
  var targetRepository: GitRepository
}
object GitImportSucceededEvent {
  
  inline def apply(sourceRepositoryName: String, targetRepository: GitRepository): GitImportSucceededEvent = {
    val __obj = js.Dynamic.literal(sourceRepositoryName = sourceRepositoryName.asInstanceOf[js.Any], targetRepository = targetRepository.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitImportSucceededEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GitImportSucceededEvent] (val x: Self) extends AnyVal {
    
    inline def setSourceRepositoryName(value: String): Self = StObject.set(x, "sourceRepositoryName", value.asInstanceOf[js.Any])
    
    inline def setTargetRepository(value: GitRepository): Self = StObject.set(x, "targetRepository", value.asInstanceOf[js.Any])
  }
}
