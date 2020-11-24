package typings.yeomanEnvironment.mod

import typings.yeomanEnvironment.anon.Typeofutil
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
@JSImport("yeoman-environment", JSImport.Namespace)
@js.native
/**
  * Initializes a new instance of the `Environment` class.
  *
  * @param args The arguments to pass to the environment.
  * @param opts The options for the environment.
  * @param adapter A `TerminalAdapter` instance for handling input/output.
  */
class ^[TOptions /* <: Options */] () extends Environment[TOptions] {
  def this(args: String) = this()
  def this(args: js.Array[String]) = this()
  def this(args: js.UndefOr[scala.Nothing], opts: TOptions) = this()
  def this(args: String, opts: TOptions) = this()
  def this(args: js.Array[String], opts: TOptions) = this()
  def this(args: js.UndefOr[scala.Nothing], opts: TOptions, adapter: Adapter) = this()
  def this(args: js.UndefOr[scala.Nothing], opts: js.UndefOr[scala.Nothing], adapter: Adapter) = this()
  def this(args: String, opts: TOptions, adapter: Adapter) = this()
  def this(args: String, opts: js.UndefOr[scala.Nothing], adapter: Adapter) = this()
  def this(args: js.Array[String], opts: TOptions, adapter: Adapter) = this()
  def this(args: js.Array[String], opts: js.UndefOr[scala.Nothing], adapter: Adapter) = this()
}
@JSImport("yeoman-environment", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
    * Createas a new `Environment` instance.
    *
    * @param args The arguments to pass to the environment.
    * @param opts The options for the environment.
    * @param adapter A `TerminalAdapter` instance for handling input/output.
    */
  def createEnv[TOptions /* <: Options */](): Environment[TOptions] = js.native
  def createEnv[TOptions /* <: Options */](args: js.UndefOr[scala.Nothing], opts: TOptions): Environment[TOptions] = js.native
  def createEnv[TOptions /* <: Options */](args: js.UndefOr[scala.Nothing], opts: TOptions, adapter: Adapter): Environment[TOptions] = js.native
  def createEnv[TOptions /* <: Options */](args: js.UndefOr[scala.Nothing], opts: js.UndefOr[scala.Nothing], adapter: Adapter): Environment[TOptions] = js.native
  def createEnv[TOptions /* <: Options */](args: String): Environment[TOptions] = js.native
  def createEnv[TOptions /* <: Options */](args: String, opts: TOptions): Environment[TOptions] = js.native
  def createEnv[TOptions /* <: Options */](args: String, opts: TOptions, adapter: Adapter): Environment[TOptions] = js.native
  def createEnv[TOptions /* <: Options */](args: String, opts: js.UndefOr[scala.Nothing], adapter: Adapter): Environment[TOptions] = js.native
  def createEnv[TOptions /* <: Options */](args: js.Array[String]): Environment[TOptions] = js.native
  def createEnv[TOptions /* <: Options */](args: js.Array[String], opts: TOptions): Environment[TOptions] = js.native
  def createEnv[TOptions /* <: Options */](args: js.Array[String], opts: TOptions, adapter: Adapter): Environment[TOptions] = js.native
  def createEnv[TOptions /* <: Options */](args: js.Array[String], opts: js.UndefOr[scala.Nothing], adapter: Adapter): Environment[TOptions] = js.native
  
  /**
    * Creates a new `Environment` instance with the specified `version`.
    *
    * @param version The version of the environment.
    * @param args The arguments to pass to the environment.
    * @param opts The options for the environment.
    * @param adapter A `TerminalAdapter` instance for handling input/output.
    */
  def createEnvWithVersion[TOptions /* <: Options */](version: String): Environment[TOptions] = js.native
  def createEnvWithVersion[TOptions /* <: Options */](version: String, args: js.UndefOr[scala.Nothing], opts: TOptions): Environment[TOptions] = js.native
  def createEnvWithVersion[TOptions /* <: Options */](version: String, args: js.UndefOr[scala.Nothing], opts: TOptions, adapter: Adapter): Environment[TOptions] = js.native
  def createEnvWithVersion[TOptions /* <: Options */](
    version: String,
    args: js.UndefOr[scala.Nothing],
    opts: js.UndefOr[scala.Nothing],
    adapter: Adapter
  ): Environment[TOptions] = js.native
  def createEnvWithVersion[TOptions /* <: Options */](version: String, args: String): Environment[TOptions] = js.native
  def createEnvWithVersion[TOptions /* <: Options */](version: String, args: String, opts: TOptions): Environment[TOptions] = js.native
  def createEnvWithVersion[TOptions /* <: Options */](version: String, args: String, opts: TOptions, adapter: Adapter): Environment[TOptions] = js.native
  def createEnvWithVersion[TOptions /* <: Options */](version: String, args: String, opts: js.UndefOr[scala.Nothing], adapter: Adapter): Environment[TOptions] = js.native
  def createEnvWithVersion[TOptions /* <: Options */](version: String, args: js.Array[String]): Environment[TOptions] = js.native
  def createEnvWithVersion[TOptions /* <: Options */](version: String, args: js.Array[String], opts: TOptions): Environment[TOptions] = js.native
  def createEnvWithVersion[TOptions /* <: Options */](version: String, args: js.Array[String], opts: TOptions, adapter: Adapter): Environment[TOptions] = js.native
  def createEnvWithVersion[TOptions /* <: Options */](version: String, args: js.Array[String], opts: js.UndefOr[scala.Nothing], adapter: Adapter): Environment[TOptions] = js.native
  
  /**
    * Makes sure the Environment present expected methods if an old version is passed to a Generator.
    *
    * @param env The environment to update.
    * @returns The updated `env`.
    */
  def enforceUpdate[TEnv /* <: Environment[Options] */](env: TEnv): TEnv = js.native
  
  /**
    * Invokes a lookup for a specific generator.
    *
    * @param namespace The namespace of the generator to search.
    * @param options Options for searching the generator.
    */
  def lookupGenerator(namespace: String): String = js.native
  def lookupGenerator(namespace: String, options: GeneratorLookupOptions): String = js.native
  
  /**
    * Converts a generator namespace to its name.
    *
    * @param namespace The generator namespace.
    */
  def namespaceToName(namespace: String): String = js.native
  
  /**
    * The utilities of the module.
    */
  var util: Typeofutil = js.native
}
