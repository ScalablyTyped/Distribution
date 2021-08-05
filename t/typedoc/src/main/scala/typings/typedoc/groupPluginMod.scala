package typings.typedoc

import typings.typedoc.abstractMod.ReflectionKind
import typings.typedoc.componentsMod.ConverterComponent
import typings.typedoc.converterConverterMod.Converter
import typings.typedoc.reflectionGroupMod.ReflectionGroup
import typings.typedoc.reflectionsMod.Reflection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object groupPluginMod {
  
  @JSImport("typedoc/dist/lib/converter/plugins/GroupPlugin", "GroupPlugin")
  @js.native
  class GroupPlugin protected () extends ConverterComponent {
    def this(owner: js.Symbol) = this()
    def this(owner: Converter) = this()
    
    /* private */ var onEndResolve: js.Any = js.native
    
    /* private */ var onResolve: js.Any = js.native
  }
  /* static members */
  object GroupPlugin {
    
    @JSImport("typedoc/dist/lib/converter/plugins/GroupPlugin", "GroupPlugin")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("typedoc/dist/lib/converter/plugins/GroupPlugin", "GroupPlugin.PLURALS")
    @js.native
    def PLURALS: js.Object = js.native
    inline def PLURALS_=(x: js.Object): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PLURALS")(x.asInstanceOf[js.Any])
    
    @JSImport("typedoc/dist/lib/converter/plugins/GroupPlugin", "GroupPlugin.SINGULARS")
    @js.native
    def SINGULARS: js.Object = js.native
    inline def SINGULARS_=(x: js.Object): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SINGULARS")(x.asInstanceOf[js.Any])
    
    @JSImport("typedoc/dist/lib/converter/plugins/GroupPlugin", "GroupPlugin.WEIGHTS")
    @js.native
    def WEIGHTS: js.Array[ReflectionKind] = js.native
    inline def WEIGHTS_=(x: js.Array[ReflectionKind]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WEIGHTS")(x.asInstanceOf[js.Any])
    
    inline def getKindPlural(kind: ReflectionKind): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getKindPlural")(kind.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def getKindSingular(kind: ReflectionKind): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getKindSingular")(kind.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @JSImport("typedoc/dist/lib/converter/plugins/GroupPlugin", "GroupPlugin.getKindString")
    @js.native
    def getKindString: js.Any = js.native
    inline def getKindString_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getKindString")(x.asInstanceOf[js.Any])
    
    inline def getReflectionGroups(reflections: js.Array[Reflection]): js.Array[ReflectionGroup] = ^.asInstanceOf[js.Dynamic].applyDynamic("getReflectionGroups")(reflections.asInstanceOf[js.Any]).asInstanceOf[js.Array[ReflectionGroup]]
    
    inline def sortCallback(a: Reflection, b: Reflection): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sortCallback")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
}
