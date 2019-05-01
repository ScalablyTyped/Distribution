package typings
package trimDashNewlinesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("trim-newlines", JSImport.Namespace)
@js.native
object trimDashNewlinesMod extends js.Object {
  /**
  	Trim from the start and end of a string.
  	@example
  	```js
  	import trimNewlines = require('trim-newlines');
  	trimNewlines('\n🦄\r\n');
  	//=> '🦄'
  	```
  	*/
  def apply(string: java.lang.String): java.lang.String = js.native
  /**
  	Trim from the end of a string.
  	@example
  	```js
  	import trimNewlines = require('trim-newlines');
  	trimNewlines.end('\n🦄\r\n');
  	//=> '\n🦄'
  	```
  	*/
  def end(string: java.lang.String): java.lang.String = js.native
  /**
  	Trim from the start of a string.
  	@example
  	```js
  	import trimNewlines = require('trim-newlines');
  	trimNewlines.start('\n🦄\r\n');
  	//=> '🦄\r\n'
  	```
  	*/
  def start(string: java.lang.String): java.lang.String = js.native
}

