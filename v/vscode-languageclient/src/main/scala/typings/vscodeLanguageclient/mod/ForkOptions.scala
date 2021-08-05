package typings.vscodeLanguageclient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForkOptions extends StObject {
  
  var cwd: js.UndefOr[String] = js.undefined
  
  var encoding: js.UndefOr[String] = js.undefined
  
  var env: js.UndefOr[js.Any] = js.undefined
  
  var execArgv: js.UndefOr[js.Array[String]] = js.undefined
}
object ForkOptions {
  
  inline def apply(): ForkOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ForkOptions]
  }
  
  extension [Self <: ForkOptions](x: Self) {
    
    inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
    
    inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
    
    inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    inline def setEnv(value: js.Any): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
    
    inline def setExecArgv(value: js.Array[String]): Self = StObject.set(x, "execArgv", value.asInstanceOf[js.Any])
    
    inline def setExecArgvUndefined: Self = StObject.set(x, "execArgv", js.undefined)
    
    inline def setExecArgvVarargs(value: String*): Self = StObject.set(x, "execArgv", js.Array(value :_*))
  }
}
