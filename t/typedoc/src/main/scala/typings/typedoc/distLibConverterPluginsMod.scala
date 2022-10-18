package typings.typedoc

import typings.typedoc.anon.`1024`
import typings.typedoc.anon.`16`
import typings.typedoc.distLibConverterConverterMod.Converter
import typings.typedoc.distLibModelsMod.ReflectionCategory
import typings.typedoc.distLibModelsReflectionsKindMod.ReflectionKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibConverterPluginsMod {
  
  @JSImport("typedoc/dist/lib/converter/plugins", "CategoryPlugin")
  @js.native
  open class CategoryPlugin protected ()
    extends typings.typedoc.distLibConverterPluginsCategoryPluginMod.CategoryPlugin {
    /**
      * Create new Component instance.
      */
    def this(owner: Converter) = this()
  }
  /* static members */
  object CategoryPlugin {
    
    @JSImport("typedoc/dist/lib/converter/plugins", "CategoryPlugin")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("typedoc/dist/lib/converter/plugins", "CategoryPlugin.WEIGHTS")
    @js.native
    def WEIGHTS: js.Array[String] = js.native
    inline def WEIGHTS_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WEIGHTS")(x.asInstanceOf[js.Any])
    
    @JSImport("typedoc/dist/lib/converter/plugins", "CategoryPlugin.defaultCategory")
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
  
  @JSImport("typedoc/dist/lib/converter/plugins", "CommentPlugin")
  @js.native
  open class CommentPlugin protected ()
    extends typings.typedoc.distLibConverterPluginsCommentPluginMod.CommentPlugin {
    /**
      * Create new Component instance.
      */
    def this(owner: Converter) = this()
  }
  
  @JSImport("typedoc/dist/lib/converter/plugins", "GroupPlugin")
  @js.native
  open class GroupPlugin protected ()
    extends typings.typedoc.distLibConverterPluginsGroupPluginMod.GroupPlugin {
    /**
      * Create new Component instance.
      */
    def this(owner: Converter) = this()
  }
  /* static members */
  object GroupPlugin {
    
    @JSImport("typedoc/dist/lib/converter/plugins", "GroupPlugin")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Define the plural name of individual reflection kinds.
      */
    @JSImport("typedoc/dist/lib/converter/plugins", "GroupPlugin.PLURALS")
    @js.native
    def PLURALS: `1024` = js.native
    inline def PLURALS_=(x: `1024`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PLURALS")(x.asInstanceOf[js.Any])
    
    /**
      * Define the singular name of individual reflection kinds.
      */
    @JSImport("typedoc/dist/lib/converter/plugins", "GroupPlugin.SINGULARS")
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
    @JSImport("typedoc/dist/lib/converter/plugins", "GroupPlugin.getKindString")
    @js.native
    def getKindString: Any = js.native
    inline def getKindString_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getKindString")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("typedoc/dist/lib/converter/plugins", "ImplementsPlugin")
  @js.native
  open class ImplementsPlugin protected ()
    extends typings.typedoc.distLibConverterPluginsImplementsPluginMod.ImplementsPlugin {
    /**
      * Create new Component instance.
      */
    def this(owner: Converter) = this()
  }
  
  @JSImport("typedoc/dist/lib/converter/plugins", "InheritDocPlugin")
  @js.native
  open class InheritDocPlugin protected ()
    extends typings.typedoc.distLibConverterPluginsInheritDocPluginMod.InheritDocPlugin {
    /**
      * Create new Component instance.
      */
    def this(owner: Converter) = this()
  }
  
  @JSImport("typedoc/dist/lib/converter/plugins", "LinkResolverPlugin")
  @js.native
  open class LinkResolverPlugin protected ()
    extends typings.typedoc.distLibConverterPluginsLinkResolverPluginMod.LinkResolverPlugin {
    /**
      * Create new Component instance.
      */
    def this(owner: Converter) = this()
  }
  
  @JSImport("typedoc/dist/lib/converter/plugins", "PackagePlugin")
  @js.native
  open class PackagePlugin protected ()
    extends typings.typedoc.distLibConverterPluginsPackagePluginMod.PackagePlugin {
    /**
      * Create new Component instance.
      */
    def this(owner: Converter) = this()
  }
  
  @JSImport("typedoc/dist/lib/converter/plugins", "SourcePlugin")
  @js.native
  open class SourcePlugin protected ()
    extends typings.typedoc.distLibConverterPluginsSourcePluginMod.SourcePlugin {
    /**
      * Create new Component instance.
      */
    def this(owner: Converter) = this()
  }
  
  @JSImport("typedoc/dist/lib/converter/plugins", "TypePlugin")
  @js.native
  open class TypePlugin protected ()
    extends typings.typedoc.distLibConverterPluginsTypePluginMod.TypePlugin {
    /**
      * Create new Component instance.
      */
    def this(owner: Converter) = this()
  }
}
