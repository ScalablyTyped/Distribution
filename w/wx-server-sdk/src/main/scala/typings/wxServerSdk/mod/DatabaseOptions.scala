package typings.wxServerSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatabaseOptions extends StObject {
  
  var env: js.UndefOr[String] = js.undefined
}
object DatabaseOptions {
  
  @scala.inline
  def apply(): DatabaseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatabaseOptions]
  }
  
  @scala.inline
  implicit class DatabaseOptionsMutableBuilder[Self <: DatabaseOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnv(value: String): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
  }
}
