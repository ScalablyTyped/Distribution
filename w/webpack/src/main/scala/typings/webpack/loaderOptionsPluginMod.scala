package typings.webpack

import org.scalablytyped.runtime.StringDictionary
import typings.webpack.anon.Dictk
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loaderOptionsPluginMod {
  
  trait LoaderOptionsPluginOptions
    extends StObject
       with /* k */ StringDictionary[js.Any] {
    
    /**
    	 * Whether loaders should be in debug mode or not. debug will be removed as of webpack 3
    	 */
    var debug: js.UndefOr[Boolean] = js.undefined
    
    /**
    	 * Where loaders can be switched to minimize mode
    	 */
    var minimize: js.UndefOr[Boolean] = js.undefined
    
    /**
    	 * A configuration object that can be used to configure older loaders
    	 */
    var options: js.UndefOr[Dictk] = js.undefined
  }
  object LoaderOptionsPluginOptions {
    
    @scala.inline
    def apply(): LoaderOptionsPluginOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoaderOptionsPluginOptions]
    }
    
    @scala.inline
    implicit class LoaderOptionsPluginOptionsMutableBuilder[Self <: LoaderOptionsPluginOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setMinimize(value: Boolean): Self = StObject.set(x, "minimize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinimizeUndefined: Self = StObject.set(x, "minimize", js.undefined)
      
      @scala.inline
      def setOptions(value: Dictk): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
}
