package typings.swellJs

import typings.swellJs.mod.PurchaseOptions
import typings.swellJs.swellJsBooleans.`true`
import typings.swellJs.swellJsStrings.Size
import typings.swellJs.swellJsStrings.select
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Active extends StObject {
    
    var active: `true`
    
    var description: Null
    
    var id: String
    
    var inputType: select
    
    var name: Size
    
    var required: `true`
    
    var values: js.Array[Description]
    
    var variant: `true`
  }
  object Active {
    
    inline def apply(description: Null, id: String, values: js.Array[Description]): Active = {
      val __obj = js.Dynamic.literal(active = true, description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inputType = "select", name = "Size", required = true, values = values.asInstanceOf[js.Any], variant = true)
      __obj.asInstanceOf[Active]
    }
    
    extension [Self <: Active](x: Self) {
      
      inline def setActive(value: `true`): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: Null): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setInputType(value: select): Self = StObject.set(x, "inputType", value.asInstanceOf[js.Any])
      
      inline def setName(value: Size): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRequired(value: `true`): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setValues(value: js.Array[Description]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesVarargs(value: Description*): Self = StObject.set(x, "values", js.Array(value*))
      
      inline def setVariant(value: `true`): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    }
  }
  
  trait Description extends StObject {
    
    var description: Null
    
    var id: String
    
    var name: String
    
    var price: Null
    
    var shipmentWeight: Null
  }
  object Description {
    
    inline def apply(description: Null, id: String, name: String, price: Null, shipmentWeight: Null): Description = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], shipmentWeight = shipmentWeight.asInstanceOf[js.Any])
      __obj.asInstanceOf[Description]
    }
    
    extension [Self <: Description](x: Self) {
      
      inline def setDescription(value: Null): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPrice(value: Null): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
      
      inline def setShipmentWeight(value: Null): Self = StObject.set(x, "shipmentWeight", value.asInstanceOf[js.Any])
    }
  }
  
  trait End extends StObject {
    
    var end: Double
    
    var start: Double
  }
  object End {
    
    inline def apply(end: Double, start: Double): End = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[End]
    }
    
    extension [Self <: End](x: Self) {
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  trait Id extends StObject {
    
    var description: Null
    
    var id: String
    
    var name: String
    
    var price: Null
    
    var shipment_weight: Null
  }
  object Id {
    
    inline def apply(description: Null, id: String, name: String, price: Null, shipment_weight: Null): Id = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], shipment_weight = shipment_weight.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    extension [Self <: Id](x: Self) {
      
      inline def setDescription(value: Null): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPrice(value: Null): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
      
      inline def setShipment_weight(value: Null): Self = StObject.set(x, "shipment_weight", value.asInstanceOf[js.Any])
    }
  }
  
  trait Inputtype extends StObject {
    
    var active: `true`
    
    var description: Null
    
    var id: String
    
    var input_type: select
    
    var name: Size
    
    var required: `true`
    
    var values: js.Array[Id]
    
    var variant: `true`
  }
  object Inputtype {
    
    inline def apply(description: Null, id: String, values: js.Array[Id]): Inputtype = {
      val __obj = js.Dynamic.literal(active = true, description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], input_type = "select", name = "Size", required = true, values = values.asInstanceOf[js.Any], variant = true)
      __obj.asInstanceOf[Inputtype]
    }
    
    extension [Self <: Inputtype](x: Self) {
      
      inline def setActive(value: `true`): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: Null): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setInput_type(value: select): Self = StObject.set(x, "input_type", value.asInstanceOf[js.Any])
      
      inline def setName(value: Size): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRequired(value: `true`): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setValues(value: js.Array[Id]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesVarargs(value: Id*): Self = StObject.set(x, "values", js.Array(value*))
      
      inline def setVariant(value: `true`): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    }
  }
  
  trait Planid extends StObject {
    
    var plan_id: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[PurchaseOptions] = js.undefined
  }
  object Planid {
    
    inline def apply(): Planid = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Planid]
    }
    
    extension [Self <: Planid](x: Self) {
      
      inline def setPlan_id(value: String): Self = StObject.set(x, "plan_id", value.asInstanceOf[js.Any])
      
      inline def setPlan_idUndefined: Self = StObject.set(x, "plan_id", js.undefined)
      
      inline def setType(value: PurchaseOptions): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
