package typings
package xmldsigjsLib.xmldsigjsMod.XmlDSigJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Signature
  extends xmlDashCoreLib.xmlDashCoreMod.XmlObject {
  /**
           * Gets or sets the ID of the current Signature.
           */
  var Id: java.lang.String = js.native
  /**
           * Gets or sets the KeyInfo of the current Signature.
           */
  var KeyInfo: KeyInfo = js.native
  var ObjectList: DataObjects = js.native
  /**
           * Gets or sets the value of the digital signature.
           */
  var SignatureValue: stdLib.Uint8Array | scala.Null = js.native
  /**
           * Gets or sets the SignedInfo of the current Signature.
           */
  var SignedInfo: SignedInfo = js.native
}

