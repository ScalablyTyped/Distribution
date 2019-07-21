package typings
package writeDashPkgLib.writeDashPkgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("write-pkg", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(data: typeDashFestLib.typeDashFestMod.JsonObject): js.Promise[scala.Unit] = js.native
  def apply(data: typeDashFestLib.typeDashFestMod.JsonObject, options: Options): js.Promise[scala.Unit] = js.native
  /**
  	Write a `package.json` file.
  	Writes atomically and creates directories for you as needed. Sorts dependencies when writing. Preserves the indentation if the file already exists.
  	@param path - Path to where the `package.json` file should be written or its directory.
  	@example
  	```
  	import * as path from 'path';
  	import writePackage = require('write-pkg');
  	(async () => {
  		await writePackage({foo: true});
  		console.log('done');
  		await writePackage(__dirname, {foo: true});
  		console.log('done');
  		await writePackage(path.join('unicorn', 'package.json'), {foo: true});
  		console.log('done');
  	})();
  	```
  	*/
  def apply(path: java.lang.String, data: typeDashFestLib.typeDashFestMod.JsonObject): js.Promise[scala.Unit] = js.native
  def apply(path: java.lang.String, data: typeDashFestLib.typeDashFestMod.JsonObject, options: Options): js.Promise[scala.Unit] = js.native
  def sync(data: typeDashFestLib.typeDashFestMod.JsonObject): scala.Unit = js.native
  def sync(data: typeDashFestLib.typeDashFestMod.JsonObject, options: Options): scala.Unit = js.native
  /**
  	Synchronously write a `package.json` file.
  	Writes atomically and creates directories for you as needed. Sorts dependencies when writing. Preserves the indentation if the file already exists.
  	@param path - Path to where the `package.json` file should be written or its directory.
  	@example
  	```
  	import * as path from 'path';
  	import writePackage = require('write-pkg');
  	writePackage.sync({foo: true});
  	console.log('done');
  	writePackage.sync(__dirname, {foo: true});
  	console.log('done');
  	writePackage.sync(path.join('unicorn', 'package.json'), {foo: true});
  	console.log('done');
  	```
  	*/
  def sync(path: java.lang.String, data: typeDashFestLib.typeDashFestMod.JsonObject): scala.Unit = js.native
  def sync(path: java.lang.String, data: typeDashFestLib.typeDashFestMod.JsonObject, options: Options): scala.Unit = js.native
}

