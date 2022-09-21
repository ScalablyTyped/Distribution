package typings.yeomanEnvironment

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import typings.commander.mod.Command
import typings.execa.mod.ExecaChildProcess
import typings.execa.mod.ExecaSyncReturnValue
import typings.execa.mod.SyncOptions
import typings.inquirer.mod.DistinctQuestion
import typings.inquirer.mod.QuestionCollection
import typings.memFs.mod.Store
import typings.node.eventsMod.EventEmitter
import typings.node.streamMod.Stream
import typings.node.streamMod.Transform
import typings.std.Console
import typings.std.ReadableStream
import typings.std.Record
import typings.yeomanEnvironment.conflicterMod.ConflicterOptions
import typings.yeomanEnvironment.logMod.DefaultCategories
import typings.yeomanEnvironment.yeomanEnvironmentBooleans.`false`
import typings.yeomanEnvironment.yeomanEnvironmentBooleans.`true`
import typings.yeomanGenerator.mod.GeneratorConstructor
import typings.yeomanGenerator.mod.GeneratorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * `Environment` object is responsible of handling the lifecycle and bootstrap
    * of generators in a specific environment (your app).
    *
    * It provides a high-level API to create and run generators, as well as further
    * tuning where and how a generator is resolved.
    *
    * An environment is created using a list of `arguments` and a Hash of `options`.
    * Usually, this is the list of arguments you get back from your CLI options parser.
    *
    * An optional adapter can be passed to provide interaction in non-CLI environment
    * (e.g. IDE plugins), otherwise a `TerminalAdapter` is instantiated by default
    */
  @JSImport("yeoman-environment", JSImport.Namespace)
  @js.native
  /**
    * Initializes a new instance of the `Environment` class.
    *
    * @param args The arguments to pass to the environment.
    * @param opts The options for the environment.
    * @param adapter A `TerminalAdapter` instance for handling input/output.
    */
  open class ^[TOptions /* <: Options */] () extends Environment[TOptions] {
    def this(args: String) = this()
    def this(args: js.Array[String]) = this()
    def this(args: String, opts: TOptions) = this()
    def this(args: js.Array[String], opts: TOptions) = this()
    def this(args: Unit, opts: TOptions) = this()
    def this(args: String, opts: TOptions, adapter: Adapter) = this()
    def this(args: String, opts: Unit, adapter: Adapter) = this()
    def this(args: js.Array[String], opts: TOptions, adapter: Adapter) = this()
    def this(args: js.Array[String], opts: Unit, adapter: Adapter) = this()
    def this(args: Unit, opts: TOptions, adapter: Adapter) = this()
    def this(args: Unit, opts: Unit, adapter: Adapter) = this()
  }
  @JSImport("yeoman-environment", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new `Environment` instance.
    *
    * @param args The arguments to pass to the environment.
    * @param opts The options for the environment.
    * @param adapter A `TerminalAdapter` instance for handling input/output.
    * @returns The newly created environment.
    */
  /* static member */
  inline def createEnv[TOptions /* <: Options */](): Environment[TOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("createEnv")().asInstanceOf[Environment[TOptions]]
  inline def createEnv[TOptions /* <: Options */](args: String): Environment[TOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("createEnv")(args.asInstanceOf[js.Any]).asInstanceOf[Environment[TOptions]]
  inline def createEnv[TOptions /* <: Options */](args: String, opts: TOptions): Environment[TOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("createEnv")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Environment[TOptions]]
  inline def createEnv[TOptions /* <: Options */](args: String, opts: TOptions, adapter: Adapter): Environment[TOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("createEnv")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], adapter.asInstanceOf[js.Any])).asInstanceOf[Environment[TOptions]]
  inline def createEnv[TOptions /* <: Options */](args: String, opts: Unit, adapter: Adapter): Environment[TOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("createEnv")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], adapter.asInstanceOf[js.Any])).asInstanceOf[Environment[TOptions]]
  inline def createEnv[TOptions /* <: Options */](args: js.Array[String]): Environment[TOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("createEnv")(args.asInstanceOf[js.Any]).asInstanceOf[Environment[TOptions]]
  inline def createEnv[TOptions /* <: Options */](args: js.Array[String], opts: TOptions): Environment[TOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("createEnv")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Environment[TOptions]]
  inline def createEnv[TOptions /* <: Options */](args: js.Array[String], opts: TOptions, adapter: Adapter): Environment[TOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("createEnv")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], adapter.asInstanceOf[js.Any])).asInstanceOf[Environment[TOptions]]
  inline def createEnv[TOptions /* <: Options */](args: js.Array[String], opts: Unit, adapter: Adapter): Environment[TOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("createEnv")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], adapter.asInstanceOf[js.Any])).asInstanceOf[Environment[TOptions]]
  inline def createEnv[TOptions /* <: Options */](args: Unit, opts: TOptions): Environment[TOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("createEnv")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Environment[TOptions]]
  inline def createEnv[TOptions /* <: Options */](args: Unit, opts: TOptions, adapter: Adapter): Environment[TOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("createEnv")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], adapter.asInstanceOf[js.Any])).asInstanceOf[Environment[TOptions]]
  inline def createEnv[TOptions /* <: Options */](args: Unit, opts: Unit, adapter: Adapter): Environment[TOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("createEnv")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], adapter.asInstanceOf[js.Any])).asInstanceOf[Environment[TOptions]]
  
  /**
    * Creates a new `Environment` instance with the specified `version`.
    *
    * @param version The version of the environment.
    * @param args The arguments to pass to the environment.
    * @param opts The options for the environment.
    * @param adapter A `TerminalAdapter` instance for handling input/output.
    * @returns The newly created environment.
    */
  /* static member */
  inline def createEnvWithVersion[TOptions /* <: Options */](version: String): Environment[TOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("createEnvWithVersion")(version.asInstanceOf[js.Any]).asInstanceOf[Environment[TOptions]]
  inline def createEnvWithVersion[TOptions /* <: Options */](version: String, args: String): Environment[TOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("createEnvWithVersion")(version.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Environment[TOptions]]
  inline def createEnvWithVersion[TOptions /* <: Options */](version: String, args: String, opts: TOptions): Environment[TOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("createEnvWithVersion")(version.asInstanceOf[js.Any], args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Environment[TOptions]]
  inline def createEnvWithVersion[TOptions /* <: Options */](version: String, args: String, opts: TOptions, adapter: Adapter): Environment[TOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("createEnvWithVersion")(version.asInstanceOf[js.Any], args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], adapter.asInstanceOf[js.Any])).asInstanceOf[Environment[TOptions]]
  inline def createEnvWithVersion[TOptions /* <: Options */](version: String, args: String, opts: Unit, adapter: Adapter): Environment[TOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("createEnvWithVersion")(version.asInstanceOf[js.Any], args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], adapter.asInstanceOf[js.Any])).asInstanceOf[Environment[TOptions]]
  inline def createEnvWithVersion[TOptions /* <: Options */](version: String, args: js.Array[String]): Environment[TOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("createEnvWithVersion")(version.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Environment[TOptions]]
  inline def createEnvWithVersion[TOptions /* <: Options */](version: String, args: js.Array[String], opts: TOptions): Environment[TOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("createEnvWithVersion")(version.asInstanceOf[js.Any], args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Environment[TOptions]]
  inline def createEnvWithVersion[TOptions /* <: Options */](version: String, args: js.Array[String], opts: TOptions, adapter: Adapter): Environment[TOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("createEnvWithVersion")(version.asInstanceOf[js.Any], args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], adapter.asInstanceOf[js.Any])).asInstanceOf[Environment[TOptions]]
  inline def createEnvWithVersion[TOptions /* <: Options */](version: String, args: js.Array[String], opts: Unit, adapter: Adapter): Environment[TOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("createEnvWithVersion")(version.asInstanceOf[js.Any], args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], adapter.asInstanceOf[js.Any])).asInstanceOf[Environment[TOptions]]
  inline def createEnvWithVersion[TOptions /* <: Options */](version: String, args: Unit, opts: TOptions): Environment[TOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("createEnvWithVersion")(version.asInstanceOf[js.Any], args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Environment[TOptions]]
  inline def createEnvWithVersion[TOptions /* <: Options */](version: String, args: Unit, opts: TOptions, adapter: Adapter): Environment[TOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("createEnvWithVersion")(version.asInstanceOf[js.Any], args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], adapter.asInstanceOf[js.Any])).asInstanceOf[Environment[TOptions]]
  inline def createEnvWithVersion[TOptions /* <: Options */](version: String, args: Unit, opts: Unit, adapter: Adapter): Environment[TOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("createEnvWithVersion")(version.asInstanceOf[js.Any], args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], adapter.asInstanceOf[js.Any])).asInstanceOf[Environment[TOptions]]
  
  /**
    * Makes sure the Environment present expected methods if an old version is passed to a Generator.
    *
    * @param env The environment to update.
    * @returns The updated `env`.
    */
  /* static member */
  inline def enforceUpdate[TEnv /* <: Environment[Options] */](env: TEnv): TEnv = ^.asInstanceOf[js.Dynamic].applyDynamic("enforceUpdate")(env.asInstanceOf[js.Any]).asInstanceOf[TEnv]
  
  /**
    * Invokes a lookup for a specific generator.
    *
    * @param namespace The namespace of the generator to search.
    * @param options Options for searching the generator.
    * @returns The path to the generator which was found.
    */
  /* static member */
  inline def lookupGenerator(namespace: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("lookupGenerator")(namespace.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def lookupGenerator(namespace: String, options: ArrayGeneratorLookupOptions): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookupGenerator")(namespace.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def lookupGenerator(namespace: String, options: SingleGeneratorLookupOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("lookupGenerator")(namespace.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * Invokes a lookup for a specific generator.
    *
    * @param namespace The namespace of the generator to search.
    * @param options Options for searching the generator.
    * @returns The paths to the generators which were found.
    */
  /* static member */
  inline def lookupGenerator_Array(namespace: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("lookupGenerator")(namespace.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  /**
    * Converts a generator namespace to its name.
    *
    * @param namespace The generator namespace.
    */
  /* static member */
  inline def namespaceToName(namespace: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("namespaceToName")(namespace.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Prepares a command for cli support.
    *
    * @param generatorClass The generator class to create a command for.
    * @returns The prepared command.
    */
  /* static member */
  inline def prepareCommand(generatorClass: GeneratorConstructor): Command = ^.asInstanceOf[js.Dynamic].applyDynamic("prepareCommand")(generatorClass.asInstanceOf[js.Any]).asInstanceOf[Command]
  
  /**
    * Prepares a command for cli support.
    *
    * @param command The command to prepare.
    * @param generatorClass The constructor of the generator to prepare the command for.
    * @returns The prepared command.
    */
  /* static member */
  inline def prepareGeneratorCommand(command: Command, generatorClass: GeneratorConstructor): Command = (^.asInstanceOf[js.Dynamic].applyDynamic("prepareGeneratorCommand")(command.asInstanceOf[js.Any], generatorClass.asInstanceOf[js.Any])).asInstanceOf[Command]
  
  /**
    * The utilities of the module.
    */
  /* static member */
  object util {
    
    @JSImport("yeoman-environment", "util")
    @js.native
    val ^ : js.Any = js.native
    
    inline def duplicateEnv(initialEnv: typings.yeomanEnvironment.mod.^[Options]): typings.yeomanEnvironment.mod.^[Options] = ^.asInstanceOf[js.Dynamic].applyDynamic("duplicateEnv")(initialEnv.asInstanceOf[js.Any]).asInstanceOf[typings.yeomanEnvironment.mod.^[Options]]
    
    @JSImport("yeoman-environment", "util.log")
    @js.native
    def log: /* import warning: importer.ImportType#apply Failed type conversion: typeof createLogger */ js.Any = js.native
    inline def log_=(
      x: /* import warning: importer.ImportType#apply Failed type conversion: typeof createLogger */ js.Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("log")(x.asInstanceOf[js.Any])
  }
  
  /**
    * Represents an adapter.
    */
  type Adapter = typings.yeomanEnvironment.adapterMod.^
  
  /**
    * Represents an alias.
    */
  trait Alias extends StObject {
    
    /**
      * The pattern to match.
      */
    var `match`: js.RegExp
    
    /**
      * The replacement of the `match`.
      */
    var value: String
  }
  object Alias {
    
    inline def apply(`match`: js.RegExp, value: String): Alias = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Alias]
    }
    
    extension [Self <: Alias](x: Self) {
      
      inline def setMatch(value: js.RegExp): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Represents an answer-hash.
    */
  type Answers = typings.inquirer.mod.Answers
  
  /**
    * Provides options array generator lookups.
    */
  trait ArrayGeneratorLookupOptions
    extends StObject
       with GeneratorLookupOptions {
    
    /**
      * @inheritdoc
      */
    @JSName("singleResult")
    var singleResult_ArrayGeneratorLookupOptions: js.UndefOr[`false`] = js.undefined
  }
  object ArrayGeneratorLookupOptions {
    
    inline def apply(): ArrayGeneratorLookupOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ArrayGeneratorLookupOptions]
    }
    
    extension [Self <: ArrayGeneratorLookupOptions](x: Self) {
      
      inline def setSingleResult(value: `false`): Self = StObject.set(x, "singleResult", value.asInstanceOf[js.Any])
      
      inline def setSingleResultUndefined: Self = StObject.set(x, "singleResult", js.undefined)
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
  js.Function1[/* err */ js.Error | Null, Unit]
  
  /**
    * `Environment` object is responsible of handling the lifecycle and bootstrap
    * of generators in a specific environment (your app).
    *
    * It provides a high-level API to create and run generators, as well as further
    * tuning where and how a generator is resolved.
    *
    * An environment is created using a list of `arguments` and a Hash of `options`.
    * Usually, this is the list of arguments you get back from your CLI options parser.
    *
    * An optional adapter can be passed to provide interaction in non-CLI environment
    * (e.g. IDE plugins), otherwise a `TerminalAdapter` is instantiated by default
    */
  @js.native
  trait Environment[TOptions /* <: Options */] extends EventEmitter {
    
    /**
      * The adapter of the environment.
      */
    var adapter: typings.yeomanEnvironment.adapterMod.^ = js.native
    
    /**
      * Creates an alias.
      *
      * Alias allows the `get()` and `lookup()` methods to search in alternate filepath for a given namespaces.
      * It's used for example to map `generator-*` npm package to their namespace equivalent (without the generator- prefix),
      * or to default a single namespace like `angular` to `angular:app` or `angular:all`.
      *
      * If multiple aliases are defined, then the replacement is recursive, replacing each alias in reverse order.
      *
      * An alias can be a single String or a Regular Expression.
      * The finding is done based on .match().
      *
      * @param match The name to match.
      * @param value The replacement for the specified `match`.
      *
      * @example
      * env.alias(/^([a-zA-Z0-9:\*]+)$/, 'generator-$1');
      * env.alias(/^([^:]+)$/, '$1:app');
      * env.alias(/^([^:]+)$/, '$1:all');
      * env.alias('foo');
      * // => generator-foo:all
      */
    def alias(`match`: String, value: String): Unit = js.native
    def alias(`match`: js.RegExp, value: String): Unit = js.native
    /**
      * Gets the alias for the specified `name`.
      */
    def alias(name: String): String = js.native
    
    /**
      * The alias-settings of the environment.
      */
    var aliases: js.Array[Alias] = js.native
    
    /**
      * Applies the specified transform streams to the files in the `sharedFs`.
      *
      * @param transformStreams The transforms to apply.
      * @param stream The file stream to apply the transforms on.
      */
    def applyTransforms(transformStreams: js.Array[Transform]): js.Promise[Unit] = js.native
    def applyTransforms(transformStreams: js.Array[Transform], stream: ReadableStream[Any]): js.Promise[Unit] = js.native
    
    /**
      * The arguments passed to this environment.
      */
    var arguments: js.Array[String] = js.native
    
    /**
      * Commits the `mem-fs` to the disk.
      *
      * @param stream The files to commit.
      */
    def commitSharedFs(stream: Stream): js.Promise[Unit] = js.native
    
    /**
      * Composes with a generator.
      *
      * @param namespaceOrPath The namespace of the generator or the path to a generator.
      * @param args The options to pass to the generator.
      * @param options The options to pass to the generator.
      * @returns The instantiated generator or a singleton instance.
      */
    def composeWith(namespaceOrPath: String, args: js.Array[String], options: GeneratorOptions): typings.yeomanGenerator.mod.^[GeneratorOptions] = js.native
    
    /**
      * Creates a new generator.
      *
      * @param namespaceOrPath The namespace of the generator or the path to a generator.
      * @param args The arguments to pass to the generator.
      * @param options The options to pass to the generator.
      * @returns Either the newly created generator or the error that occurred.
      */
    def create[TOptions /* <: GeneratorOptions */](namespaceOrPath: String, args: js.Array[String]): typings.yeomanGenerator.mod.^[TOptions] | js.Error = js.native
    def create[TOptions /* <: GeneratorOptions */](namespaceOrPath: String, args: js.Array[String], options: InstantiateOptions[TOptions]): typings.yeomanGenerator.mod.^[TOptions] | js.Error = js.native
    
    /**
      * The working-directory of the environment.
      */
    var cwd: String = js.native
    
    /**
      * Handles the specified `error`.
      *
      * The `error`-event is emitted with the specified `error` object.
      * If no `error` listener is registered, the error is thrown.
      *
      * @param error An object representing the error.
      */
    def error(error: js.Error): js.Error = js.native
    def error(error: js.Object): js.Error = js.native
    
    /**
      * Searches npm for every available generator.
      * Generators are npm-packages whose name starts with `generator-` and that are placed in the top level `node_module` path.
      * They can be installed globally or locally.
      *
      * @deprecated
      * @param list The paths to search for generators.
      * @param options The options for looking for generators.
      */
    def findGeneratorsIn(list: js.Array[String]): js.Array[String] = js.native
    def findGeneratorsIn(list: js.Array[String], options: GeneratorsInOptions): js.Array[String] = js.native
    
    /**
      * Gets a single constructor of a generator from the registered list of generators.
      *
      * The lookup is based on generator's namespace, "walking up" the namespaces until a matching is found.
      * Eg. if an `angular:common` namespace is registered, and we try to get `angular:common:all`,
      * then we get `angular:common` as a fallback (unless an `angular:common:all` generator is registered).
      *
      * @param namespaceOrPath The namespace of the generator or the path to a generator.
      * @returns The constructor of the generator registered under the namespace.
      */
    def get(namespaceOrPath: String): js.UndefOr[
        Instantiable2[
          /* args */ String, 
          /* import warning: RewrittenClass.unapply cls was tparam T */ /* options */ Any, 
          typings.yeomanGenerator.mod.^[GeneratorOptions]
        ]
      ] = js.native
    
    /**
      * Gets a constructor of a generator by the path instead of the namespace.
      *
      * @param path The path to the generator.
      * @returns The constructor of the generator found at the location.
      */
    def getByPath(path: String): js.UndefOr[
        Instantiable2[
          /* args */ String, 
          /* import warning: RewrittenClass.unapply cls was tparam T */ /* options */ Any, 
          typings.yeomanGenerator.mod.^[GeneratorOptions]
        ]
      ] = js.native
    
    /**
      * Gets the names of the registered generators.
      */
    def getGeneratorNames(): js.Array[String] = js.native
    
    /**
      * Gets metadata of the registered generators.
      */
    def getGeneratorsMeta(): Record[String, GeneratorMeta] = js.native
    
    /**
      * Gets paths to directories to look for npm-packages (such as `./node_modules`).
      *
      * @deprecated
      */
    def getNpmPaths(): js.Array[String] = js.native
    def getNpmPaths(options: NpmPathsOptions): js.Array[String] = js.native
    
    /**
      * Gets the most recent path to the generator by its namespace.
      *
      * @param namespace The namespace of the generator.
      */
    def getPackagePath(namespace: String): String = js.native
    
    /**
      * Gets all paths which have been populated for a generator by its namespace.
      *
      * @param namespace The namespace of the generator.
      */
    def getPackagePaths(namespace: String): js.Array[String] = js.native
    
    /**
      * Gets the namespaces of all registered generators.
      */
    def getRegisteredPackages(): js.Array[String] = js.native
    
    /**
      * Gets the version of this `Environment` object.
      */
    def getVersion(): String = js.native
    /**
      * Gets the version of the specified `dependency`.
      *
      * @param dependency The name of the dependency.
      */
    // tslint:disable-next-line:unified-signatures
    def getVersion(dependency: String): String = js.native
    
    /**
      * Outputs general help and usage for the specified `command`.
      * Optionally, if generators have been registered, a list of available generators is displayed.
      *
      * @param command `The name of the command to get help for.
      */
    def help(): String = js.native
    def help(command: String): String = js.native
    
    /**
      * Installs generators at the custom local repository and registers them.
      *
      * @param packages The package-names with the corresponding versions to install.
      */
    def installLocalGenerators(packages: Record[String, String]): Boolean = js.native
    
    /**
      * Instantiates a generator.
      *
      * @param generator The constructor of the generator.
      * @param args The arguments to pass to the generator.
      * @param options The options to pass to the generator.
      */
    def instantiate(
      generator: GeneratorConstructor,
      args: js.Array[String],
      options: InstantiateOptions[GeneratorOptions]
    ): typings.yeomanGenerator.mod.^[GeneratorOptions] = js.native
    
    /**
      * Checks whether a package with the specified `packageNamespace` has been registered.
      *
      * @param packageNamespace The package-namespace to check.
      * @returns A value indicating whether a package with the specified `packageNamespace` has been registered.
      */
    def isPackageRegistered(): Boolean = js.native
    def isPackageRegistered(packageNamespace: String): Boolean = js.native
    
    /**
      * Applies the specified `options` to the environment.
      *
      * @param options The options to load.
      * @returns The new options of the environment.
      */
    def loadEnvironmentOptions(options: Options): Options = js.native
    
    /**
      * Loads the specified `options` into the environment for passing to the generators.
      *
      * @param options The options to load.
      * @return the new shared options of the environment.
      */
    def loadSharedOptions(options: GeneratorOptions): GeneratorOptions = js.native
    
    /**
      * Searches for generators and their sub-generators.
      *
      * A generator is a `:lookup/:name/index.js` file placed inside an npm package.
      *
      * Default lookups are:
      *   - `./`
      *   - `./generators/`
      *   - `./lib/generators/`
      *
      * So the index file `node_modules/generator-dummy/lib/generators/yo/index.js` would be registered as `dummy:yo` generator.
      *
      * @param options The options for the lookup.
      * @returns A list of generators.
      */
    def lookup(): js.Array[LookupGeneratorMeta] = js.native
    def lookup(options: LookupOptions): js.Array[LookupGeneratorMeta] = js.native
    
    /**
      * Searches and registers generators inside the custom local repository.
      *
      * @param packagesToLookup The patterns of the packages to lookup.
      */
    def lookupLocalPackages(): js.Array[LookupGeneratorMeta] = js.native
    def lookupLocalPackages(packagesToLookup: js.Array[String]): js.Array[LookupGeneratorMeta] = js.native
    
    /**
      * The file-paths to look for generators (such as `lib/generators/`).
      */
    var lookups: js.Array[String] = js.native
    
    /**
      * Converts the specified `filePath` to a namespace.
      *
      * @param filePath The path to convert.
      * @param lookups The path-part to exclude (such as `lib/generators`).
      */
    def namespace(filePath: String): String = js.native
    def namespace(filePath: String, lookups: js.Array[String]): String = js.native
    
    /**
      * Gets a list of all registered namespaces.
      */
    def namespaces(): js.Array[String] = js.native
    
    /**
      * The options of the environment.
      */
    var options: TOptions = js.native
    
    /**
      * Queue's the environment's commit task.
      */
    def queueConflicter(): Unit = js.native
    
    /**
      * Queues the specified `generator`.
      *
      * @param generator The generator to queue.
      * @param schedule A value indicating whether the execution of the generator should be scheduled.
      * @returns The queued generator.
      */
    def queueGenerator(generator: typings.yeomanGenerator.mod.^[GeneratorOptions]): typings.yeomanGenerator.mod.^[GeneratorOptions] = js.native
    def queueGenerator(generator: typings.yeomanGenerator.mod.^[GeneratorOptions], schedule: Boolean): typings.yeomanGenerator.mod.^[GeneratorOptions] = js.native
    
    /**
      * Queues the package manager installation task.
      */
    def queuePackageManagerInstall(): Unit = js.native
    
    /**
      * Registers a specific `generator` to this environment.
      * This generator is stored under the provided `namespace` or, if not specified, a default namespace format.
      *
      * @param name The filepath to the generator or an npm package name.
      * @param namespace The namespace under which the generator should be registered.
      * @param packagePath The path to the npm package of the generator.
      */
    def register(name: String): this.type = js.native
    def register(name: String, namespace: String): this.type = js.native
    def register(name: String, namespace: String, packagePath: String): this.type = js.native
    def register(name: String, namespace: Unit, packagePath: String): this.type = js.native
    
    /**
      * Registers a stubbed generator to this environment.
      *
      * @param generator The generator constructor.
      * @param namespace The namespace under which the generator should be registered.
      * @param resolved The file-path to the generator.
      * @param packagePath The path to the npm package of the generator.
      */
    def registerStub(generator: GeneratorConstructor, namespace: String): this.type = js.native
    def registerStub(generator: GeneratorConstructor, namespace: String, resolved: String): this.type = js.native
    def registerStub(generator: GeneratorConstructor, namespace: String, resolved: String, packagePath: String): this.type = js.native
    def registerStub(generator: GeneratorConstructor, namespace: String, resolved: Unit, packagePath: String): this.type = js.native
    
    /**
      * Resolves the path of the specified module.
      *
      * @param moduleId The name of the module.
      * @returns The resolved path to the module.
      */
    def resolveModulePath(moduleId: String): String = js.native
    
    /**
      * Resolves a package name with a specific version.
      *
      * @param packageName The name of the package to resolve.
      * @param packageVersion The version or the version range of the package to resolve.
      */
    def resolvePackage(packageName: String, packageVersion: String): js.Tuple2[String, String] = js.native
    
    /**
      * Gets the first generator that was queued to run in this environment.
      */
    def rootGenerator(): typings.yeomanGenerator.mod.^[GeneratorOptions] = js.native
    
    def run(args: Array[String]): js.Promise[Unit] = js.native
    def run(args: Array[String], options: GeneratorOptions): js.Promise[Unit] = js.native
    /**
      * Tries to locate and run a specific generator.
      * The lookup is done depending on the provided arguments, options and the list of registered generators.
      *
      * When the environment was unable to resolve a generator, an error is raised.
      *
      * @param args The arguments to pass to the generator.
      * @param options The options to pass to the generator.
      */
    def run(args: String): js.Promise[Unit] = js.native
    def run(args: String, options: GeneratorOptions): js.Promise[Unit] = js.native
    
    /**
      * Runs the specified generator.
      *
      * See [#101](https://github.com/yeoman/environment/pull/101) for more info.
      *
      * @param generator The generator to run.
      */
    def runGenerator(generator: typings.yeomanGenerator.mod.^[GeneratorOptions]): js.Promise[Unit] = js.native
    
    /**
      * The file-system of the environment.
      */
    var sharedFs: Store = js.native
    
    /**
      * Spawns a command asynchronously.
      *
      * @param command The command to execute.
      * @param args The arguments to pass to the program.
      * @param options The options to use for running the command.
      */
    def spawnCommand(command: String, args: js.Array[String], options: Options): ExecaChildProcess[String] = js.native
    
    /**
      * Spawns a command synchronously.
      *
      * @param command The command to execute.
      * @param args The arguments to pass to the program.
      * @param options The options to use for running the command.
      */
    def spawnCommandSync(command: String, args: js.Array[String], options: SyncOptions[String]): ExecaSyncReturnValue[String] = js.native
    
    /**
      * Starts the environment queue.
      *
      * @param options The conflicter options.
      */
    def start(options: ConflicterOptions): js.Promise[Unit] = js.native
    
    /**
      * The config-storage of the environment.
      */
    var store: typings.yeomanGenerator.storageMod.^ = js.native
  }
  
  /**
    * Provides options for generator-lookups.
    */
  trait GeneratorLookupOptions
    extends StObject
       with LookupOptionBase {
    
    /**
      * A value indicating whether the path to the package should be returned instead of the path to the generator.
      */
    var packagePath: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A value indicating whether only one result should be returned.
      */
    var singleResult: js.UndefOr[Boolean] = js.undefined
  }
  object GeneratorLookupOptions {
    
    inline def apply(): GeneratorLookupOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GeneratorLookupOptions]
    }
    
    extension [Self <: GeneratorLookupOptions](x: Self) {
      
      inline def setPackagePath(value: Boolean): Self = StObject.set(x, "packagePath", value.asInstanceOf[js.Any])
      
      inline def setPackagePathUndefined: Self = StObject.set(x, "packagePath", js.undefined)
      
      inline def setSingleResult(value: Boolean): Self = StObject.set(x, "singleResult", value.asInstanceOf[js.Any])
      
      inline def setSingleResultUndefined: Self = StObject.set(x, "singleResult", js.undefined)
    }
  }
  
  /**
    * Provides information about a generator.
    */
  trait GeneratorMeta extends StObject {
    
    /**
      * The namespace of the generator.
      */
    var namespace: String
    
    /**
      * The path to the package containing the generator.
      */
    var packagePath: String
    
    /**
      * The resolved path to the generator.
      */
    var resolved: String
  }
  object GeneratorMeta {
    
    inline def apply(namespace: String, packagePath: String, resolved: String): GeneratorMeta = {
      val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any], packagePath = packagePath.asInstanceOf[js.Any], resolved = resolved.asInstanceOf[js.Any])
      __obj.asInstanceOf[GeneratorMeta]
    }
    
    extension [Self <: GeneratorMeta](x: Self) {
      
      inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setPackagePath(value: String): Self = StObject.set(x, "packagePath", value.asInstanceOf[js.Any])
      
      inline def setResolved(value: String): Self = StObject.set(x, "resolved", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Provides options for the `findGeneratorsIn` method.
    */
  trait GeneratorsInOptions extends StObject {
    
    /**
      * The package-patterns to look for.
      */
    var packagePatterns: js.UndefOr[js.Array[String]] = js.undefined
  }
  object GeneratorsInOptions {
    
    inline def apply(): GeneratorsInOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GeneratorsInOptions]
    }
    
    extension [Self <: GeneratorsInOptions](x: Self) {
      
      inline def setPackagePatterns(value: js.Array[String]): Self = StObject.set(x, "packagePatterns", value.asInstanceOf[js.Any])
      
      inline def setPackagePatternsUndefined: Self = StObject.set(x, "packagePatterns", js.undefined)
      
      inline def setPackagePatternsVarargs(value: String*): Self = StObject.set(x, "packagePatterns", js.Array(value*))
    }
  }
  
  /**
    * Provides options for instantiating a generator.
    */
  trait InstantiateOptions[TOptions /* <: GeneratorOptions */] extends StObject {
    
    /**
      * The arguments to pass to the generator.
      */
    var arguments: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /**
      * The options for creating the generator.
      */
    var options: js.UndefOr[TOptions] = js.undefined
  }
  object InstantiateOptions {
    
    inline def apply[TOptions /* <: GeneratorOptions */](): InstantiateOptions[TOptions] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InstantiateOptions[TOptions]]
    }
    
    extension [Self <: InstantiateOptions[?], TOptions /* <: GeneratorOptions */](x: Self & InstantiateOptions[TOptions]) {
      
      inline def setArguments(value: String | js.Array[String]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
      
      inline def setArgumentsUndefined: Self = StObject.set(x, "arguments", js.undefined)
      
      inline def setArgumentsVarargs(value: String*): Self = StObject.set(x, "arguments", js.Array(value*))
      
      inline def setOptions(value: TOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
  
  /**
    * Represents a component for logging messages.
    */
  type Logger = typings.yeomanEnvironment.logMod.Logger[DefaultCategories]
  
  /**
    * Provides information about a generator.
    */
  trait LookupGeneratorMeta
    extends StObject
       with GeneratorMeta {
    
    /**
      * A value indicating whether the generator could be registered.
      */
    var registered: Boolean
  }
  object LookupGeneratorMeta {
    
    inline def apply(namespace: String, packagePath: String, registered: Boolean, resolved: String): LookupGeneratorMeta = {
      val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any], packagePath = packagePath.asInstanceOf[js.Any], registered = registered.asInstanceOf[js.Any], resolved = resolved.asInstanceOf[js.Any])
      __obj.asInstanceOf[LookupGeneratorMeta]
    }
    
    extension [Self <: LookupGeneratorMeta](x: Self) {
      
      inline def setRegistered(value: Boolean): Self = StObject.set(x, "registered", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Provides options for lookups.
    */
  trait LookupOptionBase extends StObject {
    
    /**
      * A value indicating whether globally installed packages should be ignored.
      */
    var localOnly: js.UndefOr[Boolean] = js.undefined
  }
  object LookupOptionBase {
    
    inline def apply(): LookupOptionBase = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LookupOptionBase]
    }
    
    extension [Self <: LookupOptionBase](x: Self) {
      
      inline def setLocalOnly(value: Boolean): Self = StObject.set(x, "localOnly", value.asInstanceOf[js.Any])
      
      inline def setLocalOnlyUndefined: Self = StObject.set(x, "localOnly", js.undefined)
    }
  }
  
  /**
    * Provides options for the `lookup` method.
    */
  trait LookupOptions
    extends StObject
       with LookupOptionBase {
    
    /**
      * The file-patterns to look for.
      */
    var filePatterns: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * The `deep` option to pass to `globby`.
      */
    var globbyDeep: js.UndefOr[Double] = js.undefined
    
    /**
      * The repüository paths to look for generator packages.
      */
    var npmPaths: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * The paths to look for generators.
      */
    var packagePaths: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * The package patterns to look for.
      */
    var packagePatterns: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * A value indicating whether the lookup should be stopped after finding the first result.
      */
    var singleResult: js.UndefOr[Boolean] = js.undefined
  }
  object LookupOptions {
    
    inline def apply(): LookupOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LookupOptions]
    }
    
    extension [Self <: LookupOptions](x: Self) {
      
      inline def setFilePatterns(value: js.Array[String]): Self = StObject.set(x, "filePatterns", value.asInstanceOf[js.Any])
      
      inline def setFilePatternsUndefined: Self = StObject.set(x, "filePatterns", js.undefined)
      
      inline def setFilePatternsVarargs(value: String*): Self = StObject.set(x, "filePatterns", js.Array(value*))
      
      inline def setGlobbyDeep(value: Double): Self = StObject.set(x, "globbyDeep", value.asInstanceOf[js.Any])
      
      inline def setGlobbyDeepUndefined: Self = StObject.set(x, "globbyDeep", js.undefined)
      
      inline def setNpmPaths(value: js.Array[String]): Self = StObject.set(x, "npmPaths", value.asInstanceOf[js.Any])
      
      inline def setNpmPathsUndefined: Self = StObject.set(x, "npmPaths", js.undefined)
      
      inline def setNpmPathsVarargs(value: String*): Self = StObject.set(x, "npmPaths", js.Array(value*))
      
      inline def setPackagePaths(value: js.Array[String]): Self = StObject.set(x, "packagePaths", value.asInstanceOf[js.Any])
      
      inline def setPackagePathsUndefined: Self = StObject.set(x, "packagePaths", js.undefined)
      
      inline def setPackagePathsVarargs(value: String*): Self = StObject.set(x, "packagePaths", js.Array(value*))
      
      inline def setPackagePatterns(value: js.Array[String]): Self = StObject.set(x, "packagePatterns", value.asInstanceOf[js.Any])
      
      inline def setPackagePatternsUndefined: Self = StObject.set(x, "packagePatterns", js.undefined)
      
      inline def setPackagePatternsVarargs(value: String*): Self = StObject.set(x, "packagePatterns", js.Array(value*))
      
      inline def setSingleResult(value: Boolean): Self = StObject.set(x, "singleResult", value.asInstanceOf[js.Any])
      
      inline def setSingleResultUndefined: Self = StObject.set(x, "singleResult", js.undefined)
    }
  }
  
  /**
    * Provides options for the `getNpmPaths` method.
    */
  trait NpmPathsOptions
    extends StObject
       with LookupOptionBase {
    
    /**
      * A value indicating whether paths which don't end with a supported directory-name should be filtered (unless they are part of `NODE_PATH`).
      */
    var filterPaths: js.UndefOr[Boolean] = js.undefined
  }
  object NpmPathsOptions {
    
    inline def apply(): NpmPathsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NpmPathsOptions]
    }
    
    extension [Self <: NpmPathsOptions](x: Self) {
      
      inline def setFilterPaths(value: Boolean): Self = StObject.set(x, "filterPaths", value.asInstanceOf[js.Any])
      
      inline def setFilterPathsUndefined: Self = StObject.set(x, "filterPaths", js.undefined)
    }
  }
  
  /**
    * Represents options for an `Environment`.
    */
  trait Options
    extends StObject
       with /**
    * Additional options.
    */
  /* key */ StringDictionary[Any] {
    
    /**
      * A console instance for logging messages.
      */
    var console: js.UndefOr[Console] = js.undefined
    
    /**
      * The working-directory of the environment.
      */
    var cwd: js.UndefOr[String] = js.undefined
    
    /**
      * A value indicating whether the experimental features should be enabled.
      */
    var experimental: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The options to pass to generators.
      */
    var sharedOptions: js.UndefOr[GeneratorOptions] = js.undefined
    
    /**
      * A stream to write error messages to.
      */
    var stderr: js.UndefOr[Stream] = js.undefined
    
    /**
      * A stream for receiving data from.
      */
    var stdin: js.UndefOr[Stream] = js.undefined
    
    /**
      * A stream to write normal messages to.
      */
    var stdout: js.UndefOr[Stream] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setConsole(value: Console): Self = StObject.set(x, "console", value.asInstanceOf[js.Any])
      
      inline def setConsoleUndefined: Self = StObject.set(x, "console", js.undefined)
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setExperimental(value: Boolean): Self = StObject.set(x, "experimental", value.asInstanceOf[js.Any])
      
      inline def setExperimentalUndefined: Self = StObject.set(x, "experimental", js.undefined)
      
      inline def setSharedOptions(value: GeneratorOptions): Self = StObject.set(x, "sharedOptions", value.asInstanceOf[js.Any])
      
      inline def setSharedOptionsUndefined: Self = StObject.set(x, "sharedOptions", js.undefined)
      
      inline def setStderr(value: Stream): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
      
      inline def setStderrUndefined: Self = StObject.set(x, "stderr", js.undefined)
      
      inline def setStdin(value: Stream): Self = StObject.set(x, "stdin", value.asInstanceOf[js.Any])
      
      inline def setStdinUndefined: Self = StObject.set(x, "stdin", js.undefined)
      
      inline def setStdout(value: Stream): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
      
      inline def setStdoutUndefined: Self = StObject.set(x, "stdout", js.undefined)
    }
  }
  
  /**
    * Represents a question.
    */
  type Question[T /* <: typings.inquirer.mod.Answers */] = DistinctQuestion[T]
  
  /**
    * Represents a collection of questions.
    */
  type Questions[T /* <: typings.inquirer.mod.Answers */] = QuestionCollection[T]
  
  /**
    * Provides options for single generator lookups.
    */
  trait SingleGeneratorLookupOptions
    extends StObject
       with GeneratorLookupOptions {
    
    /**
      * @inheritdoc
      */
    @JSName("singleResult")
    var singleResult_SingleGeneratorLookupOptions: `true`
  }
  object SingleGeneratorLookupOptions {
    
    inline def apply(): SingleGeneratorLookupOptions = {
      val __obj = js.Dynamic.literal(singleResult = true)
      __obj.asInstanceOf[SingleGeneratorLookupOptions]
    }
    
    extension [Self <: SingleGeneratorLookupOptions](x: Self) {
      
      inline def setSingleResult(value: `true`): Self = StObject.set(x, "singleResult", value.asInstanceOf[js.Any])
    }
  }
}
