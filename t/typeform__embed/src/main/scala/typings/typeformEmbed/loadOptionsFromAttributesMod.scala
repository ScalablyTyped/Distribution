package typings.typeformEmbed

import typings.std.HTMLElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loadOptionsFromAttributesMod {
  
  @JSImport("@typeform/embed/types/utils/load-options-from-attributes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def camelCaseToKebabCase(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("camelCaseToKebabCase")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def loadOptionsFromAttributes(element: HTMLElement, transform: Record[String, Transformation]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("loadOptionsFromAttributes")(element.asInstanceOf[js.Any], transform.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def transformAttributeValue(value: String, transformation: Transformation): js.UndefOr[
    String | Double | Boolean | js.Function | (Record[String, String]) | js.Array[String]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformAttributeValue")(value.asInstanceOf[js.Any], transformation.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
    String | Double | Boolean | js.Function | (Record[String, String]) | js.Array[String]
  ]]
  inline def transformAttributeValue(value: Null, transformation: Transformation): js.UndefOr[
    String | Double | Boolean | js.Function | (Record[String, String]) | js.Array[String]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformAttributeValue")(value.asInstanceOf[js.Any], transformation.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
    String | Double | Boolean | js.Function | (Record[String, String]) | js.Array[String]
  ]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.typeformEmbed.typeformEmbedStrings.string
    - typings.typeformEmbed.typeformEmbedStrings.boolean
    - typings.typeformEmbed.typeformEmbedStrings.integer
    - typings.typeformEmbed.typeformEmbedStrings.function
    - typings.typeformEmbed.typeformEmbedStrings.array
    - typings.typeformEmbed.typeformEmbedStrings.record
    - typings.typeformEmbed.typeformEmbedStrings.integerOrBoolean
    - typings.typeformEmbed.typeformEmbedStrings.stringOrBoolean
  */
  trait Transformation extends StObject
  object Transformation {
    
    inline def array: typings.typeformEmbed.typeformEmbedStrings.array = "array".asInstanceOf[typings.typeformEmbed.typeformEmbedStrings.array]
    
    inline def boolean: typings.typeformEmbed.typeformEmbedStrings.boolean = "boolean".asInstanceOf[typings.typeformEmbed.typeformEmbedStrings.boolean]
    
    inline def function: typings.typeformEmbed.typeformEmbedStrings.function = "function".asInstanceOf[typings.typeformEmbed.typeformEmbedStrings.function]
    
    inline def integer: typings.typeformEmbed.typeformEmbedStrings.integer = "integer".asInstanceOf[typings.typeformEmbed.typeformEmbedStrings.integer]
    
    inline def integerOrBoolean: typings.typeformEmbed.typeformEmbedStrings.integerOrBoolean = "integerOrBoolean".asInstanceOf[typings.typeformEmbed.typeformEmbedStrings.integerOrBoolean]
    
    inline def record: typings.typeformEmbed.typeformEmbedStrings.record = "record".asInstanceOf[typings.typeformEmbed.typeformEmbedStrings.record]
    
    inline def string: typings.typeformEmbed.typeformEmbedStrings.string = "string".asInstanceOf[typings.typeformEmbed.typeformEmbedStrings.string]
    
    inline def stringOrBoolean: typings.typeformEmbed.typeformEmbedStrings.stringOrBoolean = "stringOrBoolean".asInstanceOf[typings.typeformEmbed.typeformEmbedStrings.stringOrBoolean]
  }
}
