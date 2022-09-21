package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GitUserDate extends StObject {
  
  /**
    * Date of the Git operation.
    */
  var date: js.Date
  
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
  
  inline def apply(date: js.Date, email: String, name: String): GitUserDate = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitUserDate]
  }
  
  extension [Self <: GitUserDate](x: Self) {
    
    inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
