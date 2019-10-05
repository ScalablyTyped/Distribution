package typings.yeomanDashAssert.yeomanDashAssertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yeoman-assert", "noJSONFileContent")
@js.native
object noJSONFileContent extends js.Object {
  /**
    * Assert a JSON file does not contain the provided keys
    * @param filename
    * @param content An object of key/values the file should not contain
    */
  def apply(filename: String, content: js.Object): Unit = js.native
}

@JSImport("yeoman-assert", "noJsonFileContent")
@js.native
object noJsonFileContent extends js.Object {
  /**
    * @see noJSONFileContent
    */
  def apply(filename: String, content: js.Object): Unit = js.native
}

