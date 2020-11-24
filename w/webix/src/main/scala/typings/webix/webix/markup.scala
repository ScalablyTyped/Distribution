package typings.webix.webix

import typings.webix.webix.ui.baseview
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait markup extends js.Object {
  
  var attribute: js.Any = js.native
  
  var dataTag: js.Any = js.native
  
  def init(node: String, target: String): baseview = js.native
  
  var namespace: js.Any = js.native
  
  def parse(data: js.Any, datatype: String): Unit = js.native
}
object markup {
  
  @scala.inline
  def apply(
    attribute: js.Any,
    dataTag: js.Any,
    init: (String, String) => baseview,
    namespace: js.Any,
    parse: (js.Any, String) => Unit
  ): markup = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], dataTag = dataTag.asInstanceOf[js.Any], init = js.Any.fromFunction2(init), namespace = namespace.asInstanceOf[js.Any], parse = js.Any.fromFunction2(parse))
    __obj.asInstanceOf[markup]
  }
  
  @scala.inline
  implicit class markupOps[Self <: markup] (val x: Self) extends AnyVal {
    
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
    def setAttribute(value: js.Any): Self = this.set("attribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataTag(value: js.Any): Self = this.set("dataTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInit(value: (String, String) => baseview): Self = this.set("init", js.Any.fromFunction2(value))
    
    @scala.inline
    def setNamespace(value: js.Any): Self = this.set("namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParse(value: (js.Any, String) => Unit): Self = this.set("parse", js.Any.fromFunction2(value))
  }
}
