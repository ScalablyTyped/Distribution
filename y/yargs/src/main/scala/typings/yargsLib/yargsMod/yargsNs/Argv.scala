package typings
package yargsLib.yargsMod.yargsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Argv extends js.Object {
  var argv: Arguments = js.native
  def apply(): Arguments = js.native
  def apply(args: js.Array[java.lang.String]): Arguments = js.native
  def apply(args: js.Array[java.lang.String], cwd: java.lang.String): Arguments = js.native
  def alias(aliases: ScalablyTyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]]): Argv = js.native
  def alias(shortName: java.lang.String, longName: java.lang.String): Argv = js.native
  def alias(shortName: java.lang.String, longName: js.Array[java.lang.String]): Argv = js.native
  def alias(shortName: js.Array[java.lang.String], longName: java.lang.String): Argv = js.native
  def alias(shortName: js.Array[java.lang.String], longName: js.Array[java.lang.String]): Argv = js.native
  def array(key: java.lang.String): Argv = js.native
  def array(key: js.Array[java.lang.String]): Argv = js.native
  def boolean(key: java.lang.String): Argv = js.native
  def boolean(key: js.Array[java.lang.String]): Argv = js.native
  def check(
    func: js.Function2[
      /* argv */ Arguments, 
      /* aliases */ ScalablyTyped.runtime.StringDictionary[java.lang.String], 
      _
    ]
  ): Argv = js.native
  def check(
    func: js.Function2[
      /* argv */ Arguments, 
      /* aliases */ ScalablyTyped.runtime.StringDictionary[java.lang.String], 
      _
    ],
    global: scala.Boolean
  ): Argv = js.native
  def choices(choices: ScalablyTyped.runtime.StringDictionary[Choices]): Argv = js.native
  def choices(key: java.lang.String, values: Choices): Argv = js.native
  def coerce(key: java.lang.String, func: js.Function1[/* arg */ js.Any, _]): Argv = js.native
  def coerce(key: js.Array[java.lang.String], func: js.Function1[/* arg */ js.Any, _]): Argv = js.native
  def coerce(opts: ScalablyTyped.runtime.StringDictionary[js.Function1[/* arg */ js.Any, _]]): Argv = js.native
  def command(command: java.lang.String, description: java.lang.String): Argv = js.native
  def command(
    command: java.lang.String,
    description: java.lang.String,
    builder: ScalablyTyped.runtime.StringDictionary[Options]
  ): Argv = js.native
  def command(
    command: java.lang.String,
    description: java.lang.String,
    builder: ScalablyTyped.runtime.StringDictionary[Options],
    handler: js.Function1[/* args */ Arguments, scala.Unit]
  ): Argv = js.native
  def command(
    command: java.lang.String,
    description: java.lang.String,
    builder: js.Function1[/* args */ this.type, this.type]
  ): Argv = js.native
  def command(
    command: java.lang.String,
    description: java.lang.String,
    builder: js.Function1[/* args */ this.type, this.type],
    handler: js.Function1[/* args */ Arguments, scala.Unit]
  ): Argv = js.native
  def command(command: java.lang.String, description: java.lang.String, module: CommandModule): Argv = js.native
  def command(command: java.lang.String, showInHelp: yargsLib.yargsLibNumbers.`false`): Argv = js.native
  def command(
    command: java.lang.String,
    showInHelp: yargsLib.yargsLibNumbers.`false`,
    builder: ScalablyTyped.runtime.StringDictionary[Options]
  ): Argv = js.native
  def command(
    command: java.lang.String,
    showInHelp: yargsLib.yargsLibNumbers.`false`,
    builder: ScalablyTyped.runtime.StringDictionary[Options],
    handler: js.Function1[/* args */ Arguments, scala.Unit]
  ): Argv = js.native
  def command(
    command: java.lang.String,
    showInHelp: yargsLib.yargsLibNumbers.`false`,
    builder: js.Function1[/* args */ this.type, this.type]
  ): Argv = js.native
  def command(
    command: java.lang.String,
    showInHelp: yargsLib.yargsLibNumbers.`false`,
    builder: js.Function1[/* args */ this.type, this.type],
    handler: js.Function1[/* args */ Arguments, scala.Unit]
  ): Argv = js.native
  def command(command: java.lang.String, showInHelp: yargsLib.yargsLibNumbers.`false`, module: CommandModule): Argv = js.native
  def command(command: js.Array[java.lang.String], description: java.lang.String): Argv = js.native
  def command(
    command: js.Array[java.lang.String],
    description: java.lang.String,
    builder: ScalablyTyped.runtime.StringDictionary[Options]
  ): Argv = js.native
  def command(
    command: js.Array[java.lang.String],
    description: java.lang.String,
    builder: ScalablyTyped.runtime.StringDictionary[Options],
    handler: js.Function1[/* args */ Arguments, scala.Unit]
  ): Argv = js.native
  def command(
    command: js.Array[java.lang.String],
    description: java.lang.String,
    builder: js.Function1[/* args */ this.type, this.type]
  ): Argv = js.native
  def command(
    command: js.Array[java.lang.String],
    description: java.lang.String,
    builder: js.Function1[/* args */ this.type, this.type],
    handler: js.Function1[/* args */ Arguments, scala.Unit]
  ): Argv = js.native
  def command(command: js.Array[java.lang.String], description: java.lang.String, module: CommandModule): Argv = js.native
  def command(command: js.Array[java.lang.String], showInHelp: yargsLib.yargsLibNumbers.`false`): Argv = js.native
  def command(
    command: js.Array[java.lang.String],
    showInHelp: yargsLib.yargsLibNumbers.`false`,
    builder: ScalablyTyped.runtime.StringDictionary[Options]
  ): Argv = js.native
  def command(
    command: js.Array[java.lang.String],
    showInHelp: yargsLib.yargsLibNumbers.`false`,
    builder: ScalablyTyped.runtime.StringDictionary[Options],
    handler: js.Function1[/* args */ Arguments, scala.Unit]
  ): Argv = js.native
  def command(
    command: js.Array[java.lang.String],
    showInHelp: yargsLib.yargsLibNumbers.`false`,
    builder: js.Function1[/* args */ this.type, this.type]
  ): Argv = js.native
  def command(
    command: js.Array[java.lang.String],
    showInHelp: yargsLib.yargsLibNumbers.`false`,
    builder: js.Function1[/* args */ this.type, this.type],
    handler: js.Function1[/* args */ Arguments, scala.Unit]
  ): Argv = js.native
  def command(
    command: js.Array[java.lang.String],
    showInHelp: yargsLib.yargsLibNumbers.`false`,
    module: CommandModule
  ): Argv = js.native
  def command(module: CommandModule): Argv = js.native
  // Advanced API
  def commandDir(dir: java.lang.String): Argv = js.native
  // Advanced API
  def commandDir(dir: java.lang.String, opts: RequireDirectoryOptions): Argv = js.native
  def completion(): Argv = js.native
  def completion(cmd: java.lang.String): Argv = js.native
  def completion(cmd: java.lang.String, description: java.lang.String): Argv = js.native
  def completion(cmd: java.lang.String, description: java.lang.String, func: AsyncCompletionFunction): Argv = js.native
  def completion(cmd: java.lang.String, description: java.lang.String, func: SyncCompletionFunction): Argv = js.native
  def completion(cmd: java.lang.String, func: AsyncCompletionFunction): Argv = js.native
  def completion(cmd: java.lang.String, func: SyncCompletionFunction): Argv = js.native
  def config(): Argv = js.native
  def config(explicitConfigurationObject: js.Object): Argv = js.native
  def config(key: java.lang.String): Argv = js.native
  def config(key: java.lang.String, description: java.lang.String): Argv = js.native
  def config(
    key: java.lang.String,
    description: java.lang.String,
    parseFn: js.Function1[/* configPath */ java.lang.String, js.Object]
  ): Argv = js.native
  def config(key: java.lang.String, parseFn: js.Function1[/* configPath */ java.lang.String, js.Object]): Argv = js.native
  def config(key: js.Array[java.lang.String]): Argv = js.native
  def config(key: js.Array[java.lang.String], description: java.lang.String): Argv = js.native
  def config(
    key: js.Array[java.lang.String],
    description: java.lang.String,
    parseFn: js.Function1[/* configPath */ java.lang.String, js.Object]
  ): Argv = js.native
  def config(
    key: js.Array[java.lang.String],
    parseFn: js.Function1[/* configPath */ java.lang.String, js.Object]
  ): Argv = js.native
  def conflicts(conflicts: ScalablyTyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]]): Argv = js.native
  def conflicts(key: java.lang.String, value: java.lang.String): Argv = js.native
  def conflicts(key: java.lang.String, value: js.Array[java.lang.String]): Argv = js.native
  def count(key: java.lang.String): Argv = js.native
  def count(key: js.Array[java.lang.String]): Argv = js.native
  def default(defaults: ScalablyTyped.runtime.StringDictionary[js.Any]): Argv = js.native
  def default(defaults: ScalablyTyped.runtime.StringDictionary[js.Any], description: java.lang.String): Argv = js.native
  def default(key: java.lang.String, value: js.Any): Argv = js.native
  def default(key: java.lang.String, value: js.Any, description: java.lang.String): Argv = js.native
  def demand(key: java.lang.String): Argv = js.native
  /**
           * @deprecated since version 6.6.0
           * Use '.demandCommand()' or '.demandOption()' instead
           */
  def demand(key: java.lang.String, msg: java.lang.String): Argv = js.native
  def demand(key: java.lang.String, required: scala.Boolean): Argv = js.native
  def demand(key: js.Array[java.lang.String]): Argv = js.native
  /**
           * @deprecated since version 6.6.0
           * Use '.demandCommand()' or '.demandOption()' instead
           */
  def demand(key: js.Array[java.lang.String], msg: java.lang.String): Argv = js.native
  def demand(key: js.Array[java.lang.String], required: scala.Boolean): Argv = js.native
  def demand(positionals: scala.Double): Argv = js.native
  def demand(positionals: scala.Double, max: scala.Double): Argv = js.native
  def demand(positionals: scala.Double, max: scala.Double, msg: java.lang.String): Argv = js.native
  def demand(positionals: scala.Double, msg: java.lang.String): Argv = js.native
  def demand(positionals: scala.Double, required: scala.Boolean): Argv = js.native
  def demandCommand(): Argv = js.native
  def demandCommand(min: scala.Double): Argv = js.native
  def demandCommand(min: scala.Double, max: scala.Double): Argv = js.native
  def demandCommand(min: scala.Double, max: scala.Double, minMsg: java.lang.String): Argv = js.native
  def demandCommand(min: scala.Double, max: scala.Double, minMsg: java.lang.String, maxMsg: java.lang.String): Argv = js.native
  def demandCommand(min: scala.Double, minMsg: java.lang.String): Argv = js.native
  def demandOption(key: java.lang.String): Argv = js.native
  def demandOption(key: java.lang.String, demand: scala.Boolean): Argv = js.native
  def demandOption(key: java.lang.String, msg: java.lang.String): Argv = js.native
  def demandOption(key: js.Array[java.lang.String]): Argv = js.native
  def demandOption(key: js.Array[java.lang.String], demand: scala.Boolean): Argv = js.native
  def demandOption(key: js.Array[java.lang.String], msg: java.lang.String): Argv = js.native
  def describe(descriptions: ScalablyTyped.runtime.StringDictionary[java.lang.String]): Argv = js.native
  def describe(key: java.lang.String, description: java.lang.String): Argv = js.native
  def describe(key: js.Array[java.lang.String], description: java.lang.String): Argv = js.native
  def detectLocale(detect: scala.Boolean): Argv = js.native
  def env(): Argv = js.native
  def env(enable: scala.Boolean): Argv = js.native
  def env(prefix: java.lang.String): Argv = js.native
  def epilog(msg: java.lang.String): Argv = js.native
  def epilogue(msg: java.lang.String): Argv = js.native
  def example(command: java.lang.String, description: java.lang.String): Argv = js.native
  def exitProcess(enabled: scala.Boolean): Argv = js.native
  def fail(func: js.Function2[/* msg */ java.lang.String, /* err */ stdLib.Error, _]): Argv = js.native
  def getCompletion(
    args: js.Array[java.lang.String],
    done: js.Function1[/* completions */ js.Array[java.lang.String], scala.Unit]
  ): Argv = js.native
  def global(key: java.lang.String): Argv = js.native
  def global(key: js.Array[java.lang.String]): Argv = js.native
  def group(key: java.lang.String, groupName: java.lang.String): Argv = js.native
  def group(key: js.Array[java.lang.String], groupName: java.lang.String): Argv = js.native
  def help(): Argv = js.native
  def help(enableExplicit: scala.Boolean): Argv = js.native
  def help(option: java.lang.String): Argv = js.native
  def help(option: java.lang.String, description: java.lang.String): Argv = js.native
  def help(option: java.lang.String, description: java.lang.String, enableExplicit: scala.Boolean): Argv = js.native
  def help(option: java.lang.String, enableExplicit: scala.Boolean): Argv = js.native
  def hide(key: java.lang.String): Argv = js.native
  def implies(implies: ScalablyTyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]]): Argv = js.native
  def implies(key: java.lang.String, value: java.lang.String): Argv = js.native
  def implies(key: java.lang.String, value: js.Array[java.lang.String]): Argv = js.native
  def locale(): java.lang.String = js.native
  def locale(loc: java.lang.String): Argv = js.native
  def middleware(callbacks: js.Array[MiddlewareFunction]): Argv = js.native
  def middleware(callbacks: MiddlewareFunction): Argv = js.native
  def nargs(key: java.lang.String, count: scala.Double): Argv = js.native
  def nargs(nargs: ScalablyTyped.runtime.StringDictionary[scala.Double]): Argv = js.native
  def normalize(key: java.lang.String): Argv = js.native
  def normalize(key: js.Array[java.lang.String]): Argv = js.native
  def number(key: java.lang.String): Argv = js.native
  def number(key: js.Array[java.lang.String]): Argv = js.native
  def option(key: java.lang.String, options: Options): Argv = js.native
  def option(options: ScalablyTyped.runtime.StringDictionary[Options]): Argv = js.native
  def options(key: java.lang.String, options: Options): Argv = js.native
  def options(options: ScalablyTyped.runtime.StringDictionary[Options]): Argv = js.native
  def parse(): Arguments = js.native
  def parse(arg: java.lang.String): Arguments = js.native
  def parse(arg: java.lang.String, context: js.Object): Arguments = js.native
  def parse(arg: java.lang.String, context: js.Object, parseCallback: ParseCallback): Arguments = js.native
  def parse(arg: js.Array[java.lang.String]): Arguments = js.native
  def parse(arg: js.Array[java.lang.String], context: js.Object): Arguments = js.native
  def parse(arg: js.Array[java.lang.String], context: js.Object, parseCallback: ParseCallback): Arguments = js.native
  def pkgConf(key: java.lang.String): Argv = js.native
  def pkgConf(key: java.lang.String, cwd: java.lang.String): Argv = js.native
  def pkgConf(key: js.Array[java.lang.String]): Argv = js.native
  def pkgConf(key: js.Array[java.lang.String], cwd: java.lang.String): Argv = js.native
  /**
           * 'positional' should be called in a command's builder function, and is not
           * available on the top-level yargs instance. If so, it will throw an error.
           */
  def positional(key: java.lang.String, opt: PositionalOptions): Argv = js.native
  def recommendCommands(): Argv = js.native
  /**
           * @deprecated since version 6.6.0
           * Use '.demandCommand()' or '.demandOption()' instead
           */
  def require(key: java.lang.String, msg: java.lang.String): Argv = js.native
  def require(key: java.lang.String, required: scala.Boolean): Argv = js.native
  def require(keys: js.Array[scala.Double], msg: java.lang.String): Argv = js.native
  def require(keys: js.Array[scala.Double], required: scala.Boolean): Argv = js.native
  def require(positionals: scala.Double, msg: java.lang.String): Argv = js.native
  def require(positionals: scala.Double, required: scala.Boolean): Argv = js.native
  /**
           * @deprecated since version 6.6.0
           * Use '.demandCommand()' or '.demandOption()' instead
           */
  def required(key: java.lang.String, msg: java.lang.String): Argv = js.native
  def required(key: java.lang.String, required: scala.Boolean): Argv = js.native
  def required(keys: js.Array[scala.Double], msg: java.lang.String): Argv = js.native
  def required(keys: js.Array[scala.Double], required: scala.Boolean): Argv = js.native
  def required(positionals: scala.Double, msg: java.lang.String): Argv = js.native
  def required(positionals: scala.Double, required: scala.Boolean): Argv = js.native
  def requiresArg(key: java.lang.String): Argv = js.native
  def requiresArg(key: js.Array[java.lang.String]): Argv = js.native
  /**
           * @deprecated since version 6.6.0
           * Use '.global()' instead
           */
  def reset(): Argv = js.native
  def scriptName($0: java.lang.String): Argv = js.native
  def showCompletionScript(): Argv = js.native
  def showHelp(): Argv = js.native
  def showHelp(consoleLevel: java.lang.String): Argv = js.native
  def showHelpOnFail(enable: scala.Boolean): Argv = js.native
  def showHelpOnFail(enable: scala.Boolean, message: java.lang.String): Argv = js.native
  def showHidden(): Argv = js.native
  def showHidden(option: java.lang.String): Argv = js.native
  def showHidden(option: java.lang.String, description: java.lang.String): Argv = js.native
  def showHidden(option: scala.Boolean): Argv = js.native
  def skipValidation(key: java.lang.String): Argv = js.native
  def skipValidation(key: js.Array[java.lang.String]): Argv = js.native
  def strict(): Argv = js.native
  def string(key: java.lang.String): Argv = js.native
  def string(key: js.Array[java.lang.String]): Argv = js.native
  // Intended to be used with '.wrap()'
  def terminalWidth(): scala.Double = js.native
  def updateLocale(obj: ScalablyTyped.runtime.StringDictionary[java.lang.String]): Argv = js.native
  def updateStrings(obj: ScalablyTyped.runtime.StringDictionary[java.lang.String]): Argv = js.native
  def usage(command: java.lang.String, description: java.lang.String): Argv = js.native
  def usage(
    command: java.lang.String,
    description: java.lang.String,
    builder: ScalablyTyped.runtime.StringDictionary[Options]
  ): Argv = js.native
  def usage(
    command: java.lang.String,
    description: java.lang.String,
    builder: ScalablyTyped.runtime.StringDictionary[Options],
    handler: js.Function1[/* args */ Arguments, scala.Unit]
  ): Argv = js.native
  def usage(
    command: java.lang.String,
    description: java.lang.String,
    builder: js.Function1[/* args */ this.type, this.type]
  ): Argv = js.native
  def usage(
    command: java.lang.String,
    description: java.lang.String,
    builder: js.Function1[/* args */ this.type, this.type],
    handler: js.Function1[/* args */ Arguments, scala.Unit]
  ): Argv = js.native
  def usage(command: java.lang.String, showInHelp: scala.Boolean): Argv = js.native
  def usage(
    command: java.lang.String,
    showInHelp: scala.Boolean,
    builder: js.Function1[/* args */ this.type, this.type]
  ): Argv = js.native
  def usage(
    command: java.lang.String,
    showInHelp: scala.Boolean,
    builder: js.Function1[/* args */ this.type, this.type],
    handler: js.Function1[/* args */ Arguments, scala.Unit]
  ): Argv = js.native
  def usage(command: js.Array[java.lang.String], description: java.lang.String): Argv = js.native
  def usage(
    command: js.Array[java.lang.String],
    description: java.lang.String,
    builder: ScalablyTyped.runtime.StringDictionary[Options]
  ): Argv = js.native
  def usage(
    command: js.Array[java.lang.String],
    description: java.lang.String,
    builder: ScalablyTyped.runtime.StringDictionary[Options],
    handler: js.Function1[/* args */ Arguments, scala.Unit]
  ): Argv = js.native
  def usage(
    command: js.Array[java.lang.String],
    description: java.lang.String,
    builder: js.Function1[/* args */ this.type, this.type]
  ): Argv = js.native
  def usage(
    command: js.Array[java.lang.String],
    description: java.lang.String,
    builder: js.Function1[/* args */ this.type, this.type],
    handler: js.Function1[/* args */ Arguments, scala.Unit]
  ): Argv = js.native
  def usage(command: js.Array[java.lang.String], showInHelp: scala.Boolean): Argv = js.native
  def usage(
    command: js.Array[java.lang.String],
    showInHelp: scala.Boolean,
    builder: js.Function1[/* args */ this.type, this.type]
  ): Argv = js.native
  def usage(
    command: js.Array[java.lang.String],
    showInHelp: scala.Boolean,
    builder: js.Function1[/* args */ this.type, this.type],
    handler: js.Function1[/* args */ Arguments, scala.Unit]
  ): Argv = js.native
  def usage(
    commands: java.lang.String,
    showInHelp: scala.Boolean,
    builder: ScalablyTyped.runtime.StringDictionary[Options]
  ): Argv = js.native
  def usage(
    commands: java.lang.String,
    showInHelp: scala.Boolean,
    builder: ScalablyTyped.runtime.StringDictionary[Options],
    handler: js.Function1[/* args */ Arguments, scala.Unit]
  ): Argv = js.native
  def usage(
    commands: js.Array[java.lang.String],
    showInHelp: scala.Boolean,
    builder: ScalablyTyped.runtime.StringDictionary[Options]
  ): Argv = js.native
  def usage(
    commands: js.Array[java.lang.String],
    showInHelp: scala.Boolean,
    builder: ScalablyTyped.runtime.StringDictionary[Options],
    handler: js.Function1[/* args */ Arguments, scala.Unit]
  ): Argv = js.native
  def usage(message: java.lang.String): Argv = js.native
  def version(): Argv = js.native
  def version(enable: scala.Boolean): Argv = js.native
  def version(optionKey: java.lang.String, description: java.lang.String, version: java.lang.String): Argv = js.native
  def version(optionKey: java.lang.String, version: java.lang.String): Argv = js.native
  def version(version: java.lang.String): Argv = js.native
  def wrap(): Argv = js.native
  def wrap(columns: scala.Double): Argv = js.native
}

