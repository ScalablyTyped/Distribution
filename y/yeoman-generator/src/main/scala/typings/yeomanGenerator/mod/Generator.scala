package typings.yeomanGenerator.mod

import typings.debug.mod.Debugger
import typings.ejs.mod.Data
import typings.ejs.mod.Options
import typings.memFsEditor.mod.CopyOptions
import typings.memFsEditor.mod.Editor
import typings.memFsEditor.mod.WriteContents
import typings.node.childProcessMod.SpawnOptions
import typings.node.childProcessMod.SpawnSyncOptions
import typings.node.eventsMod.EventEmitter
import typings.node.streamMod.Transform
import typings.std.Parameters
import typings.std.Record
import typings.yeomanGenerator.anon.Fn0
import typings.yeomanGenerator.anon.FnCall
import typings.yeomanGenerator.anon.FnCallFilepathContentsReplacerSpace
import typings.yeomanGenerator.anon.FnCallFilepathDefaults
import typings.yeomanGenerator.anon.FnCallFilepathOptions
import typings.yeomanGenerator.anon.FnCallFromToOptions
import typings.yeomanGenerator.anon.Git
import typings.yeomanGenerator.yeomanGeneratorBooleans.`false`
import typings.yeomanGenerator.yeomanGeneratorBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def bowerInstall(
    component: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    spawnOptions: SpawnOptions
  ): Unit = js.native
  def bowerInstall(component: js.UndefOr[scala.Nothing], options: js.Object): Unit = js.native
  def bowerInstall(component: js.UndefOr[scala.Nothing], options: js.Object, spawnOptions: SpawnOptions): Unit = js.native
  def bowerInstall(component: String): Unit = js.native
  def bowerInstall(component: String, options: js.UndefOr[scala.Nothing], spawnOptions: SpawnOptions): Unit = js.native
  def bowerInstall(component: String, options: js.Object): Unit = js.native
  def bowerInstall(component: String, options: js.Object, spawnOptions: SpawnOptions): Unit = js.native
  def bowerInstall(component: js.Array[String]): Unit = js.native
  def bowerInstall(component: js.Array[String], options: js.UndefOr[scala.Nothing], spawnOptions: SpawnOptions): Unit = js.native
  def bowerInstall(component: js.Array[String], options: js.Object): Unit = js.native
  def bowerInstall(component: js.Array[String], options: js.Object, spawnOptions: SpawnOptions): Unit = js.native
  
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
  def composeWith_false(generators: String, options: js.UndefOr[scala.Nothing], returnNewGenerator: `false`): this.type = js.native
  @JSName("composeWith")
  def composeWith_false(generators: String, options: GeneratorOptions, returnNewGenerator: `false`): this.type = js.native
  @JSName("composeWith")
  def composeWith_false(
    generators: js.Array[CompositionOptions | String],
    options: js.UndefOr[scala.Nothing],
    returnNewGenerator: `false`
  ): this.type = js.native
  @JSName("composeWith")
  def composeWith_false(
    generators: js.Array[CompositionOptions | String],
    options: GeneratorOptions,
    returnNewGenerator: `false`
  ): this.type = js.native
  @JSName("composeWith")
  def composeWith_false(generators: CompositionOptions, options: js.UndefOr[scala.Nothing], returnNewGenerator: `false`): this.type = js.native
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
  def createStorage(storagePath: String, key: js.UndefOr[scala.Nothing], lodashPath: Boolean): typings.yeomanGenerator.storageMod.^ = js.native
  def createStorage(storagePath: String, key: String): typings.yeomanGenerator.storageMod.^ = js.native
  def createStorage(storagePath: String, key: String, lodashPath: Boolean): typings.yeomanGenerator.storageMod.^ = js.native
  
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
  def destinationRoot(rootPath: js.UndefOr[scala.Nothing], skipEnvironment: Boolean): String = js.native
  def destinationRoot(rootPath: String): String = js.native
  def destinationRoot(rootPath: String, skipEnvironment: Boolean): String = js.native
  
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
  def npmInstall(pkgs: js.UndefOr[scala.Nothing], options: js.UndefOr[scala.Nothing], spawnOptions: SpawnOptions): Unit = js.native
  def npmInstall(pkgs: js.UndefOr[scala.Nothing], options: js.Object): Unit = js.native
  def npmInstall(pkgs: js.UndefOr[scala.Nothing], options: js.Object, spawnOptions: SpawnOptions): Unit = js.native
  def npmInstall(pkgs: String): Unit = js.native
  def npmInstall(pkgs: String, options: js.UndefOr[scala.Nothing], spawnOptions: SpawnOptions): Unit = js.native
  def npmInstall(pkgs: String, options: js.Object): Unit = js.native
  def npmInstall(pkgs: String, options: js.Object, spawnOptions: SpawnOptions): Unit = js.native
  def npmInstall(pkgs: js.Array[String]): Unit = js.native
  def npmInstall(pkgs: js.Array[String], options: js.UndefOr[scala.Nothing], spawnOptions: SpawnOptions): Unit = js.native
  def npmInstall(pkgs: js.Array[String], options: js.Object): Unit = js.native
  def npmInstall(pkgs: js.Array[String], options: js.Object, spawnOptions: SpawnOptions): Unit = js.native
  
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
  def queueMethod(method: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
  def queueMethod(
    method: js.Function1[/* repeated */ js.Any, _],
    methodName: js.UndefOr[scala.Nothing],
    queueName: js.UndefOr[scala.Nothing],
    reject: Callback
  ): Unit = js.native
  def queueMethod(
    method: js.Function1[/* repeated */ js.Any, _],
    methodName: js.UndefOr[scala.Nothing],
    queueName: String
  ): Unit = js.native
  def queueMethod(
    method: js.Function1[/* repeated */ js.Any, _],
    methodName: js.UndefOr[scala.Nothing],
    queueName: String,
    reject: Callback
  ): Unit = js.native
  def queueMethod(method: js.Function1[/* repeated */ js.Any, _], methodName: String): Unit = js.native
  def queueMethod(
    method: js.Function1[/* repeated */ js.Any, _],
    methodName: String,
    queueName: js.UndefOr[scala.Nothing],
    reject: Callback
  ): Unit = js.native
  def queueMethod(method: js.Function1[/* repeated */ js.Any, _], methodName: String, queueName: String): Unit = js.native
  def queueMethod(
    method: js.Function1[/* repeated */ js.Any, _],
    methodName: String,
    queueName: String,
    reject: Callback
  ): Unit = js.native
  def queueMethod(method: Record[String, js.Function1[/* repeated */ _, _]]): Unit = js.native
  def queueMethod(
    method: Record[String, js.Function1[/* repeated */ _, _]],
    methodName: js.UndefOr[scala.Nothing],
    queueName: js.UndefOr[scala.Nothing],
    reject: Callback
  ): Unit = js.native
  def queueMethod(
    method: Record[String, js.Function1[/* repeated */ _, _]],
    methodName: js.UndefOr[scala.Nothing],
    queueName: String
  ): Unit = js.native
  def queueMethod(
    method: Record[String, js.Function1[/* repeated */ _, _]],
    methodName: js.UndefOr[scala.Nothing],
    queueName: String,
    reject: Callback
  ): Unit = js.native
  def queueMethod(method: Record[String, js.Function1[/* repeated */ _, _]], methodName: String): Unit = js.native
  def queueMethod(
    method: Record[String, js.Function1[/* repeated */ _, _]],
    methodName: String,
    queueName: js.UndefOr[scala.Nothing],
    reject: Callback
  ): Unit = js.native
  def queueMethod(method: Record[String, js.Function1[/* repeated */ _, _]], methodName: String, queueName: String): Unit = js.native
  def queueMethod(
    method: Record[String, js.Function1[/* repeated */ _, _]],
    methodName: String,
    queueName: String,
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
  def queueTaskGroup(taskGroup: Record[String, js.Function1[/* repeated */ _, _]]): Unit = js.native
  def queueTaskGroup(taskGroup: Record[String, js.Function1[/* repeated */ _, _]], taskOptions: TaskOptions): Unit = js.native
  
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
  def scheduleInstallTask(
    installer: String,
    paths: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    spawnOptions: SpawnOptions
  ): Unit = js.native
  def scheduleInstallTask(installer: String, paths: js.UndefOr[scala.Nothing], options: js.Object): Unit = js.native
  def scheduleInstallTask(
    installer: String,
    paths: js.UndefOr[scala.Nothing],
    options: js.Object,
    spawnOptions: SpawnOptions
  ): Unit = js.native
  def scheduleInstallTask(installer: String, paths: String): Unit = js.native
  def scheduleInstallTask(installer: String, paths: String, options: js.UndefOr[scala.Nothing], spawnOptions: SpawnOptions): Unit = js.native
  def scheduleInstallTask(installer: String, paths: String, options: js.Object): Unit = js.native
  def scheduleInstallTask(installer: String, paths: String, options: js.Object, spawnOptions: SpawnOptions): Unit = js.native
  def scheduleInstallTask(installer: String, paths: js.Array[String]): Unit = js.native
  def scheduleInstallTask(
    installer: String,
    paths: js.Array[String],
    options: js.UndefOr[scala.Nothing],
    spawnOptions: SpawnOptions
  ): Unit = js.native
  def scheduleInstallTask(installer: String, paths: js.Array[String], options: js.Object): Unit = js.native
  def scheduleInstallTask(installer: String, paths: js.Array[String], options: js.Object, spawnOptions: SpawnOptions): Unit = js.native
  
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
  def yarnInstall(pkgs: js.UndefOr[scala.Nothing], options: js.UndefOr[scala.Nothing], spawnOptions: SpawnOptions): Unit = js.native
  def yarnInstall(pkgs: js.UndefOr[scala.Nothing], options: js.Object): Unit = js.native
  def yarnInstall(pkgs: js.UndefOr[scala.Nothing], options: js.Object, spawnOptions: SpawnOptions): Unit = js.native
  def yarnInstall(pkgs: String): Unit = js.native
  def yarnInstall(pkgs: String, options: js.UndefOr[scala.Nothing], spawnOptions: SpawnOptions): Unit = js.native
  def yarnInstall(pkgs: String, options: js.Object): Unit = js.native
  def yarnInstall(pkgs: String, options: js.Object, spawnOptions: SpawnOptions): Unit = js.native
  def yarnInstall(pkgs: js.Array[String]): Unit = js.native
  def yarnInstall(pkgs: js.Array[String], options: js.UndefOr[scala.Nothing], spawnOptions: SpawnOptions): Unit = js.native
  def yarnInstall(pkgs: js.Array[String], options: js.Object): Unit = js.native
  def yarnInstall(pkgs: js.Array[String], options: js.Object, spawnOptions: SpawnOptions): Unit = js.native
}
