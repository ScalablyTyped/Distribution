package typings
package xmldsigjsLib.xmldsigjsMod.XmlDSigJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait OptionsSign extends js.Object {
  /**
           * Id of Signature
           */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Public key for KeyInfo block
           *
           * @type {boolean}
           * @memberOf OptionsSign
           */
  var keyValue: js.UndefOr[stdLib.CryptoKey] = js.undefined
  /**
           * List of Reference
           * Default is Reference with hash alg SHA-256 and exc-c14n transform
           *
           * @type {OptionsSignReference[]}
           * @memberOf OptionsSign
           */
  var references: js.UndefOr[js.Array[OptionsSignReference]] = js.undefined
  /**
           * List of X509 Certificates
           *
           * @type {string[]}
           * @memberOf OptionsSign
           */
  var x509: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

