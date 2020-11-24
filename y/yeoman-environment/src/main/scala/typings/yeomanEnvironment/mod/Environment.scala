package typings.yeomanEnvironment.mod

import org.scalablytyped.runtime.Instantiable2
import typings.memFs.mod.Store
import typings.node.eventsMod.EventEmitter
import typings.std.Error
import typings.std.Record
import typings.std.RegExp
import typings.yeomanGenerator.mod.GeneratorConstructor
import typings.yeomanGenerator.mod.GeneratorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def alias(`match`: RegExp, value: String): Unit = js.native
  /**
    * Gets the alias for the specified `name`.
    */
  def alias(name: String): String = js.native
  
  /**
    * The alias-settings of the environment.
    */
  var aliases: js.Array[Alias] = js.native
  
  /**
    * The arguments passed to this environment.
    */
  var arguments: js.Array[String] = js.native
  
  /**
    * Creates a new generator.
    *
    * @param namespaceOrPath The namespace of the generator or the path to a generator.
    * @param options The options to pass to the generator.
    *
    * @returns Either the newly created generator or the error that occurred.
    */
  def create[TOptions /* <: GeneratorOptions */](namespaceOrPath: String): typings.yeomanGenerator.mod.^[TOptions] | Error = js.native
  def create[TOptions /* <: GeneratorOptions */](namespaceOrPath: String, options: InstantiateOptions[TOptions]): typings.yeomanGenerator.mod.^[TOptions] | Error = js.native
  
  /**
    * The working-directory of the environment.
    */
  var cwd: String = js.native
  
  def error(error: js.Object): Error = js.native
  def error(error: js.Object, verifyListener: Boolean): Error = js.native
  /**
    * Handles the specified `error`.
    *
    * The `error`-event is emitted with the specified `error` object.
    * If no `error` listener is registered, the error is thrown.
    *
    * @param error An object representing the error.
    * @param verifyListener A value indicating whether an error should be thrown if no `error` listener is present.
    */
  def error(error: Error): Error = js.native
  def error(error: Error, verifyListener: Boolean): Error = js.native
  
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
      /* import warning: RewrittenClass.unapply cls was tparam T */ /* options */ js.Any, 
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
      /* import warning: RewrittenClass.unapply cls was tparam T */ /* options */ js.Any, 
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
    * @param name The constructor of the generator.
    * @param options The options to pass to the generator.
    */
  def instantiate(name: GeneratorConstructor, options: InstantiateOptions[GeneratorOptions]): typings.yeomanGenerator.mod.^[GeneratorOptions] = js.native
  
  /**
    * Checks whether a package with the specified `packageNamespace` has been registered.
    *
    * @param packageNamespace The package-namespace to check.
    * @returns A value indicating whether a package with the specified `packageNamespace` has been registered.
    */
  def isPackageRegistered(): Boolean = js.native
  def isPackageRegistered(packageNamespace: String): Boolean = js.native
  
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
    * @param cb A callback that is called once the lookup has been finished.
    * @returns A list of generators.
    */
  def lookup(): js.Array[LookupGeneratorMeta] = js.native
  def lookup(options: js.UndefOr[scala.Nothing], cb: js.Function1[/* err */ Null | Error, Unit]): js.Array[LookupGeneratorMeta] = js.native
  def lookup(options: LookupOptions): js.Array[LookupGeneratorMeta] = js.native
  def lookup(options: LookupOptions, cb: js.Function1[/* err */ Null | Error, Unit]): js.Array[LookupGeneratorMeta] = js.native
  
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
    * Registers a specific `generator` to this environment.
    * This generator is stored under the provided `namespace` or, if not specified, a default namespace format.
    *
    * @param name The filepath to the generator or an npm package name.
    * @param namespace The namespace under which the generator should be registered.
    * @param packagePath The path to the npm package of the generator.
    */
  def register(name: String): this.type = js.native
  def register(name: String, namespace: js.UndefOr[scala.Nothing], packagePath: String): this.type = js.native
  def register(name: String, namespace: String): this.type = js.native
  def register(name: String, namespace: String, packagePath: String): this.type = js.native
  
  /**
    * Registers a stubbed generator to this environment.
    *
    * @param generator The generator constructor.
    * @param namespace The namespace under which the generator should be registered.
    * @param resolved The file-path to the generator.
    * @param packagePath The path to the npm package of the generator.
    */
  def registerStub(generator: GeneratorConstructor, namespace: String): this.type = js.native
  def registerStub(
    generator: GeneratorConstructor,
    namespace: String,
    resolved: js.UndefOr[scala.Nothing],
    packagePath: String
  ): this.type = js.native
  def registerStub(generator: GeneratorConstructor, namespace: String, resolved: String): this.type = js.native
  def registerStub(generator: GeneratorConstructor, namespace: String, resolved: String, packagePath: String): this.type = js.native
  
  /**
    * Resolves the path of the specified module.
    *
    * @param moduleId The name of the module.
    * @returns The resolved path to the module.
    */
  def resolveModulePath(moduleId: String): String = js.native
  
  /**
    * Gets the first generator that was queued to run in this environment.
    */
  def rootGenerator(): typings.yeomanGenerator.mod.^[GeneratorOptions] = js.native
  
  /**
    * Tries to locate and run a specific generator.
    * The lookup is done depending on the provided arguments, options and the list of registered generators.
    *
    * When the environment was unable to resolve a generator, an error is raised.
    *
    * @param args The arguments to pass to the generator.
    * @param done The callback.
    */
  def run(args: String, done: Callback): Unit = js.native
  /**
    * Tries to locate and run a specific generator.
    * The lookup is done depending on the provided arguments, options and the list of registered generators.
    *
    * When the environment was unable to resolve a generator, an error is raised.
    *
    * @param args The arguments to pass to the generator.
    * @param options The options for creating the generator.
    * @param done The callback.
    */
  def run(args: String, options: js.Object, done: Callback): Unit = js.native
  def run(args: js.Array[String], done: Callback): Unit = js.native
  def run(args: js.Array[String], options: js.Object, done: Callback): Unit = js.native
  /**
    * Tries to locate and run a specific generator.
    * The lookup is done depending on the provided arguments, options and the list of registered generators.
    *
    * When the environment was unable to resolve a generator, an error is raised.
    *
    * @param done The callback.
    */
  def run(done: Callback): Unit = js.native
  
  /**
    * Runs the specified generator.
    *
    * See [#101](https://github.com/yeoman/environment/pull/101) for more info.
    *
    * @param generator The generator to run.
    * @param callback The callback.
    */
  def runGenerator(generator: typings.yeomanGenerator.mod.^[GeneratorOptions]): js.Promise[Unit] = js.native
  def runGenerator(generator: typings.yeomanGenerator.mod.^[GeneratorOptions], callback: Callback): js.Promise[Unit] = js.native
  
  /**
    * The file-system of the environment.
    */
  var sharedFs: Store = js.native
  
  /**
    * The config-storage of the environment.
    */
  var store: typings.yeomanGenerator.storageMod.^ = js.native
}
