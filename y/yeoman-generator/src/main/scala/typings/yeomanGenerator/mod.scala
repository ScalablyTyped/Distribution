package typings.yeomanGenerator

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.debug.mod.Debugger
import typings.ejs.mod.Data
import typings.ejs.mod.Options
import typings.inquirer.mod.DistinctQuestion
import typings.memFsEditor.mod.CopyOptions
import typings.memFsEditor.mod.Editor
import typings.memFsEditor.mod.WriteContents
import typings.node.childProcessMod.SpawnOptions
import typings.node.childProcessMod.SpawnSyncOptions
import typings.node.eventsMod.EventEmitter
import typings.node.streamMod.Transform
import typings.rxjs.mod.Observable_
import typings.std.ArrayConstructor
import typings.std.BooleanConstructor
import typings.std.NumberConstructor
import typings.std.ObjectConstructor
import typings.std.Parameters
import typings.std.Record
import typings.std.StringConstructor
import typings.yeomanGenerator.anon.ExportOption
import typings.yeomanGenerator.anon.Fn0
import typings.yeomanGenerator.anon.FnCall
import typings.yeomanGenerator.anon.FnCallFilepathContentsReplacerSpace
import typings.yeomanGenerator.anon.FnCallFilepathDefaults
import typings.yeomanGenerator.anon.FnCallFilepathOptions
import typings.yeomanGenerator.anon.FnCallFromToOptions
import typings.yeomanGenerator.anon.Git
import typings.yeomanGenerator.anon.Store
import typings.yeomanGenerator.yeomanGeneratorBooleans.`false`
import typings.yeomanGenerator.yeomanGeneratorBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * The `Generator` class provides the common API shared by all generators.
    * It define options, arguments, file, prompt, log, API, etc.
    *
    * Every generator should extend this base class.
    */
  @JSImport("yeoman-generator", JSImport.Namespace)
  @js.native
  class ^[T /* <: GeneratorOptions */] protected () extends Generator[T] {
    def this(args: String, options: T) = this()
    def this(args: js.Array[String], options: T) = this()
  }
  
  /**
    * Represents an answer-hash.
    */
  type Answers = typings.inquirer.mod.Answers
  
  /**
    * Provides options for creating a new argument.
    */
  trait ArgumentConfig extends StObject {
    
    /**
      * The default value of the argument.
      */
    var default: js.UndefOr[js.Any] = js.undefined
    
    /**
      * Description for the argument.
      */
    var description: js.UndefOr[String] = js.undefined
    
    /**
      * A value indicating whether the argument is optional.
      */
    var optional: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A value indicating whether the argument is required.
      */
    var required: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The type of the argument.
      */
    var `type`: js.UndefOr[StringConstructor | NumberConstructor | ArrayConstructor | ObjectConstructor] = js.undefined
  }
  object ArgumentConfig {
    
    inline def apply(): ArgumentConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ArgumentConfig]
    }
    
    extension [Self <: ArgumentConfig](x: Self) {
      
      inline def setDefault(value: js.Any): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
      
      inline def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setType(value: StringConstructor | NumberConstructor | ArrayConstructor | ObjectConstructor): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /**
    * Provides the functionality to handle callbacks.
    */
  type Callback = /**
    * Handles a callback.
    *
    * @param err The error that occurred.
    */
  js.Function1[/* err */ js.Any, Unit]
  
  /**
    * Represents options for composing a generator.
    */
  trait CompositionOptions extends StObject {
    
    /**
      * The constructor of the generator.
      */
    var Generator: GeneratorConstructor
    
    /**
      * The path to the file containing the generator.
      */
    var path: String
  }
  object CompositionOptions {
    
    inline def apply(Generator: GeneratorConstructor, path: String): CompositionOptions = {
      val __obj = js.Dynamic.literal(Generator = Generator.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompositionOptions]
    }
    
    extension [Self <: CompositionOptions](x: Self) {
      
      inline def setGenerator(value: GeneratorConstructor): Self = StObject.set(x, "Generator", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * The `Generator` class provides the common API shared by all generators.
    * It define options, arguments, file, prompt, log, API, etc.
    *
    * Every generator should extend this base class.
    */
  @js.native
  trait Generator[T /* <: GeneratorOptions */] extends EventEmitter {
    
    /**
      * Reads the options or a single option at the specified property-path from the `.yo-rc` config-store.
      *
      * @param path The property-path of the option to get.
      */
    def _templateData(): js.Any = js.native
    def _templateData(path: String): js.Any = js.native
    
    /**
      * The application name.
      */
    var appname: String = js.native
    
    /**
      * Adds an argument to the class and creates an attribute getter for it.
      *
      * Arguments are different from options in several aspects. The first one
      * is how they are parsed from the command line, arguments are retrieved
      * based on their position.
      *
      * Besides, arguments are used inside your code as a property (`this.argument`),
      * while options are all kept in a hash (`this.options`).
      *
      *
      * @param name Argument name.
      * @param config Argument options.
      * @return This generator.
      */
    def argument(name: String, config: ArgumentConfig): this.type = js.native
    
    // actions/help mixin
    /**
      * Generates a help-text for the arguments.
      *
      * @returns A help-text for the arguments.
      */
    def argumentsHelp(): String = js.native
    
    // actions/install mixin
    /**
      * Receives a list of `components` and an `options` object to install through bower.
      *
      * The installation will automatically run during the run loop `install` phase.
      *
      * @param component Components to install
      * @param options Options to pass to `dargs` as arguments
      * @param spawnOptions Options to pass `child_process.spawn`.
      */
    def bowerInstall(): Unit = js.native
    def bowerInstall(component: String): Unit = js.native
    def bowerInstall(component: String, options: js.Object): Unit = js.native
    def bowerInstall(component: String, options: js.Object, spawnOptions: SpawnOptions): Unit = js.native
    def bowerInstall(component: String, options: Unit, spawnOptions: SpawnOptions): Unit = js.native
    def bowerInstall(component: js.Array[String]): Unit = js.native
    def bowerInstall(component: js.Array[String], options: js.Object): Unit = js.native
    def bowerInstall(component: js.Array[String], options: js.Object, spawnOptions: SpawnOptions): Unit = js.native
    def bowerInstall(component: js.Array[String], options: Unit, spawnOptions: SpawnOptions): Unit = js.native
    def bowerInstall(component: Unit, options: js.Object): Unit = js.native
    def bowerInstall(component: Unit, options: js.Object, spawnOptions: SpawnOptions): Unit = js.native
    def bowerInstall(component: Unit, options: Unit, spawnOptions: SpawnOptions): Unit = js.native
    
    /**
      * Cancels all cancellable tasks.
      */
    def cancelCancellableTasks(): Unit = js.native
    
    def composeWith(generators: String): this.type = js.native
    def composeWith(generators: String, options: GeneratorOptions): this.type = js.native
    /**
      * Compose this generator with another one.
      *
      * @param generator The path to the generator module or an object (see examples).
      * @param options The options passed to the Generator.
      * @param returnNewGenerator Returns the created generator instead of returning this.
      * @return This generator or the composed generator when `returnNewGenerator` is `true`.
      *
      * @example
      * this.composeWith('bootstrap', { sass: true });
      *
      * @example
      * this.composeWith(require.resolve('generator-bootstrap/app/main.js'), { sass: true });
      *
      * @example
      * this.composeWith({ Generator: MyGenerator, path: '../generator-bootstrap/app/main.js' }, { sass: true });
      *
      * @returns
      * Either returns this generator or the newly created generator.
      */
    def composeWith(generators: js.Array[CompositionOptions | String]): this.type = js.native
    def composeWith(generators: js.Array[CompositionOptions | String], options: GeneratorOptions): this.type = js.native
    def composeWith(generators: CompositionOptions): this.type = js.native
    def composeWith(generators: CompositionOptions, options: GeneratorOptions): this.type = js.native
    @JSName("composeWith")
    def composeWith_false(generators: String, options: Unit, returnNewGenerator: `false`): this.type = js.native
    @JSName("composeWith")
    def composeWith_false(generators: String, options: GeneratorOptions, returnNewGenerator: `false`): this.type = js.native
    @JSName("composeWith")
    def composeWith_false(generators: js.Array[CompositionOptions | String], options: Unit, returnNewGenerator: `false`): this.type = js.native
    @JSName("composeWith")
    def composeWith_false(
      generators: js.Array[CompositionOptions | String],
      options: GeneratorOptions,
      returnNewGenerator: `false`
    ): this.type = js.native
    @JSName("composeWith")
    def composeWith_false(generators: CompositionOptions, options: Unit, returnNewGenerator: `false`): this.type = js.native
    @JSName("composeWith")
    def composeWith_false(generators: CompositionOptions, options: GeneratorOptions, returnNewGenerator: `false`): this.type = js.native
    @JSName("composeWith")
    def composeWith_true(generators: String, options: GeneratorOptions, returnNewGenerator: `true`): Generator[GeneratorOptions] = js.native
    /**
      * Compose this generator with another one.
      *
      * @param generator The path to the generator module or an object (see examples).
      * @param options The options passed to the Generator.
      * @param returnNewGenerator Returns the created generator instead of returning this.
      * @return This generator or the composed generator when returnNewGenerator=true
      *
      * @example
      * this.composeWith('bootstrap', { sass: true });
      *
      * @example
      * this.composeWith(require.resolve('generator-bootstrap/app/main.js'), { sass: true });
      *
      * @example
      * this.composeWith({ Generator: MyGenerator, path: '../generator-bootstrap/app/main.js' }, { sass: true });
      *
      * @returns
      * Either returns this generator or the newly created generator.
      */
    @JSName("composeWith")
    def composeWith_true(
      generators: js.Array[CompositionOptions | String],
      options: GeneratorOptions,
      returnNewGenerator: `true`
    ): js.Array[Generator[GeneratorOptions]] = js.native
    /**
      * Compose this generator with another one.
      *
      * @param generator The path to the generator module or an object (see examples).
      * @param options The options passed to the Generator.
      * @param returnNewGenerator Returns the created generator instead of returning this.
      * @return This generator or the composed generator when returnNewGenerator=true
      *
      * @example
      * this.composeWith('bootstrap', { sass: true });
      *
      * @example
      * this.composeWith(require.resolve('generator-bootstrap/app/main.js'), { sass: true });
      *
      * @example
      * this.composeWith({ Generator: MyGenerator, path: '../generator-bootstrap/app/main.js' }, { sass: true });
      *
      * @returns
      * Either returns this generator or the newly created generator.
      */
    @JSName("composeWith")
    def composeWith_true(generators: CompositionOptions, options: GeneratorOptions, returnNewGenerator: `true`): Generator[GeneratorOptions] = js.native
    
    /**
      * The `.yo-rc` config file manager.
      */
    var config: typings.yeomanGenerator.storageMod.^ = js.native
    
    /**
      * The path from where the user is running `yo`
      */
    var contextRoot: String = js.native
    
    // actions/fs mixin
    /**
      * Copy file from destination folder to another destination folder.
      * `mem-fs-editor` method's shortcut, for more information see [mem-fs-editor](https://github.com/SBoudrias/mem-fs-editor).
      * Shortcut for:
      * ```js
      * this.fs.copy(this.destinationPath(from), this.destinationPath(to))
      * ```
      */
    var copyDestination: FnCall = js.native
    
    /**
      * Copy file from templates folder to destination folder.
      * `mem-fs-editor` method's shortcut, for more information see [mem-fs-editor](https://github.com/SBoudrias/mem-fs-editor).
      * Shortcut for:
      * ```js
      * this.fs.copy(this.templatePath(from), this.destinationPath(to))
      * ```
      */
    var copyTemplate: FnCall = js.native
    
    /**
      * Creates a new storage.
      *
      * @param storagePath The path to the `json`-file of the storage.
      * @param key The key in which the options are stored inside the `json`.
      * @param lodashPath A value indicating whether the `key` argument should be treated as a lodash path.
      */
    def createStorage(storagePath: String): typings.yeomanGenerator.storageMod.^ = js.native
    def createStorage(storagePath: String, key: String): typings.yeomanGenerator.storageMod.^ = js.native
    def createStorage(storagePath: String, key: String, lodashPath: Boolean): typings.yeomanGenerator.storageMod.^ = js.native
    def createStorage(storagePath: String, key: Unit, lodashPath: Boolean): typings.yeomanGenerator.storageMod.^ = js.native
    
    /**
      * Convenience debug method.
      */
    def debug(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Debugger> is not an array type */ args: Parameters[Debugger]
    ): Unit = js.native
    
    /**
      * Deletes file from destination folder.
      * `mem-fs-editor` method's shortcut, for more information see [mem-fs-editor](https://github.com/SBoudrias/mem-fs-editor).
      * Shortcut for:
      * ```js
      * this.fs.delete(this.destinationPath(filepath))
      * ```
      */
    var deleteDestination: FnCallFilepathOptions = js.native
    
    /**
      * Sets a custom `description` for the help output.
      *
      * @param description The new description.
      */
    def desc(description: String): this.type = js.native
    
    /**
      * The description to display in the `--help` output.
      */
    var description: String = js.native
    
    /**
      * Joins a path to the destination root.
      *
      * @param path The path parts.
      */
    def destinationPath(path: String*): String = js.native
    
    /**
      * Changes the generator destination root directory.
      *
      * This path is used to find storage, when using file system helper methods (such as `this.writeDestination` and `this.copyDestination`).
      *
      * @param rootPath The new destination root path.
      * @param skipEnvironment A value indicating whether `this.env.cwd` and the current working directory shouldn't be changed.
      */
    def destinationRoot(): String = js.native
    def destinationRoot(rootPath: String): String = js.native
    def destinationRoot(rootPath: String, skipEnvironment: Boolean): String = js.native
    def destinationRoot(rootPath: Unit, skipEnvironment: Boolean): String = js.native
    
    /**
      * Determines the name of the application.
      *
      * First checks for the name in `bower.json`, then checks for the name in `package.json`.
      * Finally defaults to the name of the current directory.
      *
      * @returns The name of the application.
      */
    def determineAppname(): String = js.native
    
    /**
      * The current Environment being run.
      */
    var env: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Environment */ js.Any = js.native
    
    /**
      * Checks whether a file exists in the destination folder.
      * `mem-fs-editor` method's shortcut, for more information see [mem-fs-editor](https://github.com/SBoudrias/mem-fs-editor).
      * Shortcut for:
      * ```js
      * this.fs.exists(this.destinationPath(filepath))
      * ```
      */
    var existsDestination: js.Function1[/* filepath */ String, Boolean] = js.native
    
    /**
      * An instance of [`mem-fs-editor`](https://github.com/SBoudrias/mem-fs-editor).
      */
    var fs: Editor = js.native
    
    /**
      * Tries to get the description from a `USAGE` file one folder above the source root, otherwise uses a default description.
      */
    def help(): String = js.native
    
    /**
      * Runs `npm` and `bower`, in sequence, in the generated directory and prints a
      * message to let the user know.
      *
      * @example
      * this.installDependencies({
      *   bower: true,
      *   npm: true
      * }).then(() => console.log('Everything is ready!'));
      *
      * @example
      * this.installDependencies({
      *   yarn: {force: true},
      *   npm: false
      * }).then(() => console.log('Everything is ready!'));
      *
      */
    def installDependencies(): Unit = js.native
    def installDependencies(options: InstallOptions): Unit = js.native
    
    /**
      * Provides the functionality to log messages.
      */
    var log: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Logger */ js.Any = js.native
    
    /**
      * Move file from destination folder to another destination folder.
      * `mem-fs-editor` method's shortcut, for more information see [mem-fs-editor](https://github.com/SBoudrias/mem-fs-editor).
      * Shortcut for:
      * ```js
      * this.fs.move(this.destinationPath(from), this.destinationPath(to))
      * ```
      */
    var moveDestination: FnCallFromToOptions = js.native
    
    /**
      * Receives a list of `packages` and an `options` object to install through npm.
      *
      * The installation will automatically run during the run loop `install` phase.
      *
      * @param pkgs Packages to install
      * @param options Options to pass to `dargs` as arguments
      * @param spawnOptions Options to pass `child_process.spawn`.
      */
    def npmInstall(): Unit = js.native
    def npmInstall(pkgs: String): Unit = js.native
    def npmInstall(pkgs: String, options: js.Object): Unit = js.native
    def npmInstall(pkgs: String, options: js.Object, spawnOptions: SpawnOptions): Unit = js.native
    def npmInstall(pkgs: String, options: Unit, spawnOptions: SpawnOptions): Unit = js.native
    def npmInstall(pkgs: js.Array[String]): Unit = js.native
    def npmInstall(pkgs: js.Array[String], options: js.Object): Unit = js.native
    def npmInstall(pkgs: js.Array[String], options: js.Object, spawnOptions: SpawnOptions): Unit = js.native
    def npmInstall(pkgs: js.Array[String], options: Unit, spawnOptions: SpawnOptions): Unit = js.native
    def npmInstall(pkgs: Unit, options: js.Object): Unit = js.native
    def npmInstall(pkgs: Unit, options: js.Object, spawnOptions: SpawnOptions): Unit = js.native
    def npmInstall(pkgs: Unit, options: Unit, spawnOptions: SpawnOptions): Unit = js.native
    
    /**
      * Adds an option to the set of generator expected options, only used to generate generator usage.
      * By default, generators get all the cli options parsed by nopt as a `this.options` hash object.
      *
      * @param name The name of the option.
      * @param config The configuration of the option.
      * @returns This generator
      */
    def option(name: String, config: OptionConfig): this.type = js.native
    
    /**
      * Provides options at initialization.
      */
    var options: T = js.native
    
    /**
      * Gets help text for options.
      */
    def optionsHelp(): String = js.native
    
    /**
      * Prompt user to answer questions.
      */
    def prompt[T](questions: Questions[T]): js.Promise[T] = js.native
    
    /**
      * Queues the basic tasks of the generator.
      */
    def queueBasicTasks(): Unit = js.native
    
    /**
      * Schedules methods on a run queue.
      *
      * @param method The method or an object containing function properties to schedule.
      * @param methodName The name of the method to be scheduled.
      * @param queueName The name of the queue to schedule on.
      * @param reject A callback for handling rejections.
      */
    def queueMethod(method: js.Function1[/* repeated */ js.Any, js.Any]): Unit = js.native
    def queueMethod(method: js.Function1[/* repeated */ js.Any, js.Any], methodName: String): Unit = js.native
    def queueMethod(method: js.Function1[/* repeated */ js.Any, js.Any], methodName: String, queueName: String): Unit = js.native
    def queueMethod(
      method: js.Function1[/* repeated */ js.Any, js.Any],
      methodName: String,
      queueName: String,
      reject: Callback
    ): Unit = js.native
    def queueMethod(
      method: js.Function1[/* repeated */ js.Any, js.Any],
      methodName: String,
      queueName: Unit,
      reject: Callback
    ): Unit = js.native
    def queueMethod(method: js.Function1[/* repeated */ js.Any, js.Any], methodName: Unit, queueName: String): Unit = js.native
    def queueMethod(
      method: js.Function1[/* repeated */ js.Any, js.Any],
      methodName: Unit,
      queueName: String,
      reject: Callback
    ): Unit = js.native
    def queueMethod(
      method: js.Function1[/* repeated */ js.Any, js.Any],
      methodName: Unit,
      queueName: Unit,
      reject: Callback
    ): Unit = js.native
    def queueMethod(method: Record[String, js.Function1[/* repeated */ js.Any, js.Any]]): Unit = js.native
    def queueMethod(method: Record[String, js.Function1[/* repeated */ js.Any, js.Any]], methodName: String): Unit = js.native
    def queueMethod(
      method: Record[String, js.Function1[/* repeated */ js.Any, js.Any]],
      methodName: String,
      queueName: String
    ): Unit = js.native
    def queueMethod(
      method: Record[String, js.Function1[/* repeated */ js.Any, js.Any]],
      methodName: String,
      queueName: String,
      reject: Callback
    ): Unit = js.native
    def queueMethod(
      method: Record[String, js.Function1[/* repeated */ js.Any, js.Any]],
      methodName: String,
      queueName: Unit,
      reject: Callback
    ): Unit = js.native
    def queueMethod(
      method: Record[String, js.Function1[/* repeated */ js.Any, js.Any]],
      methodName: Unit,
      queueName: String
    ): Unit = js.native
    def queueMethod(
      method: Record[String, js.Function1[/* repeated */ js.Any, js.Any]],
      methodName: Unit,
      queueName: String,
      reject: Callback
    ): Unit = js.native
    def queueMethod(
      method: Record[String, js.Function1[/* repeated */ js.Any, js.Any]],
      methodName: Unit,
      queueName: Unit,
      reject: Callback
    ): Unit = js.native
    
    /**
      * Schedules a task on a run queue.
      *
      * @param task The task to queue.
      */
    def queueTask(task: Task): Unit = js.native
    
    /**
      * Schedules methods on a run queue.
      *
      * @param taskGroup An object containing tasks.
      * @param taskOptions The options for creating the tasks.
      */
    def queueTaskGroup(taskGroup: Record[String, js.Function1[/* repeated */ js.Any, js.Any]]): Unit = js.native
    def queueTaskGroup(taskGroup: Record[String, js.Function1[/* repeated */ js.Any, js.Any]], taskOptions: TaskOptions): Unit = js.native
    
    /**
      * Read file from destination folder.
      * `mem-fs-editor` method's shortcut, for more information see [mem-fs-editor](https://github.com/SBoudrias/mem-fs-editor).
      * Shortcut for:
      * ```js
      * this.fs.read(this.destinationPath(filepath))
      * ```
      */
    var readDestination: Fn0 = js.native
    
    /**
      * Read JSON file from destination folder.
      * `mem-fs-editor` method's shortcut, for more information see [mem-fs-editor](https://github.com/SBoudrias/mem-fs-editor).
      * Shortcut for:
      * ```js
      * this.fs.readJSON(this.destinationPath(filepath))
      * ```
      */
    var readDestinationJSON: FnCallFilepathDefaults = js.native
    
    /**
      * Read file from templates folder.
      * `mem-fs-editor` method's shortcut, for more information see [mem-fs-editor](https://github.com/SBoudrias/mem-fs-editor).
      * Shortcut for:
      * ```js
      * this.fs.read(this.templatePath(filepath))
      * ```
      */
    var readTemplate: Fn0 = js.native
    
    def registerConfigPrompts[TAnswers](questions: js.Array[QuestionRegistrationOptions[TAnswers]]): Unit = js.native
    /**
      * Registers stored config prompts and optional option alternatives.
      *
      * @param questions
      * The questions to register.
      */
    def registerConfigPrompts[TAnswers](questions: QuestionRegistrationOptions[TAnswers]): Unit = js.native
    
    def registerTransformStream(stream: js.Array[Transform]): this.type = js.native
    /**
      * Adds a transform stream to the commit stream.
      *
      * @param stream An array of transform streams or a single one.
      */
    def registerTransformStream(stream: Transform): this.type = js.native
    
    /**
      * Copies a template from templates folder to the destination.
      *
      * @param source The template file, absolute or relative to `templatePath()`.
      * @param destination The destination, absolute or relative to `destinationPath()`.
      * @param templateData The `ejs`-data or the name of the storage-key to get the data from.
      * @param templateOptions The `ejs`-options.
      * @param copyOptions The `mem-fs-editor` copy options.
      */
    def renderTemplate(
      source: String | js.Array[String],
      destination: js.UndefOr[String | js.Array[String]],
      templateData: js.UndefOr[Data | String],
      templateOptions: js.UndefOr[Options | String],
      copyOptions: js.UndefOr[CopyOptions]
    ): Unit = js.native
    
    /**
      * Copies templates from the `templates` folder to the destination.
      *
      * @param templates The template files to copy.
      * @param templateData The ejs data or the name of the storage-key to get the data from.
      */
    def renderTemplates(templates: js.Array[TemplateRenderOptions[this.type]]): Unit = js.native
    def renderTemplates(templates: js.Array[TemplateRenderOptions[this.type]], templateData: String): Unit = js.native
    def renderTemplates(templates: js.Array[TemplateRenderOptions[this.type]], templateData: Data): Unit = js.native
    
    /**
      * The path to the current generator.
      */
    var resolved: String = js.native
    
    /**
      * Determines the root generator name (the one who's extending this generator).
      */
    def rootGeneratorName(): String = js.native
    
    /**
      * Determines the root generator version (the one who's extending this generator).
      */
    def rootGeneratorVersion(): String = js.native
    
    /**
      * Runs the generator, scheduling prototype methods on a run queue.
      * Method names will determine the order each method is run.
      * Methods without special names will run in default queue.
      *
      * Any method named `constructor` and any methods prefixed by a `_` won't be scheduled.
      */
    def run(): js.Promise[Unit] = js.native
    /**
      * Runs the generator, scheduling prototype methods on a run queue.
      * Method names will determine the order each method is run.
      * Methods without special names will run in default queue.
      *
      * Any method named `constructor` and any methods prefixed by a `_` won't be scheduled.
      *
      * @param cb The callback.
      * @deprecated
      */
    // tslint:disable-next-line:unified-signatures
    def run(cb: Callback): js.Promise[Unit] = js.native
    
    /**
      * Combine package manager cmd line arguments and run the `install` command.
      *
      * During the `install` step, every command will be scheduled to run once, on the
      * run loop.
      *
      * @param installer Which package manager to use
      * @param paths Packages to install. Use an empty string for `npm install`
      * @param options Options to pass to `dargs` as arguments
      * @param spawnOptions Options to pass `child_process.spawn`.
      */
    def scheduleInstallTask(installer: String): Unit = js.native
    def scheduleInstallTask(installer: String, paths: String): Unit = js.native
    def scheduleInstallTask(installer: String, paths: String, options: js.Object): Unit = js.native
    def scheduleInstallTask(installer: String, paths: String, options: js.Object, spawnOptions: SpawnOptions): Unit = js.native
    def scheduleInstallTask(installer: String, paths: String, options: Unit, spawnOptions: SpawnOptions): Unit = js.native
    def scheduleInstallTask(installer: String, paths: js.Array[String]): Unit = js.native
    def scheduleInstallTask(installer: String, paths: js.Array[String], options: js.Object): Unit = js.native
    def scheduleInstallTask(installer: String, paths: js.Array[String], options: js.Object, spawnOptions: SpawnOptions): Unit = js.native
    def scheduleInstallTask(installer: String, paths: js.Array[String], options: Unit, spawnOptions: SpawnOptions): Unit = js.native
    def scheduleInstallTask(installer: String, paths: Unit, options: js.Object): Unit = js.native
    def scheduleInstallTask(installer: String, paths: Unit, options: js.Object, spawnOptions: SpawnOptions): Unit = js.native
    def scheduleInstallTask(installer: String, paths: Unit, options: Unit, spawnOptions: SpawnOptions): Unit = js.native
    
    /**
      * Changes the generator source root directory.
      * This path is used by multiple file system methods.
      *
      * @param rootPath The new source root path.
      */
    def sourceRoot(): String = js.native
    def sourceRoot(rootPath: String): String = js.native
    
    // actions/spawn_command mixin
    /**
      * Normalizes a command across OS and spawns it (asynchronously).
      *
      * @param command The program to execute.
      * @param args A list of arguments to pass to the program.
      * @param opt Any cross-spawn options.
      */
    def spawnCommand(command: String, args: js.Array[String]): js.Any = js.native
    def spawnCommand(command: String, args: js.Array[String], opt: SpawnOptions): js.Any = js.native
    
    /**
      * Normalizes a command across the OS and spawns it (synchronously).
      *
      * @param command The program to execute.
      * @param args A list of arguments to pass to the program
      * @param opt Any cross-spawn options.
      */
    def spawnCommandSync(command: String, args: js.Array[String]): js.Any = js.native
    def spawnCommandSync(command: String, args: js.Array[String], opt: SpawnSyncOptions): js.Any = js.native
    
    /**
      * Starts the generator again.
      *
      * @param The options to assign.
      */
    def startOver(): Unit = js.native
    def startOver(options: T): Unit = js.native
    
    /**
      * Joins a path to the source root.
      *
      * @param path The path parts.
      */
    def templatePath(path: String*): String = js.native
    
    /**
      * Gets usage information for this generator, depending on its arguments or options.
      */
    def usage(): String = js.native
    
    // actions/user mixin
    val user: Git = js.native
    
    /**
      * Write file to destination folder
      * `mem-fs-editor` method's shortcut, for more information see [mem-fs-editor](https://github.com/SBoudrias/mem-fs-editor).
      * Shortcut for:
      * ```js
      * this.fs.write(this.destinationPath(filepath))
      * ```
      */
    var writeDestination: js.Function2[/* filepath */ String, /* contents */ WriteContents, String] = js.native
    
    /**
      * Write json file to destination folder
      * `mem-fs-editor` method's shortcut, for more information see [mem-fs-editor](https://github.com/SBoudrias/mem-fs-editor).
      * Shortcut for:
      * ```js
      * this.fs.writeJSON(this.destinationPath(filepath))
      * ```
      */
    var writeDestinationJSON: FnCallFilepathContentsReplacerSpace = js.native
    
    /**
      * Receives a list of `packages` and an `options` object to install through npm.
      *
      * The installation will automatically run during the run loop `install` phase.
      *
      * @param pkgs Packages to install
      * @param options Options to pass to `dargs` as arguments
      * @param spawnOptions Options to pass `child_process.spawn`.
      */
    def yarnInstall(): Unit = js.native
    def yarnInstall(pkgs: String): Unit = js.native
    def yarnInstall(pkgs: String, options: js.Object): Unit = js.native
    def yarnInstall(pkgs: String, options: js.Object, spawnOptions: SpawnOptions): Unit = js.native
    def yarnInstall(pkgs: String, options: Unit, spawnOptions: SpawnOptions): Unit = js.native
    def yarnInstall(pkgs: js.Array[String]): Unit = js.native
    def yarnInstall(pkgs: js.Array[String], options: js.Object): Unit = js.native
    def yarnInstall(pkgs: js.Array[String], options: js.Object, spawnOptions: SpawnOptions): Unit = js.native
    def yarnInstall(pkgs: js.Array[String], options: Unit, spawnOptions: SpawnOptions): Unit = js.native
    def yarnInstall(pkgs: Unit, options: js.Object): Unit = js.native
    def yarnInstall(pkgs: Unit, options: js.Object, spawnOptions: SpawnOptions): Unit = js.native
    def yarnInstall(pkgs: Unit, options: Unit, spawnOptions: SpawnOptions): Unit = js.native
  }
  
  /**
    * Represents a generator-constructor.
    */
  @js.native
  trait GeneratorConstructor
    extends StObject
       with Instantiable1[/* args (repeated) */ js.Any, Generator[js.Any]]
  
  /**
    * Provides options for generators.
    */
  trait GeneratorOptions
    extends StObject
       with /**
    * Gets or sets additional properties.
    */
  /* name */ StringDictionary[js.Any] {
    
    /**
      * Gets or sets a collection of custom priorities.
      */
    var customPriorities: js.UndefOr[js.Array[Priority]] = js.undefined
  }
  object GeneratorOptions {
    
    inline def apply(): GeneratorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GeneratorOptions]
    }
    
    extension [Self <: GeneratorOptions](x: Self) {
      
      inline def setCustomPriorities(value: js.Array[Priority]): Self = StObject.set(x, "customPriorities", value.asInstanceOf[js.Any])
      
      inline def setCustomPrioritiesUndefined: Self = StObject.set(x, "customPriorities", js.undefined)
      
      inline def setCustomPrioritiesVarargs(value: Priority*): Self = StObject.set(x, "customPriorities", js.Array(value :_*))
    }
  }
  
  /**
    * Provides options for performing installations.
    */
  trait InstallOptions extends StObject {
    
    /**
      * A value indicating whether to run `bower install` or options to pass to `dargs` as arguments.
      */
    var bower: js.UndefOr[Boolean | js.Object] = js.undefined
    
    /**
      * A value indicating whether to run `npm install` or options to pass to `dargs` as arguments.
      */
    var npm: js.UndefOr[Boolean | js.Object] = js.undefined
    
    /**
      * A value indicating whether messages should be logged.
      */
    var skipMessage: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A value indicating whether to run `yarn install` or options to pass to `dargs` as arguments.
      */
    var yarn: js.UndefOr[Boolean | js.Object] = js.undefined
  }
  object InstallOptions {
    
    inline def apply(): InstallOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InstallOptions]
    }
    
    extension [Self <: InstallOptions](x: Self) {
      
      inline def setBower(value: Boolean | js.Object): Self = StObject.set(x, "bower", value.asInstanceOf[js.Any])
      
      inline def setBowerUndefined: Self = StObject.set(x, "bower", js.undefined)
      
      inline def setNpm(value: Boolean | js.Object): Self = StObject.set(x, "npm", value.asInstanceOf[js.Any])
      
      inline def setNpmUndefined: Self = StObject.set(x, "npm", js.undefined)
      
      inline def setSkipMessage(value: Boolean): Self = StObject.set(x, "skipMessage", value.asInstanceOf[js.Any])
      
      inline def setSkipMessageUndefined: Self = StObject.set(x, "skipMessage", js.undefined)
      
      inline def setYarn(value: Boolean | js.Object): Self = StObject.set(x, "yarn", value.asInstanceOf[js.Any])
      
      inline def setYarnUndefined: Self = StObject.set(x, "yarn", js.undefined)
    }
  }
  
  /**
    * Provides settings for creating a new generator-option.
    */
  trait OptionConfig extends StObject {
    
    /**
      * The default value.
      */
    var default: js.UndefOr[js.Any] = js.undefined
    
    /**
      * The option name alias (example `-h` and --help`).
      */
    var alias: js.UndefOr[String] = js.undefined
    
    /**
      * The description for the option.
      */
    var description: js.UndefOr[String] = js.undefined
    
    /**
      * A value indicating whether the option should be hidden from the help output.
      */
    var hide: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The storage to persist the option
      */
    var storage: js.UndefOr[typings.yeomanGenerator.storageMod.^] = js.undefined
    
    /**
      * The type of the option.
      */
    var `type`: BooleanConstructor | StringConstructor | NumberConstructor
  }
  object OptionConfig {
    
    inline def apply(`type`: BooleanConstructor | StringConstructor | NumberConstructor): OptionConfig = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionConfig]
    }
    
    extension [Self <: OptionConfig](x: Self) {
      
      inline def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
      
      inline def setDefault(value: js.Any): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setHide(value: Boolean): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
      
      inline def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
      
      inline def setStorage(value: typings.yeomanGenerator.storageMod.^): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
      
      inline def setStorageUndefined: Self = StObject.set(x, "storage", js.undefined)
      
      inline def setType(value: BooleanConstructor | StringConstructor | NumberConstructor): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Provides a priority-specification for a custom queue.
    */
  trait Priority extends StObject {
    
    /**
      * The name of the queue which this priority should be added before.
      */
    var before: String
    
    /**
      * The name of the method to execute.
      */
    var priorityName: String
    
    /**
      * The name for identifying the queue.
      */
    var queueName: js.UndefOr[String] = js.undefined
  }
  object Priority {
    
    inline def apply(before: String, priorityName: String): Priority = {
      val __obj = js.Dynamic.literal(before = before.asInstanceOf[js.Any], priorityName = priorityName.asInstanceOf[js.Any])
      __obj.asInstanceOf[Priority]
    }
    
    extension [Self <: Priority](x: Self) {
      
      inline def setBefore(value: String): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
      
      inline def setPriorityName(value: String): Self = StObject.set(x, "priorityName", value.asInstanceOf[js.Any])
      
      inline def setQueueName(value: String): Self = StObject.set(x, "queueName", value.asInstanceOf[js.Any])
      
      inline def setQueueNameUndefined: Self = StObject.set(x, "queueName", js.undefined)
    }
  }
  
  /**
    * Represents a question.
    */
  type Question[T /* <: Answers */] = DistinctQuestion[T] & Store
  
  /**
    * Provides options for registering a prompt.
    */
  type QuestionRegistrationOptions[T /* <: Answers */] = Question[T] & ExportOption
  
  /**
    * Provides a set of questions.
    */
  type Questions[A /* <: Answers */] = Question[A] | js.Array[Question[A]] | Observable_[Question[A]]
  
  /**
    * Provides options for queues.
    */
  trait QueueOptions extends StObject {
    
    /**
      * A value indicating whether the queue should be executed only once per namespace and task-name.
      */
    var once: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The name of the queue.
      */
    var queueName: js.UndefOr[String] = js.undefined
    
    /**
      * A value indicating whether the queue should be executed if not running yet.
      */
    var run: js.UndefOr[Boolean] = js.undefined
  }
  object QueueOptions {
    
    inline def apply(): QueueOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QueueOptions]
    }
    
    extension [Self <: QueueOptions](x: Self) {
      
      inline def setOnce(value: Boolean): Self = StObject.set(x, "once", value.asInstanceOf[js.Any])
      
      inline def setOnceUndefined: Self = StObject.set(x, "once", js.undefined)
      
      inline def setQueueName(value: String): Self = StObject.set(x, "queueName", value.asInstanceOf[js.Any])
      
      inline def setQueueNameUndefined: Self = StObject.set(x, "queueName", js.undefined)
      
      inline def setRun(value: Boolean): Self = StObject.set(x, "run", value.asInstanceOf[js.Any])
      
      inline def setRunUndefined: Self = StObject.set(x, "run", js.undefined)
    }
  }
  
  /**
    * Represents a task.
    */
  trait Task
    extends StObject
       with TaskOptions {
    
    /**
      * The function to queue.
      */
    def method(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: js.Any
    ): js.Any
    
    /**
      * The name of the task.
      */
    var taskName: String
  }
  object Task {
    
    inline def apply(method: js.Any => js.Any, taskName: String): Task = {
      val __obj = js.Dynamic.literal(method = js.Any.fromFunction1(method), taskName = taskName.asInstanceOf[js.Any])
      __obj.asInstanceOf[Task]
    }
    
    extension [Self <: Task](x: Self) {
      
      inline def setMethod(value: js.Any => js.Any): Self = StObject.set(x, "method", js.Any.fromFunction1(value))
      
      inline def setTaskName(value: String): Self = StObject.set(x, "taskName", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Provides options for tasks.
    */
  trait TaskOptions
    extends StObject
       with QueueOptions {
    
    /**
      * A method for handling errors.
      */
    var reject: js.UndefOr[Callback] = js.undefined
  }
  object TaskOptions {
    
    inline def apply(): TaskOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TaskOptions]
    }
    
    extension [Self <: TaskOptions](x: Self) {
      
      inline def setReject(value: /* err */ js.Any => Unit): Self = StObject.set(x, "reject", js.Any.fromFunction1(value))
      
      inline def setRejectUndefined: Self = StObject.set(x, "reject", js.undefined)
    }
  }
  
  /**
    * Provides settings for rendering a template.
    */
  trait TemplateRenderOptions[T /* <: Generator[js.Any] */] extends StObject {
    
    /**
      * The `mem-fs-editor` copy-options.
      */
    var copyOptions: js.UndefOr[CopyOptions] = js.undefined
    
    /**
      * The destination, absolute or relative to `destinationPath()`.
      */
    var destination: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /**
      * The template file, absolute or relative to `templatePath()`.
      */
    var source: String | js.Array[String]
    
    /**
      * The `ejs` options.
      */
    var templateOptions: js.UndefOr[Options] = js.undefined
    
    /**
      * A method for determining whether the template should be rendered.
      */
    var when: js.UndefOr[js.Function2[/* templateData */ Data, /* generator */ T, Boolean]] = js.undefined
  }
  object TemplateRenderOptions {
    
    inline def apply[T /* <: Generator[js.Any] */](source: String | js.Array[String]): TemplateRenderOptions[T] = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[TemplateRenderOptions[T]]
    }
    
    extension [Self <: TemplateRenderOptions[?], T /* <: Generator[js.Any] */](x: Self & TemplateRenderOptions[T]) {
      
      inline def setCopyOptions(value: CopyOptions): Self = StObject.set(x, "copyOptions", value.asInstanceOf[js.Any])
      
      inline def setCopyOptionsUndefined: Self = StObject.set(x, "copyOptions", js.undefined)
      
      inline def setDestination(value: String | js.Array[String]): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
      
      inline def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
      
      inline def setDestinationVarargs(value: String*): Self = StObject.set(x, "destination", js.Array(value :_*))
      
      inline def setSource(value: String | js.Array[String]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceVarargs(value: String*): Self = StObject.set(x, "source", js.Array(value :_*))
      
      inline def setTemplateOptions(value: Options): Self = StObject.set(x, "templateOptions", value.asInstanceOf[js.Any])
      
      inline def setTemplateOptionsUndefined: Self = StObject.set(x, "templateOptions", js.undefined)
      
      inline def setWhen(value: (/* templateData */ Data, /* generator */ T) => Boolean): Self = StObject.set(x, "when", js.Any.fromFunction2(value))
      
      inline def setWhenUndefined: Self = StObject.set(x, "when", js.undefined)
    }
  }
}
