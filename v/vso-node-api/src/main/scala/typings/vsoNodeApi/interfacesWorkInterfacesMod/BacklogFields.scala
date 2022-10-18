package typings.vsoNodeApi.interfacesWorkInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BacklogFields extends StObject {
  
  /**
    * Field Type (e.g. Order, Activity) to Field Reference Name map
    */
  var typeFields: StringDictionary[String]
}
object BacklogFields {
  
  inline def apply(typeFields: StringDictionary[String]): BacklogFields = {
    val __obj = js.Dynamic.literal(typeFields = typeFields.asInstanceOf[js.Any])
    __obj.asInstanceOf[BacklogFields]
  }
  
  extension [Self <: BacklogFields](x: Self) {
    
    inline def setTypeFields(value: StringDictionary[String]): Self = StObject.set(x, "typeFields", value.asInstanceOf[js.Any])
  }
}
