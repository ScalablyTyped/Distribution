package typings.vueCompilerCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectiveTransformResult extends js.Object {
  
  var needRuntime: js.UndefOr[Boolean | js.Symbol] = js.native
  
  var props: js.Array[Property] = js.native
  
  var ssrTagParts: js.UndefOr[js.Array[String | JSChildNode]] = js.native
}
object DirectiveTransformResult {
  
  @scala.inline
  def apply(props: js.Array[Property]): DirectiveTransformResult = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectiveTransformResult]
  }
  
  @scala.inline
  implicit class DirectiveTransformResultOps[Self <: DirectiveTransformResult] (val x: Self) extends AnyVal {
    
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
    def setPropsVarargs(value: Property*): Self = this.set("props", js.Array(value :_*))
    
    @scala.inline
    def setProps(value: js.Array[Property]): Self = this.set("props", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeedRuntime(value: Boolean | js.Symbol): Self = this.set("needRuntime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNeedRuntime: Self = this.set("needRuntime", js.undefined)
    
    @scala.inline
    def setSsrTagPartsVarargs(value: (String | JSChildNode)*): Self = this.set("ssrTagParts", js.Array(value :_*))
    
    @scala.inline
    def setSsrTagParts(value: js.Array[String | JSChildNode]): Self = this.set("ssrTagParts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSsrTagParts: Self = this.set("ssrTagParts", js.undefined)
  }
}
