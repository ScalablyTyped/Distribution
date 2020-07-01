package typings.wordpressElement.createInterpolateElementMod

import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Frame extends js.Object {
  /**
    * Children.
    */
  var children: js.Array[ReactElement]
  /**
    * A parent element which may still have
    */
  var element: ReactElement
  /**
    * Offset at which last closing element
    *  finished, used for finding text between
    *  elements.
    */
  var leadingTextStart: js.UndefOr[Double] = js.undefined
  /**
    * Running offset at which parsing should
    *        continue.
    */
  var prevOffset: js.UndefOr[Double] = js.undefined
  /**
    * Length of string marking start of parent
    * element.
    */
  var tokenLength: Double
  /**
    * Offset at which parent element first
    * appears.
    */
  var tokenStart: Double
}

object Frame {
  @scala.inline
  def apply(
    children: js.Array[ReactElement],
    element: ReactElement,
    tokenLength: Double,
    tokenStart: Double,
    leadingTextStart: js.UndefOr[Double] = js.undefined,
    prevOffset: js.UndefOr[Double] = js.undefined
  ): Frame = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], tokenLength = tokenLength.asInstanceOf[js.Any], tokenStart = tokenStart.asInstanceOf[js.Any])
    if (!js.isUndefined(leadingTextStart)) __obj.updateDynamic("leadingTextStart")(leadingTextStart.get.asInstanceOf[js.Any])
    if (!js.isUndefined(prevOffset)) __obj.updateDynamic("prevOffset")(prevOffset.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Frame]
  }
}

