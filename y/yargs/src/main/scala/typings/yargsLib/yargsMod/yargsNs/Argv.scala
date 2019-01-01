package typings
package yargsLib.yargsMod.yargsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// The type parameter T is the expected shape of the parsed options.
// Arguments<T> is those options plus _ and $0, and an indexer falling
// back to unknown for unknown options.
//
// For the return type / argv property, we create a mapped type over
// Arguments<T> to simplify the inferred type signature in client code.
@js.native
trait Argv[T] extends js.Object {
  var argv: yargsLib.yargsLibStrings.Argv with Arguments[T] = js.native
  def apply(): yargsLib.yargsLibStrings.Argv with Arguments[T] = js.native
  def apply(args: js.Array[java.lang.String]): Argv[T] = js.native
  def apply(args: js.Array[java.lang.String], cwd: java.lang.String): Argv[T] = js.native
  def alias(aliases: org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]]): Argv[T] = js.native
  def alias(shortName: java.lang.String, longName: java.lang.String): Argv[T] = js.native
  def alias(shortName: java.lang.String, longName: js.Array[java.lang.String]): Argv[T] = js.native
  def alias(shortName: js.Array[java.lang.String], longName: java.lang.String): Argv[T] = js.native
  def alias(shortName: js.Array[java.lang.String], longName: js.Array[java.lang.String]): Argv[T] = js.native
  // Aliases for previously declared options can inherit the types of those options.
  def alias[K1 /* <: java.lang.String */, K2 /* <: java.lang.String */](shortName: K1 | K2, longName: K1 | K2): Argv[T with yargsLib.yargsLibStrings.Argv] = js.native
  def alias[K1 /* <: java.lang.String */, K2 /* <: java.lang.String */](shortName: K1 | K2, longName: js.Array[K1 | K2]): Argv[T with yargsLib.yargsLibStrings.Argv] = js.native
  def array[K /* <: java.lang.String */](key: K): Argv[(Omit[T, K]) with yargsLib.yargsLibStrings.Argv with T] = js.native
  def array[K /* <: java.lang.String */](key: js.Array[K]): Argv[(Omit[T, K]) with yargsLib.yargsLibStrings.Argv with T] = js.native
  def boolean[K /* <: java.lang.String */](key: K): Argv[(Omit[T, K]) with yargsLib.yargsLibStrings.Argv with js.Any] = js.native
  def boolean[K /* <: java.lang.String */](key: js.Array[K]): Argv[(Omit[T, K]) with yargsLib.yargsLibStrings.Argv with js.Any] = js.native
  def check(
    func: js.Function2[
      /* argv */ Arguments[T], 
      /* aliases */ org.scalablytyped.runtime.StringDictionary[java.lang.String], 
      _
    ]
  ): Argv[T] = js.native
  def check(
    func: js.Function2[
      /* argv */ Arguments[T], 
      /* aliases */ org.scalablytyped.runtime.StringDictionary[java.lang.String], 
      _
    ],
    global: scala.Boolean
  ): Argv[T] = js.native
  def choices[C /* <: org.scalablytyped.runtime.StringDictionary[js.Array[_]] */](choices: C): Argv[(Omit[T, java.lang.String]) with yargsLib.yargsLibStrings.Argv with C] = js.native
  def choices[K /* <: java.lang.String */, C /* <: js.Array[_] */](key: K, values: C): Argv[(Omit[T, K]) with yargsLib.yargsLibStrings.Argv with C] = js.native
  def coerce[O /* <: org.scalablytyped.runtime.StringDictionary[js.Function1[/* arg */ js.Any, _]] */](opts: O): Argv[(Omit[T, java.lang.String]) with yargsLib.yargsLibStrings.Argv with O] = js.native
  def coerce[K /* <: java.lang.String */, V](key: K, func: js.Function1[/* arg */ js.Any, V]): Argv[(Omit[T, K]) with yargsLib.yargsLibStrings.Argv with js.Any] = js.native
  def coerce[K /* <: java.lang.String */, V](key: js.Array[K], func: js.Function1[/* arg */ js.Any, V]): Argv[(Omit[T, K]) with yargsLib.yargsLibStrings.Argv with js.Any] = js.native
  def command(command: java.lang.String, description: java.lang.String, module: CommandModule[T, _]): Argv[T] = js.native
  def command(command: js.Array[java.lang.String], description: java.lang.String, module: CommandModule[T, _]): Argv[T] = js.native
  def command[O /* <: org.scalablytyped.runtime.StringDictionary[Options] */](command: java.lang.String, description: java.lang.String): Argv[T] = js.native
  def command[O /* <: org.scalablytyped.runtime.StringDictionary[Options] */](command: java.lang.String, description: java.lang.String, builder: O): Argv[T] = js.native
  def command[O /* <: org.scalablytyped.runtime.StringDictionary[Options] */](
    command: java.lang.String,
    description: java.lang.String,
    builder: O,
    handler: js.Function1[/* args */ Arguments[InferredOptionTypes[O]], scala.Unit]
  ): Argv[T] = js.native
  def command[U](
    command: java.lang.String,
    description: java.lang.String,
    builder: js.Function1[/* args */ Argv[T], Argv[U]]
  ): Argv[T] = js.native
  def command[U](
    command: java.lang.String,
    description: java.lang.String,
    builder: js.Function1[/* args */ Argv[T], Argv[U]],
    handler: js.Function1[/* args */ Arguments[U], scala.Unit]
  ): Argv[T] = js.native
  def command[O /* <: org.scalablytyped.runtime.StringDictionary[Options] */](command: java.lang.String, showInHelp: yargsLib.yargsLibNumbers.`false`): Argv[T] = js.native
  def command[O /* <: org.scalablytyped.runtime.StringDictionary[Options] */](command: java.lang.String, showInHelp: yargsLib.yargsLibNumbers.`false`, builder: O): Argv[T] = js.native
  def command[O /* <: org.scalablytyped.runtime.StringDictionary[Options] */](
    command: java.lang.String,
    showInHelp: yargsLib.yargsLibNumbers.`false`,
    builder: O,
    handler: js.Function1[/* args */ Arguments[InferredOptionTypes[O]], scala.Unit]
  ): Argv[T] = js.native
  def command[U](
    command: java.lang.String,
    showInHelp: yargsLib.yargsLibNumbers.`false`,
    builder: js.Function1[/* args */ Argv[T], Argv[U]]
  ): Argv[T] = js.native
  def command[U](
    command: java.lang.String,
    showInHelp: yargsLib.yargsLibNumbers.`false`,
    builder: js.Function1[/* args */ Argv[T], Argv[U]],
    handler: js.Function1[/* args */ Arguments[U], scala.Unit]
  ): Argv[T] = js.native
  def command[U](
    command: java.lang.String,
    showInHelp: yargsLib.yargsLibNumbers.`false`,
    module: CommandModule[T, U]
  ): Argv[U] = js.native
  def command[O /* <: org.scalablytyped.runtime.StringDictionary[Options] */](command: js.Array[java.lang.String], description: java.lang.String): Argv[T] = js.native
  def command[O /* <: org.scalablytyped.runtime.StringDictionary[Options] */](command: js.Array[java.lang.String], description: java.lang.String, builder: O): Argv[T] = js.native
  def command[O /* <: org.scalablytyped.runtime.StringDictionary[Options] */](
    command: js.Array[java.lang.String],
    description: java.lang.String,
    builder: O,
    handler: js.Function1[/* args */ Arguments[InferredOptionTypes[O]], scala.Unit]
  ): Argv[T] = js.native
  def command[U](
    command: js.Array[java.lang.String],
    description: java.lang.String,
    builder: js.Function1[/* args */ Argv[T], Argv[U]]
  ): Argv[T] = js.native
  def command[U](
    command: js.Array[java.lang.String],
    description: java.lang.String,
    builder: js.Function1[/* args */ Argv[T], Argv[U]],
    handler: js.Function1[/* args */ Arguments[U], scala.Unit]
  ): Argv[T] = js.native
  def command[O /* <: org.scalablytyped.runtime.StringDictionary[Options] */](command: js.Array[java.lang.String], showInHelp: yargsLib.yargsLibNumbers.`false`): Argv[T] = js.native
  def command[O /* <: org.scalablytyped.runtime.StringDictionary[Options] */](command: js.Array[java.lang.String], showInHelp: yargsLib.yargsLibNumbers.`false`, builder: O): Argv[T] = js.native
  def command[O /* <: org.scalablytyped.runtime.StringDictionary[Options] */](
    command: js.Array[java.lang.String],
    showInHelp: yargsLib.yargsLibNumbers.`false`,
    builder: O,
    handler: js.Function1[/* args */ Arguments[InferredOptionTypes[O]], scala.Unit]
  ): Argv[T] = js.native
  def command[U](
    command: js.Array[java.lang.String],
    showInHelp: yargsLib.yargsLibNumbers.`false`,
    builder: js.Function1[/* args */ Argv[T], Argv[U]]
  ): Argv[T] = js.native
  def command[U](
    command: js.Array[java.lang.String],
    showInHelp: yargsLib.yargsLibNumbers.`false`,
    builder: js.Function1[/* args */ Argv[T], Argv[U]],
    handler: js.Function1[/* args */ Arguments[U], scala.Unit]
  ): Argv[T] = js.native
  def command[U](
    command: js.Array[java.lang.String],
    showInHelp: yargsLib.yargsLibNumbers.`false`,
    module: CommandModule[T, U]
  ): Argv[U] = js.native
  def command[U](module: CommandModule[T, U]): Argv[U] = js.native
  // Advanced API
  def commandDir(dir: java.lang.String): Argv[T] = js.native
  def commandDir(dir: java.lang.String, opts: RequireDirectoryOptions): Argv[T] = js.native
  @JSName("command")
  def command_U[U](command: java.lang.String, description: java.lang.String): Argv[T] = js.native
  @JSName("command")
  def command_U[U](command: java.lang.String, showInHelp: yargsLib.yargsLibNumbers.`false`): Argv[T] = js.native
  @JSName("command")
  def command_U[U](command: js.Array[java.lang.String], description: java.lang.String): Argv[T] = js.native
  @JSName("command")
  def command_U[U](command: js.Array[java.lang.String], showInHelp: yargsLib.yargsLibNumbers.`false`): Argv[T] = js.native
  def completion(): Argv[T] = js.native
  def completion(cmd: java.lang.String): Argv[T] = js.native
  def completion(cmd: java.lang.String, description: java.lang.String): Argv[T] = js.native
  def completion(cmd: java.lang.String, description: java.lang.String, func: AsyncCompletionFunction): Argv[T] = js.native
  def completion(cmd: java.lang.String, description: java.lang.String, func: SyncCompletionFunction): Argv[T] = js.native
  def completion(cmd: java.lang.String, func: AsyncCompletionFunction): Argv[T] = js.native
  def completion(cmd: java.lang.String, func: SyncCompletionFunction): Argv[T] = js.native
  def config(): Argv[T] = js.native
  def config(explicitConfigurationObject: js.Object): Argv[T] = js.native
  def config(key: java.lang.String): Argv[T] = js.native
  def config(key: java.lang.String, description: java.lang.String): Argv[T] = js.native
  def config(
    key: java.lang.String,
    description: java.lang.String,
    parseFn: js.Function1[/* configPath */ java.lang.String, js.Object]
  ): Argv[T] = js.native
  def config(key: java.lang.String, parseFn: js.Function1[/* configPath */ java.lang.String, js.Object]): Argv[T] = js.native
  def config(key: js.Array[java.lang.String]): Argv[T] = js.native
  def config(key: js.Array[java.lang.String], description: java.lang.String): Argv[T] = js.native
  def config(
    key: js.Array[java.lang.String],
    description: java.lang.String,
    parseFn: js.Function1[/* configPath */ java.lang.String, js.Object]
  ): Argv[T] = js.native
  def config(
    key: js.Array[java.lang.String],
    parseFn: js.Function1[/* configPath */ java.lang.String, js.Object]
  ): Argv[T] = js.native
  def conflicts(
    conflicts: org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]]
  ): Argv[T] = js.native
  def conflicts(key: java.lang.String, value: java.lang.String): Argv[T] = js.native
  def conflicts(key: java.lang.String, value: js.Array[java.lang.String]): Argv[T] = js.native
  def count[K /* <: java.lang.String */](key: K): Argv[(Omit[T, K]) with yargsLib.yargsLibStrings.Argv with js.Any] = js.native
  def count[K /* <: java.lang.String */](key: js.Array[K]): Argv[(Omit[T, K]) with yargsLib.yargsLibStrings.Argv with js.Any] = js.native
  def default[D /* <: org.scalablytyped.runtime.StringDictionary[js.Any] */](defaults: D): Argv[(Omit[T, java.lang.String]) with D] = js.native
  def default[D /* <: org.scalablytyped.runtime.StringDictionary[js.Any] */](defaults: D, description: java.lang.String): Argv[(Omit[T, java.lang.String]) with D] = js.native
  def default[K /* <: java.lang.String */, V](key: K, value: V): Argv[(Omit[T, K]) with yargsLib.yargsLibStrings.Argv with js.Any] = js.native
  def default[K /* <: java.lang.String */, V](key: K, value: V, description: java.lang.String): Argv[(Omit[T, K]) with yargsLib.yargsLibStrings.Argv with js.Any] = js.native
  def demand(key: java.lang.String): Argv[T] = js.native
  def demand(key: java.lang.String, required: scala.Boolean): Argv[T] = js.native
  def demand(key: js.Array[java.lang.String]): Argv[T] = js.native
  def demand(key: js.Array[java.lang.String], required: scala.Boolean): Argv[T] = js.native
  def demand(positionals: scala.Double): Argv[T] = js.native
  def demand(positionals: scala.Double, max: scala.Double): Argv[T] = js.native
  def demand(positionals: scala.Double, max: scala.Double, msg: java.lang.String): Argv[T] = js.native
  def demand(positionals: scala.Double, msg: java.lang.String): Argv[T] = js.native
  def demand(positionals: scala.Double, required: scala.Boolean): Argv[T] = js.native
  /**
    * @deprecated since version 6.6.0
    * Use '.demandCommand()' or '.demandOption()' instead
    */
  def demand[K /* <: java.lang.String */](key: K): Argv[Defined[T, K]] = js.native
  def demand[K /* <: java.lang.String */](key: K, msg: java.lang.String): Argv[Defined[T, K]] = js.native
  def demand[K /* <: java.lang.String */](key: K, msg: yargsLib.yargsLibNumbers.`true`): Argv[Defined[T, K]] = js.native
  def demand[K /* <: java.lang.String */](key: js.Array[K], msg: java.lang.String): Argv[Defined[T, K]] = js.native
  def demand[K /* <: java.lang.String */](key: js.Array[K], msg: yargsLib.yargsLibNumbers.`true`): Argv[Defined[T, K]] = js.native
  def demandCommand(): Argv[T] = js.native
  def demandCommand(min: scala.Double): Argv[T] = js.native
  def demandCommand(min: scala.Double, max: scala.Double): Argv[T] = js.native
  def demandCommand(min: scala.Double, max: scala.Double, minMsg: java.lang.String): Argv[T] = js.native
  def demandCommand(min: scala.Double, max: scala.Double, minMsg: java.lang.String, maxMsg: java.lang.String): Argv[T] = js.native
  def demandCommand(min: scala.Double, minMsg: java.lang.String): Argv[T] = js.native
  def demandOption(key: java.lang.String): Argv[T] = js.native
  def demandOption(key: java.lang.String, demand: scala.Boolean): Argv[T] = js.native
  def demandOption(key: js.Array[java.lang.String]): Argv[T] = js.native
  def demandOption(key: js.Array[java.lang.String], demand: scala.Boolean): Argv[T] = js.native
  def demandOption[K /* <: java.lang.String */](key: K): Argv[Defined[T, K]] = js.native
  def demandOption[K /* <: java.lang.String */](key: K, msg: java.lang.String): Argv[Defined[T, K]] = js.native
  def demandOption[K /* <: java.lang.String */](key: K, msg: yargsLib.yargsLibNumbers.`true`): Argv[Defined[T, K]] = js.native
  def demandOption[K /* <: java.lang.String */](key: js.Array[K], msg: java.lang.String): Argv[Defined[T, K]] = js.native
  def demandOption[K /* <: java.lang.String */](key: js.Array[K], msg: yargsLib.yargsLibNumbers.`true`): Argv[Defined[T, K]] = js.native
  @JSName("demandOption")
  def demandOption_KString[K /* <: java.lang.String */](key: js.Array[K]): Argv[Defined[T, K]] = js.native
  @JSName("demand")
  def demand_KString[K /* <: java.lang.String */](key: js.Array[K]): Argv[Defined[T, K]] = js.native
  def describe(descriptions: org.scalablytyped.runtime.StringDictionary[java.lang.String]): Argv[T] = js.native
  def describe(key: java.lang.String, description: java.lang.String): Argv[T] = js.native
  def describe(key: js.Array[java.lang.String], description: java.lang.String): Argv[T] = js.native
  def detectLocale(detect: scala.Boolean): Argv[T] = js.native
  def env(): Argv[T] = js.native
  def env(enable: scala.Boolean): Argv[T] = js.native
  def env(prefix: java.lang.String): Argv[T] = js.native
  def epilog(msg: java.lang.String): Argv[T] = js.native
  def epilogue(msg: java.lang.String): Argv[T] = js.native
  def example(command: java.lang.String, description: java.lang.String): Argv[T] = js.native
  def exitProcess(enabled: scala.Boolean): Argv[T] = js.native
  def fail(func: js.Function2[/* msg */ java.lang.String, /* err */ stdLib.Error, _]): Argv[T] = js.native
  def getCompletion(
    args: js.Array[java.lang.String],
    done: js.Function1[/* completions */ js.Array[java.lang.String], scala.Unit]
  ): Argv[T] = js.native
  def global(key: java.lang.String): Argv[T] = js.native
  def global(key: js.Array[java.lang.String]): Argv[T] = js.native
  def group(key: java.lang.String, groupName: java.lang.String): Argv[T] = js.native
  def group(key: js.Array[java.lang.String], groupName: java.lang.String): Argv[T] = js.native
  def help(): Argv[T] = js.native
  def help(enableExplicit: scala.Boolean): Argv[T] = js.native
  def help(option: java.lang.String): Argv[T] = js.native
  def help(option: java.lang.String, description: java.lang.String): Argv[T] = js.native
  def help(option: java.lang.String, description: java.lang.String, enableExplicit: scala.Boolean): Argv[T] = js.native
  def help(option: java.lang.String, enableExplicit: scala.Boolean): Argv[T] = js.native
  def hide(key: java.lang.String): Argv[T] = js.native
  def implies(implies: org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]]): Argv[T] = js.native
  def implies(key: java.lang.String, value: java.lang.String): Argv[T] = js.native
  def implies(key: java.lang.String, value: js.Array[java.lang.String]): Argv[T] = js.native
  def locale(): java.lang.String = js.native
  def locale(loc: java.lang.String): Argv[T] = js.native
  def middleware(callbacks: js.Array[MiddlewareFunction[T]]): Argv[T] = js.native
  def middleware(callbacks: MiddlewareFunction[T]): Argv[T] = js.native
  def nargs(key: java.lang.String, count: scala.Double): Argv[T] = js.native
  def nargs(nargs: org.scalablytyped.runtime.StringDictionary[scala.Double]): Argv[T] = js.native
  def normalize[K /* <: java.lang.String */](key: K): Argv[(Omit[T, K]) with yargsLib.yargsLibStrings.Argv with T] = js.native
  def normalize[K /* <: java.lang.String */](key: js.Array[K]): Argv[(Omit[T, K]) with yargsLib.yargsLibStrings.Argv with T] = js.native
  def number[K /* <: java.lang.String */](key: K): Argv[(Omit[T, K]) with yargsLib.yargsLibStrings.Argv with T] = js.native
  def number[K /* <: java.lang.String */](key: js.Array[K]): Argv[(Omit[T, K]) with yargsLib.yargsLibStrings.Argv with T] = js.native
  def option[O /* <: org.scalablytyped.runtime.StringDictionary[Options] */](options: O): Argv[(Omit[T, java.lang.String]) with InferredOptionTypes[O]] = js.native
  def option[K /* <: java.lang.String */, O /* <: Options */](key: K, options: O): Argv[(Omit[T, K]) with yargsLib.yargsLibStrings.Argv with js.Any] = js.native
  def options[O /* <: org.scalablytyped.runtime.StringDictionary[Options] */](options: O): Argv[(Omit[T, java.lang.String]) with InferredOptionTypes[O]] = js.native
  def options[K /* <: java.lang.String */, O /* <: Options */](key: K, options: O): Argv[(Omit[T, K]) with yargsLib.yargsLibStrings.Argv with js.Any] = js.native
  def parse(): yargsLib.yargsLibStrings.Argv with Arguments[T] = js.native
  def parse(arg: java.lang.String): yargsLib.yargsLibStrings.Argv with Arguments[T] = js.native
  def parse(arg: java.lang.String, context: js.Object): yargsLib.yargsLibStrings.Argv with Arguments[T] = js.native
  def parse(arg: java.lang.String, context: js.Object, parseCallback: ParseCallback[T]): yargsLib.yargsLibStrings.Argv with Arguments[T] = js.native
  def parse(arg: js.Array[java.lang.String]): yargsLib.yargsLibStrings.Argv with Arguments[T] = js.native
  def parse(arg: js.Array[java.lang.String], context: js.Object): yargsLib.yargsLibStrings.Argv with Arguments[T] = js.native
  def parse(arg: js.Array[java.lang.String], context: js.Object, parseCallback: ParseCallback[T]): yargsLib.yargsLibStrings.Argv with Arguments[T] = js.native
  def pkgConf(key: java.lang.String): Argv[T] = js.native
  def pkgConf(key: java.lang.String, cwd: java.lang.String): Argv[T] = js.native
  def pkgConf(key: js.Array[java.lang.String]): Argv[T] = js.native
  def pkgConf(key: js.Array[java.lang.String], cwd: java.lang.String): Argv[T] = js.native
  /**
    * 'positional' should be called in a command's builder function, and is not
    * available on the top-level yargs instance. If so, it will throw an error.
    */
  def positional(key: java.lang.String, opt: PositionalOptions): Argv[T] = js.native
  def recommendCommands(): Argv[T] = js.native
  def require(key: java.lang.String, msg: java.lang.String): Argv[T] = js.native
  def require(key: java.lang.String, required: scala.Boolean): Argv[T] = js.native
  def require(keys: js.Array[scala.Double], msg: java.lang.String): Argv[T] = js.native
  def require(keys: js.Array[scala.Double], required: scala.Boolean): Argv[T] = js.native
  def require(positionals: scala.Double, msg: java.lang.String): Argv[T] = js.native
  def require(positionals: scala.Double, required: scala.Boolean): Argv[T] = js.native
  /**
    * @deprecated since version 6.6.0
    * Use '.demandCommand()' or '.demandOption()' instead
    */
  def require[K /* <: java.lang.String */](key: K): Argv[Defined[T, K]] = js.native
  def require[K /* <: java.lang.String */](key: K, msg: java.lang.String): Argv[Defined[T, K]] = js.native
  def require[K /* <: java.lang.String */](key: K, msg: yargsLib.yargsLibNumbers.`true`): Argv[Defined[T, K]] = js.native
  def require[K /* <: java.lang.String */](key: js.Array[K]): Argv[Defined[T, K]] = js.native
  def require[K /* <: java.lang.String */](key: js.Array[K], msg: yargsLib.yargsLibNumbers.`true`): Argv[Defined[T, K]] = js.native
  @JSName("require")
  def require_KString[K /* <: java.lang.String */](key: js.Array[K], msg: java.lang.String): Argv[Defined[T, K]] = js.native
  def required(key: java.lang.String, msg: java.lang.String): Argv[T] = js.native
  def required(key: java.lang.String, required: scala.Boolean): Argv[T] = js.native
  def required(keys: js.Array[scala.Double], msg: java.lang.String): Argv[T] = js.native
  def required(keys: js.Array[scala.Double], required: scala.Boolean): Argv[T] = js.native
  def required(positionals: scala.Double, msg: java.lang.String): Argv[T] = js.native
  def required(positionals: scala.Double, required: scala.Boolean): Argv[T] = js.native
  /**
    * @deprecated since version 6.6.0
    * Use '.demandCommand()' or '.demandOption()' instead
    */
  def required[K /* <: java.lang.String */](key: K): Argv[Defined[T, K]] = js.native
  def required[K /* <: java.lang.String */](key: K, msg: java.lang.String): Argv[Defined[T, K]] = js.native
  def required[K /* <: java.lang.String */](key: K, msg: yargsLib.yargsLibNumbers.`true`): Argv[Defined[T, K]] = js.native
  def required[K /* <: java.lang.String */](key: js.Array[K]): Argv[Defined[T, K]] = js.native
  def required[K /* <: java.lang.String */](key: js.Array[K], msg: yargsLib.yargsLibNumbers.`true`): Argv[Defined[T, K]] = js.native
  @JSName("required")
  def required_KString[K /* <: java.lang.String */](key: js.Array[K], msg: java.lang.String): Argv[Defined[T, K]] = js.native
  def requiresArg(key: java.lang.String): Argv[T] = js.native
  def requiresArg(key: js.Array[java.lang.String]): Argv[T] = js.native
  /**
    * @deprecated since version 6.6.0
    * Use '.global()' instead
    */
  def reset(): Argv[T] = js.native
  def scriptName($0: java.lang.String): Argv[T] = js.native
  def showCompletionScript(): Argv[T] = js.native
  def showHelp(): Argv[T] = js.native
  def showHelp(consoleLevel: java.lang.String): Argv[T] = js.native
  def showHelpOnFail(enable: scala.Boolean): Argv[T] = js.native
  def showHelpOnFail(enable: scala.Boolean, message: java.lang.String): Argv[T] = js.native
  def showHidden(): Argv[T] = js.native
  def showHidden(option: java.lang.String): Argv[T] = js.native
  def showHidden(option: java.lang.String, description: java.lang.String): Argv[T] = js.native
  def showHidden(option: scala.Boolean): Argv[T] = js.native
  def skipValidation(key: java.lang.String): Argv[T] = js.native
  def skipValidation(key: js.Array[java.lang.String]): Argv[T] = js.native
  def strict(): Argv[T] = js.native
  def string[K /* <: java.lang.String */](key: K): Argv[(Omit[T, K]) with yargsLib.yargsLibStrings.Argv with T] = js.native
  def string[K /* <: java.lang.String */](key: js.Array[K]): Argv[(Omit[T, K]) with yargsLib.yargsLibStrings.Argv with T] = js.native
  // Intended to be used with '.wrap()'
  def terminalWidth(): scala.Double = js.native
  def updateLocale(obj: org.scalablytyped.runtime.StringDictionary[java.lang.String]): Argv[T] = js.native
  def updateStrings(obj: org.scalablytyped.runtime.StringDictionary[java.lang.String]): Argv[T] = js.native
  def usage(message: java.lang.String): Argv[T] = js.native
  def usage[O /* <: org.scalablytyped.runtime.StringDictionary[Options] */](command: java.lang.String, description: java.lang.String): Argv[T] = js.native
  def usage[O /* <: org.scalablytyped.runtime.StringDictionary[Options] */](command: java.lang.String, description: java.lang.String, builder: O): Argv[T] = js.native
  def usage[O /* <: org.scalablytyped.runtime.StringDictionary[Options] */](
    command: java.lang.String,
    description: java.lang.String,
    builder: O,
    handler: js.Function1[/* args */ Arguments[InferredOptionTypes[O]], scala.Unit]
  ): Argv[T] = js.native
  def usage[U](
    command: java.lang.String,
    description: java.lang.String,
    builder: js.Function1[/* args */ Argv[T], Argv[U]]
  ): Argv[T] = js.native
  def usage[U](
    command: java.lang.String,
    description: java.lang.String,
    builder: js.Function1[/* args */ Argv[T], Argv[U]],
    handler: js.Function1[/* args */ Arguments[U], scala.Unit]
  ): Argv[T] = js.native
  def usage[O /* <: org.scalablytyped.runtime.StringDictionary[Options] */](command: java.lang.String, showInHelp: scala.Boolean): Argv[T] = js.native
  def usage[O /* <: org.scalablytyped.runtime.StringDictionary[Options] */](command: java.lang.String, showInHelp: scala.Boolean, builder: O): Argv[T] = js.native
  def usage[O /* <: org.scalablytyped.runtime.StringDictionary[Options] */](
    command: java.lang.String,
    showInHelp: scala.Boolean,
    builder: O,
    handler: js.Function1[/* args */ Arguments[InferredOptionTypes[O]], scala.Unit]
  ): Argv[T] = js.native
  def usage[U](
    command: java.lang.String,
    showInHelp: scala.Boolean,
    builder: js.Function1[/* args */ Argv[T], Argv[U]]
  ): Argv[T] = js.native
  def usage[U](
    command: java.lang.String,
    showInHelp: scala.Boolean,
    builder: js.Function1[/* args */ Argv[T], Argv[U]],
    handler: js.Function1[/* args */ Arguments[U], scala.Unit]
  ): Argv[T] = js.native
  def usage[O /* <: org.scalablytyped.runtime.StringDictionary[Options] */](command: js.Array[java.lang.String], description: java.lang.String): Argv[T] = js.native
  def usage[O /* <: org.scalablytyped.runtime.StringDictionary[Options] */](command: js.Array[java.lang.String], description: java.lang.String, builder: O): Argv[T] = js.native
  def usage[O /* <: org.scalablytyped.runtime.StringDictionary[Options] */](
    command: js.Array[java.lang.String],
    description: java.lang.String,
    builder: O,
    handler: js.Function1[/* args */ Arguments[InferredOptionTypes[O]], scala.Unit]
  ): Argv[T] = js.native
  def usage[U](
    command: js.Array[java.lang.String],
    description: java.lang.String,
    builder: js.Function1[/* args */ Argv[T], Argv[U]]
  ): Argv[T] = js.native
  def usage[U](
    command: js.Array[java.lang.String],
    description: java.lang.String,
    builder: js.Function1[/* args */ Argv[T], Argv[U]],
    handler: js.Function1[/* args */ Arguments[U], scala.Unit]
  ): Argv[T] = js.native
  def usage[O /* <: org.scalablytyped.runtime.StringDictionary[Options] */](command: js.Array[java.lang.String], showInHelp: scala.Boolean): Argv[T] = js.native
  def usage[O /* <: org.scalablytyped.runtime.StringDictionary[Options] */](command: js.Array[java.lang.String], showInHelp: scala.Boolean, builder: O): Argv[T] = js.native
  def usage[O /* <: org.scalablytyped.runtime.StringDictionary[Options] */](
    command: js.Array[java.lang.String],
    showInHelp: scala.Boolean,
    builder: O,
    handler: js.Function1[/* args */ Arguments[InferredOptionTypes[O]], scala.Unit]
  ): Argv[T] = js.native
  def usage[U](
    command: js.Array[java.lang.String],
    showInHelp: scala.Boolean,
    builder: js.Function1[/* args */ Argv[T], Argv[U]]
  ): Argv[T] = js.native
  def usage[U](
    command: js.Array[java.lang.String],
    showInHelp: scala.Boolean,
    builder: js.Function1[/* args */ Argv[T], Argv[U]],
    handler: js.Function1[/* args */ Arguments[U], scala.Unit]
  ): Argv[T] = js.native
  @JSName("usage")
  def usage_U[U](command: java.lang.String, description: java.lang.String): Argv[T] = js.native
  @JSName("usage")
  def usage_U[U](command: java.lang.String, showInHelp: scala.Boolean): Argv[T] = js.native
  @JSName("usage")
  def usage_U[U](command: js.Array[java.lang.String], description: java.lang.String): Argv[T] = js.native
  @JSName("usage")
  def usage_U[U](command: js.Array[java.lang.String], showInHelp: scala.Boolean): Argv[T] = js.native
  def version(): Argv[T] = js.native
  def version(enable: scala.Boolean): Argv[T] = js.native
  def version(optionKey: java.lang.String, description: java.lang.String, version: java.lang.String): Argv[T] = js.native
  def version(optionKey: java.lang.String, version: java.lang.String): Argv[T] = js.native
  def version(version: java.lang.String): Argv[T] = js.native
  def wrap(): Argv[T] = js.native
  def wrap(columns: scala.Double): Argv[T] = js.native
}

