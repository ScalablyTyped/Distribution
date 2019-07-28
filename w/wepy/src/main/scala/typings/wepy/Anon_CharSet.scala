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
    val __obj = js.Dynamic.literal(charSet = charSet, path = path, result = result, scanType = scanType)
  
    __obj.asInstanceOf[Anon_CharSet]
  }
}

