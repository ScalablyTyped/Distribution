package typings.vsoNodeApi.interfacesWorkInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardSettings extends StObject {
  
  /**
    * A collection of settings related to rendering of fields on cards
    */
  var fields: CardFieldSettings
}
object CardSettings {
  
  inline def apply(fields: CardFieldSettings): CardSettings = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardSettings]
  }
  
  extension [Self <: CardSettings](x: Self) {
    
    inline def setFields(value: CardFieldSettings): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
  }
}
