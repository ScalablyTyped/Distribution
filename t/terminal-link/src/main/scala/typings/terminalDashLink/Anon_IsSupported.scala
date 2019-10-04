package typings.terminalDashLink

import typings.terminalDashLink.terminalDashLinkMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_IsSupported extends js.Object {
  /**
  		Check whether the terminal's stderr supports links.
  		Prefer just using the default fallback or the `fallback` option whenever possible.
  		*/
  val isSupported: Boolean = js.native
  /**
  		Create a clickable link in the terminal's stderr.
  		[Supported terminals.](https://gist.github.com/egmontkob/eb114294efbcd5adb1944c9f3cb5feda)
  		For unsupported terminals, the link will be printed in parens after the text: `My website (https://sindresorhus.com)`.
  		@param text - Text to linkify.
  		@param url - URL to link to.
  		@example
  		```
  		import terminalLink = require('terminal-link');
  		const link = terminalLink.stderr('My Website', 'https://sindresorhus.com');
  		console.error(link);
  		```
  		*/
  def apply(text: String, url: String): String = js.native
  def apply(text: String, url: String, options: Options): String = js.native
}

