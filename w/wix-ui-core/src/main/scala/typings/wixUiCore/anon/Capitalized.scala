package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Capitalized extends StObject {
  
  var capitalized: Am
  
  var lowercase: Am
  
  var uppercase: Am
}
object Capitalized {
  
  @scala.inline
  def apply(capitalized: Am, lowercase: Am, uppercase: Am): Capitalized = {
    val __obj = js.Dynamic.literal(capitalized = capitalized.asInstanceOf[js.Any], lowercase = lowercase.asInstanceOf[js.Any], uppercase = uppercase.asInstanceOf[js.Any])
    __obj.asInstanceOf[Capitalized]
  }
  
  @scala.inline
  implicit class CapitalizedMutableBuilder[Self <: Capitalized] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCapitalized(value: Am): Self = StObject.set(x, "capitalized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowercase(value: Am): Self = StObject.set(x, "lowercase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUppercase(value: Am): Self = StObject.set(x, "uppercase", value.asInstanceOf[js.Any])
  }
}
