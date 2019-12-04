package typings.tslint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EsSpecCompliant extends js.Object {
  var esSpecCompliant: Boolean
  var multiline: String
  var singleline: String
}

object Anon_EsSpecCompliant {
  @scala.inline
  def apply(esSpecCompliant: Boolean, multiline: String, singleline: String): Anon_EsSpecCompliant = {
    val __obj = js.Dynamic.literal(esSpecCompliant = esSpecCompliant.asInstanceOf[js.Any], multiline = multiline.asInstanceOf[js.Any], singleline = singleline.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_EsSpecCompliant]
  }
}

