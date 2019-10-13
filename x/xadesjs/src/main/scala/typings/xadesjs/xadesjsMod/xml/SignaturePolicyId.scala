package typings.xadesjs.xadesjsMod.xml

import typings.xmlDashCore.xmlDashCoreMod.XmlObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xadesjs", "xml.SignaturePolicyId")
@js.native
class SignaturePolicyId () extends XmlObject {
  var SigPolicyHash: DigestAlgAndValueType = js.native
  var SigPolicyId: ObjectIdentifier = js.native
  var SigPolicyQualifiers: typings.xadesjs.xadesjsMod.xml.SigPolicyQualifiers = js.native
  var Transforms: typings.xmldsigjs.xmldsigjsMod.Transforms = js.native
}

