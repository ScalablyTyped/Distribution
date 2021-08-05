package typings.typedoc

import typings.typedoc.componentsMod.ConverterComponent
import typings.typedoc.converterConverterMod.Converter
import typings.typedoc.modelsMod.Reflection
import typings.typedoc.reflectionCategoryMod.ReflectionCategory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object categoryPluginMod {
  
  @JSImport("typedoc/dist/lib/converter/plugins/CategoryPlugin", "CategoryPlugin")
  @js.native
  class CategoryPlugin protected () extends ConverterComponent {
    def this(owner: js.Symbol) = this()
    def this(owner: Converter) = this()
    
    /* private */ var categorize: js.Any = js.native
    
    var categorizeByGroup: Boolean = js.native
    
    var categoryOrder: js.Array[String] = js.native
    
    var defaultCategory: String = js.native
    
    /* private */ var groupCategorize: js.Any = js.native
    
    /* private */ var lumpCategorize: js.Any = js.native
    
    /* private */ var onBegin: js.Any = js.native
    
    /* private */ var onEndResolve: js.Any = js.native
    
    /* private */ var onResolve: js.Any = js.native
  }
  /* static members */
  object CategoryPlugin {
    
    @JSImport("typedoc/dist/lib/converter/plugins/CategoryPlugin", "CategoryPlugin")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("typedoc/dist/lib/converter/plugins/CategoryPlugin", "CategoryPlugin.WEIGHTS")
    @js.native
    def WEIGHTS: js.Array[String] = js.native
    inline def WEIGHTS_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WEIGHTS")(x.asInstanceOf[js.Any])
    
    @JSImport("typedoc/dist/lib/converter/plugins/CategoryPlugin", "CategoryPlugin.defaultCategory")
    @js.native
    def defaultCategory: String = js.native
    inline def defaultCategory_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultCategory")(x.asInstanceOf[js.Any])
    
    inline def getCategory(reflection: Reflection): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCategory")(reflection.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def getReflectionCategories(reflections: js.Array[Reflection]): js.Array[ReflectionCategory] = ^.asInstanceOf[js.Dynamic].applyDynamic("getReflectionCategories")(reflections.asInstanceOf[js.Any]).asInstanceOf[js.Array[ReflectionCategory]]
    
    inline def sortCatCallback(a: ReflectionCategory, b: ReflectionCategory): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sortCatCallback")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
}
