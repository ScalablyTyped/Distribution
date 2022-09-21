package typings.yeomanTest

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import typings.memFs.mod.Store
import typings.memFsEditor.mod.Editor
import typings.node.eventsMod.EventEmitter
import typings.yeomanEnvironment.mod.Options
import typings.yeomanGenerator.mod.Answers
import typings.yeomanGenerator.mod.GeneratorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("yeoman-test", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(GeneratorOrNamespace: String): RunContext = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(GeneratorOrNamespace.asInstanceOf[js.Any]).asInstanceOf[RunContext]
  inline def create(GeneratorOrNamespace: String, settings: Unit, envOptions: Options): RunContext = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(GeneratorOrNamespace.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], envOptions.asInstanceOf[js.Any])).asInstanceOf[RunContext]
  inline def create(GeneratorOrNamespace: String, settings: RunContextSettings): RunContext = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(GeneratorOrNamespace.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[RunContext]
  inline def create(GeneratorOrNamespace: String, settings: RunContextSettings, envOptions: Options): RunContext = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(GeneratorOrNamespace.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], envOptions.asInstanceOf[js.Any])).asInstanceOf[RunContext]
  inline def create(GeneratorOrNamespace: Constructor[typings.yeomanGenerator.mod.^[GeneratorOptions]]): RunContext = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(GeneratorOrNamespace.asInstanceOf[js.Any]).asInstanceOf[RunContext]
  inline def create(
    GeneratorOrNamespace: Constructor[typings.yeomanGenerator.mod.^[GeneratorOptions]],
    settings: Unit,
    envOptions: Options
  ): RunContext = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(GeneratorOrNamespace.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], envOptions.asInstanceOf[js.Any])).asInstanceOf[RunContext]
  inline def create(
    GeneratorOrNamespace: Constructor[typings.yeomanGenerator.mod.^[GeneratorOptions]],
    settings: RunContextSettings
  ): RunContext = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(GeneratorOrNamespace.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[RunContext]
  inline def create(
    GeneratorOrNamespace: Constructor[typings.yeomanGenerator.mod.^[GeneratorOptions]],
    settings: RunContextSettings,
    envOptions: Options
  ): RunContext = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(GeneratorOrNamespace.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], envOptions.asInstanceOf[js.Any])).asInstanceOf[RunContext]
  
  inline def createDummyGenerator(): typings.yeomanGenerator.mod.^[GeneratorOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("createDummyGenerator")().asInstanceOf[typings.yeomanGenerator.mod.^[GeneratorOptions]]
  
  inline def createGenerator(name: String, dependencies: js.Array[Dependency]): typings.yeomanGenerator.mod.^[GeneratorOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("createGenerator")(name.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any])).asInstanceOf[typings.yeomanGenerator.mod.^[GeneratorOptions]]
  inline def createGenerator(name: String, dependencies: js.Array[Dependency], args: String): typings.yeomanGenerator.mod.^[GeneratorOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("createGenerator")(name.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[typings.yeomanGenerator.mod.^[GeneratorOptions]]
  inline def createGenerator(name: String, dependencies: js.Array[Dependency], args: String, options: Dictionary[Any]): typings.yeomanGenerator.mod.^[GeneratorOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("createGenerator")(name.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.yeomanGenerator.mod.^[GeneratorOptions]]
  inline def createGenerator(name: String, dependencies: js.Array[Dependency], args: js.Array[String]): typings.yeomanGenerator.mod.^[GeneratorOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("createGenerator")(name.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[typings.yeomanGenerator.mod.^[GeneratorOptions]]
  inline def createGenerator(name: String, dependencies: js.Array[Dependency], args: js.Array[String], options: Dictionary[Any]): typings.yeomanGenerator.mod.^[GeneratorOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("createGenerator")(name.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.yeomanGenerator.mod.^[GeneratorOptions]]
  inline def createGenerator(name: String, dependencies: js.Array[Dependency], args: Unit, options: Dictionary[Any]): typings.yeomanGenerator.mod.^[GeneratorOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("createGenerator")(name.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.yeomanGenerator.mod.^[GeneratorOptions]]
  
  inline def gruntfile(options: Dictionary[Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("gruntfile")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def gruntfile(options: Dictionary[Any], done: js.Function1[/* repeated */ Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("gruntfile")(options.asInstanceOf[js.Any], done.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def mockLocalConfig(generator: typings.yeomanGenerator.mod.^[GeneratorOptions], localConfig: Dictionary[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mockLocalConfig")(generator.asInstanceOf[js.Any], localConfig.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def mockPrompt(generator: typings.yeomanGenerator.mod.^[GeneratorOptions], answers: Answers): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mockPrompt")(generator.asInstanceOf[js.Any], answers.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def registerDependencies(env: Env, dependencies: js.Array[Dependency]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerDependencies")(env.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def restorePrompt(generator: typings.yeomanGenerator.mod.^[GeneratorOptions]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("restorePrompt")(generator.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def run(GeneratorOrNamespace: String): RunContext = ^.asInstanceOf[js.Dynamic].applyDynamic("run")(GeneratorOrNamespace.asInstanceOf[js.Any]).asInstanceOf[RunContext]
  inline def run(GeneratorOrNamespace: String, settings: RunContextSettings): RunContext = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(GeneratorOrNamespace.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[RunContext]
  inline def run(GeneratorOrNamespace: Constructor[typings.yeomanGenerator.mod.^[GeneratorOptions]]): RunContext = ^.asInstanceOf[js.Dynamic].applyDynamic("run")(GeneratorOrNamespace.asInstanceOf[js.Any]).asInstanceOf[RunContext]
  inline def run(
    GeneratorOrNamespace: Constructor[typings.yeomanGenerator.mod.^[GeneratorOptions]],
    settings: RunContextSettings
  ): RunContext = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(GeneratorOrNamespace.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[RunContext]
  
  inline def setUpTestDirectory(dir: String): js.Function1[/* done */ js.Function1[/* repeated */ Any, Unit], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("setUpTestDirectory")(dir.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* done */ js.Function1[/* repeated */ Any, Unit], Unit]]
  
  inline def testDirectory(dir: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("testDirectory")(dir.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def testDirectory(dir: String, cb: js.Function1[/* error */ js.UndefOr[Any], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("testDirectory")(dir.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @js.native
  trait Constructor[T]
    extends StObject
       with Instantiable1[/* args (repeated) */ Any, T]
  
  type Dependency = String | (js.Tuple2[typings.yeomanGenerator.mod.^[GeneratorOptions], String])
  
  type Dictionary[T] = StringDictionary[T]
  
  @js.native
  trait Env
    extends typings.yeomanEnvironment.mod.^[Options] {
    
    var queues: js.Array[String] = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - scala.Any because Inheritance from two classes. Inlined 
  - scala.AnyRef because Inheritance from two classes. Inlined 
  - scala.Any because Inheritance from two classes. Inlined getClass, hashCode, eq, equals, toString, ne, notify, notifyAll, wait, wait, wait, clone, finalize
  - js.Any because Inheritance from two classes. Inlined 
  - scala.AnyRef because Inheritance from two classes. Inlined 
  - js.Object because Inheritance from two classes. Inlined 
  - js.Any because Inheritance from two classes. Inlined 
  - org.scalablytyped.runtime.StObject because Inheritance from two classes. Inlined 
  - js.Thenable because Inheritance from two classes. Inlined 
  - js.Object because Inheritance from two classes. Inlined hasOwnProperty, propertyIsEnumerable, valueOf, toLocaleString, isPrototypeOf
  - org.scalablytyped.runtime.Instantiable2 because Inheritance from two classes. Inlined 
  - org.scalablytyped.runtime.Instantiable1 because Inheritance from two classes. Inlined 
  - js.Promise because Inheritance from two classes. Inlined `then`, `then`, executor, `catch`
  - typings.yeomanTest.mod.RunContextConstructor because Inheritance from two classes. Inlined  */ @js.native
  trait RunContext extends EventEmitter {
    
    /**
      * The mocked `inquirer`-answers.
      */
    var answers: Answers = js.native
    
    /**
      * The arguments that are passed to the generator.
      */
    var args: js.Array[String] = js.native
    
    /**
      * Hold the execution until the returned callback is triggered
      * @return Callback to notify the normal execution can resume
      */
    def async(): js.Function0[Unit] = js.native
    
    def `catch`[B](onRejected: js.UndefOr[js.Function1[Any, B | js.Thenable[B]]]): js.Promise[B] = js.native
    
    /**
      * Change directory without deleting directory content.
      * @param  dirPath - Directory path (relative to CWD). Prefer passing an absolute
      *                            file path for predictable results
      * @return run context instance
      */
    def cd(dirPath: String): this.type = js.native
    
    /**
      * Clean the directory used for tests inside inDir/inTmpDir
      */
    def cleanTestDirectory(): Unit = js.native
    
    /**
      * A set of generators this generator depends on.
      */
    var dependencies: js.Array[Dependency] = js.native
    
    /**
      * Register an callback to prepare the destination folder.
      * @param [cb]  - callback who'll receive the folder path as argument
      * @return this - run context instance
      */
    def doInDir(cb: js.Function1[/* folderPath */ String, Unit]): this.type = js.native
    
    val executor: js.Function2[js.Function1[RunResult | js.Thenable[RunResult], ?], js.Function1[Any, ?], ?] = js.native
    
    /**
      * Clean the provided directory, then change directory into it
      * @param  dirPath - Directory path (relative to CWD). Prefer passing an absolute
      *                            file path for predictable results
      * @param [cb] - callback who'll receive the folder path as argument
      * @return run context instance
      */
    def inDir(dirPath: String): this.type = js.native
    def inDir(dirPath: String, cb: js.Function1[/* folderPath */ String, Unit]): this.type = js.native
    
    /**
      * A value indicating whether a current directory has been set.
      */
    var inDirSet: Boolean = js.native
    
    /**
      * Cleanup a temporary directory and change the CWD into it
      *
      * This method is called automatically when creating a RunContext. Only use it if you need
      * to use the callback.
      *
      * @param [cb]  - callback who'll receive the folder path as argument
      * @return this - run context instance
      */
    def inTmpDir(cb: js.Function1[/* folderPath */ String, Unit]): this.type = js.native
    
    /**
      * A set of mocked generators.
      */
    var mockedGenerators: Dictionary[typings.yeomanGenerator.mod.^[GeneratorOptions]] = js.native
    
    /**
      * A value indicating whether the generator ran through.
      */
    var ran: Boolean = js.native
    
    /**
      * Run the generator on the environment and returns the promise.
      * @return Promise
      */
    def run(): js.Promise[RunResult] = js.native
    
    def `then`[B](
      onFulfilled: js.Function1[RunResult, B | js.Thenable[B]],
      onRejected: js.UndefOr[js.Function1[Any, B | js.Thenable[B]]]
    ): js.Promise[B] = js.native
    def `then`[B](onFulfilled: Unit, onRejected: js.UndefOr[js.Function1[Any, B | js.Thenable[B]]]): js.Promise[B] = js.native
    
    /**
      * Return a promise representing the generator run process
      * @return Promise resolved on end or rejected on error
      */
    def toPromise(): js.Promise[RunResult] = js.native
    
    /**
      * Provide arguments to the run context
      * @param  args - command line arguments as Array or space separated string
      */
    def withArguments(args: String): this.type = js.native
    def withArguments(args: js.Array[String]): this.type = js.native
    
    /**
      * Provide dependent generators
      * @param dependencies - paths to the generators dependencies
      * @example
      * var angular = new RunContext('../../app');
      * angular.withGenerators([
      *   '../../common',
      *   '../../controller',
      *   '../../main',
      *   [helpers.createDummyGenerator(), 'testacular:app']
      * ]);
      * angular.on('end', function () {
      *   // assert something
      * });
      */
    def withGenerators(dependencies: js.Array[Dependency]): this.type = js.native
    
    /**
      * Mock the local configuration with the provided config
      * @param  localConfig - should look just like if called config.getAll()
      */
    def withLocalConfig(localConfig: Dictionary[Any]): this.type = js.native
    
    /**
      * Creates mocked generators.
      * @param namespaces - The namespaces of the mocked generators.
      */
    def withMockedGenerators(namespaces: js.Array[String]): this.type = js.native
    
    /**
      * Provide options to the run context
      * @param  options - command line options (e.g. `--opt-one=foo`)
      */
    def withOptions(options: Dictionary[Any]): this.type = js.native
    
    /**
      * Mock the prompt with dummy answers
      * @param  answers - Answers to the prompt questions
      */
    def withPrompts(answers: Answers): this.type = js.native
  }
  
  @js.native
  trait RunContextConstructor
    extends StObject
       with /**
    * This class provide a run context object to façade the complexity involved in setting
    * up a generator for testing
    * @param Generator - Namespace or generator constructor. If the later
    *                                      is provided, then namespace is assumed to be
    *                                      'gen:test' in all cases
    */
  Instantiable1[
          (/* Generator */ Constructor[typings.yeomanGenerator.mod.^[GeneratorOptions]]) | (/* Generator */ String), 
          RunContext
        ]
       with Instantiable2[
          (/* Generator */ Constructor[typings.yeomanGenerator.mod.^[GeneratorOptions]]) | (/* Generator */ String), 
          /* settings */ RunContextSettings, 
          RunContext
        ]
  
  trait RunContextSettings extends StObject {
    
    /**
      * Namespace (only used if Generator is a constructor)
      * @default 'gen:test'
      */
    var namespace: js.UndefOr[String] = js.undefined
    
    /**
      * File path to the generator (only used if Generator is a constructor)
      */
    var resolved: js.UndefOr[String] = js.undefined
    
    /**
      * Automatically run this generator in a tmp dir
      * @default true
      */
    var tmpdir: js.UndefOr[Boolean] = js.undefined
  }
  object RunContextSettings {
    
    inline def apply(): RunContextSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RunContextSettings]
    }
    
    extension [Self <: RunContextSettings](x: Self) {
      
      inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
      
      inline def setResolved(value: String): Self = StObject.set(x, "resolved", value.asInstanceOf[js.Any])
      
      inline def setResolvedUndefined: Self = StObject.set(x, "resolved", js.undefined)
      
      inline def setTmpdir(value: Boolean): Self = StObject.set(x, "tmpdir", value.asInstanceOf[js.Any])
      
      inline def setTmpdirUndefined: Self = StObject.set(x, "tmpdir", js.undefined)
    }
  }
  
  @js.native
  trait RunResult
    extends StObject
       with RunResultOptions {
    
    /**
      * Assert that a file's content is the same as the given string
      * @param file            - path to a file
      * @param expectedContent - the expected content of the file
      * @example
      * result.assertEqualsFileContent(
      *   'data.js',
      *   'const greeting = "Hello";\nexport default { greeting }'
      * );
      *
      * @also
      *
      * Assert that each file in an array of file-string pairs equals its corresponding string
      * @param pairs           - an array of arrays, where each subarray is a [String, String] pair
      * @example
      * result.assertEqualsFileContent([
      *   ['data.js', 'const greeting = "Hello";\nexport default { greeting }'],
      *   ['user.js', 'export default {\n  name: 'Coleman',\n  age: 0\n}']
      * ]);
      */
    def assertEqualsFileContent(file: String, expectedContent: String): Unit = js.native
    def assertEqualsFileContent(pairs: js.Array[js.Tuple2[String, String]]): Unit = js.native
    
    /**
      * Assert that a file exists
      * @param path     - path to a file
      * @example
      * result.assertFile('templates/user.hbs');
      *
      * @also
      *
      * Assert that each files in the array exists
      * @param paths    - an array of paths to files
      * @example
      * result.assertFile(['templates/user.hbs', 'templates/user/edit.hbs']);
      */
    def assertFile(path: String): Unit = js.native
    def assertFile(path: js.Array[String]): Unit = js.native
    
    /**
      * Assert that a file's content matches a regex or string
      * @param file     - path to a file
      * @param reg      - regex / string that will be used to search the file
      * @example
      * result.assertFileContent('models/user.js', /App\.User = DS\.Model\.extend/);
      * result.assertFileContent('models/user.js', 'App.User = DS.Model.extend');
      *
      * @also
      *
      * Assert that each file in an array of file-regex pairs matches its corresponding regex
      * @param pairs    - an array of arrays, where each subarray is a [String, RegExp] pair
      * @example
      * var arg = [
      *   [ 'models/user.js', /App\.User = DS\.Model\.extend/ ],
      *   [ 'controllers/user.js', /App\.UserController = Ember\.ObjectController\.extend/ ]
      * ]
      * result.assertFileContent(arg);
      */
    def assertFileContent(file: String, reg: String): Unit = js.native
    def assertFileContent(file: String, reg: js.RegExp): Unit = js.native
    def assertFileContent(pairs: js.Array[js.Tuple2[String, String | js.RegExp]]): Unit = js.native
    
    /**
      * Assert a JSON file contains the provided keys
      * @param filename
      * @param content An object of key/values the file should contains
      */
    def assertJsonFileContent(filename: String, content: StringDictionary[Any]): Unit = js.native
    
    /**
      * Assert that a file doesn't exist
      * @param file     - path to a file
      * @example
      * result.assertNoFile('templates/user.hbs');
      *
      * @also
      *
      * Assert that each of an array of files doesn't exist
      * @param pairs    - an array of paths to files
      * @example
      * result.assertNoFile(['templates/user.hbs', 'templates/user/edit.hbs']);
      */
    def assertNoFile(file: String): Unit = js.native
    def assertNoFile(file: js.Array[String]): Unit = js.native
    
    def assertNoFileContent(file: String, reg: String): Unit = js.native
    /**
      * Assert that a file's content does not match a regex / string
      * @param file     - path to a file
      * @param reg      - regex / string that will be used to search the file
      * @example
      * result.assertNoFileContent('models/user.js', /App\.User = DS\.Model\.extend/);
      * result.assertNoFileContent('models/user.js', 'App.User = DS.Model.extend');
      *
      * @also
      *
      * Assert that each file in an array of file-regex pairs does not match its corresponding regex
      * @param pairs    - an array of arrays, where each subarray is a [String, RegExp] pair
      * var arg = [
      *   [ 'models/user.js', /App\.User \ DS\.Model\.extend/ ],
      *   [ 'controllers/user.js', /App\.UserController = Ember\.ObjectController\.extend/ ]
      * ]
      * result.assertNoFileContent(arg);
      */
    def assertNoFileContent(file: String, reg: js.RegExp): Unit = js.native
    def assertNoFileContent(pairs: js.Array[js.Tuple2[String, String | js.RegExp]]): Unit = js.native
    
    /**
      * Assert a JSON file does not contain the provided keys
      * @param filename
      * @param content An object of key/values the file should not contain
      */
    def assertNoJsonFileContent(filename: String, content: StringDictionary[Any]): Unit = js.native
    
    /**
      * Assert an object does not contain the provided keys
      * @param obj Object that should not match the given pattern
      * @param content An object of key/values the object should not contain
      */
    def assertNoObjectContent(obj: js.Object, content: StringDictionary[Any]): Unit = js.native
    
    /**
      * Assert an object contains the provided keys
      * @param obj      Object that should match the given pattern
      * @param content  An object of key/values the object should contains
      */
    def assertObjectContent(obj: js.Object, content: StringDictionary[Any]): Unit = js.native
    
    /**
      * Assert that two strings are equal after standardization of newlines
      * @param value    - a string
      * @param expected - the expected value of the string
      * @example
      * result.assertTextEqual('I have a yellow cat', 'I have a yellow cat');
      */
    def assertTextEqual(value: String, expected: String): Unit = js.native
    
    /**
      * Dumps the name of each file to the console.
      */
    def dumpFilenames(): Unit = js.native
    
    /**
      * Either dumps the contents of the specified files or the name and the contents of each file to the console.
      */
    def dumpFiles(files: String*): Unit = js.native
    
    /**
      * The options of this result.
      */
    var options: RunResultOptions = js.native
    
    /**
      * Reverts to old cwd.
      * @returns this
      */
    def restore(): this.type = js.native
  }
  
  trait RunResultOptions extends StObject {
    
    /**
      * The working directory after running the generator.
      */
    var cwd: String
    
    /**
      * The environment of the generator.
      */
    var env: typings.yeomanEnvironment.mod.^[Options]
    
    /**
      * The file-system editor of the generator.
      */
    var fs: Editor
    
    /**
      * The file-system of the generator.
      */
    var memFs: Store
    
    /**
      * The mocked generators of the context.
      */
    var mockedGenerators: Dictionary[typings.yeomanGenerator.mod.^[GeneratorOptions]]
    
    /**
      * The working directory before on running the generator.
      */
    var oldCwd: String
  }
  object RunResultOptions {
    
    inline def apply(
      cwd: String,
      env: typings.yeomanEnvironment.mod.^[Options],
      fs: Editor,
      memFs: Store,
      mockedGenerators: Dictionary[typings.yeomanGenerator.mod.^[GeneratorOptions]],
      oldCwd: String
    ): RunResultOptions = {
      val __obj = js.Dynamic.literal(cwd = cwd.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], fs = fs.asInstanceOf[js.Any], memFs = memFs.asInstanceOf[js.Any], mockedGenerators = mockedGenerators.asInstanceOf[js.Any], oldCwd = oldCwd.asInstanceOf[js.Any])
      __obj.asInstanceOf[RunResultOptions]
    }
    
    extension [Self <: RunResultOptions](x: Self) {
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setEnv(value: typings.yeomanEnvironment.mod.^[Options]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setFs(value: Editor): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
      
      inline def setMemFs(value: Store): Self = StObject.set(x, "memFs", value.asInstanceOf[js.Any])
      
      inline def setMockedGenerators(value: Dictionary[typings.yeomanGenerator.mod.^[GeneratorOptions]]): Self = StObject.set(x, "mockedGenerators", value.asInstanceOf[js.Any])
      
      inline def setOldCwd(value: String): Self = StObject.set(x, "oldCwd", value.asInstanceOf[js.Any])
    }
  }
}
