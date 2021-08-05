package typings.typedGithubApi

import typings.moment.mod.Moment
import typings.typedGithubApi.interfacesUserMod.UserSummary
import typings.typedGithubApi.typedGithubApiStrings.closed
import typings.typedGithubApi.typedGithubApiStrings.open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interfacesMilestoneMod {
  
  trait Milestone extends StObject {
    
    var closed: js.UndefOr[Moment] = js.undefined
    
    var closedIssueCount: Double
    
    var created: Moment
    
    var creator: UserSummary
    
    var description: String
    
    var due: Moment
    
    var htmlUri: String
    
    var id: Double
    
    var number: Double
    
    var openIssueCount: Double
    
    var state: open | closed
    
    var title: String
    
    var updated: Moment
  }
  object Milestone {
    
    inline def apply(
      closedIssueCount: Double,
      created: Moment,
      creator: UserSummary,
      description: String,
      due: Moment,
      htmlUri: String,
      id: Double,
      number: Double,
      openIssueCount: Double,
      state: open | closed,
      title: String,
      updated: Moment
    ): Milestone = {
      val __obj = js.Dynamic.literal(closedIssueCount = closedIssueCount.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], creator = creator.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], due = due.asInstanceOf[js.Any], htmlUri = htmlUri.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], openIssueCount = openIssueCount.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
      __obj.asInstanceOf[Milestone]
    }
    
    extension [Self <: Milestone](x: Self) {
      
      inline def setClosed(value: Moment): Self = StObject.set(x, "closed", value.asInstanceOf[js.Any])
      
      inline def setClosedIssueCount(value: Double): Self = StObject.set(x, "closedIssueCount", value.asInstanceOf[js.Any])
      
      inline def setClosedUndefined: Self = StObject.set(x, "closed", js.undefined)
      
      inline def setCreated(value: Moment): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      inline def setCreator(value: UserSummary): Self = StObject.set(x, "creator", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDue(value: Moment): Self = StObject.set(x, "due", value.asInstanceOf[js.Any])
      
      inline def setHtmlUri(value: String): Self = StObject.set(x, "htmlUri", value.asInstanceOf[js.Any])
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setOpenIssueCount(value: Double): Self = StObject.set(x, "openIssueCount", value.asInstanceOf[js.Any])
      
      inline def setState(value: open | closed): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setUpdated(value: Moment): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    }
  }
}
