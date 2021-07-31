package typings.tslint.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Properties extends StObject {
  
  var properties: Existence
}
object Properties {
  
  @scala.inline
  def apply(properties: Existence): Properties = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[Properties]
  }
  
  @scala.inline
  implicit class PropertiesMutableBuilder[Self <: Properties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProperties(value: Existence): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
  }
}
