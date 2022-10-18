package typings.yjs.distSrcInternalsMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typings.lib0.decodingMod.Decoder
import typings.lib0.encodingMod.Encoder
import typings.std.IterableIterator
import typings.std.Map
import typings.std.Set
import typings.yjs.anon.Diff
import typings.yjs.anon.Ds
import typings.yjs.anon.From
import typings.yjs.anon.I
import typings.yjs.distSrcInternalsMod.^
import typings.yjs.yjsInts.`0`
import typings.yjs.yjsInts.`10`
import typings.yjs.yjsInts.`1`
import typings.yjs.yjsInts.`2`
import typings.yjs.yjsInts.`3`
import typings.yjs.yjsInts.`4`
import typings.yjs.yjsInts.`5`
import typings.yjs.yjsInts.`6`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def YArrayRefID: `0` = ^.asInstanceOf[js.Dynamic].selectDynamic("YArrayRefID").asInstanceOf[`0`]

inline def YMapRefID: `1` = ^.asInstanceOf[js.Dynamic].selectDynamic("YMapRefID").asInstanceOf[`1`]

inline def YTextRefID: `2` = ^.asInstanceOf[js.Dynamic].selectDynamic("YTextRefID").asInstanceOf[`2`]

inline def YXmlElementRefID: `3` = ^.asInstanceOf[js.Dynamic].selectDynamic("YXmlElementRefID").asInstanceOf[`3`]

inline def YXmlFragmentRefID: `4` = ^.asInstanceOf[js.Dynamic].selectDynamic("YXmlFragmentRefID").asInstanceOf[`4`]

inline def YXmlHookRefID: `5` = ^.asInstanceOf[js.Dynamic].selectDynamic("YXmlHookRefID").asInstanceOf[`5`]

inline def YXmlTextRefID: `6` = ^.asInstanceOf[js.Dynamic].selectDynamic("YXmlTextRefID").asInstanceOf[`6`]

inline def addChangedTypeToTransaction(
  transaction: typings.yjs.distSrcUtilsTransactionMod.Transaction,
  `type`: typings.yjs.distSrcTypesAbstractTypeMod.AbstractType[typings.yjs.distSrcUtilsYeventMod.YEvent[Any]]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addChangedTypeToTransaction")(transaction.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addChangedTypeToTransaction(
  transaction: typings.yjs.distSrcUtilsTransactionMod.Transaction,
  `type`: typings.yjs.distSrcTypesAbstractTypeMod.AbstractType[typings.yjs.distSrcUtilsYeventMod.YEvent[Any]],
  parentSub: String
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addChangedTypeToTransaction")(transaction.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], parentSub.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventHandlerListener[ARG0, ARG1](
  eventHandler: typings.yjs.distSrcUtilsEventHandlerMod.EventHandler[ARG0, ARG1],
  f: js.Function2[/* arg0 */ ARG0, /* arg1 */ ARG1, Unit]
): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventHandlerListener")(eventHandler.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Double]

