package typings.xadesjs

import typings.xadesjs.buildTypesSrcXmlSigningCertificateMod.CertIDList
import typings.xadesjs.buildTypesSrcXmlUnsignedSignaturePropertiesMod.UnsignedSignatureProperty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesSrcXmlCompleteCertificateRefsMod {
  
  @JSImport("xadesjs/build/types/src/xml/complete_certificate_refs", "CompleteCertificateRefs")
  @js.native
  open class CompleteCertificateRefs () extends UnsignedSignatureProperty {
    def this(properties: js.Object) = this()
    
    var CertRefs: CertIDList = js.native
    
    var Id: String = js.native
  }
}
