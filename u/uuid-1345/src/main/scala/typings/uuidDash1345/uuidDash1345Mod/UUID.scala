package typings.uuidDash1345.uuidDash1345Mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UUID extends js.Object {
  var variant: String
  var version: String
  def toBuffer(): Buffer
}

object UUID {
  @scala.inline
  def apply(toBuffer: () => Buffer, toString: () => String, variant: String, version: String): UUID = {
    val __obj = js.Dynamic.literal(toBuffer = js.Any.fromFunction0(toBuffer), toString = js.Any.fromFunction0(toString), variant = variant, version = version)
  
    __obj.asInstanceOf[UUID]
  }
}

