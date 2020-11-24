package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Indenter extends js.Object {
  
  def decreaseIndent(): Unit = js.native
  
  def getIndent(): String = js.native
  
  def increaseIndent(): Unit = js.native
  
  var indentAmt: Double = js.native
}
object Indenter {
  
  @scala.inline
  def apply(decreaseIndent: () => Unit, getIndent: () => String, increaseIndent: () => Unit, indentAmt: Double): Indenter = {
    val __obj = js.Dynamic.literal(decreaseIndent = js.Any.fromFunction0(decreaseIndent), getIndent = js.Any.fromFunction0(getIndent), increaseIndent = js.Any.fromFunction0(increaseIndent), indentAmt = indentAmt.asInstanceOf[js.Any])
    __obj.asInstanceOf[Indenter]
  }
  
  @scala.inline
  implicit class IndenterOps[Self <: Indenter] (val x: Self) extends AnyVal {
    
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
    def setDecreaseIndent(value: () => Unit): Self = this.set("decreaseIndent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetIndent(value: () => String): Self = this.set("getIndent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIncreaseIndent(value: () => Unit): Self = this.set("increaseIndent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIndentAmt(value: Double): Self = this.set("indentAmt", value.asInstanceOf[js.Any])
  }
}
