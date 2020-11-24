package typings.xdgTrashdir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xdg-trashdir", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
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
  def apply(): js.Promise[String] = js.native
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
  def all(): js.Promise[js.Array[String]] = js.native
}
