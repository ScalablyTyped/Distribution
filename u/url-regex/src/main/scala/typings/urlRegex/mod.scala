package typings.urlRegex

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  Regular expression for matching URLs.
  @example
  ```
  import urlRegex = require('url-regex');
  urlRegex().test('http://github.com foo bar');
  //=> true
  urlRegex().test('www.github.com foo bar');
  //=> true
  urlRegex({exact: true}).test('http://github.com foo bar');
  //=> false
  urlRegex({exact: true}).test('http://github.com');
  //=> true
  urlRegex({strict: false}).test('github.com foo bar');
  //=> true
  urlRegex({exact: true, strict: false}).test('github.com');
  //=> true
  'foo http://github.com bar //google.com'.match(urlRegex());
  //=> ['http://github.com', '//google.com']
  ```
  */
  @scala.inline
  def apply(): RegExp = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[RegExp]
  @scala.inline
  def apply(options: Options): RegExp = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[RegExp]
  
  @JSImport("url-regex", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    /**
    		Only match an exact string. Useful with `RegExp#test` to check if a string is a URL.
    		@default false
    		*/
    val exact: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Force URLs to start with a valid protocol or `www`. If set to `false` it'll match the TLD against a list of valid [TLDs](https://github.com/stephenmathieson/node-tlds).
    		@default true
    		*/
    val strict: js.UndefOr[Boolean] = js.undefined
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
      def setExact(value: Boolean): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExactUndefined: Self = StObject.set(x, "exact", js.undefined)
      
      @scala.inline
      def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    }
  }
}
