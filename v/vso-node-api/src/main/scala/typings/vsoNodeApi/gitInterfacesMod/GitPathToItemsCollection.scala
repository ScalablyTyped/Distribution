package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitPathToItemsCollection extends js.Object {
  var items: StringDictionary[js.Array[GitItem]]
}

object GitPathToItemsCollection {
  @scala.inline
  def apply(items: StringDictionary[js.Array[GitItem]]): GitPathToItemsCollection = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitPathToItemsCollection]
  }
}

