package typings.vueTheMask

import org.scalablytyped.runtime.Shortcut
import typings.std.HTMLElement
import typings.vue.optionsMod.Component
import typings.vue.optionsMod.DefaultComputed
import typings.vue.optionsMod.DefaultData
import typings.vue.optionsMod.DefaultMethods
import typings.vue.optionsMod.DefaultProps
import typings.vue.optionsMod.DirectiveBinding
import typings.vue.optionsMod.DirectiveFunction
import typings.vue.pluginMod.PluginObject
import typings.vue.vnodeMod.VNode
import typings.vue.vueMod.Vue
import typings.vue.vueMod.VueConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("vue-the-mask", JSImport.Namespace)
  @js.native
  val ^ : VueTheMaskPlugin = js.native
  
  trait VueTheMaskPlugin
    extends StObject
       with PluginObject[Unit] {
    
    var TheMask: Component[
        DefaultData[scala.Nothing], 
        DefaultMethods[scala.Nothing], 
        DefaultComputed, 
        DefaultProps
      ]
    
    def mask(el: HTMLElement, binding: DirectiveBinding, vnode: VNode, oldVnode: VNode): Unit
    @JSName("mask")
    var mask_Original: DirectiveFunction
  }
  object VueTheMaskPlugin {
    
    inline def apply(
      TheMask: Component[
          DefaultData[scala.Nothing], 
          DefaultMethods[scala.Nothing], 
          DefaultComputed, 
          DefaultProps
        ],
      install: (/* Vue */ VueConstructor[Vue], /* options */ js.UndefOr[Unit]) => Unit,
      mask: (/* el */ HTMLElement, /* binding */ DirectiveBinding, /* vnode */ VNode, /* oldVnode */ VNode) => Unit
    ): VueTheMaskPlugin = {
      val __obj = js.Dynamic.literal(TheMask = TheMask.asInstanceOf[js.Any], install = js.Any.fromFunction2(install), mask = js.Any.fromFunction4(mask))
      __obj.asInstanceOf[VueTheMaskPlugin]
    }
    
    type VueStatic = js.Function0[Unit]
    
    extension [Self <: VueTheMaskPlugin](x: Self) {
      
      inline def setMask(
        value: (/* el */ HTMLElement, /* binding */ DirectiveBinding, /* vnode */ VNode, /* oldVnode */ VNode) => Unit
      ): Self = StObject.set(x, "mask", js.Any.fromFunction4(value))
      
      inline def setTheMask(
        value: Component[
              DefaultData[scala.Nothing], 
              DefaultMethods[scala.Nothing], 
              DefaultComputed, 
              DefaultProps
            ]
      ): Self = StObject.set(x, "TheMask", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = VueTheMaskPlugin
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: VueTheMaskPlugin = ^
}
