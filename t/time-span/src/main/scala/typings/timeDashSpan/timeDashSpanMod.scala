package typings.timeDashSpan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("time-span", JSImport.Namespace)
@js.native
object timeDashSpanMod extends js.Object {
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
  
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function timeSpan(): timeSpan.TimeEndFunction;
  // export = timeSpan;
  var default: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof timeSpan */ js.Any = js.native
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

