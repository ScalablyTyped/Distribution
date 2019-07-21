package typings
package terminalDashLinkLib.terminalDashLinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("terminal-link", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  // TODO: Remove this for the next major release
  @JSName("default")
  var default_Original: terminalDashLinkLib.Anon_Default = js.native
  /**
  	Check whether the terminal support links.
  	Prefer just using the default fallback or the `fallback` option whenever possible.
  	*/
  val isSupported: scala.Boolean = js.native
  /**
  	Create a clickable link in the terminal.
  	[Supported terminals.](https://gist.github.com/egmontkob/eb114294efbcd5adb1944c9f3cb5feda)
  	For unsupported terminals, the link will be printed in parens after the text: `My website (https://sindresorhus.com)`.
  	@param text - Text to linkify.
  	@param url - URL to link to.
  	@example
  	```
  	import terminalLink = require('terminal-link');
  	const link = terminalLink('My Website', 'https://sindresorhus.com');
  	console.log(link);
  	```
  	*/
  def apply(text: java.lang.String, url: java.lang.String): java.lang.String = js.native
  def apply(text: java.lang.String, url: java.lang.String, options: Options): java.lang.String = js.native
  /**
  	Create a clickable link in the terminal.
  	[Supported terminals.](https://gist.github.com/egmontkob/eb114294efbcd5adb1944c9f3cb5feda)
  	For unsupported terminals, the link will be printed in parens after the text: `My website (https://sindresorhus.com)`.
  	@param text - Text to linkify.
  	@param url - URL to link to.
  	@example
  	```
  	import terminalLink = require('terminal-link');
  	const link = terminalLink('My Website', 'https://sindresorhus.com');
  	console.log(link);
  	```
  	*/
  // TODO: Remove this for the next major release
  def default(text: java.lang.String, url: java.lang.String): java.lang.String = js.native
  def default(text: java.lang.String, url: java.lang.String, options: Options): java.lang.String = js.native
}

