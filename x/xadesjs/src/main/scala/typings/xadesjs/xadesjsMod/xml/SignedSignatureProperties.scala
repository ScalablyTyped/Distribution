package typings.xadesjs.xadesjsMod.xml

import typings.xmlDashCore.xmlDashCoreMod.XmlObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xadesjs", "xml.SignedSignatureProperties")
@js.native
class SignedSignatureProperties () extends XmlObject {
  var Id: String = js.native
  var SignaturePolicyIdentifier: typings.xadesjs.xadesjsMod.xml.SignaturePolicyIdentifier = js.native
  var SignatureProductionPlace: typings.xadesjs.xadesjsMod.xml.SignatureProductionPlace = js.native
  var SignerRole: typings.xadesjs.xadesjsMod.xml.SignerRole = js.native
  var SigningCertificate: typings.xadesjs.xadesjsMod.xml.SigningCertificate = js.native
  var SigningTime: XadesDateTime = js.native
}

