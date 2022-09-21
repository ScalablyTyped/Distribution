package typings.timeSpan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("time-span", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): TimeEndFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[TimeEndFunction]
  
  @js.native
  trait TimeEndFunction extends StObject {
    
    /**
    	@returns Elapsed milliseconds.
    	*/
    def apply(): Double = js.native
    
    /**
    	@returns Elapsed nanoseconds.
    	*/
    def nanoseconds(): js.BigInt = js.native
    
    /**
    	@returns Elapsed milliseconds rounded.
    	*/
    def rounded(): Double = js.native
    
    /**
    	@returns Elapsed seconds.
    	*/
    def seconds(): Double = js.native
  }
}
