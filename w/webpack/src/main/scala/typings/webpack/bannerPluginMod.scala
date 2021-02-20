package typings.webpack

import typings.std.RegExp
import typings.webpack.anon.Basename
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bannerPluginMod {
  
  type BannerFunction = js.Function1[/* data */ Basename, String]
  
  type BannerPluginArgument = BannerPluginOptions | BannerFunction | String
  
  @js.native
  trait BannerPluginOptions extends StObject {
    
    /**
    	 * Specifies the banner
    	 */
    var banner: BannerFunction | String = js.native
    
    /**
    	 * If true, the banner will only be added to the entry chunks
    	 */
    var entryOnly: js.UndefOr[Boolean] = js.native
    
    /**
    	 * Exclude all modules matching any of these conditions
    	 */
    var exclude: js.UndefOr[Rules] = js.native
    
    /**
    	 * Include all modules matching any of these conditions
    	 */
    var include: js.UndefOr[Rules] = js.native
    
    /**
    	 * If true, banner will not be wrapped in a comment
    	 */
    var raw: js.UndefOr[Boolean] = js.native
    
    /**
    	 * Include all modules that pass test assertion
    	 */
    var test: js.UndefOr[Rules] = js.native
  }
  object BannerPluginOptions {
    
    @scala.inline
    def apply(banner: BannerFunction | String): BannerPluginOptions = {
      val __obj = js.Dynamic.literal(banner = banner.asInstanceOf[js.Any])
      __obj.asInstanceOf[BannerPluginOptions]
    }
    
    @scala.inline
    implicit class BannerPluginOptionsMutableBuilder[Self <: BannerPluginOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBanner(value: BannerFunction | String): Self = StObject.set(x, "banner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBannerFunction1(value: /* data */ Basename => String): Self = StObject.set(x, "banner", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEntryOnly(value: Boolean): Self = StObject.set(x, "entryOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntryOnlyUndefined: Self = StObject.set(x, "entryOnly", js.undefined)
      
      @scala.inline
      def setExclude(value: Rules): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      @scala.inline
      def setExcludeVarargs(value: Rule*): Self = StObject.set(x, "exclude", js.Array(value :_*))
      
      @scala.inline
      def setInclude(value: Rules): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      @scala.inline
      def setIncludeVarargs(value: Rule*): Self = StObject.set(x, "include", js.Array(value :_*))
      
      @scala.inline
      def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
      
      @scala.inline
      def setTest(value: Rules): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
      
      @scala.inline
      def setTestVarargs(value: Rule*): Self = StObject.set(x, "test", js.Array(value :_*))
    }
  }
  
  type Rule = RegExp | String
  
  type Rules = js.Array[Rule] | Rule
}
