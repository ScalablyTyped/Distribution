package typings.timeDashSpan

import typings.timeDashSpan.timeDashSpanMod.TimeEndFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Default extends js.Object {
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

