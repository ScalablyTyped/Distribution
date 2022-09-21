package typings.typedGithubApi

import typings.typedGithubApi.typedGithubApiStrings.closed
import typings.typedGithubApi.typedGithubApiStrings.open
import typings.typedGithubApi.userMod.UserSummary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object milestoneMod {
  
  trait Milestone extends StObject {
    
    var closed_at: js.Date | Null
    
    var closed_issues: Double
    
    var created_at: js.Date
    
    var creator: UserSummary
    
    var description: String
    
    var due_on: js.Date
    
    var html_url: String
    
    var id: Double
    
    var labels_url: String
    
    var number: Double
    
    var open_issues: Double
    
    var state: open | closed
    
    var title: String
    
    var updated_at: js.Date
    
    var url: String
  }
  object Milestone {
    
    inline def apply(
      closed_issues: Double,
      created_at: js.Date,
      creator: UserSummary,
      description: String,
      due_on: js.Date,
      html_url: String,
      id: Double,
      labels_url: String,
      number: Double,
      open_issues: Double,
      state: open | closed,
      title: String,
      updated_at: js.Date,
      url: String
    ): Milestone = {
      val __obj = js.Dynamic.literal(closed_issues = closed_issues.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], creator = creator.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], due_on = due_on.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], labels_url = labels_url.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], open_issues = open_issues.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], closed_at = null)
      __obj.asInstanceOf[Milestone]
    }
    
    extension [Self <: Milestone](x: Self) {
      
      inline def setClosed_at(value: js.Date): Self = StObject.set(x, "closed_at", value.asInstanceOf[js.Any])
      
      inline def setClosed_atNull: Self = StObject.set(x, "closed_at", null)
      
      inline def setClosed_issues(value: Double): Self = StObject.set(x, "closed_issues", value.asInstanceOf[js.Any])
      
      inline def setCreated_at(value: js.Date): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
      
      inline def setCreator(value: UserSummary): Self = StObject.set(x, "creator", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDue_on(value: js.Date): Self = StObject.set(x, "due_on", value.asInstanceOf[js.Any])
      
      inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLabels_url(value: String): Self = StObject.set(x, "labels_url", value.asInstanceOf[js.Any])
      
      inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setOpen_issues(value: Double): Self = StObject.set(x, "open_issues", value.asInstanceOf[js.Any])
      
      inline def setState(value: open | closed): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setUpdated_at(value: js.Date): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
