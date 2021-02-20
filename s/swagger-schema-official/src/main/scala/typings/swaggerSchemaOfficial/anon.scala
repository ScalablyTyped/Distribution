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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait `0` extends StObject {
    
    var in: header = js.native
  }
  object `0` {
    
    @scala.inline
    def apply(in: header): `0` = {
      val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any])
      __obj.asInstanceOf[`0`]
    }
    
    @scala.inline
    implicit class `0MutableBuilder`[Self <: `0`] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIn(value: header): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AllowEmptyValue extends StObject {
    
    var allowEmptyValue: js.UndefOr[Boolean] = js.native
    
    var collectionFormat: js.UndefOr[ParameterCollectionFormat] = js.native
    
    var in: query = js.native
  }
  object AllowEmptyValue {
    
    @scala.inline
    def apply(in: query): AllowEmptyValue = {
      val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any])
      __obj.asInstanceOf[AllowEmptyValue]
    }
    
    @scala.inline
    implicit class AllowEmptyValueMutableBuilder[Self <: AllowEmptyValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowEmptyValue(value: Boolean): Self = StObject.set(x, "allowEmptyValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowEmptyValueUndefined: Self = StObject.set(x, "allowEmptyValue", js.undefined)
      
      @scala.inline
      def setCollectionFormat(value: ParameterCollectionFormat): Self = StObject.set(x, "collectionFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollectionFormatUndefined: Self = StObject.set(x, "collectionFormat", js.undefined)
      
      @scala.inline
      def setIn(value: query): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CollectionFormat extends StObject {
    
    var allowEmptyValue: js.UndefOr[Boolean] = js.native
    
    var collectionFormat: js.UndefOr[ParameterCollectionFormat] = js.native
    
    var in: formData = js.native
    
    var `type`: ParameterType | file = js.native
  }
  object CollectionFormat {
    
    @scala.inline
    def apply(in: formData, `type`: ParameterType | file): CollectionFormat = {
      val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CollectionFormat]
    }
    
    @scala.inline
    implicit class CollectionFormatMutableBuilder[Self <: CollectionFormat] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowEmptyValue(value: Boolean): Self = StObject.set(x, "allowEmptyValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowEmptyValueUndefined: Self = StObject.set(x, "allowEmptyValue", js.undefined)
      
      @scala.inline
      def setCollectionFormat(value: ParameterCollectionFormat): Self = StObject.set(x, "collectionFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollectionFormatUndefined: Self = StObject.set(x, "collectionFormat", js.undefined)
      
      @scala.inline
      def setIn(value: formData): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: ParameterType | file): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait In extends StObject {
    
    var in: path = js.native
    
    var required: `true` = js.native
  }
  object In {
    
    @scala.inline
    def apply(in: path, required: `true`): In = {
      val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
      __obj.asInstanceOf[In]
    }
    
    @scala.inline
    implicit class InMutableBuilder[Self <: In] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIn(value: path): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequired(value: `true`): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    }
  }
}
