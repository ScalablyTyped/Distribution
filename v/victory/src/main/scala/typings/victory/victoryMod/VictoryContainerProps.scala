package typings.victory.victoryMod

import typings.react.reactMod.CSSProperties
import typings.react.reactMod.DOMAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VictoryContainerProps extends js.Object {
  /**
    * The desc prop specifies the description of the chart/SVG to assist with
    * accessibility for screen readers. The more info about the chart provided in
    * the description, the more usable it will be for people using screen readers.
    * This prop defaults to an empty string.
    * @example "Golden retreivers make up 30%, Labs make up 25%, and other dog breeds are
    * not represented above 5% each."
    * @default ""
    */
  var desc: js.UndefOr[String] = js.undefined
  /**
    * The events prop attaches arbitrary event handlers to the container component.
    * Event handlers passed from other Victory components are called with their
    * corresponding events as well as scale, style, width, height, and data when
    * applicable. Use the invert method to convert event coordinate information to
    * data. `scale.x.invert(evt.offsetX)`.
    * @examples {{ onClick: (evt) => alert(`x: ${evt.clientX}, y: ${evt.clientY}`)}}
    */
  var events: js.UndefOr[DOMAttributes[_]] = js.undefined
  /**
    * The height props specifies the height the svg viewBox of the container.
    * This value should be given as a number of pixels. If no height prop
    * is given, the height prop from the child component passed will be used.
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * The responsive prop specifies whether the rendered container should be a responsive container
    * with a viewBox attribute, or a static container with absolute width and height.
    * @default true
    */
  var responsive: js.UndefOr[Boolean] = js.undefined
  /**
    * The style prop specifies styles for your VictoryContainer. Any valid inline style properties
    * will be applied. Height and width should be specified via the height
    * and width props, as they are used to calculate the alignment of
    * components within the container. Styles from the child component will
    * also be passed, if any exist.
    * @examples {border: 1px solid red}
    */
  var style: js.UndefOr[CSSProperties] = js.undefined
  /**
    * The title prop specifies the title to be applied to the SVG to assist
    * accessibility for screen readers. The more descriptive this title is, the more
    * useful it will be. If no title prop is passed, it will default to Victory Chart.
    * @example "Popularity of Dog Breeds by Percentage"
    * @default "Victory Chart"
    */
  var title: js.UndefOr[String] = js.undefined
  /**
    * The width props specifies the width of the svg viewBox of the container
    * This value should be given as a number of pixels. If no width prop
    * is given, the width prop from the child component passed will be used.
    */
  var width: js.UndefOr[Double] = js.undefined
}

object VictoryContainerProps {
  @scala.inline
  def apply(
    desc: String = null,
    events: DOMAttributes[_] = null,
    height: Int | Double = null,
    responsive: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    title: String = null,
    width: Int | Double = null
  ): VictoryContainerProps = {
    val __obj = js.Dynamic.literal()
    if (desc != null) __obj.updateDynamic("desc")(desc.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(responsive)) __obj.updateDynamic("responsive")(responsive.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[VictoryContainerProps]
  }
}

