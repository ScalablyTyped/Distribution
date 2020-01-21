package typings.yeomanAssert.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yeoman-assert", "textEqual")
@js.native
object textEqual extends js.Object {
  /**
    * Assert that two strings are equal after standardization of newlines
    * @param value a string
    * @param expected the expected value of the string
    * @example
    * assert.textEqual('I have a yellow cat', 'I have a yellow cat');
    */
  def apply(value: String, expected: String): Unit = js.native
}

