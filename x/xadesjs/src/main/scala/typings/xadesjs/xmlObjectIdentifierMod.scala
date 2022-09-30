package typings.xadesjs

import typings.xadesjs.xmlXmlBaseMod.XadesCollection
import typings.xadesjs.xmlXmlBaseMod.XadesObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xmlObjectIdentifierMod {
  
  @JSImport("xadesjs/build/types/xml/object_identifier", "DocumentationReference")
  @js.native
  open class DocumentationReference () extends XadesObject {
    def this(properties: js.Object) = this()
    
    var Uri: String = js.native
  }
  
  @JSImport("xadesjs/build/types/xml/object_identifier", "DocumentationReferences")
  @js.native
  open class DocumentationReferences () extends XadesCollection[DocumentationReference] {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xadesjs/build/types/xml/object_identifier", "Identifier")
  @js.native
  open class Identifier () extends XadesObject {
    def this(properties: js.Object) = this()
    
    var Qualifier: IdentifierQualifier = js.native
    
    var Value: String = js.native
  }
  
  @JSImport("xadesjs/build/types/xml/object_identifier", "ObjectIdentifier")
  @js.native
  open class ObjectIdentifier () extends XadesObject {
    def this(properties: js.Object) = this()
    
    var Description: String = js.native
    
    var DocumentationReferences: typings.xadesjs.xmlObjectIdentifierMod.DocumentationReferences = js.native
    
    var Identifier: typings.xadesjs.xmlObjectIdentifierMod.Identifier = js.native
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
