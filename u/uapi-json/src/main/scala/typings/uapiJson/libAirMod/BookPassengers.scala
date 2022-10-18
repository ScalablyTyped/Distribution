package typings.uapiJson.libAirMod

import typings.uapiJson.uapiJsonStrings.F
import typings.uapiJson.uapiJsonStrings.M
import typings.uapiJson.uapiJsonStrings.MISS
import typings.uapiJson.uapiJsonStrings.MR
import typings.uapiJson.uapiJsonStrings.MS
import typings.uapiJson.uapiJsonStrings.MSTR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BookPassengers extends StObject {
  
  var ageCategory: String
  
  var birthDate: String
  
  var firstName: String
  
  var gender: M | F
  
  var lastName: String
  
  var passCountry: String
  
  var passNumber: String
  
  var ssr: js.UndefOr[js.Array[SSR]] = js.undefined
  
  var title: MR | MS | MSTR | MISS
}
object BookPassengers {
  
  inline def apply(
    ageCategory: String,
    birthDate: String,
    firstName: String,
    gender: M | F,
    lastName: String,
    passCountry: String,
    passNumber: String,
    title: MR | MS | MSTR | MISS
  ): BookPassengers = {
    val __obj = js.Dynamic.literal(ageCategory = ageCategory.asInstanceOf[js.Any], birthDate = birthDate.asInstanceOf[js.Any], firstName = firstName.asInstanceOf[js.Any], gender = gender.asInstanceOf[js.Any], lastName = lastName.asInstanceOf[js.Any], passCountry = passCountry.asInstanceOf[js.Any], passNumber = passNumber.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[BookPassengers]
  }
  
  extension [Self <: BookPassengers](x: Self) {
    
    inline def setAgeCategory(value: String): Self = StObject.set(x, "ageCategory", value.asInstanceOf[js.Any])
    
    inline def setBirthDate(value: String): Self = StObject.set(x, "birthDate", value.asInstanceOf[js.Any])
    
    inline def setFirstName(value: String): Self = StObject.set(x, "firstName", value.asInstanceOf[js.Any])
    
    inline def setGender(value: M | F): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
    
    inline def setLastName(value: String): Self = StObject.set(x, "lastName", value.asInstanceOf[js.Any])
    
    inline def setPassCountry(value: String): Self = StObject.set(x, "passCountry", value.asInstanceOf[js.Any])
    
    inline def setPassNumber(value: String): Self = StObject.set(x, "passNumber", value.asInstanceOf[js.Any])
    
    inline def setSsr(value: js.Array[SSR]): Self = StObject.set(x, "ssr", value.asInstanceOf[js.Any])
    
    inline def setSsrUndefined: Self = StObject.set(x, "ssr", js.undefined)
    
    inline def setSsrVarargs(value: SSR*): Self = StObject.set(x, "ssr", js.Array(value*))
    
    inline def setTitle(value: MR | MS | MSTR | MISS): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
