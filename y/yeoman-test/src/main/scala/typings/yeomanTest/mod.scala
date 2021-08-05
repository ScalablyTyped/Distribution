package typings.yeomanTest

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import typings.node.eventsMod.EventEmitter
import typings.yeomanGenerator.mod.Answers
import typings.yeomanGenerator.mod.GeneratorOptions
import typings.yeomanTest.anon.FnCall
import typings.yeomanTest.anon.FnCallOnrejected
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("yeoman-test", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createDummyGenerator(): typings.yeomanGenerator.mod.^[GeneratorOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("createDummyGenerator")().asInstanceOf[typings.yeomanGenerator.mod.^[GeneratorOptions]]
  
  inline def createGenerator(name: String, dependencies: js.Array[Dependency]): typings.yeomanGenerator.mod.^[GeneratorOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("createGenerator")(name.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any])).asInstanceOf[typings.yeomanGenerator.mod.^[GeneratorOptions]]
  inline def createGenerator(name: String, dependencies: js.Array[Dependency], args: String): typings.yeomanGenerator.mod.^[GeneratorOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("createGenerator")(name.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[typings.yeomanGenerator.mod.^[GeneratorOptions]]
  inline def createGenerator(name: String, dependencies: js.Array[Dependency], args: String, options: Dictionary[js.Any]): typings.yeomanGenerator.mod.^[GeneratorOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("createGenerator")(name.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.yeomanGenerator.mod.^[GeneratorOptions]]
  inline def createGenerator(name: String, dependencies: js.Array[Dependency], args: js.Array[String]): typings.yeomanGenerator.mod.^[GeneratorOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("createGenerator")(name.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[typings.yeomanGenerator.mod.^[GeneratorOptions]]
  inline def createGenerator(
    name: String,
    dependencies: js.Array[Dependency],
    args: js.Array[String],
    options: Dictionary[js.Any]
  ): typings.yeomanGenerator.mod.^[GeneratorOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("createGenerator")(name.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.yeomanGenerator.mod.^[GeneratorOptions]]
  inline def createGenerator(name: String, dependencies: js.Array[Dependency], args: Unit, options: Dictionary[js.Any]): typings.yeomanGenerator.mod.^[GeneratorOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("createGenerator")(name.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.yeomanGenerator.mod.^[GeneratorOptions]]
  
  inline def gruntfile(options: Dictionary[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("gruntfile")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def gruntfile(options: Dictionary[js.Any], done: js.Function1[/* repeated */ js.Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("gruntfile")(options.asInstanceOf[js.Any], done.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def mockLocalConfig(generator: typings.yeomanGenerator.mod.^[GeneratorOptions], localConfig: Dictionary[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mockLocalConfig")(generator.asInstanceOf[js.Any], localConfig.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
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
  
  inline def setUpTestDirectory(dir: String): js.Function1[/* done */ js.Function1[/* repeated */ js.Any, Unit], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("setUpTestDirectory")(dir.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* done */ js.Function1[/* repeated */ js.Any, Unit], Unit]]
  
  inline def testDirectory(dir: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("testDirectory")(dir.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def testDirectory(dir: String, cb: js.Function1[/* error */ js.UndefOr[js.Any], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("testDirectory")(dir.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @js.native
  trait Constructor[T]
    extends StObject
       with Instantiable1[/* args (repeated) */ js.Any, T]
  
  type Dependency = String | (js.Tuple2[typings.yeomanGenerator.mod.^[GeneratorOptions], String])
  
  type Dictionary[T] = StringDictionary[T]
  
  @js.native
  trait Env extends EventEmitter {
    
    def enforceUpdate(env: Env): this.type = js.native
    
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
  - js.Object because Inheritance from two classes. Inlined hasOwnProperty, propertyIsEnumerable, valueOf, toLocaleString, isPrototypeOf
  - org.scalablytyped.runtime.Instantiable2 because Inheritance from two classes. Inlined 
  - org.scalablytyped.runtime.Instantiable1 because Inheritance from two classes. Inlined 
  - typings.yeomanTest.mod.RunContextConstructor because Inheritance from two classes. Inlined  */ @js.native
  trait RunContext extends EventEmitter {
    
    var answers: Answers = js.native
    
    var args: js.Array[String] = js.native
    
    /**
      * Hold the execution until the returned callback is triggered
      * @return Callback to notify the normal execution can resume
      */
    def async(): js.Function0[Unit] = js.native
    
    /**
      * Promise `.catch()` duck typing
      */
    var `catch`: FnCallOnrejected = js.native
    
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
    
    var dependencies: js.Array[Dependency] = js.native
    
    /**
      * Clean the provided directory, then change directory into it
      * @param  dirPath - Directory path (relative to CWD). Prefer passing an absolute
      *                            file path for predictable results
      * @param [cb] - callback who'll receive the folder path as argument
      * @return run context instance
      */
    def inDir(dirPath: String): this.type = js.native
    def inDir(dirPath: String, cb: js.Function1[/* folderPath */ String, Unit]): this.type = js.native
    
    var inDirSet: Boolean = js.native
    
    /**
      * Cleanup a temporary directory and change the CWD into it
      *
      * This method is called automatically when creating a RunContext. Only use it if you need
      * to use the callback.
      *
      * @param [cb] - callback who'll receive the folder path as argument
      * @return run context instance
      */
    def inTmpDir(cb: js.Function1[/* folderPath */ String, Unit]): this.type = js.native
    
    var ran: Boolean = js.native
    
    /**
      * Promise `.then()` duck typing
      */
    var `then`: FnCall = js.native
    
    /**
      * Return a promise representing the generator run process
      * @return Promise resolved on end or rejected on error
      */
    def toPromise(): js.Promise[String] = js.native
    
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
    def withLocalConfig(localConfig: Dictionary[js.Any]): this.type = js.native
    
    /**
      * Provide options to the run context
      * @param  options - command line options (e.g. `--opt-one=foo`)
      */
    def withOptions(options: Dictionary[js.Any]): this.type = js.native
    
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
}
