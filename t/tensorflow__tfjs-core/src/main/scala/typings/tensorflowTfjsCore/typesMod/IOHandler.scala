package typings.tensorflowTfjsCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IOHandler extends StObject {
  
  var load: js.UndefOr[LoadHandler] = js.undefined
  
  var save: js.UndefOr[SaveHandler] = js.undefined
}
object IOHandler {
  
  inline def apply(): IOHandler = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOHandler]
  }
  
  extension [Self <: IOHandler](x: Self) {
    
    inline def setLoad(value: () => js.Promise[ModelArtifacts]): Self = StObject.set(x, "load", js.Any.fromFunction0(value))
    
    inline def setLoadUndefined: Self = StObject.set(x, "load", js.undefined)
    
    inline def setSave(value: /* modelArtifact */ ModelArtifacts => js.Promise[SaveResult]): Self = StObject.set(x, "save", js.Any.fromFunction1(value))
    
    inline def setSaveUndefined: Self = StObject.set(x, "save", js.undefined)
  }
}
