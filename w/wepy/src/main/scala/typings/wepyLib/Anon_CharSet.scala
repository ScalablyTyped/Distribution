package typings
package wepyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CharSet extends js.Object {
  var charSet: java.lang.String
  var path: java.lang.String
  var result: java.lang.String
  var scanType: java.lang.String
}

object Anon_CharSet {
  @scala.inline
  def apply(
    charSet: java.lang.String,
    path: java.lang.String,
    result: java.lang.String,
    scanType: java.lang.String
  ): Anon_CharSet = {
    val __obj = js.Dynamic.literal(charSet = charSet, path = path, result = result, scanType = scanType)
  
    __obj.asInstanceOf[Anon_CharSet]
  }
}