inline def addStruct(
  store: typings.yjs.distSrcUtilsStructStoreMod.StructStore,
  struct: typings.yjs.distSrcStructsGCMod.GC
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addStruct")(store.asInstanceOf[js.Any], struct.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addStruct(
  store: typings.yjs.distSrcUtilsStructStoreMod.StructStore,
  struct: typings.yjs.distSrcStructsItemMod.Item
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addStruct")(store.asInstanceOf[js.Any], struct.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addToDeleteSet(ds: typings.yjs.distSrcUtilsDeleteSetMod.DeleteSet, client: Double, clock: Double, length: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addToDeleteSet")(ds.asInstanceOf[js.Any], client.asInstanceOf[js.Any], clock.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def applyUpdate(ydoc: typings.yjs.distSrcUtilsDocMod.Doc, update: js.typedarray.Uint8Array): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyUpdate")(ydoc.asInstanceOf[js.Any], update.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def applyUpdate(ydoc: typings.yjs.distSrcUtilsDocMod.Doc, update: js.typedarray.Uint8Array, transactionOrigin: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyUpdate")(ydoc.asInstanceOf[js.Any], update.asInstanceOf[js.Any], transactionOrigin.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def applyUpdateV2(ydoc: typings.yjs.distSrcUtilsDocMod.Doc, update: js.typedarray.Uint8Array): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyUpdateV2")(ydoc.asInstanceOf[js.Any], update.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def applyUpdateV2(ydoc: typings.yjs.distSrcUtilsDocMod.Doc, update: js.typedarray.Uint8Array, transactionOrigin: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyUpdateV2")(ydoc.asInstanceOf[js.Any], update.asInstanceOf[js.Any], transactionOrigin.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def applyUpdateV2(
  ydoc: typings.yjs.distSrcUtilsDocMod.Doc,
  update: js.typedarray.Uint8Array,
  transactionOrigin: Any,
  YDecoder: Instantiable0[
  typings.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV1 | typings.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV2
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyUpdateV2")(ydoc.asInstanceOf[js.Any], update.asInstanceOf[js.Any], transactionOrigin.asInstanceOf[js.Any], YDecoder.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def applyUpdateV2(
  ydoc: typings.yjs.distSrcUtilsDocMod.Doc,
  update: js.typedarray.Uint8Array,
  transactionOrigin: Unit,
  YDecoder: Instantiable0[
  typings.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV1 | typings.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV2
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyUpdateV2")(ydoc.asInstanceOf[js.Any], update.asInstanceOf[js.Any], transactionOrigin.asInstanceOf[js.Any], YDecoder.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def callEventHandlerListeners[ARG0, ARG1](
  eventHandler: typings.yjs.distSrcUtilsEventHandlerMod.EventHandler[ARG0, ARG1],
  arg0: ARG0,
  arg1: ARG1
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("callEventHandlerListeners")(eventHandler.asInstanceOf[js.Any], arg0.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def callTypeObservers[EventType](
  `type`: typings.yjs.distSrcTypesAbstractTypeMod.AbstractType[EventType],
  transaction: typings.yjs.distSrcUtilsTransactionMod.Transaction,
  event: EventType
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("callTypeObservers")(`type`.asInstanceOf[js.Any], transaction.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Unit]

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

inline def contentRefs: js.Array[
js.Function1[
  /* arg0 */ typings.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV1 | typings.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV2, 
  typings.yjs.distSrcStructsItemMod.AbstractContent
]] = ^.asInstanceOf[js.Dynamic].selectDynamic("contentRefs").asInstanceOf[js.Array[
js.Function1[
  /* arg0 */ typings.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV1 | typings.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV2, 
  typings.yjs.distSrcStructsItemMod.AbstractContent
]]]

inline def convertUpdateFormat(
  update: js.typedarray.Uint8Array,
  YDecoder: Instantiable0[
  typings.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV1 | typings.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV2
],
  YEncoder: Instantiable0[
  typings.yjs.distSrcUtilsUpdateEncoderMod.UpdateEncoderV1 | typings.yjs.distSrcUtilsUpdateEncoderMod.UpdateEncoderV2
]
): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("convertUpdateFormat")(update.asInstanceOf[js.Any], YDecoder.asInstanceOf[js.Any], YEncoder.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]

inline def convertUpdateFormatV1ToV2(update: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("convertUpdateFormatV1ToV2")(update.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]

inline def convertUpdateFormatV2ToV1(update: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("convertUpdateFormatV2ToV1")(update.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]

inline def createAbsolutePosition(`type`: typings.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any], index: Double): typings.yjs.distSrcUtilsRelativePositionMod.AbsolutePosition = (^.asInstanceOf[js.Dynamic].applyDynamic("createAbsolutePosition")(`type`.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[typings.yjs.distSrcUtilsRelativePositionMod.AbsolutePosition]
inline def createAbsolutePosition(`type`: typings.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any], index: Double, assoc: Double): typings.yjs.distSrcUtilsRelativePositionMod.AbsolutePosition = (^.asInstanceOf[js.Dynamic].applyDynamic("createAbsolutePosition")(`type`.asInstanceOf[js.Any], index.asInstanceOf[js.Any], assoc.asInstanceOf[js.Any])).asInstanceOf[typings.yjs.distSrcUtilsRelativePositionMod.AbsolutePosition]

inline def createAbsolutePositionFromRelativePosition(
  rpos: typings.yjs.distSrcUtilsRelativePositionMod.RelativePosition,
  doc: typings.yjs.distSrcUtilsDocMod.Doc
): typings.yjs.distSrcUtilsRelativePositionMod.AbsolutePosition | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("createAbsolutePositionFromRelativePosition")(rpos.asInstanceOf[js.Any], doc.asInstanceOf[js.Any])).asInstanceOf[typings.yjs.distSrcUtilsRelativePositionMod.AbsolutePosition | Null]

inline def createDeleteSet(): typings.yjs.distSrcUtilsDeleteSetMod.DeleteSet = ^.asInstanceOf[js.Dynamic].applyDynamic("createDeleteSet")().asInstanceOf[typings.yjs.distSrcUtilsDeleteSetMod.DeleteSet]

inline def createDeleteSetFromStructStore(ss: typings.yjs.distSrcUtilsStructStoreMod.StructStore): typings.yjs.distSrcUtilsDeleteSetMod.DeleteSet = ^.asInstanceOf[js.Dynamic].applyDynamic("createDeleteSetFromStructStore")(ss.asInstanceOf[js.Any]).asInstanceOf[typings.yjs.distSrcUtilsDeleteSetMod.DeleteSet]

inline def createDocFromSnapshot(
  originDoc: typings.yjs.distSrcUtilsDocMod.Doc,
  snapshot: typings.yjs.distSrcUtilsSnapshotMod.Snapshot_
): typings.yjs.distSrcUtilsDocMod.Doc = (^.asInstanceOf[js.Dynamic].applyDynamic("createDocFromSnapshot")(originDoc.asInstanceOf[js.Any], snapshot.asInstanceOf[js.Any])).asInstanceOf[typings.yjs.distSrcUtilsDocMod.Doc]
inline def createDocFromSnapshot(
  originDoc: typings.yjs.distSrcUtilsDocMod.Doc,
  snapshot: typings.yjs.distSrcUtilsSnapshotMod.Snapshot_,
  newDoc: typings.yjs.distSrcUtilsDocMod.Doc
): typings.yjs.distSrcUtilsDocMod.Doc = (^.asInstanceOf[js.Dynamic].applyDynamic("createDocFromSnapshot")(originDoc.asInstanceOf[js.Any], snapshot.asInstanceOf[js.Any], newDoc.asInstanceOf[js.Any])).asInstanceOf[typings.yjs.distSrcUtilsDocMod.Doc]

inline def createEventHandler[ARG0, ARG1](): typings.yjs.distSrcUtilsEventHandlerMod.EventHandler[ARG0, ARG1] = ^.asInstanceOf[js.Dynamic].applyDynamic("createEventHandler")().asInstanceOf[typings.yjs.distSrcUtilsEventHandlerMod.EventHandler[ARG0, ARG1]]

inline def createID(client: Double, clock: Double): typings.yjs.distSrcUtilsIDMod.ID = (^.asInstanceOf[js.Dynamic].applyDynamic("createID")(client.asInstanceOf[js.Any], clock.asInstanceOf[js.Any])).asInstanceOf[typings.yjs.distSrcUtilsIDMod.ID]

inline def createMapIterator(map: Map[String, typings.yjs.distSrcStructsItemMod.Item]): IterableIterator[js.Array[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createMapIterator")(map.asInstanceOf[js.Any]).asInstanceOf[IterableIterator[js.Array[Any]]]

inline def createRelativePosition(`type`: typings.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any]): typings.yjs.distSrcUtilsRelativePositionMod.RelativePosition = ^.asInstanceOf[js.Dynamic].applyDynamic("createRelativePosition")(`type`.asInstanceOf[js.Any]).asInstanceOf[typings.yjs.distSrcUtilsRelativePositionMod.RelativePosition]
inline def createRelativePosition(`type`: typings.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any], item: Null, assoc: Double): typings.yjs.distSrcUtilsRelativePositionMod.RelativePosition = (^.asInstanceOf[js.Dynamic].applyDynamic("createRelativePosition")(`type`.asInstanceOf[js.Any], item.asInstanceOf[js.Any], assoc.asInstanceOf[js.Any])).asInstanceOf[typings.yjs.distSrcUtilsRelativePositionMod.RelativePosition]
inline def createRelativePosition(
  `type`: typings.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any],
  item: typings.yjs.distSrcUtilsIDMod.ID
): typings.yjs.distSrcUtilsRelativePositionMod.RelativePosition = (^.asInstanceOf[js.Dynamic].applyDynamic("createRelativePosition")(`type`.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[typings.yjs.distSrcUtilsRelativePositionMod.RelativePosition]
inline def createRelativePosition(
  `type`: typings.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any],
  item: typings.yjs.distSrcUtilsIDMod.ID,
  assoc: Double
): typings.yjs.distSrcUtilsRelativePositionMod.RelativePosition = (^.asInstanceOf[js.Dynamic].applyDynamic("createRelativePosition")(`type`.asInstanceOf[js.Any], item.asInstanceOf[js.Any], assoc.asInstanceOf[js.Any])).asInstanceOf[typings.yjs.distSrcUtilsRelativePositionMod.RelativePosition]

inline def createRelativePositionFromJSON(json: Any): typings.yjs.distSrcUtilsRelativePositionMod.RelativePosition = ^.asInstanceOf[js.Dynamic].applyDynamic("createRelativePositionFromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.yjs.distSrcUtilsRelativePositionMod.RelativePosition]

inline def createRelativePositionFromTypeIndex(`type`: typings.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any], index: Double): typings.yjs.distSrcUtilsRelativePositionMod.RelativePosition = (^.asInstanceOf[js.Dynamic].applyDynamic("createRelativePositionFromTypeIndex")(`type`.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[typings.yjs.distSrcUtilsRelativePositionMod.RelativePosition]
inline def createRelativePositionFromTypeIndex(`type`: typings.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any], index: Double, assoc: Double): typings.yjs.distSrcUtilsRelativePositionMod.RelativePosition = (^.asInstanceOf[js.Dynamic].applyDynamic("createRelativePositionFromTypeIndex")(`type`.asInstanceOf[js.Any], index.asInstanceOf[js.Any], assoc.asInstanceOf[js.Any])).asInstanceOf[typings.yjs.distSrcUtilsRelativePositionMod.RelativePosition]

inline def createSnapshot(ds: typings.yjs.distSrcUtilsDeleteSetMod.DeleteSet, sm: Map[Double, Double]): typings.yjs.distSrcUtilsSnapshotMod.Snapshot_ = (^.asInstanceOf[js.Dynamic].applyDynamic("createSnapshot")(ds.asInstanceOf[js.Any], sm.asInstanceOf[js.Any])).asInstanceOf[typings.yjs.distSrcUtilsSnapshotMod.Snapshot_]

inline def decodeRelativePosition(uint8Array: js.typedarray.Uint8Array): typings.yjs.distSrcUtilsRelativePositionMod.RelativePosition = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeRelativePosition")(uint8Array.asInstanceOf[js.Any]).asInstanceOf[typings.yjs.distSrcUtilsRelativePositionMod.RelativePosition]

inline def decodeSnapshot(buf: js.typedarray.Uint8Array): typings.yjs.distSrcUtilsSnapshotMod.Snapshot_ = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeSnapshot")(buf.asInstanceOf[js.Any]).asInstanceOf[typings.yjs.distSrcUtilsSnapshotMod.Snapshot_]

inline def decodeSnapshotV2(buf: js.typedarray.Uint8Array): typings.yjs.distSrcUtilsSnapshotMod.Snapshot_ = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeSnapshotV2")(buf.asInstanceOf[js.Any]).asInstanceOf[typings.yjs.distSrcUtilsSnapshotMod.Snapshot_]
inline def decodeSnapshotV2(buf: js.typedarray.Uint8Array, decoder: typings.yjs.distSrcUtilsUpdateDecoderMod.DSDecoderV1): typings.yjs.distSrcUtilsSnapshotMod.Snapshot_ = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeSnapshotV2")(buf.asInstanceOf[js.Any], decoder.asInstanceOf[js.Any])).asInstanceOf[typings.yjs.distSrcUtilsSnapshotMod.Snapshot_]
inline def decodeSnapshotV2(buf: js.typedarray.Uint8Array, decoder: typings.yjs.distSrcUtilsUpdateDecoderMod.DSDecoderV2): typings.yjs.distSrcUtilsSnapshotMod.Snapshot_ = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeSnapshotV2")(buf.asInstanceOf[js.Any], decoder.asInstanceOf[js.Any])).asInstanceOf[typings.yjs.distSrcUtilsSnapshotMod.Snapshot_]

inline def decodeStateVector(decodedState: js.typedarray.Uint8Array): Map[Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeStateVector")(decodedState.asInstanceOf[js.Any]).asInstanceOf[Map[Double, Double]]

inline def decodeUpdate(update: js.typedarray.Uint8Array): Ds = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeUpdate")(update.asInstanceOf[js.Any]).asInstanceOf[Ds]

inline def decodeUpdateV2(update: js.typedarray.Uint8Array): Ds = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeUpdateV2")(update.asInstanceOf[js.Any]).asInstanceOf[Ds]
inline def decodeUpdateV2(
  update: js.typedarray.Uint8Array,
  YDecoder: Instantiable0[
  typings.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV1 | typings.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV2
]
): Ds = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeUpdateV2")(update.asInstanceOf[js.Any], YDecoder.asInstanceOf[js.Any])).asInstanceOf[Ds]

inline def diffUpdate(update: js.typedarray.Uint8Array, sv: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("diffUpdate")(update.asInstanceOf[js.Any], sv.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]

inline def diffUpdateV2(update: js.typedarray.Uint8Array, sv: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("diffUpdateV2")(update.asInstanceOf[js.Any], sv.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
inline def diffUpdateV2(
  update: js.typedarray.Uint8Array,
  sv: js.typedarray.Uint8Array,
  YDecoder: Instantiable0[
  typings.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV1 | typings.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV2
]
): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("diffUpdateV2")(update.asInstanceOf[js.Any], sv.asInstanceOf[js.Any], YDecoder.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
inline def diffUpdateV2(
  update: js.typedarray.Uint8Array,
  sv: js.typedarray.Uint8Array,
  YDecoder: Instantiable0[
  typings.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV1 | typings.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV2
],
  YEncoder: Instantiable0[
  typings.yjs.distSrcUtilsUpdateEncoderMod.UpdateEncoderV1 | typings.yjs.distSrcUtilsUpdateEncoderMod.UpdateEncoderV2
]
): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("diffUpdateV2")(update.asInstanceOf[js.Any], sv.asInstanceOf[js.Any], YDecoder.asInstanceOf[js.Any], YEncoder.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
inline def diffUpdateV2(
  update: js.typedarray.Uint8Array,
  sv: js.typedarray.Uint8Array,
  YDecoder: Unit,
  YEncoder: Instantiable0[
  typings.yjs.distSrcUtilsUpdateEncoderMod.UpdateEncoderV1 | typings.yjs.distSrcUtilsUpdateEncoderMod.UpdateEncoderV2
]
): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("diffUpdateV2")(update.asInstanceOf[js.Any], sv.asInstanceOf[js.Any], YDecoder.asInstanceOf[js.Any], YEncoder.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]

inline def emptySnapshot: typings.yjs.distSrcUtilsSnapshotMod.Snapshot_ = ^.asInstanceOf[js.Dynamic].selectDynamic("emptySnapshot").asInstanceOf[typings.yjs.distSrcUtilsSnapshotMod.Snapshot_]

inline def encodeRelativePosition(rpos: typings.yjs.distSrcUtilsRelativePositionMod.RelativePosition): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeRelativePosition")(rpos.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]

inline def encodeSnapshot(snapshot: typings.yjs.distSrcUtilsSnapshotMod.Snapshot_): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeSnapshot")(snapshot.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]

inline def encodeSnapshotV2(snapshot: typings.yjs.distSrcUtilsSnapshotMod.Snapshot_): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeSnapshotV2")(snapshot.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
inline def encodeSnapshotV2(
  snapshot: typings.yjs.distSrcUtilsSnapshotMod.Snapshot_,
  encoder: typings.yjs.distSrcUtilsUpdateEncoderMod.DSEncoderV1
): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeSnapshotV2")(snapshot.asInstanceOf[js.Any], encoder.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
inline def encodeSnapshotV2(
  snapshot: typings.yjs.distSrcUtilsSnapshotMod.Snapshot_,
  encoder: typings.yjs.distSrcUtilsUpdateEncoderMod.DSEncoderV2
): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeSnapshotV2")(snapshot.asInstanceOf[js.Any], encoder.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]

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
  encoder: typings.yjs.distSrcUtilsUpdateEncoderMod.UpdateEncoderV2
): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeStateAsUpdateV2")(doc.asInstanceOf[js.Any], encodedTargetStateVector.asInstanceOf[js.Any], encoder.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
inline def encodeStateAsUpdateV2(
  doc: typings.yjs.distSrcUtilsDocMod.Doc,
  encodedTargetStateVector: Unit,
  encoder: typings.yjs.distSrcUtilsUpdateEncoderMod.UpdateEncoderV1
): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeStateAsUpdateV2")(doc.asInstanceOf[js.Any], encodedTargetStateVector.asInstanceOf[js.Any], encoder.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
inline def encodeStateAsUpdateV2(
  doc: typings.yjs.distSrcUtilsDocMod.Doc,
  encodedTargetStateVector: Unit,
  encoder: typings.yjs.distSrcUtilsUpdateEncoderMod.UpdateEncoderV2
): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeStateAsUpdateV2")(doc.asInstanceOf[js.Any], encodedTargetStateVector.asInstanceOf[js.Any], encoder.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]

inline def encodeStateVector(doc: Map[Double, Double]): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeStateVector")(doc.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
inline def encodeStateVector(doc: typings.yjs.distSrcUtilsDocMod.Doc): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeStateVector")(doc.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]

inline def encodeStateVectorFromUpdate(update: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeStateVectorFromUpdate")(update.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]

inline def encodeStateVectorFromUpdateV2(update: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeStateVectorFromUpdateV2")(update.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
inline def encodeStateVectorFromUpdateV2(
  update: js.typedarray.Uint8Array,
  YEncoder: Instantiable0[
  typings.yjs.distSrcUtilsUpdateEncoderMod.DSEncoderV1 | typings.yjs.distSrcUtilsUpdateEncoderMod.DSEncoderV2
]
): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeStateVectorFromUpdateV2")(update.asInstanceOf[js.Any], YEncoder.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
inline def encodeStateVectorFromUpdateV2(
  update: js.typedarray.Uint8Array,
  YEncoder: Instantiable0[
  typings.yjs.distSrcUtilsUpdateEncoderMod.DSEncoderV1 | typings.yjs.distSrcUtilsUpdateEncoderMod.DSEncoderV2
],
  YDecoder: Instantiable0[
  typings.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV1 | typings.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV2
]
): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeStateVectorFromUpdateV2")(update.asInstanceOf[js.Any], YEncoder.asInstanceOf[js.Any], YDecoder.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
inline def encodeStateVectorFromUpdateV2(
  update: js.typedarray.Uint8Array,
  YEncoder: Unit,
  YDecoder: Instantiable0[
  typings.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV1 | typings.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV2
]
): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeStateVectorFromUpdateV2")(update.asInstanceOf[js.Any], YEncoder.asInstanceOf[js.Any], YDecoder.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]

inline def encodeStateVectorV2(doc: Map[Double, Double]): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeStateVectorV2")(doc.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
inline def encodeStateVectorV2(doc: Map[Double, Double], encoder: typings.yjs.distSrcUtilsUpdateEncoderMod.DSEncoderV1): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeStateVectorV2")(doc.asInstanceOf[js.Any], encoder.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
inline def encodeStateVectorV2(doc: Map[Double, Double], encoder: typings.yjs.distSrcUtilsUpdateEncoderMod.DSEncoderV2): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeStateVectorV2")(doc.asInstanceOf[js.Any], encoder.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
inline def encodeStateVectorV2(doc: typings.yjs.distSrcUtilsDocMod.Doc): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeStateVectorV2")(doc.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
inline def encodeStateVectorV2(
  doc: typings.yjs.distSrcUtilsDocMod.Doc,
  encoder: typings.yjs.distSrcUtilsUpdateEncoderMod.DSEncoderV1
): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeStateVectorV2")(doc.asInstanceOf[js.Any], encoder.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
inline def encodeStateVectorV2(
  doc: typings.yjs.distSrcUtilsDocMod.Doc,
  encoder: typings.yjs.distSrcUtilsUpdateEncoderMod.DSEncoderV2
): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeStateVectorV2")(doc.asInstanceOf[js.Any], encoder.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]

inline def equalSnapshots(
  snap1: typings.yjs.distSrcUtilsSnapshotMod.Snapshot_,
  snap2: typings.yjs.distSrcUtilsSnapshotMod.Snapshot_
): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalSnapshots")(snap1.asInstanceOf[js.Any], snap2.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def find(store: typings.yjs.distSrcUtilsStructStoreMod.StructStore, id: typings.yjs.distSrcUtilsIDMod.ID): typings.yjs.distSrcStructsGCMod.GC | typings.yjs.distSrcStructsItemMod.Item = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(store.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.yjs.distSrcStructsGCMod.GC | typings.yjs.distSrcStructsItemMod.Item]

inline def findIndexCleanStart(
  transaction: typings.yjs.distSrcUtilsTransactionMod.Transaction,
  structs: js.Array[typings.yjs.distSrcStructsItemMod.Item | typings.yjs.distSrcStructsGCMod.GC],
  clock: Double
): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndexCleanStart")(transaction.asInstanceOf[js.Any], structs.asInstanceOf[js.Any], clock.asInstanceOf[js.Any])).asInstanceOf[Double]

inline def findIndexDS(dis: js.Array[typings.yjs.distSrcUtilsDeleteSetMod.DeleteItem], clock: Double): Double | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndexDS")(dis.asInstanceOf[js.Any], clock.asInstanceOf[js.Any])).asInstanceOf[Double | Null]

inline def findIndexSS(
  structs: js.Array[typings.yjs.distSrcStructsItemMod.Item | typings.yjs.distSrcStructsGCMod.GC],
  clock: Double
): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndexSS")(structs.asInstanceOf[js.Any], clock.asInstanceOf[js.Any])).asInstanceOf[Double]

inline def findMarker(yarray: typings.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any], index: Double): typings.yjs.distSrcTypesAbstractTypeMod.ArraySearchMarker | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("findMarker")(yarray.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[typings.yjs.distSrcTypesAbstractTypeMod.ArraySearchMarker | Null]

inline def findRootTypeKey(`type`: typings.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("findRootTypeKey")(`type`.asInstanceOf[js.Any]).asInstanceOf[String]

inline def followRedone(store: typings.yjs.distSrcUtilsStructStoreMod.StructStore, id: typings.yjs.distSrcUtilsIDMod.ID): Diff = (^.asInstanceOf[js.Dynamic].applyDynamic("followRedone")(store.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Diff]

inline def generateNewClientId: js.Function0[Double] = ^.asInstanceOf[js.Dynamic].selectDynamic("generateNewClientId").asInstanceOf[js.Function0[Double]]

inline def getItem(arg0: typings.yjs.distSrcUtilsStructStoreMod.StructStore, arg1: typings.yjs.distSrcUtilsIDMod.ID): typings.yjs.distSrcStructsItemMod.Item = (^.asInstanceOf[js.Dynamic].applyDynamic("getItem")(arg0.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any])).asInstanceOf[typings.yjs.distSrcStructsItemMod.Item]

inline def getItemCleanEnd(
  transaction: typings.yjs.distSrcUtilsTransactionMod.Transaction,
  store: typings.yjs.distSrcUtilsStructStoreMod.StructStore,
  id: typings.yjs.distSrcUtilsIDMod.ID
): typings.yjs.distSrcStructsItemMod.Item = (^.asInstanceOf[js.Dynamic].applyDynamic("getItemCleanEnd")(transaction.asInstanceOf[js.Any], store.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.yjs.distSrcStructsItemMod.Item]

inline def getItemCleanStart(
  transaction: typings.yjs.distSrcUtilsTransactionMod.Transaction,
  id: typings.yjs.distSrcUtilsIDMod.ID
): typings.yjs.distSrcStructsItemMod.Item = (^.asInstanceOf[js.Dynamic].applyDynamic("getItemCleanStart")(transaction.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.yjs.distSrcStructsItemMod.Item]

inline def getState(store: typings.yjs.distSrcUtilsStructStoreMod.StructStore, client: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getState")(store.asInstanceOf[js.Any], client.asInstanceOf[js.Any])).asInstanceOf[Double]

inline def getStateVector(store: typings.yjs.distSrcUtilsStructStoreMod.StructStore): Map[Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getStateVector")(store.asInstanceOf[js.Any]).asInstanceOf[Map[Double, Double]]

inline def getTypeChildren(t: typings.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any]): js.Array[typings.yjs.distSrcStructsItemMod.Item] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeChildren")(t.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.yjs.distSrcStructsItemMod.Item]]

inline def integretyCheck(store: typings.yjs.distSrcUtilsStructStoreMod.StructStore): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("integretyCheck")(store.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def isDeleted(ds: typings.yjs.distSrcUtilsDeleteSetMod.DeleteSet, id: typings.yjs.distSrcUtilsIDMod.ID): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDeleted")(ds.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def isParentOf(parent: typings.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isParentOf")(parent.asInstanceOf[js.Any]).asInstanceOf[Boolean]
inline def isParentOf(
  parent: typings.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any],
  child: typings.yjs.distSrcStructsItemMod.Item
): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isParentOf")(parent.asInstanceOf[js.Any], child.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def isVisible(item: typings.yjs.distSrcStructsItemMod.Item): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isVisible")(item.asInstanceOf[js.Any]).asInstanceOf[Boolean]
inline def isVisible(
  item: typings.yjs.distSrcStructsItemMod.Item,
  snapshot: typings.yjs.distSrcUtilsSnapshotMod.Snapshot_
): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isVisible")(item.asInstanceOf[js.Any], snapshot.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def iterateDeletedStructs(
  transaction: typings.yjs.distSrcUtilsTransactionMod.Transaction,
  ds: typings.yjs.distSrcUtilsDeleteSetMod.DeleteSet,
  f: js.Function1[
  /* arg0 */ typings.yjs.distSrcStructsGCMod.GC | typings.yjs.distSrcStructsItemMod.Item, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("iterateDeletedStructs")(transaction.asInstanceOf[js.Any], ds.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def iterateStructs(
  transaction: typings.yjs.distSrcUtilsTransactionMod.Transaction,
  structs: js.Array[typings.yjs.distSrcStructsItemMod.Item | typings.yjs.distSrcStructsGCMod.GC],
  clockStart: Double,
  len: Double,
  f: js.Function1[
  /* arg0 */ typings.yjs.distSrcStructsGCMod.GC | typings.yjs.distSrcStructsItemMod.Item, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("iterateStructs")(transaction.asInstanceOf[js.Any], structs.asInstanceOf[js.Any], clockStart.asInstanceOf[js.Any], len.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def keepItem(item: Null, keep: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("keepItem")(item.asInstanceOf[js.Any], keep.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def keepItem(item: typings.yjs.distSrcStructsItemMod.Item, keep: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("keepItem")(item.asInstanceOf[js.Any], keep.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def logType(`type`: typings.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def logUpdate(update: js.typedarray.Uint8Array): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logUpdate")(update.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def logUpdateV2(update: js.typedarray.Uint8Array): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logUpdateV2")(update.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def logUpdateV2(
  update: js.typedarray.Uint8Array,
  YDecoder: Instantiable0[
  typings.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV1 | typings.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV2
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logUpdateV2")(update.asInstanceOf[js.Any], YDecoder.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def mergeDeleteSets(dss: js.Array[typings.yjs.distSrcUtilsDeleteSetMod.DeleteSet]): typings.yjs.distSrcUtilsDeleteSetMod.DeleteSet = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeDeleteSets")(dss.asInstanceOf[js.Any]).asInstanceOf[typings.yjs.distSrcUtilsDeleteSetMod.DeleteSet]

inline def mergeUpdates(updates: js.Array[js.typedarray.Uint8Array]): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeUpdates")(updates.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]

inline def mergeUpdatesV2(updates: js.Array[js.typedarray.Uint8Array]): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeUpdatesV2")(updates.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
inline def mergeUpdatesV2(
  updates: js.Array[js.typedarray.Uint8Array],
  YDecoder: Instantiable0[
  typings.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV1 | typings.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV2
]
): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeUpdatesV2")(updates.asInstanceOf[js.Any], YDecoder.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
inline def mergeUpdatesV2(
  updates: js.Array[js.typedarray.Uint8Array],
  YDecoder: Instantiable0[
  typings.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV1 | typings.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV2
],
  YEncoder: Instantiable0[
  typings.yjs.distSrcUtilsUpdateEncoderMod.UpdateEncoderV1 | typings.yjs.distSrcUtilsUpdateEncoderMod.UpdateEncoderV2
]
): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeUpdatesV2")(updates.asInstanceOf[js.Any], YDecoder.asInstanceOf[js.Any], YEncoder.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
inline def mergeUpdatesV2(
  updates: js.Array[js.typedarray.Uint8Array],
  YDecoder: Unit,
  YEncoder: Instantiable0[
  typings.yjs.distSrcUtilsUpdateEncoderMod.UpdateEncoderV1 | typings.yjs.distSrcUtilsUpdateEncoderMod.UpdateEncoderV2
]
): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeUpdatesV2")(updates.asInstanceOf[js.Any], YDecoder.asInstanceOf[js.Any], YEncoder.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]

inline def nextID(transaction: typings.yjs.distSrcUtilsTransactionMod.Transaction): typings.yjs.distSrcUtilsIDMod.ID = ^.asInstanceOf[js.Dynamic].applyDynamic("nextID")(transaction.asInstanceOf[js.Any]).asInstanceOf[typings.yjs.distSrcUtilsIDMod.ID]

inline def parseUpdateMeta(update: js.typedarray.Uint8Array): From = ^.asInstanceOf[js.Dynamic].applyDynamic("parseUpdateMeta")(update.asInstanceOf[js.Any]).asInstanceOf[From]

inline def parseUpdateMetaV2(update: js.typedarray.Uint8Array): From = ^.asInstanceOf[js.Dynamic].applyDynamic("parseUpdateMetaV2")(update.asInstanceOf[js.Any]).asInstanceOf[From]
inline def parseUpdateMetaV2(
  update: js.typedarray.Uint8Array,
  YDecoder: Instantiable0[
  typings.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV1 | typings.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV2
]
): From = (^.asInstanceOf[js.Dynamic].applyDynamic("parseUpdateMetaV2")(update.asInstanceOf[js.Any], YDecoder.asInstanceOf[js.Any])).asInstanceOf[From]

inline def readAndApplyDeleteSet(
  decoder: typings.yjs.distSrcUtilsUpdateDecoderMod.DSDecoderV1,
  transaction: typings.yjs.distSrcUtilsTransactionMod.Transaction,
  store: typings.yjs.distSrcUtilsStructStoreMod.StructStore
): js.typedarray.Uint8Array | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("readAndApplyDeleteSet")(decoder.asInstanceOf[js.Any], transaction.asInstanceOf[js.Any], store.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array | Null]
inline def readAndApplyDeleteSet(
  decoder: typings.yjs.distSrcUtilsUpdateDecoderMod.DSDecoderV2,
  transaction: typings.yjs.distSrcUtilsTransactionMod.Transaction,
  store: typings.yjs.distSrcUtilsStructStoreMod.StructStore
): js.typedarray.Uint8Array | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("readAndApplyDeleteSet")(decoder.asInstanceOf[js.Any], transaction.asInstanceOf[js.Any], store.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array | Null]

inline def readClientsStructRefs(
  decoder: typings.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV1,
  doc: typings.yjs.distSrcUtilsDocMod.Doc
): Map[Double, I] = (^.asInstanceOf[js.Dynamic].applyDynamic("readClientsStructRefs")(decoder.asInstanceOf[js.Any], doc.asInstanceOf[js.Any])).asInstanceOf[Map[Double, I]]
inline def readClientsStructRefs(
  decoder: typings.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV2,
  doc: typings.yjs.distSrcUtilsDocMod.Doc
): Map[Double, I] = (^.asInstanceOf[js.Dynamic].applyDynamic("readClientsStructRefs")(decoder.asInstanceOf[js.Any], doc.asInstanceOf[js.Any])).asInstanceOf[Map[Double, I]]

inline def readContentAny(decoder: typings.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV1): typings.yjs.distSrcStructsContentAnyMod.ContentAny = ^.asInstanceOf[js.Dynamic].applyDynamic("readContentAny")(decoder.asInstanceOf[js.Any]).asInstanceOf[typings.yjs.distSrcStructsContentAnyMod.ContentAny]
inline def readContentAny(decoder: typings.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV2): typings.yjs.distSrcStructsContentAnyMod.ContentAny = ^.asInstanceOf[js.Dynamic].applyDynamic("readContentAny")(decoder.asInstanceOf[js.Any]).asInstanceOf[typings.yjs.distSrcStructsContentAnyMod.ContentAny]

inline def readContentBinary(decoder: typings.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV1): typings.yjs.distSrcStructsContentBinaryMod.ContentBinary = ^.asInstanceOf[js.Dynamic].applyDynamic("readContentBinary")(decoder.asInstanceOf[js.Any]).asInstanceOf[typings.yjs.distSrcStructsContentBinaryMod.ContentBinary]
inline def readContentBinary(decoder: typings.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV2): typings.yjs.distSrcStructsContentBinaryMod.ContentBinary = ^.asInstanceOf[js.Dynamic].applyDynamic("readContentBinary")(decoder.asInstanceOf[js.Any]).asInstanceOf[typings.yjs.distSrcStructsContentBinaryMod.ContentBinary]

inline def readContentDeleted(decoder: typings.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV1): typings.yjs.distSrcStructsContentDeletedMod.ContentDeleted = ^.asInstanceOf[js.Dynamic].applyDynamic("readContentDeleted")(decoder.asInstanceOf[js.Any]).asInstanceOf[typings.yjs.distSrcStructsContentDeletedMod.ContentDeleted]
inline def readContentDeleted(decoder: typings.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV2): typings.yjs.distSrcStructsContentDeletedMod.ContentDeleted = ^.asInstanceOf[js.Dynamic].applyDynamic("readContentDeleted")(decoder.asInstanceOf[js.Any]).asInstanceOf[typings.yjs.distSrcStructsContentDeletedMod.ContentDeleted]

inline def readContentDoc(decoder: typings.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV1): typings.yjs.distSrcStructsContentDocMod.ContentDoc = ^.asInstanceOf[js.Dynamic].applyDynamic("readContentDoc")(decoder.asInstanceOf[js.Any]).asInstanceOf[typings.yjs.distSrcStructsContentDocMod.ContentDoc]
inline def readContentDoc(decoder: typings.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV2): typings.yjs.distSrcStructsContentDocMod.ContentDoc = ^.asInstanceOf[js.Dynamic].applyDynamic("readContentDoc")(decoder.asInstanceOf[js.Any]).asInstanceOf[typings.yjs.distSrcStructsContentDocMod.ContentDoc]

inline def readContentEmbed(decoder: typings.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV1): typings.yjs.distSrcStructsContentEmbedMod.ContentEmbed = ^.asInstanceOf[js.Dynamic].applyDynamic("readContentEmbed")(decoder.asInstanceOf[js.Any]).asInstanceOf[typings.yjs.distSrcStructsContentEmbedMod.ContentEmbed]
inline def readContentEmbed(decoder: typings.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV2): typings.yjs.distSrcStructsContentEmbedMod.ContentEmbed = ^.asInstanceOf[js.Dynamic].applyDynamic("readContentEmbed")(decoder.asInstanceOf[js.Any]).asInstanceOf[typings.yjs.distSrcStructsContentEmbedMod.ContentEmbed]

inline def readContentFormat(decoder: typings.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV1): typings.yjs.distSrcStructsContentFormatMod.ContentFormat = ^.asInstanceOf[js.Dynamic].applyDynamic("readContentFormat")(decoder.asInstanceOf[js.Any]).asInstanceOf[typings.yjs.distSrcStructsContentFormatMod.ContentFormat]
inline def readContentFormat(decoder: typings.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV2): typings.yjs.distSrcStructsContentFormatMod.ContentFormat = ^.asInstanceOf[js.Dynamic].applyDynamic("readContentFormat")(decoder.asInstanceOf[js.Any]).asInstanceOf[typings.yjs.distSrcStructsContentFormatMod.ContentFormat]

inline def readContentJSON(decoder: typings.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV1): typings.yjs.distSrcStructsContentJSONMod.ContentJSON = ^.asInstanceOf[js.Dynamic].applyDynamic("readContentJSON")(decoder.asInstanceOf[js.Any]).asInstanceOf[typings.yjs.distSrcStructsContentJSONMod.ContentJSON]
inline def readContentJSON(decoder: typings.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV2): typings.yjs.distSrcStructsContentJSONMod.ContentJSON = ^.asInstanceOf[js.Dynamic].applyDynamic("readContentJSON")(decoder.asInstanceOf[js.Any]).asInstanceOf[typings.yjs.distSrcStructsContentJSONMod.ContentJSON]

inline def readContentString(decoder: typings.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV1): typings.yjs.distSrcStructsContentStringMod.ContentString = ^.asInstanceOf[js.Dynamic].applyDynamic("readContentString")(decoder.asInstanceOf[js.Any]).asInstanceOf[typings.yjs.distSrcStructsContentStringMod.ContentString]
inline def readContentString(decoder: typings.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV2): typings.yjs.distSrcStructsContentStringMod.ContentString = ^.asInstanceOf[js.Dynamic].applyDynamic("readContentString")(decoder.asInstanceOf[js.Any]).asInstanceOf[typings.yjs.distSrcStructsContentStringMod.ContentString]

inline def readContentType(decoder: typings.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV1): typings.yjs.distSrcStructsContentTypeMod.ContentType = ^.asInstanceOf[js.Dynamic].applyDynamic("readContentType")(decoder.asInstanceOf[js.Any]).asInstanceOf[typings.yjs.distSrcStructsContentTypeMod.ContentType]
inline def readContentType(decoder: typings.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV2): typings.yjs.distSrcStructsContentTypeMod.ContentType = ^.asInstanceOf[js.Dynamic].applyDynamic("readContentType")(decoder.asInstanceOf[js.Any]).asInstanceOf[typings.yjs.distSrcStructsContentTypeMod.ContentType]

inline def readDeleteSet(decoder: typings.yjs.distSrcUtilsUpdateDecoderMod.DSDecoderV1): typings.yjs.distSrcUtilsDeleteSetMod.DeleteSet = ^.asInstanceOf[js.Dynamic].applyDynamic("readDeleteSet")(decoder.asInstanceOf[js.Any]).asInstanceOf[typings.yjs.distSrcUtilsDeleteSetMod.DeleteSet]
inline def readDeleteSet(decoder: typings.yjs.distSrcUtilsUpdateDecoderMod.DSDecoderV2): typings.yjs.distSrcUtilsDeleteSetMod.DeleteSet = ^.asInstanceOf[js.Dynamic].applyDynamic("readDeleteSet")(decoder.asInstanceOf[js.Any]).asInstanceOf[typings.yjs.distSrcUtilsDeleteSetMod.DeleteSet]

inline def readID(decoder: Decoder): typings.yjs.distSrcUtilsIDMod.ID = ^.asInstanceOf[js.Dynamic].applyDynamic("readID")(decoder.asInstanceOf[js.Any]).asInstanceOf[typings.yjs.distSrcUtilsIDMod.ID]

inline def readItemContent(decoder: typings.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV1, info: Double): typings.yjs.distSrcStructsItemMod.AbstractContent = (^.asInstanceOf[js.Dynamic].applyDynamic("readItemContent")(decoder.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[typings.yjs.distSrcStructsItemMod.AbstractContent]
inline def readItemContent(decoder: typings.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV2, info: Double): typings.yjs.distSrcStructsItemMod.AbstractContent = (^.asInstanceOf[js.Dynamic].applyDynamic("readItemContent")(decoder.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[typings.yjs.distSrcStructsItemMod.AbstractContent]

inline def readRelativePosition(decoder: Decoder): typings.yjs.distSrcUtilsRelativePositionMod.RelativePosition = ^.asInstanceOf[js.Dynamic].applyDynamic("readRelativePosition")(decoder.asInstanceOf[js.Any]).asInstanceOf[typings.yjs.distSrcUtilsRelativePositionMod.RelativePosition]

inline def readStateVector(decoder: typings.yjs.distSrcUtilsUpdateDecoderMod.DSDecoderV1): Map[Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("readStateVector")(decoder.asInstanceOf[js.Any]).asInstanceOf[Map[Double, Double]]
inline def readStateVector(decoder: typings.yjs.distSrcUtilsUpdateDecoderMod.DSDecoderV2): Map[Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("readStateVector")(decoder.asInstanceOf[js.Any]).asInstanceOf[Map[Double, Double]]

inline def readUpdate(decoder: Decoder, ydoc: typings.yjs.distSrcUtilsDocMod.Doc): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readUpdate")(decoder.asInstanceOf[js.Any], ydoc.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def readUpdate(decoder: Decoder, ydoc: typings.yjs.distSrcUtilsDocMod.Doc, transactionOrigin: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readUpdate")(decoder.asInstanceOf[js.Any], ydoc.asInstanceOf[js.Any], transactionOrigin.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def readUpdateV2(decoder: Decoder, ydoc: typings.yjs.distSrcUtilsDocMod.Doc): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readUpdateV2")(decoder.asInstanceOf[js.Any], ydoc.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def readUpdateV2(decoder: Decoder, ydoc: typings.yjs.distSrcUtilsDocMod.Doc, transactionOrigin: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readUpdateV2")(decoder.asInstanceOf[js.Any], ydoc.asInstanceOf[js.Any], transactionOrigin.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def readUpdateV2(
  decoder: Decoder,
  ydoc: typings.yjs.distSrcUtilsDocMod.Doc,
  transactionOrigin: Any,
  structDecoder: typings.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV1
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readUpdateV2")(decoder.asInstanceOf[js.Any], ydoc.asInstanceOf[js.Any], transactionOrigin.asInstanceOf[js.Any], structDecoder.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def readUpdateV2(
  decoder: Decoder,
  ydoc: typings.yjs.distSrcUtilsDocMod.Doc,
  transactionOrigin: Any,
  structDecoder: typings.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV2
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readUpdateV2")(decoder.asInstanceOf[js.Any], ydoc.asInstanceOf[js.Any], transactionOrigin.asInstanceOf[js.Any], structDecoder.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def readUpdateV2(
  decoder: Decoder,
  ydoc: typings.yjs.distSrcUtilsDocMod.Doc,
  transactionOrigin: Unit,
  structDecoder: typings.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV1
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readUpdateV2")(decoder.asInstanceOf[js.Any], ydoc.asInstanceOf[js.Any], transactionOrigin.asInstanceOf[js.Any], structDecoder.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def readUpdateV2(
  decoder: Decoder,
  ydoc: typings.yjs.distSrcUtilsDocMod.Doc,
  transactionOrigin: Unit,
  structDecoder: typings.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV2
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readUpdateV2")(decoder.asInstanceOf[js.Any], ydoc.asInstanceOf[js.Any], transactionOrigin.asInstanceOf[js.Any], structDecoder.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def readYArray(decoder: typings.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV1): typings.yjs.distSrcTypesYarrayMod.YArray[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("readYArray")(decoder.asInstanceOf[js.Any]).asInstanceOf[typings.yjs.distSrcTypesYarrayMod.YArray[Any]]
inline def readYArray(decoder: typings.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV2): typings.yjs.distSrcTypesYarrayMod.YArray[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("readYArray")(decoder.asInstanceOf[js.Any]).asInstanceOf[typings.yjs.distSrcTypesYarrayMod.YArray[Any]]

inline def readYMap(decoder: typings.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV1): typings.yjs.distSrcTypesYmapMod.YMap[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("readYMap")(decoder.asInstanceOf[js.Any]).asInstanceOf[typings.yjs.distSrcTypesYmapMod.YMap[Any]]
inline def readYMap(decoder: typings.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV2): typings.yjs.distSrcTypesYmapMod.YMap[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("readYMap")(decoder.asInstanceOf[js.Any]).asInstanceOf[typings.yjs.distSrcTypesYmapMod.YMap[Any]]

inline def readYText(decoder: typings.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV1): typings.yjs.distSrcTypesYtextMod.YText = ^.asInstanceOf[js.Dynamic].applyDynamic("readYText")(decoder.asInstanceOf[js.Any]).asInstanceOf[typings.yjs.distSrcTypesYtextMod.YText]
inline def readYText(decoder: typings.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV2): typings.yjs.distSrcTypesYtextMod.YText = ^.asInstanceOf[js.Dynamic].applyDynamic("readYText")(decoder.asInstanceOf[js.Any]).asInstanceOf[typings.yjs.distSrcTypesYtextMod.YText]

inline def readYXmlElement(decoder: typings.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV1): typings.yjs.distSrcTypesYxmlelementMod.YXmlElement = ^.asInstanceOf[js.Dynamic].applyDynamic("readYXmlElement")(decoder.asInstanceOf[js.Any]).asInstanceOf[typings.yjs.distSrcTypesYxmlelementMod.YXmlElement]
inline def readYXmlElement(decoder: typings.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV2): typings.yjs.distSrcTypesYxmlelementMod.YXmlElement = ^.asInstanceOf[js.Dynamic].applyDynamic("readYXmlElement")(decoder.asInstanceOf[js.Any]).asInstanceOf[typings.yjs.distSrcTypesYxmlelementMod.YXmlElement]

inline def readYXmlFragment(decoder: typings.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV1): typings.yjs.distSrcTypesYxmlfragmentMod.YXmlFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("readYXmlFragment")(decoder.asInstanceOf[js.Any]).asInstanceOf[typings.yjs.distSrcTypesYxmlfragmentMod.YXmlFragment]
inline def readYXmlFragment(decoder: typings.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV2): typings.yjs.distSrcTypesYxmlfragmentMod.YXmlFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("readYXmlFragment")(decoder.asInstanceOf[js.Any]).asInstanceOf[typings.yjs.distSrcTypesYxmlfragmentMod.YXmlFragment]

inline def readYXmlHook(decoder: typings.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV1): typings.yjs.distSrcTypesYxmlhookMod.YXmlHook = ^.asInstanceOf[js.Dynamic].applyDynamic("readYXmlHook")(decoder.asInstanceOf[js.Any]).asInstanceOf[typings.yjs.distSrcTypesYxmlhookMod.YXmlHook]
inline def readYXmlHook(decoder: typings.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV2): typings.yjs.distSrcTypesYxmlhookMod.YXmlHook = ^.asInstanceOf[js.Dynamic].applyDynamic("readYXmlHook")(decoder.asInstanceOf[js.Any]).asInstanceOf[typings.yjs.distSrcTypesYxmlhookMod.YXmlHook]

inline def readYXmlText(decoder: typings.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV1): typings.yjs.distSrcTypesYxmltextMod.YXmlText = ^.asInstanceOf[js.Dynamic].applyDynamic("readYXmlText")(decoder.asInstanceOf[js.Any]).asInstanceOf[typings.yjs.distSrcTypesYxmltextMod.YXmlText]
inline def readYXmlText(decoder: typings.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV2): typings.yjs.distSrcTypesYxmltextMod.YXmlText = ^.asInstanceOf[js.Dynamic].applyDynamic("readYXmlText")(decoder.asInstanceOf[js.Any]).asInstanceOf[typings.yjs.distSrcTypesYxmltextMod.YXmlText]

inline def redoItem(
  transaction: typings.yjs.distSrcUtilsTransactionMod.Transaction,
  item: typings.yjs.distSrcStructsItemMod.Item,
  redoitems: Set[typings.yjs.distSrcStructsItemMod.Item],
  itemsToDelete: typings.yjs.distSrcUtilsDeleteSetMod.DeleteSet,
  ignoreRemoteMapChanges: Boolean
): typings.yjs.distSrcStructsItemMod.Item | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("redoItem")(transaction.asInstanceOf[js.Any], item.asInstanceOf[js.Any], redoitems.asInstanceOf[js.Any], itemsToDelete.asInstanceOf[js.Any], ignoreRemoteMapChanges.asInstanceOf[js.Any])).asInstanceOf[typings.yjs.distSrcStructsItemMod.Item | Null]

inline def relativePositionToJSON(rpos: typings.yjs.distSrcUtilsRelativePositionMod.RelativePosition): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("relativePositionToJSON")(rpos.asInstanceOf[js.Any]).asInstanceOf[Any]

inline def removeAllEventHandlerListeners[ARG0, ARG1](eventHandler: typings.yjs.distSrcUtilsEventHandlerMod.EventHandler[ARG0, ARG1]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAllEventHandlerListeners")(eventHandler.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def removeEventHandlerListener[ARG0, ARG1](
  eventHandler: typings.yjs.distSrcUtilsEventHandlerMod.EventHandler[ARG0, ARG1],
  f: js.Function2[/* arg0 */ ARG0, /* arg1 */ ARG1, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventHandlerListener")(eventHandler.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def replaceStruct(
  store: typings.yjs.distSrcUtilsStructStoreMod.StructStore,
  struct: typings.yjs.distSrcStructsGCMod.GC,
  newStruct: typings.yjs.distSrcStructsGCMod.GC
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceStruct")(store.asInstanceOf[js.Any], struct.asInstanceOf[js.Any], newStruct.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def replaceStruct(
  store: typings.yjs.distSrcUtilsStructStoreMod.StructStore,
  struct: typings.yjs.distSrcStructsGCMod.GC,
  newStruct: typings.yjs.distSrcStructsItemMod.Item
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceStruct")(store.asInstanceOf[js.Any], struct.asInstanceOf[js.Any], newStruct.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def replaceStruct(
  store: typings.yjs.distSrcUtilsStructStoreMod.StructStore,
  struct: typings.yjs.distSrcStructsItemMod.Item,
  newStruct: typings.yjs.distSrcStructsGCMod.GC
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceStruct")(store.asInstanceOf[js.Any], struct.asInstanceOf[js.Any], newStruct.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def replaceStruct(
  store: typings.yjs.distSrcUtilsStructStoreMod.StructStore,
  struct: typings.yjs.distSrcStructsItemMod.Item,
  newStruct: typings.yjs.distSrcStructsItemMod.Item
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceStruct")(store.asInstanceOf[js.Any], struct.asInstanceOf[js.Any], newStruct.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def snapshot(doc: typings.yjs.distSrcUtilsDocMod.Doc): typings.yjs.distSrcUtilsSnapshotMod.Snapshot_ = ^.asInstanceOf[js.Dynamic].applyDynamic("snapshot")(doc.asInstanceOf[js.Any]).asInstanceOf[typings.yjs.distSrcUtilsSnapshotMod.Snapshot_]

inline def sortAndMergeDeleteSet(ds: typings.yjs.distSrcUtilsDeleteSetMod.DeleteSet): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sortAndMergeDeleteSet")(ds.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def splitItem(
  transaction: typings.yjs.distSrcUtilsTransactionMod.Transaction,
  leftItem: typings.yjs.distSrcStructsItemMod.Item,
  diff: Double
): typings.yjs.distSrcStructsItemMod.Item = (^.asInstanceOf[js.Dynamic].applyDynamic("splitItem")(transaction.asInstanceOf[js.Any], leftItem.asInstanceOf[js.Any], diff.asInstanceOf[js.Any])).asInstanceOf[typings.yjs.distSrcStructsItemMod.Item]

inline def splitSnapshotAffectedStructs(
  transaction: typings.yjs.distSrcUtilsTransactionMod.Transaction,
  snapshot: typings.yjs.distSrcUtilsSnapshotMod.Snapshot_
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("splitSnapshotAffectedStructs")(transaction.asInstanceOf[js.Any], snapshot.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def structGCRefNumber: `0` = ^.asInstanceOf[js.Dynamic].selectDynamic("structGCRefNumber").asInstanceOf[`0`]

inline def structSkipRefNumber: `10` = ^.asInstanceOf[js.Dynamic].selectDynamic("structSkipRefNumber").asInstanceOf[`10`]

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
  ds: typings.yjs.distSrcUtilsDeleteSetMod.DeleteSet,
  store: typings.yjs.distSrcUtilsStructStoreMod.StructStore,
  gcFilter: js.Function1[/* arg0 */ typings.yjs.distSrcStructsItemMod.Item, Boolean]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("tryGc")(ds.asInstanceOf[js.Any], store.asInstanceOf[js.Any], gcFilter.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def typeListCreateIterator(`type`: typings.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any]): IterableIterator[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("typeListCreateIterator")(`type`.asInstanceOf[js.Any]).asInstanceOf[IterableIterator[Any]]

inline def typeListDelete(
  transaction: typings.yjs.distSrcUtilsTransactionMod.Transaction,
  parent: typings.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any],
  index: Double,
  length: Double
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("typeListDelete")(transaction.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], index.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def typeListForEach(
  `type`: typings.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any],
  f: js.Function3[/* arg0 */ Any, /* arg1 */ Double, /* arg2 */ Any, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("typeListForEach")(`type`.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def typeListForEachSnapshot(
  `type`: typings.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any],
  f: js.Function3[
  /* arg0 */ Any, 
  /* arg1 */ Double, 
  /* arg2 */ typings.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any], 
  Unit
],
  snapshot: typings.yjs.distSrcUtilsSnapshotMod.Snapshot_
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("typeListForEachSnapshot")(`type`.asInstanceOf[js.Any], f.asInstanceOf[js.Any], snapshot.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def typeListGet(`type`: typings.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any], index: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("typeListGet")(`type`.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def typeListInsertGenerics(
  transaction: typings.yjs.distSrcUtilsTransactionMod.Transaction,
  parent: typings.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any],
  index: Double,
  content: js.Array[
  StringDictionary[Any] | js.Array[Any] | Double | Null | String | js.typedarray.Uint8Array
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("typeListInsertGenerics")(transaction.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], index.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def typeListInsertGenericsAfter(
  transaction: typings.yjs.distSrcUtilsTransactionMod.Transaction,
  parent: typings.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any],
  referenceItem: Null,
  content: js.Array[
  StringDictionary[Any] | js.Array[Any] | Boolean | Double | Null | String | js.typedarray.Uint8Array
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("typeListInsertGenericsAfter")(transaction.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], referenceItem.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def typeListInsertGenericsAfter(
  transaction: typings.yjs.distSrcUtilsTransactionMod.Transaction,
  parent: typings.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any],
  referenceItem: typings.yjs.distSrcStructsItemMod.Item,
  content: js.Array[
  StringDictionary[Any] | js.Array[Any] | Boolean | Double | Null | String | js.typedarray.Uint8Array
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("typeListInsertGenericsAfter")(transaction.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], referenceItem.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def typeListMap[C, R](
  `type`: typings.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any],
  f: js.Function3[
  /* arg0 */ C, 
  /* arg1 */ Double, 
  /* arg2 */ typings.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any], 
  R
]
): js.Array[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("typeListMap")(`type`.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Array[R]]

inline def typeListPushGenerics(
  transaction: typings.yjs.distSrcUtilsTransactionMod.Transaction,
  parent: typings.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any],
  content: js.Array[
  StringDictionary[Any] | js.Array[Any] | Double | Null | String | js.typedarray.Uint8Array
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("typeListPushGenerics")(transaction.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def typeListSlice(`type`: typings.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any], start: Double, end: Double): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("typeListSlice")(`type`.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]

inline def typeListToArray(`type`: typings.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any]): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("typeListToArray")(`type`.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]

inline def typeListToArraySnapshot(
  `type`: typings.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any],
  snapshot: typings.yjs.distSrcUtilsSnapshotMod.Snapshot_
): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("typeListToArraySnapshot")(`type`.asInstanceOf[js.Any], snapshot.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]

inline def typeMapDelete(
  transaction: typings.yjs.distSrcUtilsTransactionMod.Transaction,
  parent: typings.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any],
  key: String
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("typeMapDelete")(transaction.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def typeMapGet(parent: typings.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any], key: String): js.UndefOr[
StringDictionary[Any] | Double | Null | js.Array[Any] | String | js.typedarray.Uint8Array | typings.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("typeMapGet")(parent.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
StringDictionary[Any] | Double | Null | js.Array[Any] | String | js.typedarray.Uint8Array | typings.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any]]]

inline def typeMapGetAll(parent: typings.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any]): StringDictionary[
js.UndefOr[
  StringDictionary[Any] | Double | Null | js.Array[Any] | String | js.typedarray.Uint8Array | typings.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any]
]] = ^.asInstanceOf[js.Dynamic].applyDynamic("typeMapGetAll")(parent.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[
js.UndefOr[
  StringDictionary[Any] | Double | Null | js.Array[Any] | String | js.typedarray.Uint8Array | typings.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any]
]]]

inline def typeMapGetSnapshot(
  parent: typings.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any],
  key: String,
  snapshot: typings.yjs.distSrcUtilsSnapshotMod.Snapshot_
): js.UndefOr[
StringDictionary[Any] | Double | Null | js.Array[Any] | String | js.typedarray.Uint8Array | typings.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("typeMapGetSnapshot")(parent.asInstanceOf[js.Any], key.asInstanceOf[js.Any], snapshot.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
StringDictionary[Any] | Double | Null | js.Array[Any] | String | js.typedarray.Uint8Array | typings.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any]]]

inline def typeMapHas(parent: typings.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any], key: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("typeMapHas")(parent.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def typeMapSet(
  transaction: typings.yjs.distSrcUtilsTransactionMod.Transaction,
  parent: typings.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any],
  key: String
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("typeMapSet")(transaction.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def typeMapSet(
  transaction: typings.yjs.distSrcUtilsTransactionMod.Transaction,
  parent: typings.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any],
  key: String,
  value: String
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("typeMapSet")(transaction.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def typeMapSet(
  transaction: typings.yjs.distSrcUtilsTransactionMod.Transaction,
  parent: typings.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any],
  key: String,
  value: js.Array[Any]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("typeMapSet")(transaction.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def typeMapSet(
  transaction: typings.yjs.distSrcUtilsTransactionMod.Transaction,
  parent: typings.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any],
  key: String,
  value: js.Object
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("typeMapSet")(transaction.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def typeMapSet(
  transaction: typings.yjs.distSrcUtilsTransactionMod.Transaction,
  parent: typings.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any],
  key: String,
  value: js.typedarray.Uint8Array
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("typeMapSet")(transaction.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def typeMapSet(
  transaction: typings.yjs.distSrcUtilsTransactionMod.Transaction,
  parent: typings.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any],
  key: String,
  value: Double
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("typeMapSet")(transaction.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def typeMapSet(
  transaction: typings.yjs.distSrcUtilsTransactionMod.Transaction,
  parent: typings.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any],
  key: String,
  value: typings.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("typeMapSet")(transaction.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def typeRefs: js.Array[
js.Function1[
  /* arg0 */ typings.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV1 | typings.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV2, 
  typings.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any]
]] = ^.asInstanceOf[js.Dynamic].selectDynamic("typeRefs").asInstanceOf[js.Array[
js.Function1[
  /* arg0 */ typings.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV1 | typings.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV2, 
  typings.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any]
]]]

inline def updateMarkerChanges(
  searchMarker: js.Array[typings.yjs.distSrcTypesAbstractTypeMod.ArraySearchMarker],
  index: Double,
  len: Double
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateMarkerChanges")(searchMarker.asInstanceOf[js.Any], index.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def writeClientsStructs(
  encoder: typings.yjs.distSrcUtilsUpdateEncoderMod.UpdateEncoderV1,
  store: typings.yjs.distSrcUtilsStructStoreMod.StructStore,
  _sm: Map[Double, Double]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeClientsStructs")(encoder.asInstanceOf[js.Any], store.asInstanceOf[js.Any], _sm.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def writeClientsStructs(
  encoder: typings.yjs.distSrcUtilsUpdateEncoderMod.UpdateEncoderV2,
  store: typings.yjs.distSrcUtilsStructStoreMod.StructStore,
  _sm: Map[Double, Double]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeClientsStructs")(encoder.asInstanceOf[js.Any], store.asInstanceOf[js.Any], _sm.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def writeDeleteSet(
  encoder: typings.yjs.distSrcUtilsUpdateEncoderMod.DSEncoderV1,
  ds: typings.yjs.distSrcUtilsDeleteSetMod.DeleteSet
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeDeleteSet")(encoder.asInstanceOf[js.Any], ds.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def writeDeleteSet(
  encoder: typings.yjs.distSrcUtilsUpdateEncoderMod.DSEncoderV2,
  ds: typings.yjs.distSrcUtilsDeleteSetMod.DeleteSet
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeDeleteSet")(encoder.asInstanceOf[js.Any], ds.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def writeDocumentStateVector(
  encoder: typings.yjs.distSrcUtilsUpdateEncoderMod.DSEncoderV1,
  doc: typings.yjs.distSrcUtilsDocMod.Doc
): typings.yjs.distSrcUtilsUpdateEncoderMod.DSEncoderV1 | typings.yjs.distSrcUtilsUpdateEncoderMod.DSEncoderV2 = (^.asInstanceOf[js.Dynamic].applyDynamic("writeDocumentStateVector")(encoder.asInstanceOf[js.Any], doc.asInstanceOf[js.Any])).asInstanceOf[typings.yjs.distSrcUtilsUpdateEncoderMod.DSEncoderV1 | typings.yjs.distSrcUtilsUpdateEncoderMod.DSEncoderV2]
inline def writeDocumentStateVector(
  encoder: typings.yjs.distSrcUtilsUpdateEncoderMod.DSEncoderV2,
  doc: typings.yjs.distSrcUtilsDocMod.Doc
): typings.yjs.distSrcUtilsUpdateEncoderMod.DSEncoderV1 | typings.yjs.distSrcUtilsUpdateEncoderMod.DSEncoderV2 = (^.asInstanceOf[js.Dynamic].applyDynamic("writeDocumentStateVector")(encoder.asInstanceOf[js.Any], doc.asInstanceOf[js.Any])).asInstanceOf[typings.yjs.distSrcUtilsUpdateEncoderMod.DSEncoderV1 | typings.yjs.distSrcUtilsUpdateEncoderMod.DSEncoderV2]

inline def writeID(encoder: Encoder, id: typings.yjs.distSrcUtilsIDMod.ID): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeID")(encoder.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def writeRelativePosition(encoder: Encoder, rpos: typings.yjs.distSrcUtilsRelativePositionMod.RelativePosition): Encoder = (^.asInstanceOf[js.Dynamic].applyDynamic("writeRelativePosition")(encoder.asInstanceOf[js.Any], rpos.asInstanceOf[js.Any])).asInstanceOf[Encoder]

inline def writeStateAsUpdate(
  encoder: typings.yjs.distSrcUtilsUpdateEncoderMod.UpdateEncoderV1,
  doc: typings.yjs.distSrcUtilsDocMod.Doc
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeStateAsUpdate")(encoder.asInstanceOf[js.Any], doc.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def writeStateAsUpdate(
  encoder: typings.yjs.distSrcUtilsUpdateEncoderMod.UpdateEncoderV1,
  doc: typings.yjs.distSrcUtilsDocMod.Doc,
  targetStateVector: Map[Double, Double]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeStateAsUpdate")(encoder.asInstanceOf[js.Any], doc.asInstanceOf[js.Any], targetStateVector.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def writeStateAsUpdate(
  encoder: typings.yjs.distSrcUtilsUpdateEncoderMod.UpdateEncoderV2,
  doc: typings.yjs.distSrcUtilsDocMod.Doc
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeStateAsUpdate")(encoder.asInstanceOf[js.Any], doc.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def writeStateAsUpdate(
  encoder: typings.yjs.distSrcUtilsUpdateEncoderMod.UpdateEncoderV2,
  doc: typings.yjs.distSrcUtilsDocMod.Doc,
  targetStateVector: Map[Double, Double]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeStateAsUpdate")(encoder.asInstanceOf[js.Any], doc.asInstanceOf[js.Any], targetStateVector.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def writeStateVector(encoder: typings.yjs.distSrcUtilsUpdateEncoderMod.DSEncoderV1, sv: Map[Double, Double]): typings.yjs.distSrcUtilsUpdateEncoderMod.DSEncoderV1 | typings.yjs.distSrcUtilsUpdateEncoderMod.DSEncoderV2 = (^.asInstanceOf[js.Dynamic].applyDynamic("writeStateVector")(encoder.asInstanceOf[js.Any], sv.asInstanceOf[js.Any])).asInstanceOf[typings.yjs.distSrcUtilsUpdateEncoderMod.DSEncoderV1 | typings.yjs.distSrcUtilsUpdateEncoderMod.DSEncoderV2]
inline def writeStateVector(encoder: typings.yjs.distSrcUtilsUpdateEncoderMod.DSEncoderV2, sv: Map[Double, Double]): typings.yjs.distSrcUtilsUpdateEncoderMod.DSEncoderV1 | typings.yjs.distSrcUtilsUpdateEncoderMod.DSEncoderV2 = (^.asInstanceOf[js.Dynamic].applyDynamic("writeStateVector")(encoder.asInstanceOf[js.Any], sv.asInstanceOf[js.Any])).asInstanceOf[typings.yjs.distSrcUtilsUpdateEncoderMod.DSEncoderV1 | typings.yjs.distSrcUtilsUpdateEncoderMod.DSEncoderV2]

inline def writeStructsFromTransaction(
  encoder: typings.yjs.distSrcUtilsUpdateEncoderMod.UpdateEncoderV1,
  transaction: typings.yjs.distSrcUtilsTransactionMod.Transaction
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeStructsFromTransaction")(encoder.asInstanceOf[js.Any], transaction.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def writeStructsFromTransaction(
  encoder: typings.yjs.distSrcUtilsUpdateEncoderMod.UpdateEncoderV2,
  transaction: typings.yjs.distSrcUtilsTransactionMod.Transaction
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeStructsFromTransaction")(encoder.asInstanceOf[js.Any], transaction.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def writeUpdateMessageFromTransaction(
  encoder: typings.yjs.distSrcUtilsUpdateEncoderMod.UpdateEncoderV1,
  transaction: typings.yjs.distSrcUtilsTransactionMod.Transaction
): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("writeUpdateMessageFromTransaction")(encoder.asInstanceOf[js.Any], transaction.asInstanceOf[js.Any])).asInstanceOf[Boolean]
inline def writeUpdateMessageFromTransaction(
  encoder: typings.yjs.distSrcUtilsUpdateEncoderMod.UpdateEncoderV2,
  transaction: typings.yjs.distSrcUtilsTransactionMod.Transaction
): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("writeUpdateMessageFromTransaction")(encoder.asInstanceOf[js.Any], transaction.asInstanceOf[js.Any])).asInstanceOf[Boolean]
