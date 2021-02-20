package typings.terminalLink

import typings.terminalLink.anon.Call
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  	Create a clickable link in the terminal's stdout.
  	[Supported terminals.](https://gist.github.com/egmontkob/eb114294efbcd5adb1944c9f3cb5feda)
  	For unsupported terminals, the link will be printed in parens after the text: `My website (https://sindresorhus.com)`,
  	unless the fallback is disabled by setting the `fallback` option to `false`.
  	@param text - Text to linkify.
  	@param url - URL to link to.
  	@example
  	```
  	import terminalLink = require('terminal-link');
  	const link = terminalLink('My Website', 'https://sindresorhus.com');
  	console.log(link);
  	```
  	*/
  @JSImport("terminal-link", JSImport.Namespace)
  @js.native
  def apply(text: String, url: String): String = js.native
  @JSImport("terminal-link", JSImport.Namespace)
  @js.native
  def apply(text: String, url: String, options: Options): String = js.native
  
  /**
  	Check whether the terminal supports links.
  	Prefer just using the default fallback or the `fallback` option whenever possible.
  	*/
  @JSImport("terminal-link", "isSupported")
  @js.native
  val isSupported: Boolean = js.native
  
  @JSImport("terminal-link", "stderr")
  @js.native
  val stderr: Call = js.native
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
  @JSImport("terminal-link", "stderr")
  @js.native
  def stderr(text: String, url: String): String = js.native
  @JSImport("terminal-link", "stderr")
  @js.native
  def stderr(text: String, url: String, options: Options): String = js.native
  
  @js.native
  trait Options extends StObject {
    
    /**
    		Override the default fallback. If false, the fallback will be disabled.
    		@default `${text} (${url})`
    		*/
    var fallback: js.UndefOr[(js.Function2[/* text */ String, /* url */ String, String]) | Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFallback(value: (js.Function2[/* text */ String, /* url */ String, String]) | Boolean): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFallbackFunction2(value: (/* text */ String, /* url */ String) => String): Self = StObject.set(x, "fallback", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
    }
  }
}
