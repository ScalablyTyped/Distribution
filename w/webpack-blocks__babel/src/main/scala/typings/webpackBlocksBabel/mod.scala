package typings.webpackBlocksBabel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Any = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Any]
  inline def apply(options: babel): Any = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("@webpack-blocks/babel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait babel extends StObject {
    
    var cacheDirectory: js.UndefOr[Boolean] = js.undefined
    
    var plugins: js.UndefOr[js.Array[String]] = js.undefined
    
    var presets: js.UndefOr[js.Array[String]] = js.undefined
  }
  object babel {
    
    inline def apply(): babel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[babel]
    }
    
    extension [Self <: babel](x: Self) {
      
      inline def setCacheDirectory(value: Boolean): Self = StObject.set(x, "cacheDirectory", value.asInstanceOf[js.Any])
      
      inline def setCacheDirectoryUndefined: Self = StObject.set(x, "cacheDirectory", js.undefined)
      
      inline def setPlugins(value: js.Array[String]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setPluginsVarargs(value: String*): Self = StObject.set(x, "plugins", js.Array(value*))
      
      inline def setPresets(value: js.Array[String]): Self = StObject.set(x, "presets", value.asInstanceOf[js.Any])
      
      inline def setPresetsUndefined: Self = StObject.set(x, "presets", js.undefined)
      
      inline def setPresetsVarargs(value: String*): Self = StObject.set(x, "presets", js.Array(value*))
    }
  }
}
