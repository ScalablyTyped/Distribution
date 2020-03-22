package typings.yargs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import typings.yargs.PartialParserConfiguratio
import typings.yargs.yargsBooleans.`false`
import typings.yargs.yargsBooleans.`true`
import typings.yargsParser.mod.DetailedArguments
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The type parameter `T` is the expected shape of the parsed options.
  * `Arguments<T>` is those options plus `_` and `$0`, and an indexer falling
  * back to `unknown` for unknown options.
  *
  * For the return type / `argv` property, we create a mapped type over
  * `Arguments<T>` to simplify the inferred type signature in client code.
  */
@js.native
trait Argv[T] extends js.Object {
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
  var argv: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in keyof yargs.yargs.Arguments<T> ]: yargs.yargs.Arguments<T>[key]}
    */ typings.yargs.yargsStrings.Argv with Arguments[T] = js.native
  /**
    * If the arguments have not been parsed, this property is `false`.
    *
    * If the arguments have been parsed, this contain detailed parsed arguments.
    */
  var parsed: DetailedArguments | `false` = js.native
  def apply(): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in keyof yargs.yargs.Arguments<T> ]: yargs.yargs.Arguments<T>[key]}
    */ typings.yargs.yargsStrings.Argv with Arguments[T] = js.native
  def apply(args: js.Array[String]): Argv[T] = js.native
  def apply(args: js.Array[String], cwd: String): Argv[T] = js.native
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
  def alias[K1 /* <: String */, K2 /* <: String */](shortName: K1 | K2, longName: K1 | K2): Argv[T with typings.yargs.yargsStrings.Argv] = js.native
  def alias[K1 /* <: String */, K2 /* <: String */](shortName: K1 | K2, longName: js.Array[K1 | K2]): Argv[T with typings.yargs.yargsStrings.Argv] = js.native
  /**
    * Tell the parser to interpret `key` as an array.
    * If `.array('foo')` is set, `--foo foo bar` will be parsed as `['foo', 'bar']` rather than as `'foo'`.
    * Also, if you use the option multiple times all the values will be flattened in one array so `--foo foo --foo bar` will be parsed as `['foo', 'bar']`
    *
    * When the option is used with a positional, use `--` to tell `yargs` to stop adding values to the array.
    */
  def array[K /* <: String */](key: K): Argv[(Omit[T, K]) with typings.yargs.yargsStrings.Argv with T] = js.native
  def array[K /* <: String */](key: js.Array[K]): Argv[(Omit[T, K]) with typings.yargs.yargsStrings.Argv with T] = js.native
  /**
    * Interpret `key` as a boolean. If a non-flag option follows `key` in `process.argv`, that string won't get set as the value of `key`.
    *
    * `key` will default to `false`, unless a `default(key, undefined)` is explicitly set.
    *
    * If `key` is an array, interpret all the elements as booleans.
    */
  def boolean[K /* <: String */](key: K): Argv[(Omit[T, K]) with typings.yargs.yargsStrings.Argv with js.Any] = js.native
  def boolean[K /* <: String */](key: js.Array[K]): Argv[(Omit[T, K]) with typings.yargs.yargsStrings.Argv with js.Any] = js.native
  /**
    * Check that certain conditions are met in the provided arguments.
    * @param func Called with two arguments, the parsed `argv` hash and an array of options and their aliases.
    * If `func` throws or returns a non-truthy value, show the thrown error, usage information, and exit.
    * @param global Indicates whether `check()` should be enabled both at the top-level and for each sub-command.
    */
  def check(func: js.Function2[/* argv */ Arguments[T], /* aliases */ StringDictionary[String], _]): Argv[T] = js.native
  def check(
    func: js.Function2[/* argv */ Arguments[T], /* aliases */ StringDictionary[String], _],
    global: Boolean
  ): Argv[T] = js.native
  def choices[C /* <: StringDictionary[js.Array[_]] */](choices: C): Argv[(Omit[T, String]) with typings.yargs.yargsStrings.Argv with C] = js.native
  /**
    * Limit valid values for key to a predefined set of choices, given as an array or as an individual value.
    * If this method is called multiple times, all enumerated values will be merged together.
    * Choices are generally strings or numbers, and value matching is case-sensitive.
    *
    * Optionally `.choices()` can take an object that maps multiple keys to their choices.
    *
    * Choices can also be specified as choices in the object given to `option()`.
    */
  def choices[K /* <: String */, C /* <: js.Array[_] */](key: K, values: C): Argv[(Omit[T, K]) with typings.yargs.yargsStrings.Argv with C] = js.native
  def coerce[O /* <: StringDictionary[js.Function1[/* arg */ js.Any, _]] */](opts: O): Argv[(Omit[T, String]) with typings.yargs.yargsStrings.Argv with O] = js.native
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
  def coerce[K /* <: String */, V](key: K, func: js.Function1[/* arg */ js.Any, V]): Argv[(Omit[T, K]) with typings.yargs.yargsStrings.Argv with js.Any] = js.native
  def coerce[K /* <: String */, V](key: js.Array[K], func: js.Function1[/* arg */ js.Any, V]): Argv[(Omit[T, K]) with typings.yargs.yargsStrings.Argv with js.Any] = js.native
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
  def command[U](command: String, description: String): Argv[U] = js.native
  def command[O /* <: StringDictionary[Options] */](command: String, description: String, builder: O): Argv[T] = js.native
  def command[O /* <: StringDictionary[Options] */](
    command: String,
    description: String,
    builder: O,
    handler: js.Function1[/* args */ Arguments[InferredOptionTypes[O]], Unit]
  ): Argv[T] = js.native
  def command[U](command: String, description: String, builder: BuilderCallback[T, U]): Argv[U] = js.native
  def command[U](
    command: String,
    description: String,
    builder: BuilderCallback[T, U],
    handler: js.Function1[/* args */ Arguments[U], Unit]
  ): Argv[U] = js.native
  def command[U](command: String, description: String, module: CommandModule[T, U]): Argv[U] = js.native
  def command[U](command: js.Array[String], description: String): Argv[U] = js.native
  def command[O /* <: StringDictionary[Options] */](command: js.Array[String], description: String, builder: O): Argv[T] = js.native
  def command[O /* <: StringDictionary[Options] */](
    command: js.Array[String],
    description: String,
    builder: O,
    handler: js.Function1[/* args */ Arguments[InferredOptionTypes[O]], Unit]
  ): Argv[T] = js.native
  def command[U](command: js.Array[String], description: String, builder: BuilderCallback[T, U]): Argv[U] = js.native
  def command[U](
    command: js.Array[String],
    description: String,
    builder: BuilderCallback[T, U],
    handler: js.Function1[/* args */ Arguments[U], Unit]
  ): Argv[U] = js.native
  def command[U](command: js.Array[String], description: String, module: CommandModule[T, U]): Argv[U] = js.native
  def command[U](module: CommandModule[T, U]): Argv[U] = js.native
  // Advanced API
  /** Apply command modules from a directory relative to the module calling this method. */
  def commandDir(dir: String): Argv[T] = js.native
  def commandDir(dir: String, opts: RequireDirectoryOptions): Argv[T] = js.native
  @JSName("command")
  def command_O_StringDictionaryOptions[O /* <: StringDictionary[Options] */](command: String, description: String): Argv[T] = js.native
  @JSName("command")
  def command_O_StringDictionaryOptions[O /* <: StringDictionary[Options] */](command: js.Array[String], description: String): Argv[T] = js.native
  @JSName("command")
  def command_false[U](command: String, showInHelp: `false`): Argv[T] = js.native
  @JSName("command")
  def command_false[O /* <: StringDictionary[Options] */](command: String, showInHelp: `false`, builder: O): Argv[T] = js.native
  @JSName("command")
  def command_false[O /* <: StringDictionary[Options] */](
    command: String,
    showInHelp: `false`,
    builder: O,
    handler: js.Function1[/* args */ Arguments[InferredOptionTypes[O]], Unit]
  ): Argv[T] = js.native
  @JSName("command")
  def command_false[U](command: String, showInHelp: `false`, builder: BuilderCallback[T, U]): Argv[T] = js.native
  @JSName("command")
  def command_false[U](
    command: String,
    showInHelp: `false`,
    builder: BuilderCallback[T, U],
    handler: js.Function1[/* args */ Arguments[U], Unit]
  ): Argv[T] = js.native
  @JSName("command")
  def command_false[U](command: String, showInHelp: `false`, module: CommandModule[T, U]): Argv[U] = js.native
  @JSName("command")
  def command_false[U](command: js.Array[String], showInHelp: `false`): Argv[T] = js.native
  @JSName("command")
  def command_false[O /* <: StringDictionary[Options] */](command: js.Array[String], showInHelp: `false`, builder: O): Argv[T] = js.native
  @JSName("command")
  def command_false[O /* <: StringDictionary[Options] */](
    command: js.Array[String],
    showInHelp: `false`,
    builder: O,
    handler: js.Function1[/* args */ Arguments[InferredOptionTypes[O]], Unit]
  ): Argv[T] = js.native
  @JSName("command")
  def command_false[U](command: js.Array[String], showInHelp: `false`, builder: BuilderCallback[T, U]): Argv[T] = js.native
  @JSName("command")
  def command_false[U](
    command: js.Array[String],
    showInHelp: `false`,
    builder: BuilderCallback[T, U],
    handler: js.Function1[/* args */ Arguments[U], Unit]
  ): Argv[T] = js.native
  @JSName("command")
  def command_false[U](command: js.Array[String], showInHelp: `false`, module: CommandModule[T, U]): Argv[U] = js.native
  @JSName("command")
  def command_false_O_StringDictionaryOptions[O /* <: StringDictionary[Options] */](command: String, showInHelp: `false`): Argv[T] = js.native
  @JSName("command")
  def command_false_O_StringDictionaryOptions[O /* <: StringDictionary[Options] */](command: js.Array[String], showInHelp: `false`): Argv[T] = js.native
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
  def config(key: String, parseFn: js.Function1[/* configPath */ String, js.Object]): Argv[T] = js.native
  def config(key: js.Array[String]): Argv[T] = js.native
  def config(key: js.Array[String], description: String): Argv[T] = js.native
  def config(
    key: js.Array[String],
    description: String,
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
  def count[K /* <: String */](key: K): Argv[(Omit[T, K]) with typings.yargs.yargsStrings.Argv with js.Any] = js.native
  def count[K /* <: String */](key: js.Array[K]): Argv[(Omit[T, K]) with typings.yargs.yargsStrings.Argv with js.Any] = js.native
  def default[D /* <: StringDictionary[js.Any] */](defaults: D): Argv[(Omit[T, String]) with D] = js.native
  def default[D /* <: StringDictionary[js.Any] */](defaults: D, description: String): Argv[(Omit[T, String]) with D] = js.native
  /**
    * Set `argv[key]` to `value` if no option was specified in `process.argv`.
    *
    * Optionally `.default()` can take an object that maps keys to default values.
    *
    * The default value can be a `function` which returns a value. The name of the function will be used in the usage string.
    *
    * Optionally, `description` can also be provided and will take precedence over displaying the value in the usage instructions.
    */
  def default[K /* <: String */, V](key: K, value: V): Argv[(Omit[T, K]) with typings.yargs.yargsStrings.Argv with js.Any] = js.native
  def default[K /* <: String */, V](key: K, value: V, description: String): Argv[(Omit[T, K]) with typings.yargs.yargsStrings.Argv with js.Any] = js.native
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
  def demand[K /* <: String */](key: K): Argv[Defined[T, K]] = js.native
  def demand[K /* <: String */](key: K, msg: String): Argv[Defined[T, K]] = js.native
  def demand[K /* <: String */](key: js.Array[K], msg: String): Argv[Defined[T, K]] = js.native
  /**
    * Demand in context of commands.
    * You can demand a minimum and a maximum number a user can have within your program, as well as provide corresponding error messages if either of the demands is not met.
    */
  def demandCommand(): Argv[T] = js.native
  def demandCommand(min: Double): Argv[T] = js.native
  def demandCommand(min: Double, max: Double): Argv[T] = js.native
  def demandCommand(min: Double, max: Double, minMsg: String): Argv[T] = js.native
  def demandCommand(min: Double, max: Double, minMsg: String, maxMsg: String): Argv[T] = js.native
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
  def demandOption[K /* <: String */](key: K): Argv[Defined[T, K]] = js.native
  def demandOption[K /* <: String */](key: K, msg: String): Argv[Defined[T, K]] = js.native
  def demandOption[K /* <: String */](key: js.Array[K], msg: String): Argv[Defined[T, K]] = js.native
  @JSName("demandOption")
  def demandOption_K_String[K /* <: String */](key: js.Array[K]): Argv[Defined[T, K]] = js.native
  @JSName("demandOption")
  def demandOption_true[K /* <: String */](key: K, msg: `true`): Argv[Defined[T, K]] = js.native
  @JSName("demandOption")
  def demandOption_true[K /* <: String */](key: js.Array[K], msg: `true`): Argv[Defined[T, K]] = js.native
  @JSName("demand")
  def demand_K_String[K /* <: String */](key: js.Array[K]): Argv[Defined[T, K]] = js.native
  @JSName("demand")
  def demand_true[K /* <: String */](key: K, msg: `true`): Argv[Defined[T, K]] = js.native
  @JSName("demand")
  def demand_true[K /* <: String */](key: js.Array[K], msg: `true`): Argv[Defined[T, K]] = js.native
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
  /** Manually indicate that the program should exit, and provide context about why we wanted to exit. Follows the behavior set by `.exitProcess().` */
  def exit(code: Double, err: Error): Unit = js.native
  /**
    * By default, yargs exits the process when the user passes a help flag, the user uses the `.version` functionality, validation fails, or the command handler fails.
    * Calling `.exitProcess(false)` disables this behavior, enabling further actions after yargs have been validated.
    */
  def exitProcess(enabled: Boolean): Argv[T] = js.native
  /**
    * Method to execute when a failure occurs, rather than printing the failure message.
    * @param func Is called with the failure message that would have been printed, the Error instance originally thrown and yargs state when the failure occurred.
    */
  def fail(func: js.Function3[/* msg */ String, /* err */ Error, /* yargs */ Argv[T], _]): Argv[T] = js.native
  /**
    * Allows to programmatically get completion choices for any line.
    * @param args An array of the words in the command line to complete.
    * @param done The callback to be called with the resulting completions.
    */
  def getCompletion(args: js.Array[String], done: js.Function1[/* completions */ js.Array[String], Unit]): Argv[T] = js.native
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
  def normalize[K /* <: String */](key: K): Argv[(Omit[T, K]) with typings.yargs.yargsStrings.Argv with T] = js.native
  def normalize[K /* <: String */](key: js.Array[K]): Argv[(Omit[T, K]) with typings.yargs.yargsStrings.Argv with T] = js.native
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
  def number[K /* <: String */](key: K): Argv[(Omit[T, K]) with typings.yargs.yargsStrings.Argv with T] = js.native
  def number[K /* <: String */](key: js.Array[K]): Argv[(Omit[T, K]) with typings.yargs.yargsStrings.Argv with T] = js.native
  /**
    * Method to execute when a command finishes successfully.
    * @param func Is called with the successful result of the command that finished.
    */
  def onFinishCommand(func: js.Function1[/* result */ js.Any, Unit]): Argv[T] = js.native
  def option[O /* <: StringDictionary[Options] */](options: O): Argv[(Omit[T, String]) with InferredOptionTypes[O]] = js.native
  /**
    * This method can be used to make yargs aware of options that could exist.
    * You can also pass an opt object which can hold further customization, like `.alias()`, `.demandOption()` etc. for that option.
    */
  def option[K /* <: String */, O /* <: Options */](key: K, options: O): Argv[(Omit[T, K]) with typings.yargs.yargsStrings.Argv with js.Any] = js.native
  def options[O /* <: StringDictionary[Options] */](options: O): Argv[(Omit[T, String]) with InferredOptionTypes[O]] = js.native
  /**
    * This method can be used to make yargs aware of options that could exist.
    * You can also pass an opt object which can hold further customization, like `.alias()`, `.demandOption()` etc. for that option.
    */
  def options[K /* <: String */, O /* <: Options */](key: K, options: O): Argv[(Omit[T, K]) with typings.yargs.yargsStrings.Argv with js.Any] = js.native
  /**
    * Parse `args` instead of `process.argv`. Returns the `argv` object. `args` may either be a pre-processed argv array, or a raw argument string.
    *
    * Note: Providing a callback to parse() disables the `exitProcess` setting until after the callback is invoked.
    * @param [context]  Provides a useful mechanism for passing state information to commands
    */
  def parse(): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in keyof yargs.yargs.Arguments<T> ]: yargs.yargs.Arguments<T>[key]}
    */ typings.yargs.yargsStrings.Argv with Arguments[T] = js.native
  def parse(arg: String): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in keyof yargs.yargs.Arguments<T> ]: yargs.yargs.Arguments<T>[key]}
    */ typings.yargs.yargsStrings.Argv with Arguments[T] = js.native
  def parse(arg: String, context: js.Object): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in keyof yargs.yargs.Arguments<T> ]: yargs.yargs.Arguments<T>[key]}
    */ typings.yargs.yargsStrings.Argv with Arguments[T] = js.native
  def parse(arg: String, context: js.Object, parseCallback: ParseCallback[T]): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in keyof yargs.yargs.Arguments<T> ]: yargs.yargs.Arguments<T>[key]}
    */ typings.yargs.yargsStrings.Argv with Arguments[T] = js.native
  def parse(arg: js.Array[String]): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in keyof yargs.yargs.Arguments<T> ]: yargs.yargs.Arguments<T>[key]}
    */ typings.yargs.yargsStrings.Argv with Arguments[T] = js.native
  def parse(arg: js.Array[String], context: js.Object): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in keyof yargs.yargs.Arguments<T> ]: yargs.yargs.Arguments<T>[key]}
    */ typings.yargs.yargsStrings.Argv with Arguments[T] = js.native
  def parse(arg: js.Array[String], context: js.Object, parseCallback: ParseCallback[T]): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in keyof yargs.yargs.Arguments<T> ]: yargs.yargs.Arguments<T>[key]}
    */ typings.yargs.yargsStrings.Argv with Arguments[T] = js.native
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
  def positional[K /* <: String */, O /* <: PositionalOptions */](key: K, opt: O): Argv[(Omit[T, K]) with typings.yargs.yargsStrings.Argv with js.Any] = js.native
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
  def require[K /* <: String */](key: K): Argv[Defined[T, K]] = js.native
  def require[K /* <: String */](key: K, msg: String): Argv[Defined[T, K]] = js.native
  def require[K /* <: String */](key: js.Array[K]): Argv[Defined[T, K]] = js.native
  @JSName("require")
  def require_K_String[K /* <: String */](key: js.Array[K], msg: String): Argv[Defined[T, K]] = js.native
  @JSName("require")
  def require_true[K /* <: String */](key: K, msg: `true`): Argv[Defined[T, K]] = js.native
  @JSName("require")
  def require_true[K /* <: String */](key: js.Array[K], msg: `true`): Argv[Defined[T, K]] = js.native
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
  def required[K /* <: String */](key: K): Argv[Defined[T, K]] = js.native
  def required[K /* <: String */](key: K, msg: String): Argv[Defined[T, K]] = js.native
  def required[K /* <: String */](key: js.Array[K]): Argv[Defined[T, K]] = js.native
  @JSName("required")
  def required_K_String[K /* <: String */](key: js.Array[K], msg: String): Argv[Defined[T, K]] = js.native
  @JSName("required")
  def required_true[K /* <: String */](key: K, msg: `true`): Argv[Defined[T, K]] = js.native
  @JSName("required")
  def required_true[K /* <: String */](key: js.Array[K], msg: `true`): Argv[Defined[T, K]] = js.native
  def requiresArg(key: String): Argv[T] = js.native
  def requiresArg(key: js.Array[String]): Argv[T] = js.native
  /**
    * @deprecated since version 6.6.0
    * Use '.global()' instead
    */
  def reset(): Argv[T] = js.native
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
    * Tell the parser logic not to interpret `key` as a number or boolean. This can be useful if you need to preserve leading zeros in an input.
    *
    * If `key` is an array, interpret all the elements as strings.
    *
    * `.string('_')` will result in non-hyphenated arguments being interpreted as strings, regardless of whether they resemble numbers.
    */
  def string[K /* <: String */](key: K): Argv[(Omit[T, K]) with typings.yargs.yargsStrings.Argv with T] = js.native
  def string[K /* <: String */](key: js.Array[K]): Argv[(Omit[T, K]) with typings.yargs.yargsStrings.Argv with T] = js.native
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
  def usage[U](command: String, description: String): Argv[T] = js.native
  def usage[O /* <: StringDictionary[Options] */](command: String, description: String, builder: O): Argv[T] = js.native
  def usage[O /* <: StringDictionary[Options] */](
    command: String,
    description: String,
    builder: O,
    handler: js.Function1[/* args */ Arguments[InferredOptionTypes[O]], Unit]
  ): Argv[T] = js.native
  def usage[U](command: String, description: String, builder: js.Function1[/* args */ Argv[T], Argv[U]]): Argv[T] = js.native
  def usage[U](
    command: String,
    description: String,
    builder: js.Function1[/* args */ Argv[T], Argv[U]],
    handler: js.Function1[/* args */ Arguments[U], Unit]
  ): Argv[T] = js.native
  def usage[U](command: String, showInHelp: Boolean): Argv[T] = js.native
  def usage[O /* <: StringDictionary[Options] */](command: String, showInHelp: Boolean, builder: O): Argv[T] = js.native
  def usage[O /* <: StringDictionary[Options] */](
    command: String,
    showInHelp: Boolean,
    builder: O,
    handler: js.Function1[/* args */ Arguments[InferredOptionTypes[O]], Unit]
  ): Argv[T] = js.native
  def usage[U](command: String, showInHelp: Boolean, builder: js.Function1[/* args */ Argv[T], Argv[U]]): Argv[T] = js.native
  def usage[U](
    command: String,
    showInHelp: Boolean,
    builder: js.Function1[/* args */ Argv[T], Argv[U]],
    handler: js.Function1[/* args */ Arguments[U], Unit]
  ): Argv[T] = js.native
  def usage[U](command: js.Array[String], description: String): Argv[T] = js.native
  def usage[O /* <: StringDictionary[Options] */](command: js.Array[String], description: String, builder: O): Argv[T] = js.native
  def usage[O /* <: StringDictionary[Options] */](
    command: js.Array[String],
    description: String,
    builder: O,
    handler: js.Function1[/* args */ Arguments[InferredOptionTypes[O]], Unit]
  ): Argv[T] = js.native
  def usage[U](command: js.Array[String], description: String, builder: js.Function1[/* args */ Argv[T], Argv[U]]): Argv[T] = js.native
  def usage[U](
    command: js.Array[String],
    description: String,
    builder: js.Function1[/* args */ Argv[T], Argv[U]],
    handler: js.Function1[/* args */ Arguments[U], Unit]
  ): Argv[T] = js.native
  def usage[U](command: js.Array[String], showInHelp: Boolean): Argv[T] = js.native
  def usage[O /* <: StringDictionary[Options] */](command: js.Array[String], showInHelp: Boolean, builder: O): Argv[T] = js.native
  def usage[O /* <: StringDictionary[Options] */](
    command: js.Array[String],
    showInHelp: Boolean,
    builder: O,
    handler: js.Function1[/* args */ Arguments[InferredOptionTypes[O]], Unit]
  ): Argv[T] = js.native
  def usage[U](command: js.Array[String], showInHelp: Boolean, builder: js.Function1[/* args */ Argv[T], Argv[U]]): Argv[T] = js.native
  def usage[U](
    command: js.Array[String],
    showInHelp: Boolean,
    builder: js.Function1[/* args */ Argv[T], Argv[U]],
    handler: js.Function1[/* args */ Arguments[U], Unit]
  ): Argv[T] = js.native
  @JSName("usage")
  def usage_O_StringDictionaryOptions[O /* <: StringDictionary[Options] */](command: String, description: String): Argv[T] = js.native
  @JSName("usage")
  def usage_O_StringDictionaryOptions[O /* <: StringDictionary[Options] */](command: String, showInHelp: Boolean): Argv[T] = js.native
  @JSName("usage")
  def usage_O_StringDictionaryOptions[O /* <: StringDictionary[Options] */](command: js.Array[String], description: String): Argv[T] = js.native
  @JSName("usage")
  def usage_O_StringDictionaryOptions[O /* <: StringDictionary[Options] */](command: js.Array[String], showInHelp: Boolean): Argv[T] = js.native
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
  def wrap(): Argv[T] = js.native
  /**
    * Format usage output to wrap at columns many columns.
    *
    * By default wrap will be set to `Math.min(80, windowWidth)`. Use `.wrap(null)` to specify no column limit (no right-align).
    * Use `.wrap(yargs.terminalWidth())` to maximize the width of yargs' usage instructions.
    */
  def wrap(columns: Double): Argv[T] = js.native
}

