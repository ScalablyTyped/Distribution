package typings
package writeDashJsonDashFileLib.writeDashJsonDashFileMod

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
  def apply(filePath: java.lang.String, data: js.Any): js.Promise[scala.Unit] = js.native
  def apply(filePath: java.lang.String, data: js.Any, options: Options): js.Promise[scala.Unit] = js.native
  /**
  	Stringify and write JSON to a file atomically.
  	Creates directories for you as needed.
  	@example
  	```
  	import writeJsonFile = require('write-json-file');
  	writeJsonFile.sync('foo.json', {foo: true});
  	```
  	*/
  def sync(filePath: java.lang.String, data: js.Any): scala.Unit = js.native
  def sync(filePath: java.lang.String, data: js.Any, options: Options): scala.Unit = js.native
}

