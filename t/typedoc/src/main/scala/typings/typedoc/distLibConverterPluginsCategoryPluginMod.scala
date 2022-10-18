package typings.typedoc

import typings.std.Record
import typings.std.Set
import typings.typedoc.distLibConverterComponentsMod.ConverterComponent
import typings.typedoc.distLibConverterConverterMod.Converter
import typings.typedoc.distLibModelsMod.DeclarationReflection
import typings.typedoc.distLibModelsMod.ReflectionCategory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibConverterPluginsCategoryPluginMod {
  
  @JSImport("typedoc/dist/lib/converter/plugins/CategoryPlugin", "CategoryPlugin")
  @js.native
  open class CategoryPlugin protected () extends ConverterComponent {
    /**
      * Create new Component instance.
      */
    def this(owner: Converter) = this()
    
    var boosts: Record[String, Double] = js.native
    
    /* private */ var categorize: Any = js.native
    
    var categorizeByGroup: Boolean = js.native
    
    var categoryOrder: js.Array[String] = js.native
    
    var defaultCategory: String = js.native
    
    /**
      * Return the category of a given reflection.
      *
      * @param reflection The reflection.
      * @returns The category the reflection belongs to
      *
      * @privateRemarks
      * If you change this, also update getGroups in GroupPlugin accordingly.
      */
    def getCategories(reflection: DeclarationReflection): Set[String] = js.native
    
    /**
      * Create a categorized representation of the given list of reflections.
      *
      * @param reflections  The reflections that should be categorized.
      * @param categorySearchBoosts A user-supplied map of category titles, for computing a
      *   relevance boost to be used when searching
      * @returns An array containing all children of the given reflection categorized
      */
    def getReflectionCategories(reflections: js.Array[DeclarationReflection]): js.Array[ReflectionCategory] = js.native
    
    /* private */ var groupCategorize: Any = js.native
    
    /* private */ var lumpCategorize: Any = js.native
    
    /**
      * Triggered when the converter begins converting a project.
      */
    /* private */ var onBegin: Any = js.native
    
    /**
      * Triggered when the converter has finished resolving a project.
      *
      * @param context  The context object describing the current state the converter is in.
      */
    /* private */ var onEndResolve: Any = js.native
    
    /**
      * Triggered when the converter resolves a reflection.
      *
      * @param context  The context object describing the current state the converter is in.
      * @param reflection  The reflection that is currently resolved.
      */
    /* private */ var onResolve: Any = js.native
    
    var usedBoosts: Set[String] = js.native
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
    
    /**
      * Callback used to sort categories by name.
      *
      * @param a The left reflection to sort.
      * @param b The right reflection to sort.
      * @returns The sorting weight.
      */
    inline def sortCatCallback(a: ReflectionCategory, b: ReflectionCategory): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sortCatCallback")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
}
