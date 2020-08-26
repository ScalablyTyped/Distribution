package typings.wordpressBlocks.blockContentProviderMod.BlockContentProvider

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import typings.wordpressBlocks.mod.BlockInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Props extends js.Object {
  var children: ReactNode = js.native
  var innerBlocks: js.Array[BlockInstance[StringDictionary[_]]] = js.native
}

object Props {
  @scala.inline
  def apply(innerBlocks: js.Array[BlockInstance[StringDictionary[_]]]): Props = {
    val __obj = js.Dynamic.literal(innerBlocks = innerBlocks.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setInnerBlocksVarargs(value: BlockInstance[StringDictionary[js.Any]]*): Self = this.set("innerBlocks", js.Array(value :_*))
    @scala.inline
    def setInnerBlocks(value: js.Array[BlockInstance[StringDictionary[_]]]): Self = this.set("innerBlocks", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
  }
  
}

