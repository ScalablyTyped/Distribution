package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobEventConfig extends StObject {
  
  var timeout: String
}
object JobEventConfig {
  
  inline def apply(timeout: String): JobEventConfig = {
    val __obj = js.Dynamic.literal(timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobEventConfig]
  }
  
  extension [Self <: JobEventConfig](x: Self) {
    
    inline def setTimeout(value: String): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
  }
}
