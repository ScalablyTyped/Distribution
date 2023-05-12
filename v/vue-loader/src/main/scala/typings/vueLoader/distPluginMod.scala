package typings.vueLoader

import typings.webpack.mod.Compiler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPluginMod {
  
  /* was `typeof VueLoaderPlugin` */
  @JSImport("vue-loader/dist/plugin", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with VueLoaderPlugin {
    
    /* CompleteClass */
    @JSName("apply")
    override def apply(compiler: Compiler): Unit = js.native
  }
  /* was `typeof VueLoaderPlugin` */
  object default {
    
    @JSImport("vue-loader/dist/plugin", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("vue-loader/dist/plugin", "default.NS")
    @js.native
    def NS: String = js.native
    inline def NS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NS")(x.asInstanceOf[js.Any])
  }
  
  /* was `typeof VueLoaderPlugin` */
  type Plugin = VueLoaderPlugin
  
  trait VueLoaderPlugin extends StObject {
    
    @JSName("apply")
    def apply(compiler: Compiler): Unit
  }
  object VueLoaderPlugin {
    
    inline def apply(apply: Compiler => Unit): VueLoaderPlugin = {
      val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply))
      __obj.asInstanceOf[VueLoaderPlugin]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VueLoaderPlugin] (val x: Self) extends AnyVal {
      
      inline def setApply(value: Compiler => Unit): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
    }
  }
}
