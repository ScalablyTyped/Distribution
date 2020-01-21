package typings.writeJsonFile.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("write-json-file", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
  	Stringify and write JSON to a file atomically.
  	Creates directories for you as needed.
  	@example
  	```
  	import writeJsonFile = require('write-json-file');
  	(async () => {
  		await writeJsonFile('foo.json', {foo: true});
  	})();
  	```
  	*/
  def apply(filePath: String, data: js.Any): js.Promise[Unit] = js.native
  def apply(filePath: String, data: js.Any, options: Options): js.Promise[Unit] = js.native
  /**
  	Stringify and write JSON to a file atomically.
  	Creates directories for you as needed.
  	@example
  	```
  	import writeJsonFile = require('write-json-file');
  	writeJsonFile.sync('foo.json', {foo: true});
  	```
  	*/
  def sync(filePath: String, data: js.Any): Unit = js.native
  def sync(filePath: String, data: js.Any, options: Options): Unit = js.native
}

