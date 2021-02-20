package typings.xadesjs

import typings.xadesjs.anyMod.Any
import typings.xadesjs.objectIdentifierMod.ObjectIdentifier
import typings.xadesjs.xmlBaseMod.XadesCollection
import typings.xadesjs.xmlBaseMod.XadesObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commitmentTypeIndicationMod {
  
  @JSImport("xadesjs/build/types/xml/commitment_type_indication", "CommitmentTypeIndication")
  @js.native
  class CommitmentTypeIndication () extends XadesObject {
    def this(properties: js.Object) = this()
    
    var AllSignedDataObjects: Boolean = js.native
    
    var CommitmentTypeId: ObjectIdentifier = js.native
    
    var CommitmentTypeQualifiers: typings.xadesjs.commitmentTypeIndicationMod.CommitmentTypeQualifiers = js.native
    
    var ObjectReference: ObjectReferenceCollection = js.native
  }
  
  @JSImport("xadesjs/build/types/xml/commitment_type_indication", "CommitmentTypeQualifier")
  @js.native
  class CommitmentTypeQualifier () extends Any {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xadesjs/build/types/xml/commitment_type_indication", "CommitmentTypeQualifiers")
  @js.native
  class CommitmentTypeQualifiers () extends XadesCollection[CommitmentTypeQualifier] {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xadesjs/build/types/xml/commitment_type_indication", "ObjectReference")
  @js.native
  class ObjectReference () extends XadesObject {
    def this(properties: js.Object) = this()
    
    var Value: String = js.native
  }
  
  @JSImport("xadesjs/build/types/xml/commitment_type_indication", "ObjectReferenceCollection")
  @js.native
  class ObjectReferenceCollection () extends XadesCollection[ObjectReference] {
    def this(properties: js.Object) = this()
  }
}
