package typings.xadesjs

import typings.std.Uint8Array
import typings.xadesjs.anyMod.Any
import typings.xadesjs.dateTimeMod.XadesDateTime
import typings.xadesjs.signingCertificateMod.DigestAlgAndValueType
import typings.xmlCore.mod.XmlCollection
import typings.xmlCore.mod.XmlObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xadesjs/build/types/xml/complete_revocation_refs", JSImport.Namespace)
@js.native
object completeRevocationRefsMod extends js.Object {
  
  @js.native
  class CRLIdentifier () extends XmlObject {
    
    var IssueTime: XadesDateTime = js.native
    
    var Issuer: String = js.native
    
    var Number: Double = js.native
    
    var URI: String = js.native
  }
  
  @js.native
  class CRLRef () extends XmlObject {
    
    var CRLIdentifier: typings.xadesjs.completeRevocationRefsMod.CRLIdentifier = js.native
    
    var DigestAlgAndValue: DigestAlgAndValueType = js.native
  }
  
  @js.native
  class CRLRefs () extends XmlCollection[CRLRef]
  
  @js.native
  class CompleteRevocationRefs () extends XmlObject {
    
    var CRLRefs: typings.xadesjs.completeRevocationRefsMod.CRLRefs = js.native
    
    var Id: String = js.native
    
    var OCSPRefs: typings.xadesjs.completeRevocationRefsMod.OCSPRefs = js.native
    
    var OtherRefs: typings.xadesjs.completeRevocationRefsMod.OtherRefs = js.native
  }
  
  @js.native
  class OCSPIdentifier () extends XmlObject {
    
    var ProducedAt: XadesDateTime = js.native
    
    var ResponderID: typings.xadesjs.completeRevocationRefsMod.ResponderID = js.native
    
    var URI: String = js.native
  }
  
  @js.native
  class OCSPRef () extends XmlObject {
    
    var DigestAlgAndValue: DigestAlgAndValueType = js.native
    
    var OCSPIdentifier: typings.xadesjs.completeRevocationRefsMod.OCSPIdentifier = js.native
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
