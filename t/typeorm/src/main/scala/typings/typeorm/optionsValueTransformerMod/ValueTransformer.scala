package typings.typeorm.optionsValueTransformerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValueTransformer extends js.Object {
  
  /**
    * Used to unmarshal data when reading from the database.
    */
  def from(value: js.Any): js.Any = js.native
  
  /**
    * Used to marshal data when writing to the database.
    */
  def to(value: js.Any): js.Any = js.native
}
object ValueTransformer {
  
  @scala.inline
  def apply(from: js.Any => js.Any, to: js.Any => js.Any): ValueTransformer = {
    val __obj = js.Dynamic.literal(from = js.Any.fromFunction1(from), to = js.Any.fromFunction1(to))
    __obj.asInstanceOf[ValueTransformer]
  }
  
  @scala.inline
  implicit class ValueTransformerOps[Self <: ValueTransformer] (val x: Self) extends AnyVal {
    
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
    def setFrom(value: js.Any => js.Any): Self = this.set("from", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTo(value: js.Any => js.Any): Self = this.set("to", js.Any.fromFunction1(value))
  }
}
