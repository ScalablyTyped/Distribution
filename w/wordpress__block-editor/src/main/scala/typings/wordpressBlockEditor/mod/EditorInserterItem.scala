package typings.wordpressBlockEditor.mod

import typings.std.Record
import typings.wordpressBlocks.mod.BlockIconNormalized
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EditorInserterItem extends js.Object {
  
  /**
    * Block category that the item is associated with.
    */
  var category: String = js.native
  
  /**
    * Hueristic that combines frequency and recency.
    */
  var frecency: Double = js.native
  
  var hasChildBlocksWithInserterSupport: Boolean = js.native
  
  /**
    * Icon for the item, as it appears in the inserter.
    */
  var icon: BlockIconNormalized = js.native
  
  /**
    * Unique identifier for the item.
    */
  var id: String = js.native
  
  /**
    * Attributes to pass to the newly created block.
    */
  var initialAttributes: Record[String, _] = js.native
  
  /**
    * Whether or not the user should be prevented from inserting this item.
    */
  var isDisabled: Boolean = js.native
  
  /**
    * Keywords that can be searched to find this item.
    */
  var keywords: js.Array[String] = js.native
  
  /**
    * The type of block to create.
    */
  var name: String = js.native
  
  /**
    * Title of the item, as it appears in the inserter.
    */
  var title: String = js.native
  
  /**
    * How useful we think this item is, between 0 and 3.
    */
  var utility: Double = js.native
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
  
  @scala.inline
  implicit class EditorInserterItemOps[Self <: EditorInserterItem] (val x: Self) extends AnyVal {
    
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
    def setCategory(value: String): Self = this.set("category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrecency(value: Double): Self = this.set("frecency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasChildBlocksWithInserterSupport(value: Boolean): Self = this.set("hasChildBlocksWithInserterSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIcon(value: BlockIconNormalized): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialAttributes(value: Record[String, _]): Self = this.set("initialAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDisabled(value: Boolean): Self = this.set("isDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeywordsVarargs(value: String*): Self = this.set("keywords", js.Array(value :_*))
    
    @scala.inline
    def setKeywords(value: js.Array[String]): Self = this.set("keywords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUtility(value: Double): Self = this.set("utility", value.asInstanceOf[js.Any])
  }
}
