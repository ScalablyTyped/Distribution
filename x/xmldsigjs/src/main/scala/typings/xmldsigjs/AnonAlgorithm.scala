package typings.xmldsigjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAlgorithm extends js.Object {
  var Algorithm: String
  var Encoding: String
  var Id: String
  var MimeType: String
  var Type: String
  var URI: String
}

object AnonAlgorithm {
  @scala.inline
  def apply(Algorithm: String, Encoding: String, Id: String, MimeType: String, Type: String, URI: String): AnonAlgorithm = {
    val __obj = js.Dynamic.literal(Algorithm = Algorithm.asInstanceOf[js.Any], Encoding = Encoding.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], MimeType = MimeType.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], URI = URI.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAlgorithm]
  }
}

