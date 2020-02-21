package typings.x509Js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Key extends js.Object {
  var publicExponent: String
  var publicModulus: String
}

object Key {
  @scala.inline
  def apply(publicExponent: String, publicModulus: String): Key = {
    val __obj = js.Dynamic.literal(publicExponent = publicExponent.asInstanceOf[js.Any], publicModulus = publicModulus.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Key]
  }
}

