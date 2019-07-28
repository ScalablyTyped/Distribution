package typings.writeDashPkg.writeDashPkgMod

import typings.typeDashFest.typeDashFestMod.JsonObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("write-pkg", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(data: JsonObject): js.Promise[Unit] = js.native
  def apply(data: JsonObject, options: Options): js.Promise[Unit] = js.native
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
  def apply(path: String, data: JsonObject): js.Promise[Unit] = js.native
  def apply(path: String, data: JsonObject, options: Options): js.Promise[Unit] = js.native
  def sync(data: JsonObject): Unit = js.native
  def sync(data: JsonObject, options: Options): Unit = js.native
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
  def sync(path: String, data: JsonObject): Unit = js.native
  def sync(path: String, data: JsonObject, options: Options): Unit = js.native
}

