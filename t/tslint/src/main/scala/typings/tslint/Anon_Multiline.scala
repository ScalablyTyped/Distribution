package typings.tslint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Multiline extends js.Object {
  var multiline: String
  var singleline: String
}

object Anon_Multiline {
  @scala.inline
  def apply(multiline: String, singleline: String): Anon_Multiline = {
    val __obj = js.Dynamic.literal(multiline = multiline.asInstanceOf[js.Any], singleline = singleline.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Multiline]
  }
}

