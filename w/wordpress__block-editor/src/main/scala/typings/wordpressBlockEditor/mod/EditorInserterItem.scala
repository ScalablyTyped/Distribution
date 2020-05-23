package typings.wordpressBlockEditor.mod

import typings.std.Record
import typings.wordpressBlocks.mod.BlockIconNormalized
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorInserterItem extends js.Object {
  /**
    * Block category that the item is associated with.
    */
  var category: String
  /**
    * Hueristic that combines frequency and recency.
    */
  var frecency: Double
  var hasChildBlocksWithInserterSupport: Boolean
  /**
    * Icon for the item, as it appears in the inserter.
    */
  var icon: BlockIconNormalized
  /**
    * Unique identifier for the item.
    */
  var id: String
  /**
    * Attributes to pass to the newly created block.
    */
  var initialAttributes: Record[String, _]
  /**
    * Whether or not the user should be prevented from inserting this item.
    */
  var isDisabled: Boolean
  /**
    * Keywords that can be searched to find this item.
    */
  var keywords: js.Array[String]
  /**
    * The type of block to create.
    */
  var name: String
  /**
    * Title of the item, as it appears in the inserter.
    */
  var title: String
  /**
    * How useful we think this item is, between 0 and 3.
    */
  var utility: Double
}

object EditorInserterItem {
  @scala.inline
  def apply(
    category: String,
    frecency: Double,
    hasChildBlocksWithInserterSupport: Boolean,
    icon: BlockIconNormalized,
    id: String,
    initialAttributes: Record[String, _],
    isDisabled: Boolean,
    keywords: js.Array[String],
    name: String,
    title: String,
    utility: Double
  ): EditorInserterItem = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], frecency = frecency.asInstanceOf[js.Any], hasChildBlocksWithInserterSupport = hasChildBlocksWithInserterSupport.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], initialAttributes = initialAttributes.asInstanceOf[js.Any], isDisabled = isDisabled.asInstanceOf[js.Any], keywords = keywords.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], utility = utility.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorInserterItem]
  }
}

