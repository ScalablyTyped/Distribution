package typings.throttle

import typings.node.streamMod.Transform
import typings.node.streamMod.TransformOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("throttle", JSImport.Namespace)
  @js.native
  class ^ protected () extends Transform {
    def this(options: Double) = this()
    def this(options: Options) = this()
  }
  
  trait Options
    extends StObject
       with TransformOptions {
    
    var bps: Double
    
    var chunkSize: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(bps: Double): Options = {
      val __obj = js.Dynamic.literal(bps = bps.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setBps(value: Double): Self = StObject.set(x, "bps", value.asInstanceOf[js.Any])
      
      inline def setChunkSize(value: Double): Self = StObject.set(x, "chunkSize", value.asInstanceOf[js.Any])
      
      inline def setChunkSizeUndefined: Self = StObject.set(x, "chunkSize", js.undefined)
    }
  }
  
  type Throttle = Transform
}
