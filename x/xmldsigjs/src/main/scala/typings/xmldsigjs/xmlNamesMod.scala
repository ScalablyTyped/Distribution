package typings.xmldsigjs

import typings.xmldsigjs.anon.Algorithm
import typings.xmldsigjs.anon.CanonicalizationMethod
import typings.xmldsigjs.anon.Manifest
import typings.xmldsigjs.anon.XmlDecryptionTransform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs/build/types/xml/xml_names", JSImport.Namespace)
@js.native
object xmlNamesMod extends js.Object {
  @js.native
  object XmlSignature extends js.Object {
    var AlgorithmNamespaces: XmlDecryptionTransform = js.native
    var AttributeNames: Algorithm = js.native
    var DefaultCanonMethod: String = js.native
    var DefaultDigestMethod: String = js.native
    var DefaultPrefix: String = js.native
    var ElementNames: CanonicalizationMethod = js.native
    var NamespaceURI: String = js.native
    var NamespaceURIMore: String = js.native
    var NamespaceURIPss: String = js.native
    var Uri: Manifest = js.native
  }
  
}

