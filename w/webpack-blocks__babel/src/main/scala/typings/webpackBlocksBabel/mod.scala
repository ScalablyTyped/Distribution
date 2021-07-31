package typings.webpackBlocksBabel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(): js.Any = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Any]
  @scala.inline
  def apply(options: babel): js.Any = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @JSImport("@webpack-blocks/babel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait babel extends StObject {
    
    var cacheDirectory: js.UndefOr[Boolean] = js.undefined
    
    var plugins: js.UndefOr[js.Array[String]] = js.undefined
    
    var presets: js.UndefOr[js.Array[String]] = js.undefined
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
