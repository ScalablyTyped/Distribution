package typings.vue.optionsMod

import typings.vue.anon.Event
import typings.vue.vnodeMod.VNode
import typings.vue.vueMod.CreateElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FunctionalComponentOptions[Props, PropDefs] extends js.Object {
  
  var functional: Boolean = js.native
  
  var inject: js.UndefOr[InjectOptions] = js.native
  
  var model: js.UndefOr[Event] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var props: js.UndefOr[PropDefs] = js.native
  
  var render: js.UndefOr[
    js.ThisFunction2[
      /* this */ js.UndefOr[scala.Nothing], 
      /* createElement */ CreateElement, 
      /* context */ RenderContext[Props], 
      VNode | js.Array[VNode]
    ]
  ] = js.native
}
object FunctionalComponentOptions {
  
  @scala.inline
  def apply[Props, PropDefs](functional: Boolean): FunctionalComponentOptions[Props, PropDefs] = {
    val __obj = js.Dynamic.literal(functional = functional.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionalComponentOptions[Props, PropDefs]]
  }
  
  @scala.inline
  implicit class FunctionalComponentOptionsOps[Self <: FunctionalComponentOptions[_, _], Props, PropDefs] (val x: Self with (FunctionalComponentOptions[Props, PropDefs])) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFunctional(value: Boolean): Self = this.set("functional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInjectVarargs(value: String*): Self = this.set("inject", js.Array(value :_*))
    
    @scala.inline
    def setInject(value: InjectOptions): Self = this.set("inject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInject: Self = this.set("inject", js.undefined)
    
    @scala.inline
    def setModel(value: Event): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setProps(value: PropDefs): Self = this.set("props", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProps: Self = this.set("props", js.undefined)
    
    @scala.inline
    def setRender(
      value: js.ThisFunction2[
          /* this */ js.UndefOr[scala.Nothing], 
          /* createElement */ CreateElement, 
          /* context */ RenderContext[Props], 
          VNode | js.Array[VNode]
        ]
    ): Self = this.set("render", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRender: Self = this.set("render", js.undefined)
  }
}
