package typings.vsoNodeApi.gitInterfacesMod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GitUserDate extends StObject {
  
  /**
    * Date of the Git operation.
    */
  var date: Date
  
  /**
    * Email address of the user performing the Git operation.
    */
  var email: String
  
  /**
    * Name of the user performing the Git operation.
    */
  var name: String
}
object GitUserDate {
  
  @scala.inline
  def apply(date: Date, email: String, name: String): GitUserDate = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitUserDate]
  }
  
  @scala.inline
  implicit class GitUserDateMutableBuilder[Self <: GitUserDate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDate(value: Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
