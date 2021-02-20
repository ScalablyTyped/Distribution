package typings.typedoc

import typings.typedoc.abstractMod.ReflectionKind
import typings.typedoc.componentsMod.ConverterComponent
import typings.typedoc.converterConverterMod.Converter
import typings.typedoc.reflectionGroupMod.ReflectionGroup
import typings.typedoc.reflectionsMod.Reflection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object groupPluginMod {
  
  @JSImport("typedoc/dist/lib/converter/plugins/GroupPlugin", "GroupPlugin")
  @js.native
  class GroupPlugin protected () extends ConverterComponent {
    def this(owner: js.Symbol) = this()
    def this(owner: Converter) = this()
    
    var onEndResolve: js.Any = js.native
    
    var onResolve: js.Any = js.native
  }
  /* static members */
  object GroupPlugin {
    
    @JSImport("typedoc/dist/lib/converter/plugins/GroupPlugin", "GroupPlugin")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("typedoc/dist/lib/converter/plugins/GroupPlugin", "GroupPlugin.PLURALS")
    @js.native
    def PLURALS: js.Object = js.native
    @scala.inline
    def PLURALS_=(x: js.Object): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PLURALS")(x.asInstanceOf[js.Any])
    
    @JSImport("typedoc/dist/lib/converter/plugins/GroupPlugin", "GroupPlugin.SINGULARS")
    @js.native
    def SINGULARS: js.Object = js.native
    @scala.inline
    def SINGULARS_=(x: js.Object): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SINGULARS")(x.asInstanceOf[js.Any])
    
    @JSImport("typedoc/dist/lib/converter/plugins/GroupPlugin", "GroupPlugin.WEIGHTS")
    @js.native
    def WEIGHTS: js.Array[ReflectionKind] = js.native
    @scala.inline
    def WEIGHTS_=(x: js.Array[ReflectionKind]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WEIGHTS")(x.asInstanceOf[js.Any])
    
    @JSImport("typedoc/dist/lib/converter/plugins/GroupPlugin", "GroupPlugin.getKindPlural")
    @js.native
    def getKindPlural(kind: ReflectionKind): String = js.native
    
    @JSImport("typedoc/dist/lib/converter/plugins/GroupPlugin", "GroupPlugin.getKindSingular")
    @js.native
    def getKindSingular(kind: ReflectionKind): String = js.native
    
    @JSImport("typedoc/dist/lib/converter/plugins/GroupPlugin", "GroupPlugin.getKindString")
    @js.native
    def getKindString: js.Any = js.native
    @scala.inline
    def getKindString_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getKindString")(x.asInstanceOf[js.Any])
    
    @JSImport("typedoc/dist/lib/converter/plugins/GroupPlugin", "GroupPlugin.getReflectionGroups")
    @js.native
    def getReflectionGroups(reflections: js.Array[Reflection]): js.Array[ReflectionGroup] = js.native
    
    @JSImport("typedoc/dist/lib/converter/plugins/GroupPlugin", "GroupPlugin.sortCallback")
    @js.native
    def sortCallback(a: Reflection, b: Reflection): Double = js.native
  }
}
