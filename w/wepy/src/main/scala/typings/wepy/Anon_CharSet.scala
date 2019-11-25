package typings.wepy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CharSet extends js.Object {
  var charSet: String
  var path: String
  var result: String
  var scanType: String
}

object Anon_CharSet {
  @scala.inline
  def apply(charSet: String, path: String, result: String, scanType: String): Anon_CharSet = {
    val __obj = js.Dynamic.literal(charSet = charSet.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], scanType = scanType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_CharSet]
  }
}

