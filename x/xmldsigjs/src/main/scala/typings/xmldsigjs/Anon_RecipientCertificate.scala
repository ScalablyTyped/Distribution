package typings.xmldsigjs

import typings.std.ArrayBuffer
import typings.xmldsigjs.typesPkijsMod.Certificate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RecipientCertificate extends js.Object {
  var recipientCertificate: Certificate
  var recipientPrivateKey: ArrayBuffer
}

object Anon_RecipientCertificate {
  @scala.inline
  def apply(recipientCertificate: Certificate, recipientPrivateKey: ArrayBuffer): Anon_RecipientCertificate = {
    val __obj = js.Dynamic.literal(recipientCertificate = recipientCertificate.asInstanceOf[js.Any], recipientPrivateKey = recipientPrivateKey.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_RecipientCertificate]
  }
}

