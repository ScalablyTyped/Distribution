package typings.vsoNodeApi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serializationMod {
  
  object ContractSerializer {
    
    @JSImport("vso-node-api/Serialization", "ContractSerializer")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Process a pure JSON object (e.g. that came from a REST call) and transform it into a JS object
      * where date strings are converted to Date objects and enum values are converted from strings into
      * their numerical value.
      *
      * @param data The object to deserialize
      * @param contractMetadata The type info/metadata for the contract type being deserialize
      * @param preserveOriginal If true, don't modify the original object. False modifies the original object (the return value points to the data argument).
      * @param unwrapWrappedCollections If true check for wrapped arrays (REST apis will not return arrays directly as the root result but will instead wrap them in a { values: [], count: 0 } object.
      */
    inline def deserialize(
      data: js.Any,
      contractMetadata: ContractMetadata,
      preserveOriginal: Boolean,
      unwrapWrappedCollections: Boolean
    ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(data.asInstanceOf[js.Any], contractMetadata.asInstanceOf[js.Any], preserveOriginal.asInstanceOf[js.Any], unwrapWrappedCollections.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    /**
      * Process a contract in its raw form (e.g. date fields are Dates, and Enums are numbers) and
      * return a pure JSON object that can be posted to REST endpoint.
      *
      * @param data The object to serialize
      * @param contractMetadata The type info/metadata for the contract type being serialized
      * @param preserveOriginal If true, don't modify the original object. False modifies the original object (the return value points to the data argument).
      */
    inline def serialize(data: js.Any, contractMetadata: ContractMetadata, preserveOriginal: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(data.asInstanceOf[js.Any], contractMetadata.asInstanceOf[js.Any], preserveOriginal.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  }
  
  trait ContractEnumMetadata extends StObject {
    
    var enumValues: js.UndefOr[StringDictionary[Double]] = js.undefined
  }
  object ContractEnumMetadata {
    
    inline def apply(): ContractEnumMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContractEnumMetadata]
    }
    
    extension [Self <: ContractEnumMetadata](x: Self) {
      
      inline def setEnumValues(value: StringDictionary[Double]): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
      
      inline def setEnumValuesUndefined: Self = StObject.set(x, "enumValues", js.undefined)
    }
  }
  
  trait ContractFieldMetadata extends StObject {
    
    var dictionaryKeyEnumType: js.UndefOr[ContractEnumMetadata] = js.undefined
    
    var dictionaryKeyIsDate: js.UndefOr[Boolean] = js.undefined
    
    var dictionaryValueEnumType: js.UndefOr[ContractEnumMetadata] = js.undefined
    
    var dictionaryValueFieldInfo: js.UndefOr[ContractFieldMetadata] = js.undefined
    
    var dictionaryValueIsDate: js.UndefOr[Boolean] = js.undefined
    
    var dictionaryValueTypeInfo: js.UndefOr[ContractMetadata] = js.undefined
    
    var enumType: js.UndefOr[ContractEnumMetadata] = js.undefined
    
    var isArray: js.UndefOr[Boolean] = js.undefined
    
    var isDate: js.UndefOr[Boolean] = js.undefined
    
    var isDictionary: js.UndefOr[Boolean] = js.undefined
    
    var typeInfo: js.UndefOr[ContractMetadata] = js.undefined
  }
  object ContractFieldMetadata {
    
    inline def apply(): ContractFieldMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContractFieldMetadata]
    }
    
    extension [Self <: ContractFieldMetadata](x: Self) {
      
      inline def setDictionaryKeyEnumType(value: ContractEnumMetadata): Self = StObject.set(x, "dictionaryKeyEnumType", value.asInstanceOf[js.Any])
      
      inline def setDictionaryKeyEnumTypeUndefined: Self = StObject.set(x, "dictionaryKeyEnumType", js.undefined)
      
      inline def setDictionaryKeyIsDate(value: Boolean): Self = StObject.set(x, "dictionaryKeyIsDate", value.asInstanceOf[js.Any])
      
      inline def setDictionaryKeyIsDateUndefined: Self = StObject.set(x, "dictionaryKeyIsDate", js.undefined)
      
      inline def setDictionaryValueEnumType(value: ContractEnumMetadata): Self = StObject.set(x, "dictionaryValueEnumType", value.asInstanceOf[js.Any])
      
      inline def setDictionaryValueEnumTypeUndefined: Self = StObject.set(x, "dictionaryValueEnumType", js.undefined)
      
      inline def setDictionaryValueFieldInfo(value: ContractFieldMetadata): Self = StObject.set(x, "dictionaryValueFieldInfo", value.asInstanceOf[js.Any])
      
      inline def setDictionaryValueFieldInfoUndefined: Self = StObject.set(x, "dictionaryValueFieldInfo", js.undefined)
      
      inline def setDictionaryValueIsDate(value: Boolean): Self = StObject.set(x, "dictionaryValueIsDate", value.asInstanceOf[js.Any])
      
      inline def setDictionaryValueIsDateUndefined: Self = StObject.set(x, "dictionaryValueIsDate", js.undefined)
      
      inline def setDictionaryValueTypeInfo(value: ContractMetadata): Self = StObject.set(x, "dictionaryValueTypeInfo", value.asInstanceOf[js.Any])
      
      inline def setDictionaryValueTypeInfoUndefined: Self = StObject.set(x, "dictionaryValueTypeInfo", js.undefined)
      
      inline def setEnumType(value: ContractEnumMetadata): Self = StObject.set(x, "enumType", value.asInstanceOf[js.Any])
      
      inline def setEnumTypeUndefined: Self = StObject.set(x, "enumType", js.undefined)
      
      inline def setIsArray(value: Boolean): Self = StObject.set(x, "isArray", value.asInstanceOf[js.Any])
      
      inline def setIsArrayUndefined: Self = StObject.set(x, "isArray", js.undefined)
      
      inline def setIsDate(value: Boolean): Self = StObject.set(x, "isDate", value.asInstanceOf[js.Any])
      
      inline def setIsDateUndefined: Self = StObject.set(x, "isDate", js.undefined)
      
      inline def setIsDictionary(value: Boolean): Self = StObject.set(x, "isDictionary", value.asInstanceOf[js.Any])
      
      inline def setIsDictionaryUndefined: Self = StObject.set(x, "isDictionary", js.undefined)
      
      inline def setTypeInfo(value: ContractMetadata): Self = StObject.set(x, "typeInfo", value.asInstanceOf[js.Any])
      
      inline def setTypeInfoUndefined: Self = StObject.set(x, "typeInfo", js.undefined)
    }
  }
  
  trait ContractMetadata extends StObject {
    
    var fields: js.UndefOr[StringDictionary[ContractFieldMetadata]] = js.undefined
  }
  object ContractMetadata {
    
    inline def apply(): ContractMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContractMetadata]
    }
    
    extension [Self <: ContractMetadata](x: Self) {
      
      inline def setFields(value: StringDictionary[ContractFieldMetadata]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    }
  }
  
  trait IWebApiArrayResult extends StObject {
    
    var count: Double
    
    var value: js.Array[js.Any]
  }
  object IWebApiArrayResult {
    
    inline def apply(count: Double, value: js.Array[js.Any]): IWebApiArrayResult = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[IWebApiArrayResult]
    }
    
    extension [Self <: IWebApiArrayResult](x: Self) {
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setValue(value: js.Array[js.Any]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueVarargs(value: js.Any*): Self = StObject.set(x, "value", js.Array(value :_*))
    }
  }
  
  trait SerializationData extends StObject {
    
    var requestTypeMetadata: js.UndefOr[ContractMetadata] = js.undefined
    
    var responseIsCollection: Boolean
    
    var responseTypeMetadata: js.UndefOr[ContractMetadata] = js.undefined
  }
  object SerializationData {
    
    inline def apply(responseIsCollection: Boolean): SerializationData = {
      val __obj = js.Dynamic.literal(responseIsCollection = responseIsCollection.asInstanceOf[js.Any])
      __obj.asInstanceOf[SerializationData]
    }
    
    extension [Self <: SerializationData](x: Self) {
      
      inline def setRequestTypeMetadata(value: ContractMetadata): Self = StObject.set(x, "requestTypeMetadata", value.asInstanceOf[js.Any])
      
      inline def setRequestTypeMetadataUndefined: Self = StObject.set(x, "requestTypeMetadata", js.undefined)
      
      inline def setResponseIsCollection(value: Boolean): Self = StObject.set(x, "responseIsCollection", value.asInstanceOf[js.Any])
      
      inline def setResponseTypeMetadata(value: ContractMetadata): Self = StObject.set(x, "responseTypeMetadata", value.asInstanceOf[js.Any])
      
      inline def setResponseTypeMetadataUndefined: Self = StObject.set(x, "responseTypeMetadata", js.undefined)
    }
  }
}
