package typings.yeomanTest

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import typings.node.eventsMod.EventEmitter
import typings.yeomanGenerator.mod.Answers
import typings.yeomanGenerator.mod.GeneratorOptions
import typings.yeomanGenerator.mod.^
import typings.yeomanTest.anon.FnCall
import typings.yeomanTest.anon.FnCallOnrejected
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("yeoman-test", "createDummyGenerator")
  @js.native
  def createDummyGenerator(): ^[GeneratorOptions] = js.native
  
  @JSImport("yeoman-test", "createGenerator")
  @js.native
  def createGenerator(name: String, dependencies: js.Array[Dependency]): ^[GeneratorOptions] = js.native
  @JSImport("yeoman-test", "createGenerator")
  @js.native
  def createGenerator(
    name: String,
    dependencies: js.Array[Dependency],
    args: js.UndefOr[scala.Nothing],
    options: Dictionary[_]
  ): ^[GeneratorOptions] = js.native
  @JSImport("yeoman-test", "createGenerator")
  @js.native
  def createGenerator(name: String, dependencies: js.Array[Dependency], args: String): ^[GeneratorOptions] = js.native
  @JSImport("yeoman-test", "createGenerator")
  @js.native
  def createGenerator(name: String, dependencies: js.Array[Dependency], args: String, options: Dictionary[_]): ^[GeneratorOptions] = js.native
  @JSImport("yeoman-test", "createGenerator")
  @js.native
  def createGenerator(name: String, dependencies: js.Array[Dependency], args: js.Array[String]): ^[GeneratorOptions] = js.native
  @JSImport("yeoman-test", "createGenerator")
  @js.native
  def createGenerator(name: String, dependencies: js.Array[Dependency], args: js.Array[String], options: Dictionary[_]): ^[GeneratorOptions] = js.native
  
  @JSImport("yeoman-test", "gruntfile")
  @js.native
  def gruntfile(options: Dictionary[_]): Unit = js.native
  @JSImport("yeoman-test", "gruntfile")
  @js.native
  def gruntfile(options: Dictionary[_], done: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  
  @JSImport("yeoman-test", "mockLocalConfig")
  @js.native
  def mockLocalConfig(generator: ^[GeneratorOptions], localConfig: Dictionary[_]): Unit = js.native
  
  @JSImport("yeoman-test", "mockPrompt")
  @js.native
  def mockPrompt(generator: ^[GeneratorOptions], answers: Answers): Unit = js.native
  
  @JSImport("yeoman-test", "registerDependencies")
  @js.native
  def registerDependencies(env: Env, dependencies: js.Array[Dependency]): Unit = js.native
  
  @JSImport("yeoman-test", "restorePrompt")
  @js.native
  def restorePrompt(generator: ^[GeneratorOptions]): Unit = js.native
  
  @JSImport("yeoman-test", "run")
  @js.native
  def run(GeneratorOrNamespace: String): RunContext = js.native
  @JSImport("yeoman-test", "run")
  @js.native
  def run(GeneratorOrNamespace: String, settings: RunContextSettings): RunContext = js.native
  @JSImport("yeoman-test", "run")
  @js.native
  def run(GeneratorOrNamespace: Constructor[^[GeneratorOptions]]): RunContext = js.native
  @JSImport("yeoman-test", "run")
  @js.native
  def run(GeneratorOrNamespace: Constructor[^[GeneratorOptions]], settings: RunContextSettings): RunContext = js.native
  
  @JSImport("yeoman-test", "setUpTestDirectory")
  @js.native
  def setUpTestDirectory(dir: String): js.Function1[/* done */ js.Function1[/* repeated */ js.Any, Unit], Unit] = js.native
  
  @JSImport("yeoman-test", "testDirectory")
  @js.native
  def testDirectory(dir: String): Unit = js.native
  @JSImport("yeoman-test", "testDirectory")
  @js.native
  def testDirectory(dir: String, cb: js.Function1[/* error */ js.UndefOr[js.Any], Unit]): Unit = js.native
  
  @js.native
  trait Constructor[T]
    extends Instantiable1[/* args (repeated) */ js.Any, T]
  
  type Dependency = String | (js.Tuple2[^[GeneratorOptions], String])
  
  type Dictionary[T] = StringDictionary[T]
  
  @js.native
  trait Env extends EventEmitter {
    
    def enforceUpdate(env: Env): this.type = js.native
    
    var queues: js.Array[String] = js.native
  }
  
  @js.native
  trait RunContext
    extends EventEmitter
       with RunContextConstructor {
    
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
    def withLocalConfig(localConfig: Dictionary[_]): this.type = js.native
    
    /**
      * Provide options to the run context
      * @param  options - command line options (e.g. `--opt-one=foo`)
      */
    def withOptions(options: Dictionary[_]): this.type = js.native
    
    /**
      * Mock the prompt with dummy answers
      * @param  answers - Answers to the prompt questions
      */
    def withPrompts(answers: Answers): this.type = js.native
  }
  
  @js.native
  trait RunContextConstructor
    extends /**
    * This class provide a run context object to façade the complexity involved in setting
    * up a generator for testing
    * @param Generator - Namespace or generator constructor. If the later
    *                                      is provided, then namespace is assumed to be
    *                                      'gen:test' in all cases
    */
  Instantiable1[
          (/* Generator */ Constructor[^[GeneratorOptions]]) | (/* Generator */ String), 
          RunContext
        ]
       with Instantiable2[
          (/* Generator */ Constructor[^[GeneratorOptions]]) | (/* Generator */ String), 
          /* settings */ RunContextSettings, 
          RunContext
        ]
  
  @js.native
  trait RunContextSettings extends StObject {
    
    /**
      * Namespace (only used if Generator is a constructor)
      * @default 'gen:test'
      */
    var namespace: js.UndefOr[String] = js.native
    
    /**
      * File path to the generator (only used if Generator is a constructor)
      */
    var resolved: js.UndefOr[String] = js.native
    
    /**
      * Automatically run this generator in a tmp dir
      * @default true
      */
    var tmpdir: js.UndefOr[Boolean] = js.native
  }
  object RunContextSettings {
    
    @scala.inline
    def apply(): RunContextSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RunContextSettings]
    }
    
    @scala.inline
    implicit class RunContextSettingsMutableBuilder[Self <: RunContextSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
      
      @scala.inline
      def setResolved(value: String): Self = StObject.set(x, "resolved", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolvedUndefined: Self = StObject.set(x, "resolved", js.undefined)
      
      @scala.inline
      def setTmpdir(value: Boolean): Self = StObject.set(x, "tmpdir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTmpdirUndefined: Self = StObject.set(x, "tmpdir", js.undefined)
    }
  }
}
