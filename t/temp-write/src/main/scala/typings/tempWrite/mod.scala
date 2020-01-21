package typings.tempWrite

import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("temp-write", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /**
  	Write string/buffer/stream to a random temp file.
  	@param fileContent - Data to write to the temp file.
  	@param filePath - Optionally supply a file path which is appended to the random path. Example: `'img.png'` `'foo/bar/baz.png'`.
  	@returns The file path of the temp file.
  	@example
  	```
  	import {promisify} from 'util';
  	import * as fs from 'fs';
  	import tempWrite = require('temp-write');
  	(async () => {
  		const filePath = await tempWrite('unicorn');
  		//=> '/var/folders/_1/tk89k8215ts0rg0kmb096nj80000gn/T/4049f192-43e7-43b2-98d9-094e6760861b'
  		await promisify(fs.readFile(filePath, 'utf8'));
  		//=> 'unicorn'
  		await tempWrite('unicorn', 'pony.png');
  		//=> '/var/folders/_1/tk89k8215ts0rg0kmb096nj80000gn/T/4049f192-43e7-43b2-98d9-094e6760861b/pony.png'
  		await tempWrite('unicorn', 'rainbow/cake/pony.png');
  		//=> '/var/folders/_1/tk89k8215ts0rg0kmb096nj80000gn/T/4049f192-43e7-43b2-98d9-094e6760861b/rainbow/cake/pony.png'
  	})();
  	```
  	*/
  def apply(fileContent: String): js.Promise[String] = js.native
  def apply(fileContent: String, filePath: String): js.Promise[String] = js.native
  def apply(fileContent: Buffer): js.Promise[String] = js.native
  def apply(fileContent: Buffer, filePath: String): js.Promise[String] = js.native
  def apply(fileContent: ReadableStream): js.Promise[String] = js.native
  def apply(fileContent: ReadableStream, filePath: String): js.Promise[String] = js.native
  /**
  	Synchronously write string/buffer/stream to a random temp file.
  	@param fileContent - Data to write to the temp file.
  	@param filePath - Optionally supply a file path which is appended to the random path. Example: `'img.png'` `'foo/bar/baz.png'`.
  	@returns The file path of the temp file.
  	@example
  	```
  	import * as fs from 'fs';
  	import tempWrite = require('temp-write');
  	const filePath = tempWrite.sync('unicorn');
  	//=> '/var/folders/_1/tk89k8215ts0rg0kmb096nj80000gn/T/4049f192-43e7-43b2-98d9-094e6760861b'
  	fs.readFileSync(filePath, 'utf8');
  	//=> 'unicorn'
  	tempWrite.sync('unicorn', 'pony.png');
  	//=> '/var/folders/_1/tk89k8215ts0rg0kmb096nj80000gn/T/4049f192-43e7-43b2-98d9-094e6760861b/pony.png'
  	tempWrite.sync('unicorn', 'rainbow/cake/pony.png');
  	//=> '/var/folders/_1/tk89k8215ts0rg0kmb096nj80000gn/T/4049f192-43e7-43b2-98d9-094e6760861b/rainbow/cake/pony.png'
  	```
  	*/
  def sync(fileContent: String): String = js.native
  def sync(fileContent: String, filePath: String): String = js.native
  def sync(fileContent: Buffer): String = js.native
  def sync(fileContent: Buffer, filePath: String): String = js.native
}

