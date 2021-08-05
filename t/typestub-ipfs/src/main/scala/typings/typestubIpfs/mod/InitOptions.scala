package typings.typestubIpfs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InitOptions extends StObject {
  
  var bits: js.UndefOr[Double] = js.undefined
  
  var emptyRepo: js.UndefOr[Boolean] = js.undefined
  
  var log: js.UndefOr[js.Function] = js.undefined
}
object InitOptions {
  
  inline def apply(): InitOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InitOptions]
  }
  
  extension [Self <: InitOptions](x: Self) {
    
    inline def setBits(value: Double): Self = StObject.set(x, "bits", value.asInstanceOf[js.Any])
    
    inline def setBitsUndefined: Self = StObject.set(x, "bits", js.undefined)
    
    inline def setEmptyRepo(value: Boolean): Self = StObject.set(x, "emptyRepo", value.asInstanceOf[js.Any])
    
    inline def setEmptyRepoUndefined: Self = StObject.set(x, "emptyRepo", js.undefined)
    
    inline def setLog(value: js.Function): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
    
    inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
  }
}
