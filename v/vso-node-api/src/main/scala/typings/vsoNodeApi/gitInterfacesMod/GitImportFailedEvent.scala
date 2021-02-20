package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GitImportFailedEvent extends StObject {
  
  var sourceRepositoryName: String = js.native
  
  var targetRepository: GitRepository = js.native
}
object GitImportFailedEvent {
  
  @scala.inline
  def apply(sourceRepositoryName: String, targetRepository: GitRepository): GitImportFailedEvent = {
    val __obj = js.Dynamic.literal(sourceRepositoryName = sourceRepositoryName.asInstanceOf[js.Any], targetRepository = targetRepository.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitImportFailedEvent]
  }
  
  @scala.inline
  implicit class GitImportFailedEventMutableBuilder[Self <: GitImportFailedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSourceRepositoryName(value: String): Self = StObject.set(x, "sourceRepositoryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetRepository(value: GitRepository): Self = StObject.set(x, "targetRepository", value.asInstanceOf[js.Any])
  }
}
