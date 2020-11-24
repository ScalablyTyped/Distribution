package typings.wordpressComponents.anon

import typings.wordpressComponents.selectControlMod.SelectControl.Option
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnChange[T /* <: String | js.Array[String] */] extends js.Object {
  
  /**
    * A function that receives the value of the new option that is being
    * selected as input. If multiple is true the value received is an
    * array of the selected value. If multiple is false the value received
    * is a single value with the new selected value.
    */
  def onChange(value: T): Unit = js.native
  
  var options: js.UndefOr[js.Array[Option]] = js.native
  
  var value: js.UndefOr[T] = js.native
}
object OnChange {
  
  @scala.inline
  def apply[T /* <: String | js.Array[String] */](onChange: T => Unit): OnChange[T] = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange))
    __obj.asInstanceOf[OnChange[T]]
  }
  
  @scala.inline
  implicit class OnChangeOps[Self <: OnChange[_], T /* <: String | js.Array[String] */] (val x: Self with OnChange[T]) extends AnyVal {
    
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
    def setOnChange(value: T => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOptionsVarargs(value: Option*): Self = this.set("options", js.Array(value :_*))
    
    @scala.inline
    def setOptions(value: js.Array[Option]): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setValue(value: T): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
