package typings.yargs

import org.scalablytyped.runtime.StringDictionary
import typings.requireDirectory.mod.RequireDirectoryOptions
import typings.yargs.commonTypesMod.Dictionary
import typings.yargs.middlewareMod.Middleware
import typings.yargs.parseCommandMod.Positional
import typings.yargs.usageMod.UsageInstance
import typings.yargs.validationMod.ValidationInstance
import typings.yargs.yargsBooleans.`false`
import typings.yargs.yargsMod.Arguments
import typings.yargs.yargsMod.Context
import typings.yargs.yargsMod.DetailedArguments
import typings.yargs.yargsMod.OptionDefinition
import typings.yargs.yargsMod.YargsInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandMod {
  
  @JSImport("yargs/build/lib/command", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def command(yargs: YargsInstance, usage: UsageInstance, validation: ValidationInstance): CommandInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("command")(yargs.asInstanceOf[js.Any], usage.asInstanceOf[js.Any], validation.asInstanceOf[js.Any])).asInstanceOf[CommandInstance]
  @scala.inline
  def command(
    yargs: YargsInstance,
    usage: UsageInstance,
    validation: ValidationInstance,
    globalMiddleware: js.Array[Middleware]
  ): CommandInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("command")(yargs.asInstanceOf[js.Any], usage.asInstanceOf[js.Any], validation.asInstanceOf[js.Any], globalMiddleware.asInstanceOf[js.Any])).asInstanceOf[CommandInstance]
  
  @scala.inline
  def isCommandBuilderCallback(builder: CommandBuilder): /* is yargs.yargs/build/lib/command.CommandBuilderCallback */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCommandBuilderCallback")(builder.asInstanceOf[js.Any]).asInstanceOf[/* is yargs.yargs/build/lib/command.CommandBuilderCallback */ Boolean]
  
  @scala.inline
  def isCommandBuilderDefinition(): /* is yargs.yargs/build/lib/command.CommandBuilderDefinition */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCommandBuilderDefinition")().asInstanceOf[/* is yargs.yargs/build/lib/command.CommandBuilderDefinition */ Boolean]
  @scala.inline
  def isCommandBuilderDefinition(builder: CommandBuilder): /* is yargs.yargs/build/lib/command.CommandBuilderDefinition */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCommandBuilderDefinition")(builder.asInstanceOf[js.Any]).asInstanceOf[/* is yargs.yargs/build/lib/command.CommandBuilderDefinition */ Boolean]
  @scala.inline
  def isCommandBuilderDefinition(builder: CommandBuilderDefinition): /* is yargs.yargs/build/lib/command.CommandBuilderDefinition */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCommandBuilderDefinition")(builder.asInstanceOf[js.Any]).asInstanceOf[/* is yargs.yargs/build/lib/command.CommandBuilderDefinition */ Boolean]
  
  @scala.inline
  def isCommandHandlerDefinition(cmd: String): /* is yargs.yargs/build/lib/command.CommandHandlerDefinition */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCommandHandlerDefinition")(cmd.asInstanceOf[js.Any]).asInstanceOf[/* is yargs.yargs/build/lib/command.CommandHandlerDefinition */ Boolean]
  @scala.inline
  def isCommandHandlerDefinition(cmd: js.Array[String]): /* is yargs.yargs/build/lib/command.CommandHandlerDefinition */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCommandHandlerDefinition")(cmd.asInstanceOf[js.Any]).asInstanceOf[/* is yargs.yargs/build/lib/command.CommandHandlerDefinition */ Boolean]
  @scala.inline
  def isCommandHandlerDefinition(cmd: CommandHandlerDefinition): /* is yargs.yargs/build/lib/command.CommandHandlerDefinition */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCommandHandlerDefinition")(cmd.asInstanceOf[js.Any]).asInstanceOf[/* is yargs.yargs/build/lib/command.CommandHandlerDefinition */ Boolean]
  
  type CommandBuilder = CommandBuilderCallback | Dictionary[OptionDefinition]
  
  type CommandBuilderCallback = js.Function1[/* y */ YargsInstance, YargsInstance | Unit]
  
  trait CommandBuilderDefinition extends StObject {
    
    var builder: js.UndefOr[CommandBuilder] = js.undefined
    
    var deprecated: js.UndefOr[Boolean] = js.undefined
    
    def handler(argv: Arguments): js.Any
    @JSName("handler")
    var handler_Original: CommandHandlerCallback
    
    var middlewares: js.UndefOr[js.Array[Middleware]] = js.undefined
  }
  object CommandBuilderDefinition {
    
    @scala.inline
    def apply(handler: /* argv */ Arguments => js.Any): CommandBuilderDefinition = {
      val __obj = js.Dynamic.literal(handler = js.Any.fromFunction1(handler))
      __obj.asInstanceOf[CommandBuilderDefinition]
    }
    
    @scala.inline
    implicit class CommandBuilderDefinitionMutableBuilder[Self <: CommandBuilderDefinition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBuilder(value: CommandBuilder): Self = StObject.set(x, "builder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBuilderFunction1(value: /* y */ YargsInstance => YargsInstance | Unit): Self = StObject.set(x, "builder", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBuilderUndefined: Self = StObject.set(x, "builder", js.undefined)
      
      @scala.inline
      def setDeprecated(value: Boolean): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
      
      @scala.inline
      def setHandler(value: /* argv */ Arguments => js.Any): Self = StObject.set(x, "handler", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMiddlewares(value: js.Array[Middleware]): Self = StObject.set(x, "middlewares", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMiddlewaresUndefined: Self = StObject.set(x, "middlewares", js.undefined)
      
      @scala.inline
      def setMiddlewaresVarargs(value: Middleware*): Self = StObject.set(x, "middlewares", js.Array(value :_*))
    }
  }
  
  trait CommandHandler extends StObject {
    
    var builder: CommandBuilder
    
    var demanded: js.Array[Positional]
    
    var deprecated: js.UndefOr[Boolean] = js.undefined
    
    var description: js.UndefOr[String | `false`] = js.undefined
    
    def handler(argv: Arguments): js.Any
    @JSName("handler")
    var handler_Original: CommandHandlerCallback
    
    var middlewares: js.Array[Middleware]
    
    var optional: js.Array[Positional]
    
    var original: String
  }
  object CommandHandler {
    
    @scala.inline
    def apply(
      builder: CommandBuilder,
      demanded: js.Array[Positional],
      handler: /* argv */ Arguments => js.Any,
      middlewares: js.Array[Middleware],
      optional: js.Array[Positional],
      original: String
    ): CommandHandler = {
      val __obj = js.Dynamic.literal(builder = builder.asInstanceOf[js.Any], demanded = demanded.asInstanceOf[js.Any], handler = js.Any.fromFunction1(handler), middlewares = middlewares.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], original = original.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommandHandler]
    }
    
    @scala.inline
    implicit class CommandHandlerMutableBuilder[Self <: CommandHandler] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBuilder(value: CommandBuilder): Self = StObject.set(x, "builder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBuilderFunction1(value: /* y */ YargsInstance => YargsInstance | Unit): Self = StObject.set(x, "builder", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDemanded(value: js.Array[Positional]): Self = StObject.set(x, "demanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDemandedVarargs(value: Positional*): Self = StObject.set(x, "demanded", js.Array(value :_*))
      
      @scala.inline
      def setDeprecated(value: Boolean): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
      
      @scala.inline
      def setDescription(value: String | `false`): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setHandler(value: /* argv */ Arguments => js.Any): Self = StObject.set(x, "handler", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMiddlewares(value: js.Array[Middleware]): Self = StObject.set(x, "middlewares", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMiddlewaresVarargs(value: Middleware*): Self = StObject.set(x, "middlewares", js.Array(value :_*))
      
      @scala.inline
      def setOptional(value: js.Array[Positional]): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionalVarargs(value: Positional*): Self = StObject.set(x, "optional", js.Array(value :_*))
      
      @scala.inline
      def setOriginal(value: String): Self = StObject.set(x, "original", value.asInstanceOf[js.Any])
    }
  }
  
  type CommandHandlerCallback = js.Function1[/* argv */ Arguments, js.Any]
  
  /* Inlined parent std.Partial<std.Pick<yargs.yargs/build/lib/command.CommandHandler, 'deprecated' | 'description' | 'handler' | 'middlewares'>> */
  trait CommandHandlerDefinition extends StObject {
    
    var aliases: js.UndefOr[js.Array[String]] = js.undefined
    
    var builder: js.UndefOr[CommandBuilder | CommandBuilderDefinition] = js.undefined
    
    var command: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var deprecated: js.UndefOr[Boolean] = js.undefined
    
    var desc: js.UndefOr[String | `false`] = js.undefined
    
    var describe: js.UndefOr[String | `false`] = js.undefined
    
    var description: js.UndefOr[String | `false`] = js.undefined
    
    var handler: js.UndefOr[CommandHandlerCallback] = js.undefined
    
    var middlewares: js.UndefOr[js.Array[Middleware]] = js.undefined
  }
  object CommandHandlerDefinition {
    
    @scala.inline
    def apply(): CommandHandlerDefinition = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommandHandlerDefinition]
    }
    
    @scala.inline
    implicit class CommandHandlerDefinitionMutableBuilder[Self <: CommandHandlerDefinition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAliases(value: js.Array[String]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAliasesUndefined: Self = StObject.set(x, "aliases", js.undefined)
      
      @scala.inline
      def setAliasesVarargs(value: String*): Self = StObject.set(x, "aliases", js.Array(value :_*))
      
      @scala.inline
      def setBuilder(value: CommandBuilder | CommandBuilderDefinition): Self = StObject.set(x, "builder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBuilderFunction1(value: /* y */ YargsInstance => YargsInstance | Unit): Self = StObject.set(x, "builder", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBuilderUndefined: Self = StObject.set(x, "builder", js.undefined)
      
      @scala.inline
      def setCommand(value: String | js.Array[String]): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommandUndefined: Self = StObject.set(x, "command", js.undefined)
      
      @scala.inline
      def setCommandVarargs(value: String*): Self = StObject.set(x, "command", js.Array(value :_*))
      
      @scala.inline
      def setDeprecated(value: Boolean): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
      
      @scala.inline
      def setDesc(value: String | `false`): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescUndefined: Self = StObject.set(x, "desc", js.undefined)
      
      @scala.inline
      def setDescribe(value: String | `false`): Self = StObject.set(x, "describe", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescribeUndefined: Self = StObject.set(x, "describe", js.undefined)
      
      @scala.inline
      def setDescription(value: String | `false`): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setHandler(value: /* argv */ Arguments => js.Any): Self = StObject.set(x, "handler", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHandlerUndefined: Self = StObject.set(x, "handler", js.undefined)
      
      @scala.inline
      def setMiddlewares(value: js.Array[Middleware]): Self = StObject.set(x, "middlewares", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMiddlewaresUndefined: Self = StObject.set(x, "middlewares", js.undefined)
      
      @scala.inline
      def setMiddlewaresVarargs(value: Middleware*): Self = StObject.set(x, "middlewares", js.Array(value :_*))
    }
  }
  
  @js.native
  trait CommandInstance extends StObject {
    
    def addDirectory(
      dir: String,
      context: Context,
      req: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeRequireFunction */ js.Any,
      callerFile: String
    ): Unit = js.native
    def addDirectory(
      dir: String,
      context: Context,
      req: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeRequireFunction */ js.Any,
      callerFile: String,
      opts: RequireDirectoryOptions[js.Any, js.Any]
    ): Unit = js.native
    
    def addHandler(handler: CommandHandlerDefinition): Unit = js.native
    @JSName("addHandler")
    def addHandler_false(
      cmd: String | js.Array[String],
      description: js.UndefOr[String | `false`],
      builder: js.UndefOr[CommandBuilderDefinition | CommandBuilder],
      handler: js.UndefOr[CommandHandlerCallback],
      commandMiddleware: js.UndefOr[js.Array[Middleware]],
      deprecated: js.UndefOr[Boolean]
    ): Unit = js.native
    
    def cmdToParseOptions(cmdString: String): Positionals = js.native
    
    def freeze(): Unit = js.native
    
    def getCommandHandlers(): Dictionary[CommandHandler] = js.native
    
    def getCommands(): js.Array[String] = js.native
    
    def hasDefaultCommand(): Boolean = js.native
    
    def reset(): CommandInstance = js.native
    
    def runCommand(command: String, yargs: YargsInstance, parsed: DetailedArguments): Arguments | js.Promise[Arguments] = js.native
    def runCommand(command: String, yargs: YargsInstance, parsed: DetailedArguments, commandIndex: Double): Arguments | js.Promise[Arguments] = js.native
    def runCommand(command: Null, yargs: YargsInstance, parsed: DetailedArguments): Arguments | js.Promise[Arguments] = js.native
    def runCommand(command: Null, yargs: YargsInstance, parsed: DetailedArguments, commandIndex: Double): Arguments | js.Promise[Arguments] = js.native
    
    def runDefaultBuilderOn(yargs: YargsInstance): Unit = js.native
    
    def unfreeze(): Unit = js.native
  }
  
  type FinishCommandHandler = js.Function1[/* handlerResult */ js.Any, js.Any]
  
  /* Inlined parent std.Pick<yargs.yargs/build/lib/yargs.Options, 'alias' | 'array' | 'default'> */
  trait Positionals extends StObject {
    
    var default: js.UndefOr[StringDictionary[js.Any]] = js.undefined
    
    var alias: Dictionary[js.Array[String]]
    
    var array: js.Array[String]
    
    var demand: Dictionary[Boolean]
  }
  object Positionals {
    
    @scala.inline
    def apply(alias: Dictionary[js.Array[String]], array: js.Array[String], demand: Dictionary[Boolean]): Positionals = {
      val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], array = array.asInstanceOf[js.Any], demand = demand.asInstanceOf[js.Any])
      __obj.asInstanceOf[Positionals]
    }
    
    @scala.inline
    implicit class PositionalsMutableBuilder[Self <: Positionals] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlias(value: Dictionary[js.Array[String]]): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArray(value: js.Array[String]): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrayVarargs(value: String*): Self = StObject.set(x, "array", js.Array(value :_*))
      
      @scala.inline
      def setDefault(value: StringDictionary[js.Any]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      @scala.inline
      def setDemand(value: Dictionary[Boolean]): Self = StObject.set(x, "demand", value.asInstanceOf[js.Any])
    }
  }
}
