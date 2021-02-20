package typings.vegaTypings.anon

import typings.vegaTypings.vegaTypingsStrings.topojson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Property extends StObject {
  
  var property: js.UndefOr[String] = js.native
  
  var `type`: topojson = js.native
}
object Property {
  
  @scala.inline
  def apply(`type`: topojson): Property = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Property]
  }
  
  @scala.inline
  implicit class PropertyMutableBuilder[Self <: Property] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
    
    @scala.inline
    def setType(value: topojson): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
