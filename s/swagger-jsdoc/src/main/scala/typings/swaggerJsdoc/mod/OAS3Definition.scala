package typings.swaggerJsdoc.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * For describing Open API Specification (OAS) version 3.0
  */
trait OAS3Definition
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var components: js.UndefOr[Components] = js.undefined
  
  var externalDocs: js.UndefOr[ExternalDocumentation] = js.undefined
  
  var info: Information
  
  var openapi: String
  
  var paths: js.UndefOr[Paths] = js.undefined
  
  var security: js.UndefOr[js.Array[SecurityRequirement]] = js.undefined
  
  var servers: js.UndefOr[js.Array[Server]] = js.undefined
  
  var tags: js.UndefOr[js.Array[Tag]] = js.undefined
}
object OAS3Definition {
  
  inline def apply(info: Information, openapi: String): OAS3Definition = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], openapi = openapi.asInstanceOf[js.Any])
    __obj.asInstanceOf[OAS3Definition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OAS3Definition] (val x: Self) extends AnyVal {
    
    inline def setComponents(value: Components): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
    
    inline def setExternalDocs(value: ExternalDocumentation): Self = StObject.set(x, "externalDocs", value.asInstanceOf[js.Any])
    
    inline def setExternalDocsUndefined: Self = StObject.set(x, "externalDocs", js.undefined)
    
    inline def setInfo(value: Information): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    inline def setOpenapi(value: String): Self = StObject.set(x, "openapi", value.asInstanceOf[js.Any])
    
    inline def setPaths(value: Paths): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    
    inline def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
    
    inline def setSecurity(value: js.Array[SecurityRequirement]): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
    
    inline def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
    
    inline def setSecurityVarargs(value: SecurityRequirement*): Self = StObject.set(x, "security", js.Array(value*))
    
    inline def setServers(value: js.Array[Server]): Self = StObject.set(x, "servers", value.asInstanceOf[js.Any])
    
    inline def setServersUndefined: Self = StObject.set(x, "servers", js.undefined)
    
    inline def setServersVarargs(value: Server*): Self = StObject.set(x, "servers", js.Array(value*))
    
    inline def setTags(value: js.Array[Tag]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
