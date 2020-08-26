package typings.wordpressBlockEditor.anon

import org.scalablytyped.runtime.StringDictionary
import typings.wordpressBlocks.mod.BlockInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@wordpress/blocks.@wordpress/blocks.BlockInstance<{[k: string] : any}>> */
@js.native
trait PartialBlockInstancekstri extends js.Object {
  var attributes: js.UndefOr[StringDictionary[js.Any]] = js.native
  var clientId: js.UndefOr[String] = js.native
  var innerBlocks: js.UndefOr[js.Array[BlockInstance[StringDictionary[_]]]] = js.native
  var isValid: js.UndefOr[Boolean] = js.native
  var name: js.UndefOr[String] = js.native
  var originalContent: js.UndefOr[String] = js.native
}

object PartialBlockInstancekstri {
  @scala.inline
  def apply(): PartialBlockInstancekstri = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialBlockInstancekstri]
  }
  @scala.inline
  implicit class PartialBlockInstancekstriOps[Self <: PartialBlockInstancekstri] (val x: Self) extends AnyVal {
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
    def setAttributes(value: StringDictionary[js.Any]): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    @scala.inline
    def setClientId(value: String): Self = this.set("clientId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientId: Self = this.set("clientId", js.undefined)
    @scala.inline
    def setInnerBlocksVarargs(value: BlockInstance[StringDictionary[js.Any]]*): Self = this.set("innerBlocks", js.Array(value :_*))
    @scala.inline
    def setInnerBlocks(value: js.Array[BlockInstance[StringDictionary[_]]]): Self = this.set("innerBlocks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInnerBlocks: Self = this.set("innerBlocks", js.undefined)
    @scala.inline
    def setIsValid(value: Boolean): Self = this.set("isValid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsValid: Self = this.set("isValid", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOriginalContent(value: String): Self = this.set("originalContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginalContent: Self = this.set("originalContent", js.undefined)
  }
  
}

