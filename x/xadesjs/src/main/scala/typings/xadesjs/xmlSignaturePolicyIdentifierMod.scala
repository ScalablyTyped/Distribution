package typings.xadesjs

import typings.xadesjs.xmlAnyMod.AnyCollection
import typings.xadesjs.xmlObjectIdentifierMod.ObjectIdentifier
import typings.xadesjs.xmlSigningCertificateMod.DigestAlgAndValueType
import typings.xadesjs.xmlXmlBaseMod.XadesCollection
import typings.xadesjs.xmlXmlBaseMod.XadesObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xmlSignaturePolicyIdentifierMod {
  
  @JSImport("xadesjs/build/types/xml/signature_policy_identifier", "Integer")
  @js.native
  open class Integer () extends XadesObject {
    def this(properties: js.Object) = this()
    
    var Value: Double = js.native
  }
  
  @JSImport("xadesjs/build/types/xml/signature_policy_identifier", "IntegerList")
  @js.native
  open class IntegerList () extends XadesCollection[Integer] {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xadesjs/build/types/xml/signature_policy_identifier", "NoticeReference")
  @js.native
  open class NoticeReference () extends XadesObject {
    def this(properties: js.Object) = this()
    
    var NoticeNumbers: IntegerList = js.native
    
    var Organization: String = js.native
  }
  
  @JSImport("xadesjs/build/types/xml/signature_policy_identifier", "SPURI")
  @js.native
  open class SPURI () extends XadesObject {
    def this(properties: js.Object) = this()
    
    var Value: String = js.native
  }
  
  @JSImport("xadesjs/build/types/xml/signature_policy_identifier", "SPUserNotice")
  @js.native
  open class SPUserNotice () extends XadesObject {
    def this(properties: js.Object) = this()
    
    var ExplicitText: String = js.native
    
    var NoticeRef: NoticeReference = js.native
  }
  
  @JSImport("xadesjs/build/types/xml/signature_policy_identifier", "SigPolicyHash")
  @js.native
  open class SigPolicyHash () extends DigestAlgAndValueType {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xadesjs/build/types/xml/signature_policy_identifier", "SigPolicyId")
  @js.native
  open class SigPolicyId () extends ObjectIdentifier {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xadesjs/build/types/xml/signature_policy_identifier", "SigPolicyQualifier")
  @js.native
  open class SigPolicyQualifier () extends AnyCollection {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xadesjs/build/types/xml/signature_policy_identifier", "SigPolicyQualifiers")
  @js.native
  open class SigPolicyQualifiers () extends XadesCollection[SigPolicyQualifier] {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xadesjs/build/types/xml/signature_policy_identifier", "SignaturePolicyId")
  @js.native
  open class SignaturePolicyId () extends XadesObject {
    def this(properties: js.Object) = this()
    
    var SigPolicyHash: typings.xadesjs.xmlSignaturePolicyIdentifierMod.SigPolicyHash = js.native
    
    var SigPolicyId: typings.xadesjs.xmlSignaturePolicyIdentifierMod.SigPolicyId = js.native
    
    var SigPolicyQualifiers: typings.xadesjs.xmlSignaturePolicyIdentifierMod.SigPolicyQualifiers = js.native
    
    var Transforms: typings.xmldsigjs.mod.Transforms = js.native
  }
  
  @JSImport("xadesjs/build/types/xml/signature_policy_identifier", "SignaturePolicyIdentifier")
  @js.native
  open class SignaturePolicyIdentifier () extends XadesObject {
    def this(properties: js.Object) = this()
    
    var SignaturePolicyId: typings.xadesjs.xmlSignaturePolicyIdentifierMod.SignaturePolicyId = js.native
    
    var SignaturePolicyImplied: Boolean = js.native
  }
}
