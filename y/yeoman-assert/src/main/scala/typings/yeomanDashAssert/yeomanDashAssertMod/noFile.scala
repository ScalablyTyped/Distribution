package typings.yeomanDashAssert.yeomanDashAssertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yeoman-assert", "noFile")
@js.native
object noFile extends js.Object {
  /**
    * Assert that a file doesn't exist
    * @param file path to a file
    * @example
    * assert.noFile('templates/user.hbs');
    * assert.noFile(['templates/user.hbs', 'templates/user/edit.hbs']);
    */
  def apply(file: String): Unit = js.native
  def apply(file: js.Array[String]): Unit = js.native
}

