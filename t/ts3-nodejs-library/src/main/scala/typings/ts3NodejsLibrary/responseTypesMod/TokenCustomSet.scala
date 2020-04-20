package typings.ts3NodejsLibrary.responseTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenCustomSet extends js.Object {
  var ident: String
  var value: String
}

object TokenCustomSet {
  @scala.inline
  def apply(ident: String, value: String): TokenCustomSet = {
    val __obj = js.Dynamic.literal(ident = ident.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenCustomSet]
  }
}

