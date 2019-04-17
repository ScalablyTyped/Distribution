package typings
package writeDashJsonDashFileLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Data extends js.Object {
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
  def apply(
    filepath: java.lang.String,
    data: writeDashJsonDashFileLib.writeDashJsonDashFileMod.JSONStringifyable
  ): js.Promise[scala.Unit] = js.native
  def apply(
    filepath: java.lang.String,
    data: writeDashJsonDashFileLib.writeDashJsonDashFileMod.JSONStringifyable,
    options: writeDashJsonDashFileLib.writeDashJsonDashFileMod.Options
  ): js.Promise[scala.Unit] = js.native
  /**
  	Stringify and write JSON to a file atomically.
  	Creates directories for you as needed.
  	@example
  	```
  	import writeJsonFile = require('write-json-file');
  	writeJsonFile.sync('foo.json', {foo: true});
  	```
  	*/
  def sync(
    filepath: java.lang.String,
    data: writeDashJsonDashFileLib.writeDashJsonDashFileMod.JSONStringifyable
  ): scala.Unit = js.native
  def sync(
    filepath: java.lang.String,
    data: writeDashJsonDashFileLib.writeDashJsonDashFileMod.JSONStringifyable,
    options: writeDashJsonDashFileLib.writeDashJsonDashFileMod.Options
  ): scala.Unit = js.native
}

