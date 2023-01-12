package typings.swellJs

import typings.swellJs.mod.ProductCamelCase
import typings.swellJs.mod.ProductSnakeCase
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Active] (val x: Self) extends AnyVal {
      
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
  
  trait ContentType_ extends StObject {
    
    var contentType: String
    
    var dateUploaded: String
    
    var filename: String | Null
    
    var height: Double
    
    var id: String
    
    var length: Double
    
    var md5: String
    
    var metadata: Any
    
    var url: String
    
    var width: Double
  }
  object ContentType_ {
    
    inline def apply(
      contentType: String,
      dateUploaded: String,
      height: Double,
      id: String,
      length: Double,
      md5: String,
      metadata: Any,
      url: String,
      width: Double
    ): ContentType_ = {
      val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], dateUploaded = dateUploaded.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], md5 = md5.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], filename = null)
      __obj.asInstanceOf[ContentType_]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ContentType_] (val x: Self) extends AnyVal {
      
      inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      inline def setDateUploaded(value: String): Self = StObject.set(x, "dateUploaded", value.asInstanceOf[js.Any])
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameNull: Self = StObject.set(x, "filename", null)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setMd5(value: String): Self = StObject.set(x, "md5", value.asInstanceOf[js.Any])
      
      inline def setMetadata(value: Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait Contenttype extends StObject {
    
    var content_type: String
    
    var date_uploaded: String
    
    var filename: js.UndefOr[String | Null] = js.undefined
    
    var height: Double
    
    var id: String
    
    var length: Double
    
    var md5: String
    
    var metadata: Any
    
    var url: String
    
    var width: Double
  }
  object Contenttype {
    
    inline def apply(
      content_type: String,
      date_uploaded: String,
      height: Double,
      id: String,
      length: Double,
      md5: String,
      metadata: Any,
      url: String,
      width: Double
    ): Contenttype = {
      val __obj = js.Dynamic.literal(content_type = content_type.asInstanceOf[js.Any], date_uploaded = date_uploaded.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], md5 = md5.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Contenttype]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Contenttype] (val x: Self) extends AnyVal {
      
      inline def setContent_type(value: String): Self = StObject.set(x, "content_type", value.asInstanceOf[js.Any])
      
      inline def setDate_uploaded(value: String): Self = StObject.set(x, "date_uploaded", value.asInstanceOf[js.Any])
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameNull: Self = StObject.set(x, "filename", null)
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setMd5(value: String): Self = StObject.set(x, "md5", value.asInstanceOf[js.Any])
      
      inline def setMetadata(value: Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait Count extends StObject {
    
    var count: Double
    
    var results: js.Array[ProductCamelCase]
  }
  object Count {
    
    inline def apply(count: Double, results: js.Array[ProductCamelCase]): Count = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
      __obj.asInstanceOf[Count]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Count] (val x: Self) extends AnyVal {
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setResults(value: js.Array[ProductCamelCase]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      inline def setResultsVarargs(value: ProductCamelCase*): Self = StObject.set(x, "results", js.Array(value*))
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Description] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: End] (val x: Self) extends AnyVal {
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  trait Id extends StObject {
    
    var id: String
    
    var productId: String
  }
  object Id {
    
    inline def apply(id: String, productId: String): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], productId = productId.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    }
  }
  
  trait Inputtype extends StObject {
    
    var active: `true`
    
    var description: Null
    
    var id: String
    
    var input_type: select
    
    var name: Size
    
    var required: `true`
    
    var values: js.Array[Name]
    
    var variant: `true`
  }
  object Inputtype {
    
    inline def apply(description: Null, id: String, values: js.Array[Name]): Inputtype = {
      val __obj = js.Dynamic.literal(active = true, description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], input_type = "select", name = "Size", required = true, values = values.asInstanceOf[js.Any], variant = true)
      __obj.asInstanceOf[Inputtype]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Inputtype] (val x: Self) extends AnyVal {
      
      inline def setActive(value: `true`): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: Null): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setInput_type(value: select): Self = StObject.set(x, "input_type", value.asInstanceOf[js.Any])
      
      inline def setName(value: Size): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRequired(value: `true`): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setValues(value: js.Array[Name]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesVarargs(value: Name*): Self = StObject.set(x, "values", js.Array(value*))
      
      inline def setVariant(value: `true`): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    }
  }
  
  trait Name extends StObject {
    
    var description: Null
    
    var id: String
    
    var name: String
    
    var price: Null
    
    var shipment_weight: Null
  }
  object Name {
    
    inline def apply(description: Null, id: String, name: String, price: Null, shipment_weight: Null): Name = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], shipment_weight = shipment_weight.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      inline def setDescription(value: Null): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPrice(value: Null): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
      
      inline def setShipment_weight(value: Null): Self = StObject.set(x, "shipment_weight", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Planid] (val x: Self) extends AnyVal {
      
      inline def setPlan_id(value: String): Self = StObject.set(x, "plan_id", value.asInstanceOf[js.Any])
      
      inline def setPlan_idUndefined: Self = StObject.set(x, "plan_id", js.undefined)
      
      inline def setType(value: PurchaseOptions): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Productid extends StObject {
    
    var id: String
    
    var product_id: String
  }
  object Productid {
    
    inline def apply(id: String, product_id: String): Productid = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], product_id = product_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Productid]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Productid] (val x: Self) extends AnyVal {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setProduct_id(value: String): Self = StObject.set(x, "product_id", value.asInstanceOf[js.Any])
    }
  }
  
  trait Results extends StObject {
    
    var count: Double
    
    var results: js.Array[ProductSnakeCase]
  }
  object Results {
    
    inline def apply(count: Double, results: js.Array[ProductSnakeCase]): Results = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
      __obj.asInstanceOf[Results]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Results] (val x: Self) extends AnyVal {
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setResults(value: js.Array[ProductSnakeCase]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      inline def setResultsVarargs(value: ProductSnakeCase*): Self = StObject.set(x, "results", js.Array(value*))
    }
  }
}
