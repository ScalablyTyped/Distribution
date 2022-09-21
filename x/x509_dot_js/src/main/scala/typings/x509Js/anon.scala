package typings.x509Js

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait CommonName extends StObject {
    
    var commonName: String
    
    var organizationalUnitName: js.UndefOr[String] = js.undefined
  }
  object CommonName {
    
    inline def apply(commonName: String): CommonName = {
      val __obj = js.Dynamic.literal(commonName = commonName.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommonName]
    }
    
    extension [Self <: CommonName](x: Self) {
      
      inline def setCommonName(value: String): Self = StObject.set(x, "commonName", value.asInstanceOf[js.Any])
      
      inline def setOrganizationalUnitName(value: String): Self = StObject.set(x, "organizationalUnitName", value.asInstanceOf[js.Any])
      
      inline def setOrganizationalUnitNameUndefined: Self = StObject.set(x, "organizationalUnitName", js.undefined)
    }
  }
  
  trait CountryName extends StObject {
    
    var commonName: String
    
    var countryName: js.UndefOr[String] = js.undefined
    
    var localityName: js.UndefOr[String] = js.undefined
    
    var organizationName: js.UndefOr[String] = js.undefined
    
    var organizationalUnitName: js.UndefOr[String] = js.undefined
    
    var serialNumber: js.UndefOr[String] = js.undefined
    
    var stateOrProvinceName: js.UndefOr[String] = js.undefined
  }
  object CountryName {
    
    inline def apply(commonName: String): CountryName = {
      val __obj = js.Dynamic.literal(commonName = commonName.asInstanceOf[js.Any])
      __obj.asInstanceOf[CountryName]
    }
    
    extension [Self <: CountryName](x: Self) {
      
      inline def setCommonName(value: String): Self = StObject.set(x, "commonName", value.asInstanceOf[js.Any])
      
      inline def setCountryName(value: String): Self = StObject.set(x, "countryName", value.asInstanceOf[js.Any])
      
      inline def setCountryNameUndefined: Self = StObject.set(x, "countryName", js.undefined)
      
      inline def setLocalityName(value: String): Self = StObject.set(x, "localityName", value.asInstanceOf[js.Any])
      
      inline def setLocalityNameUndefined: Self = StObject.set(x, "localityName", js.undefined)
      
      inline def setOrganizationName(value: String): Self = StObject.set(x, "organizationName", value.asInstanceOf[js.Any])
      
      inline def setOrganizationNameUndefined: Self = StObject.set(x, "organizationName", js.undefined)
      
      inline def setOrganizationalUnitName(value: String): Self = StObject.set(x, "organizationalUnitName", value.asInstanceOf[js.Any])
      
      inline def setOrganizationalUnitNameUndefined: Self = StObject.set(x, "organizationalUnitName", js.undefined)
      
      inline def setSerialNumber(value: String): Self = StObject.set(x, "serialNumber", value.asInstanceOf[js.Any])
      
      inline def setSerialNumberUndefined: Self = StObject.set(x, "serialNumber", js.undefined)
      
      inline def setStateOrProvinceName(value: String): Self = StObject.set(x, "stateOrProvinceName", value.asInstanceOf[js.Any])
      
      inline def setStateOrProvinceNameUndefined: Self = StObject.set(x, "stateOrProvinceName", js.undefined)
    }
  }
}
