package typings.yarnpkgParsers.anon

import typings.yarnpkgParsers.libGrammarsShellMod.Argument
import typings.yarnpkgParsers.libGrammarsShellMod.EnvSegment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Args
  extends StObject
     with typings.yarnpkgParsers.libGrammarsShellMod.Command {
  
  var args: js.Array[Argument]
  
  var envs: js.Array[EnvSegment]
  
  var `type`: /* template literal string: command */ String
}
object Args {
  
  inline def apply(
    args: js.Array[Argument],
    envs: js.Array[EnvSegment],
    `type`: /* template literal string: command */ String
  ): Args = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], envs = envs.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Args]
  }
  
  extension [Self <: Args](x: Self) {
    
    inline def setArgs(value: js.Array[Argument]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsVarargs(value: Argument*): Self = StObject.set(x, "args", js.Array(value*))
    
    inline def setEnvs(value: js.Array[EnvSegment]): Self = StObject.set(x, "envs", value.asInstanceOf[js.Any])
    
    inline def setEnvsVarargs(value: EnvSegment*): Self = StObject.set(x, "envs", js.Array(value*))
    
    inline def setType(value: /* template literal string: command */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
