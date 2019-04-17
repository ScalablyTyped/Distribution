package typings
package writeDashJsonDashFileLib.writeDashJsonDashFileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("write-json-file", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  // TODO: Remove this for the next major release
  @JSName("default")
  var default_Original: writeDashJsonDashFileLib.Anon_Data = js.native
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
  def apply(filepath: java.lang.String, data: JSONStringifyable): js.Promise[scala.Unit] = js.native
  def apply(filepath: java.lang.String, data: JSONStringifyable, options: Options): js.Promise[scala.Unit] = js.native
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
  // TODO: Remove this for the next major release
  def default(filepath: java.lang.String, data: JSONStringifyable): js.Promise[scala.Unit] = js.native
  def default(filepath: java.lang.String, data: JSONStringifyable, options: Options): js.Promise[scala.Unit] = js.native
  /**
  	Stringify and write JSON to a file atomically.
  	Creates directories for you as needed.
  	@example
  	```
  	import writeJsonFile = require('write-json-file');
  	writeJsonFile.sync('foo.json', {foo: true});
  	```
  	*/
  def sync(filepath: java.lang.String, data: JSONStringifyable): scala.Unit = js.native
  def sync(filepath: java.lang.String, data: JSONStringifyable, options: Options): scala.Unit = js.native
}

