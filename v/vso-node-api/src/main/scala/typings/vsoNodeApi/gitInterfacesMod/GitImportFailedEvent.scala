package typings.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GitImportFailedEvent extends js.Object {
  
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
  implicit class GitImportFailedEventOps[Self <: GitImportFailedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSourceRepositoryName(value: String): Self = this.set("sourceRepositoryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetRepository(value: GitRepository): Self = this.set("targetRepository", value.asInstanceOf[js.Any])
  }
}
