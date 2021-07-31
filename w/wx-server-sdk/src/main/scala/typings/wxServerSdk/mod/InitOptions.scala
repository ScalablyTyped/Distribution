package typings.wxServerSdk.mod

import typings.wxServerSdk.anon.Database
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InitOptions extends StObject {
  
  var env: String | Database
}
object InitOptions {
  
  @scala.inline
  def apply(env: String | Database): InitOptions = {
    val __obj = js.Dynamic.literal(env = env.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitOptions]
  }
  
  @scala.inline
  implicit class InitOptionsMutableBuilder[Self <: InitOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnv(value: String | Database): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
  }
}
