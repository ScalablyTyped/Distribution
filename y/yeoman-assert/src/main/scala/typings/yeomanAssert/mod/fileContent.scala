package typings.yeomanAssert.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yeoman-assert", "fileContent")
@js.native
object fileContent extends js.Object {
  /**
    * Assert that a file's content matches a regex or string
    * @param file path to a file
    * @param reg regex / string that will be used to search the file
    * @example
    * assert.fileContent('models/user.js', /App\.User = DS\.Model\.extend/);
    * assert.fileContent('models/user.js', 'App.User = DS.Model.extend');
    */
  def apply(file: String, reg: String): Unit = js.native
  def apply(file: String, reg: RegExp): Unit = js.native
  def apply(file: js.Array[String], reg: String): Unit = js.native
  def apply(file: js.Array[String], reg: RegExp): Unit = js.native
  /**
    * Assert that each file in an array of file-regex pairs matches its corresponding regex
    * @param pairs an array of arrays, where each subarray is a [String, RegExp] pair
    * @example
    * var arg = [
    *   [ 'models/user.js', /App\.User = DS\.Model\.extend/ ],
    *   [ 'controllers/user.js', /App\.UserController = Ember\.ObjectController\.extend/ ]
    * ]
    * assert.fileContent(arg);
    */
  def apply(pairs: js.Array[js.Tuple2[String, RegExp]]): Unit = js.native
}

