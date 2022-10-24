package typings.yjs

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typings.lib0.decodingMod.Decoder
import typings.std.Set
import typings.yjs.anon.Ds
import typings.yjs.anon.From
import typings.yjs.distSrcInternalsMod.YArray
import typings.yjs.distSrcInternalsMod.YMap
import typings.yjs.distSrcInternalsMod.YText
import typings.yjs.distSrcInternalsMod.YXmlElement
import typings.yjs.distSrcInternalsMod.YXmlFragment
import typings.yjs.distSrcInternalsMod.YXmlHook
import typings.yjs.distSrcInternalsMod.YXmlText
import typings.yjs.distSrcStructsItemMod.AbstractContent
import typings.yjs.distSrcUtilsDeleteSetMod.DeleteSet
import typings.yjs.distSrcUtilsDocMod.DocOpts
import typings.yjs.distSrcUtilsStructStoreMod.StructStore
import typings.yjs.distSrcUtilsUndoManagerMod.UndoManagerOptions
import typings.yjs.distSrcUtilsUpdateDecoderMod.DSDecoderV1
import typings.yjs.distSrcUtilsUpdateDecoderMod.DSDecoderV2
import typings.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV1
import typings.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV2
import typings.yjs.distSrcUtilsUpdateEncoderMod.DSEncoderV1
import typings.yjs.distSrcUtilsUpdateEncoderMod.DSEncoderV2
import typings.yjs.distSrcUtilsUpdateEncoderMod.UpdateEncoderV2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("yjs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("yjs", "AbsolutePosition")
  @js.native
  open class AbsolutePosition protected ()
    extends typings.yjs.distSrcInternalsMod.AbsolutePosition {
    /**
      * @param {AbstractType<any>} type
      * @param {number} index
      * @param {number} [assoc]
      */
    def this(`type`: typings.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any], index: Double) = this()
    def this(`type`: typings.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any], index: Double, assoc: Double) = this()
  }
  
  @JSImport("yjs", "AbstractConnector")
  @js.native
  open class AbstractConnector protected ()
    extends typings.yjs.distSrcInternalsMod.AbstractConnector {
    /**
      * @param {Doc} ydoc
      * @param {any} awareness
      */
    def this(ydoc: typings.yjs.distSrcUtilsDocMod.Doc, awareness: Any) = this()
  }
  
  @JSImport("yjs", "AbstractStruct")
  @js.native
  open class AbstractStruct protected ()
    extends typings.yjs.distSrcInternalsMod.AbstractStruct {
    /**
      * @param {ID} id
      * @param {number} length
      */
    def this(id: typings.yjs.distSrcUtilsIDMod.ID, length: Double) = this()
  }
  
  @JSImport("yjs", "AbstractType")
  @js.native
  open class AbstractType[EventType] ()
    extends typings.yjs.distSrcInternalsMod.AbstractType[EventType]
  
  @JSImport("yjs", "Array")
  @js.native
  open class Array[T] () extends YArray[T]
  /* static members */
  object Array {
    
    @JSImport("yjs", "Array")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Construct a new YArray containing the specified items.
      * @template T
      * @param {Array<T>} items
      * @return {YArray<T>}
      */
    inline def from[T_1](items: js.Array[T_1]): typings.yjs.distSrcTypesYarrayMod.YArray[T_1] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(items.asInstanceOf[js.Any]).asInstanceOf[typings.yjs.distSrcTypesYarrayMod.YArray[T_1]]
  }
  
  @JSImport("yjs", "ContentAny")
  @js.native
  open class ContentAny protected ()
    extends typings.yjs.distSrcInternalsMod.ContentAny {
    /**
      * @param {Array<any>} arr
      */
    def this(arr: js.Array[Any]) = this()
  }
  
  @JSImport("yjs", "ContentBinary")
  @js.native
  open class ContentBinary protected ()
    extends typings.yjs.distSrcInternalsMod.ContentBinary {
    /**
      * @param {Uint8Array} content
      */
    def this(content: js.typedarray.Uint8Array) = this()
  }
  
  @JSImport("yjs", "ContentDeleted")
  @js.native
  open class ContentDeleted protected ()
    extends typings.yjs.distSrcInternalsMod.ContentDeleted {
    /**
      * @param {number} len
      */
    def this(len: Double) = this()
  }
  
  @JSImport("yjs", "ContentEmbed")
  @js.native
  open class ContentEmbed protected ()
    extends typings.yjs.distSrcInternalsMod.ContentEmbed {
    /**
      * @param {Object} embed
      */
    def this(embed: js.Object) = this()
  }
  
  @JSImport("yjs", "ContentFormat")
  @js.native
  open class ContentFormat protected ()
    extends typings.yjs.distSrcInternalsMod.ContentFormat {
    /**
      * @param {string} key
      * @param {Object} value
      */
    def this(key: String, value: js.Object) = this()
  }
  
  @JSImport("yjs", "ContentJSON")
  @js.native
  open class ContentJSON protected ()
    extends typings.yjs.distSrcInternalsMod.ContentJSON {
    /**
      * @param {Array<any>} arr
      */
    def this(arr: js.Array[Any]) = this()
  }
  
  @JSImport("yjs", "ContentString")
  @js.native
  open class ContentString protected ()
    extends typings.yjs.distSrcInternalsMod.ContentString {
    /**
      * @param {string} str
      */
    def this(str: String) = this()
  }
  
  @JSImport("yjs", "ContentType")
  @js.native
  open class ContentType protected ()
    extends typings.yjs.distSrcInternalsMod.ContentType {
    /**
      * @param {AbstractType<any>} type
      */
    def this(`type`: typings.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any]) = this()
  }
  
  @JSImport("yjs", "Doc")
  @js.native
  /**
    * @param {DocOpts} [opts] configuration
    */
  open class Doc ()
    extends typings.yjs.distSrcInternalsMod.Doc {
    def this(param0: DocOpts) = this()
  }
  
  @JSImport("yjs", "GC")
  @js.native
  open class GC protected ()
    extends typings.yjs.distSrcInternalsMod.GC {
    /**
      * @param {ID} id
      * @param {number} length
      */
    def this(id: typings.yjs.distSrcUtilsIDMod.ID, length: Double) = this()
  }
  
  @JSImport("yjs", "ID")
  @js.native
  open class ID protected ()
    extends typings.yjs.distSrcInternalsMod.ID {
    /**
      * @param {number} client client id
      * @param {number} clock unique per client id, continuous number
      */
    def this(client: Double, clock: Double) = this()
  }
  
  @JSImport("yjs", "Item")
  @js.native
  open class Item protected ()
    extends typings.yjs.distSrcInternalsMod.Item {
    /**
      * @param {ID} id
      * @param {Item | null} left
      * @param {ID | null} origin
      * @param {Item | null} right
      * @param {ID | null} rightOrigin
      * @param {AbstractType<any>|ID|null} parent Is a type if integrated, is null if it is possible to copy parent from left or right, is ID before integration to search for it.
      * @param {string | null} parentSub
      * @param {AbstractContent} content
      */
    def this(
      id: typings.yjs.distSrcUtilsIDMod.ID,
      left: typings.yjs.distSrcStructsItemMod.Item | Null,
      origin: typings.yjs.distSrcUtilsIDMod.ID | Null,
      right: typings.yjs.distSrcStructsItemMod.Item | Null,
      rightOrigin: typings.yjs.distSrcUtilsIDMod.ID | Null,
      parent: typings.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any] | typings.yjs.distSrcUtilsIDMod.ID | Null,
      parentSub: String | Null,
      content: AbstractContent
    ) = this()
  }
  
  @JSImport("yjs", "Map")
  @js.native
  /**
    *
    * @param {Iterable<readonly [string, any]>=} entries - an optional iterable to initialize the YMap
    */
  open class Map[MapType] () extends YMap[MapType] {
    def this(entries: js.Iterable[js.Tuple2[String, Any]]) = this()
  }
  
  @JSImport("yjs", "PermanentUserData")
  @js.native
  open class PermanentUserData protected ()
    extends typings.yjs.distSrcInternalsMod.PermanentUserData {
    /**
      * @param {Doc} doc
      * @param {YMap<any>} [storeType]
      */
    def this(doc: typings.yjs.distSrcUtilsDocMod.Doc) = this()
    def this(doc: typings.yjs.distSrcUtilsDocMod.Doc, storeType: typings.yjs.distSrcTypesYmapMod.YMap[Any]) = this()
  }
  
  @JSImport("yjs", "RelativePosition")
  @js.native
  /**
    * @param {ID|null} type
    * @param {string|null} tname
    * @param {ID|null} item
    * @param {number} assoc
    */
  open class RelativePosition ()
    extends typings.yjs.distSrcInternalsMod.RelativePosition {
    def this(`type`: typings.yjs.distSrcUtilsIDMod.ID) = this()
    def this(`type`: Null, tname: String) = this()
    def this(`type`: typings.yjs.distSrcUtilsIDMod.ID, tname: String) = this()
    def this(`type`: Null, tname: String, item: typings.yjs.distSrcUtilsIDMod.ID) = this()
    def this(`type`: Null, tname: Null, item: typings.yjs.distSrcUtilsIDMod.ID) = this()
    def this(`type`: typings.yjs.distSrcUtilsIDMod.ID, tname: String, item: typings.yjs.distSrcUtilsIDMod.ID) = this()
    def this(`type`: typings.yjs.distSrcUtilsIDMod.ID, tname: Null, item: typings.yjs.distSrcUtilsIDMod.ID) = this()
    def this(`type`: Null, tname: String, item: Null, assoc: Double) = this()
    def this(`type`: Null, tname: String, item: typings.yjs.distSrcUtilsIDMod.ID, assoc: Double) = this()
    def this(`type`: Null, tname: Null, item: Null, assoc: Double) = this()
    def this(`type`: Null, tname: Null, item: typings.yjs.distSrcUtilsIDMod.ID, assoc: Double) = this()
    def this(`type`: typings.yjs.distSrcUtilsIDMod.ID, tname: String, item: Null, assoc: Double) = this()
    def this(
      `type`: typings.yjs.distSrcUtilsIDMod.ID,
      tname: String,
      item: typings.yjs.distSrcUtilsIDMod.ID,
      assoc: Double
    ) = this()
    def this(`type`: typings.yjs.distSrcUtilsIDMod.ID, tname: Null, item: Null, assoc: Double) = this()
    def this(
      `type`: typings.yjs.distSrcUtilsIDMod.ID,
      tname: Null,
      item: typings.yjs.distSrcUtilsIDMod.ID,
      assoc: Double
    ) = this()
  }
  
  @JSImport("yjs", "Snapshot")
  @js.native
  open class Snapshot_ protected ()
    extends typings.yjs.distSrcInternalsMod.Snapshot_ {
    /**
      * @param {DeleteSet} ds
      * @param {Map<number,number>} sv state map
      */
    def this(ds: DeleteSet, sv: typings.std.Map[Double, Double]) = this()
  }
  
  @JSImport("yjs", "Text")
  @js.native
  /**
    * @param {String} [string] The initial value of the YText.
    */
  open class Text () extends YText {
    def this(string: String) = this()
  }
  
  @JSImport("yjs", "Transaction")
  @js.native
  open class Transaction protected ()
    extends typings.yjs.distSrcInternalsMod.Transaction {
    /**
      * @param {Doc} doc
      * @param {any} origin
      * @param {boolean} local
      */
    def this(doc: typings.yjs.distSrcUtilsDocMod.Doc, origin: Any, local: Boolean) = this()
  }
  
  @JSImport("yjs", "UndoManager")
  @js.native
  open class UndoManager protected ()
    extends typings.yjs.distSrcInternalsMod.UndoManager {
    def this(typeScope: js.Array[typings.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any]]) = this()
    /**
      * @param {AbstractType<any>|Array<AbstractType<any>>} typeScope Accepts either a single type, or an array of types
      * @param {UndoManagerOptions} options
      */
    def this(typeScope: typings.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any]) = this()
    def this(
      typeScope: js.Array[typings.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any]],
      param1: UndoManagerOptions
    ) = this()
    def this(typeScope: typings.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any], param1: UndoManagerOptions) = this()
  }
  
  @JSImport("yjs", "UpdateEncoderV1")
  @js.native
  open class UpdateEncoderV1 ()
    extends typings.yjs.distSrcInternalsMod.UpdateEncoderV1
  
  @JSImport("yjs", "XmlElement")
  @js.native
  open class XmlElement () extends YXmlElement {
    def this(nodeName: String) = this()
  }
  
  @JSImport("yjs", "XmlFragment")
  @js.native
  open class XmlFragment () extends YXmlFragment
  
  @JSImport("yjs", "XmlHook")
  @js.native
  open class XmlHook protected () extends YXmlHook {
    /**
      * @param {string} hookName nodeName of the Dom Node.
      */
    def this(hookName: String) = this()
  }
  
  @JSImport("yjs", "XmlText")
  @js.native
  /**
    * @param {String} [string] The initial value of the YText.
    */
  open class XmlText () extends YXmlText {
    def this(string: String) = this()
  }
  
  @JSImport("yjs", "YArrayEvent")
  @js.native
  open class YArrayEvent[T] protected ()
    extends typings.yjs.distSrcInternalsMod.YArrayEvent[T] {
    /**
      * @param {YArray<T>} yarray The changed type
      * @param {Transaction} transaction The transaction object
      */
    def this(
      yarray: typings.yjs.distSrcTypesYarrayMod.YArray[T],
      transaction: typings.yjs.distSrcUtilsTransactionMod.Transaction
    ) = this()
  }
  
  @JSImport("yjs", "YEvent")
  @js.native
  open class YEvent[T /* <: typings.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any] */] protected ()
    extends typings.yjs.distSrcInternalsMod.YEvent[T] {
    /**
      * @param {T} target The changed type.
      * @param {Transaction} transaction
      */
    def this(target: T, transaction: typings.yjs.distSrcUtilsTransactionMod.Transaction) = this()
  }
  
  @JSImport("yjs", "YMapEvent")
  @js.native
  open class YMapEvent[T] protected ()
    extends typings.yjs.distSrcInternalsMod.YMapEvent[T] {
    /**
      * @param {YMap<T>} ymap The YArray that changed.
      * @param {Transaction} transaction
      * @param {Set<any>} subs The keys that changed.
      */
    def this(
      ymap: typings.yjs.distSrcTypesYmapMod.YMap[T],
      transaction: typings.yjs.distSrcUtilsTransactionMod.Transaction,
      subs: Set[Any]
    ) = this()
  }
  
  @JSImport("yjs", "YTextEvent")
  @js.native
  open class YTextEvent protected ()
    extends typings.yjs.distSrcInternalsMod.YTextEvent {
    /**
      * @param {YText} ytext
      * @param {Transaction} transaction
      * @param {Set<any>} subs The keys that changed
      */
    def this(
      ytext: typings.yjs.distSrcTypesYtextMod.YText,
      transaction: typings.yjs.distSrcUtilsTransactionMod.Transaction,
      subs: Set[Any]
    ) = this()
  }
  
  @JSImport("yjs", "YXmlEvent")
  @js.native
  open class YXmlEvent protected ()
    extends typings.yjs.distSrcInternalsMod.YXmlEvent {
    /**
      * @param {YXmlElement|YXmlText|YXmlFragment} target The target on which the event is created.
      * @param {Set<string|null>} subs The set of changed attributes. `null` is included if the
      *                   child list changed.
      * @param {Transaction} transaction The transaction instance with wich the
      *                                  change was created.
      */
    def this(
      target: typings.yjs.distSrcTypesYxmlelementMod.YXmlElement,
      subs: Set[String | Null],
      transaction: typings.yjs.distSrcUtilsTransactionMod.Transaction
    ) = this()
    def this(
      target: typings.yjs.distSrcTypesYxmlfragmentMod.YXmlFragment,
      subs: Set[String | Null],
      transaction: typings.yjs.distSrcUtilsTransactionMod.Transaction
    ) = this()
    def this(
      target: typings.yjs.distSrcTypesYxmltextMod.YXmlText,
      subs: Set[String | Null],
      transaction: typings.yjs.distSrcUtilsTransactionMod.Transaction
    ) = this()
  }
  
  inline def applyUpdate(ydoc: typings.yjs.distSrcUtilsDocMod.Doc, update: js.typedarray.Uint8Array): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyUpdate")(ydoc.asInstanceOf[js.Any], update.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def applyUpdate(ydoc: typings.yjs.distSrcUtilsDocMod.Doc, update: js.typedarray.Uint8Array, transactionOrigin: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyUpdate")(ydoc.asInstanceOf[js.Any], update.asInstanceOf[js.Any], transactionOrigin.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def applyUpdateV2(ydoc: typings.yjs.distSrcUtilsDocMod.Doc, update: js.typedarray.Uint8Array): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyUpdateV2")(ydoc.asInstanceOf[js.Any], update.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def applyUpdateV2(ydoc: typings.yjs.distSrcUtilsDocMod.Doc, update: js.typedarray.Uint8Array, transactionOrigin: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyUpdateV2")(ydoc.asInstanceOf[js.Any], update.asInstanceOf[js.Any], transactionOrigin.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def applyUpdateV2(
    ydoc: typings.yjs.distSrcUtilsDocMod.Doc,
    update: js.typedarray.Uint8Array,
    transactionOrigin: Any,
    YDecoder: Instantiable0[UpdateDecoderV1 | UpdateDecoderV2]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyUpdateV2")(ydoc.asInstanceOf[js.Any], update.asInstanceOf[js.Any], transactionOrigin.asInstanceOf[js.Any], YDecoder.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def applyUpdateV2(
    ydoc: typings.yjs.distSrcUtilsDocMod.Doc,
    update: js.typedarray.Uint8Array,
    transactionOrigin: Unit,
    YDecoder: Instantiable0[UpdateDecoderV1 | UpdateDecoderV2]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyUpdateV2")(ydoc.asInstanceOf[js.Any], update.asInstanceOf[js.Any], transactionOrigin.asInstanceOf[js.Any], YDecoder.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def cleanupYTextFormatting(`type`: typings.yjs.distSrcTypesYtextMod.YText): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("cleanupYTextFormatting")(`type`.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def compareIDs(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("compareIDs")().asInstanceOf[Boolean]
  inline def compareIDs(a: Null, b: typings.yjs.distSrcUtilsIDMod.ID): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compareIDs")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def compareIDs(a: typings.yjs.distSrcUtilsIDMod.ID): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("compareIDs")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def compareIDs(a: typings.yjs.distSrcUtilsIDMod.ID, b: typings.yjs.distSrcUtilsIDMod.ID): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compareIDs")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def compareRelativePositions(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("compareRelativePositions")().asInstanceOf[Boolean]
  inline def compareRelativePositions(a: Null, b: typings.yjs.distSrcUtilsRelativePositionMod.RelativePosition): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compareRelativePositions")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def compareRelativePositions(a: typings.yjs.distSrcUtilsRelativePositionMod.RelativePosition): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("compareRelativePositions")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def compareRelativePositions(
    a: typings.yjs.distSrcUtilsRelativePositionMod.RelativePosition,
    b: typings.yjs.distSrcUtilsRelativePositionMod.RelativePosition
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compareRelativePositions")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def convertUpdateFormatV1ToV2(update: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("convertUpdateFormatV1ToV2")(update.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def convertUpdateFormatV2ToV1(update: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("convertUpdateFormatV2ToV1")(update.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def createAbsolutePositionFromRelativePosition(
    rpos: typings.yjs.distSrcUtilsRelativePositionMod.RelativePosition,
    doc: typings.yjs.distSrcUtilsDocMod.Doc
  ): typings.yjs.distSrcUtilsRelativePositionMod.AbsolutePosition | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("createAbsolutePositionFromRelativePosition")(rpos.asInstanceOf[js.Any], doc.asInstanceOf[js.Any])).asInstanceOf[typings.yjs.distSrcUtilsRelativePositionMod.AbsolutePosition | Null]
  
  inline def createDeleteSet(): DeleteSet = ^.asInstanceOf[js.Dynamic].applyDynamic("createDeleteSet")().asInstanceOf[DeleteSet]
  
  inline def createDeleteSetFromStructStore(ss: StructStore): DeleteSet = ^.asInstanceOf[js.Dynamic].applyDynamic("createDeleteSetFromStructStore")(ss.asInstanceOf[js.Any]).asInstanceOf[DeleteSet]
  
  inline def createDocFromSnapshot(
    originDoc: typings.yjs.distSrcUtilsDocMod.Doc,
    snapshot: typings.yjs.distSrcUtilsSnapshotMod.Snapshot_
  ): typings.yjs.distSrcUtilsDocMod.Doc = (^.asInstanceOf[js.Dynamic].applyDynamic("createDocFromSnapshot")(originDoc.asInstanceOf[js.Any], snapshot.asInstanceOf[js.Any])).asInstanceOf[typings.yjs.distSrcUtilsDocMod.Doc]
  inline def createDocFromSnapshot(
    originDoc: typings.yjs.distSrcUtilsDocMod.Doc,
    snapshot: typings.yjs.distSrcUtilsSnapshotMod.Snapshot_,
    newDoc: typings.yjs.distSrcUtilsDocMod.Doc
  ): typings.yjs.distSrcUtilsDocMod.Doc = (^.asInstanceOf[js.Dynamic].applyDynamic("createDocFromSnapshot")(originDoc.asInstanceOf[js.Any], snapshot.asInstanceOf[js.Any], newDoc.asInstanceOf[js.Any])).asInstanceOf[typings.yjs.distSrcUtilsDocMod.Doc]
  
  inline def createID(client: Double, clock: Double): typings.yjs.distSrcUtilsIDMod.ID = (^.asInstanceOf[js.Dynamic].applyDynamic("createID")(client.asInstanceOf[js.Any], clock.asInstanceOf[js.Any])).asInstanceOf[typings.yjs.distSrcUtilsIDMod.ID]
  
  inline def createRelativePositionFromJSON(json: Any): typings.yjs.distSrcUtilsRelativePositionMod.RelativePosition = ^.asInstanceOf[js.Dynamic].applyDynamic("createRelativePositionFromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.yjs.distSrcUtilsRelativePositionMod.RelativePosition]
  
  inline def createRelativePositionFromTypeIndex(`type`: typings.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any], index: Double): typings.yjs.distSrcUtilsRelativePositionMod.RelativePosition = (^.asInstanceOf[js.Dynamic].applyDynamic("createRelativePositionFromTypeIndex")(`type`.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[typings.yjs.distSrcUtilsRelativePositionMod.RelativePosition]
  inline def createRelativePositionFromTypeIndex(`type`: typings.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any], index: Double, assoc: Double): typings.yjs.distSrcUtilsRelativePositionMod.RelativePosition = (^.asInstanceOf[js.Dynamic].applyDynamic("createRelativePositionFromTypeIndex")(`type`.asInstanceOf[js.Any], index.asInstanceOf[js.Any], assoc.asInstanceOf[js.Any])).asInstanceOf[typings.yjs.distSrcUtilsRelativePositionMod.RelativePosition]
  
  inline def createSnapshot(ds: DeleteSet, sm: typings.std.Map[Double, Double]): typings.yjs.distSrcUtilsSnapshotMod.Snapshot_ = (^.asInstanceOf[js.Dynamic].applyDynamic("createSnapshot")(ds.asInstanceOf[js.Any], sm.asInstanceOf[js.Any])).asInstanceOf[typings.yjs.distSrcUtilsSnapshotMod.Snapshot_]
  
  inline def decodeRelativePosition(uint8Array: js.typedarray.Uint8Array): typings.yjs.distSrcUtilsRelativePositionMod.RelativePosition = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeRelativePosition")(uint8Array.asInstanceOf[js.Any]).asInstanceOf[typings.yjs.distSrcUtilsRelativePositionMod.RelativePosition]
  
  inline def decodeSnapshot(buf: js.typedarray.Uint8Array): typings.yjs.distSrcUtilsSnapshotMod.Snapshot_ = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeSnapshot")(buf.asInstanceOf[js.Any]).asInstanceOf[typings.yjs.distSrcUtilsSnapshotMod.Snapshot_]
  
  inline def decodeSnapshotV2(buf: js.typedarray.Uint8Array): typings.yjs.distSrcUtilsSnapshotMod.Snapshot_ = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeSnapshotV2")(buf.asInstanceOf[js.Any]).asInstanceOf[typings.yjs.distSrcUtilsSnapshotMod.Snapshot_]
  inline def decodeSnapshotV2(buf: js.typedarray.Uint8Array, decoder: DSDecoderV1): typings.yjs.distSrcUtilsSnapshotMod.Snapshot_ = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeSnapshotV2")(buf.asInstanceOf[js.Any], decoder.asInstanceOf[js.Any])).asInstanceOf[typings.yjs.distSrcUtilsSnapshotMod.Snapshot_]
  inline def decodeSnapshotV2(buf: js.typedarray.Uint8Array, decoder: DSDecoderV2): typings.yjs.distSrcUtilsSnapshotMod.Snapshot_ = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeSnapshotV2")(buf.asInstanceOf[js.Any], decoder.asInstanceOf[js.Any])).asInstanceOf[typings.yjs.distSrcUtilsSnapshotMod.Snapshot_]
  
  inline def decodeStateVector(decodedState: js.typedarray.Uint8Array): typings.std.Map[Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeStateVector")(decodedState.asInstanceOf[js.Any]).asInstanceOf[typings.std.Map[Double, Double]]
  
  inline def decodeUpdate(update: js.typedarray.Uint8Array): Ds = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeUpdate")(update.asInstanceOf[js.Any]).asInstanceOf[Ds]
  
  inline def decodeUpdateV2(update: js.typedarray.Uint8Array): Ds = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeUpdateV2")(update.asInstanceOf[js.Any]).asInstanceOf[Ds]
  inline def decodeUpdateV2(update: js.typedarray.Uint8Array, YDecoder: Instantiable0[UpdateDecoderV1 | UpdateDecoderV2]): Ds = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeUpdateV2")(update.asInstanceOf[js.Any], YDecoder.asInstanceOf[js.Any])).asInstanceOf[Ds]
  
  inline def diffUpdate(update: js.typedarray.Uint8Array, sv: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("diffUpdate")(update.asInstanceOf[js.Any], sv.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def diffUpdateV2(update: js.typedarray.Uint8Array, sv: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("diffUpdateV2")(update.asInstanceOf[js.Any], sv.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def diffUpdateV2(
    update: js.typedarray.Uint8Array,
    sv: js.typedarray.Uint8Array,
    YDecoder: Instantiable0[UpdateDecoderV1 | UpdateDecoderV2]
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("diffUpdateV2")(update.asInstanceOf[js.Any], sv.asInstanceOf[js.Any], YDecoder.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def diffUpdateV2(
    update: js.typedarray.Uint8Array,
    sv: js.typedarray.Uint8Array,
    YDecoder: Instantiable0[UpdateDecoderV1 | UpdateDecoderV2],
    YEncoder: Instantiable0[typings.yjs.distSrcUtilsUpdateEncoderMod.UpdateEncoderV1 | UpdateEncoderV2]
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("diffUpdateV2")(update.asInstanceOf[js.Any], sv.asInstanceOf[js.Any], YDecoder.asInstanceOf[js.Any], YEncoder.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def diffUpdateV2(
    update: js.typedarray.Uint8Array,
    sv: js.typedarray.Uint8Array,
    YDecoder: Unit,
    YEncoder: Instantiable0[typings.yjs.distSrcUtilsUpdateEncoderMod.UpdateEncoderV1 | UpdateEncoderV2]
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("diffUpdateV2")(update.asInstanceOf[js.Any], sv.asInstanceOf[js.Any], YDecoder.asInstanceOf[js.Any], YEncoder.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  @JSImport("yjs", "emptySnapshot")
  @js.native
  val emptySnapshot: typings.yjs.distSrcUtilsSnapshotMod.Snapshot_ = js.native
  
  inline def encodeRelativePosition(rpos: typings.yjs.distSrcUtilsRelativePositionMod.RelativePosition): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeRelativePosition")(rpos.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def encodeSnapshot(snapshot: typings.yjs.distSrcUtilsSnapshotMod.Snapshot_): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeSnapshot")(snapshot.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def encodeSnapshotV2(snapshot: typings.yjs.distSrcUtilsSnapshotMod.Snapshot_): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeSnapshotV2")(snapshot.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def encodeSnapshotV2(snapshot: typings.yjs.distSrcUtilsSnapshotMod.Snapshot_, encoder: DSEncoderV1): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeSnapshotV2")(snapshot.asInstanceOf[js.Any], encoder.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def encodeSnapshotV2(snapshot: typings.yjs.distSrcUtilsSnapshotMod.Snapshot_, encoder: DSEncoderV2): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeSnapshotV2")(snapshot.asInstanceOf[js.Any], encoder.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def encodeStateAsUpdate(doc: typings.yjs.distSrcUtilsDocMod.Doc): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeStateAsUpdate")(doc.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def encodeStateAsUpdate(doc: typings.yjs.distSrcUtilsDocMod.Doc, encodedTargetStateVector: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeStateAsUpdate")(doc.asInstanceOf[js.Any], encodedTargetStateVector.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def encodeStateAsUpdateV2(doc: typings.yjs.distSrcUtilsDocMod.Doc): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeStateAsUpdateV2")(doc.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def encodeStateAsUpdateV2(doc: typings.yjs.distSrcUtilsDocMod.Doc, encodedTargetStateVector: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeStateAsUpdateV2")(doc.asInstanceOf[js.Any], encodedTargetStateVector.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def encodeStateAsUpdateV2(
    doc: typings.yjs.distSrcUtilsDocMod.Doc,
    encodedTargetStateVector: js.typedarray.Uint8Array,
    encoder: typings.yjs.distSrcUtilsUpdateEncoderMod.UpdateEncoderV1
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeStateAsUpdateV2")(doc.asInstanceOf[js.Any], encodedTargetStateVector.asInstanceOf[js.Any], encoder.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def encodeStateAsUpdateV2(
    doc: typings.yjs.distSrcUtilsDocMod.Doc,
    encodedTargetStateVector: js.typedarray.Uint8Array,
    encoder: UpdateEncoderV2
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeStateAsUpdateV2")(doc.asInstanceOf[js.Any], encodedTargetStateVector.asInstanceOf[js.Any], encoder.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def encodeStateAsUpdateV2(
    doc: typings.yjs.distSrcUtilsDocMod.Doc,
    encodedTargetStateVector: Unit,
    encoder: typings.yjs.distSrcUtilsUpdateEncoderMod.UpdateEncoderV1
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeStateAsUpdateV2")(doc.asInstanceOf[js.Any], encodedTargetStateVector.asInstanceOf[js.Any], encoder.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def encodeStateAsUpdateV2(doc: typings.yjs.distSrcUtilsDocMod.Doc, encodedTargetStateVector: Unit, encoder: UpdateEncoderV2): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeStateAsUpdateV2")(doc.asInstanceOf[js.Any], encodedTargetStateVector.asInstanceOf[js.Any], encoder.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def encodeStateVector(doc: typings.std.Map[Double, Double]): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeStateVector")(doc.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def encodeStateVector(doc: typings.yjs.distSrcUtilsDocMod.Doc): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeStateVector")(doc.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def encodeStateVectorFromUpdate(update: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeStateVectorFromUpdate")(update.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def encodeStateVectorFromUpdateV2(update: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeStateVectorFromUpdateV2")(update.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def encodeStateVectorFromUpdateV2(update: js.typedarray.Uint8Array, YEncoder: Instantiable0[DSEncoderV1 | DSEncoderV2]): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeStateVectorFromUpdateV2")(update.asInstanceOf[js.Any], YEncoder.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def encodeStateVectorFromUpdateV2(
    update: js.typedarray.Uint8Array,
    YEncoder: Instantiable0[DSEncoderV1 | DSEncoderV2],
    YDecoder: Instantiable0[UpdateDecoderV1 | UpdateDecoderV2]
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeStateVectorFromUpdateV2")(update.asInstanceOf[js.Any], YEncoder.asInstanceOf[js.Any], YDecoder.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def encodeStateVectorFromUpdateV2(
    update: js.typedarray.Uint8Array,
    YEncoder: Unit,
    YDecoder: Instantiable0[UpdateDecoderV1 | UpdateDecoderV2]
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeStateVectorFromUpdateV2")(update.asInstanceOf[js.Any], YEncoder.asInstanceOf[js.Any], YDecoder.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def equalSnapshots(
    snap1: typings.yjs.distSrcUtilsSnapshotMod.Snapshot_,
    snap2: typings.yjs.distSrcUtilsSnapshotMod.Snapshot_
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalSnapshots")(snap1.asInstanceOf[js.Any], snap2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def findIndexSS(
    structs: js.Array[typings.yjs.distSrcStructsItemMod.Item | typings.yjs.distSrcStructsGCMod.GC],
    clock: Double
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndexSS")(structs.asInstanceOf[js.Any], clock.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def findRootTypeKey(`type`: typings.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("findRootTypeKey")(`type`.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getItem(arg0: StructStore, arg1: typings.yjs.distSrcUtilsIDMod.ID): typings.yjs.distSrcStructsItemMod.Item = (^.asInstanceOf[js.Dynamic].applyDynamic("getItem")(arg0.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any])).asInstanceOf[typings.yjs.distSrcStructsItemMod.Item]
  
  inline def getState(store: StructStore, client: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getState")(store.asInstanceOf[js.Any], client.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getTypeChildren(t: typings.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any]): js.Array[typings.yjs.distSrcStructsItemMod.Item] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeChildren")(t.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.yjs.distSrcStructsItemMod.Item]]
  
  inline def isDeleted(ds: DeleteSet, id: typings.yjs.distSrcUtilsIDMod.ID): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDeleted")(ds.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isParentOf(parent: typings.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isParentOf")(parent.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isParentOf(
    parent: typings.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any],
    child: typings.yjs.distSrcStructsItemMod.Item
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isParentOf")(parent.asInstanceOf[js.Any], child.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def iterateDeletedStructs(
    transaction: typings.yjs.distSrcUtilsTransactionMod.Transaction,
    ds: DeleteSet,
    f: js.Function1[
      /* arg0 */ typings.yjs.distSrcStructsGCMod.GC | typings.yjs.distSrcStructsItemMod.Item, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("iterateDeletedStructs")(transaction.asInstanceOf[js.Any], ds.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def logType(`type`: typings.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def logUpdate(update: js.typedarray.Uint8Array): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logUpdate")(update.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def logUpdateV2(update: js.typedarray.Uint8Array): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logUpdateV2")(update.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def logUpdateV2(update: js.typedarray.Uint8Array, YDecoder: Instantiable0[UpdateDecoderV1 | UpdateDecoderV2]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logUpdateV2")(update.asInstanceOf[js.Any], YDecoder.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def mergeUpdates(updates: js.Array[js.typedarray.Uint8Array]): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeUpdates")(updates.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def mergeUpdatesV2(updates: js.Array[js.typedarray.Uint8Array]): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeUpdatesV2")(updates.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def mergeUpdatesV2(
    updates: js.Array[js.typedarray.Uint8Array],
    YDecoder: Instantiable0[UpdateDecoderV1 | UpdateDecoderV2]
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeUpdatesV2")(updates.asInstanceOf[js.Any], YDecoder.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def mergeUpdatesV2(
    updates: js.Array[js.typedarray.Uint8Array],
    YDecoder: Instantiable0[UpdateDecoderV1 | UpdateDecoderV2],
    YEncoder: Instantiable0[typings.yjs.distSrcUtilsUpdateEncoderMod.UpdateEncoderV1 | UpdateEncoderV2]
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeUpdatesV2")(updates.asInstanceOf[js.Any], YDecoder.asInstanceOf[js.Any], YEncoder.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def mergeUpdatesV2(
    updates: js.Array[js.typedarray.Uint8Array],
    YDecoder: Unit,
    YEncoder: Instantiable0[typings.yjs.distSrcUtilsUpdateEncoderMod.UpdateEncoderV1 | UpdateEncoderV2]
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeUpdatesV2")(updates.asInstanceOf[js.Any], YDecoder.asInstanceOf[js.Any], YEncoder.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def parseUpdateMeta(update: js.typedarray.Uint8Array): From = ^.asInstanceOf[js.Dynamic].applyDynamic("parseUpdateMeta")(update.asInstanceOf[js.Any]).asInstanceOf[From]
  
  inline def parseUpdateMetaV2(update: js.typedarray.Uint8Array): From = ^.asInstanceOf[js.Dynamic].applyDynamic("parseUpdateMetaV2")(update.asInstanceOf[js.Any]).asInstanceOf[From]
  inline def parseUpdateMetaV2(update: js.typedarray.Uint8Array, YDecoder: Instantiable0[UpdateDecoderV1 | UpdateDecoderV2]): From = (^.asInstanceOf[js.Dynamic].applyDynamic("parseUpdateMetaV2")(update.asInstanceOf[js.Any], YDecoder.asInstanceOf[js.Any])).asInstanceOf[From]
  
  inline def readUpdate(decoder: Decoder, ydoc: typings.yjs.distSrcUtilsDocMod.Doc): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readUpdate")(decoder.asInstanceOf[js.Any], ydoc.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def readUpdate(decoder: Decoder, ydoc: typings.yjs.distSrcUtilsDocMod.Doc, transactionOrigin: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readUpdate")(decoder.asInstanceOf[js.Any], ydoc.asInstanceOf[js.Any], transactionOrigin.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def readUpdateV2(decoder: Decoder, ydoc: typings.yjs.distSrcUtilsDocMod.Doc): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readUpdateV2")(decoder.asInstanceOf[js.Any], ydoc.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def readUpdateV2(decoder: Decoder, ydoc: typings.yjs.distSrcUtilsDocMod.Doc, transactionOrigin: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readUpdateV2")(decoder.asInstanceOf[js.Any], ydoc.asInstanceOf[js.Any], transactionOrigin.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def readUpdateV2(
    decoder: Decoder,
    ydoc: typings.yjs.distSrcUtilsDocMod.Doc,
    transactionOrigin: Any,
    structDecoder: UpdateDecoderV1
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readUpdateV2")(decoder.asInstanceOf[js.Any], ydoc.asInstanceOf[js.Any], transactionOrigin.asInstanceOf[js.Any], structDecoder.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def readUpdateV2(
    decoder: Decoder,
    ydoc: typings.yjs.distSrcUtilsDocMod.Doc,
    transactionOrigin: Any,
    structDecoder: UpdateDecoderV2
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readUpdateV2")(decoder.asInstanceOf[js.Any], ydoc.asInstanceOf[js.Any], transactionOrigin.asInstanceOf[js.Any], structDecoder.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def readUpdateV2(
    decoder: Decoder,
    ydoc: typings.yjs.distSrcUtilsDocMod.Doc,
    transactionOrigin: Unit,
    structDecoder: UpdateDecoderV1
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readUpdateV2")(decoder.asInstanceOf[js.Any], ydoc.asInstanceOf[js.Any], transactionOrigin.asInstanceOf[js.Any], structDecoder.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def readUpdateV2(
    decoder: Decoder,
    ydoc: typings.yjs.distSrcUtilsDocMod.Doc,
    transactionOrigin: Unit,
    structDecoder: UpdateDecoderV2
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readUpdateV2")(decoder.asInstanceOf[js.Any], ydoc.asInstanceOf[js.Any], transactionOrigin.asInstanceOf[js.Any], structDecoder.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def relativePositionToJSON(rpos: typings.yjs.distSrcUtilsRelativePositionMod.RelativePosition): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("relativePositionToJSON")(rpos.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def snapshot(doc: typings.yjs.distSrcUtilsDocMod.Doc): typings.yjs.distSrcUtilsSnapshotMod.Snapshot_ = ^.asInstanceOf[js.Dynamic].applyDynamic("snapshot")(doc.asInstanceOf[js.Any]).asInstanceOf[typings.yjs.distSrcUtilsSnapshotMod.Snapshot_]
  
  inline def transact(
    doc: typings.yjs.distSrcUtilsDocMod.Doc,
    f: js.Function1[/* arg0 */ typings.yjs.distSrcUtilsTransactionMod.Transaction, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("transact")(doc.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def transact(
    doc: typings.yjs.distSrcUtilsDocMod.Doc,
    f: js.Function1[/* arg0 */ typings.yjs.distSrcUtilsTransactionMod.Transaction, Unit],
    origin: Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("transact")(doc.asInstanceOf[js.Any], f.asInstanceOf[js.Any], origin.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def transact(
    doc: typings.yjs.distSrcUtilsDocMod.Doc,
    f: js.Function1[/* arg0 */ typings.yjs.distSrcUtilsTransactionMod.Transaction, Unit],
    origin: Any,
    local: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("transact")(doc.asInstanceOf[js.Any], f.asInstanceOf[js.Any], origin.asInstanceOf[js.Any], local.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def transact(
    doc: typings.yjs.distSrcUtilsDocMod.Doc,
    f: js.Function1[/* arg0 */ typings.yjs.distSrcUtilsTransactionMod.Transaction, Unit],
    origin: Unit,
    local: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("transact")(doc.asInstanceOf[js.Any], f.asInstanceOf[js.Any], origin.asInstanceOf[js.Any], local.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def tryGc(
    ds: DeleteSet,
    store: StructStore,
    gcFilter: js.Function1[/* arg0 */ typings.yjs.distSrcStructsItemMod.Item, Boolean]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("tryGc")(ds.asInstanceOf[js.Any], store.asInstanceOf[js.Any], gcFilter.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def typeListToArraySnapshot(
    `type`: typings.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any],
    snapshot: typings.yjs.distSrcUtilsSnapshotMod.Snapshot_
  ): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("typeListToArraySnapshot")(`type`.asInstanceOf[js.Any], snapshot.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def typeMapGetSnapshot(
    parent: typings.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any],
    key: String,
    snapshot: typings.yjs.distSrcUtilsSnapshotMod.Snapshot_
  ): js.UndefOr[
    StringDictionary[Any] | Double | Null | js.Array[Any] | String | js.typedarray.Uint8Array | typings.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("typeMapGetSnapshot")(parent.asInstanceOf[js.Any], key.asInstanceOf[js.Any], snapshot.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
    StringDictionary[Any] | Double | Null | js.Array[Any] | String | js.typedarray.Uint8Array | typings.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any]
  ]]
}
