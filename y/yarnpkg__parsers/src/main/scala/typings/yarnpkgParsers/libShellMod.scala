package typings.yarnpkgParsers

import typings.yarnpkgParsers.anon.EndSemicolon
import typings.yarnpkgParsers.anon.IsGlobPattern
import typings.yarnpkgParsers.libGrammarsShellMod.Argument
import typings.yarnpkgParsers.libGrammarsShellMod.ArgumentSegment
import typings.yarnpkgParsers.libGrammarsShellMod.ArithmeticExpression
import typings.yarnpkgParsers.libGrammarsShellMod.Command
import typings.yarnpkgParsers.libGrammarsShellMod.CommandChain
import typings.yarnpkgParsers.libGrammarsShellMod.CommandChainThen
import typings.yarnpkgParsers.libGrammarsShellMod.CommandLine
import typings.yarnpkgParsers.libGrammarsShellMod.CommandLineThen
import typings.yarnpkgParsers.libGrammarsShellMod.EnvSegment
import typings.yarnpkgParsers.libGrammarsShellMod.RedirectArgument
import typings.yarnpkgParsers.libGrammarsShellMod.ShellLine
import typings.yarnpkgParsers.libGrammarsShellMod.ValueArgument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libShellMod {
  
  @JSImport("@yarnpkg/parsers/lib/shell", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseShell(source: String): ShellLine = ^.asInstanceOf[js.Dynamic].applyDynamic("parseShell")(source.asInstanceOf[js.Any]).asInstanceOf[ShellLine]
  inline def parseShell(source: String, options: IsGlobPattern): ShellLine = (^.asInstanceOf[js.Dynamic].applyDynamic("parseShell")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ShellLine]
  
  inline def stringifyArgument(argument: Argument): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringifyArgument")(argument.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def stringifyArgumentSegment(argumentSegment: ArgumentSegment): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringifyArgumentSegment")(argumentSegment.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def stringifyArithmeticExpression(argument: ArithmeticExpression): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringifyArithmeticExpression")(argument.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def stringifyCommand(command: Command): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringifyCommand")(command.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def stringifyCommandChain(commandChain: CommandChain): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringifyCommandChain")(commandChain.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def stringifyCommandChainThen(commandChainThen: CommandChainThen): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringifyCommandChainThen")(commandChainThen.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def stringifyCommandLine(commandLine: CommandLine): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringifyCommandLine")(commandLine.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def stringifyCommandLineThen(commandLineThen: CommandLineThen): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringifyCommandLineThen")(commandLineThen.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def stringifyEnvSegment(envSegment: EnvSegment): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringifyEnvSegment")(envSegment.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def stringifyRedirectArgument(argument: RedirectArgument): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringifyRedirectArgument")(argument.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def stringifyShell(shellLine: ShellLine): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringifyShell")(shellLine.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def stringifyShell(shellLine: ShellLine, param1: EndSemicolon): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringifyShell")(shellLine.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def stringifyShellLine(shellLine: ShellLine): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringifyShellLine")(shellLine.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def stringifyShellLine(shellLine: ShellLine, param1: EndSemicolon): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringifyShellLine")(shellLine.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def stringifyValueArgument(argument: ValueArgument): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringifyValueArgument")(argument.asInstanceOf[js.Any]).asInstanceOf[String]
}
