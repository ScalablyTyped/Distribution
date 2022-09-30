package typings.wordpressBlocks.mod

import typings.wordpressBlocks.anon.PartialColorProps
import typings.wordpressBlocks.anon.PartialSpacingProps
import typings.wordpressBlocks.anon.PartialTypographyProps
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
    * This value signals that a block supports some of the properties
    * related to color. When it does, the block editor will show
    * UI controls for the user to set their values.
    *
    * @note The `background` and `text` keys have a default value
    * of `true`, so if the color property is present they’ll also
    * be considered enabled.
    */
  val color: js.UndefOr[PartialColorProps] = js.undefined
  
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
    * A block may want to disable the ability to toggle the lock state.
    * It can be locked/unlocked by a user from the block “Options”
    * dropdown by default. To disable this behavior, set `lock` to `false`.
    *
    * @defaultValue true
    */
  val lock: js.UndefOr[Boolean] = js.undefined
  
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
  
  /**
    * This value signals that a block supports some of the CSS style
    * properties related to spacing.
    *
    * When the block declares support for a specific spacing property,
    * the attributes definition is extended to include the `style` attribute.
    */
  val spacing: js.UndefOr[PartialSpacingProps] = js.undefined
  
  /**
    * A block may want to disable the ability to toggle the lock state.
    * It can be locked/unlocked by a user from the block “Options”
    * dropdown by default. To disable this behavior, set `lock` to `false`.
    */
  val typography: js.UndefOr[PartialTypographyProps] = js.undefined
}
object BlockSupports {
  
  inline def apply(): BlockSupports = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BlockSupports]
  }
  
  extension [Self <: BlockSupports](x: Self) {
    
    inline def setAlign(value: Boolean | js.Array[BlockAlignment]): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setAlignVarargs(value: BlockAlignment*): Self = StObject.set(x, "align", js.Array(value*))
    
    inline def setAlignWide(value: Boolean): Self = StObject.set(x, "alignWide", value.asInstanceOf[js.Any])
    
    inline def setAlignWideUndefined: Self = StObject.set(x, "alignWide", js.undefined)
    
    inline def setAnchor(value: Boolean): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    inline def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
    
    inline def setClassName(value: Boolean): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setColor(value: PartialColorProps): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setCustomClassName(value: Boolean): Self = StObject.set(x, "customClassName", value.asInstanceOf[js.Any])
    
    inline def setCustomClassNameUndefined: Self = StObject.set(x, "customClassName", js.undefined)
    
    inline def setHtml(value: Boolean): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
    
    inline def setInserter(value: Boolean): Self = StObject.set(x, "inserter", value.asInstanceOf[js.Any])
    
    inline def setInserterUndefined: Self = StObject.set(x, "inserter", js.undefined)
    
    inline def setLock(value: Boolean): Self = StObject.set(x, "lock", value.asInstanceOf[js.Any])
    
    inline def setLockUndefined: Self = StObject.set(x, "lock", js.undefined)
    
    inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    
    inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
    
    inline def setReusable(value: Boolean): Self = StObject.set(x, "reusable", value.asInstanceOf[js.Any])
    
    inline def setReusableUndefined: Self = StObject.set(x, "reusable", js.undefined)
    
    inline def setSpacing(value: PartialSpacingProps): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    
    inline def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
    
    inline def setTypography(value: PartialTypographyProps): Self = StObject.set(x, "typography", value.asInstanceOf[js.Any])
    
    inline def setTypographyUndefined: Self = StObject.set(x, "typography", js.undefined)
  }
}
