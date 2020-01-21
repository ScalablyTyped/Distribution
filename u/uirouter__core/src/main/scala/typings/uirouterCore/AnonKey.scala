package typings.uirouterCore

import org.scalablytyped.runtime.StringDictionary
import typings.uirouterCore.stateInterfaceMod.StateDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKey extends js.Object {
  var params: StringDictionary[js.Any]
  var state: String | StateDeclaration
}

object AnonKey {
  @scala.inline
  def apply(params: StringDictionary[js.Any], state: String | StateDeclaration): AnonKey = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonKey]
  }
}

