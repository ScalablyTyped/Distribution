package typings
package uuidDash1345Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BinaryEncoding extends js.Object {
  var encoding: uuidDash1345Lib.uuidDash1345LibStrings.binary
  var name: java.lang.String
  var namespace: UuidTypes
}

object Anon_BinaryEncoding {
  @scala.inline
  def apply(
    encoding: uuidDash1345Lib.uuidDash1345LibStrings.binary,
    name: java.lang.String,
    namespace: UuidTypes
  ): Anon_BinaryEncoding = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("encoding")(encoding)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BinaryEncoding]
  }
}

