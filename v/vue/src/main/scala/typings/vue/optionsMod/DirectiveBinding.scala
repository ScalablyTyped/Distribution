package typings.vue.optionsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {readonly [ P in keyof vue.vue/types/vnode.VNodeDirective ]: vue.vue/types/vnode.VNodeDirective[P]} */ trait DirectiveBinding extends js.Object {
  val modifiers: StringDictionary[Boolean]
}

object DirectiveBinding {
  @scala.inline
  def apply(modifiers: StringDictionary[Boolean]): DirectiveBinding = {
    val __obj = js.Dynamic.literal(modifiers = modifiers.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DirectiveBinding]
  }
}

