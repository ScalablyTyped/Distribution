package typings.yarnpkgParsers

import typings.yarnpkgParsers.anon.IsGlobPattern
import typings.yarnpkgParsers.anon.Then
import typings.yarnpkgParsers.yarnpkgParsersStrings.GreaterthansignAmpersand
import typings.yarnpkgParsers.yarnpkgParsersStrings.LessthansignAmpersand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGrammarsShellMod {
  
  @JSImport("@yarnpkg/parsers/lib/grammars/shell", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parse(code: String, options: IsGlobPattern): ShellLine = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(code.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ShellLine]
  
  /* Rewritten from type alias, can be one of: 
    - typings.yarnpkgParsers.libGrammarsShellMod.RedirectArgument
    - typings.yarnpkgParsers.libGrammarsShellMod.ValueArgument
  */
  trait Argument extends StObject
  object Argument {
    
    inline def RedirectArgument(
      args: js.Array[ValueArgument],
      subtype: (/* template literal string: > */ String) | GreaterthansignAmpersand | LessthansignAmpersand,
      `type`: /* template literal string: redirection */ String
    ): typings.yarnpkgParsers.libGrammarsShellMod.RedirectArgument = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], subtype = subtype.asInstanceOf[js.Any], fd = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.yarnpkgParsers.libGrammarsShellMod.RedirectArgument]
    }
    
    inline def ValueArgument(segments: js.Array[ArgumentSegment], `type`: /* template literal string: argument */ String): typings.yarnpkgParsers.libGrammarsShellMod.ValueArgument = {
      val __obj = js.Dynamic.literal(segments = segments.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.yarnpkgParsers.libGrammarsShellMod.ValueArgument]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.yarnpkgParsers.anon.Text
    - typings.yarnpkgParsers.anon.Pattern
    - typings.yarnpkgParsers.anon.Quoted
    - typings.yarnpkgParsers.anon.AlternativeValue
    - typings.yarnpkgParsers.anon.Arithmetic
  */
  trait ArgumentSegment extends StObject
  object ArgumentSegment {
    
    inline def AlternativeValue(name: String, quoted: Boolean, `type`: /* template literal string: variable */ String): typings.yarnpkgParsers.anon.AlternativeValue = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], quoted = quoted.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.yarnpkgParsers.anon.AlternativeValue]
    }
    
    inline def Arithmetic(arithmetic: ArithmeticExpression, `type`: /* template literal string: arithmetic */ String): typings.yarnpkgParsers.anon.Arithmetic = {
      val __obj = js.Dynamic.literal(arithmetic = arithmetic.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.yarnpkgParsers.anon.Arithmetic]
    }
    
    inline def Pattern(pattern: String, `type`: /* template literal string: glob */ String): typings.yarnpkgParsers.anon.Pattern = {
      val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.yarnpkgParsers.anon.Pattern]
    }
    
    inline def Quoted(quoted: Boolean, shell: ShellLine, `type`: /* template literal string: shell */ String): typings.yarnpkgParsers.anon.Quoted = {
      val __obj = js.Dynamic.literal(quoted = quoted.asInstanceOf[js.Any], shell = shell.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.yarnpkgParsers.anon.Quoted]
    }
    
    inline def Text(text: String, `type`: /* template literal string: text */ String): typings.yarnpkgParsers.anon.Text = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.yarnpkgParsers.anon.Text]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.yarnpkgParsers.libGrammarsShellMod.ArithmeticPrimary
    - typings.yarnpkgParsers.libGrammarsShellMod.ArithmeticOperatorExpression
  */
  trait ArithmeticExpression extends StObject
  object ArithmeticExpression {
    
    inline def ArithmeticOperatorExpression(
      left: ArithmeticExpression,
      right: ArithmeticExpression,
      `type`: /* template literal string: multiplication */ String
    ): typings.yarnpkgParsers.libGrammarsShellMod.ArithmeticOperatorExpression = {
      val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.yarnpkgParsers.libGrammarsShellMod.ArithmeticOperatorExpression]
    }
    
    inline def Name(name: String, `type`: /* template literal string: variable */ String): typings.yarnpkgParsers.anon.Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.yarnpkgParsers.anon.Name]
    }
    
    inline def Type(`type`: /* template literal string: number */ String, value: Double): typings.yarnpkgParsers.anon.Type = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.yarnpkgParsers.anon.Type]
    }
  }
  
  trait ArithmeticOperatorExpression
    extends StObject
       with ArithmeticExpression {
    
    var left: ArithmeticExpression
    
    var right: ArithmeticExpression
    
    var `type`: /* template literal string: multiplication */ String
  }
  object ArithmeticOperatorExpression {
    
    inline def apply(
      left: ArithmeticExpression,
      right: ArithmeticExpression,
      `type`: /* template literal string: multiplication */ String
    ): ArithmeticOperatorExpression = {
      val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArithmeticOperatorExpression]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ArithmeticOperatorExpression] (val x: Self) extends AnyVal {
      
      inline def setLeft(value: ArithmeticExpression): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: ArithmeticExpression): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setType(value: /* template literal string: multiplication */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.yarnpkgParsers.anon.Type
    - typings.yarnpkgParsers.anon.Name
  */
  trait ArithmeticPrimary
    extends StObject
       with ArithmeticExpression
  object ArithmeticPrimary {
    
    inline def Name(name: String, `type`: /* template literal string: variable */ String): typings.yarnpkgParsers.anon.Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.yarnpkgParsers.anon.Name]
    }
    
    inline def Type(`type`: /* template literal string: number */ String, value: Double): typings.yarnpkgParsers.anon.Type = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.yarnpkgParsers.anon.Type]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.yarnpkgParsers.anon.Args
    - typings.yarnpkgParsers.anon.Subshell
    - typings.yarnpkgParsers.anon.Group
    - typings.yarnpkgParsers.anon.Envs
  */
  trait Command extends StObject
  object Command {
    
    inline def Args(
      args: js.Array[Argument],
      envs: js.Array[EnvSegment],
      `type`: /* template literal string: command */ String
    ): typings.yarnpkgParsers.anon.Args = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], envs = envs.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.yarnpkgParsers.anon.Args]
    }
    
    inline def Envs(envs: js.Array[EnvSegment], `type`: /* template literal string: envs */ String): typings.yarnpkgParsers.anon.Envs = {
      val __obj = js.Dynamic.literal(envs = envs.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.yarnpkgParsers.anon.Envs]
    }
    
    inline def Group(
      args: js.Array[RedirectArgument],
      group: ShellLine,
      `type`: /* template literal string: group */ String
    ): typings.yarnpkgParsers.anon.Group = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.yarnpkgParsers.anon.Group]
    }
    
    inline def Subshell(
      args: js.Array[RedirectArgument],
      subshell: ShellLine,
      `type`: /* template literal string: subshell */ String
    ): typings.yarnpkgParsers.anon.Subshell = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], subshell = subshell.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.yarnpkgParsers.anon.Subshell]
    }
  }
  
  type CommandChain = Command & Then
  
  trait CommandChainThen extends StObject {
    
    var chain: CommandChain
    
    var `type`: /* template literal string: |& */ String
  }
  object CommandChainThen {
    
    inline def apply(chain: CommandChain, `type`: /* template literal string: |& */ String): CommandChainThen = {
      val __obj = js.Dynamic.literal(chain = chain.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommandChainThen]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CommandChainThen] (val x: Self) extends AnyVal {
      
      inline def setChain(value: CommandChain): Self = StObject.set(x, "chain", value.asInstanceOf[js.Any])
      
      inline def setType(value: /* template literal string: |& */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait CommandLine extends StObject {
    
    var chain: CommandChain
    
    var `then`: js.UndefOr[CommandLineThen] = js.undefined
  }
  object CommandLine {
    
    inline def apply(chain: CommandChain): CommandLine = {
      val __obj = js.Dynamic.literal(chain = chain.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommandLine]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CommandLine] (val x: Self) extends AnyVal {
      
      inline def setChain(value: CommandChain): Self = StObject.set(x, "chain", value.asInstanceOf[js.Any])
      
      inline def setThen(value: CommandLineThen): Self = StObject.set(x, "then", value.asInstanceOf[js.Any])
      
      inline def setThenUndefined: Self = StObject.set(x, "then", js.undefined)
    }
  }
  
  trait CommandLineThen extends StObject {
    
    var line: CommandLine
    
    var `type`: /* template literal string: && */ String
  }
  object CommandLineThen {
    
    inline def apply(line: CommandLine, `type`: /* template literal string: && */ String): CommandLineThen = {
      val __obj = js.Dynamic.literal(line = line.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommandLineThen]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CommandLineThen] (val x: Self) extends AnyVal {
      
      inline def setLine(value: CommandLine): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setType(value: /* template literal string: && */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait EnvSegment extends StObject {
    
    var args: js.Array[Any | ValueArgument]
    
    var name: String
  }
  object EnvSegment {
    
    inline def apply(args: js.Array[Any | ValueArgument], name: String): EnvSegment = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[EnvSegment]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EnvSegment] (val x: Self) extends AnyVal {
      
      inline def setArgs(value: js.Array[Any | ValueArgument]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsVarargs(value: (Any | ValueArgument)*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait RedirectArgument
    extends StObject
       with Argument {
    
    var args: js.Array[ValueArgument]
    
    var fd: Double | Null
    
    var subtype: (/* template literal string: > */ String) | GreaterthansignAmpersand | LessthansignAmpersand
    
    var `type`: /* template literal string: redirection */ String
  }
  object RedirectArgument {
    
    inline def apply(
      args: js.Array[ValueArgument],
      subtype: (/* template literal string: > */ String) | GreaterthansignAmpersand | LessthansignAmpersand,
      `type`: /* template literal string: redirection */ String
    ): RedirectArgument = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], subtype = subtype.asInstanceOf[js.Any], fd = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RedirectArgument]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RedirectArgument] (val x: Self) extends AnyVal {
      
      inline def setArgs(value: js.Array[ValueArgument]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsVarargs(value: ValueArgument*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setFd(value: Double): Self = StObject.set(x, "fd", value.asInstanceOf[js.Any])
      
      inline def setFdNull: Self = StObject.set(x, "fd", null)
      
      inline def setSubtype(
        value: (/* template literal string: > */ String) | GreaterthansignAmpersand | LessthansignAmpersand
      ): Self = StObject.set(x, "subtype", value.asInstanceOf[js.Any])
      
      inline def setType(value: /* template literal string: redirection */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type ShellLine = js.Array[typings.yarnpkgParsers.anon.Command]
  
  trait ValueArgument
    extends StObject
       with Argument {
    
    var segments: js.Array[ArgumentSegment]
    
    var `type`: /* template literal string: argument */ String
  }
  object ValueArgument {
    
    inline def apply(segments: js.Array[ArgumentSegment], `type`: /* template literal string: argument */ String): ValueArgument = {
      val __obj = js.Dynamic.literal(segments = segments.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValueArgument]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ValueArgument] (val x: Self) extends AnyVal {
      
      inline def setSegments(value: js.Array[ArgumentSegment]): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
      
      inline def setSegmentsVarargs(value: ArgumentSegment*): Self = StObject.set(x, "segments", js.Array(value*))
      
      inline def setType(value: /* template literal string: argument */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
