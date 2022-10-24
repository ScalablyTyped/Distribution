package typings.yarnpkgParsers.anon

import typings.yarnpkgParsers.libGrammarsShellMod.RedirectArgument
import typings.yarnpkgParsers.libGrammarsShellMod.ShellLine
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Group
  extends StObject
     with typings.yarnpkgParsers.libGrammarsShellMod.Command {
  
  var args: js.Array[RedirectArgument]
  
  var group: ShellLine
  
  var `type`: /* template literal string: group */ String
}
object Group {
  
  inline def apply(
    args: js.Array[RedirectArgument],
    group: ShellLine,
    `type`: /* template literal string: group */ String
  ): Group = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Group]
  }
  
  extension [Self <: Group](x: Self) {
    
    inline def setArgs(value: js.Array[RedirectArgument]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsVarargs(value: RedirectArgument*): Self = StObject.set(x, "args", js.Array(value*))
    
    inline def setGroup(value: ShellLine): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupVarargs(value: Command*): Self = StObject.set(x, "group", js.Array(value*))
    
    inline def setType(value: /* template literal string: group */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
