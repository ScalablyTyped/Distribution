package typings.webscopeioReactTextareaAutocomplete.mod

import typings.react.mod.SFC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextareaState[TItem] extends js.Object {
  
  var actualToken: String = js.native
  
  var component: js.UndefOr[SFC[ItemComponentProps[TItem]]] = js.native
  
  var currentTrigger: js.UndefOr[String] = js.native
  
  var data: js.UndefOr[js.Array[TItem]] = js.native
  
  var dataLoading: Boolean = js.native
  
  var left: js.UndefOr[Double] = js.native
  
  var selectionEnd: Double = js.native
  
  var selectionStart: Double = js.native
  
  var top: js.UndefOr[Double] = js.native
  
  var value: String = js.native
}
object TextareaState {
  
  @scala.inline
  def apply[TItem](
    actualToken: String,
    dataLoading: Boolean,
    selectionEnd: Double,
    selectionStart: Double,
    value: String
  ): TextareaState[TItem] = {
    val __obj = js.Dynamic.literal(actualToken = actualToken.asInstanceOf[js.Any], dataLoading = dataLoading.asInstanceOf[js.Any], selectionEnd = selectionEnd.asInstanceOf[js.Any], selectionStart = selectionStart.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextareaState[TItem]]
  }
  
  @scala.inline
  implicit class TextareaStateOps[Self <: TextareaState[_], TItem] (val x: Self with TextareaState[TItem]) extends AnyVal {
    
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
    def setActualToken(value: String): Self = this.set("actualToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataLoading(value: Boolean): Self = this.set("dataLoading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionEnd(value: Double): Self = this.set("selectionEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionStart(value: Double): Self = this.set("selectionStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponent(value: SFC[ItemComponentProps[TItem]]): Self = this.set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    
    @scala.inline
    def setCurrentTrigger(value: String): Self = this.set("currentTrigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentTrigger: Self = this.set("currentTrigger", js.undefined)
    
    @scala.inline
    def setDataVarargs(value: TItem*): Self = this.set("data", js.Array(value :_*))
    
    @scala.inline
    def setData(value: js.Array[TItem]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setLeft(value: Double): Self = this.set("left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    
    @scala.inline
    def setTop(value: Double): Self = this.set("top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
  }
}
