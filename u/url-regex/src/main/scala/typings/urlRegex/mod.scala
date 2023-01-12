package typings.urlRegex

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
  inline def apply(): js.RegExp = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.RegExp]
  inline def apply(options: Options): js.RegExp = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.RegExp]
  
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
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setExact(value: Boolean): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
      
      inline def setExactUndefined: Self = StObject.set(x, "exact", js.undefined)
      
      inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    }
  }
}
