package typings.timeSpan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("time-span", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  trait TimeEndFunction extends js.Object {
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
  def apply(): TimeEndFunction = js.native
}

