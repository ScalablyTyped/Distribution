package typings.xadesjs

import typings.xadesjs.anyMod.AnyCollection
import typings.xadesjs.objectIdentifierMod.ObjectIdentifier
import typings.xadesjs.signingCertificateMod.DigestAlgAndValueType
import typings.xadesjs.xmlBaseMod.XadesCollection
import typings.xadesjs.xmlBaseMod.XadesObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object signaturePolicyIdentifierMod {
  
  @JSImport("xadesjs/build/types/xml/signature_policy_identifier", "Integer")
  @js.native
  class Integer () extends XadesObject {
    def this(properties: js.Object) = this()
    
    var Value: Double = js.native
  }
  
  @JSImport("xadesjs/build/types/xml/signature_policy_identifier", "IntegerList")
  @js.native
  class IntegerList () extends XadesCollection[Integer] {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xadesjs/build/types/xml/signature_policy_identifier", "NoticeReference")
  @js.native
  class NoticeReference () extends XadesObject {
    def this(properties: js.Object) = this()
    
    var NoticeNumbers: IntegerList = js.native
    
    var Organization: String = js.native
  }
  
  @JSImport("xadesjs/build/types/xml/signature_policy_identifier", "SPURI")
  @js.native
  class SPURI () extends XadesObject {
    def this(properties: js.Object) = this()
    
    var Value: String = js.native
  }
  
  @JSImport("xadesjs/build/types/xml/signature_policy_identifier", "SPUserNotice")
  @js.native
  class SPUserNotice () extends XadesObject {
    def this(properties: js.Object) = this()
    
    var ExplicitText: String = js.native
    
    var NoticeRef: NoticeReference = js.native
  }
  
  @JSImport("xadesjs/build/types/xml/signature_policy_identifier", "SigPolicyHash")
  @js.native
  class SigPolicyHash () extends DigestAlgAndValueType {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xadesjs/build/types/xml/signature_policy_identifier", "SigPolicyId")
  @js.native
  class SigPolicyId () extends ObjectIdentifier {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xadesjs/build/types/xml/signature_policy_identifier", "SigPolicyQualifier")
  @js.native
  class SigPolicyQualifier () extends AnyCollection {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xadesjs/build/types/xml/signature_policy_identifier", "SigPolicyQualifiers")
  @js.native
  class SigPolicyQualifiers () extends XadesCollection[SigPolicyQualifier] {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xadesjs/build/types/xml/signature_policy_identifier", "SignaturePolicyId")
  @js.native
  class SignaturePolicyId () extends XadesObject {
    def this(properties: js.Object) = this()
    
    var SigPolicyHash: typings.xadesjs.signaturePolicyIdentifierMod.SigPolicyHash = js.native
    
    var SigPolicyId: typings.xadesjs.signaturePolicyIdentifierMod.SigPolicyId = js.native
    
    var SigPolicyQualifiers: typings.xadesjs.signaturePolicyIdentifierMod.SigPolicyQualifiers = js.native
    
    var Transforms: typings.xmldsigjs.mod.Transforms = js.native
  }
  
  @JSImport("xadesjs/build/types/xml/signature_policy_identifier", "SignaturePolicyIdentifier")
  @js.native
  class SignaturePolicyIdentifier () extends XadesObject {
    def this(properties: js.Object) = this()
    
    var SignaturePolicyId: typings.xadesjs.signaturePolicyIdentifierMod.SignaturePolicyId = js.native
    
    var SignaturePolicyImplied: Boolean = js.native
  }
}
