package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitPathToItemsCollection extends js.Object {
  var items: org.scalablytyped.runtime.StringDictionary[js.Array[GitItem]]
}

object GitPathToItemsCollection {
  @scala.inline
  def apply(items: org.scalablytyped.runtime.StringDictionary[js.Array[GitItem]]): GitPathToItemsCollection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("items")(items)
    __obj.asInstanceOf[GitPathToItemsCollection]
  }
}

