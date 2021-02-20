package typings.throttle

import typings.node.streamMod.Transform
import typings.node.streamMod.TransformOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("throttle", JSImport.Namespace)
  @js.native
  class ^ protected () extends Transform {
    def this(options: Double) = this()
    def this(options: Options) = this()
  }
  
  @js.native
  trait Options extends TransformOptions {
    
    var bps: Double = js.native
    
    var chunkSize: js.UndefOr[Double] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(bps: Double): Options = {
      val __obj = js.Dynamic.literal(bps = bps.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBps(value: Double): Self = StObject.set(x, "bps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChunkSize(value: Double): Self = StObject.set(x, "chunkSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChunkSizeUndefined: Self = StObject.set(x, "chunkSize", js.undefined)
    }
  }
  
  type Throttle = Transform
}
