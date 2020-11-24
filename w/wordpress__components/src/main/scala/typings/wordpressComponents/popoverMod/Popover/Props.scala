package typings.wordpressComponents.popoverMod.Popover

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.react.mod.FocusEvent
import typings.react.mod.ReactNode
import typings.std.ClientRect
import typings.std.DOMRect
import typings.std.Element
import typings.std.HTMLDivElement
import typings.std.HTMLSpanElement
import typings.wordpressComponents.wordpressComponentsBooleans.`false`
import typings.wordpressComponents.wordpressComponentsStrings.container
import typings.wordpressComponents.wordpressComponentsStrings.firstElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Props
  extends AllHTMLAttributes[HTMLDivElement]
     with ClassAttributes[HTMLDivElement] {
  
  /**
    * A custom `DOMRect` object at which to position the popover.
    */
  var anchorRect: js.UndefOr[DOMRect | ClientRect] = js.native
  
  /**
    * Should the popover have an animation?
    * @defaultValue true
    */
  var animate: js.UndefOr[Boolean] = js.native
  
  /**
    * The content to be displayed within the popover.
    */
  @JSName("children")
  var children_Props: ReactNode = js.native
  
  /**
    * Opt-in prop to show popovers fullscreen on mobile.
    */
  var expandOnMobile: js.UndefOr[Boolean] = js.native
  
  /**
    * By default, the first tabblable element in the popover will receive
    * focus when it mounts. This is the same as setting focusOnMount to
    * `"firstElement"`. If you want to focus the container instead, you can
    * set focusOnMount to `"container"`.
    *
    * Set this prop to `false` to disable focus changing entirely. This
    * should only be set when an appropriately accessible substitute
    * behavior exists.
    *
    * @defaultValue "firstElement"
    */
  var focusOnMount: js.UndefOr[firstElement | container | `false`] = js.native
  
  /**
    * Function that should return a `DOMRect` of where to position the
    * popover.
    */
  var getAnchorRect: js.UndefOr[
    js.Function1[
      /* currentAnchorElement */ HTMLSpanElement | Null, 
      js.UndefOr[DOMRect | ClientRect]
    ]
  ] = js.native
  
  /**
    * Set this to customize the text that is shown in popover's header
    * when it is fullscreen on mobile.
    */
  var headerTitle: js.UndefOr[String] = js.native
  
  /**
    * Set this to hide the arrow which visually indicates what the popover
    * is anchored to. Note that the arrow will not display if `position` is
    * set to `"middle center"`.
    */
  var noArrow: js.UndefOr[Boolean] = js.native
  
  /**
    * A callback invoked when the user clicks outside the opened popover,
    * passing the click event. The popover should be closed in response to
    * this interaction.
    *
    * @deprecated  use `onFocusOutside`
    */
  var onClickOutside: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * A callback invoked when the popover should be closed.
    */
  var onClose: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * A callback invoked when the focus leaves the opened popover. This
    * should only be provided in advanced use-cases when a Popover should
    * close under specific circumstances; for example, if the new
    * `document.activeElement` is content of or otherwise controlling
    * Popover visibility.
    *
    * Defaults to `onClose` when not provided.
    */
  var onFocusOutside: js.UndefOr[js.Function1[/* event */ FocusEvent[Element], Unit]] = js.native
  
  /**
    * The direction in which the popover should open relative to its
    * parent node. Specify y- and x-axis as a space-separated string.
    * @defaultValue "top center"
    */
  var position: js.UndefOr[Position] = js.native
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
    def setAnchorRect(value: DOMRect | ClientRect): Self = this.set("anchorRect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnchorRect: Self = this.set("anchorRect", js.undefined)
    
    @scala.inline
    def setAnimate(value: Boolean): Self = this.set("animate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimate: Self = this.set("animate", js.undefined)
    
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setExpandOnMobile(value: Boolean): Self = this.set("expandOnMobile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpandOnMobile: Self = this.set("expandOnMobile", js.undefined)
    
    @scala.inline
    def setFocusOnMount(value: firstElement | container | `false`): Self = this.set("focusOnMount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocusOnMount: Self = this.set("focusOnMount", js.undefined)
    
    @scala.inline
    def setGetAnchorRect(value: /* currentAnchorElement */ HTMLSpanElement | Null => js.UndefOr[DOMRect | ClientRect]): Self = this.set("getAnchorRect", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetAnchorRect: Self = this.set("getAnchorRect", js.undefined)
    
    @scala.inline
    def setHeaderTitle(value: String): Self = this.set("headerTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderTitle: Self = this.set("headerTitle", js.undefined)
    
    @scala.inline
    def setNoArrow(value: Boolean): Self = this.set("noArrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoArrow: Self = this.set("noArrow", js.undefined)
    
    @scala.inline
    def setOnClickOutside(value: () => Unit): Self = this.set("onClickOutside", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnClickOutside: Self = this.set("onClickOutside", js.undefined)
    
    @scala.inline
    def setOnClose(value: () => Unit): Self = this.set("onClose", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnClose: Self = this.set("onClose", js.undefined)
    
    @scala.inline
    def setOnFocusOutside(value: /* event */ FocusEvent[Element] => Unit): Self = this.set("onFocusOutside", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnFocusOutside: Self = this.set("onFocusOutside", js.undefined)
    
    @scala.inline
    def setPosition(value: Position): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
  }
}
