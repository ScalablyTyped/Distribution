package typings.stylelint.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Config extends StObject {
  
  var config: typings.stylelint.mod.Config
}
object Config {
  
  inline def apply(config: typings.stylelint.mod.Config): Config = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
    
    inline def setConfig(value: typings.stylelint.mod.Config): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
  }
}
