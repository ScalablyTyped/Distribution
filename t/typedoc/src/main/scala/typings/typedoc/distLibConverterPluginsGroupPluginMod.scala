package typings.typedoc

import typings.std.Record
import typings.std.Set
import typings.typedoc.anon.`1024`
import typings.typedoc.anon.`16`
import typings.typedoc.distLibConverterComponentsMod.ConverterComponent
import typings.typedoc.distLibConverterConverterMod.Converter
import typings.typedoc.distLibModelsReflectionGroupMod.ReflectionGroup
import typings.typedoc.distLibModelsReflectionsKindMod.ReflectionKind
import typings.typedoc.distLibModelsReflectionsMod.DeclarationReflection
import typings.typedoc.distLibUtilsSortMod.SortStrategy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibConverterPluginsGroupPluginMod {
  
  @JSImport("typedoc/dist/lib/converter/plugins/GroupPlugin", "GroupPlugin")
  @js.native
  open class GroupPlugin protected () extends ConverterComponent {
    /**
      * Create new Component instance.
      */
    def this(owner: Converter) = this()
    
    var boosts: Record[String, Double] = js.native
    
    /**
      * Extracts the groups for a given reflection.
      *
      * @privateRemarks
      * If you change this, also update getCategories in CategoryPlugin accordingly.
      */
    def getGroups(reflection: DeclarationReflection): Set[String] = js.native
    
    /**
      * Create a grouped representation of the given list of reflections.
      *
      * Reflections are grouped by kind and sorted by weight and name.
      *
      * @param reflections  The reflections that should be grouped.
      * @returns An array containing all children of the given reflection grouped by their kind.
      */
    def getReflectionGroups(reflections: js.Array[DeclarationReflection]): js.Array[ReflectionGroup] = js.native
    
    /* private */ var group: Any = js.native
    
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
    
    /** @internal */
    var sortStrategies: js.Array[SortStrategy] = js.native
    
    var usedBoosts: Set[String] = js.native
  }
  /* static members */
  object GroupPlugin {
    
    @JSImport("typedoc/dist/lib/converter/plugins/GroupPlugin", "GroupPlugin")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Define the plural name of individual reflection kinds.
      */
    @JSImport("typedoc/dist/lib/converter/plugins/GroupPlugin", "GroupPlugin.PLURALS")
    @js.native
    def PLURALS: `1024` = js.native
    inline def PLURALS_=(x: `1024`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PLURALS")(x.asInstanceOf[js.Any])
    
    /**
      * Define the singular name of individual reflection kinds.
      */
    @JSImport("typedoc/dist/lib/converter/plugins/GroupPlugin", "GroupPlugin.SINGULARS")
    @js.native
    def SINGULARS: `16` = js.native
    inline def SINGULARS_=(x: `16`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SINGULARS")(x.asInstanceOf[js.Any])
    
    /**
      * Return the plural name of a internal typescript kind identifier.
      *
      * @param kind The original internal typescript kind identifier.
      * @returns The plural name of the given internal typescript kind identifier
      */
    inline def getKindPlural(kind: ReflectionKind): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getKindPlural")(kind.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Return the singular name of a internal typescript kind identifier.
      *
      * @param kind The original internal typescript kind identifier.
      * @returns The singular name of the given internal typescript kind identifier
      */
    inline def getKindSingular(kind: ReflectionKind): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getKindSingular")(kind.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Transform the internal typescript kind identifier into a human readable version.
      *
      * @param kind  The original typescript kind identifier.
      * @returns A human readable version of the given typescript kind identifier.
      */
    @JSImport("typedoc/dist/lib/converter/plugins/GroupPlugin", "GroupPlugin.getKindString")
    @js.native
    def getKindString: Any = js.native
    inline def getKindString_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getKindString")(x.asInstanceOf[js.Any])
  }
}
