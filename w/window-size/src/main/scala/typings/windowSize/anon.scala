package typings.windowSize

import typings.node.fsMod.WriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait GetWindowSize extends StObject {
    
    var getWindowSize: js.UndefOr[js.Function1[/* out */ WriteStream, js.Tuple2[Double, Double]]] = js.undefined
  }
  object GetWindowSize {
    
    inline def apply(): GetWindowSize = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetWindowSize]
    }
    
    extension [Self <: GetWindowSize](x: Self) {
      
      inline def setGetWindowSize(value: /* out */ WriteStream => js.Tuple2[Double, Double]): Self = StObject.set(x, "getWindowSize", js.Any.fromFunction1(value))
      
      inline def setGetWindowSizeUndefined: Self = StObject.set(x, "getWindowSize", js.undefined)
    }
  }
}
