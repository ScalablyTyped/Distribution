package typings.xadesjs

import typings.xadesjs.buildTypesXmlAnyMod.Any
import typings.xadesjs.buildTypesXmlObjectUnderscoreIdentifierMod.ObjectIdentifier
import typings.xmlDashCore.xmlDashCoreMod.XmlCollection
import typings.xmlDashCore.xmlDashCoreMod.XmlObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xadesjs/build/types/xml/commitment_type_indication", JSImport.Namespace)
@js.native
object buildTypesXmlCommitmentUnderscoreTypeUnderscoreIndicationMod extends js.Object {
  @js.native
  class CommitmentTypeIndication () extends XmlObject {
    var AllSignedDataObjects: Boolean = js.native
    var CommitmentTypeId: ObjectIdentifier = js.native
    var CommitmentTypeQualifiers: typings.xadesjs.buildTypesXmlCommitmentUnderscoreTypeUnderscoreIndicationMod.CommitmentTypeQualifiers = js.native
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

