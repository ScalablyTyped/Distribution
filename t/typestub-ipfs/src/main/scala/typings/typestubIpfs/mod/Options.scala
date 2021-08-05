package typings.typestubIpfs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options extends StObject {
  
  var EXPERIMENTAL: js.UndefOr[js.Any] = js.undefined
  
  var config: js.UndefOr[js.Any] = js.undefined
  
  var init: js.UndefOr[Boolean] = js.undefined
  
  var repo: js.UndefOr[String] = js.undefined
  
  var start: js.UndefOr[Boolean] = js.undefined
}
object Options {
  
  inline def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  extension [Self <: Options](x: Self) {
    
    inline def setConfig(value: js.Any): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setEXPERIMENTAL(value: js.Any): Self = StObject.set(x, "EXPERIMENTAL", value.asInstanceOf[js.Any])
    
    inline def setEXPERIMENTALUndefined: Self = StObject.set(x, "EXPERIMENTAL", js.undefined)
    
    inline def setInit(value: Boolean): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
    
    inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    inline def setRepoUndefined: Self = StObject.set(x, "repo", js.undefined)
    
    inline def setStart(value: Boolean): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
