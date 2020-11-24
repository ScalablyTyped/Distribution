package typings.swiftclick

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SwiftClickStatic extends js.Object {
  
  def attach(contextEl: Element): SwiftClickObject = js.native
}
object SwiftClickStatic {
  
  @scala.inline
  def apply(attach: Element => SwiftClickObject): SwiftClickStatic = {
    val __obj = js.Dynamic.literal(attach = js.Any.fromFunction1(attach))
    __obj.asInstanceOf[SwiftClickStatic]
  }
  
  @scala.inline
  implicit class SwiftClickStaticOps[Self <: SwiftClickStatic] (val x: Self) extends AnyVal {
    
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
    def setAttach(value: Element => SwiftClickObject): Self = this.set("attach", js.Any.fromFunction1(value))
  }
}
