package typings
package uuidDash1345Lib.uuidDash1345Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UUID extends js.Object {
  var variant: java.lang.String
  var version: java.lang.String
  def toBuffer(): nodeLib.Buffer
}

object UUID {
  @scala.inline
  def apply(
    toBuffer: () => nodeLib.Buffer,
    toString: () => java.lang.String,
    variant: java.lang.String,
    version: java.lang.String
  ): UUID = {
    val __obj = js.Dynamic.literal(toBuffer = js.Any.fromFunction0(toBuffer), toString = js.Any.fromFunction0(toString), variant = variant, version = version)
  
    __obj.asInstanceOf[UUID]
  }
}

