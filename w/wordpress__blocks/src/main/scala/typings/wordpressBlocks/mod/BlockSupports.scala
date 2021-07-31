package typings.wordpressBlocks.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlockSupports extends StObject {
  
  /**
    * This property adds block controls which allow to change block's
    * alignment.
    *
    * @defaultValue false
    */
  val align: js.UndefOr[Boolean | js.Array[BlockAlignment]] = js.undefined
  
  /**
    * Enable wide alignment (depends on `align`).
    *
    * @defaultValue true
    */
  val alignWide: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Anchors let you link directly to a specific block on a page. This
    * property adds a field to define an id for the block and a button to
    * copy the direct link.
    *
    * @defaultValue false
    */
  val anchor: js.UndefOr[Boolean] = js.undefined
  
  /**
    * By default, Gutenberg adds a class with the form
    * `.wp-block-your-block-name` to the root element of your saved
    * markup.
    *
    * @defaultValue true
    */
  val className: js.UndefOr[Boolean] = js.undefined
  
  /**
    * This property adds a field to define a custom className for the
    * block's wrapper.
    *
    * @defaultValue true
    */
  val customClassName: js.UndefOr[Boolean] = js.undefined
  
  /**
    * By default, Gutenberg will allow a block's markup to be edited
    * individually. To disable this behavior, set `html` to `false`
    *
    * @defaultValue true
    */
  val html: js.UndefOr[Boolean] = js.undefined
  
  /**
    * By default, all blocks will appear in the Gutenberg inserter. To
    * hide a block so that it can only be inserted programmatically, set
    * to false
    *
    * @defaultValue true
    */
  val inserter: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A non-multiple block can be inserted into each post, one time only.
    *
    * @defaultValue true
    */
  val multiple: js.UndefOr[Boolean] = js.undefined
  
  /**
    * By default all blocks can be converted to a reusable block.
    *
    * @defaultValue true
    */
  val reusable: js.UndefOr[Boolean] = js.undefined
}
object BlockSupports {
  
  @scala.inline
  def apply(): BlockSupports = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BlockSupports]
  }
  
  @scala.inline
  implicit class BlockSupportsMutableBuilder[Self <: BlockSupports] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlign(value: Boolean | js.Array[BlockAlignment]): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    @scala.inline
    def setAlignVarargs(value: BlockAlignment*): Self = StObject.set(x, "align", js.Array(value :_*))
    
    @scala.inline
    def setAlignWide(value: Boolean): Self = StObject.set(x, "alignWide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignWideUndefined: Self = StObject.set(x, "alignWide", js.undefined)
    
    @scala.inline
    def setAnchor(value: Boolean): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
    
    @scala.inline
    def setClassName(value: Boolean): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setCustomClassName(value: Boolean): Self = StObject.set(x, "customClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomClassNameUndefined: Self = StObject.set(x, "customClassName", js.undefined)
    
    @scala.inline
    def setHtml(value: Boolean): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
    
    @scala.inline
    def setInserter(value: Boolean): Self = StObject.set(x, "inserter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInserterUndefined: Self = StObject.set(x, "inserter", js.undefined)
    
    @scala.inline
    def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
    
    @scala.inline
    def setReusable(value: Boolean): Self = StObject.set(x, "reusable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReusableUndefined: Self = StObject.set(x, "reusable", js.undefined)
  }
}
