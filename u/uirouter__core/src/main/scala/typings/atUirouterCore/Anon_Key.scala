package typings.atUirouterCore

import org.scalablytyped.runtime.StringDictionary
import typings.atUirouterCore.libStateInterfaceMod.StateDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Key extends js.Object {
  var params: StringDictionary[js.Any]
  var state: String | StateDeclaration
}

object Anon_Key {
  @scala.inline
  def apply(params: StringDictionary[js.Any], state: String | StateDeclaration): Anon_Key = {
    val __obj = js.Dynamic.literal(params = params, state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Key]
  }
}

