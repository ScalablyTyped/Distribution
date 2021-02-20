package typings.urlRegexSafe

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("url-regex-safe", JSImport.Namespace)
  @js.native
  def apply(): RegExp = js.native
  @JSImport("url-regex-safe", JSImport.Namespace)
  @js.native
  def apply(options: Options): RegExp = js.native
  
  /* Inlined std.Partial<{  exact :boolean,   strict :boolean,   auth :boolean,   localhost :boolean,   parens :boolean,   apostrophes :boolean,   trailingPeriod :boolean,   ipv4 :boolean,   ipv6 :boolean,   tlds :std.Array<string>,   returnString :boolean}> */
  @js.native
  trait Options extends StObject {
    
    var apostrophes: js.UndefOr[Boolean] = js.native
    
    var auth: js.UndefOr[Boolean] = js.native
    
    var exact: js.UndefOr[Boolean] = js.native
    
    var ipv4: js.UndefOr[Boolean] = js.native
    
    var ipv6: js.UndefOr[Boolean] = js.native
    
    var localhost: js.UndefOr[Boolean] = js.native
    
    var parens: js.UndefOr[Boolean] = js.native
    
    var returnString: js.UndefOr[Boolean] = js.native
    
    var strict: js.UndefOr[Boolean] = js.native
    
    var tlds: js.UndefOr[js.Array[String]] = js.native
    
    var trailingPeriod: js.UndefOr[Boolean] = js.native
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
      def setApostrophes(value: Boolean): Self = StObject.set(x, "apostrophes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApostrophesUndefined: Self = StObject.set(x, "apostrophes", js.undefined)
      
      @scala.inline
      def setAuth(value: Boolean): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      @scala.inline
      def setExact(value: Boolean): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExactUndefined: Self = StObject.set(x, "exact", js.undefined)
      
      @scala.inline
      def setIpv4(value: Boolean): Self = StObject.set(x, "ipv4", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpv4Undefined: Self = StObject.set(x, "ipv4", js.undefined)
      
      @scala.inline
      def setIpv6(value: Boolean): Self = StObject.set(x, "ipv6", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpv6Undefined: Self = StObject.set(x, "ipv6", js.undefined)
      
      @scala.inline
      def setLocalhost(value: Boolean): Self = StObject.set(x, "localhost", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalhostUndefined: Self = StObject.set(x, "localhost", js.undefined)
      
      @scala.inline
      def setParens(value: Boolean): Self = StObject.set(x, "parens", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParensUndefined: Self = StObject.set(x, "parens", js.undefined)
      
      @scala.inline
      def setReturnString(value: Boolean): Self = StObject.set(x, "returnString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReturnStringUndefined: Self = StObject.set(x, "returnString", js.undefined)
      
      @scala.inline
      def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
      
      @scala.inline
      def setTlds(value: js.Array[String]): Self = StObject.set(x, "tlds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTldsUndefined: Self = StObject.set(x, "tlds", js.undefined)
      
      @scala.inline
      def setTldsVarargs(value: String*): Self = StObject.set(x, "tlds", js.Array(value :_*))
      
      @scala.inline
      def setTrailingPeriod(value: Boolean): Self = StObject.set(x, "trailingPeriod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrailingPeriodUndefined: Self = StObject.set(x, "trailingPeriod", js.undefined)
    }
  }
}
