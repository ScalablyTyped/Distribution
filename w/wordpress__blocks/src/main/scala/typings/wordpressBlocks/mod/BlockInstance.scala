package typings.wordpressBlocks.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlockInstance[T /* <: Record[String, _] */] extends js.Object {
  /**
    * Attributes for the block.
    */
  val attributes: T = js.native
  /**
    * Unique ID registered to the block.
    */
  val clientId: String = js.native
  /**
    * Array of inner blocks, if the block has any.
    */
  val innerBlocks: js.Array[BlockInstance[StringDictionary[_]]] = js.native
  /**
    * Indicates whether or not the block is valid.
    */
  val isValid: Boolean = js.native
  /**
    * The block's registered name.
    */
  val name: String = js.native
  /**
    * The parsed HTML content of the block.
    */
  val originalContent: js.UndefOr[String] = js.native
}

object BlockInstance {
  @scala.inline
  def apply[/* <: typings.std.Record[java.lang.String, _] */ T](
    attributes: T,
    clientId: String,
    innerBlocks: js.Array[BlockInstance[StringDictionary[_]]],
    isValid: Boolean,
    name: String
  ): BlockInstance[T] = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], innerBlocks = innerBlocks.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockInstance[T]]
  }
  @scala.inline
  implicit class BlockInstanceOps[Self <: BlockInstance[_], /* <: typings.std.Record[java.lang.String, _] */ T] (val x: Self with BlockInstance[T]) extends AnyVal {
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
    def setAttributes(value: T): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientId(value: String): Self = this.set("clientId", value.asInstanceOf[js.Any])
    @scala.inline
    def setInnerBlocksVarargs(value: BlockInstance[StringDictionary[js.Any]]*): Self = this.set("innerBlocks", js.Array(value :_*))
    @scala.inline
    def setInnerBlocks(value: js.Array[BlockInstance[StringDictionary[_]]]): Self = this.set("innerBlocks", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsValid(value: Boolean): Self = this.set("isValid", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOriginalContent(value: String): Self = this.set("originalContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginalContent: Self = this.set("originalContent", js.undefined)
  }
  
}

