package typings.trimNewlines

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  	Trim from the start and end of a string.
  	@example
  	```js
  	import trimNewlines = require('trim-newlines');
  	trimNewlines('\n🦄\r\n');
  	//=> '🦄'
  	```
  	*/
  @JSImport("trim-newlines", JSImport.Namespace)
  @js.native
  def apply(string: String): String = js.native
  
  /**
  	Trim from the end of a string.
  	@example
  	```js
  	import trimNewlines = require('trim-newlines');
  	trimNewlines.end('\n🦄\r\n');
  	//=> '\n🦄'
  	```
  	*/
  @JSImport("trim-newlines", "end")
  @js.native
  def end(string: String): String = js.native
  
  /**
  	Trim from the start of a string.
  	@example
  	```js
  	import trimNewlines = require('trim-newlines');
  	trimNewlines.start('\n🦄\r\n');
  	//=> '🦄\r\n'
  	```
  	*/
  @JSImport("trim-newlines", "start")
  @js.native
  def start(string: String): String = js.native
}
