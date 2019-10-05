package typings.yeomanDashAssert.yeomanDashAssertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yeoman-assert", "file")
@js.native
object file extends js.Object {
  /**
    * Assert that a file exists or that each files in the array exists
    * @param path path to a file or an array of paths to files
    * @example
    * assert.file('templates/user.hbs');
    * assert.noFile(['templates/user.hbs', 'templates/user/edit.hbs']);
    */
  def apply(path: String): Unit = js.native
  def apply(path: js.Array[String]): Unit = js.native
}

