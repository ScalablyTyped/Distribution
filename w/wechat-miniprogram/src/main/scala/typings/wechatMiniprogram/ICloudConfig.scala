package typings.wechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICloudConfig extends StObject {
  
  var env: js.UndefOr[String] = js.native
  
  var traceUser: js.UndefOr[Boolean] = js.native
}
object ICloudConfig {
  
  @scala.inline
  def apply(): ICloudConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICloudConfig]
  }
  
  @scala.inline
  implicit class ICloudConfigMutableBuilder[Self <: ICloudConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnv(value: String): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
    
    @scala.inline
    def setTraceUser(value: Boolean): Self = StObject.set(x, "traceUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTraceUserUndefined: Self = StObject.set(x, "traceUser", js.undefined)
  }
}
