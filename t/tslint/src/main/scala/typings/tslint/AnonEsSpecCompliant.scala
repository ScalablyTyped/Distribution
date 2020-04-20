package typings.tslint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEsSpecCompliant extends js.Object {
  var esSpecCompliant: Boolean
  var multiline: String
  var singleline: String
}

object AnonEsSpecCompliant {
  @scala.inline
  def apply(esSpecCompliant: Boolean, multiline: String, singleline: String): AnonEsSpecCompliant = {
    val __obj = js.Dynamic.literal(esSpecCompliant = esSpecCompliant.asInstanceOf[js.Any], multiline = multiline.asInstanceOf[js.Any], singleline = singleline.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEsSpecCompliant]
  }
}

