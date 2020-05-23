package typings.widestLine

import typings.widestLine.anon.Call
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("widest-line", JSImport.Namespace)
@js.native
object mod extends js.Object {
  // TODO: remove this in the next major version, refactor definition to:
  // declare function widestLine(input: string): number;
  // export = widestLine;
  @JSName("default")
  var default_Original: Call = js.native
  /**
  	Get the visual width of the widest line in a string - the number of columns required to display it.
  	@example
  	```
  	import widestLine = require('widest-line');
  	widestLine('古\n\\u001B[1m@\\u001B[22m');
  	//=> 2
  	```
  	*/
  def apply(input: String): Double = js.native
  /**
  	Get the visual width of the widest line in a string - the number of columns required to display it.
  	@example
  	```
  	import widestLine = require('widest-line');
  	widestLine('古\n\\u001B[1m@\\u001B[22m');
  	//=> 2
  	```
  	*/
  // TODO: remove this in the next major version, refactor definition to:
  // declare function widestLine(input: string): number;
  // export = widestLine;
  def default(input: String): Double = js.native
}

