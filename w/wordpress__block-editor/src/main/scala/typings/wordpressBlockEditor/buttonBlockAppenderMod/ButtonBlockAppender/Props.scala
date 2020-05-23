package typings.wordpressBlockEditor.buttonBlockAppenderMod.ButtonBlockAppender

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  /**
    * The `clientId` of the Block from who's root new Blocks should be inserted. This prop is
    * required by the block `Inserter` component. Typically this is the `clientID` of the Block
    * where the prop is being rendered.
    */
  var rootClientId: String
}

object Props {
  @scala.inline
  def apply(rootClientId: String, className: String = null): Props = {
    val __obj = js.Dynamic.literal(rootClientId = rootClientId.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

