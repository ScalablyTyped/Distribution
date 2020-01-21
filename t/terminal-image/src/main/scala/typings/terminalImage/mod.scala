package typings.terminalImage

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("terminal-image", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /**
  	Display images in the terminal.
  	@param imageBuffer - Buffer with the image.
  	@returns The ansi escape codes to display the image.
  	@example
  	```
  	import terminalImage = require('terminal-image');
  	import got = require('got');
  	(async () => {
  		const {body} = await got('sindresorhus.com/unicorn', {encoding: null});
  		console.log(await terminalImage.buffer(body));
  	})();
  	```
  	*/
  def buffer(imageBuffer: Buffer): js.Promise[String] = js.native
  /**
  	Display images in the terminal.
  	@param filePath - File path to the image.
  	@returns The ansi escape codes to display the image.
  	@example
  	```
  	import terminalImage = require('terminal-image');
  	(async () => {
  		console.log(await terminalImage.file('unicorn.jpg'));
  	})();
  	```
  	*/
  def file(filePath: String): js.Promise[String] = js.native
}

