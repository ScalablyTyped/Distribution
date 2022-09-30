package typings.yeomanAssert

import typings.assert.anon.Actual
import typings.assert.anon.DeepEqual
import typings.assert.mod.AssertPredicate
import typings.std.Omit
import typings.yeomanAssert.yeomanAssertStrings.deepEqual
import typings.yeomanAssert.yeomanAssertStrings.deepStrictEqual
import typings.yeomanAssert.yeomanAssertStrings.equal
import typings.yeomanAssert.yeomanAssertStrings.ifError
import typings.yeomanAssert.yeomanAssertStrings.notDeepEqual
import typings.yeomanAssert.yeomanAssertStrings.notEqual
import typings.yeomanAssert.yeomanAssertStrings.ok
import typings.yeomanAssert.yeomanAssertStrings.strictEqual
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(value: Any): /* asserts value */ Boolean = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[/* asserts value */ Boolean]
  inline def apply(value: Any, message: String): /* asserts value */ Boolean = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[/* asserts value */ Boolean]
  inline def apply(value: Any, message: js.Error): /* asserts value */ Boolean = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[/* asserts value */ Boolean]
  
  @JSImport("yeoman-assert", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("yeoman-assert", "AssertionError")
  @js.native
  open class AssertionError ()
    extends typings.assert.mod.AssertionError {
    def this(options: Actual) = this()
  }
  
  /**
    * Assert a JSON file contains the provided keys
    * @param filename
    * @param content An object of key/values the file should contains
    */
  inline def JSONFileContent_(filename: String, content: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("JSONFileContent")(filename.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
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
    inline def JSONFileContent_(filename: String, content: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("JSONFileContent")(filename.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
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
    inline def equalsFileContent(file: String, expectedContent: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsFileContent")(file.asInstanceOf[js.Any], expectedContent.asInstanceOf[js.Any])).asInstanceOf[Unit]
    /**
      * Assert that each file in an array of file-string pairs equals its corresponding string
      * @param pairs an array of arrays, where each subarray is a [String, String] pair
      * @example
      * assert.equalsFileContent([
      *   ['data.js', 'const greeting = "Hello";\nexport default { greeting }'],
      *   ['user.js', 'export default {\n  name: 'Coleman',\n  age: 0\n}']
      * ]);
      */
    inline def equalsFileContent(pairs: js.Array[js.Tuple2[String, String]]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("equalsFileContent")(pairs.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Assert that a file exists or that each files in the array exists
      * @param path path to a file or an array of paths to files
      * @example
      * assert.file('templates/user.hbs');
      * assert.noFile(['templates/user.hbs', 'templates/user/edit.hbs']);
      */
    inline def file(path: String | js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("file")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Assert that a file's content matches a regex or string
      * @param file path to a file
      * @param reg regex / string that will be used to search the file
      * @example
      * assert.fileContent('models/user.js', /App\.User = DS\.Model\.extend/);
      * assert.fileContent('models/user.js', 'App.User = DS.Model.extend');
      */
    inline def fileContent(file: String | js.Array[String], reg: String | js.RegExp): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fileContent")(file.asInstanceOf[js.Any], reg.asInstanceOf[js.Any])).asInstanceOf[Unit]
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
    inline def fileContent(pairs: js.Array[js.Tuple2[String, js.RegExp]]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("fileContent")(pairs.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Assert an Object implements an interface
      * @param subject subject implementing the façade
      * @param methods a façace, hash or array of keys to be implemented
      */
    inline def implement(subject: js.Object, methods: js.Object | js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("implement")(subject.asInstanceOf[js.Any], methods.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * @see JSONFileContent
      */
    inline def jsonFileContent(filename: String, content: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("jsonFileContent")(filename.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Assert that a file doesn't exist
      * @param file path to a file
      * @example
      * assert.noFile('templates/user.hbs');
      * assert.noFile(['templates/user.hbs', 'templates/user/edit.hbs']);
      */
    inline def noFile(file: String | js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("noFile")(file.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Assert that a file's content does not match a regex / string
      * @param file path to a file
      * @param reg regex / string that will be used to search the file
      * @example
      * assert.noFileContent('models/user.js', /App\.User = DS\.Model\.extend/);
      * assert.noFileContent('models/user.js', 'App.User = DS.Model.extend');
      */
    inline def noFileContent(file: String | js.Array[String], reg: js.RegExp | String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("noFileContent")(file.asInstanceOf[js.Any], reg.asInstanceOf[js.Any])).asInstanceOf[Unit]
    /**
      * Assert that each file in an array of file-regex pairs does not match its corresponding regex
      * @param pairs an array of arrays, where each subarray is a [String, RegExp] pair
      * var arg = [
      *   [ 'models/user.js', /App\.User \ DS\.Model\.extend/ ],
      *   [ 'controllers/user.js', /App\.UserController = Ember\.ObjectController\.extend/ ]
      * ]
      * assert.noFileContent(arg);
      */
    inline def noFileContent(pairs: js.Array[js.Tuple2[String, js.RegExp]]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("noFileContent")(pairs.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Assert a JSON file does not contain the provided keys
      * @param filename
      * @param content An object of key/values the file should not contain
      */
    inline def noJSONFileContent_(filename: String, content: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("noJSONFileContent")(filename.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * @see noJSONFileContent
      */
    inline def noJsonFileContent(filename: String, content: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("noJsonFileContent")(filename.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Assert an object does not contain the provided keys
      * @param obj Object that should not match the given pattern
      * @param content An object of key/values the object should not contain
      */
    inline def noObjectContent(obj: js.Object, content: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("noObjectContent")(obj.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Assert an Object doesn't implements any method of an interface
      * @param subject subject not implementing the methods
      * @param methods hash or array of method names to be implemented
      */
    inline def notImplement(subject: js.Object, methods: js.Object | js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notImplement")(subject.asInstanceOf[js.Any], methods.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Assert an object contains the provided keys
      * @param obj Object that should match the given pattern
      * @param content An object of key/values the object should contains
      */
    inline def objectContent(obj: js.Object, content: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("objectContent")(obj.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Assert that two strings are equal after standardization of newlines
      * @param value a string
      * @param expected the expected value of the string
      * @example
      * assert.textEqual('I have a yellow cat', 'I have a yellow cat');
      */
    inline def textEqual(value: String, expected: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("textEqual")(value.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  /** @deprecated since v9.9.0 - use deepStrictEqual() instead. */
  inline def deepEqual(actual: Any, expected: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deepEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def deepEqual(actual: Any, expected: Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deepEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def deepEqual(actual: Any, expected: Any, message: js.Error): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deepEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def deepStrictEqual[T](actual: Any, expected: T): /* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("deepStrictEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[/* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean]
  inline def deepStrictEqual[T](actual: Any, expected: T, message: String): /* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("deepStrictEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[/* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean]
  inline def deepStrictEqual[T](actual: Any, expected: T, message: js.Error): /* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("deepStrictEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[/* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean]
  
  inline def doesNotMatch(value: String, regExp: js.RegExp): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("doesNotMatch")(value.asInstanceOf[js.Any], regExp.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def doesNotMatch(value: String, regExp: js.RegExp, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("doesNotMatch")(value.asInstanceOf[js.Any], regExp.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def doesNotMatch(value: String, regExp: js.RegExp, message: js.Error): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("doesNotMatch")(value.asInstanceOf[js.Any], regExp.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def doesNotReject(block: js.Function0[js.Promise[Any]]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("doesNotReject")(block.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def doesNotReject(block: js.Function0[js.Promise[Any]], error: AssertPredicate): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("doesNotReject")(block.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def doesNotReject(block: js.Function0[js.Promise[Any]], error: AssertPredicate, message: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("doesNotReject")(block.asInstanceOf[js.Any], error.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def doesNotReject(block: js.Function0[js.Promise[Any]], error: AssertPredicate, message: js.Error): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("doesNotReject")(block.asInstanceOf[js.Any], error.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def doesNotReject(block: js.Function0[js.Promise[Any]], message: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("doesNotReject")(block.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def doesNotReject(block: js.Function0[js.Promise[Any]], message: js.Error): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("doesNotReject")(block.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def doesNotReject(block: js.Promise[Any]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("doesNotReject")(block.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def doesNotReject(block: js.Promise[Any], error: AssertPredicate): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("doesNotReject")(block.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def doesNotReject(block: js.Promise[Any], error: AssertPredicate, message: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("doesNotReject")(block.asInstanceOf[js.Any], error.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def doesNotReject(block: js.Promise[Any], error: AssertPredicate, message: js.Error): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("doesNotReject")(block.asInstanceOf[js.Any], error.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def doesNotReject(block: js.Promise[Any], message: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("doesNotReject")(block.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def doesNotReject(block: js.Promise[Any], message: js.Error): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("doesNotReject")(block.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def doesNotThrow(block: js.Function0[Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("doesNotThrow")(block.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def doesNotThrow(block: js.Function0[Any], error: AssertPredicate): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("doesNotThrow")(block.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def doesNotThrow(block: js.Function0[Any], error: AssertPredicate, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("doesNotThrow")(block.asInstanceOf[js.Any], error.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def doesNotThrow(block: js.Function0[Any], error: AssertPredicate, message: js.Error): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("doesNotThrow")(block.asInstanceOf[js.Any], error.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def doesNotThrow(block: js.Function0[Any], message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("doesNotThrow")(block.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def doesNotThrow(block: js.Function0[Any], message: js.Error): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("doesNotThrow")(block.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** @deprecated since v9.9.0 - use strictEqual() instead. */
  inline def equal(actual: Any, expected: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("equal")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def equal(actual: Any, expected: Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("equal")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def equal(actual: Any, expected: Any, message: js.Error): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("equal")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
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
  inline def equalsFileContent(file: String, expectedContent: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsFileContent")(file.asInstanceOf[js.Any], expectedContent.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /**
    * Assert that each file in an array of file-string pairs equals its corresponding string
    * @param pairs an array of arrays, where each subarray is a [String, String] pair
    * @example
    * assert.equalsFileContent([
    *   ['data.js', 'const greeting = "Hello";\nexport default { greeting }'],
    *   ['user.js', 'export default {\n  name: 'Coleman',\n  age: 0\n}']
    * ]);
    */
  inline def equalsFileContent(pairs: js.Array[js.Tuple2[String, String]]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("equalsFileContent")(pairs.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def fail(): scala.Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("fail")().asInstanceOf[scala.Nothing]
  /** @deprecated since v10.0.0 - use fail([message]) or other assert functions instead. */
  inline def fail(actual: Any, expected: Any): scala.Nothing = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[scala.Nothing]
  inline def fail(actual: Any, expected: Any, message: String): scala.Nothing = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[scala.Nothing]
  inline def fail(actual: Any, expected: Any, message: String, operator: String): scala.Nothing = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any], operator.asInstanceOf[js.Any])).asInstanceOf[scala.Nothing]
  inline def fail(
    actual: Any,
    expected: Any,
    message: String,
    operator: String,
    // tslint:disable-next-line:ban-types
  stackStartFn: js.Function
  ): scala.Nothing = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any], operator.asInstanceOf[js.Any], stackStartFn.asInstanceOf[js.Any])).asInstanceOf[scala.Nothing]
  inline def fail(
    actual: Any,
    expected: Any,
    message: String,
    operator: Unit,
    // tslint:disable-next-line:ban-types
  stackStartFn: js.Function
  ): scala.Nothing = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any], operator.asInstanceOf[js.Any], stackStartFn.asInstanceOf[js.Any])).asInstanceOf[scala.Nothing]
  inline def fail(actual: Any, expected: Any, message: js.Error): scala.Nothing = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[scala.Nothing]
  inline def fail(actual: Any, expected: Any, message: js.Error, operator: String): scala.Nothing = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any], operator.asInstanceOf[js.Any])).asInstanceOf[scala.Nothing]
  inline def fail(
    actual: Any,
    expected: Any,
    message: js.Error,
    operator: String,
    // tslint:disable-next-line:ban-types
  stackStartFn: js.Function
  ): scala.Nothing = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any], operator.asInstanceOf[js.Any], stackStartFn.asInstanceOf[js.Any])).asInstanceOf[scala.Nothing]
  inline def fail(
    actual: Any,
    expected: Any,
    message: js.Error,
    operator: Unit,
    // tslint:disable-next-line:ban-types
  stackStartFn: js.Function
  ): scala.Nothing = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any], operator.asInstanceOf[js.Any], stackStartFn.asInstanceOf[js.Any])).asInstanceOf[scala.Nothing]
  inline def fail(actual: Any, expected: Any, message: Unit, operator: String): scala.Nothing = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any], operator.asInstanceOf[js.Any])).asInstanceOf[scala.Nothing]
  inline def fail(
    actual: Any,
    expected: Any,
    message: Unit,
    operator: String,
    // tslint:disable-next-line:ban-types
  stackStartFn: js.Function
  ): scala.Nothing = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any], operator.asInstanceOf[js.Any], stackStartFn.asInstanceOf[js.Any])).asInstanceOf[scala.Nothing]
  inline def fail(
    actual: Any,
    expected: Any,
    message: Unit,
    operator: Unit,
    // tslint:disable-next-line:ban-types
  stackStartFn: js.Function
  ): scala.Nothing = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any], operator.asInstanceOf[js.Any], stackStartFn.asInstanceOf[js.Any])).asInstanceOf[scala.Nothing]
  inline def fail(message: String): scala.Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("fail")(message.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]
  inline def fail(message: js.Error): scala.Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("fail")(message.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]
  
  /**
    * Assert that a file exists or that each files in the array exists
    * @param path path to a file or an array of paths to files
    * @example
    * assert.file('templates/user.hbs');
    * assert.noFile(['templates/user.hbs', 'templates/user/edit.hbs']);
    */
  inline def file(path: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("file")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def file(path: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("file")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Assert that a file's content matches a regex or string
    * @param file path to a file
    * @param reg regex / string that will be used to search the file
    * @example
    * assert.fileContent('models/user.js', /App\.User = DS\.Model\.extend/);
    * assert.fileContent('models/user.js', 'App.User = DS.Model.extend');
    */
  inline def fileContent(file: String, reg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fileContent")(file.asInstanceOf[js.Any], reg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def fileContent(file: String, reg: js.RegExp): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fileContent")(file.asInstanceOf[js.Any], reg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def fileContent(file: js.Array[String], reg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fileContent")(file.asInstanceOf[js.Any], reg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def fileContent(file: js.Array[String], reg: js.RegExp): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fileContent")(file.asInstanceOf[js.Any], reg.asInstanceOf[js.Any])).asInstanceOf[Unit]
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
  inline def fileContent(pairs: js.Array[js.Tuple2[String, js.RegExp]]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("fileContent")(pairs.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def ifError(value: Any): /* asserts value is TsTypeUnion(IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(null))),IArray()), TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(undefined))),IArray())))*/ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("ifError")(value.asInstanceOf[js.Any]).asInstanceOf[/* asserts value is TsTypeUnion(IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(null))),IArray()), TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(undefined))),IArray())))*/ Boolean]
  
  inline def implement(subject: js.Object, methods: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("implement")(subject.asInstanceOf[js.Any], methods.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /**
    * Assert an Object implements an interface
    * @param subject subject implementing the façade
    * @param methods a façace, hash or array of keys to be implemented
    */
  inline def implement(subject: js.Object, methods: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("implement")(subject.asInstanceOf[js.Any], methods.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * @see JSONFileContent
    */
  inline def jsonFileContent(filename: String, content: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("jsonFileContent")(filename.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def `match`(value: String, regExp: js.RegExp): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("match")(value.asInstanceOf[js.Any], regExp.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def `match`(value: String, regExp: js.RegExp, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("match")(value.asInstanceOf[js.Any], regExp.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def `match`(value: String, regExp: js.RegExp, message: js.Error): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("match")(value.asInstanceOf[js.Any], regExp.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Assert that a file doesn't exist
    * @param file path to a file
    * @example
    * assert.noFile('templates/user.hbs');
    * assert.noFile(['templates/user.hbs', 'templates/user/edit.hbs']);
    */
  inline def noFile(file: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("noFile")(file.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def noFile(file: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("noFile")(file.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def noFileContent(file: String, reg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("noFileContent")(file.asInstanceOf[js.Any], reg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /**
    * Assert that a file's content does not match a regex / string
    * @param file path to a file
    * @param reg regex / string that will be used to search the file
    * @example
    * assert.noFileContent('models/user.js', /App\.User = DS\.Model\.extend/);
    * assert.noFileContent('models/user.js', 'App.User = DS.Model.extend');
    */
  inline def noFileContent(file: String, reg: js.RegExp): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("noFileContent")(file.asInstanceOf[js.Any], reg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def noFileContent(file: js.Array[String], reg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("noFileContent")(file.asInstanceOf[js.Any], reg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def noFileContent(file: js.Array[String], reg: js.RegExp): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("noFileContent")(file.asInstanceOf[js.Any], reg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /**
    * Assert that each file in an array of file-regex pairs does not match its corresponding regex
    * @param pairs an array of arrays, where each subarray is a [String, RegExp] pair
    * var arg = [
    *   [ 'models/user.js', /App\.User \ DS\.Model\.extend/ ],
    *   [ 'controllers/user.js', /App\.UserController = Ember\.ObjectController\.extend/ ]
    * ]
    * assert.noFileContent(arg);
    */
  inline def noFileContent(pairs: js.Array[js.Tuple2[String, js.RegExp]]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("noFileContent")(pairs.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Assert a JSON file does not contain the provided keys
    * @param filename
    * @param content An object of key/values the file should not contain
    */
  inline def noJSONFileContent_(filename: String, content: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("noJSONFileContent")(filename.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * @see noJSONFileContent
    */
  inline def noJsonFileContent(filename: String, content: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("noJsonFileContent")(filename.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Assert an object does not contain the provided keys
    * @param obj Object that should not match the given pattern
    * @param content An object of key/values the object should not contain
    */
  inline def noObjectContent(obj: js.Object, content: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("noObjectContent")(obj.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** @deprecated since v9.9.0 - use notDeepStrictEqual() instead. */
  inline def notDeepEqual(actual: Any, expected: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notDeepEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def notDeepEqual(actual: Any, expected: Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notDeepEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def notDeepEqual(actual: Any, expected: Any, message: js.Error): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notDeepEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def notDeepStrictEqual(actual: Any, expected: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notDeepStrictEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def notDeepStrictEqual(actual: Any, expected: Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notDeepStrictEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def notDeepStrictEqual(actual: Any, expected: Any, message: js.Error): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notDeepStrictEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** @deprecated since v9.9.0 - use notStrictEqual() instead. */
  inline def notEqual(actual: Any, expected: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def notEqual(actual: Any, expected: Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def notEqual(actual: Any, expected: Any, message: js.Error): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def notImplement(subject: js.Object, methods: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notImplement")(subject.asInstanceOf[js.Any], methods.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /**
    * Assert an Object doesn't implements any method of an interface
    * @param subject subject not implementing the methods
    * @param methods hash or array of method names to be implemented
    */
  inline def notImplement(subject: js.Object, methods: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notImplement")(subject.asInstanceOf[js.Any], methods.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def notStrictEqual(actual: Any, expected: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notStrictEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def notStrictEqual(actual: Any, expected: Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notStrictEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def notStrictEqual(actual: Any, expected: Any, message: js.Error): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notStrictEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Assert an object contains the provided keys
    * @param obj Object that should match the given pattern
    * @param content An object of key/values the object should contains
    */
  inline def objectContent(obj: js.Object, content: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("objectContent")(obj.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def ok(value: Any): /* asserts value */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("ok")(value.asInstanceOf[js.Any]).asInstanceOf[/* asserts value */ Boolean]
  inline def ok(value: Any, message: String): /* asserts value */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("ok")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[/* asserts value */ Boolean]
  inline def ok(value: Any, message: js.Error): /* asserts value */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("ok")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[/* asserts value */ Boolean]
  
  inline def rejects(block: js.Function0[js.Promise[Any]]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("rejects")(block.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def rejects(block: js.Function0[js.Promise[Any]], error: AssertPredicate): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("rejects")(block.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def rejects(block: js.Function0[js.Promise[Any]], error: AssertPredicate, message: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("rejects")(block.asInstanceOf[js.Any], error.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def rejects(block: js.Function0[js.Promise[Any]], error: AssertPredicate, message: js.Error): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("rejects")(block.asInstanceOf[js.Any], error.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def rejects(block: js.Function0[js.Promise[Any]], message: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("rejects")(block.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def rejects(block: js.Function0[js.Promise[Any]], message: js.Error): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("rejects")(block.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def rejects(block: js.Promise[Any]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("rejects")(block.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def rejects(block: js.Promise[Any], error: AssertPredicate): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("rejects")(block.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def rejects(block: js.Promise[Any], error: AssertPredicate, message: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("rejects")(block.asInstanceOf[js.Any], error.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def rejects(block: js.Promise[Any], error: AssertPredicate, message: js.Error): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("rejects")(block.asInstanceOf[js.Any], error.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def rejects(block: js.Promise[Any], message: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("rejects")(block.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def rejects(block: js.Promise[Any], message: js.Error): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("rejects")(block.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  @JSImport("yeoman-assert", "strict")
  @js.native
  val strict: (Omit[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof assert */ Any, 
    equal | notEqual | deepEqual | notDeepEqual | ok | strictEqual | deepStrictEqual | ifError | typings.yeomanAssert.yeomanAssertStrings.strict
  ]) & DeepEqual = js.native
  
  inline def strictEqual[T](actual: Any, expected: T): /* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("strictEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[/* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean]
  inline def strictEqual[T](actual: Any, expected: T, message: String): /* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("strictEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[/* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean]
  inline def strictEqual[T](actual: Any, expected: T, message: js.Error): /* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("strictEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[/* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean]
  
  /**
    * Assert that two strings are equal after standardization of newlines
    * @param value a string
    * @param expected the expected value of the string
    * @example
    * assert.textEqual('I have a yellow cat', 'I have a yellow cat');
    */
  inline def textEqual(value: String, expected: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("textEqual")(value.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def throws(block: js.Function0[Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("throws")(block.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def throws(block: js.Function0[Any], error: AssertPredicate): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("throws")(block.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def throws(block: js.Function0[Any], error: AssertPredicate, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("throws")(block.asInstanceOf[js.Any], error.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def throws(block: js.Function0[Any], error: AssertPredicate, message: js.Error): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("throws")(block.asInstanceOf[js.Any], error.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def throws(block: js.Function0[Any], message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("throws")(block.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def throws(block: js.Function0[Any], message: js.Error): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("throws")(block.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
