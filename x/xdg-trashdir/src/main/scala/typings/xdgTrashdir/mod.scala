package typings.xdgTrashdir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  	Get the correct trash path for a file on Linux according to the [spec](http://www.ramendik.ru/docs/trashspec.html)
  	@example
  	```
  	import xdgTrashdir = require('xdg-trashdir');
  	(async () => {
  		console.log(await xdgTrashdir());
  		//=> '/home/johndoe/.local/share/Trash'
  		console.log(await xdgTrashdir('foo.zip'));
  		//=> '/media/johndoe/UUI/.Trash-1000'
  	})();
  	```
  	*/
  @JSImport("xdg-trashdir", JSImport.Namespace)
  @js.native
  def apply(): js.Promise[String] = js.native
  @JSImport("xdg-trashdir", JSImport.Namespace)
  @js.native
  def apply(filePath: String): js.Promise[String] = js.native
  
  /**
  	Get all possible trash paths on Linux according to the [spec](http://www.ramendik.ru/docs/trashspec.html)
  	@example
  	```
  	import xdgTrashdir = require('xdg-trashdir');
  	(async () => {
  		console.log(await xdgTrashdir.all());
  		//=> ['/home/johndoe/.local/share/Trash', '/media/johndoe/UUI/.Trash-1000', …]
  	})();
  	```
  	*/
  @JSImport("xdg-trashdir", "all")
  @js.native
  def all(): js.Promise[js.Array[String]] = js.native
}
