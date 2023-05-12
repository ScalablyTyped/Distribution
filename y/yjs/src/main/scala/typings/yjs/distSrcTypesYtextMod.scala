package typings.yjs

import org.scalablytyped.runtime.StringDictionary
import typings.std.Map
import typings.std.Set
import typings.yjs.anon.Sanitize
import typings.yjs.distSrcStructsItemMod.Item
import typings.yjs.distSrcTypesAbstractTypeMod.AbstractType
import typings.yjs.distSrcTypesAbstractTypeMod.ArraySearchMarker
import typings.yjs.distSrcUtilsIDMod.ID
import typings.yjs.distSrcUtilsSnapshotMod.Snapshot_
import typings.yjs.distSrcUtilsTransactionMod.Transaction
import typings.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV1
import typings.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV2
import typings.yjs.distSrcUtilsYeventMod.YEvent
import typings.yjs.yjsStrings.added
import typings.yjs.yjsStrings.removed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTypesYtextMod {
  
  @JSImport("yjs/dist/src/types/YText", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("yjs/dist/src/types/YText", "ItemTextListPosition")
  @js.native
  open class ItemTextListPosition protected () extends StObject {
    def this(left: Null, right: Null, index: Double, currentAttributes: Map[String, Any]) = this()
    def this(left: Null, right: Item, index: Double, currentAttributes: Map[String, Any]) = this()
    def this(left: Item, right: Null, index: Double, currentAttributes: Map[String, Any]) = this()
    /**
      * @param {Item|null} left
      * @param {Item|null} right
      * @param {number} index
      * @param {Map<string,any>} currentAttributes
      */
    def this(left: Item, right: Item, index: Double, currentAttributes: Map[String, Any]) = this()
    
    var currentAttributes: Map[String, Any] = js.native
    
    /**
      * Only call this if you know that this.right is defined
      */
    def forward(): Unit = js.native
    
    var index: Double = js.native
    
    var left: Item | Null = js.native
    
    var right: Item | Null = js.native
  }
  
  @JSImport("yjs/dist/src/types/YText", "YText")
  @js.native
  /**
    * @param {String} [string] The initial value of the YText.
    */
  open class YText () extends AbstractType[YTextEvent] {
    def this(string: String) = this()
    
    /**
      * Array of pending operations on this type
      * @type {Array<function():void>?}
      */
    var _pending: js.Array[js.Function0[Unit]] | Null = js.native
    
    /**
      * @type {Array<ArraySearchMarker>}
      */
    @JSName("_searchMarker")
    var _searchMarker_YText: js.Array[ArraySearchMarker] = js.native
    
    /**
      * Apply a {@link Delta} on this shared YText type.
      *
      * @param {any} delta The changes to apply on this element.
      * @param {object}  opts
      * @param {boolean} [opts.sanitize] Sanitize input delta. Removes ending newlines if set to true.
      *
      *
      * @public
      */
    def applyDelta(delta: Any): Unit = js.native
    def applyDelta(delta: Any, param1: Sanitize): Unit = js.native
    
    /**
      * Deletes text starting from an index.
      *
      * @param {number} index Index at which to start deleting.
      * @param {number} length The number of characters to remove. Defaults to 1.
      *
      * @public
      */
    def delete(index: Double, length: Double): Unit = js.native
    
    /**
      * Assigns properties to a range of text.
      *
      * @param {number} index The position where to start formatting.
      * @param {number} length The amount of characters to assign properties to.
      * @param {TextAttributes} attributes Attribute information to apply on the
      *                                    text.
      *
      * @public
      */
    def format(index: Double, length: Double, attributes: TextAttributes): Unit = js.native
    
    /**
      * Returns an attribute value that belongs to the attribute name.
      *
      * @note Xml-Text nodes don't have attributes. You can use this feature to assign properties to complete text-blocks.
      *
      * @param {String} attributeName The attribute name that identifies the
      *                               queried value.
      * @return {any} The queried attribute value.
      *
      * @public
      */
    def getAttribute(attributeName: String): Any = js.native
    
    /**
      * Returns all attribute name/value pairs in a JSON Object.
      *
      * @note Xml-Text nodes don't have attributes. You can use this feature to assign properties to complete text-blocks.
      *
      * @return {Object<string, any>} A JSON Object that describes the attributes.
      *
      * @public
      */
    def getAttributes(): StringDictionary[Any] = js.native
    
    /**
      * Insert text at a given index.
      *
      * @param {number} index The index at which to start inserting.
      * @param {String} text The text to insert at the specified position.
      * @param {TextAttributes} [attributes] Optionally define some formatting
      *                                    information to apply on the inserted
      *                                    Text.
      * @public
      */
    def insert(index: Double, text: String): Unit = js.native
    def insert(index: Double, text: String, attributes: js.Object): Unit = js.native
    
    /**
      * Inserts an embed at a index.
      *
      * @param {number} index The index to insert the embed at.
      * @param {Object | AbstractType<any>} embed The Object that represents the embed.
      * @param {TextAttributes} attributes Attribute information to apply on the
      *                                    embed
      *
      * @public
      */
    def insertEmbed(index: Double, embed: js.Object): Unit = js.native
    def insertEmbed(index: Double, embed: js.Object, attributes: TextAttributes): Unit = js.native
    def insertEmbed(index: Double, embed: AbstractType[Any]): Unit = js.native
    def insertEmbed(index: Double, embed: AbstractType[Any], attributes: TextAttributes): Unit = js.native
    
    /**
      * Number of characters of this text type.
      *
      * @type {number}
      */
    def length: Double = js.native
    
    /**
      * Removes an attribute.
      *
      * @note Xml-Text nodes don't have attributes. You can use this feature to assign properties to complete text-blocks.
      *
      * @param {String} attributeName The attribute name that is to be removed.
      *
      * @public
      */
    def removeAttribute(attributeName: String): Unit = js.native
    
    /**
      * Sets or updates an attribute.
      *
      * @note Xml-Text nodes don't have attributes. You can use this feature to assign properties to complete text-blocks.
      *
      * @param {String} attributeName The attribute name that is to be set.
      * @param {any} attributeValue The attribute value that is to be set.
      *
      * @public
      */
    def setAttribute(attributeName: String, attributeValue: Any): Unit = js.native
    
    /**
      * Returns the Delta representation of this YText type.
      *
      * @param {Snapshot} [snapshot]
      * @param {Snapshot} [prevSnapshot]
      * @param {function('removed' | 'added', ID):any} [computeYChange]
      * @return {any} The Delta representation of this type.
      *
      * @public
      */
    def toDelta(): Any = js.native
    def toDelta(
      snapshot: Unit,
      prevSnapshot: Unit,
      computeYChange: js.Function2[/* arg0 */ removed | added, /* arg1 */ ID, Any]
    ): Any = js.native
    def toDelta(snapshot: Unit, prevSnapshot: Snapshot_): Any = js.native
    def toDelta(
      snapshot: Unit,
      prevSnapshot: Snapshot_,
      computeYChange: js.Function2[/* arg0 */ removed | added, /* arg1 */ ID, Any]
    ): Any = js.native
    def toDelta(snapshot: Snapshot_): Any = js.native
    def toDelta(
      snapshot: Snapshot_,
      prevSnapshot: Unit,
      computeYChange: js.Function2[/* arg0 */ removed | added, /* arg1 */ ID, Any]
    ): Any = js.native
    def toDelta(snapshot: Snapshot_, prevSnapshot: Snapshot_): Any = js.native
    def toDelta(
      snapshot: Snapshot_,
      prevSnapshot: Snapshot_,
      computeYChange: js.Function2[/* arg0 */ removed | added, /* arg1 */ ID, Any]
    ): Any = js.native
  }
  
  @JSImport("yjs/dist/src/types/YText", "YTextEvent")
  @js.native
  open class YTextEvent protected () extends YEvent[YText] {
    /**
      * @param {YText} ytext
      * @param {Transaction} transaction
      * @param {Set<any>} subs The keys that changed
      */
    def this(ytext: YText, transaction: Transaction, subs: Set[Any]) = this()
    
    /**
      * Whether the children changed.
      * @type {Boolean}
      * @private
      */
    /* private */ var childListChanged: Any = js.native
    
    /**
      * Set of all changed attributes.
      * @type {Set<string>}
      */
    var keysChanged: Set[String] = js.native
  }
  
  inline def cleanupYTextFormatting(`type`: YText): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("cleanupYTextFormatting")(`type`.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def readYText(_decoder: UpdateDecoderV1): YText = ^.asInstanceOf[js.Dynamic].applyDynamic("readYText")(_decoder.asInstanceOf[js.Any]).asInstanceOf[YText]
  inline def readYText(_decoder: UpdateDecoderV2): YText = ^.asInstanceOf[js.Dynamic].applyDynamic("readYText")(_decoder.asInstanceOf[js.Any]).asInstanceOf[YText]
  
  type TextAttributes = js.Object
}
