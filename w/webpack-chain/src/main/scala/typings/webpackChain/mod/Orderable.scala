package typings.webpackChain.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Orderable extends js.Object {
  
  def after(name: String): this.type = js.native
  
  def before(name: String): this.type = js.native
}
object Orderable {
  
  @scala.inline
  def apply(after: String => Orderable, before: String => Orderable): Orderable = {
    val __obj = js.Dynamic.literal(after = js.Any.fromFunction1(after), before = js.Any.fromFunction1(before))
    __obj.asInstanceOf[Orderable]
  }
  
  @scala.inline
  implicit class OrderableOps[Self <: Orderable] (val x: Self) extends AnyVal {
    
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
    def setAfter(value: String => Orderable): Self = this.set("after", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBefore(value: String => Orderable): Self = this.set("before", js.Any.fromFunction1(value))
  }
}
