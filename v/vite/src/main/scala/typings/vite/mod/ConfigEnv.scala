package typings.vite.mod

import typings.vite.viteStrings.serve
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigEnv extends StObject {
  
  var command: typings.vite.viteStrings.build | serve
  
  var mode: String
  
  /**
    * @experimental
    */
  var ssrBuild: js.UndefOr[Boolean] = js.undefined
}
object ConfigEnv {
  
  inline def apply(command: typings.vite.viteStrings.build | serve, mode: String): ConfigEnv = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigEnv]
  }
  
  extension [Self <: ConfigEnv](x: Self) {
    
    inline def setCommand(value: typings.vite.viteStrings.build | serve): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setSsrBuild(value: Boolean): Self = StObject.set(x, "ssrBuild", value.asInstanceOf[js.Any])
    
    inline def setSsrBuildUndefined: Self = StObject.set(x, "ssrBuild", js.undefined)
  }
}
