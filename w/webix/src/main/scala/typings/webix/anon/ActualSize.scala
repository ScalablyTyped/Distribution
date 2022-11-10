package typings.webix.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActualSize extends StObject {
  
  var actualSize: String
  
  var automaticZoom: String
  
  var enterPassword: String
  
  var of: String
  
  var pageFit: String
  
  var pageHeight: String
  
  var pageWidth: String
  
  var passwordError: String
}
object ActualSize {
  
  inline def apply(
    actualSize: String,
    automaticZoom: String,
    enterPassword: String,
    of: String,
    pageFit: String,
    pageHeight: String,
    pageWidth: String,
    passwordError: String
  ): ActualSize = {
    val __obj = js.Dynamic.literal(actualSize = actualSize.asInstanceOf[js.Any], automaticZoom = automaticZoom.asInstanceOf[js.Any], enterPassword = enterPassword.asInstanceOf[js.Any], of = of.asInstanceOf[js.Any], pageFit = pageFit.asInstanceOf[js.Any], pageHeight = pageHeight.asInstanceOf[js.Any], pageWidth = pageWidth.asInstanceOf[js.Any], passwordError = passwordError.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActualSize]
  }
  
  extension [Self <: ActualSize](x: Self) {
    
    inline def setActualSize(value: String): Self = StObject.set(x, "actualSize", value.asInstanceOf[js.Any])
    
    inline def setAutomaticZoom(value: String): Self = StObject.set(x, "automaticZoom", value.asInstanceOf[js.Any])
    
    inline def setEnterPassword(value: String): Self = StObject.set(x, "enterPassword", value.asInstanceOf[js.Any])
    
    inline def setOf(value: String): Self = StObject.set(x, "of", value.asInstanceOf[js.Any])
    
    inline def setPageFit(value: String): Self = StObject.set(x, "pageFit", value.asInstanceOf[js.Any])
    
    inline def setPageHeight(value: String): Self = StObject.set(x, "pageHeight", value.asInstanceOf[js.Any])
    
    inline def setPageWidth(value: String): Self = StObject.set(x, "pageWidth", value.asInstanceOf[js.Any])
    
    inline def setPasswordError(value: String): Self = StObject.set(x, "passwordError", value.asInstanceOf[js.Any])
  }
}
