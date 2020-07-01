package typings.wordpressBlocks.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlockInstance[T /* <: Record[String, _] */] extends js.Object {
  /**
    * Attributes for the block.
    */
  val attributes: T
  /**
    * Unique ID registered to the block.
    */
  val clientId: String
  /**
    * Array of inner blocks, if the block has any.
    */
  val innerBlocks: js.Array[BlockInstance[StringDictionary[_]]]
  /**
    * Indicates whether or not the block is valid.
    */
  val isValid: Boolean
  /**
    * The block's registered name.
    */
  val name: String
  /**
    * The parsed HTML content of the block.
    */
  val originalContent: js.UndefOr[String] = js.undefined
}

object BlockInstance {
  @scala.inline
  def apply[/* <: typings.std.Record[java.lang.String, _] */ T](
    attributes: T,
    clientId: String,
    innerBlocks: js.Array[BlockInstance[StringDictionary[_]]],
    isValid: Boolean,
    name: String,
    originalContent: String = null
  ): BlockInstance[T] = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], innerBlocks = innerBlocks.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (originalContent != null) __obj.updateDynamic("originalContent")(originalContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockInstance[T]]
  }
}

