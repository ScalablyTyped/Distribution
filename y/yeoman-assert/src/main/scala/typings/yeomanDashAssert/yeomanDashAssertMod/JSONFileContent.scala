package typings.yeomanDashAssert.yeomanDashAssertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yeoman-assert", "JSONFileContent")
@js.native
object JSONFileContent extends js.Object {
  /**
    * Assert a JSON file contains the provided keys
    * @param filename
    * @param content An object of key/values the file should contains
    */
  def apply(filename: String, content: js.Object): Unit = js.native
}

@JSImport("yeoman-assert", "jsonFileContent")
@js.native
object jsonFileContent extends js.Object {
  /**
    * @see JSONFileContent
    */
  def apply(filename: String, content: js.Object): Unit = js.native
}

