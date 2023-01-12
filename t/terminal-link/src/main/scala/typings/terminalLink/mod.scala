package typings.terminalLink

import typings.terminalLink.anon.Call
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    /**
    	Create a clickable link in the terminal's stdout.
    	[Supported terminals.](https://gist.github.com/egmontkob/eb114294efbcd5adb1944c9f3cb5feda)
    	For unsupported terminals, the link will be printed in parens after the text: `My website (https://sindresorhus.com)`,
    	unless the fallback is disabled by setting the `fallback` option to `false`.
    	@param text - Text to linkify.
    	@param url - URL to link to.
    	@example
    	```
    	import terminalLink from 'terminal-link';
    	const link = terminalLink('My Website', 'https://sindresorhus.com');
    	console.log(link);
    	```
    	*/
    inline def apply(text: String, url: String): String = (^.asInstanceOf[js.Dynamic].apply(text.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(text: String, url: String, options: Options): String = (^.asInstanceOf[js.Dynamic].apply(text.asInstanceOf[js.Any], url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @JSImport("terminal-link", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
    	Check whether the terminal supports links.
    	Prefer just using the default fallback or the `fallback` option whenever possible.
    	*/
    @JSImport("terminal-link", "default.isSupported")
    @js.native
    val isSupported: Boolean = js.native
    
    @JSImport("terminal-link", "default.stderr")
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
    		import terminalLink from 'terminal-link';
    		const link = terminalLink.stderr('My Website', 'https://sindresorhus.com');
    		console.error(link);
    		```
    		*/
    inline def stderr(text: String, url: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stderr")(text.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def stderr(text: String, url: String, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stderr")(text.asInstanceOf[js.Any], url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  }
  
  trait Options extends StObject {
    
    /**
    	Override the default fallback. If false, the fallback will be disabled.
    	@default `${text} (${url})`
    	*/
    val fallback: js.UndefOr[(js.Function2[/* text */ String, /* url */ String, String]) | Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setFallback(value: (js.Function2[/* text */ String, /* url */ String, String]) | Boolean): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
      
      inline def setFallbackFunction2(value: (/* text */ String, /* url */ String) => String): Self = StObject.set(x, "fallback", js.Any.fromFunction2(value))
      
      inline def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
    }
  }
}
