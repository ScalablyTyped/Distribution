package typings.vscodeLanguageclient.uuidMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UUID extends js.Object {
  /**
    * @returns the canonical representation in sets of hexadecimal numbers separated by dashes.
    */
  def asHex(): String
  def equals(other: UUID): Boolean
}

object UUID {
  @scala.inline
  def apply(asHex: () => String, equals: UUID => Boolean): UUID = {
    val __obj = js.Dynamic.literal(asHex = js.Any.fromFunction0(asHex), equals = js.Any.fromFunction1(equals))
    __obj.asInstanceOf[UUID]
  }
}

