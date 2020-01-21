package typings.typedoc.browserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecoratesContainer extends js.Object {
  var decorates: js.Array[TypeObject]
}

object DecoratesContainer {
  @scala.inline
  def apply(decorates: js.Array[TypeObject]): DecoratesContainer = {
    val __obj = js.Dynamic.literal(decorates = decorates.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DecoratesContainer]
  }
}

