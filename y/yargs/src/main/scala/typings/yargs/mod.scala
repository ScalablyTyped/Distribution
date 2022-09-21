package typings.yargs

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.std.Capitalize
import typings.std.Exclude
import typings.std.Extract
import typings.std.PropertyKey
import typings.yargs.anon.DictargName
import typings.yargs.anon.PartialParserConfiguratio
import typings.yargs.yargsBooleans.`false`
import typings.yargs.yargsBooleans.`true`
import typings.yargs.yargsStrings.DollarLeftcurlybracketCapitalizeLessthansignTGreaterthansignRightcurlybracketDollarLeftcurlybracketPascalCaseLessthansignUGreaterthansignRightcurlybracket
import typings.yargs.yargsStrings.DollarLeftcurlybracketTRightcurlybracketDollarLeftcurlybracketPascalCaseLessthansignUGreaterthansignRightcurlybracket
import typings.yargs.yargsStrings._empty
import typings.yargs.yargsStrings.array
import typings.yargs.yargsStrings.count
import typings.yargs.yargsStrings.error
import typings.yargs.yargsStrings.log
import typings.yargsParser.mod.Configuration
import typings.yargsParser.mod.DetailedArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("yargs", JSImport.Namespace)
  @js.native
  val ^ : Argv[js.Object] = js.native
  
  type Arguments[T] = T & DictargName
  
  /** Arguments type, with camelcased keys */
  @js.native
  trait ArgumentsCamelCase[T]
    extends StObject
       with /** All remaining options */
  /* argName */ StringDictionary[Any] {
    
    /** The script name or node command */
    @JSName("$0")
    var $0: String = js.native
    
    /** Non-option arguments */
    @JSName("_")
    var _underscore: js.Array[String | Double] = js.native
  }
  
  /**
    * The type parameter `T` is the expected shape of the parsed options.
    * `Arguments<T>` is those options plus `_` and `$0`, and an indexer falling
    * back to `unknown` for unknown options.
    *
    * For the return type / `argv` property, we create a mapped type over
    * `Arguments<T>` to simplify the inferred type signature in client code.
    */
  @js.native
  trait Argv[T] extends StObject {
    
    def apply(): Argv[T] = js.native
    def apply(args: String): Argv[T] = js.native
    def apply(args: String, cwd: String): Argv[T] = js.native
    def apply(args: js.Array[String]): Argv[T] = js.native
    def apply(args: js.Array[String], cwd: String): Argv[T] = js.native
    def apply(args: Unit, cwd: String): Argv[T] = js.native
    
    def default[D /* <: StringDictionary[Any] */](defaults: D): Argv[(Omit[T, /* keyof D */ String]) & D] = js.native
    def default[D /* <: StringDictionary[Any] */](defaults: D, description: String): Argv[(Omit[T, /* keyof D */ String]) & D] = js.native
    /**
      * Set `argv[key]` to `value` if no option was specified in `process.argv`.
      *
      * Optionally `.default()` can take an object that maps keys to default values.
      *
      * The default value can be a `function` which returns a value. The name of the function will be used in the usage string.
      *
      * Optionally, `description` can also be provided and will take precedence over displaying the value in the usage instructions.
      */
    def default[K /* <: /* keyof T */ String */, V](key: K, value: V): Argv[(Omit[T, K]) & typings.yargs.yargsStrings.Argv & TopLevel[Any]] = js.native
    def default[K /* <: /* keyof T */ String */, V](key: K, value: V, description: String): Argv[(Omit[T, K]) & typings.yargs.yargsStrings.Argv & TopLevel[Any]] = js.native
    
    def alias(aliases: StringDictionary[String | js.Array[String]]): Argv[T] = js.native
    def alias(shortName: String, longName: String): Argv[T] = js.native
    def alias(shortName: String, longName: js.Array[String]): Argv[T] = js.native
    def alias(shortName: js.Array[String], longName: String): Argv[T] = js.native
    def alias(shortName: js.Array[String], longName: js.Array[String]): Argv[T] = js.native
    /**
      * Set key names as equivalent such that updates to a key will propagate to aliases and vice-versa.
      *
      * Optionally `.alias()` can take an object that maps keys to aliases.
      * Each key of this object should be the canonical version of the option, and each value should be a string or an array of strings.
      */
    // Aliases for previously declared options can inherit the types of those options.
    def alias[K1 /* <: /* keyof T */ String */, K2 /* <: String */](shortName: K1 | K2, longName: K1 | K2): Argv[T & typings.yargs.yargsStrings.Argv & TopLevel[T]] = js.native
    def alias[K1 /* <: /* keyof T */ String */, K2 /* <: String */](shortName: K1 | K2, longName: js.Array[K1 | K2]): Argv[T & typings.yargs.yargsStrings.Argv & TopLevel[T]] = js.native
    
    /**
      * Get the arguments as a plain old object.
      *
      * Arguments without a corresponding flag show up in the `argv._` array.
      *
      * The script name or node command is available at `argv.$0` similarly to how `$0` works in bash or perl.
      *
      * If `yargs` is executed in an environment that embeds node and there's no script name (e.g. Electron or nw.js),
      * it will ignore the first parameter since it expects it to be the script name. In order to override
      * this behavior, use `.parse(process.argv.slice(1))` instead of .argv and the first parameter won't be ignored.
      */
    var argv: (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in keyof yargs.yargs.Arguments<T> as key | yargs.yargs.CamelCaseKey<key> ]: yargs.yargs.Arguments<T>[key]}
      */ typings.yargs.yargsStrings.Argv & TopLevel[Arguments[T]]) | (js.Promise[
        /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in keyof yargs.yargs.Arguments<T> as key | yargs.yargs.CamelCaseKey<key> ]: yargs.yargs.Arguments<T>[key]}
      */ typings.yargs.yargsStrings.Argv & TopLevel[Arguments[T]]
      ]) = js.native
    
    /**
      * Tell the parser to interpret `key` as an array.
      * If `.array('foo')` is set, `--foo foo bar` will be parsed as `['foo', 'bar']` rather than as `'foo'`.
      * Also, if you use the option multiple times all the values will be flattened in one array so `--foo foo --foo bar` will be parsed as `['foo', 'bar']`
      *
      * When the option is used with a positional, use `--` to tell `yargs` to stop adding values to the array.
      */
    def array[K /* <: /* keyof T */ String */](key: K): Argv[(Omit[T, K]) & typings.yargs.yargsStrings.Argv & TopLevel[T]] = js.native
    def array[K /* <: /* keyof T */ String */](key: js.Array[K]): Argv[(Omit[T, K]) & typings.yargs.yargsStrings.Argv & TopLevel[T]] = js.native
    
    /**
      * Interpret `key` as a boolean. If a non-flag option follows `key` in `process.argv`, that string won't get set as the value of `key`.
      *
      * `key` will default to `false`, unless a `default(key, undefined)` is explicitly set.
      *
      * If `key` is an array, interpret all the elements as booleans.
      */
    def boolean[K /* <: /* keyof T */ String */](key: K): Argv[(Omit[T, K]) & typings.yargs.yargsStrings.Argv & TopLevel[Any]] = js.native
    def boolean[K /* <: /* keyof T */ String */](key: js.Array[K]): Argv[(Omit[T, K]) & typings.yargs.yargsStrings.Argv & TopLevel[Any]] = js.native
    
    /**
      * Check that certain conditions are met in the provided arguments.
      * @param func Called with two arguments, the parsed `argv` hash and an array of options and their aliases.
      * If `func` throws or returns a non-truthy value, show the thrown error, usage information, and exit.
      * @param global Indicates whether `check()` should be enabled both at the top-level and for each sub-command.
      */
    def check(func: js.Function2[/* argv */ Arguments[T], /* aliases */ StringDictionary[String], Any]): Argv[T] = js.native
    def check(
      func: js.Function2[/* argv */ Arguments[T], /* aliases */ StringDictionary[String], Any],
      global: Boolean
    ): Argv[T] = js.native
    
    def choices[C /* <: StringDictionary[js.Array[Any]] */](choices: C): Argv[(Omit[T, /* keyof C */ String]) & typings.yargs.yargsStrings.Argv & TopLevel[C]] = js.native
    /**
      * Limit valid values for key to a predefined set of choices, given as an array or as an individual value.
      * If this method is called multiple times, all enumerated values will be merged together.
      * Choices are generally strings or numbers, and value matching is case-sensitive.
      *
      * Optionally `.choices()` can take an object that maps multiple keys to their choices.
      *
      * Choices can also be specified as choices in the object given to `option()`.
      */
    def choices[K /* <: /* keyof T */ String */, C /* <: js.Array[Any] */](key: K, values: C): Argv[(Omit[T, K]) & typings.yargs.yargsStrings.Argv & TopLevel[C]] = js.native
    
    def coerce[O /* <: StringDictionary[js.Function1[/* arg */ Any, Any]] */](opts: O): Argv[(Omit[T, /* keyof O */ String]) & typings.yargs.yargsStrings.Argv & TopLevel[O]] = js.native
    /**
      * Provide a synchronous function to coerce or transform the value(s) given on the command line for `key`.
      *
      * The coercion function should accept one argument, representing the parsed value from the command line, and should return a new value or throw an error.
      * The returned value will be used as the value for `key` (or one of its aliases) in `argv`.
      *
      * If the function throws, the error will be treated as a validation failure, delegating to either a custom `.fail()` handler or printing the error message in the console.
      *
      * Coercion will be applied to a value after all other modifications, such as `.normalize()`.
      *
      * Optionally `.coerce()` can take an object that maps several keys to their respective coercion function.
      *
      * You can also map the same function to several keys at one time. Just pass an array of keys as the first argument to `.coerce()`.
      *
      * If you are using dot-notion or arrays, .e.g., `user.email` and `user.password`, coercion will be applied to the final object that has been parsed
      */
    def coerce[K /* <: /* keyof T */ String */, V](key: K, func: js.Function1[/* arg */ Any, V]): Argv[(Omit[T, K]) & typings.yargs.yargsStrings.Argv & TopLevel[Any]] = js.native
    def coerce[K /* <: /* keyof T */ String */, V](key: js.Array[K], func: js.Function1[/* arg */ Any, V]): Argv[(Omit[T, K]) & typings.yargs.yargsStrings.Argv & TopLevel[Any]] = js.native
    
    def command[O /* <: StringDictionary[Options] */](command: String, description: String): Argv[T] = js.native
    def command[O /* <: StringDictionary[Options] */](command: String, description: String, builder: O): Argv[T] = js.native
    def command[O /* <: StringDictionary[Options] */](
      command: String,
      description: String,
      builder: O,
      handler: js.Function1[/* args */ ArgumentsCamelCase[InferredOptionTypes[O]], Unit | js.Promise[Unit]]
    ): Argv[T] = js.native
    def command[O /* <: StringDictionary[Options] */](
      command: String,
      description: String,
      builder: O,
      handler: js.Function1[/* args */ ArgumentsCamelCase[InferredOptionTypes[O]], Unit | js.Promise[Unit]],
      middlewares: js.Array[MiddlewareFunction[js.Object]]
    ): Argv[T] = js.native
    def command[O /* <: StringDictionary[Options] */](
      command: String,
      description: String,
      builder: O,
      handler: js.Function1[/* args */ ArgumentsCamelCase[InferredOptionTypes[O]], Unit | js.Promise[Unit]],
      middlewares: js.Array[MiddlewareFunction[js.Object]],
      deprecated: String
    ): Argv[T] = js.native
    def command[O /* <: StringDictionary[Options] */](
      command: String,
      description: String,
      builder: O,
      handler: js.Function1[/* args */ ArgumentsCamelCase[InferredOptionTypes[O]], Unit | js.Promise[Unit]],
      middlewares: js.Array[MiddlewareFunction[js.Object]],
      deprecated: Boolean
    ): Argv[T] = js.native
    def command[O /* <: StringDictionary[Options] */](
      command: String,
      description: String,
      builder: O,
      handler: js.Function1[/* args */ ArgumentsCamelCase[InferredOptionTypes[O]], Unit | js.Promise[Unit]],
      middlewares: Unit,
      deprecated: String
    ): Argv[T] = js.native
    def command[O /* <: StringDictionary[Options] */](
      command: String,
      description: String,
      builder: O,
      handler: js.Function1[/* args */ ArgumentsCamelCase[InferredOptionTypes[O]], Unit | js.Promise[Unit]],
      middlewares: Unit,
      deprecated: Boolean
    ): Argv[T] = js.native
    def command[O /* <: StringDictionary[Options] */](
      command: String,
      description: String,
      builder: O,
      handler: Unit,
      middlewares: js.Array[MiddlewareFunction[js.Object]]
    ): Argv[T] = js.native
    def command[O /* <: StringDictionary[Options] */](
      command: String,
      description: String,
      builder: O,
      handler: Unit,
      middlewares: js.Array[MiddlewareFunction[js.Object]],
      deprecated: String
    ): Argv[T] = js.native
    def command[O /* <: StringDictionary[Options] */](
      command: String,
      description: String,
      builder: O,
      handler: Unit,
      middlewares: js.Array[MiddlewareFunction[js.Object]],
      deprecated: Boolean
    ): Argv[T] = js.native
    def command[O /* <: StringDictionary[Options] */](
      command: String,
      description: String,
      builder: O,
      handler: Unit,
      middlewares: Unit,
      deprecated: String
    ): Argv[T] = js.native
    def command[O /* <: StringDictionary[Options] */](
      command: String,
      description: String,
      builder: O,
      handler: Unit,
      middlewares: Unit,
      deprecated: Boolean
    ): Argv[T] = js.native
    def command[O /* <: StringDictionary[Options] */](
      command: String,
      description: String,
      builder: Unit,
      handler: js.Function1[/* args */ ArgumentsCamelCase[InferredOptionTypes[O]], Unit | js.Promise[Unit]]
    ): Argv[T] = js.native
    def command[O /* <: StringDictionary[Options] */](
      command: String,
      description: String,
      builder: Unit,
      handler: js.Function1[/* args */ ArgumentsCamelCase[InferredOptionTypes[O]], Unit | js.Promise[Unit]],
      middlewares: js.Array[MiddlewareFunction[js.Object]]
    ): Argv[T] = js.native
    def command[O /* <: StringDictionary[Options] */](
      command: String,
      description: String,
      builder: Unit,
      handler: js.Function1[/* args */ ArgumentsCamelCase[InferredOptionTypes[O]], Unit | js.Promise[Unit]],
      middlewares: js.Array[MiddlewareFunction[js.Object]],
      deprecated: String
    ): Argv[T] = js.native
    def command[O /* <: StringDictionary[Options] */](
      command: String,
      description: String,
      builder: Unit,
      handler: js.Function1[/* args */ ArgumentsCamelCase[InferredOptionTypes[O]], Unit | js.Promise[Unit]],
      middlewares: js.Array[MiddlewareFunction[js.Object]],
      deprecated: Boolean
    ): Argv[T] = js.native
    def command[O /* <: StringDictionary[Options] */](
      command: String,
      description: String,
      builder: Unit,
      handler: js.Function1[/* args */ ArgumentsCamelCase[InferredOptionTypes[O]], Unit | js.Promise[Unit]],
      middlewares: Unit,
      deprecated: String
    ): Argv[T] = js.native
    def command[O /* <: StringDictionary[Options] */](
      command: String,
      description: String,
      builder: Unit,
      handler: js.Function1[/* args */ ArgumentsCamelCase[InferredOptionTypes[O]], Unit | js.Promise[Unit]],
      middlewares: Unit,
      deprecated: Boolean
    ): Argv[T] = js.native
    def command[O /* <: StringDictionary[Options] */](
      command: String,
      description: String,
      builder: Unit,
      handler: Unit,
      middlewares: js.Array[MiddlewareFunction[js.Object]]
    ): Argv[T] = js.native
    def command[O /* <: StringDictionary[Options] */](
      command: String,
      description: String,
      builder: Unit,
      handler: Unit,
      middlewares: js.Array[MiddlewareFunction[js.Object]],
      deprecated: String
    ): Argv[T] = js.native
    def command[O /* <: StringDictionary[Options] */](
      command: String,
      description: String,
      builder: Unit,
      handler: Unit,
      middlewares: js.Array[MiddlewareFunction[js.Object]],
      deprecated: Boolean
    ): Argv[T] = js.native
    def command[O /* <: StringDictionary[Options] */](
      command: String,
      description: String,
      builder: Unit,
      handler: Unit,
      middlewares: Unit,
      deprecated: String
    ): Argv[T] = js.native
    def command[O /* <: StringDictionary[Options] */](
      command: String,
      description: String,
      builder: Unit,
      handler: Unit,
      middlewares: Unit,
      deprecated: Boolean
    ): Argv[T] = js.native
    def command[U](command: String, description: String, builder: BuilderCallback[T, U]): Argv[U] = js.native
    def command[U](
      command: String,
      description: String,
      builder: BuilderCallback[T, U],
      handler: js.Function1[/* args */ ArgumentsCamelCase[U], Unit | js.Promise[Unit]]
    ): Argv[U] = js.native
    def command[U](
      command: String,
      description: String,
      builder: BuilderCallback[T, U],
      handler: js.Function1[/* args */ ArgumentsCamelCase[U], Unit | js.Promise[Unit]],
      middlewares: js.Array[MiddlewareFunction[js.Object]]
    ): Argv[U] = js.native
    def command[U](
      command: String,
      description: String,
      builder: BuilderCallback[T, U],
      handler: js.Function1[/* args */ ArgumentsCamelCase[U], Unit | js.Promise[Unit]],
      middlewares: js.Array[MiddlewareFunction[js.Object]],
      deprecated: String
    ): Argv[U] = js.native
    def command[U](
      command: String,
      description: String,
      builder: BuilderCallback[T, U],
      handler: js.Function1[/* args */ ArgumentsCamelCase[U], Unit | js.Promise[Unit]],
      middlewares: js.Array[MiddlewareFunction[js.Object]],
      deprecated: Boolean
    ): Argv[U] = js.native
    def command[U](
      command: String,
      description: String,
      builder: BuilderCallback[T, U],
      handler: js.Function1[/* args */ ArgumentsCamelCase[U], Unit | js.Promise[Unit]],
      middlewares: Unit,
      deprecated: String
    ): Argv[U] = js.native
    def command[U](
      command: String,
      description: String,
      builder: BuilderCallback[T, U],
      handler: js.Function1[/* args */ ArgumentsCamelCase[U], Unit | js.Promise[Unit]],
      middlewares: Unit,
      deprecated: Boolean
    ): Argv[U] = js.native
    def command[U](
      command: String,
      description: String,
      builder: BuilderCallback[T, U],
      handler: Unit,
      middlewares: js.Array[MiddlewareFunction[js.Object]]
    ): Argv[U] = js.native
    def command[U](
      command: String,
      description: String,
      builder: BuilderCallback[T, U],
      handler: Unit,
      middlewares: js.Array[MiddlewareFunction[js.Object]],
      deprecated: String
    ): Argv[U] = js.native
    def command[U](
      command: String,
      description: String,
      builder: BuilderCallback[T, U],
      handler: Unit,
      middlewares: js.Array[MiddlewareFunction[js.Object]],
      deprecated: Boolean
    ): Argv[U] = js.native
    def command[U](
      command: String,
      description: String,
      builder: BuilderCallback[T, U],
      handler: Unit,
      middlewares: Unit,
      deprecated: String
    ): Argv[U] = js.native
    def command[U](
      command: String,
      description: String,
      builder: BuilderCallback[T, U],
      handler: Unit,
      middlewares: Unit,
      deprecated: Boolean
    ): Argv[U] = js.native
    def command[U](command: String, description: String, module: CommandModule[T, U]): Argv[U] = js.native
    def command[O /* <: StringDictionary[Options] */](command: js.Array[String], description: String): Argv[T] = js.native
    def command[O /* <: StringDictionary[Options] */](command: js.Array[String], description: String, builder: O): Argv[T] = js.native
    def command[O /* <: StringDictionary[Options] */](
      command: js.Array[String],
      description: String,
      builder: O,
      handler: js.Function1[/* args */ ArgumentsCamelCase[InferredOptionTypes[O]], Unit | js.Promise[Unit]]
    ): Argv[T] = js.native
    def command[O /* <: StringDictionary[Options] */](
      command: js.Array[String],
      description: String,
      builder: O,
      handler: js.Function1[/* args */ ArgumentsCamelCase[InferredOptionTypes[O]], Unit | js.Promise[Unit]],
      middlewares: js.Array[MiddlewareFunction[js.Object]]
    ): Argv[T] = js.native
    def command[O /* <: StringDictionary[Options] */](
      command: js.Array[String],
      description: String,
      builder: O,
      handler: js.Function1[/* args */ ArgumentsCamelCase[InferredOptionTypes[O]], Unit | js.Promise[Unit]],
      middlewares: js.Array[MiddlewareFunction[js.Object]],
      deprecated: String
    ): Argv[T] = js.native
    def command[O /* <: StringDictionary[Options] */](
      command: js.Array[String],
      description: String,
      builder: O,
      handler: js.Function1[/* args */ ArgumentsCamelCase[InferredOptionTypes[O]], Unit | js.Promise[Unit]],
      middlewares: js.Array[MiddlewareFunction[js.Object]],
      deprecated: Boolean
    ): Argv[T] = js.native
    def command[O /* <: StringDictionary[Options] */](
      command: js.Array[String],
      description: String,
      builder: O,
      handler: js.Function1[/* args */ ArgumentsCamelCase[InferredOptionTypes[O]], Unit | js.Promise[Unit]],
      middlewares: Unit,
      deprecated: String
    ): Argv[T] = js.native
    def command[O /* <: StringDictionary[Options] */](
      command: js.Array[String],
      description: String,
      builder: O,
      handler: js.Function1[/* args */ ArgumentsCamelCase[InferredOptionTypes[O]], Unit | js.Promise[Unit]],
      middlewares: Unit,
      deprecated: Boolean
    ): Argv[T] = js.native
    def command[O /* <: StringDictionary[Options] */](
      command: js.Array[String],
      description: String,
      builder: O,
      handler: Unit,
      middlewares: js.Array[MiddlewareFunction[js.Object]]
    ): Argv[T] = js.native
    def command[O /* <: StringDictionary[Options] */](
      command: js.Array[String],
      description: String,
      builder: O,
      handler: Unit,
      middlewares: js.Array[MiddlewareFunction[js.Object]],
      deprecated: String
    ): Argv[T] = js.native
    def command[O /* <: StringDictionary[Options] */](
      command: js.Array[String],
      description: String,
      builder: O,
      handler: Unit,
      middlewares: js.Array[MiddlewareFunction[js.Object]],
      deprecated: Boolean
    ): Argv[T] = js.native
    def command[O /* <: StringDictionary[Options] */](
      command: js.Array[String],
      description: String,
      builder: O,
      handler: Unit,
      middlewares: Unit,
      deprecated: String
    ): Argv[T] = js.native
    def command[O /* <: StringDictionary[Options] */](
      command: js.Array[String],
      description: String,
      builder: O,
      handler: Unit,
      middlewares: Unit,
      deprecated: Boolean
    ): Argv[T] = js.native
    def command[O /* <: StringDictionary[Options] */](
      command: js.Array[String],
      description: String,
      builder: Unit,
      handler: js.Function1[/* args */ ArgumentsCamelCase[InferredOptionTypes[O]], Unit | js.Promise[Unit]]
    ): Argv[T] = js.native
    def command[O /* <: StringDictionary[Options] */](
      command: js.Array[String],
      description: String,
      builder: Unit,
      handler: js.Function1[/* args */ ArgumentsCamelCase[InferredOptionTypes[O]], Unit | js.Promise[Unit]],
      middlewares: js.Array[MiddlewareFunction[js.Object]]
    ): Argv[T] = js.native
    def command[O /* <: StringDictionary[Options] */](
      command: js.Array[String],
      description: String,
      builder: Unit,
      handler: js.Function1[/* args */ ArgumentsCamelCase[InferredOptionTypes[O]], Unit | js.Promise[Unit]],
      middlewares: js.Array[MiddlewareFunction[js.Object]],
      deprecated: String
    ): Argv[T] = js.native
    def command[O /* <: StringDictionary[Options] */](
      command: js.Array[String],
      description: String,
      builder: Unit,
      handler: js.Function1[/* args */ ArgumentsCamelCase[InferredOptionTypes[O]], Unit | js.Promise[Unit]],
      middlewares: js.Array[MiddlewareFunction[js.Object]],
      deprecated: Boolean
    ): Argv[T] = js.native
    def command[O /* <: StringDictionary[Options] */](
      command: js.Array[String],
      description: String,
      builder: Unit,
      handler: js.Function1[/* args */ ArgumentsCamelCase[InferredOptionTypes[O]], Unit | js.Promise[Unit]],
      middlewares: Unit,
      deprecated: String
    ): Argv[T] = js.native
    def command[O /* <: StringDictionary[Options] */](
      command: js.Array[String],
      description: String,
      builder: Unit,
      handler: js.Function1[/* args */ ArgumentsCamelCase[InferredOptionTypes[O]], Unit | js.Promise[Unit]],
      middlewares: Unit,
      deprecated: Boolean
    ): Argv[T] = js.native
    def command[O /* <: StringDictionary[Options] */](
      command: js.Array[String],
      description: String,
      builder: Unit,
      handler: Unit,
      middlewares: js.Array[MiddlewareFunction[js.Object]]
    ): Argv[T] = js.native
    def command[O /* <: StringDictionary[Options] */](
      command: js.Array[String],
      description: String,
      builder: Unit,
      handler: Unit,
      middlewares: js.Array[MiddlewareFunction[js.Object]],
      deprecated: String
    ): Argv[T] = js.native
    def command[O /* <: StringDictionary[Options] */](
      command: js.Array[String],
      description: String,
      builder: Unit,
      handler: Unit,
      middlewares: js.Array[MiddlewareFunction[js.Object]],
      deprecated: Boolean
    ): Argv[T] = js.native
    def command[O /* <: StringDictionary[Options] */](
      command: js.Array[String],
      description: String,
      builder: Unit,
      handler: Unit,
      middlewares: Unit,
      deprecated: String
    ): Argv[T] = js.native
    def command[O /* <: StringDictionary[Options] */](
      command: js.Array[String],
      description: String,
      builder: Unit,
      handler: Unit,
      middlewares: Unit,
      deprecated: Boolean
    ): Argv[T] = js.native
    def command[U](command: js.Array[String], description: String, builder: BuilderCallback[T, U]): Argv[U] = js.native
    def command[U](
      command: js.Array[String],
      description: String,
      builder: BuilderCallback[T, U],
      handler: js.Function1[/* args */ ArgumentsCamelCase[U], Unit | js.Promise[Unit]]
    ): Argv[U] = js.native
    def command[U](
      command: js.Array[String],
      description: String,
      builder: BuilderCallback[T, U],
      handler: js.Function1[/* args */ ArgumentsCamelCase[U], Unit | js.Promise[Unit]],
      middlewares: js.Array[MiddlewareFunction[js.Object]]
    ): Argv[U] = js.native
    def command[U](
      command: js.Array[String],
      description: String,
      builder: BuilderCallback[T, U],
      handler: js.Function1[/* args */ ArgumentsCamelCase[U], Unit | js.Promise[Unit]],
      middlewares: js.Array[MiddlewareFunction[js.Object]],
      deprecated: String
    ): Argv[U] = js.native
    def command[U](
      command: js.Array[String],
      description: String,
      builder: BuilderCallback[T, U],
      handler: js.Function1[/* args */ ArgumentsCamelCase[U], Unit | js.Promise[Unit]],
      middlewares: js.Array[MiddlewareFunction[js.Object]],
      deprecated: Boolean
    ): Argv[U] = js.native
    def command[U](
      command: js.Array[String],
      description: String,
      builder: BuilderCallback[T, U],
      handler: js.Function1[/* args */ ArgumentsCamelCase[U], Unit | js.Promise[Unit]],
      middlewares: Unit,
      deprecated: String
    ): Argv[U] = js.native
    def command[U](
      command: js.Array[String],
      description: String,
      builder: BuilderCallback[T, U],
      handler: js.Function1[/* args */ ArgumentsCamelCase[U], Unit | js.Promise[Unit]],
      middlewares: Unit,
      deprecated: Boolean
    ): Argv[U] = js.native
    def command[U](
      command: js.Array[String],
      description: String,
      builder: BuilderCallback[T, U],
      handler: Unit,
      middlewares: js.Array[MiddlewareFunction[js.Object]]
    ): Argv[U] = js.native
    def command[U](
      command: js.Array[String],
      description: String,
      builder: BuilderCallback[T, U],
      handler: Unit,
      middlewares: js.Array[MiddlewareFunction[js.Object]],
      deprecated: String
    ): Argv[U] = js.native
    def command[U](
      command: js.Array[String],
      description: String,
      builder: BuilderCallback[T, U],
      handler: Unit,
      middlewares: js.Array[MiddlewareFunction[js.Object]],
      deprecated: Boolean
    ): Argv[U] = js.native
    def command[U](
      command: js.Array[String],
      description: String,
      builder: BuilderCallback[T, U],
      handler: Unit,
      middlewares: Unit,
      deprecated: String
    ): Argv[U] = js.native
    def command[U](
      command: js.Array[String],
      description: String,
      builder: BuilderCallback[T, U],
      handler: Unit,
      middlewares: Unit,
      deprecated: Boolean
    ): Argv[U] = js.native
    def command[U](command: js.Array[String], description: String, module: CommandModule[T, U]): Argv[U] = js.native
    def command[U](module: CommandModule[T, U]): Argv[U] = js.native
    
    // Advanced API
    /** Apply command modules from a directory relative to the module calling this method. */
    def commandDir(dir: String): Argv[T] = js.native
    def commandDir(dir: String, opts: RequireDirectoryOptions): Argv[T] = js.native
    
    /**
      * Define the commands exposed by your application.
      * @param command Should be a string representing the command or an array of strings representing the command and its aliases.
      * @param description Use to provide a description for each command your application accepts (the values stored in `argv._`).
      * Set `description` to false to create a hidden command. Hidden commands don't show up in the help output and aren't available for completion.
      * @param [builder] Object to give hints about the options that your command accepts.
      * Can also be a function. This function is executed with a yargs instance, and can be used to provide advanced command specific help.
      *
      * Note that when `void` is returned, the handler `argv` object type will not include command-specific arguments.
      * @param [handler] Function, which will be executed with the parsed `argv` object.
      */
    @JSName("command")
    def command_U[U](command: String, description: String): Argv[U] = js.native
    @JSName("command")
    def command_U[U](
      command: String,
      description: String,
      builder: Unit,
      handler: js.Function1[/* args */ ArgumentsCamelCase[U], Unit | js.Promise[Unit]]
    ): Argv[U] = js.native
    @JSName("command")
    def command_U[U](
      command: String,
      description: String,
      builder: Unit,
      handler: js.Function1[/* args */ ArgumentsCamelCase[U], Unit | js.Promise[Unit]],
      middlewares: js.Array[MiddlewareFunction[js.Object]]
    ): Argv[U] = js.native
    @JSName("command")
    def command_U[U](
      command: String,
      description: String,
      builder: Unit,
      handler: js.Function1[/* args */ ArgumentsCamelCase[U], Unit | js.Promise[Unit]],
      middlewares: js.Array[MiddlewareFunction[js.Object]],
      deprecated: String
    ): Argv[U] = js.native
    @JSName("command")
    def command_U[U](
      command: String,
      description: String,
      builder: Unit,
      handler: js.Function1[/* args */ ArgumentsCamelCase[U], Unit | js.Promise[Unit]],
      middlewares: js.Array[MiddlewareFunction[js.Object]],
      deprecated: Boolean
    ): Argv[U] = js.native
    @JSName("command")
    def command_U[U](
      command: String,
      description: String,
      builder: Unit,
      handler: js.Function1[/* args */ ArgumentsCamelCase[U], Unit | js.Promise[Unit]],
      middlewares: Unit,
      deprecated: String
    ): Argv[U] = js.native
    @JSName("command")
    def command_U[U](
      command: String,
      description: String,
      builder: Unit,
      handler: js.Function1[/* args */ ArgumentsCamelCase[U], Unit | js.Promise[Unit]],
      middlewares: Unit,
      deprecated: Boolean
    ): Argv[U] = js.native
    @JSName("command")
    def command_U[U](
      command: String,
      description: String,
      builder: Unit,
      handler: Unit,
      middlewares: js.Array[MiddlewareFunction[js.Object]]
    ): Argv[U] = js.native
    @JSName("command")
    def command_U[U](
      command: String,
      description: String,
      builder: Unit,
      handler: Unit,
      middlewares: js.Array[MiddlewareFunction[js.Object]],
      deprecated: String
    ): Argv[U] = js.native
    @JSName("command")
    def command_U[U](
      command: String,
      description: String,
      builder: Unit,
      handler: Unit,
      middlewares: js.Array[MiddlewareFunction[js.Object]],
      deprecated: Boolean
    ): Argv[U] = js.native
    @JSName("command")
    def command_U[U](
      command: String,
      description: String,
      builder: Unit,
      handler: Unit,
      middlewares: Unit,
      deprecated: String
    ): Argv[U] = js.native
    @JSName("command")
    def command_U[U](
      command: String,
      description: String,
      builder: Unit,
      handler: Unit,
      middlewares: Unit,
      deprecated: Boolean
    ): Argv[U] = js.native
    @JSName("command")
    def command_U[U](command: js.Array[String], description: String): Argv[U] = js.native
    @JSName("command")
    def command_U[U](
      command: js.Array[String],
      description: String,
      builder: Unit,
      handler: js.Function1[/* args */ ArgumentsCamelCase[U], Unit | js.Promise[Unit]]
    ): Argv[U] = js.native
    @JSName("command")
    def command_U[U](
      command: js.Array[String],
      description: String,
      builder: Unit,
      handler: js.Function1[/* args */ ArgumentsCamelCase[U], Unit | js.Promise[Unit]],
      middlewares: js.Array[MiddlewareFunction[js.Object]]
    ): Argv[U] = js.native
    @JSName("command")
    def command_U[U](
      command: js.Array[String],
      description: String,
      builder: Unit,
      handler: js.Function1[/* args */ ArgumentsCamelCase[U], Unit | js.Promise[Unit]],
      middlewares: js.Array[MiddlewareFunction[js.Object]],
      deprecated: String
    ): Argv[U] = js.native
    @JSName("command")
    def command_U[U](
      command: js.Array[String],
      description: String,
      builder: Unit,
      handler: js.Function1[/* args */ ArgumentsCamelCase[U], Unit | js.Promise[Unit]],
      middlewares: js.Array[MiddlewareFunction[js.Object]],
      deprecated: Boolean
    ): Argv[U] = js.native
    @JSName("command")
    def command_U[U](
      command: js.Array[String],
      description: String,
      builder: Unit,
      handler: js.Function1[/* args */ ArgumentsCamelCase[U], Unit | js.Promise[Unit]],
      middlewares: Unit,
      deprecated: String
    ): Argv[U] = js.native
    @JSName("command")
    def command_U[U](
      command: js.Array[String],
      description: String,
      builder: Unit,
      handler: js.Function1[/* args */ ArgumentsCamelCase[U], Unit | js.Promise[Unit]],
      middlewares: Unit,
      deprecated: Boolean
    ): Argv[U] = js.native
    @JSName("command")
    def command_U[U](
      command: js.Array[String],
      description: String,
      builder: Unit,
      handler: Unit,
      middlewares: js.Array[MiddlewareFunction[js.Object]]
    ): Argv[U] = js.native
    @JSName("command")
    def command_U[U](
      command: js.Array[String],
      description: String,
      builder: Unit,
      handler: Unit,
      middlewares: js.Array[MiddlewareFunction[js.Object]],
      deprecated: String
    ): Argv[U] = js.native
    @JSName("command")
    def command_U[U](
      command: js.Array[String],
      description: String,
      builder: Unit,
      handler: Unit,
      middlewares: js.Array[MiddlewareFunction[js.Object]],
      deprecated: Boolean
    ): Argv[U] = js.native
    @JSName("command")
    def command_U[U](
      command: js.Array[String],
      description: String,
      builder: Unit,
      handler: Unit,
      middlewares: Unit,
      deprecated: String
    ): Argv[U] = js.native
    @JSName("command")
    def command_U[U](
      command: js.Array[String],
      description: String,
      builder: Unit,
      handler: Unit,
      middlewares: Unit,
      deprecated: Boolean
    ): Argv[U] = js.native
    @JSName("command")
    def command_false[O /* <: StringDictionary[Options] */](command: String, showInHelp: `false`): Argv[T] = js.native
    @JSName("command")
    def command_false[O /* <: StringDictionary[Options] */](command: String, showInHelp: `false`, builder: O): Argv[T] = js.native
    @JSName("command")
    def command_false[O /* <: StringDictionary[Options] */](
      command: String,
      showInHelp: `false`,
      builder: O,
      handler: js.Function1[/* args */ ArgumentsCamelCase[InferredOptionTypes[O]], Unit | js.Promise[Unit]]
    ): Argv[T] = js.native
    @JSName("command")
    def command_false[O /* <: StringDictionary[Options] */](
      command: String,
      showInHelp: `false`,
      builder: Unit,
      handler: js.Function1[/* args */ ArgumentsCamelCase[InferredOptionTypes[O]], Unit | js.Promise[Unit]]
    ): Argv[T] = js.native
    @JSName("command")
    def command_false[U](
      command: String,
      showInHelp: `false`,
      builder: Unit,
      handler: js.Function1[/* args */ ArgumentsCamelCase[U], Unit | js.Promise[Unit]],
      middlewares: js.Array[MiddlewareFunction[js.Object]]
    ): Argv[T] = js.native
    @JSName("command")
    def command_false[U](
      command: String,
      showInHelp: `false`,
      builder: Unit,
      handler: js.Function1[/* args */ ArgumentsCamelCase[U], Unit | js.Promise[Unit]],
      middlewares: js.Array[MiddlewareFunction[js.Object]],
      deprecated: String
    ): Argv[T] = js.native
    @JSName("command")
    def command_false[U](
      command: String,
      showInHelp: `false`,
      builder: Unit,
      handler: js.Function1[/* args */ ArgumentsCamelCase[U], Unit | js.Promise[Unit]],
      middlewares: js.Array[MiddlewareFunction[js.Object]],
      deprecated: Boolean
    ): Argv[T] = js.native
    @JSName("command")
    def command_false[U](
      command: String,
      showInHelp: `false`,
      builder: Unit,
      handler: js.Function1[/* args */ ArgumentsCamelCase[U], Unit | js.Promise[Unit]],
      middlewares: Unit,
      deprecated: String
    ): Argv[T] = js.native
    @JSName("command")
    def command_false[U](
      command: String,
      showInHelp: `false`,
      builder: Unit,
      handler: js.Function1[/* args */ ArgumentsCamelCase[U], Unit | js.Promise[Unit]],
      middlewares: Unit,
      deprecated: Boolean
    ): Argv[T] = js.native
    @JSName("command")
    def command_false[U](
      command: String,
      showInHelp: `false`,
      builder: Unit,
      handler: Unit,
      middlewares: js.Array[MiddlewareFunction[js.Object]]
    ): Argv[T] = js.native
    @JSName("command")
    def command_false[U](
      command: String,
      showInHelp: `false`,
      builder: Unit,
      handler: Unit,
      middlewares: js.Array[MiddlewareFunction[js.Object]],
      deprecated: String
    ): Argv[T] = js.native
    @JSName("command")
    def command_false[U](
      command: String,
      showInHelp: `false`,
      builder: Unit,
      handler: Unit,
      middlewares: js.Array[MiddlewareFunction[js.Object]],
      deprecated: Boolean
    ): Argv[T] = js.native
    @JSName("command")
    def command_false[U](
      command: String,
      showInHelp: `false`,
      builder: Unit,
      handler: Unit,
      middlewares: Unit,
      deprecated: String
    ): Argv[T] = js.native
    @JSName("command")
    def command_false[U](
      command: String,
      showInHelp: `false`,
      builder: Unit,
      handler: Unit,
      middlewares: Unit,
      deprecated: Boolean
    ): Argv[T] = js.native
    @JSName("command")
    def command_false[U](command: String, showInHelp: `false`, builder: BuilderCallback[T, U]): Argv[T] = js.native
    @JSName("command")
    def command_false[U](
      command: String,
      showInHelp: `false`,
      builder: BuilderCallback[T, U],
      handler: js.Function1[/* args */ ArgumentsCamelCase[U], Unit | js.Promise[Unit]]
    ): Argv[T] = js.native
    @JSName("command")
    def command_false[U](
      command: String,
      showInHelp: `false`,
      builder: BuilderCallback[T, U],
      handler: js.Function1[/* args */ ArgumentsCamelCase[U], Unit | js.Promise[Unit]],
      middlewares: js.Array[MiddlewareFunction[js.Object]]
    ): Argv[T] = js.native
    @JSName("command")
    def command_false[U](
      command: String,
      showInHelp: `false`,
      builder: BuilderCallback[T, U],
      handler: js.Function1[/* args */ ArgumentsCamelCase[U], Unit | js.Promise[Unit]],
      middlewares: js.Array[MiddlewareFunction[js.Object]],
      deprecated: String
    ): Argv[T] = js.native
    @JSName("command")
    def command_false[U](
      command: String,
      showInHelp: `false`,
      builder: BuilderCallback[T, U],
      handler: js.Function1[/* args */ ArgumentsCamelCase[U], Unit | js.Promise[Unit]],
      middlewares: js.Array[MiddlewareFunction[js.Object]],
      deprecated: Boolean
    ): Argv[T] = js.native
    @JSName("command")
    def command_false[U](
      command: String,
      showInHelp: `false`,
      builder: BuilderCallback[T, U],
      handler: js.Function1[/* args */ ArgumentsCamelCase[U], Unit | js.Promise[Unit]],
      middlewares: Unit,
      deprecated: String
    ): Argv[T] = js.native
    @JSName("command")
    def command_false[U](
      command: String,
      showInHelp: `false`,
      builder: BuilderCallback[T, U],
      handler: js.Function1[/* args */ ArgumentsCamelCase[U], Unit | js.Promise[Unit]],
      middlewares: Unit,
      deprecated: Boolean
    ): Argv[T] = js.native
    @JSName("command")
    def command_false[U](
      command: String,
      showInHelp: `false`,
      builder: BuilderCallback[T, U],
      handler: Unit,
      middlewares: js.Array[MiddlewareFunction[js.Object]]
    ): Argv[T] = js.native
    @JSName("command")
    def command_false[U](
      command: String,
      showInHelp: `false`,
      builder: BuilderCallback[T, U],
      handler: Unit,
      middlewares: js.Array[MiddlewareFunction[js.Object]],
      deprecated: String
    ): Argv[T] = js.native
    @JSName("command")
    def command_false[U](
      command: String,
      showInHelp: `false`,
      builder: BuilderCallback[T, U],
      handler: Unit,
      middlewares: js.Array[MiddlewareFunction[js.Object]],
      deprecated: Boolean
    ): Argv[T] = js.native
    @JSName("command")
    def command_false[U](
      command: String,
      showInHelp: `false`,
      builder: BuilderCallback[T, U],
      handler: Unit,
      middlewares: Unit,
      deprecated: String
    ): Argv[T] = js.native
    @JSName("command")
    def command_false[U](
      command: String,
      showInHelp: `false`,
      builder: BuilderCallback[T, U],
      handler: Unit,
      middlewares: Unit,
      deprecated: Boolean
    ): Argv[T] = js.native
    @JSName("command")
    def command_false[U](command: String, showInHelp: `false`, module: CommandModule[T, U]): Argv[U] = js.native
    @JSName("command")
    def command_false[O /* <: StringDictionary[Options] */](command: js.Array[String], showInHelp: `false`): Argv[T] = js.native
    @JSName("command")
    def command_false[O /* <: StringDictionary[Options] */](command: js.Array[String], showInHelp: `false`, builder: O): Argv[T] = js.native
    @JSName("command")
    def command_false[O /* <: StringDictionary[Options] */](
      command: js.Array[String],
      showInHelp: `false`,
      builder: O,
      handler: js.Function1[/* args */ ArgumentsCamelCase[InferredOptionTypes[O]], Unit | js.Promise[Unit]]
    ): Argv[T] = js.native
    @JSName("command")
    def command_false[O /* <: StringDictionary[Options] */](
      command: js.Array[String],
      showInHelp: `false`,
      builder: Unit,
      handler: js.Function1[/* args */ ArgumentsCamelCase[InferredOptionTypes[O]], Unit | js.Promise[Unit]]
    ): Argv[T] = js.native
    @JSName("command")
    def command_false[U](
      command: js.Array[String],
      showInHelp: `false`,
      builder: Unit,
      handler: js.Function1[/* args */ ArgumentsCamelCase[U], Unit | js.Promise[Unit]],
      middlewares: js.Array[MiddlewareFunction[js.Object]]
    ): Argv[T] = js.native
    @JSName("command")
    def command_false[U](
      command: js.Array[String],
      showInHelp: `false`,
      builder: Unit,
      handler: js.Function1[/* args */ ArgumentsCamelCase[U], Unit | js.Promise[Unit]],
      middlewares: js.Array[MiddlewareFunction[js.Object]],
      deprecated: String
    ): Argv[T] = js.native
    @JSName("command")
    def command_false[U](
      command: js.Array[String],
      showInHelp: `false`,
      builder: Unit,
      handler: js.Function1[/* args */ ArgumentsCamelCase[U], Unit | js.Promise[Unit]],
      middlewares: js.Array[MiddlewareFunction[js.Object]],
      deprecated: Boolean
    ): Argv[T] = js.native
    @JSName("command")
    def command_false[U](
      command: js.Array[String],
      showInHelp: `false`,
      builder: Unit,
      handler: js.Function1[/* args */ ArgumentsCamelCase[U], Unit | js.Promise[Unit]],
      middlewares: Unit,
      deprecated: String
    ): Argv[T] = js.native
    @JSName("command")
    def command_false[U](
      command: js.Array[String],
      showInHelp: `false`,
      builder: Unit,
      handler: js.Function1[/* args */ ArgumentsCamelCase[U], Unit | js.Promise[Unit]],
      middlewares: Unit,
      deprecated: Boolean
    ): Argv[T] = js.native
    @JSName("command")
    def command_false[U](
      command: js.Array[String],
      showInHelp: `false`,
      builder: Unit,
      handler: Unit,
      middlewares: js.Array[MiddlewareFunction[js.Object]]
    ): Argv[T] = js.native
    @JSName("command")
    def command_false[U](
      command: js.Array[String],
      showInHelp: `false`,
      builder: Unit,
      handler: Unit,
      middlewares: js.Array[MiddlewareFunction[js.Object]],
      deprecated: String
    ): Argv[T] = js.native
    @JSName("command")
    def command_false[U](
      command: js.Array[String],
      showInHelp: `false`,
      builder: Unit,
      handler: Unit,
      middlewares: js.Array[MiddlewareFunction[js.Object]],
      deprecated: Boolean
    ): Argv[T] = js.native
    @JSName("command")
    def command_false[U](
      command: js.Array[String],
      showInHelp: `false`,
      builder: Unit,
      handler: Unit,
      middlewares: Unit,
      deprecated: String
    ): Argv[T] = js.native
    @JSName("command")
    def command_false[U](
      command: js.Array[String],
      showInHelp: `false`,
      builder: Unit,
      handler: Unit,
      middlewares: Unit,
      deprecated: Boolean
    ): Argv[T] = js.native
    @JSName("command")
    def command_false[U](command: js.Array[String], showInHelp: `false`, builder: BuilderCallback[T, U]): Argv[T] = js.native
    @JSName("command")
    def command_false[U](
      command: js.Array[String],
      showInHelp: `false`,
      builder: BuilderCallback[T, U],
      handler: js.Function1[/* args */ ArgumentsCamelCase[U], Unit | js.Promise[Unit]]
    ): Argv[T] = js.native
    @JSName("command")
    def command_false[U](
      command: js.Array[String],
      showInHelp: `false`,
      builder: BuilderCallback[T, U],
      handler: js.Function1[/* args */ ArgumentsCamelCase[U], Unit | js.Promise[Unit]],
      middlewares: js.Array[MiddlewareFunction[js.Object]]
    ): Argv[T] = js.native
    @JSName("command")
    def command_false[U](
      command: js.Array[String],
      showInHelp: `false`,
      builder: BuilderCallback[T, U],
      handler: js.Function1[/* args */ ArgumentsCamelCase[U], Unit | js.Promise[Unit]],
      middlewares: js.Array[MiddlewareFunction[js.Object]],
      deprecated: String
    ): Argv[T] = js.native
    @JSName("command")
    def command_false[U](
      command: js.Array[String],
      showInHelp: `false`,
      builder: BuilderCallback[T, U],
      handler: js.Function1[/* args */ ArgumentsCamelCase[U], Unit | js.Promise[Unit]],
      middlewares: js.Array[MiddlewareFunction[js.Object]],
      deprecated: Boolean
    ): Argv[T] = js.native
    @JSName("command")
    def command_false[U](
      command: js.Array[String],
      showInHelp: `false`,
      builder: BuilderCallback[T, U],
      handler: js.Function1[/* args */ ArgumentsCamelCase[U], Unit | js.Promise[Unit]],
      middlewares: Unit,
      deprecated: String
    ): Argv[T] = js.native
    @JSName("command")
    def command_false[U](
      command: js.Array[String],
      showInHelp: `false`,
      builder: BuilderCallback[T, U],
      handler: js.Function1[/* args */ ArgumentsCamelCase[U], Unit | js.Promise[Unit]],
      middlewares: Unit,
      deprecated: Boolean
    ): Argv[T] = js.native
    @JSName("command")
    def command_false[U](
      command: js.Array[String],
      showInHelp: `false`,
      builder: BuilderCallback[T, U],
      handler: Unit,
      middlewares: js.Array[MiddlewareFunction[js.Object]]
    ): Argv[T] = js.native
    @JSName("command")
    def command_false[U](
      command: js.Array[String],
      showInHelp: `false`,
      builder: BuilderCallback[T, U],
      handler: Unit,
      middlewares: js.Array[MiddlewareFunction[js.Object]],
      deprecated: String
    ): Argv[T] = js.native
    @JSName("command")
    def command_false[U](
      command: js.Array[String],
      showInHelp: `false`,
      builder: BuilderCallback[T, U],
      handler: Unit,
      middlewares: js.Array[MiddlewareFunction[js.Object]],
      deprecated: Boolean
    ): Argv[T] = js.native
    @JSName("command")
    def command_false[U](
      command: js.Array[String],
      showInHelp: `false`,
      builder: BuilderCallback[T, U],
      handler: Unit,
      middlewares: Unit,
      deprecated: String
    ): Argv[T] = js.native
    @JSName("command")
    def command_false[U](
      command: js.Array[String],
      showInHelp: `false`,
      builder: BuilderCallback[T, U],
      handler: Unit,
      middlewares: Unit,
      deprecated: Boolean
    ): Argv[T] = js.native
    @JSName("command")
    def command_false[U](command: js.Array[String], showInHelp: `false`, module: CommandModule[T, U]): Argv[U] = js.native
    @JSName("command")
    def command_false_U[U](command: String, showInHelp: `false`): Argv[T] = js.native
    @JSName("command")
    def command_false_U[U](
      command: String,
      showInHelp: `false`,
      builder: Unit,
      handler: js.Function1[/* args */ ArgumentsCamelCase[U], Unit | js.Promise[Unit]]
    ): Argv[T] = js.native
    @JSName("command")
    def command_false_U[U](command: js.Array[String], showInHelp: `false`): Argv[T] = js.native
    @JSName("command")
    def command_false_U[U](
      command: js.Array[String],
      showInHelp: `false`,
      builder: Unit,
      handler: js.Function1[/* args */ ArgumentsCamelCase[U], Unit | js.Promise[Unit]]
    ): Argv[T] = js.native
    
    /**
      * Enable bash/zsh-completion shortcuts for commands and options.
      *
      * If invoked without parameters, `.completion()` will make completion the command to output the completion script.
      *
      * @param [cmd] When present in `argv._`, will result in the `.bashrc` or `.zshrc` completion script being outputted.
      * To enable bash/zsh completions, concat the generated script to your `.bashrc` or `.bash_profile` (or `.zshrc` for zsh).
      * @param [description] Provide a description in your usage instructions for the command that generates the completion scripts.
      * @param [func] Rather than relying on yargs' default completion functionality, which shiver me timbers is pretty awesome, you can provide your own completion method.
      */
    def completion(): Argv[T] = js.native
    def completion(cmd: String): Argv[T] = js.native
    def completion(cmd: String, description: String): Argv[T] = js.native
    def completion(cmd: String, description: String, func: PromiseCompletionFunction | SyncCompletionFunction): Argv[T] = js.native
    def completion(cmd: String, description: String, func: AsyncCompletionFunction): Argv[T] = js.native
    def completion(cmd: String, description: Unit, func: PromiseCompletionFunction | SyncCompletionFunction): Argv[T] = js.native
    def completion(cmd: String, description: Unit, func: AsyncCompletionFunction): Argv[T] = js.native
    def completion(cmd: String, func: PromiseCompletionFunction | SyncCompletionFunction): Argv[T] = js.native
    def completion(cmd: String, func: AsyncCompletionFunction): Argv[T] = js.native
    @JSName("completion")
    def completion_false(cmd: String, description: `false`): Argv[T] = js.native
    @JSName("completion")
    def completion_false(cmd: String, description: `false`, func: PromiseCompletionFunction | SyncCompletionFunction): Argv[T] = js.native
    @JSName("completion")
    def completion_false(cmd: String, description: `false`, func: AsyncCompletionFunction): Argv[T] = js.native
    
    /**
      * Tells the parser that if the option specified by `key` is passed in, it should be interpreted as a path to a JSON config file.
      * The file is loaded and parsed, and its properties are set as arguments.
      * Because the file is loaded using Node's require(), the filename MUST end in `.json` to be interpreted correctly.
      *
      * If invoked without parameters, `.config()` will make --config the option to pass the JSON config file.
      *
      * @param [description] Provided to customize the config (`key`) option in the usage string.
      * @param [explicitConfigurationObject] An explicit configuration `object`
      */
    def config(): Argv[T] = js.native
    def config(explicitConfigurationObject: js.Object): Argv[T] = js.native
    def config(key: String): Argv[T] = js.native
    def config(key: String, description: String): Argv[T] = js.native
    def config(key: String, description: String, parseFn: js.Function1[/* configPath */ String, js.Object]): Argv[T] = js.native
    def config(key: String, description: Unit, parseFn: js.Function1[/* configPath */ String, js.Object]): Argv[T] = js.native
    def config(key: String, parseFn: js.Function1[/* configPath */ String, js.Object]): Argv[T] = js.native
    def config(key: js.Array[String]): Argv[T] = js.native
    def config(key: js.Array[String], description: String): Argv[T] = js.native
    def config(
      key: js.Array[String],
      description: String,
      parseFn: js.Function1[/* configPath */ String, js.Object]
    ): Argv[T] = js.native
    def config(
      key: js.Array[String],
      description: Unit,
      parseFn: js.Function1[/* configPath */ String, js.Object]
    ): Argv[T] = js.native
    def config(key: js.Array[String], parseFn: js.Function1[/* configPath */ String, js.Object]): Argv[T] = js.native
    
    def conflicts(conflicts: StringDictionary[String | js.Array[String]]): Argv[T] = js.native
    /**
      * Given the key `x` is set, the key `y` must not be set. `y` can either be a single string or an array of argument names that `x` conflicts with.
      *
      * Optionally `.conflicts()` can accept an object specifying multiple conflicting keys.
      */
    def conflicts(key: String, value: String): Argv[T] = js.native
    def conflicts(key: String, value: js.Array[String]): Argv[T] = js.native
    
    /**
      * Interpret `key` as a boolean flag, but set its parsed value to the number of flag occurrences rather than `true` or `false`. Default value is thus `0`.
      */
    def count[K /* <: /* keyof T */ String */](key: K): Argv[(Omit[T, K]) & typings.yargs.yargsStrings.Argv & TopLevel[Any]] = js.native
    def count[K /* <: /* keyof T */ String */](key: js.Array[K]): Argv[(Omit[T, K]) & typings.yargs.yargsStrings.Argv & TopLevel[Any]] = js.native
    
    def demand(key: String): Argv[T] = js.native
    def demand(key: String, required: Boolean): Argv[T] = js.native
    def demand(key: js.Array[String]): Argv[T] = js.native
    def demand(key: js.Array[String], required: Boolean): Argv[T] = js.native
    def demand(positionals: Double): Argv[T] = js.native
    def demand(positionals: Double, max: Double): Argv[T] = js.native
    def demand(positionals: Double, max: Double, msg: String): Argv[T] = js.native
    def demand(positionals: Double, msg: String): Argv[T] = js.native
    def demand(positionals: Double, required: Boolean): Argv[T] = js.native
    /**
      * @deprecated since version 6.6.0
      * Use '.demandCommand()' or '.demandOption()' instead
      */
    def demand[K /* <: /* keyof T */ String */](key: K): Argv[Defined[T, K]] = js.native
    def demand[K /* <: /* keyof T */ String */](key: K, msg: String): Argv[Defined[T, K]] = js.native
    def demand[K /* <: /* keyof T */ String */](key: js.Array[K], msg: String): Argv[Defined[T, K]] = js.native
    
    /**
      * Demand in context of commands.
      * You can demand a minimum and a maximum number a user can have within your program, as well as provide corresponding error messages if either of the demands is not met.
      */
    def demandCommand(): Argv[T] = js.native
    def demandCommand(min: Double): Argv[T] = js.native
    def demandCommand(min: Double, max: Double): Argv[T] = js.native
    def demandCommand(min: Double, max: Double, minMsg: String): Argv[T] = js.native
    def demandCommand(min: Double, max: Double, minMsg: String, maxMsg: String): Argv[T] = js.native
    def demandCommand(min: Double, max: Double, minMsg: Unit, maxMsg: String): Argv[T] = js.native
    def demandCommand(min: Double, max: Unit, minMsg: String): Argv[T] = js.native
    def demandCommand(min: Double, max: Unit, minMsg: String, maxMsg: String): Argv[T] = js.native
    def demandCommand(min: Double, max: Unit, minMsg: Unit, maxMsg: String): Argv[T] = js.native
    def demandCommand(min: Double, minMsg: String): Argv[T] = js.native
    
    def demandOption(key: String): Argv[T] = js.native
    def demandOption(key: String, demand: Boolean): Argv[T] = js.native
    def demandOption(key: js.Array[String]): Argv[T] = js.native
    def demandOption(key: js.Array[String], demand: Boolean): Argv[T] = js.native
    /**
      * @param key If is a string, show the usage information and exit if key wasn't specified in `process.argv`.
      * If is an array, demand each element.
      * @param msg If string is given, it will be printed when the argument is missing, instead of the standard error message.
      * @param demand Controls whether the option is demanded; this is useful when using .options() to specify command line parameters.
      */
    def demandOption[K /* <: /* keyof T */ String */](key: K): Argv[Defined[T, K]] = js.native
    def demandOption[K /* <: /* keyof T */ String */](key: K, msg: String): Argv[Defined[T, K]] = js.native
    def demandOption[K /* <: /* keyof T */ String */](key: js.Array[K], msg: String): Argv[Defined[T, K]] = js.native
    @JSName("demandOption")
    def demandOption_K_String[K /* <: /* keyof T */ String */](key: js.Array[K]): Argv[Defined[T, K]] = js.native
    @JSName("demandOption")
    def demandOption_true[K /* <: /* keyof T */ String */](key: K, msg: `true`): Argv[Defined[T, K]] = js.native
    @JSName("demandOption")
    def demandOption_true[K /* <: /* keyof T */ String */](key: js.Array[K], msg: `true`): Argv[Defined[T, K]] = js.native
    
    @JSName("demand")
    def demand_K_String[K /* <: /* keyof T */ String */](key: js.Array[K]): Argv[Defined[T, K]] = js.native
    @JSName("demand")
    def demand_true[K /* <: /* keyof T */ String */](key: K, msg: `true`): Argv[Defined[T, K]] = js.native
    @JSName("demand")
    def demand_true[K /* <: /* keyof T */ String */](key: js.Array[K], msg: `true`): Argv[Defined[T, K]] = js.native
    
    /**
      * Shows a [deprecated] notice in front of the option
      */
    def deprecateOption(option: String): Argv[T] = js.native
    def deprecateOption(option: String, msg: String): Argv[T] = js.native
    
    def describe(descriptions: StringDictionary[String]): Argv[T] = js.native
    /**
      * Describe a `key` for the generated usage information.
      *
      * Optionally `.describe()` can take an object that maps keys to descriptions.
      */
    def describe(key: String, description: String): Argv[T] = js.native
    def describe(key: js.Array[String], description: String): Argv[T] = js.native
    
    /** Should yargs attempt to detect the os' locale? Defaults to `true`. */
    def detectLocale(detect: Boolean): Argv[T] = js.native
    
    /**
      * Tell yargs to parse environment variables matching the given prefix and apply them to argv as though they were command line arguments.
      *
      * Use the "__" separator in the environment variable to indicate nested options. (e.g. prefix_nested__foo => nested.foo)
      *
      * If this method is called with no argument or with an empty string or with true, then all env vars will be applied to argv.
      *
      * Program arguments are defined in this order of precedence:
      * 1. Command line args
      * 2. Env vars
      * 3. Config file/objects
      * 4. Configured defaults
      *
      * Env var parsing is disabled by default, but you can also explicitly disable it by calling `.env(false)`, e.g. if you need to undo previous configuration.
      */
    def env(): Argv[T] = js.native
    def env(enable: Boolean): Argv[T] = js.native
    def env(prefix: String): Argv[T] = js.native
    
    /** A message to print at the end of the usage instructions */
    def epilog(msg: String): Argv[T] = js.native
    
    /** A message to print at the end of the usage instructions */
    def epilogue(msg: String): Argv[T] = js.native
    
    /**
      * Give some example invocations of your program.
      * Inside `cmd`, the string `$0` will get interpolated to the current script name or node command for the present script similar to how `$0` works in bash or perl.
      * Examples will be printed out as part of the help message.
      */
    def example(command: String, description: String): Argv[T] = js.native
    def example(command: js.Array[js.Tuple2[String, js.UndefOr[String]]]): Argv[T] = js.native
    
    /** Manually indicate that the program should exit, and provide context about why we wanted to exit. Follows the behavior set by `.exitProcess().` */
    def exit(code: Double, err: js.Error): Unit = js.native
    
    /**
      * By default, yargs exits the process when the user passes a help flag, the user uses the `.version` functionality, validation fails, or the command handler fails.
      * Calling `.exitProcess(false)` disables this behavior, enabling further actions after yargs have been validated.
      */
    def exitProcess(enabled: Boolean): Argv[T] = js.native
    
    /**
      * Method to execute when a failure occurs, rather than printing the failure message.
      * @param func Is called with the failure message that would have been printed, the Error instance originally thrown and yargs state when the failure occurred.
      */
    def fail(func: js.Function3[/* msg */ String, /* err */ js.Error, /* yargs */ Argv[T], Any]): Argv[T] = js.native
    def fail(func: Boolean): Argv[T] = js.native
    
    def getCompletion(args: js.Array[String]): js.Promise[js.Array[String]] = js.native
    /**
      * Allows to programmatically get completion choices for any line.
      * @param args An array of the words in the command line to complete.
      * @param done The callback to be called with the resulting completions.
      */
    def getCompletion(
      args: js.Array[String],
      done: js.Function2[/* err */ js.Error | Null, /* completions */ js.Array[String], Unit]
    ): Argv[T] = js.native
    def getCompletion(args: js.Array[String], done: scala.Nothing): js.Promise[js.Array[String]] = js.native
    
    /**
      * Returns a promise which resolves to a string containing the help text.
      */
    def getHelp(): js.Promise[String] = js.native
    
    /**
      * Indicate that an option (or group of options) should not be reset when a command is executed
      *
      * Options default to being global.
      */
    def global(key: String): Argv[T] = js.native
    def global(key: js.Array[String]): Argv[T] = js.native
    
    /** Given a key, or an array of keys, places options under an alternative heading when displaying usage instructions */
    def group(key: String, groupName: String): Argv[T] = js.native
    def group(key: js.Array[String], groupName: String): Argv[T] = js.native
    
    /**
      * Configure an (e.g. `--help`) and implicit command that displays the usage string and exits the process.
      * By default yargs enables help on the `--help` option.
      *
      * Note that any multi-char aliases (e.g. `help`) used for the help option will also be used for the implicit command.
      * If there are no multi-char aliases (e.g. `h`), then all single-char aliases will be used for the command.
      *
      * If invoked without parameters, `.help()` will use `--help` as the option and help as the implicit command to trigger help output.
      *
      * @param [description] Customizes the description of the help option in the usage string.
      * @param [enableExplicit] If `false` is provided, it will disable --help.
      */
    def help(): Argv[T] = js.native
    def help(enableExplicit: Boolean): Argv[T] = js.native
    def help(option: String): Argv[T] = js.native
    def help(option: String, description: String): Argv[T] = js.native
    def help(option: String, description: String, enableExplicit: Boolean): Argv[T] = js.native
    def help(option: String, description: Unit, enableExplicit: Boolean): Argv[T] = js.native
    def help(option: String, enableExplicit: Boolean): Argv[T] = js.native
    
    /** Hides a key from the generated usage information. Unless a `--show-hidden` option is also passed with `--help` (see `showHidden()`). */
    def hide(key: String): Argv[T] = js.native
    
    def implies(implies: StringDictionary[String | js.Array[String]]): Argv[T] = js.native
    /**
      * Given the key `x` is set, it is required that the key `y` is set.
      * y` can either be the name of an argument to imply, a number indicating the position of an argument or an array of multiple implications to associate with `x`.
      *
      * Optionally `.implies()` can accept an object specifying multiple implications.
      */
    def implies(key: String, value: String): Argv[T] = js.native
    def implies(key: String, value: js.Array[String]): Argv[T] = js.native
    
    /**
      * Return the locale that yargs is currently using.
      *
      * By default, yargs will auto-detect the operating system's locale so that yargs-generated help content will display in the user's language.
      */
    def locale(): String = js.native
    /**
      * Override the auto-detected locale from the user's operating system with a static locale.
      * Note that the OS locale can be modified by setting/exporting the `LC_ALL` environment variable.
      */
    def locale(loc: String): Argv[T] = js.native
    
    def middleware(callbacks: js.Array[MiddlewareFunction[T]]): Argv[T] = js.native
    def middleware(callbacks: js.Array[MiddlewareFunction[T]], applyBeforeValidation: Boolean): Argv[T] = js.native
    /**
      * Define global middleware functions to be called first, in list order, for all cli command.
      * @param callbacks Can be a function or a list of functions. Each callback gets passed a reference to argv.
      * @param [applyBeforeValidation] Set to `true` to apply middleware before validation. This will execute the middleware prior to validation checks, but after parsing.
      */
    def middleware(callbacks: MiddlewareFunction[T]): Argv[T] = js.native
    def middleware(callbacks: MiddlewareFunction[T], applyBeforeValidation: Boolean): Argv[T] = js.native
    
    /**
      * The number of arguments that should be consumed after a key. This can be a useful hint to prevent parsing ambiguity.
      *
      * Optionally `.nargs()` can take an object of `key`/`narg` pairs.
      */
    def nargs(key: String, count: Double): Argv[T] = js.native
    def nargs(nargs: StringDictionary[Double]): Argv[T] = js.native
    
    /** The key provided represents a path and should have `path.normalize()` applied. */
    def normalize[K /* <: /* keyof T */ String */](key: K): Argv[(Omit[T, K]) & typings.yargs.yargsStrings.Argv & TopLevel[T]] = js.native
    def normalize[K /* <: /* keyof T */ String */](key: js.Array[K]): Argv[(Omit[T, K]) & typings.yargs.yargsStrings.Argv & TopLevel[T]] = js.native
    
    /**
      * Tell the parser to always interpret key as a number.
      *
      * If `key` is an array, all elements will be parsed as numbers.
      *
      * If the option is given on the command line without a value, `argv` will be populated with `undefined`.
      *
      * If the value given on the command line cannot be parsed as a number, `argv` will be populated with `NaN`.
      *
      * Note that decimals, hexadecimals, and scientific notation are all accepted.
      */
    def number[K /* <: /* keyof T */ String */](key: K): Argv[(Omit[T, K]) & typings.yargs.yargsStrings.Argv & TopLevel[T]] = js.native
    def number[K /* <: /* keyof T */ String */](key: js.Array[K]): Argv[(Omit[T, K]) & typings.yargs.yargsStrings.Argv & TopLevel[T]] = js.native
    
    /**
      * Method to execute when a command finishes successfully.
      * @param func Is called with the successful result of the command that finished.
      */
    def onFinishCommand(func: js.Function1[/* result */ Any, Unit]): Argv[T] = js.native
    
    def option[O /* <: StringDictionary[Options] */](options: O): Argv[(Omit[T, /* keyof O */ String]) & InferredOptionTypes[O]] = js.native
    /**
      * This method can be used to make yargs aware of options that could exist.
      * You can also pass an opt object which can hold further customization, like `.alias()`, `.demandOption()` etc. for that option.
      */
    def option[K /* <: /* keyof T */ String */, O /* <: Options */](key: K, options: O): Argv[(Omit[T, K]) & typings.yargs.yargsStrings.Argv & TopLevel[Any]] = js.native
    
    def options[O /* <: StringDictionary[Options] */](options: O): Argv[(Omit[T, /* keyof O */ String]) & InferredOptionTypes[O]] = js.native
    /**
      * This method can be used to make yargs aware of options that could exist.
      * You can also pass an opt object which can hold further customization, like `.alias()`, `.demandOption()` etc. for that option.
      */
    def options[K /* <: /* keyof T */ String */, O /* <: Options */](key: K, options: O): Argv[(Omit[T, K]) & typings.yargs.yargsStrings.Argv & TopLevel[Any]] = js.native
    
    /**
      * Parse `args` instead of `process.argv`. Returns the `argv` object. `args` may either be a pre-processed argv array, or a raw argument string.
      *
      * Note: Providing a callback to parse() disables the `exitProcess` setting until after the callback is invoked.
      * @param [context]  Provides a useful mechanism for passing state information to commands
      */
    def parse(): (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in keyof yargs.yargs.Arguments<T> as key | yargs.yargs.CamelCaseKey<key> ]: yargs.yargs.Arguments<T>[key]}
      */ typings.yargs.yargsStrings.Argv & TopLevel[Arguments[T]]) | (js.Promise[
        /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in keyof yargs.yargs.Arguments<T> as key | yargs.yargs.CamelCaseKey<key> ]: yargs.yargs.Arguments<T>[key]}
      */ typings.yargs.yargsStrings.Argv & TopLevel[Arguments[T]]
      ]) = js.native
    def parse(arg: String): (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in keyof yargs.yargs.Arguments<T> as key | yargs.yargs.CamelCaseKey<key> ]: yargs.yargs.Arguments<T>[key]}
      */ typings.yargs.yargsStrings.Argv & TopLevel[Arguments[T]]) | (js.Promise[
        /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in keyof yargs.yargs.Arguments<T> as key | yargs.yargs.CamelCaseKey<key> ]: yargs.yargs.Arguments<T>[key]}
      */ typings.yargs.yargsStrings.Argv & TopLevel[Arguments[T]]
      ]) = js.native
    def parse(arg: String, context: js.Object): (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in keyof yargs.yargs.Arguments<T> as key | yargs.yargs.CamelCaseKey<key> ]: yargs.yargs.Arguments<T>[key]}
      */ typings.yargs.yargsStrings.Argv & TopLevel[Arguments[T]]) | (js.Promise[
        /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in keyof yargs.yargs.Arguments<T> as key | yargs.yargs.CamelCaseKey<key> ]: yargs.yargs.Arguments<T>[key]}
      */ typings.yargs.yargsStrings.Argv & TopLevel[Arguments[T]]
      ]) = js.native
    def parse(arg: String, context: js.Object, parseCallback: ParseCallback[T]): (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in keyof yargs.yargs.Arguments<T> as key | yargs.yargs.CamelCaseKey<key> ]: yargs.yargs.Arguments<T>[key]}
      */ typings.yargs.yargsStrings.Argv & TopLevel[Arguments[T]]) | (js.Promise[
        /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in keyof yargs.yargs.Arguments<T> as key | yargs.yargs.CamelCaseKey<key> ]: yargs.yargs.Arguments<T>[key]}
      */ typings.yargs.yargsStrings.Argv & TopLevel[Arguments[T]]
      ]) = js.native
    def parse(arg: String, context: Unit, parseCallback: ParseCallback[T]): (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in keyof yargs.yargs.Arguments<T> as key | yargs.yargs.CamelCaseKey<key> ]: yargs.yargs.Arguments<T>[key]}
      */ typings.yargs.yargsStrings.Argv & TopLevel[Arguments[T]]) | (js.Promise[
        /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in keyof yargs.yargs.Arguments<T> as key | yargs.yargs.CamelCaseKey<key> ]: yargs.yargs.Arguments<T>[key]}
      */ typings.yargs.yargsStrings.Argv & TopLevel[Arguments[T]]
      ]) = js.native
    def parse(arg: js.Array[String]): (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in keyof yargs.yargs.Arguments<T> as key | yargs.yargs.CamelCaseKey<key> ]: yargs.yargs.Arguments<T>[key]}
      */ typings.yargs.yargsStrings.Argv & TopLevel[Arguments[T]]) | (js.Promise[
        /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in keyof yargs.yargs.Arguments<T> as key | yargs.yargs.CamelCaseKey<key> ]: yargs.yargs.Arguments<T>[key]}
      */ typings.yargs.yargsStrings.Argv & TopLevel[Arguments[T]]
      ]) = js.native
    def parse(arg: js.Array[String], context: js.Object): (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in keyof yargs.yargs.Arguments<T> as key | yargs.yargs.CamelCaseKey<key> ]: yargs.yargs.Arguments<T>[key]}
      */ typings.yargs.yargsStrings.Argv & TopLevel[Arguments[T]]) | (js.Promise[
        /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in keyof yargs.yargs.Arguments<T> as key | yargs.yargs.CamelCaseKey<key> ]: yargs.yargs.Arguments<T>[key]}
      */ typings.yargs.yargsStrings.Argv & TopLevel[Arguments[T]]
      ]) = js.native
    def parse(arg: js.Array[String], context: js.Object, parseCallback: ParseCallback[T]): (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in keyof yargs.yargs.Arguments<T> as key | yargs.yargs.CamelCaseKey<key> ]: yargs.yargs.Arguments<T>[key]}
      */ typings.yargs.yargsStrings.Argv & TopLevel[Arguments[T]]) | (js.Promise[
        /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in keyof yargs.yargs.Arguments<T> as key | yargs.yargs.CamelCaseKey<key> ]: yargs.yargs.Arguments<T>[key]}
      */ typings.yargs.yargsStrings.Argv & TopLevel[Arguments[T]]
      ]) = js.native
    def parse(arg: js.Array[String], context: Unit, parseCallback: ParseCallback[T]): (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in keyof yargs.yargs.Arguments<T> as key | yargs.yargs.CamelCaseKey<key> ]: yargs.yargs.Arguments<T>[key]}
      */ typings.yargs.yargsStrings.Argv & TopLevel[Arguments[T]]) | (js.Promise[
        /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in keyof yargs.yargs.Arguments<T> as key | yargs.yargs.CamelCaseKey<key> ]: yargs.yargs.Arguments<T>[key]}
      */ typings.yargs.yargsStrings.Argv & TopLevel[Arguments[T]]
      ]) = js.native
    
    def parseAsync(): js.Promise[
        /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in keyof yargs.yargs.Arguments<T> as key | yargs.yargs.CamelCaseKey<key> ]: yargs.yargs.Arguments<T>[key]}
      */ typings.yargs.yargsStrings.Argv & TopLevel[Arguments[T]]
      ] = js.native
    def parseAsync(arg: String): js.Promise[
        /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in keyof yargs.yargs.Arguments<T> as key | yargs.yargs.CamelCaseKey<key> ]: yargs.yargs.Arguments<T>[key]}
      */ typings.yargs.yargsStrings.Argv & TopLevel[Arguments[T]]
      ] = js.native
    def parseAsync(arg: String, context: js.Object): js.Promise[
        /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in keyof yargs.yargs.Arguments<T> as key | yargs.yargs.CamelCaseKey<key> ]: yargs.yargs.Arguments<T>[key]}
      */ typings.yargs.yargsStrings.Argv & TopLevel[Arguments[T]]
      ] = js.native
    def parseAsync(arg: String, context: js.Object, parseCallback: ParseCallback[T]): js.Promise[
        /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in keyof yargs.yargs.Arguments<T> as key | yargs.yargs.CamelCaseKey<key> ]: yargs.yargs.Arguments<T>[key]}
      */ typings.yargs.yargsStrings.Argv & TopLevel[Arguments[T]]
      ] = js.native
    def parseAsync(arg: String, context: Unit, parseCallback: ParseCallback[T]): js.Promise[
        /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in keyof yargs.yargs.Arguments<T> as key | yargs.yargs.CamelCaseKey<key> ]: yargs.yargs.Arguments<T>[key]}
      */ typings.yargs.yargsStrings.Argv & TopLevel[Arguments[T]]
      ] = js.native
    def parseAsync(arg: js.Array[String]): js.Promise[
        /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in keyof yargs.yargs.Arguments<T> as key | yargs.yargs.CamelCaseKey<key> ]: yargs.yargs.Arguments<T>[key]}
      */ typings.yargs.yargsStrings.Argv & TopLevel[Arguments[T]]
      ] = js.native
    def parseAsync(arg: js.Array[String], context: js.Object): js.Promise[
        /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in keyof yargs.yargs.Arguments<T> as key | yargs.yargs.CamelCaseKey<key> ]: yargs.yargs.Arguments<T>[key]}
      */ typings.yargs.yargsStrings.Argv & TopLevel[Arguments[T]]
      ] = js.native
    def parseAsync(arg: js.Array[String], context: js.Object, parseCallback: ParseCallback[T]): js.Promise[
        /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in keyof yargs.yargs.Arguments<T> as key | yargs.yargs.CamelCaseKey<key> ]: yargs.yargs.Arguments<T>[key]}
      */ typings.yargs.yargsStrings.Argv & TopLevel[Arguments[T]]
      ] = js.native
    def parseAsync(arg: js.Array[String], context: Unit, parseCallback: ParseCallback[T]): js.Promise[
        /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in keyof yargs.yargs.Arguments<T> as key | yargs.yargs.CamelCaseKey<key> ]: yargs.yargs.Arguments<T>[key]}
      */ typings.yargs.yargsStrings.Argv & TopLevel[Arguments[T]]
      ] = js.native
    
    def parseSync(): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in keyof yargs.yargs.Arguments<T> as key | yargs.yargs.CamelCaseKey<key> ]: yargs.yargs.Arguments<T>[key]}
      */ typings.yargs.yargsStrings.Argv & TopLevel[Arguments[T]] = js.native
    def parseSync(arg: String): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in keyof yargs.yargs.Arguments<T> as key | yargs.yargs.CamelCaseKey<key> ]: yargs.yargs.Arguments<T>[key]}
      */ typings.yargs.yargsStrings.Argv & TopLevel[Arguments[T]] = js.native
    def parseSync(arg: String, context: js.Object): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in keyof yargs.yargs.Arguments<T> as key | yargs.yargs.CamelCaseKey<key> ]: yargs.yargs.Arguments<T>[key]}
      */ typings.yargs.yargsStrings.Argv & TopLevel[Arguments[T]] = js.native
    def parseSync(arg: String, context: js.Object, parseCallback: ParseCallback[T]): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in keyof yargs.yargs.Arguments<T> as key | yargs.yargs.CamelCaseKey<key> ]: yargs.yargs.Arguments<T>[key]}
      */ typings.yargs.yargsStrings.Argv & TopLevel[Arguments[T]] = js.native
    def parseSync(arg: String, context: Unit, parseCallback: ParseCallback[T]): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in keyof yargs.yargs.Arguments<T> as key | yargs.yargs.CamelCaseKey<key> ]: yargs.yargs.Arguments<T>[key]}
      */ typings.yargs.yargsStrings.Argv & TopLevel[Arguments[T]] = js.native
    def parseSync(arg: js.Array[String]): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in keyof yargs.yargs.Arguments<T> as key | yargs.yargs.CamelCaseKey<key> ]: yargs.yargs.Arguments<T>[key]}
      */ typings.yargs.yargsStrings.Argv & TopLevel[Arguments[T]] = js.native
    def parseSync(arg: js.Array[String], context: js.Object): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in keyof yargs.yargs.Arguments<T> as key | yargs.yargs.CamelCaseKey<key> ]: yargs.yargs.Arguments<T>[key]}
      */ typings.yargs.yargsStrings.Argv & TopLevel[Arguments[T]] = js.native
    def parseSync(arg: js.Array[String], context: js.Object, parseCallback: ParseCallback[T]): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in keyof yargs.yargs.Arguments<T> as key | yargs.yargs.CamelCaseKey<key> ]: yargs.yargs.Arguments<T>[key]}
      */ typings.yargs.yargsStrings.Argv & TopLevel[Arguments[T]] = js.native
    def parseSync(arg: js.Array[String], context: Unit, parseCallback: ParseCallback[T]): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in keyof yargs.yargs.Arguments<T> as key | yargs.yargs.CamelCaseKey<key> ]: yargs.yargs.Arguments<T>[key]}
      */ typings.yargs.yargsStrings.Argv & TopLevel[Arguments[T]] = js.native
    
    /**
      * If the arguments have not been parsed, this property is `false`.
      *
      * If the arguments have been parsed, this contain detailed parsed arguments.
      */
    var parsed: DetailedArguments | `false` = js.native
    
    /** Allows to configure advanced yargs features. */
    def parserConfiguration(configuration: PartialParserConfiguratio): Argv[T] = js.native
    
    /**
      * Similar to `config()`, indicates that yargs should interpret the object from the specified key in package.json as a configuration object.
      * @param [cwd] If provided, the package.json will be read from this location
      */
    def pkgConf(key: String): Argv[T] = js.native
    def pkgConf(key: String, cwd: String): Argv[T] = js.native
    def pkgConf(key: js.Array[String]): Argv[T] = js.native
    def pkgConf(key: js.Array[String], cwd: String): Argv[T] = js.native
    
    /**
      * Allows you to configure a command's positional arguments with an API similar to `.option()`.
      * `.positional()` should be called in a command's builder function, and is not available on the top-level yargs instance. If so, it will throw an error.
      */
    def positional[K /* <: /* keyof T */ String */, O /* <: PositionalOptions */](key: K, opt: O): Argv[(Omit[T, K]) & typings.yargs.yargsStrings.Argv & TopLevel[Any]] = js.native
    
    /** Should yargs provide suggestions regarding similar commands if no matching command is found? */
    def recommendCommands(): Argv[T] = js.native
    
    def require(key: String, msg: String): Argv[T] = js.native
    def require(key: String, required: Boolean): Argv[T] = js.native
    def require(keys: js.Array[Double], msg: String): Argv[T] = js.native
    def require(keys: js.Array[Double], required: Boolean): Argv[T] = js.native
    def require(positionals: Double, msg: String): Argv[T] = js.native
    def require(positionals: Double, required: Boolean): Argv[T] = js.native
    /**
      * @deprecated since version 6.6.0
      * Use '.demandCommand()' or '.demandOption()' instead
      */
    def require[K /* <: /* keyof T */ String */](key: K): Argv[Defined[T, K]] = js.native
    def require[K /* <: /* keyof T */ String */](key: K, msg: String): Argv[Defined[T, K]] = js.native
    def require[K /* <: /* keyof T */ String */](key: js.Array[K]): Argv[Defined[T, K]] = js.native
    @JSName("require")
    def require_K_String[K /* <: /* keyof T */ String */](key: js.Array[K], msg: String): Argv[Defined[T, K]] = js.native
    @JSName("require")
    def require_true[K /* <: /* keyof T */ String */](key: K, msg: `true`): Argv[Defined[T, K]] = js.native
    @JSName("require")
    def require_true[K /* <: /* keyof T */ String */](key: js.Array[K], msg: `true`): Argv[Defined[T, K]] = js.native
    
    def required(key: String, msg: String): Argv[T] = js.native
    def required(key: String, required: Boolean): Argv[T] = js.native
    def required(keys: js.Array[Double], msg: String): Argv[T] = js.native
    def required(keys: js.Array[Double], required: Boolean): Argv[T] = js.native
    def required(positionals: Double, msg: String): Argv[T] = js.native
    def required(positionals: Double, required: Boolean): Argv[T] = js.native
    /**
      * @deprecated since version 6.6.0
      * Use '.demandCommand()' or '.demandOption()' instead
      */
    def required[K /* <: /* keyof T */ String */](key: K): Argv[Defined[T, K]] = js.native
    def required[K /* <: /* keyof T */ String */](key: K, msg: String): Argv[Defined[T, K]] = js.native
    def required[K /* <: /* keyof T */ String */](key: js.Array[K]): Argv[Defined[T, K]] = js.native
    @JSName("required")
    def required_K_String[K /* <: /* keyof T */ String */](key: js.Array[K], msg: String): Argv[Defined[T, K]] = js.native
    @JSName("required")
    def required_true[K /* <: /* keyof T */ String */](key: K, msg: `true`): Argv[Defined[T, K]] = js.native
    @JSName("required")
    def required_true[K /* <: /* keyof T */ String */](key: js.Array[K], msg: `true`): Argv[Defined[T, K]] = js.native
    
    def requiresArg(key: String): Argv[T] = js.native
    def requiresArg(key: js.Array[String]): Argv[T] = js.native
    
    /** Set the name of your script ($0). Default is the base filename executed by node (`process.argv[1]`) */
    def scriptName($0: String): Argv[T] = js.native
    
    /**
      * Generate a bash completion script.
      * Users of your application can install this script in their `.bashrc`, and yargs will provide completion shortcuts for commands and options.
      */
    def showCompletionScript(): Argv[T] = js.native
    
    /**
      * Print the usage data using the console function consoleLevel for printing.
      * @param [consoleLevel='error']
      */
    def showHelp(): Argv[T] = js.native
    def showHelp(consoleLevel: String): Argv[T] = js.native
    /**
      * Provide the usage data as a string.
      * @param printCallback a function with a single argument.
      */
    def showHelp(printCallback: js.Function1[/* s */ String, Unit]): Argv[T] = js.native
    
    /**
      * By default, yargs outputs a usage string if any error is detected.
      * Use the `.showHelpOnFail()` method to customize this behavior.
      * @param enable If `false`, the usage string is not output.
      * @param [message] Message that is output after the error message.
      */
    def showHelpOnFail(enable: Boolean): Argv[T] = js.native
    def showHelpOnFail(enable: Boolean, message: String): Argv[T] = js.native
    
    /**
      * Configure the `--show-hidden` option that displays the hidden keys (see `hide()`).
      * @param option If `boolean`, it enables/disables this option altogether. i.e. hidden keys will be permanently hidden if first argument is `false`.
      * If `string` it changes the key name ("--show-hidden").
      * @param description Changes the default description ("Show hidden options")
      */
    def showHidden(): Argv[T] = js.native
    def showHidden(option: String): Argv[T] = js.native
    def showHidden(option: String, description: String): Argv[T] = js.native
    def showHidden(option: Boolean): Argv[T] = js.native
    
    /**
      * Print the version data using the console function consoleLevel or the specified function.
      * @param [level='error']
      */
    def showVersion(): Argv[T] = js.native
    def showVersion(level: error | log): Argv[T] = js.native
    def showVersion(level: js.Function1[/* message */ String, Unit]): Argv[T] = js.native
    
    /** Specifies either a single option key (string), or an array of options. If any of the options is present, yargs validation is skipped. */
    def skipValidation(key: String): Argv[T] = js.native
    def skipValidation(key: js.Array[String]): Argv[T] = js.native
    
    /**
      * Any command-line argument given that is not demanded, or does not have a corresponding description, will be reported as an error.
      *
      * Unrecognized commands will also be reported as errors.
      */
    def strict(): Argv[T] = js.native
    def strict(enabled: Boolean): Argv[T] = js.native
    
    /**
      * Similar to .strict(), except that it only applies to unrecognized commands.
      * A user can still provide arbitrary options, but unknown positional commands
      * will raise an error.
      */
    def strictCommands(): Argv[T] = js.native
    def strictCommands(enabled: Boolean): Argv[T] = js.native
    
    /**
      * Similar to `.strict()`, except that it only applies to unrecognized options. A
      * user can still provide arbitrary positional options, but unknown options
      * will raise an error.
      */
    def strictOptions(): Argv[T] = js.native
    def strictOptions(enabled: Boolean): Argv[T] = js.native
    
    /**
      * Tell the parser logic not to interpret `key` as a number or boolean. This can be useful if you need to preserve leading zeros in an input.
      *
      * If `key` is an array, interpret all the elements as strings.
      *
      * `.string('_')` will result in non-hyphenated arguments being interpreted as strings, regardless of whether they resemble numbers.
      */
    def string[K /* <: /* keyof T */ String */](key: K): Argv[(Omit[T, K]) & typings.yargs.yargsStrings.Argv & TopLevel[T]] = js.native
    def string[K /* <: /* keyof T */ String */](key: js.Array[K]): Argv[(Omit[T, K]) & typings.yargs.yargsStrings.Argv & TopLevel[T]] = js.native
    
    // Intended to be used with '.wrap()'
    def terminalWidth(): Double = js.native
    
    def updateLocale(obj: StringDictionary[String]): Argv[T] = js.native
    
    /**
      * Override the default strings used by yargs with the key/value pairs provided in obj
      *
      * If you explicitly specify a locale(), you should do so before calling `updateStrings()`.
      */
    def updateStrings(obj: StringDictionary[String]): Argv[T] = js.native
    
    /**
      * Set a usage message to show which commands to use.
      * Inside `message`, the string `$0` will get interpolated to the current script name or node command for the present script similar to how `$0` works in bash or perl.
      *
      * If the optional `description`/`builder`/`handler` are provided, `.usage()` acts an an alias for `.command()`.
      * This allows you to use `.usage()` to configure the default command that will be run as an entry-point to your application
      * and allows you to provide configuration for the positional arguments accepted by your program:
      */
    def usage(message: String): Argv[T] = js.native
    def usage[O /* <: StringDictionary[Options] */](command: String, description: String): Argv[T] = js.native
    def usage[O /* <: StringDictionary[Options] */](command: String, description: String, builder: O): Argv[T] = js.native
    def usage[O /* <: StringDictionary[Options] */](
      command: String,
      description: String,
      builder: O,
      handler: js.Function1[/* args */ ArgumentsCamelCase[InferredOptionTypes[O]], Unit | js.Promise[Unit]]
    ): Argv[T] = js.native
    def usage[U](command: String, description: String, builder: js.Function1[/* args */ Argv[T], Argv[U]]): Argv[T] = js.native
    def usage[U](
      command: String,
      description: String,
      builder: js.Function1[/* args */ Argv[T], Argv[U]],
      handler: js.Function1[/* args */ ArgumentsCamelCase[U], Unit | js.Promise[Unit]]
    ): Argv[T] = js.native
    def usage[O /* <: StringDictionary[Options] */](
      command: String,
      description: String,
      builder: Unit,
      handler: js.Function1[/* args */ ArgumentsCamelCase[InferredOptionTypes[O]], Unit | js.Promise[Unit]]
    ): Argv[T] = js.native
    def usage[O /* <: StringDictionary[Options] */](command: String, showInHelp: Boolean): Argv[T] = js.native
    def usage[O /* <: StringDictionary[Options] */](command: String, showInHelp: Boolean, builder: O): Argv[T] = js.native
    def usage[O /* <: StringDictionary[Options] */](
      command: String,
      showInHelp: Boolean,
      builder: O,
      handler: js.Function1[/* args */ ArgumentsCamelCase[InferredOptionTypes[O]], Unit | js.Promise[Unit]]
    ): Argv[T] = js.native
    def usage[U](command: String, showInHelp: Boolean, builder: js.Function1[/* args */ Argv[T], Argv[U]]): Argv[T] = js.native
    def usage[U](
      command: String,
      showInHelp: Boolean,
      builder: js.Function1[/* args */ Argv[T], Argv[U]],
      handler: js.Function1[/* args */ ArgumentsCamelCase[U], Unit | js.Promise[Unit]]
    ): Argv[T] = js.native
    def usage[O /* <: StringDictionary[Options] */](
      command: String,
      showInHelp: Boolean,
      builder: Unit,
      handler: js.Function1[/* args */ ArgumentsCamelCase[InferredOptionTypes[O]], Unit | js.Promise[Unit]]
    ): Argv[T] = js.native
    def usage[O /* <: StringDictionary[Options] */](command: js.Array[String], description: String): Argv[T] = js.native
    def usage[O /* <: StringDictionary[Options] */](command: js.Array[String], description: String, builder: O): Argv[T] = js.native
    def usage[O /* <: StringDictionary[Options] */](
      command: js.Array[String],
      description: String,
      builder: O,
      handler: js.Function1[/* args */ ArgumentsCamelCase[InferredOptionTypes[O]], Unit | js.Promise[Unit]]
    ): Argv[T] = js.native
    def usage[U](command: js.Array[String], description: String, builder: js.Function1[/* args */ Argv[T], Argv[U]]): Argv[T] = js.native
    def usage[U](
      command: js.Array[String],
      description: String,
      builder: js.Function1[/* args */ Argv[T], Argv[U]],
      handler: js.Function1[/* args */ ArgumentsCamelCase[U], Unit | js.Promise[Unit]]
    ): Argv[T] = js.native
    def usage[O /* <: StringDictionary[Options] */](
      command: js.Array[String],
      description: String,
      builder: Unit,
      handler: js.Function1[/* args */ ArgumentsCamelCase[InferredOptionTypes[O]], Unit | js.Promise[Unit]]
    ): Argv[T] = js.native
    def usage[O /* <: StringDictionary[Options] */](command: js.Array[String], showInHelp: Boolean): Argv[T] = js.native
    def usage[O /* <: StringDictionary[Options] */](command: js.Array[String], showInHelp: Boolean, builder: O): Argv[T] = js.native
    def usage[O /* <: StringDictionary[Options] */](
      command: js.Array[String],
      showInHelp: Boolean,
      builder: O,
      handler: js.Function1[/* args */ ArgumentsCamelCase[InferredOptionTypes[O]], Unit | js.Promise[Unit]]
    ): Argv[T] = js.native
    def usage[U](command: js.Array[String], showInHelp: Boolean, builder: js.Function1[/* args */ Argv[T], Argv[U]]): Argv[T] = js.native
    def usage[U](
      command: js.Array[String],
      showInHelp: Boolean,
      builder: js.Function1[/* args */ Argv[T], Argv[U]],
      handler: js.Function1[/* args */ ArgumentsCamelCase[U], Unit | js.Promise[Unit]]
    ): Argv[T] = js.native
    def usage[O /* <: StringDictionary[Options] */](
      command: js.Array[String],
      showInHelp: Boolean,
      builder: Unit,
      handler: js.Function1[/* args */ ArgumentsCamelCase[InferredOptionTypes[O]], Unit | js.Promise[Unit]]
    ): Argv[T] = js.native
    @JSName("usage")
    def usage_U[U](command: String, description: String): Argv[T] = js.native
    @JSName("usage")
    def usage_U[U](
      command: String,
      description: String,
      builder: Unit,
      handler: js.Function1[/* args */ ArgumentsCamelCase[U], Unit | js.Promise[Unit]]
    ): Argv[T] = js.native
    @JSName("usage")
    def usage_U[U](command: String, showInHelp: Boolean): Argv[T] = js.native
    @JSName("usage")
    def usage_U[U](
      command: String,
      showInHelp: Boolean,
      builder: Unit,
      handler: js.Function1[/* args */ ArgumentsCamelCase[U], Unit | js.Promise[Unit]]
    ): Argv[T] = js.native
    @JSName("usage")
    def usage_U[U](command: js.Array[String], description: String): Argv[T] = js.native
    @JSName("usage")
    def usage_U[U](
      command: js.Array[String],
      description: String,
      builder: Unit,
      handler: js.Function1[/* args */ ArgumentsCamelCase[U], Unit | js.Promise[Unit]]
    ): Argv[T] = js.native
    @JSName("usage")
    def usage_U[U](command: js.Array[String], showInHelp: Boolean): Argv[T] = js.native
    @JSName("usage")
    def usage_U[U](
      command: js.Array[String],
      showInHelp: Boolean,
      builder: Unit,
      handler: js.Function1[/* args */ ArgumentsCamelCase[U], Unit | js.Promise[Unit]]
    ): Argv[T] = js.native
    
    /**
      * Add an option (e.g. `--version`) that displays the version number (given by the version parameter) and exits the process.
      * By default yargs enables version for the `--version` option.
      *
      * If no arguments are passed to version (`.version()`), yargs will parse the package.json of your module and use its version value.
      *
      * If the boolean argument `false` is provided, it will disable `--version`.
      */
    def version(): Argv[T] = js.native
    def version(enable: Boolean): Argv[T] = js.native
    def version(optionKey: String, description: String, version: String): Argv[T] = js.native
    def version(optionKey: String, version: String): Argv[T] = js.native
    def version(version: String): Argv[T] = js.native
    
    /**
      * Format usage output to wrap at columns many columns.
      *
      * By default wrap will be set to `Math.min(80, windowWidth)`. Use `.wrap(null)` to specify no column limit (no right-align).
      * Use `.wrap(yargs.terminalWidth())` to maximize the width of yargs' usage instructions.
      */
    def wrap(): Argv[T] = js.native
    def wrap(columns: Double): Argv[T] = js.native
  }
  
  type AsyncCompletionFunction = js.Function3[
    /* current */ String, 
    /* argv */ Any, 
    /* done */ js.Function1[/* completion */ js.Array[String], Unit], 
    Unit
  ]
  
  type BuilderCallback[T, R] = js.Function1[/* args */ Argv[T], Argv[R] | js.Thenable[Argv[R]] | Unit]
  
  /** Convert literal string types like 'foo-bar' to 'fooBar' */
  type CamelCase[S /* <: String */] = S | DollarLeftcurlybracketTRightcurlybracketDollarLeftcurlybracketPascalCaseLessthansignUGreaterthansignRightcurlybracket | String
  
  /** Convert literal string types like 'foo-bar' to 'fooBar', allowing all `PropertyKey` types */
  type CamelCaseKey[K /* <: PropertyKey */] = K | (Exclude[CamelCase[K], _empty])
  
  type Choices = js.Array[js.UndefOr[String | Double | `true`]]
  
  type CommandBuilder[T, U] = StringDictionary[Options] | (js.Function1[/* args */ Argv[T], Argv[U] | js.Thenable[Argv[U]]])
  
  trait CommandModule[T, U] extends StObject {
    
    /** array of strings (or a single string) representing aliases of `exports.command`, positional args defined in an alias are ignored */
    var aliases: js.UndefOr[js.Array[String] | String] = js.undefined
    
    /** object declaring the options the command accepts, or a function accepting and returning a yargs instance */
    var builder: js.UndefOr[CommandBuilder[T, U]] = js.undefined
    
    /** string (or array of strings) that executes this command when given on the command line, first string may contain positional args */
    var command: js.UndefOr[js.Array[String] | String] = js.undefined
    
    /** boolean (or string) to show deprecation notice */
    var deprecated: js.UndefOr[Boolean | String] = js.undefined
    
    /** string used as the description for the command in help text, use `false` for a hidden command */
    var describe: js.UndefOr[String | `false`] = js.undefined
    
    /** a function which will be passed the parsed argv. */
    def handler(args: ArgumentsCamelCase[U]): Unit | js.Promise[Unit]
  }
  object CommandModule {
    
    inline def apply[T, U](handler: ArgumentsCamelCase[U] => Unit | js.Promise[Unit]): CommandModule[T, U] = {
      val __obj = js.Dynamic.literal(handler = js.Any.fromFunction1(handler))
      __obj.asInstanceOf[CommandModule[T, U]]
    }
    
    extension [Self <: CommandModule[?, ?], T, U](x: Self & (CommandModule[T, U])) {
      
      inline def setAliases(value: js.Array[String] | String): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
      
      inline def setAliasesUndefined: Self = StObject.set(x, "aliases", js.undefined)
      
      inline def setAliasesVarargs(value: String*): Self = StObject.set(x, "aliases", js.Array(value*))
      
      inline def setBuilder(value: CommandBuilder[T, U]): Self = StObject.set(x, "builder", value.asInstanceOf[js.Any])
      
      inline def setBuilderFunction1(value: /* args */ Argv[T] => Argv[U] | js.Thenable[Argv[U]]): Self = StObject.set(x, "builder", js.Any.fromFunction1(value))
      
      inline def setBuilderUndefined: Self = StObject.set(x, "builder", js.undefined)
      
      inline def setCommand(value: js.Array[String] | String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      inline def setCommandUndefined: Self = StObject.set(x, "command", js.undefined)
      
      inline def setCommandVarargs(value: String*): Self = StObject.set(x, "command", js.Array(value*))
      
      inline def setDeprecated(value: Boolean | String): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
      
      inline def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
      
      inline def setDescribe(value: String | `false`): Self = StObject.set(x, "describe", value.asInstanceOf[js.Any])
      
      inline def setDescribeUndefined: Self = StObject.set(x, "describe", js.undefined)
      
      inline def setHandler(value: ArgumentsCamelCase[U] => Unit | js.Promise[Unit]): Self = StObject.set(x, "handler", js.Any.fromFunction1(value))
    }
  }
  
  /** Remove undefined as a possible value for keys K in T */
  type Defined[T, K /* <: /* keyof T */ String */] = (Omit[T, K]) & typings.yargs.yargsStrings.Defined & TopLevel[T]
  
  // prettier-ignore
  type InferredOptionType[O /* <: Options | PositionalOptions */] = InferredOptionTypeInner[O] | (Exclude[InferredOptionTypeInner[O], Unit])
  
  // prettier-ignore
  type InferredOptionTypeInner[O /* <: Options | PositionalOptions */] = js.UndefOr[RequiredOptionType[O] | Double]
  
  type InferredOptionTypes[O /* <: StringDictionary[Options] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in keyof O ]: yargs.yargs.InferredOptionType<O[key]>}
    */ typings.yargs.yargsStrings.InferredOptionTypes & TopLevel[O]
  
  type MiddlewareFunction[T] = js.Function1[/* args */ Arguments[T], Unit | js.Promise[Unit]]
  
  /** Remove keys K in T */
  type Omit[T, K] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in std.Exclude<keyof T, K> ]: T[key]}
    */ typings.yargs.yargsStrings.Omit & TopLevel[T]
  
  trait Options extends StObject {
    
    /** value, set a default value for the option, see `default()` */
    var default: js.UndefOr[Any] = js.undefined
    
    /** string or array of strings, alias(es) for the canonical option key, see `alias()` */
    var alias: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /** boolean, interpret option as an array, see `array()` */
    var array: js.UndefOr[Boolean] = js.undefined
    
    /**  boolean, interpret option as a boolean flag, see `boolean()` */
    var boolean: js.UndefOr[Boolean] = js.undefined
    
    /** value or array of values, limit valid option arguments to a predefined set, see `choices()` */
    var choices: js.UndefOr[Choices] = js.undefined
    
    /** function, coerce or transform parsed command line values into another value, see `coerce()` */
    var coerce: js.UndefOr[js.Function1[/* arg */ Any, Any]] = js.undefined
    
    /** boolean, interpret option as a path to a JSON config file, see `config()` */
    var config: js.UndefOr[Boolean] = js.undefined
    
    /** function, provide a custom config parsing function, see `config()` */
    var configParser: js.UndefOr[js.Function1[/* configPath */ String, js.Object]] = js.undefined
    
    /** string or object, require certain keys not to be set, see `conflicts()` */
    var conflicts: js.UndefOr[String | js.Array[String] | (StringDictionary[String | js.Array[String]])] = js.undefined
    
    /** boolean, interpret option as a count of boolean flags, see `count()` */
    var count: js.UndefOr[Boolean] = js.undefined
    
    /** string, use this description for the default value in help content, see `default()` */
    var defaultDescription: js.UndefOr[String] = js.undefined
    
    /**
      *  @deprecated since version 6.6.0
      *  Use 'demandOption' instead
      */
    var demand: js.UndefOr[Boolean | String] = js.undefined
    
    /** boolean or string, demand the option be given, with optional error message, see `demandOption()` */
    var demandOption: js.UndefOr[Boolean | String] = js.undefined
    
    /** boolean or string, mark the argument as deprecated, see `deprecateOption()` */
    var deprecate: js.UndefOr[Boolean | String] = js.undefined
    
    /** boolean or string, mark the argument as deprecated, see `deprecateOption()` */
    var deprecated: js.UndefOr[Boolean | String] = js.undefined
    
    /** string, the option description for help content, see `describe()` */
    var desc: js.UndefOr[String] = js.undefined
    
    /** string, the option description for help content, see `describe()` */
    var describe: js.UndefOr[String] = js.undefined
    
    /** string, the option description for help content, see `describe()` */
    var description: js.UndefOr[String] = js.undefined
    
    /** boolean, indicate that this key should not be reset when a command is invoked, see `global()` */
    var global: js.UndefOr[Boolean] = js.undefined
    
    /** string, when displaying usage instructions place the option under an alternative group heading, see `group()` */
    var group: js.UndefOr[String] = js.undefined
    
    /** don't display option in help output. */
    var hidden: js.UndefOr[Boolean] = js.undefined
    
    /**  string or object, require certain keys to be set, see `implies()` */
    var implies: js.UndefOr[String | js.Array[String] | (StringDictionary[String | js.Array[String]])] = js.undefined
    
    /** number, specify how many arguments should be consumed for the option, see `nargs()` */
    var nargs: js.UndefOr[Double] = js.undefined
    
    /** boolean, apply path.normalize() to the option, see `normalize()` */
    var normalize: js.UndefOr[Boolean] = js.undefined
    
    /** boolean, interpret option as a number, `number()` */
    var number: js.UndefOr[Boolean] = js.undefined
    
    /**
      *  @deprecated since version 6.6.0
      *  Use 'demandOption' instead
      */
    var require: js.UndefOr[Boolean | String] = js.undefined
    
    /**
      *  @deprecated since version 6.6.0
      *  Use 'demandOption' instead
      */
    var required: js.UndefOr[Boolean | String] = js.undefined
    
    /** boolean, require the option be specified with a value, see `requiresArg()` */
    var requiresArg: js.UndefOr[Boolean] = js.undefined
    
    /** boolean, skips validation if the option is present, see `skipValidation()` */
    var skipValidation: js.UndefOr[Boolean] = js.undefined
    
    /** boolean, interpret option as a string, see `string()` */
    var string: js.UndefOr[Boolean] = js.undefined
    
    var `type`: js.UndefOr[array | count | PositionalOptionsType] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAlias(value: String | js.Array[String]): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
      
      inline def setAliasVarargs(value: String*): Self = StObject.set(x, "alias", js.Array(value*))
      
      inline def setArray(value: Boolean): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
      
      inline def setArrayUndefined: Self = StObject.set(x, "array", js.undefined)
      
      inline def setBoolean(value: Boolean): Self = StObject.set(x, "boolean", value.asInstanceOf[js.Any])
      
      inline def setBooleanUndefined: Self = StObject.set(x, "boolean", js.undefined)
      
      inline def setChoices(value: Choices): Self = StObject.set(x, "choices", value.asInstanceOf[js.Any])
      
      inline def setChoicesUndefined: Self = StObject.set(x, "choices", js.undefined)
      
      inline def setChoicesVarargs(value: (js.UndefOr[String | Double | `true`])*): Self = StObject.set(x, "choices", js.Array(value*))
      
      inline def setCoerce(value: /* arg */ Any => Any): Self = StObject.set(x, "coerce", js.Any.fromFunction1(value))
      
      inline def setCoerceUndefined: Self = StObject.set(x, "coerce", js.undefined)
      
      inline def setConfig(value: Boolean): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigParser(value: /* configPath */ String => js.Object): Self = StObject.set(x, "configParser", js.Any.fromFunction1(value))
      
      inline def setConfigParserUndefined: Self = StObject.set(x, "configParser", js.undefined)
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setConflicts(value: String | js.Array[String] | (StringDictionary[String | js.Array[String]])): Self = StObject.set(x, "conflicts", value.asInstanceOf[js.Any])
      
      inline def setConflictsUndefined: Self = StObject.set(x, "conflicts", js.undefined)
      
      inline def setConflictsVarargs(value: String*): Self = StObject.set(x, "conflicts", js.Array(value*))
      
      inline def setCount(value: Boolean): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      inline def setDefault(value: Any): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultDescription(value: String): Self = StObject.set(x, "defaultDescription", value.asInstanceOf[js.Any])
      
      inline def setDefaultDescriptionUndefined: Self = StObject.set(x, "defaultDescription", js.undefined)
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setDemand(value: Boolean | String): Self = StObject.set(x, "demand", value.asInstanceOf[js.Any])
      
      inline def setDemandOption(value: Boolean | String): Self = StObject.set(x, "demandOption", value.asInstanceOf[js.Any])
      
      inline def setDemandOptionUndefined: Self = StObject.set(x, "demandOption", js.undefined)
      
      inline def setDemandUndefined: Self = StObject.set(x, "demand", js.undefined)
      
      inline def setDeprecate(value: Boolean | String): Self = StObject.set(x, "deprecate", value.asInstanceOf[js.Any])
      
      inline def setDeprecateUndefined: Self = StObject.set(x, "deprecate", js.undefined)
      
      inline def setDeprecated(value: Boolean | String): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
      
      inline def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
      
      inline def setDesc(value: String): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
      
      inline def setDescUndefined: Self = StObject.set(x, "desc", js.undefined)
      
      inline def setDescribe(value: String): Self = StObject.set(x, "describe", value.asInstanceOf[js.Any])
      
      inline def setDescribeUndefined: Self = StObject.set(x, "describe", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setGlobal(value: Boolean): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
      
      inline def setGlobalUndefined: Self = StObject.set(x, "global", js.undefined)
      
      inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      inline def setImplies(value: String | js.Array[String] | (StringDictionary[String | js.Array[String]])): Self = StObject.set(x, "implies", value.asInstanceOf[js.Any])
      
      inline def setImpliesUndefined: Self = StObject.set(x, "implies", js.undefined)
      
      inline def setImpliesVarargs(value: String*): Self = StObject.set(x, "implies", js.Array(value*))
      
      inline def setNargs(value: Double): Self = StObject.set(x, "nargs", value.asInstanceOf[js.Any])
      
      inline def setNargsUndefined: Self = StObject.set(x, "nargs", js.undefined)
      
      inline def setNormalize(value: Boolean): Self = StObject.set(x, "normalize", value.asInstanceOf[js.Any])
      
      inline def setNormalizeUndefined: Self = StObject.set(x, "normalize", js.undefined)
      
      inline def setNumber(value: Boolean): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
      
      inline def setRequire(value: Boolean | String): Self = StObject.set(x, "require", value.asInstanceOf[js.Any])
      
      inline def setRequireUndefined: Self = StObject.set(x, "require", js.undefined)
      
      inline def setRequired(value: Boolean | String): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setRequiresArg(value: Boolean): Self = StObject.set(x, "requiresArg", value.asInstanceOf[js.Any])
      
      inline def setRequiresArgUndefined: Self = StObject.set(x, "requiresArg", js.undefined)
      
      inline def setSkipValidation(value: Boolean): Self = StObject.set(x, "skipValidation", value.asInstanceOf[js.Any])
      
      inline def setSkipValidationUndefined: Self = StObject.set(x, "skipValidation", js.undefined)
      
      inline def setString(value: Boolean): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
      
      inline def setStringUndefined: Self = StObject.set(x, "string", js.undefined)
      
      inline def setType(value: array | count | PositionalOptionsType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  type ParseCallback[T] = js.Function3[
    /* err */ js.UndefOr[js.Error], 
    /* argv */ ArgumentsCamelCase[T], 
    /* output */ String, 
    Unit | js.Promise[Unit]
  ]
  
  trait ParserConfigurationOptions
    extends StObject
       with Configuration {
    
    /** Sort commands alphabetically. Default is `false` */
    var `sort-commands`: Boolean
  }
  object ParserConfigurationOptions {
    
    inline def apply(
      `boolean-negation`: Boolean,
      `camel-case-expansion`: Boolean,
      `combine-arrays`: Boolean,
      `dot-notation`: Boolean,
      `duplicate-arguments-array`: Boolean,
      `flatten-duplicate-arrays`: Boolean,
      `greedy-arrays`: Boolean,
      `halt-at-non-option`: Boolean,
      `nargs-eats-options`: Boolean,
      `negation-prefix`: String,
      `parse-numbers`: Boolean,
      `parse-positional-numbers`: Boolean,
      `populate--`: Boolean,
      `set-placeholder-key`: Boolean,
      `short-option-groups`: Boolean,
      `sort-commands`: Boolean,
      `strip-aliased`: Boolean,
      `strip-dashed`: Boolean,
      `unknown-options-as-args`: Boolean
    ): ParserConfigurationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("boolean-negation")(`boolean-negation`.asInstanceOf[js.Any])
      __obj.updateDynamic("camel-case-expansion")(`camel-case-expansion`.asInstanceOf[js.Any])
      __obj.updateDynamic("combine-arrays")(`combine-arrays`.asInstanceOf[js.Any])
      __obj.updateDynamic("dot-notation")(`dot-notation`.asInstanceOf[js.Any])
      __obj.updateDynamic("duplicate-arguments-array")(`duplicate-arguments-array`.asInstanceOf[js.Any])
      __obj.updateDynamic("flatten-duplicate-arrays")(`flatten-duplicate-arrays`.asInstanceOf[js.Any])
      __obj.updateDynamic("greedy-arrays")(`greedy-arrays`.asInstanceOf[js.Any])
      __obj.updateDynamic("halt-at-non-option")(`halt-at-non-option`.asInstanceOf[js.Any])
      __obj.updateDynamic("nargs-eats-options")(`nargs-eats-options`.asInstanceOf[js.Any])
      __obj.updateDynamic("negation-prefix")(`negation-prefix`.asInstanceOf[js.Any])
      __obj.updateDynamic("parse-numbers")(`parse-numbers`.asInstanceOf[js.Any])
      __obj.updateDynamic("parse-positional-numbers")(`parse-positional-numbers`.asInstanceOf[js.Any])
      __obj.updateDynamic("populate--")(`populate--`.asInstanceOf[js.Any])
      __obj.updateDynamic("set-placeholder-key")(`set-placeholder-key`.asInstanceOf[js.Any])
      __obj.updateDynamic("short-option-groups")(`short-option-groups`.asInstanceOf[js.Any])
      __obj.updateDynamic("sort-commands")(`sort-commands`.asInstanceOf[js.Any])
      __obj.updateDynamic("strip-aliased")(`strip-aliased`.asInstanceOf[js.Any])
      __obj.updateDynamic("strip-dashed")(`strip-dashed`.asInstanceOf[js.Any])
      __obj.updateDynamic("unknown-options-as-args")(`unknown-options-as-args`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParserConfigurationOptions]
    }
    
    extension [Self <: ParserConfigurationOptions](x: Self) {
      
      inline def `setSort-commands`(value: Boolean): Self = StObject.set(x, "sort-commands", value.asInstanceOf[js.Any])
    }
  }
  
  // not implemented: yargs camelizes '_', but only if there's a '-' in the arg name
  // not implemented: yargs decamelizes (converts fooBar to foo-bar)
  /** Convert literal string types like 'foo-bar' to 'FooBar' */
  type PascalCase[S /* <: String */] = Capitalize[S] | DollarLeftcurlybracketCapitalizeLessthansignTGreaterthansignRightcurlybracketDollarLeftcurlybracketPascalCaseLessthansignUGreaterthansignRightcurlybracket | String
  
  trait PositionalOptions extends StObject {
    
    /** value, set a default value for the option, see `default()` */
    var default: js.UndefOr[Any] = js.undefined
    
    /** string or array of strings, see `alias()` */
    var alias: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /** boolean, interpret option as an array, see `array()` */
    var array: js.UndefOr[Boolean] = js.undefined
    
    /** value or array of values, limit valid option arguments to a predefined set, see `choices()` */
    var choices: js.UndefOr[Choices] = js.undefined
    
    /** function, coerce or transform parsed command line values into another value, see `coerce()` */
    var coerce: js.UndefOr[js.Function1[/* arg */ Any, Any]] = js.undefined
    
    /** string or object, require certain keys not to be set, see `conflicts()` */
    var conflicts: js.UndefOr[String | js.Array[String] | (StringDictionary[String | js.Array[String]])] = js.undefined
    
    /** boolean or string, demand the option be given, with optional error message, see `demandOption()` */
    var demandOption: js.UndefOr[Boolean | String] = js.undefined
    
    /** string, the option description for help content, see `describe()` */
    var desc: js.UndefOr[String] = js.undefined
    
    /** string, the option description for help content, see `describe()` */
    var describe: js.UndefOr[String] = js.undefined
    
    /** string, the option description for help content, see `describe()` */
    var description: js.UndefOr[String] = js.undefined
    
    /** string or object, require certain keys to be set, see `implies()` */
    var implies: js.UndefOr[String | js.Array[String] | (StringDictionary[String | js.Array[String]])] = js.undefined
    
    /** boolean, apply path.normalize() to the option, see normalize() */
    var normalize: js.UndefOr[Boolean] = js.undefined
    
    var `type`: js.UndefOr[PositionalOptionsType] = js.undefined
  }
  object PositionalOptions {
    
    inline def apply(): PositionalOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PositionalOptions]
    }
    
    extension [Self <: PositionalOptions](x: Self) {
      
      inline def setAlias(value: String | js.Array[String]): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
      
      inline def setAliasVarargs(value: String*): Self = StObject.set(x, "alias", js.Array(value*))
      
      inline def setArray(value: Boolean): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
      
      inline def setArrayUndefined: Self = StObject.set(x, "array", js.undefined)
      
      inline def setChoices(value: Choices): Self = StObject.set(x, "choices", value.asInstanceOf[js.Any])
      
      inline def setChoicesUndefined: Self = StObject.set(x, "choices", js.undefined)
      
      inline def setChoicesVarargs(value: (js.UndefOr[String | Double | `true`])*): Self = StObject.set(x, "choices", js.Array(value*))
      
      inline def setCoerce(value: /* arg */ Any => Any): Self = StObject.set(x, "coerce", js.Any.fromFunction1(value))
      
      inline def setCoerceUndefined: Self = StObject.set(x, "coerce", js.undefined)
      
      inline def setConflicts(value: String | js.Array[String] | (StringDictionary[String | js.Array[String]])): Self = StObject.set(x, "conflicts", value.asInstanceOf[js.Any])
      
      inline def setConflictsUndefined: Self = StObject.set(x, "conflicts", js.undefined)
      
      inline def setConflictsVarargs(value: String*): Self = StObject.set(x, "conflicts", js.Array(value*))
      
      inline def setDefault(value: Any): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setDemandOption(value: Boolean | String): Self = StObject.set(x, "demandOption", value.asInstanceOf[js.Any])
      
      inline def setDemandOptionUndefined: Self = StObject.set(x, "demandOption", js.undefined)
      
      inline def setDesc(value: String): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
      
      inline def setDescUndefined: Self = StObject.set(x, "desc", js.undefined)
      
      inline def setDescribe(value: String): Self = StObject.set(x, "describe", value.asInstanceOf[js.Any])
      
      inline def setDescribeUndefined: Self = StObject.set(x, "describe", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setImplies(value: String | js.Array[String] | (StringDictionary[String | js.Array[String]])): Self = StObject.set(x, "implies", value.asInstanceOf[js.Any])
      
      inline def setImpliesUndefined: Self = StObject.set(x, "implies", js.undefined)
      
      inline def setImpliesVarargs(value: String*): Self = StObject.set(x, "implies", js.Array(value*))
      
      inline def setNormalize(value: Boolean): Self = StObject.set(x, "normalize", value.asInstanceOf[js.Any])
      
      inline def setNormalizeUndefined: Self = StObject.set(x, "normalize", js.undefined)
      
      inline def setType(value: PositionalOptionsType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.yargs.yargsStrings.boolean
    - typings.yargs.yargsStrings.number
    - typings.yargs.yargsStrings.string
  */
  trait PositionalOptionsType extends StObject
  object PositionalOptionsType {
    
    inline def boolean: typings.yargs.yargsStrings.boolean = "boolean".asInstanceOf[typings.yargs.yargsStrings.boolean]
    
    inline def number: typings.yargs.yargsStrings.number = "number".asInstanceOf[typings.yargs.yargsStrings.number]
    
    inline def string: typings.yargs.yargsStrings.string = "string".asInstanceOf[typings.yargs.yargsStrings.string]
  }
  
  type PromiseCompletionFunction = js.Function2[/* current */ String, /* argv */ Any, js.Promise[js.Array[String]]]
  
  trait RequireDirectoryOptions extends StObject {
    
    /** Blacklist certain modules. */
    var exclude: js.UndefOr[js.RegExp | (js.Function1[/* pathToFile */ String, Boolean])] = js.undefined
    
    /** The types of files to look for when requiring command modules. */
    var extensions: js.UndefOr[js.Array[String]] = js.undefined
    
    /** Whitelist certain modules */
    var include: js.UndefOr[js.RegExp | (js.Function1[/* pathToFile */ String, Boolean])] = js.undefined
    
    /** Look for command modules in all subdirectories and apply them as a flattened (non-hierarchical) list. */
    var recurse: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A synchronous function called for each command module encountered.
      * Accepts `commandObject`, `pathToFile`, and `filename` as arguments.
      * Returns `commandObject` to include the command; any falsy value to exclude/skip it.
      */
    var visit: js.UndefOr[
        js.Function3[
          /* commandObject */ Any, 
          /* pathToFile */ js.UndefOr[String], 
          /* filename */ js.UndefOr[String], 
          Any
        ]
      ] = js.undefined
  }
  object RequireDirectoryOptions {
    
    inline def apply(): RequireDirectoryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequireDirectoryOptions]
    }
    
    extension [Self <: RequireDirectoryOptions](x: Self) {
      
      inline def setExclude(value: js.RegExp | (js.Function1[/* pathToFile */ String, Boolean])): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeFunction1(value: /* pathToFile */ String => Boolean): Self = StObject.set(x, "exclude", js.Any.fromFunction1(value))
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      inline def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value*))
      
      inline def setInclude(value: js.RegExp | (js.Function1[/* pathToFile */ String, Boolean])): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setIncludeFunction1(value: /* pathToFile */ String => Boolean): Self = StObject.set(x, "include", js.Any.fromFunction1(value))
      
      inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      inline def setRecurse(value: Boolean): Self = StObject.set(x, "recurse", value.asInstanceOf[js.Any])
      
      inline def setRecurseUndefined: Self = StObject.set(x, "recurse", js.undefined)
      
      inline def setVisit(
        value: (/* commandObject */ Any, /* pathToFile */ js.UndefOr[String], /* filename */ js.UndefOr[String]) => Any
      ): Self = StObject.set(x, "visit", js.Any.fromFunction3(value))
      
      inline def setVisitUndefined: Self = StObject.set(x, "visit", js.undefined)
    }
  }
  
  // prettier-ignore
  type RequiredOptionType[O /* <: Options | PositionalOptions */] = Any | String | Double | Boolean | (js.Array[Double | String])
  
  type SyncCompletionFunction = js.Function2[/* current */ String, /* argv */ Any, js.Array[String]]
  
  /** Convert T to T[] and T | undefined to T[] | undefined */
  type ToArray[T] = (js.Array[Exclude[T, Unit]]) | (Extract[T, Unit])
  
  /** Gives number[] if T is an array type, otherwise number. Preserves | undefined. */
  type ToNumber[T] = Double | js.Array[Double] | (Extract[T, Unit])
  
  /** Gives string[] if T is an array type, otherwise string. Preserves | undefined. */
  type ToString[T] = String | js.Array[String] | (Extract[T, Unit])
  
  type _To = Argv[js.Object]
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Argv[js.Object] = ^
}
