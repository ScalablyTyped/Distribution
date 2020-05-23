package typings.typescriptCollections.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Nodes extends js.Object {
  var nodes: StringDictionary[js.Array[String]]
  var rootIds: js.Array[String]
}

object Nodes {
  @scala.inline
  def apply(nodes: StringDictionary[js.Array[String]], rootIds: js.Array[String]): Nodes = {
    val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any], rootIds = rootIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[Nodes]
  }
}

