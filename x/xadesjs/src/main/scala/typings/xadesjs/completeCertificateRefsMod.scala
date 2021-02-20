package typings.xadesjs

import typings.xadesjs.signingCertificateMod.CertIDList
import typings.xadesjs.unsignedSignaturePropertiesMod.UnsignedSignatureProperty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object completeCertificateRefsMod {
  
  @JSImport("xadesjs/build/types/xml/complete_certificate_refs", "CompleteCertificateRefs")
  @js.native
  class CompleteCertificateRefs () extends UnsignedSignatureProperty {
    def this(properties: js.Object) = this()
    
    var CertRefs: CertIDList = js.native
    
    var Id: String = js.native
  }
}
