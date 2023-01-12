package typings.yarnpkgParsers.anon

import typings.yarnpkgParsers.libGrammarsShellMod.EnvSegment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Envs
  extends StObject
     with typings.yarnpkgParsers.libGrammarsShellMod.Command {
  
  var envs: js.Array[EnvSegment]
  
  var `type`: /* template literal string: envs */ String
}
object Envs {
  
  inline def apply(envs: js.Array[EnvSegment], `type`: /* template literal string: envs */ String): Envs = {
    val __obj = js.Dynamic.literal(envs = envs.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Envs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Envs] (val x: Self) extends AnyVal {
    
    inline def setEnvs(value: js.Array[EnvSegment]): Self = StObject.set(x, "envs", value.asInstanceOf[js.Any])
    
    inline def setEnvsVarargs(value: EnvSegment*): Self = StObject.set(x, "envs", js.Array(value*))
    
    inline def setType(value: /* template literal string: envs */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
