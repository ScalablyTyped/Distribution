package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GitImportFailedEvent extends StObject {
  
  var sourceRepositoryName: String
  
  var targetRepository: GitRepository
}
object GitImportFailedEvent {
  
  inline def apply(sourceRepositoryName: String, targetRepository: GitRepository): GitImportFailedEvent = {
    val __obj = js.Dynamic.literal(sourceRepositoryName = sourceRepositoryName.asInstanceOf[js.Any], targetRepository = targetRepository.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitImportFailedEvent]
  }
  
  extension [Self <: GitImportFailedEvent](x: Self) {
    
    inline def setSourceRepositoryName(value: String): Self = StObject.set(x, "sourceRepositoryName", value.asInstanceOf[js.Any])
    
    inline def setTargetRepository(value: GitRepository): Self = StObject.set(x, "targetRepository", value.asInstanceOf[js.Any])
  }
}
