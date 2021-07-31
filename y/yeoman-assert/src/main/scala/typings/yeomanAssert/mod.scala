package typings.yeomanAssert

import typings.assert.anon.Actual
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(value: js.Any): /* asserts value */ Boolean = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[/* asserts value */ Boolean]
  @scala.inline
  def apply(value: js.Any, message: String): /* asserts value */ Boolean = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[/* asserts value */ Boolean]
  
  @JSImport("yeoman-assert", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  @scala.inline
  def JSONFileContent_(filename: String, content: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("JSONFileContent")(filename.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* augmented module */
  object assertAugmentingMod {
    
    @JSImport("assert", JSImport.Namespace)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Assert a JSON file contains the provided keys
      * @param filename
      * @param content An object of key/values the file should contains
      */
    @scala.inline
    def JSONFileContent_(filename: String, content: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("JSONFileContent")(filename.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
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
    @scala.inline
    def equalsFileContent(file: String, expectedContent: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsFileContent")(file.asInstanceOf[js.Any], expectedContent.asInstanceOf[js.Any])).asInstanceOf[Unit]
    /**
      * Assert that each file in an array of file-string pairs equals its corresponding string
      * @param pairs an array of arrays, where each subarray is a [String, String] pair
      * @example
      * assert.equalsFileContent([
      *   ['data.js', 'const greeting = "Hello";\nexport default { greeting }'],
      *   ['user.js', 'export default {\n  name: 'Coleman',\n  age: 0\n}']
      * ]);
      */
    @scala.inline
    def equalsFileContent(pairs: js.Array[js.Tuple2[String, String]]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("equalsFileContent")(pairs.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Assert that a file exists or that each files in the array exists
      * @param path path to a file or an array of paths to files
      * @example
      * assert.file('templates/user.hbs');
      * assert.noFile(['templates/user.hbs', 'templates/user/edit.hbs']);
      */
    @scala.inline
    def file(path: String | js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("file")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Assert that a file's content matches a regex or string
      * @param file path to a file
      * @param reg regex / string that will be used to search the file
      * @example
      * assert.fileContent('models/user.js', /App\.User = DS\.Model\.extend/);
      * assert.fileContent('models/user.js', 'App.User = DS.Model.extend');
      */
    @scala.inline
    def fileContent(file: String | js.Array[String], reg: String | RegExp): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fileContent")(file.asInstanceOf[js.Any], reg.asInstanceOf[js.Any])).asInstanceOf[Unit]
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
    @scala.inline
    def fileContent(pairs: js.Array[js.Tuple2[String, RegExp]]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("fileContent")(pairs.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Assert an Object implements an interface
      * @param subject subject implementing the façade
      * @param methods a façace, hash or array of keys to be implemented
      */
    @scala.inline
    def implement(subject: js.Object, methods: js.Object | js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("implement")(subject.asInstanceOf[js.Any], methods.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * @see JSONFileContent
      */
    @scala.inline
    def jsonFileContent(filename: String, content: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("jsonFileContent")(filename.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Assert that a file doesn't exist
      * @param file path to a file
      * @example
      * assert.noFile('templates/user.hbs');
      * assert.noFile(['templates/user.hbs', 'templates/user/edit.hbs']);
      */
    @scala.inline
    def noFile(file: String | js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("noFile")(file.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Assert that a file's content does not match a regex / string
      * @param file path to a file
      * @param reg regex / string that will be used to search the file
      * @example
      * assert.noFileContent('models/user.js', /App\.User = DS\.Model\.extend/);
      * assert.noFileContent('models/user.js', 'App.User = DS.Model.extend');
      */
    @scala.inline
    def noFileContent(file: String | js.Array[String], reg: RegExp | String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("noFileContent")(file.asInstanceOf[js.Any], reg.asInstanceOf[js.Any])).asInstanceOf[Unit]
    /**
      * Assert that each file in an array of file-regex pairs does not match its corresponding regex
      * @param pairs an array of arrays, where each subarray is a [String, RegExp] pair
      * var arg = [
      *   [ 'models/user.js', /App\.User \ DS\.Model\.extend/ ],
      *   [ 'controllers/user.js', /App\.UserController = Ember\.ObjectController\.extend/ ]
      * ]
      * assert.noFileContent(arg);
      */
    @scala.inline
    def noFileContent(pairs: js.Array[js.Tuple2[String, RegExp]]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("noFileContent")(pairs.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Assert a JSON file does not contain the provided keys
      * @param filename
      * @param content An object of key/values the file should not contain
      */
    @scala.inline
    def noJSONFileContent_(filename: String, content: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("noJSONFileContent")(filename.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * @see noJSONFileContent
      */
    @scala.inline
    def noJsonFileContent(filename: String, content: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("noJsonFileContent")(filename.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Assert an object does not contain the provided keys
      * @param obj Object that should not match the given pattern
      * @param content An object of key/values the object should not contain
      */
    @scala.inline
    def noObjectContent(obj: js.Object, content: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("noObjectContent")(obj.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Assert an Object doesn't implements any method of an interface
      * @param subject subject not implementing the methods
      * @param methods hash or array of method names to be implemented
      */
    @scala.inline
    def notImplement(subject: js.Object, methods: js.Object | js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notImplement")(subject.asInstanceOf[js.Any], methods.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Assert an object contains the provided keys
      * @param obj Object that should match the given pattern
      * @param content An object of key/values the object should contains
      */
    @scala.inline
    def objectContent(obj: js.Object, content: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("objectContent")(obj.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Assert that two strings are equal after standardization of newlines
      * @param value a string
      * @param expected the expected value of the string
      * @example
      * assert.textEqual('I have a yellow cat', 'I have a yellow cat');
      */
    @scala.inline
    def textEqual(value: String, expected: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("textEqual")(value.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  /** @deprecated Use `deepStrictEqual` instead */
  @scala.inline
  def deepEqual(actual: js.Any, expected: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deepEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def deepEqual(actual: js.Any, expected: js.Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deepEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def deepStrictEqual[T](actual: js.Any, expected: T): /* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("deepStrictEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[/* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean]
  @scala.inline
  def deepStrictEqual[T](actual: js.Any, expected: T, message: String): /* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("deepStrictEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[/* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean]
  
  @scala.inline
  def doesNotThrow(block: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("doesNotThrow")(block.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def doesNotThrow(block: js.Function0[Unit], error: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("doesNotThrow")(block.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def doesNotThrow(block: js.Function0[Unit], error: js.Function0[Unit], message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("doesNotThrow")(block.asInstanceOf[js.Any], error.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def doesNotThrow(block: js.Function0[Unit], error: js.Function1[/* err */ js.Any, Boolean]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("doesNotThrow")(block.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def doesNotThrow(block: js.Function0[Unit], error: js.Function1[/* err */ js.Any, Boolean], message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("doesNotThrow")(block.asInstanceOf[js.Any], error.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def doesNotThrow(block: js.Function0[Unit], error: RegExp): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("doesNotThrow")(block.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def doesNotThrow(block: js.Function0[Unit], error: RegExp, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("doesNotThrow")(block.asInstanceOf[js.Any], error.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def doesNotThrow(block: js.Function0[Unit], message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("doesNotThrow")(block.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** @deprecated Use `strictEqual` instead */
  @scala.inline
  def equal(actual: js.Any, expected: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("equal")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def equal(actual: js.Any, expected: js.Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("equal")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
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
  @scala.inline
  def equalsFileContent(file: String, expectedContent: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsFileContent")(file.asInstanceOf[js.Any], expectedContent.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /**
    * Assert that each file in an array of file-string pairs equals its corresponding string
    * @param pairs an array of arrays, where each subarray is a [String, String] pair
    * @example
    * assert.equalsFileContent([
    *   ['data.js', 'const greeting = "Hello";\nexport default { greeting }'],
    *   ['user.js', 'export default {\n  name: 'Coleman',\n  age: 0\n}']
    * ]);
    */
  @scala.inline
  def equalsFileContent(pairs: js.Array[js.Tuple2[String, String]]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("equalsFileContent")(pairs.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def fail(): scala.Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("fail")().asInstanceOf[scala.Nothing]
  @scala.inline
  def fail(actual: js.Any): scala.Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("fail")(actual.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]
  @scala.inline
  def fail(actual: js.Any, expected: js.Any): scala.Nothing = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[scala.Nothing]
  @scala.inline
  def fail(actual: js.Any, expected: js.Any, message: String): scala.Nothing = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[scala.Nothing]
  @scala.inline
  def fail(actual: js.Any, expected: js.Any, message: String, operator: String): scala.Nothing = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any], operator.asInstanceOf[js.Any])).asInstanceOf[scala.Nothing]
  @scala.inline
  def fail(actual: js.Any, expected: js.Any, message: Unit, operator: String): scala.Nothing = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any], operator.asInstanceOf[js.Any])).asInstanceOf[scala.Nothing]
  @scala.inline
  def fail(actual: js.Any, expected: Unit, message: String): scala.Nothing = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[scala.Nothing]
  @scala.inline
  def fail(actual: js.Any, expected: Unit, message: String, operator: String): scala.Nothing = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any], operator.asInstanceOf[js.Any])).asInstanceOf[scala.Nothing]
  @scala.inline
  def fail(actual: js.Any, expected: Unit, message: Unit, operator: String): scala.Nothing = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any], operator.asInstanceOf[js.Any])).asInstanceOf[scala.Nothing]
  @scala.inline
  def fail(actual: Unit, expected: js.Any): scala.Nothing = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[scala.Nothing]
  @scala.inline
  def fail(actual: Unit, expected: js.Any, message: String): scala.Nothing = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[scala.Nothing]
  @scala.inline
  def fail(actual: Unit, expected: js.Any, message: String, operator: String): scala.Nothing = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any], operator.asInstanceOf[js.Any])).asInstanceOf[scala.Nothing]
  @scala.inline
  def fail(actual: Unit, expected: js.Any, message: Unit, operator: String): scala.Nothing = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any], operator.asInstanceOf[js.Any])).asInstanceOf[scala.Nothing]
  @scala.inline
  def fail(actual: Unit, expected: Unit, message: String): scala.Nothing = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[scala.Nothing]
  @scala.inline
  def fail(actual: Unit, expected: Unit, message: String, operator: String): scala.Nothing = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any], operator.asInstanceOf[js.Any])).asInstanceOf[scala.Nothing]
  @scala.inline
  def fail(actual: Unit, expected: Unit, message: Unit, operator: String): scala.Nothing = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any], operator.asInstanceOf[js.Any])).asInstanceOf[scala.Nothing]
  
  /**
    * Assert that a file exists or that each files in the array exists
    * @param path path to a file or an array of paths to files
    * @example
    * assert.file('templates/user.hbs');
    * assert.noFile(['templates/user.hbs', 'templates/user/edit.hbs']);
    */
  @scala.inline
  def file(path: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("file")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def file(path: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("file")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Assert that a file's content matches a regex or string
    * @param file path to a file
    * @param reg regex / string that will be used to search the file
    * @example
    * assert.fileContent('models/user.js', /App\.User = DS\.Model\.extend/);
    * assert.fileContent('models/user.js', 'App.User = DS.Model.extend');
    */
  @scala.inline
  def fileContent(file: String, reg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fileContent")(file.asInstanceOf[js.Any], reg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def fileContent(file: String, reg: RegExp): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fileContent")(file.asInstanceOf[js.Any], reg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def fileContent(file: js.Array[String], reg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fileContent")(file.asInstanceOf[js.Any], reg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def fileContent(file: js.Array[String], reg: RegExp): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fileContent")(file.asInstanceOf[js.Any], reg.asInstanceOf[js.Any])).asInstanceOf[Unit]
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
  @scala.inline
  def fileContent(pairs: js.Array[js.Tuple2[String, RegExp]]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("fileContent")(pairs.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def ifError(value: js.Any): js.UndefOr[
    /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(null))),IArray())*/ Boolean
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("ifError")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[
    /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(null))),IArray())*/ Boolean
  ]]
  
  @scala.inline
  def implement(subject: js.Object, methods: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("implement")(subject.asInstanceOf[js.Any], methods.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /**
    * Assert an Object implements an interface
    * @param subject subject implementing the façade
    * @param methods a façace, hash or array of keys to be implemented
    */
  @scala.inline
  def implement(subject: js.Object, methods: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("implement")(subject.asInstanceOf[js.Any], methods.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * @see JSONFileContent
    */
  @scala.inline
  def jsonFileContent(filename: String, content: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("jsonFileContent")(filename.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Assert that a file doesn't exist
    * @param file path to a file
    * @example
    * assert.noFile('templates/user.hbs');
    * assert.noFile(['templates/user.hbs', 'templates/user/edit.hbs']);
    */
  @scala.inline
  def noFile(file: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("noFile")(file.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def noFile(file: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("noFile")(file.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def noFileContent(file: String, reg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("noFileContent")(file.asInstanceOf[js.Any], reg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /**
    * Assert that a file's content does not match a regex / string
    * @param file path to a file
    * @param reg regex / string that will be used to search the file
    * @example
    * assert.noFileContent('models/user.js', /App\.User = DS\.Model\.extend/);
    * assert.noFileContent('models/user.js', 'App.User = DS.Model.extend');
    */
  @scala.inline
  def noFileContent(file: String, reg: RegExp): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("noFileContent")(file.asInstanceOf[js.Any], reg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def noFileContent(file: js.Array[String], reg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("noFileContent")(file.asInstanceOf[js.Any], reg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def noFileContent(file: js.Array[String], reg: RegExp): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("noFileContent")(file.asInstanceOf[js.Any], reg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /**
    * Assert that each file in an array of file-regex pairs does not match its corresponding regex
    * @param pairs an array of arrays, where each subarray is a [String, RegExp] pair
    * var arg = [
    *   [ 'models/user.js', /App\.User \ DS\.Model\.extend/ ],
    *   [ 'controllers/user.js', /App\.UserController = Ember\.ObjectController\.extend/ ]
    * ]
    * assert.noFileContent(arg);
    */
  @scala.inline
  def noFileContent(pairs: js.Array[js.Tuple2[String, RegExp]]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("noFileContent")(pairs.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Assert a JSON file does not contain the provided keys
    * @param filename
    * @param content An object of key/values the file should not contain
    */
  @scala.inline
  def noJSONFileContent_(filename: String, content: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("noJSONFileContent")(filename.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * @see noJSONFileContent
    */
  @scala.inline
  def noJsonFileContent(filename: String, content: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("noJsonFileContent")(filename.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Assert an object does not contain the provided keys
    * @param obj Object that should not match the given pattern
    * @param content An object of key/values the object should not contain
    */
  @scala.inline
  def noObjectContent(obj: js.Object, content: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("noObjectContent")(obj.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** @deprecated Use `notDeepStrictEqual` instead */
  @scala.inline
  def notDeepEqual(actual: js.Any, expected: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notDeepEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def notDeepEqual(actual: js.Any, expected: js.Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notDeepEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def notDeepStrictEqual(actual: js.Any, expected: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notDeepStrictEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def notDeepStrictEqual(actual: js.Any, expected: js.Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notDeepStrictEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** @deprecated Use `notStrictEqual` instead */
  @scala.inline
  def notEqual(actual: js.Any, expected: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def notEqual(actual: js.Any, expected: js.Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def notImplement(subject: js.Object, methods: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notImplement")(subject.asInstanceOf[js.Any], methods.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /**
    * Assert an Object doesn't implements any method of an interface
    * @param subject subject not implementing the methods
    * @param methods hash or array of method names to be implemented
    */
  @scala.inline
  def notImplement(subject: js.Object, methods: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notImplement")(subject.asInstanceOf[js.Any], methods.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def notStrictEqual(actual: js.Any, expected: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notStrictEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def notStrictEqual(actual: js.Any, expected: js.Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notStrictEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Assert an object contains the provided keys
    * @param obj Object that should match the given pattern
    * @param content An object of key/values the object should contains
    */
  @scala.inline
  def objectContent(obj: js.Object, content: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("objectContent")(obj.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def ok(value: js.Any): /* asserts value */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("ok")(value.asInstanceOf[js.Any]).asInstanceOf[/* asserts value */ Boolean]
  @scala.inline
  def ok(value: js.Any, message: String): /* asserts value */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("ok")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[/* asserts value */ Boolean]
  
  @JSImport("yeoman-assert", "strict")
  @js.native
  val strict: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof assert */ js.Any = js.native
  
  @scala.inline
  def strictEqual[T](actual: js.Any, expected: T): /* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("strictEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[/* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean]
  @scala.inline
  def strictEqual[T](actual: js.Any, expected: T, message: String): /* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("strictEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[/* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean]
  
  /**
    * Assert that two strings are equal after standardization of newlines
    * @param value a string
    * @param expected the expected value of the string
    * @example
    * assert.textEqual('I have a yellow cat', 'I have a yellow cat');
    */
  @scala.inline
  def textEqual(value: String, expected: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("textEqual")(value.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def throws(block: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("throws")(block.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def throws(block: js.Function0[Unit], error: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("throws")(block.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def throws(block: js.Function0[Unit], error: js.Function0[Unit], message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("throws")(block.asInstanceOf[js.Any], error.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def throws(block: js.Function0[Unit], error: js.Function1[/* err */ js.Any, Boolean]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("throws")(block.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def throws(block: js.Function0[Unit], error: js.Function1[/* err */ js.Any, Boolean], message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("throws")(block.asInstanceOf[js.Any], error.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def throws(block: js.Function0[Unit], error: RegExp): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("throws")(block.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def throws(block: js.Function0[Unit], error: RegExp, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("throws")(block.asInstanceOf[js.Any], error.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def throws(block: js.Function0[Unit], message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("throws")(block.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
