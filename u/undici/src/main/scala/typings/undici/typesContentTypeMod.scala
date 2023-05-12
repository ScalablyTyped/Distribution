package typings.undici

import typings.std.Map
import typings.undici.undiciStrings.failure
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesContentTypeMod {
  
  @JSImport("undici/types/content-type", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseMIMEType(input: String): failure | MIMEType = ^.asInstanceOf[js.Dynamic].applyDynamic("parseMIMEType")(input.asInstanceOf[js.Any]).asInstanceOf[failure | MIMEType]
  
  inline def serializeAMimeType(mimeType: MIMEType): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeAMimeType")(mimeType.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait MIMEType extends StObject {
    
    var essence: String
    
    var parameters: Map[String, String]
    
    var subtype: String
    
    var `type`: String
  }
  object MIMEType {
    
    inline def apply(essence: String, parameters: Map[String, String], subtype: String, `type`: String): MIMEType = {
      val __obj = js.Dynamic.literal(essence = essence.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], subtype = subtype.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MIMEType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MIMEType] (val x: Self) extends AnyVal {
      
      inline def setEssence(value: String): Self = StObject.set(x, "essence", value.asInstanceOf[js.Any])
      
      inline def setParameters(value: Map[String, String]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      inline def setSubtype(value: String): Self = StObject.set(x, "subtype", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
