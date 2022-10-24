package typings.yarnpkgParsers.anon

import typings.yarnpkgParsers.libGrammarsShellMod.RedirectArgument
import typings.yarnpkgParsers.libGrammarsShellMod.ShellLine
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Subshell
  extends StObject
     with typings.yarnpkgParsers.libGrammarsShellMod.Command {
  
  var args: js.Array[RedirectArgument]
  
  var subshell: ShellLine
  
  var `type`: /* template literal string: subshell */ String
}
object Subshell {
  
  inline def apply(
    args: js.Array[RedirectArgument],
    subshell: ShellLine,
    `type`: /* template literal string: subshell */ String
  ): Subshell = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], subshell = subshell.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Subshell]
  }
  
  extension [Self <: Subshell](x: Self) {
    
    inline def setArgs(value: js.Array[RedirectArgument]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsVarargs(value: RedirectArgument*): Self = StObject.set(x, "args", js.Array(value*))
    
    inline def setSubshell(value: ShellLine): Self = StObject.set(x, "subshell", value.asInstanceOf[js.Any])
    
    inline def setSubshellVarargs(value: Command*): Self = StObject.set(x, "subshell", js.Array(value*))
    
    inline def setType(value: /* template literal string: subshell */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
