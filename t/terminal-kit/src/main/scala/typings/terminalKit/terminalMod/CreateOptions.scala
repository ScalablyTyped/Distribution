package typings.terminalKit.terminalMod

import typings.node.processMod.global.NodeJS.Process
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateOptions extends StObject {
  
  var appId: String
  
  var appName: String
  
  var generic: js.UndefOr[String] = js.undefined
  
  var isSSH: js.UndefOr[Boolean] = js.undefined
  
  var isTTY: js.UndefOr[Boolean] = js.undefined
  
  var pid: js.UndefOr[js.Any] = js.undefined
  
  var preferProcessSigwinch: js.UndefOr[Boolean] = js.undefined
  
  var processSigwinch: js.UndefOr[Boolean] = js.undefined
  
  var stderr: js.UndefOr[Process] = js.undefined
  
  var stdin: js.UndefOr[Process] = js.undefined
  
  var stdout: js.UndefOr[Process] = js.undefined
}
object CreateOptions {
  
  inline def apply(appId: String, appName: String): CreateOptions = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], appName = appName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateOptions]
  }
  
  extension [Self <: CreateOptions](x: Self) {
    
    inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setAppName(value: String): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
    
    inline def setGeneric(value: String): Self = StObject.set(x, "generic", value.asInstanceOf[js.Any])
    
    inline def setGenericUndefined: Self = StObject.set(x, "generic", js.undefined)
    
    inline def setIsSSH(value: Boolean): Self = StObject.set(x, "isSSH", value.asInstanceOf[js.Any])
    
    inline def setIsSSHUndefined: Self = StObject.set(x, "isSSH", js.undefined)
    
    inline def setIsTTY(value: Boolean): Self = StObject.set(x, "isTTY", value.asInstanceOf[js.Any])
    
    inline def setIsTTYUndefined: Self = StObject.set(x, "isTTY", js.undefined)
    
    inline def setPid(value: js.Any): Self = StObject.set(x, "pid", value.asInstanceOf[js.Any])
    
    inline def setPidUndefined: Self = StObject.set(x, "pid", js.undefined)
    
    inline def setPreferProcessSigwinch(value: Boolean): Self = StObject.set(x, "preferProcessSigwinch", value.asInstanceOf[js.Any])
    
    inline def setPreferProcessSigwinchUndefined: Self = StObject.set(x, "preferProcessSigwinch", js.undefined)
    
    inline def setProcessSigwinch(value: Boolean): Self = StObject.set(x, "processSigwinch", value.asInstanceOf[js.Any])
    
    inline def setProcessSigwinchUndefined: Self = StObject.set(x, "processSigwinch", js.undefined)
    
    inline def setStderr(value: Process): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
    
    inline def setStderrUndefined: Self = StObject.set(x, "stderr", js.undefined)
    
    inline def setStdin(value: Process): Self = StObject.set(x, "stdin", value.asInstanceOf[js.Any])
    
    inline def setStdinUndefined: Self = StObject.set(x, "stdin", js.undefined)
    
    inline def setStdout(value: Process): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
    
    inline def setStdoutUndefined: Self = StObject.set(x, "stdout", js.undefined)
  }
}
