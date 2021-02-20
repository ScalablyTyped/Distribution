package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobEventConfig extends StObject {
  
  var timeout: String = js.native
}
object JobEventConfig {
  
  @scala.inline
  def apply(timeout: String): JobEventConfig = {
    val __obj = js.Dynamic.literal(timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobEventConfig]
  }
  
  @scala.inline
  implicit class JobEventConfigMutableBuilder[Self <: JobEventConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTimeout(value: String): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
  }
}
