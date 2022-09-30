package typings.xadesjs

import typings.xadesjs.anyMod.Any
import typings.xadesjs.dateTimeMod.XadesDateTime
import typings.xadesjs.signingCertificateMod.DigestAlgAndValueType
import typings.xadesjs.unsignedSignaturePropertiesMod.UnsignedSignatureProperty
import typings.xadesjs.xmlBaseMod.XadesCollection
import typings.xadesjs.xmlBaseMod.XadesObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object completeRevocationRefsMod {
  
  @JSImport("xadesjs/build/types/src/xml/complete_revocation_refs", "CRLIdentifier")
  @js.native
  open class CRLIdentifier () extends XadesObject {
    def this(properties: js.Object) = this()
    
    var IssueTime: XadesDateTime = js.native
    
    var Issuer: String = js.native
    
    var Number: Double = js.native
    
    var URI: String = js.native
  }
  
  @JSImport("xadesjs/build/types/src/xml/complete_revocation_refs", "CRLRef")
  @js.native
  open class CRLRef () extends XadesObject {
    def this(properties: js.Object) = this()
    
    var CRLIdentifier: typings.xadesjs.completeRevocationRefsMod.CRLIdentifier = js.native
    
    var DigestAlgAndValue: DigestAlgAndValueType = js.native
  }
  
  @JSImport("xadesjs/build/types/src/xml/complete_revocation_refs", "CRLRefs")
  @js.native
  open class CRLRefs () extends XadesCollection[CRLRef] {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xadesjs/build/types/src/xml/complete_revocation_refs", "CompleteRevocationRefs")
  @js.native
  open class CompleteRevocationRefs () extends UnsignedSignatureProperty {
    def this(properties: js.Object) = this()
    
    var CRLRefs: typings.xadesjs.completeRevocationRefsMod.CRLRefs = js.native
    
    var Id: String = js.native
    
    var OCSPRefs: typings.xadesjs.completeRevocationRefsMod.OCSPRefs = js.native
    
    var OtherRefs: typings.xadesjs.completeRevocationRefsMod.OtherRefs = js.native
  }
  
  @JSImport("xadesjs/build/types/src/xml/complete_revocation_refs", "OCSPIdentifier")
  @js.native
  open class OCSPIdentifier () extends XadesObject {
    def this(properties: js.Object) = this()
    
    var ProducedAt: XadesDateTime = js.native
    
    var ResponderID: typings.xadesjs.completeRevocationRefsMod.ResponderID = js.native
    
    var URI: String = js.native
  }
  
  @JSImport("xadesjs/build/types/src/xml/complete_revocation_refs", "OCSPRef")
  @js.native
  open class OCSPRef () extends XadesObject {
    def this(properties: js.Object) = this()
    
    var DigestAlgAndValue: DigestAlgAndValueType = js.native
    
    var OCSPIdentifier: typings.xadesjs.completeRevocationRefsMod.OCSPIdentifier = js.native
  }
  
  @JSImport("xadesjs/build/types/src/xml/complete_revocation_refs", "OCSPRefs")
  @js.native
  open class OCSPRefs () extends XadesCollection[OCSPRef] {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xadesjs/build/types/src/xml/complete_revocation_refs", "OtherRef")
  @js.native
  open class OtherRef () extends Any {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xadesjs/build/types/src/xml/complete_revocation_refs", "OtherRefs")
  @js.native
  open class OtherRefs () extends XadesCollection[OtherRef] {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xadesjs/build/types/src/xml/complete_revocation_refs", "ResponderID")
  @js.native
  open class ResponderID () extends XadesObject {
    def this(properties: js.Object) = this()
    
    var ByKey: js.typedarray.Uint8Array = js.native
    
    var ByName: String = js.native
  }
}
