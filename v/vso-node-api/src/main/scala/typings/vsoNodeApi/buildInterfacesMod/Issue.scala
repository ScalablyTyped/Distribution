package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Issue extends StObject {
  
  /**
    * The category.
    */
  var category: String = js.native
  
  var data: StringDictionary[String] = js.native
  
  /**
    * A description of the issue.
    */
  var message: String = js.native
  
  /**
    * The type (error, warning) of the issue.
    */
  var `type`: IssueType = js.native
}
object Issue {
  
  @scala.inline
  def apply(category: String, data: StringDictionary[String], message: String, `type`: IssueType): Issue = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Issue]
  }
  
  @scala.inline
  implicit class IssueMutableBuilder[Self <: Issue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: StringDictionary[String]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: IssueType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
