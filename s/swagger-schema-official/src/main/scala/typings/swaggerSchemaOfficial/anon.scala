package typings.swaggerSchemaOfficial

import typings.swaggerSchemaOfficial.mod.ParameterCollectionFormat
import typings.swaggerSchemaOfficial.mod.ParameterType
import typings.swaggerSchemaOfficial.swaggerSchemaOfficialBooleans.`true`
import typings.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.file
import typings.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.formData
import typings.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.header
import typings.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.path
import typings.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var in: header
  }
  object `0` {
    
    inline def apply(): `0` = {
      val __obj = js.Dynamic.literal(in = "header")
      __obj.asInstanceOf[`0`]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: `0`] (val x: Self) extends AnyVal {
      
      inline def setIn(value: header): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
    }
  }
  
  trait AllowEmptyValue extends StObject {
    
    var allowEmptyValue: js.UndefOr[Boolean] = js.undefined
    
    var collectionFormat: js.UndefOr[ParameterCollectionFormat] = js.undefined
    
    var in: query
  }
  object AllowEmptyValue {
    
    inline def apply(): AllowEmptyValue = {
      val __obj = js.Dynamic.literal(in = "query")
      __obj.asInstanceOf[AllowEmptyValue]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AllowEmptyValue] (val x: Self) extends AnyVal {
      
      inline def setAllowEmptyValue(value: Boolean): Self = StObject.set(x, "allowEmptyValue", value.asInstanceOf[js.Any])
      
      inline def setAllowEmptyValueUndefined: Self = StObject.set(x, "allowEmptyValue", js.undefined)
      
      inline def setCollectionFormat(value: ParameterCollectionFormat): Self = StObject.set(x, "collectionFormat", value.asInstanceOf[js.Any])
      
      inline def setCollectionFormatUndefined: Self = StObject.set(x, "collectionFormat", js.undefined)
      
      inline def setIn(value: query): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
    }
  }
  
  trait CollectionFormat extends StObject {
    
    var allowEmptyValue: js.UndefOr[Boolean] = js.undefined
    
    var collectionFormat: js.UndefOr[ParameterCollectionFormat] = js.undefined
    
    var in: formData
    
    var `type`: ParameterType | file
  }
  object CollectionFormat {
    
    inline def apply(`type`: ParameterType | file): CollectionFormat = {
      val __obj = js.Dynamic.literal(in = "formData")
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CollectionFormat]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CollectionFormat] (val x: Self) extends AnyVal {
      
      inline def setAllowEmptyValue(value: Boolean): Self = StObject.set(x, "allowEmptyValue", value.asInstanceOf[js.Any])
      
      inline def setAllowEmptyValueUndefined: Self = StObject.set(x, "allowEmptyValue", js.undefined)
      
      inline def setCollectionFormat(value: ParameterCollectionFormat): Self = StObject.set(x, "collectionFormat", value.asInstanceOf[js.Any])
      
      inline def setCollectionFormatUndefined: Self = StObject.set(x, "collectionFormat", js.undefined)
      
      inline def setIn(value: formData): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
      
      inline def setType(value: ParameterType | file): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait In extends StObject {
    
    var in: path
    
    var required: `true`
  }
  object In {
    
    inline def apply(): In = {
      val __obj = js.Dynamic.literal(in = "path", required = true)
      __obj.asInstanceOf[In]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: In] (val x: Self) extends AnyVal {
      
      inline def setIn(value: path): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
      
      inline def setRequired(value: `true`): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    }
  }
}
