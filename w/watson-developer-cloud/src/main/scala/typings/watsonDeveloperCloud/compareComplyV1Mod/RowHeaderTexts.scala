package typings.watsonDeveloperCloud.compareComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An array of values, each being the `text` value of a row header that is applicable to this body cell. */
@js.native
trait RowHeaderTexts extends js.Object {
  
  /** The `text` value of a row header. */
  var text: js.UndefOr[String] = js.native
}
object RowHeaderTexts {
  
  @scala.inline
  def apply(): RowHeaderTexts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowHeaderTexts]
  }
  
  @scala.inline
  implicit class RowHeaderTextsOps[Self <: RowHeaderTexts] (val x: Self) extends AnyVal {
    
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
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
}
