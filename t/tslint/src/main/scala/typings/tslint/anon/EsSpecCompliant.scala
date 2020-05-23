package typings.tslint.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EsSpecCompliant extends js.Object {
  var esSpecCompliant: Boolean
  var multiline: String
  var singleline: String
}

object EsSpecCompliant {
  @scala.inline
  def apply(esSpecCompliant: Boolean, multiline: String, singleline: String): EsSpecCompliant = {
    val __obj = js.Dynamic.literal(esSpecCompliant = esSpecCompliant.asInstanceOf[js.Any], multiline = multiline.asInstanceOf[js.Any], singleline = singleline.asInstanceOf[js.Any])
    __obj.asInstanceOf[EsSpecCompliant]
  }
}

