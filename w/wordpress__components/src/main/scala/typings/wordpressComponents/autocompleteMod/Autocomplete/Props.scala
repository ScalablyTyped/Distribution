package typings.wordpressComponents.autocompleteMod.Autocomplete

import typings.react.mod.global.JSX.Element
import typings.wordpressRichText.mod.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Props[T] extends js.Object {
  
  def children(props: RenderProps): Element | Null = js.native
  
  var completers: js.Array[Completer[T]] = js.native
  
  var isSelected: js.UndefOr[Boolean] = js.native
  
  var onChange: js.UndefOr[js.Function1[/* value */ Value, Unit]] = js.native
  
  var onReplace: js.UndefOr[js.Function1[/* value */ Value, Unit]] = js.native
  
  var record: js.UndefOr[Value] = js.native
}
object Props {
  
  @scala.inline
  def apply[T](children: RenderProps => Element | Null, completers: js.Array[Completer[T]]): Props[T] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), completers = completers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props[T]]
  }
  
  @scala.inline
  implicit class PropsOps[Self <: Props[_], T] (val x: Self with Props[T]) extends AnyVal {
    
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
    def setChildren(value: RenderProps => Element | Null): Self = this.set("children", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompletersVarargs(value: Completer[T]*): Self = this.set("completers", js.Array(value :_*))
    
    @scala.inline
    def setCompleters(value: js.Array[Completer[T]]): Self = this.set("completers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSelected(value: Boolean): Self = this.set("isSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsSelected: Self = this.set("isSelected", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* value */ Value => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOnReplace(value: /* value */ Value => Unit): Self = this.set("onReplace", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnReplace: Self = this.set("onReplace", js.undefined)
    
    @scala.inline
    def setRecord(value: Value): Self = this.set("record", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecord: Self = this.set("record", js.undefined)
  }
}
