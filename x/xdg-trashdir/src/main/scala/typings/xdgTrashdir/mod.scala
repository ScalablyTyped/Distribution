package typings.xdgTrashdir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  inline def apply(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Promise[String]]
  inline def apply(filePath: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].apply(filePath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  @JSImport("xdg-trashdir", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  inline def all(): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")().asInstanceOf[js.Promise[js.Array[String]]]
}
