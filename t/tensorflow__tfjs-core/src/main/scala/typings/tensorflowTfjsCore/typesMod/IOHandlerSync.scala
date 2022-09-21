package typings.tensorflowTfjsCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IOHandlerSync extends StObject {
  
  var load: js.UndefOr[LoadHandlerSync] = js.undefined
  
  var save: js.UndefOr[SaveHandlerSync] = js.undefined
}
object IOHandlerSync {
  
  inline def apply(): IOHandlerSync = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOHandlerSync]
  }
  
  extension [Self <: IOHandlerSync](x: Self) {
    
    inline def setLoad(value: () => ModelArtifacts): Self = StObject.set(x, "load", js.Any.fromFunction0(value))
    
    inline def setLoadUndefined: Self = StObject.set(x, "load", js.undefined)
    
    inline def setSave(value: /* modelArtifact */ ModelArtifacts => SaveResult): Self = StObject.set(x, "save", js.Any.fromFunction1(value))
    
    inline def setSaveUndefined: Self = StObject.set(x, "save", js.undefined)
  }
}
