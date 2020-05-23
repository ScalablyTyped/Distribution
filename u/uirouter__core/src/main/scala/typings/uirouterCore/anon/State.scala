package typings.uirouterCore.anon

import org.scalablytyped.runtime.StringDictionary
import typings.uirouterCore.stateInterfaceMod.StateDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var params: StringDictionary[js.Any]
  var state: String | StateDeclaration
}

object State {
  @scala.inline
  def apply(params: StringDictionary[js.Any], state: String | StateDeclaration): State = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
}

