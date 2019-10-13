package typings.xadesjs.xadesjsMod.xml

import typings.xmlDashCore.xmlDashCoreMod.XmlObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xadesjs", "xml.CommitmentTypeIndication")
@js.native
class CommitmentTypeIndication () extends XmlObject {
  var AllSignedDataObjects: Boolean = js.native
  var CommitmentTypeId: ObjectIdentifier = js.native
  var CommitmentTypeQualifiers: typings.xadesjs.xadesjsMod.xml.CommitmentTypeQualifiers = js.native
  var ObjectReference: ObjectReferenceCollection = js.native
}

