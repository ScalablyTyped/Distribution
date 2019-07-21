package typings
package terminalDashImageLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("terminal-image", JSImport.Namespace)
@js.native
object terminalDashImageMod extends js.Object {
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
  def buffer(imageBuffer: nodeLib.Buffer): js.Promise[java.lang.String] = js.native
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
  def file(filePath: java.lang.String): js.Promise[java.lang.String] = js.native
}

