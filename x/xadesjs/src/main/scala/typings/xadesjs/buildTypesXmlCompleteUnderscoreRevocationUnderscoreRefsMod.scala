package typings.xadesjs

import typings.std.Uint8Array
import typings.xadesjs.buildTypesXmlAnyMod.Any
import typings.xadesjs.buildTypesXmlDateUnderscoreTimeMod.XadesDateTime
import typings.xadesjs.buildTypesXmlSigningUnderscoreCertificateMod.DigestAlgAndValueType
import typings.xmlDashCore.xmlDashCoreMod.XmlCollection
import typings.xmlDashCore.xmlDashCoreMod.XmlObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xadesjs/build/types/xml/complete_revocation_refs", JSImport.Namespace)
@js.native
object buildTypesXmlCompleteUnderscoreRevocationUnderscoreRefsMod extends js.Object {
  @js.native
  class CRLIdentifier () extends XmlObject {
    var IssueTime: XadesDateTime = js.native
    var Issuer: String = js.native
    var Number: Double = js.native
    var URI: String = js.native
  }
  
  @js.native
  class CRLRef () extends XmlObject {
    var CRLIdentifier: typings.xadesjs.buildTypesXmlCompleteUnderscoreRevocationUnderscoreRefsMod.CRLIdentifier = js.native
    var DigestAlgAndValue: DigestAlgAndValueType = js.native
  }
  
  @js.native
  class CRLRefs () extends XmlCollection[CRLRef]
  
  @js.native
  class CompleteRevocationRefs () extends XmlObject {
    var CRLRefs: typings.xadesjs.buildTypesXmlCompleteUnderscoreRevocationUnderscoreRefsMod.CRLRefs = js.native
    var Id: String = js.native
    var OCSPRefs: typings.xadesjs.buildTypesXmlCompleteUnderscoreRevocationUnderscoreRefsMod.OCSPRefs = js.native
    var OtherRefs: typings.xadesjs.buildTypesXmlCompleteUnderscoreRevocationUnderscoreRefsMod.OtherRefs = js.native
  }
  
  @js.native
  class OCSPIdentifier () extends XmlObject {
    var ProducedAt: XadesDateTime = js.native
    var ResponderID: typings.xadesjs.buildTypesXmlCompleteUnderscoreRevocationUnderscoreRefsMod.ResponderID = js.native
    var URI: String = js.native
  }
  
  @js.native
  class OCSPRef () extends XmlObject {
    var DigestAlgAndValue: DigestAlgAndValueType = js.native
    var OCSPIdentifier: typings.xadesjs.buildTypesXmlCompleteUnderscoreRevocationUnderscoreRefsMod.OCSPIdentifier = js.native
  }
  
  @js.native
  class OCSPRefs () extends XmlCollection[OCSPRef]
  
  @js.native
  class OtherRef () extends Any
  
  @js.native
  class OtherRefs () extends XmlCollection[OtherRef]
  
  @js.native
  class ResponderID () extends XmlObject {
    var ByKey: Uint8Array = js.native
    var ByName: String = js.native
  }
  
}

