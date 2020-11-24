package typings.vegaTypings.legendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GuideEncodeEntry[T] extends js.Object {
  
  var enter: js.UndefOr[T] = js.native
  
  var exit: js.UndefOr[T] = js.native
  
  var hover: js.UndefOr[T] = js.native
  
  /**
    * A boolean flag indicating if the guide element should respond to input events such as mouse hover.
    */
  var interactive: js.UndefOr[Boolean] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  /**
    * A mark style property to apply to the guide group mark.
    */
  var style: js.UndefOr[String | js.Array[String]] = js.native
  
  var update: js.UndefOr[T] = js.native
}
object GuideEncodeEntry {
  
  @scala.inline
  def apply[T](): GuideEncodeEntry[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GuideEncodeEntry[T]]
  }
  
  @scala.inline
  implicit class GuideEncodeEntryOps[Self <: GuideEncodeEntry[_], T] (val x: Self with GuideEncodeEntry[T]) extends AnyVal {
    
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
    def setEnter(value: T): Self = this.set("enter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnter: Self = this.set("enter", js.undefined)
    
    @scala.inline
    def setExit(value: T): Self = this.set("exit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExit: Self = this.set("exit", js.undefined)
    
    @scala.inline
    def setHover(value: T): Self = this.set("hover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHover: Self = this.set("hover", js.undefined)
    
    @scala.inline
    def setInteractive(value: Boolean): Self = this.set("interactive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInteractive: Self = this.set("interactive", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setStyleVarargs(value: String*): Self = this.set("style", js.Array(value :_*))
    
    @scala.inline
    def setStyle(value: String | js.Array[String]): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setUpdate(value: T): Self = this.set("update", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdate: Self = this.set("update", js.undefined)
  }
}
