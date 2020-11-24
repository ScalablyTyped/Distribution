package typings.wordpressComponents.slotMod.Slot

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Props extends js.Object {
  
  /**
    * Changes event bubbling behavior.
    *
    * If `false`, events will bubble to their parents on the DOM
    * hierarchy (native event bubbling).
    *
    * If `true`, events will bubble to their virtual parent in the React
    * elements hierarchy.
    *
    * @defaultValue false
    */
  var bubblesVirtually: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional render function which takes a reference to the slot's
    * `Fill`s as a param. It allows to perform additional processing and
    * wrap `fills` conditionally.
    */
  var children: js.UndefOr[js.Function1[/* fills */ js.Array[js.Array[Element]], Element | Null]] = js.native
  
  /**
    * Props to pass into the first child of the <Fill /> component.
    */
  var fillProps: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  /**
    * Both `Slot` and `Fill` accept a `name` string prop, where a `Slot`
    * with a given `name` will render the `children` of any associated
    * `Fill`s.
    */
  var name: js.UndefOr[String] = js.native
}
object Props {
  
  @scala.inline
  def apply(): Props = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Props]
  }
  
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
    
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
    def setBubblesVirtually(value: Boolean): Self = this.set("bubblesVirtually", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBubblesVirtually: Self = this.set("bubblesVirtually", js.undefined)
    
    @scala.inline
    def setChildren(value: /* fills */ js.Array[js.Array[Element]] => Element | Null): Self = this.set("children", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setFillProps(value: StringDictionary[js.Any]): Self = this.set("fillProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillProps: Self = this.set("fillProps", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
