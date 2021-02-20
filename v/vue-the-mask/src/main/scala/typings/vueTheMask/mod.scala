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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("vue-the-mask", JSImport.Namespace)
  @js.native
  val ^ : VueTheMaskPlugin = js.native
  
  @js.native
  trait VueTheMaskPlugin
    extends PluginObject[js.UndefOr[scala.Nothing]] {
    
    var TheMask: Component[
        DefaultData[scala.Nothing], 
        DefaultMethods[scala.Nothing], 
        DefaultComputed, 
        DefaultProps
      ] = js.native
    
    def mask(el: HTMLElement, binding: DirectiveBinding, vnode: VNode, oldVnode: VNode): Unit = js.native
    @JSName("mask")
    var mask_Original: DirectiveFunction = js.native
  }
  object VueTheMaskPlugin {
    
    type VueStatic = js.Function0[Unit]
  }
  
  type _To = VueTheMaskPlugin
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: VueTheMaskPlugin = ^
}
