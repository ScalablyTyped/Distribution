package typings.trimNewlines

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  @scala.inline
  def apply(string: String): String = ^.asInstanceOf[js.Dynamic].apply(string.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("trim-newlines", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
  	Trim from the end of a string.
  	@example
  	```js
  	import trimNewlines = require('trim-newlines');
  	trimNewlines.end('\n🦄\r\n');
  	//=> '\n🦄'
  	```
  	*/
  @scala.inline
  def end(string: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("end")(string.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
  	Trim from the start of a string.
  	@example
  	```js
  	import trimNewlines = require('trim-newlines');
  	trimNewlines.start('\n🦄\r\n');
  	//=> '🦄\r\n'
  	```
  	*/
  @scala.inline
  def start(string: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("start")(string.asInstanceOf[js.Any]).asInstanceOf[String]
}
