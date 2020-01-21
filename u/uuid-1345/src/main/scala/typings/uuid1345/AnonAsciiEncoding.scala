package typings.uuid1345

import typings.uuid1345.mod.UuidTypes
import typings.uuid1345.uuid1345Strings.ascii
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAsciiEncoding extends js.Object {
  var encoding: ascii
  var name: String
  var namespace: UuidTypes
}

object AnonAsciiEncoding {
  @scala.inline
  def apply(encoding: ascii, name: String, namespace: UuidTypes): AnonAsciiEncoding = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAsciiEncoding]
  }
}

