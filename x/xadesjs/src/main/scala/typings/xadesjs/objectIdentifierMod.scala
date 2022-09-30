package typings.xadesjs

import typings.xadesjs.xmlBaseMod.XadesCollection
import typings.xadesjs.xmlBaseMod.XadesObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object objectIdentifierMod {
  
  @JSImport("xadesjs/build/types/src/xml/object_identifier", "DocumentationReference")
  @js.native
  open class DocumentationReference () extends XadesObject {
    def this(properties: js.Object) = this()
    
    var Uri: String = js.native
  }
  
  @JSImport("xadesjs/build/types/src/xml/object_identifier", "DocumentationReferences")
  @js.native
  open class DocumentationReferences () extends XadesCollection[DocumentationReference] {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xadesjs/build/types/src/xml/object_identifier", "Identifier")
  @js.native
  open class Identifier () extends XadesObject {
    def this(properties: js.Object) = this()
    
    var Qualifier: IdentifierQualifier = js.native
    
    var Value: String = js.native
  }
  
  @JSImport("xadesjs/build/types/src/xml/object_identifier", "ObjectIdentifier")
  @js.native
  open class ObjectIdentifier () extends XadesObject {
    def this(properties: js.Object) = this()
    
    var Description: String = js.native
    
    var DocumentationReferences: typings.xadesjs.objectIdentifierMod.DocumentationReferences = js.native
    
    var Identifier: typings.xadesjs.objectIdentifierMod.Identifier = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.xadesjs.xadesjsStrings.OIDAsURI
    - typings.xadesjs.xadesjsStrings.OIDAsURN
  */
  trait IdentifierQualifier extends StObject
  object IdentifierQualifier {
    
    inline def OIDAsURI: typings.xadesjs.xadesjsStrings.OIDAsURI = "OIDAsURI".asInstanceOf[typings.xadesjs.xadesjsStrings.OIDAsURI]
    
    inline def OIDAsURN: typings.xadesjs.xadesjsStrings.OIDAsURN = "OIDAsURN".asInstanceOf[typings.xadesjs.xadesjsStrings.OIDAsURN]
  }
}
