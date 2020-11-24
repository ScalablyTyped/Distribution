package typings.tuyaPanelKit.mod

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SwipeoutProps extends js.Object {
  
  var accessibilityLabel: js.UndefOr[String] = js.native
  
  var autoClose: js.UndefOr[Boolean] = js.native
  
  var backgroundColor: js.UndefOr[String] = js.native
  
  var buttonWidth: js.UndefOr[Double] = js.native
  
  var close: js.UndefOr[Boolean] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var left: js.UndefOr[js.Array[SwipeoutAction]] = js.native
  
  var onClose: js.UndefOr[
    js.Function2[/* sectionID */ js.UndefOr[Double], /* rowID */ js.UndefOr[Double], Unit]
  ] = js.native
  
  var onOpen: js.UndefOr[
    js.Function2[/* sectionID */ js.UndefOr[Double], /* rowID */ js.UndefOr[Double], Unit]
  ] = js.native
  
  var right: js.UndefOr[js.Array[SwipeoutAction]] = js.native
  
  var rowID: js.UndefOr[Double] = js.native
  
  var scroll: js.UndefOr[js.Function1[/* value */ js.UndefOr[Boolean], Unit]] = js.native
  
  var sectionID: js.UndefOr[Double] = js.native
  
  var sensitivity: js.UndefOr[Double] = js.native
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
}
object SwipeoutProps {
  
  @scala.inline
  def apply(): SwipeoutProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwipeoutProps]
  }
  
  @scala.inline
  implicit class SwipeoutPropsOps[Self <: SwipeoutProps] (val x: Self) extends AnyVal {
    
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
    def setAccessibilityLabel(value: String): Self = this.set("accessibilityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityLabel: Self = this.set("accessibilityLabel", js.undefined)
    
    @scala.inline
    def setAutoClose(value: Boolean): Self = this.set("autoClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoClose: Self = this.set("autoClose", js.undefined)
    
    @scala.inline
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setButtonWidth(value: Double): Self = this.set("buttonWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtonWidth: Self = this.set("buttonWidth", js.undefined)
    
    @scala.inline
    def setClose(value: Boolean): Self = this.set("close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClose: Self = this.set("close", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setLeftVarargs(value: SwipeoutAction*): Self = this.set("left", js.Array(value :_*))
    
    @scala.inline
    def setLeft(value: js.Array[SwipeoutAction]): Self = this.set("left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    
    @scala.inline
    def setOnClose(value: (/* sectionID */ js.UndefOr[Double], /* rowID */ js.UndefOr[Double]) => Unit): Self = this.set("onClose", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnClose: Self = this.set("onClose", js.undefined)
    
    @scala.inline
    def setOnOpen(value: (/* sectionID */ js.UndefOr[Double], /* rowID */ js.UndefOr[Double]) => Unit): Self = this.set("onOpen", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnOpen: Self = this.set("onOpen", js.undefined)
    
    @scala.inline
    def setRightVarargs(value: SwipeoutAction*): Self = this.set("right", js.Array(value :_*))
    
    @scala.inline
    def setRight(value: js.Array[SwipeoutAction]): Self = this.set("right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRight: Self = this.set("right", js.undefined)
    
    @scala.inline
    def setRowID(value: Double): Self = this.set("rowID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowID: Self = this.set("rowID", js.undefined)
    
    @scala.inline
    def setScroll(value: /* value */ js.UndefOr[Boolean] => Unit): Self = this.set("scroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteScroll: Self = this.set("scroll", js.undefined)
    
    @scala.inline
    def setSectionID(value: Double): Self = this.set("sectionID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSectionID: Self = this.set("sectionID", js.undefined)
    
    @scala.inline
    def setSensitivity(value: Double): Self = this.set("sensitivity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSensitivity: Self = this.set("sensitivity", js.undefined)
    
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setStyleNull: Self = this.set("style", null)
  }
}
