package typings.typescriptServices.TypeScript.TextUtilities

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICharacterSequence extends js.Object {
  
  def charCodeAt(index: Double): Double = js.native
  
  var length: Double = js.native
}
object ICharacterSequence {
  
  @scala.inline
  def apply(charCodeAt: Double => Double, length: Double): ICharacterSequence = {
    val __obj = js.Dynamic.literal(charCodeAt = js.Any.fromFunction1(charCodeAt), length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICharacterSequence]
  }
  
  @scala.inline
  implicit class ICharacterSequenceOps[Self <: ICharacterSequence] (val x: Self) extends AnyVal {
    
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
    def setCharCodeAt(value: Double => Double): Self = this.set("charCodeAt", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
  }
}
