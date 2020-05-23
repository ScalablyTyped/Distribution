package typings.wordpressBlocks.blockContentProviderMod.BlockContentProvider

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import typings.wordpressBlocks.mod.BlockInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var children: ReactNode
  var innerBlocks: js.Array[BlockInstance[StringDictionary[_]]]
}

object Props {
  @scala.inline
  def apply(innerBlocks: js.Array[BlockInstance[StringDictionary[_]]], children: ReactNode = null): Props = {
    val __obj = js.Dynamic.literal(innerBlocks = innerBlocks.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

