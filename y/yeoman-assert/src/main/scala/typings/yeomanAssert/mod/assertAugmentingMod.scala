package typings.yeomanAssert.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* augmented module */
@JSImport("assert", JSImport.Namespace)
@js.native
object assertAugmentingMod extends js.Object {
  /**
    * Assert a JSON file contains the provided keys
    * @param filename
    * @param content An object of key/values the file should contains
    */
  @JSName("JSONFileContent")
  def JSONFileContent_(filename: String, content: js.Object): Unit = js.native
  /**
    * Assert that a file's content is the same as the given string
    * @param file path to a file
    * @param expectedContent the expected content of the file
    * @example
    * assert.equalsFileContent(
    *   'data.js',
    *   'const greeting = "Hello";\nexport default { greeting }'
    * );
    */
  def equalsFileContent(file: String, expectedContent: String): Unit = js.native
  /**
    * Assert that each file in an array of file-string pairs equals its corresponding string
    * @param pairs an array of arrays, where each subarray is a [String, String] pair
    * @example
    * assert.equalsFileContent([
    *   ['data.js', 'const greeting = "Hello";\nexport default { greeting }'],
    *   ['user.js', 'export default {\n  name: 'Coleman',\n  age: 0\n}']
    * ]);
    */
  def equalsFileContent(pairs: js.Array[js.Tuple2[String, String]]): Unit = js.native
  /**
    * Assert that a file exists or that each files in the array exists
    * @param path path to a file or an array of paths to files
    * @example
    * assert.file('templates/user.hbs');
    * assert.noFile(['templates/user.hbs', 'templates/user/edit.hbs']);
    */
  def file(path: String | js.Array[String]): Unit = js.native
  /**
    * Assert that a file's content matches a regex or string
    * @param file path to a file
    * @param reg regex / string that will be used to search the file
    * @example
    * assert.fileContent('models/user.js', /App\.User = DS\.Model\.extend/);
    * assert.fileContent('models/user.js', 'App.User = DS.Model.extend');
    */
  def fileContent(file: String | js.Array[String], reg: String | RegExp): Unit = js.native
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
  def fileContent(pairs: js.Array[js.Tuple2[String, RegExp]]): Unit = js.native
  /**
    * Assert an Object implements an interface
    * @param subject subject implementing the façade
    * @param methods a façace, hash or array of keys to be implemented
    */
  def implement(subject: js.Object, methods: js.Object | js.Array[String]): Unit = js.native
  /**
    * @see JSONFileContent
    */
  def jsonFileContent(filename: String, content: js.Object): Unit = js.native
  /**
    * Assert that a file doesn't exist
    * @param file path to a file
    * @example
    * assert.noFile('templates/user.hbs');
    * assert.noFile(['templates/user.hbs', 'templates/user/edit.hbs']);
    */
  def noFile(file: String | js.Array[String]): Unit = js.native
  /**
    * Assert that a file's content does not match a regex / string
    * @param file path to a file
    * @param reg regex / string that will be used to search the file
    * @example
    * assert.noFileContent('models/user.js', /App\.User = DS\.Model\.extend/);
    * assert.noFileContent('models/user.js', 'App.User = DS.Model.extend');
    */
  def noFileContent(file: String | js.Array[String], reg: RegExp | String): Unit = js.native
  /**
    * Assert that each file in an array of file-regex pairs does not match its corresponding regex
    * @param pairs an array of arrays, where each subarray is a [String, RegExp] pair
    * var arg = [
    *   [ 'models/user.js', /App\.User \ DS\.Model\.extend/ ],
    *   [ 'controllers/user.js', /App\.UserController = Ember\.ObjectController\.extend/ ]
    * ]
    * assert.noFileContent(arg);
    */
  def noFileContent(pairs: js.Array[js.Tuple2[String, RegExp]]): Unit = js.native
  /**
    * Assert a JSON file does not contain the provided keys
    * @param filename
    * @param content An object of key/values the file should not contain
    */
  @JSName("noJSONFileContent")
  def noJSONFileContent_(filename: String, content: js.Object): Unit = js.native
  /**
    * @see noJSONFileContent
    */
  def noJsonFileContent(filename: String, content: js.Object): Unit = js.native
  /**
    * Assert an object does not contain the provided keys
    * @param obj Object that should not match the given pattern
    * @param content An object of key/values the object should not contain
    */
  def noObjectContent(obj: js.Object, content: js.Object): Unit = js.native
  /**
    * Assert an Object doesn't implements any method of an interface
    * @param subject subject not implementing the methods
    * @param methods hash or array of method names to be implemented
    */
  def notImplement(subject: js.Object, methods: js.Object | js.Array[String]): Unit = js.native
  /**
    * Assert an object contains the provided keys
    * @param obj Object that should match the given pattern
    * @param content An object of key/values the object should contains
    */
  def objectContent(obj: js.Object, content: js.Object): Unit = js.native
  /**
    * Assert that two strings are equal after standardization of newlines
    * @param value a string
    * @param expected the expected value of the string
    * @example
    * assert.textEqual('I have a yellow cat', 'I have a yellow cat');
    */
  def textEqual(value: String, expected: String): Unit = js.native
}

