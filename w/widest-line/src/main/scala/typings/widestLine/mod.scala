package typings.widestLine

import typings.widestLine.anon.Call
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  	Get the visual width of the widest line in a string - the number of columns required to display it.
  	@example
  	```
  	import widestLine = require('widest-line');
  	widestLine('古\n\\u001B[1m@\\u001B[22m');
  	//=> 2
  	```
  	*/
  @JSImport("widest-line", JSImport.Namespace)
  @js.native
  def apply(input: String): Double = js.native
  
  @JSImport("widest-line", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // TODO: remove this in the next major version, refactor definition to:
  // declare function widestLine(input: string): number;
  // export = widestLine;
  @JSImport("widest-line", "default")
  @js.native
  def default: Call = js.native
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
  @JSImport("widest-line", "default")
  @js.native
  def default(input: String): Double = js.native
  @scala.inline
  def default_=(x: Call): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
}
