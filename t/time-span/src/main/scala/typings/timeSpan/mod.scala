package typings.timeSpan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  Simplified high resolution timing.
  @returns A function that returns the time difference.
  @example
  ```
  import timeSpan = require('time-span');
  const end = timeSpan();
  timeConsumingFn();
  console.log(end());
  //=> 1745.3186
  console.log(end.rounded());
  //=> 1745
  console.log(end.seconds());
  //=> 1.7453186
  ```
  */
  inline def apply(): TimeEndFunction = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[TimeEndFunction]
  
  @JSImport("time-span", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait TimeEndFunction extends StObject {
    
    /**
    		@returns Elapsed milliseconds.
    		*/
    def apply(): Double = js.native
    
    /**
    		@returns Elapsed nanoseconds.
    		*/
    def nanoseconds(): Double = js.native
    
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
