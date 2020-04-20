package typings.tabris.mod

import typings.tabris.AnonAnimate
import typings.tabris.OmitScrollViewset
import typings.tabris.tabrisStrings.drag
import typings.tabris.tabrisStrings.horizontal
import typings.tabris.tabrisStrings.rest
import typings.tabris.tabrisStrings.scroll
import typings.tabris.tabrisStrings.scrollbarVisible
import typings.tabris.tabrisStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tabris", "ScrollView")
@js.native
class ScrollView () extends Composite[Widget] {
  def this(properties: Properties[ScrollView, OmitScrollViewset]) = this()
  /**
    * Specifies the scrolling direction of the scroll composite.
    * @constant
    */
  var direction: horizontal | vertical = js.native
  /**
    * The horizontal scrolling position in dip.
    */
  val offsetX: Double = js.native
  /**
    * The vertical scrolling position in dip.
    */
  val offsetY: Double = js.native
  /**
    * Fired when the [*offsetX*](#offsetX) property has changed.
    */
  var onOffsetXChanged: ChangeListeners[this.type, typings.tabris.tabrisStrings.offsetX] = js.native
  /**
    * Fired when the [*offsetY*](#offsetY) property has changed.
    */
  var onOffsetYChanged: ChangeListeners[this.type, typings.tabris.tabrisStrings.offsetY] = js.native
  /**
    * Fired while scrolling horizontally.
    */
  var onScrollX: Listeners[ScrollViewScrollEvent[this.type]] = js.native
  /**
    * Fired when the [*scrollXState*](#scrollXState) property has changed.
    */
  var onScrollXStateChanged: ChangeListeners[this.type, typings.tabris.tabrisStrings.scrollXState] = js.native
  /**
    * Fired while scrolling vertically.
    */
  var onScrollY: Listeners[ScrollViewScrollEvent[this.type]] = js.native
  /**
    * Fired when the [*scrollYState*](#scrollYState) property has changed.
    */
  var onScrollYStateChanged: ChangeListeners[this.type, typings.tabris.tabrisStrings.scrollYState] = js.native
  /**
    * Fired when the [*scrollbarVisible*](#scrollbarVisible) property has changed.
    */
  var onScrollbarVisibleChanged: ChangeListeners[this.type, scrollbarVisible] = js.native
  /**
    * The scroll state of the `ScrollView` in horizontal direction. The following states are supported:
    * * `rest` - no scrolling
    * * `drag` the user moves the `ScrollView` content with his finger
    * * `scroll` the user has flinged the content with his finger or the `ScrollView` is scrolling
    * programmatically
    */
  val scrollXState: drag | rest | scroll = js.native
  /**
    * The scroll state of the `ScrollView` in vertical direction. The following states are supported:
    * * `rest` - no scrolling
    * * `drag` the user moves the `ScrollView` content with his finger
    * * `scroll` the user has flinged the `ScrollView` content with his finger or the `ScrollView` is
    * scrolling programmatically
    */
  val scrollYState: drag | rest | scroll = js.native
  /**
    * Allows to show or hide scroll bar for current direction.
    */
  var scrollbarVisible: Boolean = js.native
  /**
    * Scrolls to the given horizontal offset. Give `{animate: false}` as the second parameter to suppress
    * the animation.
    * @param offset The offset to scroll to in dip.
    * @param options An additional parameter object to control the animation.
    */
  def scrollToX(offset: Double): this.type = js.native
  def scrollToX(offset: Double, options: AnonAnimate): this.type = js.native
  /**
    * Scrolls to the given vertical offset. Give `{animate: false}` as the second parameter to suppress the
    * animation.
    * @param offset The offset to scroll to in dip.
    * @param options An parameter object to control the animation.
    */
  def scrollToY(offset: Double): this.type = js.native
  def scrollToY(offset: Double, options: AnonAnimate): this.type = js.native
}

