package typings
package vueLib.typesOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {readonly [ P in keyof vue.vue/types/vnode.VNodeDirective ]: vue.vue/types/vnode.VNodeDirective[P]} */ trait DirectiveBinding extends js.Object {
  val modifiers: org.scalablytyped.runtime.StringDictionary[scala.Boolean]
}

object DirectiveBinding {
  @scala.inline
  def apply(modifiers: org.scalablytyped.runtime.StringDictionary[scala.Boolean]): DirectiveBinding = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("modifiers")(modifiers)
    __obj.asInstanceOf[DirectiveBinding]
  }
}

