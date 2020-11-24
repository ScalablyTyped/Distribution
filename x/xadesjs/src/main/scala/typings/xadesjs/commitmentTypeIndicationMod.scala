package typings.xadesjs

import typings.xadesjs.anyMod.Any
import typings.xadesjs.objectIdentifierMod.ObjectIdentifier
import typings.xmlCore.mod.XmlCollection
import typings.xmlCore.mod.XmlObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xadesjs/build/types/xml/commitment_type_indication", JSImport.Namespace)
@js.native
object commitmentTypeIndicationMod extends js.Object {
  
  @js.native
  class CommitmentTypeIndication () extends XmlObject {
    
    var AllSignedDataObjects: Boolean = js.native
    
    var CommitmentTypeId: ObjectIdentifier = js.native
    
    var CommitmentTypeQualifiers: typings.xadesjs.commitmentTypeIndicationMod.CommitmentTypeQualifiers = js.native
    
    var ObjectReference: ObjectReferenceCollection = js.native
  }
  
  @js.native
  class CommitmentTypeQualifier () extends Any
  
  @js.native
  class CommitmentTypeQualifiers () extends XmlCollection[CommitmentTypeQualifier]
  
  @js.native
  class ObjectReference () extends XmlObject {
    
    var Value: String = js.native
  }
  
  @js.native
  class ObjectReferenceCollection () extends XmlCollection[ObjectReference]
}
