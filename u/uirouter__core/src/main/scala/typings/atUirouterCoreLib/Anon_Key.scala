package typings
package atUirouterCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Key extends js.Object {
  var params: org.scalablytyped.runtime.StringDictionary[js.Any]
  var state: java.lang.String | atUirouterCoreLib.libStateInterfaceMod.StateDeclaration
}

object Anon_Key {
  @scala.inline
  def apply(
    params: org.scalablytyped.runtime.StringDictionary[js.Any],
    state: java.lang.String | atUirouterCoreLib.libStateInterfaceMod.StateDeclaration
  ): Anon_Key = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("params")(params)
    __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Key]
  }
}

