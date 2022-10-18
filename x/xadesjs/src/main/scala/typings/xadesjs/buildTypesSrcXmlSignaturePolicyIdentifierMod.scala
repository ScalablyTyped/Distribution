package typings.xadesjs

import typings.xadesjs.buildTypesSrcXmlAnyMod.AnyCollection
import typings.xadesjs.buildTypesSrcXmlObjectIdentifierMod.ObjectIdentifier
import typings.xadesjs.buildTypesSrcXmlSigningCertificateMod.DigestAlgAndValueType
import typings.xadesjs.buildTypesSrcXmlXmlBaseMod.XadesCollection
import typings.xadesjs.buildTypesSrcXmlXmlBaseMod.XadesObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesSrcXmlSignaturePolicyIdentifierMod {
  
  @JSImport("xadesjs/build/types/src/xml/signature_policy_identifier", "Integer")
  @js.native
  open class Integer () extends XadesObject {
    def this(properties: js.Object) = this()
    
    var Value: Double = js.native
  }
  
  @JSImport("xadesjs/build/types/src/xml/signature_policy_identifier", "IntegerList")
  @js.native
  open class IntegerList () extends XadesCollection[Integer] {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xadesjs/build/types/src/xml/signature_policy_identifier", "NoticeReference")
  @js.native
  open class NoticeReference () extends XadesObject {
    def this(properties: js.Object) = this()
    
    var NoticeNumbers: IntegerList = js.native
    
    var Organization: String = js.native
  }
  
  @JSImport("xadesjs/build/types/src/xml/signature_policy_identifier", "SPURI")
  @js.native
  open class SPURI () extends XadesObject {
    def this(properties: js.Object) = this()
    
    var Value: String = js.native
  }
  
  @JSImport("xadesjs/build/types/src/xml/signature_policy_identifier", "SPUserNotice")
  @js.native
  open class SPUserNotice () extends XadesObject {
    def this(properties: js.Object) = this()
    
    var ExplicitText: String = js.native
    
    var NoticeRef: NoticeReference = js.native
  }
  
  @JSImport("xadesjs/build/types/src/xml/signature_policy_identifier", "SigPolicyHash")
  @js.native
  open class SigPolicyHash () extends DigestAlgAndValueType {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xadesjs/build/types/src/xml/signature_policy_identifier", "SigPolicyId")
  @js.native
  open class SigPolicyId () extends ObjectIdentifier {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xadesjs/build/types/src/xml/signature_policy_identifier", "SigPolicyQualifier")
  @js.native
  open class SigPolicyQualifier () extends AnyCollection {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xadesjs/build/types/src/xml/signature_policy_identifier", "SigPolicyQualifiers")
  @js.native
  open class SigPolicyQualifiers () extends XadesCollection[SigPolicyQualifier] {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xadesjs/build/types/src/xml/signature_policy_identifier", "SignaturePolicyId")
  @js.native
  open class SignaturePolicyId () extends XadesObject {
    def this(properties: js.Object) = this()
    
    var SigPolicyHash: typings.xadesjs.buildTypesSrcXmlSignaturePolicyIdentifierMod.SigPolicyHash = js.native
    
    var SigPolicyId: typings.xadesjs.buildTypesSrcXmlSignaturePolicyIdentifierMod.SigPolicyId = js.native
    
    var SigPolicyQualifiers: typings.xadesjs.buildTypesSrcXmlSignaturePolicyIdentifierMod.SigPolicyQualifiers = js.native
    
    var Transforms: typings.xmldsigjs.mod.Transforms = js.native
  }
  
  @JSImport("xadesjs/build/types/src/xml/signature_policy_identifier", "SignaturePolicyIdentifier")
  @js.native
  open class SignaturePolicyIdentifier () extends XadesObject {
    def this(properties: js.Object) = this()
    
    var SignaturePolicyId: typings.xadesjs.buildTypesSrcXmlSignaturePolicyIdentifierMod.SignaturePolicyId = js.native
    
    var SignaturePolicyImplied: Boolean = js.native
  }
}
