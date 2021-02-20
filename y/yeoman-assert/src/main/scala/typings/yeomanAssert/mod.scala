package typings.yeomanAssert

import typings.assert.anon.Actual
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("yeoman-assert", JSImport.Namespace)
  @js.native
  def apply(value: js.Any): /* asserts value */ Boolean = js.native
  @JSImport("yeoman-assert", JSImport.Namespace)
  @js.native
  def apply(value: js.Any, message: String): /* asserts value */ Boolean = js.native
  
  @JSImport("yeoman-assert", "AssertionError")
  @js.native
  class AssertionError ()
    extends typings.assert.mod.AssertionError {
    def this(options: Actual) = this()
  }
  
  /**
    * Assert a JSON file contains the provided keys
    * @param filename
    * @param content An object of key/values the file should contains
    */
  @JSImport("yeoman-assert", "JSONFileContent")
  @js.native
  def JSONFileContent_(filename: String, content: js.Object): Unit = js.native
  
  /* augmented module */
  object assertAugmentingMod {
    
    /**
      * Assert a JSON file contains the provided keys
      * @param filename
      * @param content An object of key/values the file should contains
      */
    @JSImport("assert", "JSONFileContent")
    @js.native
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
    @JSImport("assert", "equalsFileContent")
    @js.native
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
    @JSImport("assert", "equalsFileContent")
    @js.native
    def equalsFileContent(pairs: js.Array[js.Tuple2[String, String]]): Unit = js.native
    
    /**
      * Assert that a file exists or that each files in the array exists
      * @param path path to a file or an array of paths to files
      * @example
      * assert.file('templates/user.hbs');
      * assert.noFile(['templates/user.hbs', 'templates/user/edit.hbs']);
      */
    @JSImport("assert", "file")
    @js.native
    def file(path: String | js.Array[String]): Unit = js.native
    
    /**
      * Assert that a file's content matches a regex or string
      * @param file path to a file
      * @param reg regex / string that will be used to search the file
      * @example
      * assert.fileContent('models/user.js', /App\.User = DS\.Model\.extend/);
      * assert.fileContent('models/user.js', 'App.User = DS.Model.extend');
      */
    @JSImport("assert", "fileContent")
    @js.native
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
    @JSImport("assert", "fileContent")
    @js.native
    def fileContent(pairs: js.Array[js.Tuple2[String, RegExp]]): Unit = js.native
    
    /**
      * Assert an Object implements an interface
      * @param subject subject implementing the façade
      * @param methods a façace, hash or array of keys to be implemented
      */
    @JSImport("assert", "implement")
    @js.native
    def implement(subject: js.Object, methods: js.Object | js.Array[String]): Unit = js.native
    
    /**
      * @see JSONFileContent
      */
    @JSImport("assert", "jsonFileContent")
    @js.native
    def jsonFileContent(filename: String, content: js.Object): Unit = js.native
    
    /**
      * Assert that a file doesn't exist
      * @param file path to a file
      * @example
      * assert.noFile('templates/user.hbs');
      * assert.noFile(['templates/user.hbs', 'templates/user/edit.hbs']);
      */
    @JSImport("assert", "noFile")
    @js.native
    def noFile(file: String | js.Array[String]): Unit = js.native
    
    /**
      * Assert that a file's content does not match a regex / string
      * @param file path to a file
      * @param reg regex / string that will be used to search the file
      * @example
      * assert.noFileContent('models/user.js', /App\.User = DS\.Model\.extend/);
      * assert.noFileContent('models/user.js', 'App.User = DS.Model.extend');
      */
    @JSImport("assert", "noFileContent")
    @js.native
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
    @JSImport("assert", "noFileContent")
    @js.native
    def noFileContent(pairs: js.Array[js.Tuple2[String, RegExp]]): Unit = js.native
    
    /**
      * Assert a JSON file does not contain the provided keys
      * @param filename
      * @param content An object of key/values the file should not contain
      */
    @JSImport("assert", "noJSONFileContent")
    @js.native
    def noJSONFileContent_(filename: String, content: js.Object): Unit = js.native
    
    /**
      * @see noJSONFileContent
      */
    @JSImport("assert", "noJsonFileContent")
    @js.native
    def noJsonFileContent(filename: String, content: js.Object): Unit = js.native
    
    /**
      * Assert an object does not contain the provided keys
      * @param obj Object that should not match the given pattern
      * @param content An object of key/values the object should not contain
      */
    @JSImport("assert", "noObjectContent")
    @js.native
    def noObjectContent(obj: js.Object, content: js.Object): Unit = js.native
    
    /**
      * Assert an Object doesn't implements any method of an interface
      * @param subject subject not implementing the methods
      * @param methods hash or array of method names to be implemented
      */
    @JSImport("assert", "notImplement")
    @js.native
    def notImplement(subject: js.Object, methods: js.Object | js.Array[String]): Unit = js.native
    
    /**
      * Assert an object contains the provided keys
      * @param obj Object that should match the given pattern
      * @param content An object of key/values the object should contains
      */
    @JSImport("assert", "objectContent")
    @js.native
    def objectContent(obj: js.Object, content: js.Object): Unit = js.native
    
    /**
      * Assert that two strings are equal after standardization of newlines
      * @param value a string
      * @param expected the expected value of the string
      * @example
      * assert.textEqual('I have a yellow cat', 'I have a yellow cat');
      */
    @JSImport("assert", "textEqual")
    @js.native
    def textEqual(value: String, expected: String): Unit = js.native
  }
  
  /** @deprecated Use `deepStrictEqual` instead */
  @JSImport("yeoman-assert", "deepEqual")
  @js.native
  def deepEqual(actual: js.Any, expected: js.Any): Unit = js.native
  @JSImport("yeoman-assert", "deepEqual")
  @js.native
  def deepEqual(actual: js.Any, expected: js.Any, message: String): Unit = js.native
  
  @JSImport("yeoman-assert", "deepStrictEqual")
  @js.native
  def deepStrictEqual[T](actual: js.Any, expected: T): /* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = js.native
  @JSImport("yeoman-assert", "deepStrictEqual")
  @js.native
  def deepStrictEqual[T](actual: js.Any, expected: T, message: String): /* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = js.native
  
  @JSImport("yeoman-assert", "doesNotThrow")
  @js.native
  def doesNotThrow(block: js.Function0[Unit]): Unit = js.native
  @JSImport("yeoman-assert", "doesNotThrow")
  @js.native
  def doesNotThrow(block: js.Function0[Unit], error: js.Function0[Unit]): Unit = js.native
  @JSImport("yeoman-assert", "doesNotThrow")
  @js.native
  def doesNotThrow(block: js.Function0[Unit], error: js.Function0[Unit], message: String): Unit = js.native
  @JSImport("yeoman-assert", "doesNotThrow")
  @js.native
  def doesNotThrow(block: js.Function0[Unit], error: js.Function1[/* err */ js.Any, Boolean]): Unit = js.native
  @JSImport("yeoman-assert", "doesNotThrow")
  @js.native
  def doesNotThrow(block: js.Function0[Unit], error: js.Function1[/* err */ js.Any, Boolean], message: String): Unit = js.native
  @JSImport("yeoman-assert", "doesNotThrow")
  @js.native
  def doesNotThrow(block: js.Function0[Unit], error: RegExp): Unit = js.native
  @JSImport("yeoman-assert", "doesNotThrow")
  @js.native
  def doesNotThrow(block: js.Function0[Unit], error: RegExp, message: String): Unit = js.native
  @JSImport("yeoman-assert", "doesNotThrow")
  @js.native
  def doesNotThrow(block: js.Function0[Unit], message: String): Unit = js.native
  
  /** @deprecated Use `strictEqual` instead */
  @JSImport("yeoman-assert", "equal")
  @js.native
  def equal(actual: js.Any, expected: js.Any): Unit = js.native
  @JSImport("yeoman-assert", "equal")
  @js.native
  def equal(actual: js.Any, expected: js.Any, message: String): Unit = js.native
  
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
  @JSImport("yeoman-assert", "equalsFileContent")
  @js.native
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
  @JSImport("yeoman-assert", "equalsFileContent")
  @js.native
  def equalsFileContent(pairs: js.Array[js.Tuple2[String, String]]): Unit = js.native
  
  @JSImport("yeoman-assert", "fail")
  @js.native
  def fail(): scala.Nothing = js.native
  @JSImport("yeoman-assert", "fail")
  @js.native
  def fail(
    actual: js.UndefOr[scala.Nothing],
    expected: js.UndefOr[scala.Nothing],
    message: js.UndefOr[scala.Nothing],
    operator: String
  ): scala.Nothing = js.native
  @JSImport("yeoman-assert", "fail")
  @js.native
  def fail(actual: js.UndefOr[scala.Nothing], expected: js.UndefOr[scala.Nothing], message: String): scala.Nothing = js.native
  @JSImport("yeoman-assert", "fail")
  @js.native
  def fail(
    actual: js.UndefOr[scala.Nothing],
    expected: js.UndefOr[scala.Nothing],
    message: String,
    operator: String
  ): scala.Nothing = js.native
  @JSImport("yeoman-assert", "fail")
  @js.native
  def fail(actual: js.UndefOr[scala.Nothing], expected: js.Any): scala.Nothing = js.native
  @JSImport("yeoman-assert", "fail")
  @js.native
  def fail(
    actual: js.UndefOr[scala.Nothing],
    expected: js.Any,
    message: js.UndefOr[scala.Nothing],
    operator: String
  ): scala.Nothing = js.native
  @JSImport("yeoman-assert", "fail")
  @js.native
  def fail(actual: js.UndefOr[scala.Nothing], expected: js.Any, message: String): scala.Nothing = js.native
  @JSImport("yeoman-assert", "fail")
  @js.native
  def fail(actual: js.UndefOr[scala.Nothing], expected: js.Any, message: String, operator: String): scala.Nothing = js.native
  @JSImport("yeoman-assert", "fail")
  @js.native
  def fail(actual: js.Any): scala.Nothing = js.native
  @JSImport("yeoman-assert", "fail")
  @js.native
  def fail(
    actual: js.Any,
    expected: js.UndefOr[scala.Nothing],
    message: js.UndefOr[scala.Nothing],
    operator: String
  ): scala.Nothing = js.native
  @JSImport("yeoman-assert", "fail")
  @js.native
  def fail(actual: js.Any, expected: js.UndefOr[scala.Nothing], message: String): scala.Nothing = js.native
  @JSImport("yeoman-assert", "fail")
  @js.native
  def fail(actual: js.Any, expected: js.UndefOr[scala.Nothing], message: String, operator: String): scala.Nothing = js.native
  @JSImport("yeoman-assert", "fail")
  @js.native
  def fail(actual: js.Any, expected: js.Any): scala.Nothing = js.native
  @JSImport("yeoman-assert", "fail")
  @js.native
  def fail(actual: js.Any, expected: js.Any, message: js.UndefOr[scala.Nothing], operator: String): scala.Nothing = js.native
  @JSImport("yeoman-assert", "fail")
  @js.native
  def fail(actual: js.Any, expected: js.Any, message: String): scala.Nothing = js.native
  @JSImport("yeoman-assert", "fail")
  @js.native
  def fail(actual: js.Any, expected: js.Any, message: String, operator: String): scala.Nothing = js.native
  
  /**
    * Assert that a file exists or that each files in the array exists
    * @param path path to a file or an array of paths to files
    * @example
    * assert.file('templates/user.hbs');
    * assert.noFile(['templates/user.hbs', 'templates/user/edit.hbs']);
    */
  @JSImport("yeoman-assert", "file")
  @js.native
  def file(path: String): Unit = js.native
  @JSImport("yeoman-assert", "file")
  @js.native
  def file(path: js.Array[String]): Unit = js.native
  
  /**
    * Assert that a file's content matches a regex or string
    * @param file path to a file
    * @param reg regex / string that will be used to search the file
    * @example
    * assert.fileContent('models/user.js', /App\.User = DS\.Model\.extend/);
    * assert.fileContent('models/user.js', 'App.User = DS.Model.extend');
    */
  @JSImport("yeoman-assert", "fileContent")
  @js.native
  def fileContent(file: String, reg: String): Unit = js.native
  @JSImport("yeoman-assert", "fileContent")
  @js.native
  def fileContent(file: String, reg: RegExp): Unit = js.native
  @JSImport("yeoman-assert", "fileContent")
  @js.native
  def fileContent(file: js.Array[String], reg: String): Unit = js.native
  @JSImport("yeoman-assert", "fileContent")
  @js.native
  def fileContent(file: js.Array[String], reg: RegExp): Unit = js.native
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
  @JSImport("yeoman-assert", "fileContent")
  @js.native
  def fileContent(pairs: js.Array[js.Tuple2[String, RegExp]]): Unit = js.native
  
  @JSImport("yeoman-assert", "ifError")
  @js.native
  def ifError(value: js.Any): js.UndefOr[
    /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(null))),IArray())*/ Boolean
  ] = js.native
  
  @JSImport("yeoman-assert", "implement")
  @js.native
  def implement(subject: js.Object, methods: js.Array[String]): Unit = js.native
  /**
    * Assert an Object implements an interface
    * @param subject subject implementing the façade
    * @param methods a façace, hash or array of keys to be implemented
    */
  @JSImport("yeoman-assert", "implement")
  @js.native
  def implement(subject: js.Object, methods: js.Object): Unit = js.native
  
  /**
    * @see JSONFileContent
    */
  @JSImport("yeoman-assert", "jsonFileContent")
  @js.native
  def jsonFileContent(filename: String, content: js.Object): Unit = js.native
  
  /**
    * Assert that a file doesn't exist
    * @param file path to a file
    * @example
    * assert.noFile('templates/user.hbs');
    * assert.noFile(['templates/user.hbs', 'templates/user/edit.hbs']);
    */
  @JSImport("yeoman-assert", "noFile")
  @js.native
  def noFile(file: String): Unit = js.native
  @JSImport("yeoman-assert", "noFile")
  @js.native
  def noFile(file: js.Array[String]): Unit = js.native
  
  @JSImport("yeoman-assert", "noFileContent")
  @js.native
  def noFileContent(file: String, reg: String): Unit = js.native
  /**
    * Assert that a file's content does not match a regex / string
    * @param file path to a file
    * @param reg regex / string that will be used to search the file
    * @example
    * assert.noFileContent('models/user.js', /App\.User = DS\.Model\.extend/);
    * assert.noFileContent('models/user.js', 'App.User = DS.Model.extend');
    */
  @JSImport("yeoman-assert", "noFileContent")
  @js.native
  def noFileContent(file: String, reg: RegExp): Unit = js.native
  @JSImport("yeoman-assert", "noFileContent")
  @js.native
  def noFileContent(file: js.Array[String], reg: String): Unit = js.native
  @JSImport("yeoman-assert", "noFileContent")
  @js.native
  def noFileContent(file: js.Array[String], reg: RegExp): Unit = js.native
  /**
    * Assert that each file in an array of file-regex pairs does not match its corresponding regex
    * @param pairs an array of arrays, where each subarray is a [String, RegExp] pair
    * var arg = [
    *   [ 'models/user.js', /App\.User \ DS\.Model\.extend/ ],
    *   [ 'controllers/user.js', /App\.UserController = Ember\.ObjectController\.extend/ ]
    * ]
    * assert.noFileContent(arg);
    */
  @JSImport("yeoman-assert", "noFileContent")
  @js.native
  def noFileContent(pairs: js.Array[js.Tuple2[String, RegExp]]): Unit = js.native
  
  /**
    * Assert a JSON file does not contain the provided keys
    * @param filename
    * @param content An object of key/values the file should not contain
    */
  @JSImport("yeoman-assert", "noJSONFileContent")
  @js.native
  def noJSONFileContent_(filename: String, content: js.Object): Unit = js.native
  
  /**
    * @see noJSONFileContent
    */
  @JSImport("yeoman-assert", "noJsonFileContent")
  @js.native
  def noJsonFileContent(filename: String, content: js.Object): Unit = js.native
  
  /**
    * Assert an object does not contain the provided keys
    * @param obj Object that should not match the given pattern
    * @param content An object of key/values the object should not contain
    */
  @JSImport("yeoman-assert", "noObjectContent")
  @js.native
  def noObjectContent(obj: js.Object, content: js.Object): Unit = js.native
  
  /** @deprecated Use `notDeepStrictEqual` instead */
  @JSImport("yeoman-assert", "notDeepEqual")
  @js.native
  def notDeepEqual(actual: js.Any, expected: js.Any): Unit = js.native
  @JSImport("yeoman-assert", "notDeepEqual")
  @js.native
  def notDeepEqual(actual: js.Any, expected: js.Any, message: String): Unit = js.native
  
  @JSImport("yeoman-assert", "notDeepStrictEqual")
  @js.native
  def notDeepStrictEqual(actual: js.Any, expected: js.Any): Unit = js.native
  @JSImport("yeoman-assert", "notDeepStrictEqual")
  @js.native
  def notDeepStrictEqual(actual: js.Any, expected: js.Any, message: String): Unit = js.native
  
  /** @deprecated Use `notStrictEqual` instead */
  @JSImport("yeoman-assert", "notEqual")
  @js.native
  def notEqual(actual: js.Any, expected: js.Any): Unit = js.native
  @JSImport("yeoman-assert", "notEqual")
  @js.native
  def notEqual(actual: js.Any, expected: js.Any, message: String): Unit = js.native
  
  @JSImport("yeoman-assert", "notImplement")
  @js.native
  def notImplement(subject: js.Object, methods: js.Array[String]): Unit = js.native
  /**
    * Assert an Object doesn't implements any method of an interface
    * @param subject subject not implementing the methods
    * @param methods hash or array of method names to be implemented
    */
  @JSImport("yeoman-assert", "notImplement")
  @js.native
  def notImplement(subject: js.Object, methods: js.Object): Unit = js.native
  
  @JSImport("yeoman-assert", "notStrictEqual")
  @js.native
  def notStrictEqual(actual: js.Any, expected: js.Any): Unit = js.native
  @JSImport("yeoman-assert", "notStrictEqual")
  @js.native
  def notStrictEqual(actual: js.Any, expected: js.Any, message: String): Unit = js.native
  
  /**
    * Assert an object contains the provided keys
    * @param obj Object that should match the given pattern
    * @param content An object of key/values the object should contains
    */
  @JSImport("yeoman-assert", "objectContent")
  @js.native
  def objectContent(obj: js.Object, content: js.Object): Unit = js.native
  
  @JSImport("yeoman-assert", "ok")
  @js.native
  def ok(value: js.Any): /* asserts value */ Boolean = js.native
  @JSImport("yeoman-assert", "ok")
  @js.native
  def ok(value: js.Any, message: String): /* asserts value */ Boolean = js.native
  
  @JSImport("yeoman-assert", "strict")
  @js.native
  val strict: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof assert */ js.Any = js.native
  
  @JSImport("yeoman-assert", "strictEqual")
  @js.native
  def strictEqual[T](actual: js.Any, expected: T): /* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = js.native
  @JSImport("yeoman-assert", "strictEqual")
  @js.native
  def strictEqual[T](actual: js.Any, expected: T, message: String): /* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = js.native
  
  /**
    * Assert that two strings are equal after standardization of newlines
    * @param value a string
    * @param expected the expected value of the string
    * @example
    * assert.textEqual('I have a yellow cat', 'I have a yellow cat');
    */
  @JSImport("yeoman-assert", "textEqual")
  @js.native
  def textEqual(value: String, expected: String): Unit = js.native
  
  @JSImport("yeoman-assert", "throws")
  @js.native
  def throws(block: js.Function0[Unit]): Unit = js.native
  @JSImport("yeoman-assert", "throws")
  @js.native
  def throws(block: js.Function0[Unit], error: js.Function0[Unit]): Unit = js.native
  @JSImport("yeoman-assert", "throws")
  @js.native
  def throws(block: js.Function0[Unit], error: js.Function0[Unit], message: String): Unit = js.native
  @JSImport("yeoman-assert", "throws")
  @js.native
  def throws(block: js.Function0[Unit], error: js.Function1[/* err */ js.Any, Boolean]): Unit = js.native
  @JSImport("yeoman-assert", "throws")
  @js.native
  def throws(block: js.Function0[Unit], error: js.Function1[/* err */ js.Any, Boolean], message: String): Unit = js.native
  @JSImport("yeoman-assert", "throws")
  @js.native
  def throws(block: js.Function0[Unit], error: RegExp): Unit = js.native
  @JSImport("yeoman-assert", "throws")
  @js.native
  def throws(block: js.Function0[Unit], error: RegExp, message: String): Unit = js.native
  @JSImport("yeoman-assert", "throws")
  @js.native
  def throws(block: js.Function0[Unit], message: String): Unit = js.native
}
