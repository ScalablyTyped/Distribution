package typings.webpackBlocksBabel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@webpack-blocks/babel", JSImport.Namespace)
  @js.native
  def apply(): js.Any = js.native
  @JSImport("@webpack-blocks/babel", JSImport.Namespace)
  @js.native
  def apply(options: babel): js.Any = js.native
  
  @js.native
  trait babel extends StObject {
    
    var cacheDirectory: js.UndefOr[Boolean] = js.native
    
    var plugins: js.UndefOr[js.Array[String]] = js.native
    
    var presets: js.UndefOr[js.Array[String]] = js.native
  }
  object babel {
    
    @scala.inline
    def apply(): babel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[babel]
    }
    
    @scala.inline
    implicit class babelMutableBuilder[Self <: babel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCacheDirectory(value: Boolean): Self = StObject.set(x, "cacheDirectory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheDirectoryUndefined: Self = StObject.set(x, "cacheDirectory", js.undefined)
      
      @scala.inline
      def setPlugins(value: js.Array[String]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      @scala.inline
      def setPluginsVarargs(value: String*): Self = StObject.set(x, "plugins", js.Array(value :_*))
      
      @scala.inline
      def setPresets(value: js.Array[String]): Self = StObject.set(x, "presets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPresetsUndefined: Self = StObject.set(x, "presets", js.undefined)
      
      @scala.inline
      def setPresetsVarargs(value: String*): Self = StObject.set(x, "presets", js.Array(value :_*))
    }
  }
}
