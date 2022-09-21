package typings.toJsonSchema

import typings.toJsonSchema.mod.JSONSchema3or4
import typings.toJsonSchema.toJsonSchemaStrings.all
import typings.toJsonSchema.toJsonSchemaStrings.first
import typings.toJsonSchema.toJsonSchemaStrings.tuple
import typings.toJsonSchema.toJsonSchemaStrings.uniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AdditionalProperties extends StObject {
    
    /**
      * if set to `false`, all object schemas will include JSON schema
      * property `additionalProperties: false` which makes generated schema
      * to perevent any extra properties.
      *
      * @default true
      */
    var additionalProperties: js.UndefOr[Boolean] = js.undefined
    
    /**
      * By providing `postProcessFnc`, you can modify or replace generated
      * schema. This function will be called recursively for all the
      * properties and sub-properties and array items from leaves to the root
      * of the `obj` object.
      *
      * @param schema Generated JSON schema
      * @param obj input value
      * @param defaultFunc standard function that is used to post-process
      *                    generated schema. Takes the `schema`, `obj`
      *                    params.
      */
    var postProcessFnc: js.UndefOr[
        js.Function3[
          /* schema */ JSONSchema3or4, 
          /* obj */ Any, 
          /* defaultFnc */ js.Function2[/* schema */ JSONSchema3or4, /* obj */ Any, JSONSchema3or4], 
          JSONSchema3or4
        ]
      ] = js.undefined
    
    /**
      * By providing custom function you will be able to modify any object
      * value (including nested ones) and pre-process it before it gets
      * converted into schema or modify generated schema or do the schema
      * conversion entirely by yourself.
      *
      * @param obj input object value that is supposed to be converted into
      *            JSON schema
      * @param defaultFunc standard function that is used to generate schema
      *                    from object. Takes just the `obj` param.
      */
    var preProcessFnc: js.UndefOr[
        js.Function2[
          /* obj */ Any, 
          /* defaultFunc */ js.Function1[/* obj */ Any, JSONSchema3or4], 
          JSONSchema3or4
        ]
      ] = js.undefined
  }
  object AdditionalProperties {
    
    inline def apply(): AdditionalProperties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AdditionalProperties]
    }
    
    extension [Self <: AdditionalProperties](x: Self) {
      
      inline def setAdditionalProperties(value: Boolean): Self = StObject.set(x, "additionalProperties", value.asInstanceOf[js.Any])
      
      inline def setAdditionalPropertiesUndefined: Self = StObject.set(x, "additionalProperties", js.undefined)
      
      inline def setPostProcessFnc(
        value: (/* schema */ JSONSchema3or4, /* obj */ Any, /* defaultFnc */ js.Function2[/* schema */ JSONSchema3or4, /* obj */ Any, JSONSchema3or4]) => JSONSchema3or4
      ): Self = StObject.set(x, "postProcessFnc", js.Any.fromFunction3(value))
      
      inline def setPostProcessFncUndefined: Self = StObject.set(x, "postProcessFnc", js.undefined)
      
      inline def setPreProcessFnc(
        value: (/* obj */ Any, /* defaultFunc */ js.Function1[/* obj */ Any, JSONSchema3or4]) => JSONSchema3or4
      ): Self = StObject.set(x, "preProcessFnc", js.Any.fromFunction2(value))
      
      inline def setPreProcessFncUndefined: Self = StObject.set(x, "preProcessFnc", js.undefined)
    }
  }
  
  trait DetectFormat extends StObject {
    
    /**
      * When set to true format of the strings values may be detected based
      * on it's content.
      *
      * These JSON schema string formats can be detected:
      *
      * * date-time
      * * date
      * * time
      * * utc-millisec
      * * color
      * * style
      * * phone
      * * uri
      * * email
      * * ip-address
      * * ipv6
      *
      * @default true
      */
    var detectFormat: js.UndefOr[Boolean] = js.undefined
    
    /**
      * By providing custom function you will be able to modify any string
      * value (including nested ones) and pre-process it before it gets
      * converted to schema, modify generated schema or do the schema
      * conversion entirely by yourself.
      *
      * @param value `string` to be converted into JSON schema
      * @param defaultFnc default function that normally generates the
      *                   schema. This function receives only `string` to be
      *                   converted to JSON schema
      */
    var preProcessFnc: js.UndefOr[
        js.Function2[
          /* value */ String, 
          /* defaultFnc */ js.Function1[/* value */ String, JSONSchema3or4], 
          JSONSchema3or4
        ]
      ] = js.undefined
  }
  object DetectFormat {
    
    inline def apply(): DetectFormat = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DetectFormat]
    }
    
    extension [Self <: DetectFormat](x: Self) {
      
      inline def setDetectFormat(value: Boolean): Self = StObject.set(x, "detectFormat", value.asInstanceOf[js.Any])
      
      inline def setDetectFormatUndefined: Self = StObject.set(x, "detectFormat", js.undefined)
      
      inline def setPreProcessFnc(
        value: (/* value */ String, /* defaultFnc */ js.Function1[/* value */ String, JSONSchema3or4]) => JSONSchema3or4
      ): Self = StObject.set(x, "preProcessFnc", js.Any.fromFunction2(value))
      
      inline def setPreProcessFncUndefined: Self = StObject.set(x, "preProcessFnc", js.undefined)
    }
  }
  
  trait Mode extends StObject {
    
    /**
      * * `all` option causes parser to go through all array items, finding
      *   the most compatible yet most descriptive schema possible. If
      *   multiple types are found, the type is omitted so it can be
      *   validated.
      * * `first` option takes only first item in the array into account. If
      *   performance is a concern, you may consider this option.
      * * `uniform` option requires all items in array to have same structure
      *   (to convert to the same schema). If not, error is thrown.
      * * `tuple` option generates a
      *   [tuple array](https://json-schema.org/understanding-json-schema/reference/array.html#tuple-validation)
      *   (array of objects) from arrays.
      *
      * @default 'all'
      */
    var mode: js.UndefOr[all | first | uniform | tuple] = js.undefined
  }
  object Mode {
    
    inline def apply(): Mode = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Mode]
    }
    
    extension [Self <: Mode](x: Self) {
      
      inline def setMode(value: all | first | uniform | tuple): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    }
  }
}
