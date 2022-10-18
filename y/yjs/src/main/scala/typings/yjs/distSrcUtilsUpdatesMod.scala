package typings.yjs

import org.scalablytyped.runtime.Instantiable0
import typings.std.Generator
import typings.yjs.anon.Ds
import typings.yjs.anon.From
import typings.yjs.anon.RestEncoder
import typings.yjs.distSrcStructsGCMod.GC
import typings.yjs.distSrcStructsItemMod.Item
import typings.yjs.distSrcStructsSkipMod.Skip
import typings.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV1
import typings.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV2
import typings.yjs.distSrcUtilsUpdateEncoderMod.DSEncoderV1
import typings.yjs.distSrcUtilsUpdateEncoderMod.DSEncoderV2
import typings.yjs.distSrcUtilsUpdateEncoderMod.UpdateEncoderV1
import typings.yjs.distSrcUtilsUpdateEncoderMod.UpdateEncoderV2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcUtilsUpdatesMod {
  
  @JSImport("yjs/dist/src/utils/updates", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("yjs/dist/src/utils/updates", "LazyStructReader")
  @js.native
  open class LazyStructReader protected () extends StObject {
    /**
      * @param {UpdateDecoderV1 | UpdateDecoderV2} decoder
      * @param {boolean} filterSkips
      */
    def this(decoder: UpdateDecoderV1, filterSkips: Boolean) = this()
    def this(decoder: UpdateDecoderV2, filterSkips: Boolean) = this()
    
    /**
      * @type {null | Item | Skip | GC}
      */
    var curr: Null | Item | Skip | GC = js.native
    
    var done: Boolean = js.native
    
    var filterSkips: Boolean = js.native
    
    var gen: Generator[GC | Item | Skip, Unit, Any] = js.native
    
    /**
      * @return {Item | GC | Skip |null}
      */
    def next(): Item | GC | Skip | Null = js.native
  }
  
  @JSImport("yjs/dist/src/utils/updates", "LazyStructWriter")
  @js.native
  open class LazyStructWriter protected () extends StObject {
    /**
      * @param {UpdateEncoderV1 | UpdateEncoderV2} encoder
      */
    def this(encoder: UpdateEncoderV1) = this()
    def this(encoder: UpdateEncoderV2) = this()
    
    /**
      * We want to write operations lazily, but also we need to know beforehand how many operations we want to write for each client.
      *
      * This kind of meta-information (#clients, #structs-per-client-written) is written to the restEncoder.
      *
      * We fragment the restEncoder and store a slice of it per-client until we know how many clients there are.
      * When we flush (toUint8Array) we write the restEncoder using the fragments and the meta-information.
      *
      * @type {Array<{ written: number, restEncoder: Uint8Array }>}
      */
    var clientStructs: js.Array[RestEncoder] = js.native
    
    var currClient: Double = js.native
    
    var encoder: UpdateEncoderV2 | UpdateEncoderV1 = js.native
    
    var startClock: Double = js.native
    
    var written: Double = js.native
  }
  
  inline def convertUpdateFormat(
    update: js.typedarray.Uint8Array,
    YDecoder: Instantiable0[UpdateDecoderV1 | UpdateDecoderV2],
    YEncoder: Instantiable0[UpdateEncoderV1 | UpdateEncoderV2]
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("convertUpdateFormat")(update.asInstanceOf[js.Any], YDecoder.asInstanceOf[js.Any], YEncoder.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def convertUpdateFormatV1ToV2(update: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("convertUpdateFormatV1ToV2")(update.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def convertUpdateFormatV2ToV1(update: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("convertUpdateFormatV2ToV1")(update.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
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
    YEncoder: Instantiable0[UpdateEncoderV1 | UpdateEncoderV2]
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("diffUpdateV2")(update.asInstanceOf[js.Any], sv.asInstanceOf[js.Any], YDecoder.asInstanceOf[js.Any], YEncoder.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def diffUpdateV2(
    update: js.typedarray.Uint8Array,
    sv: js.typedarray.Uint8Array,
    YDecoder: Unit,
    YEncoder: Instantiable0[UpdateEncoderV1 | UpdateEncoderV2]
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("diffUpdateV2")(update.asInstanceOf[js.Any], sv.asInstanceOf[js.Any], YDecoder.asInstanceOf[js.Any], YEncoder.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
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
    YEncoder: Instantiable0[UpdateEncoderV1 | UpdateEncoderV2]
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeUpdatesV2")(updates.asInstanceOf[js.Any], YDecoder.asInstanceOf[js.Any], YEncoder.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def mergeUpdatesV2(
    updates: js.Array[js.typedarray.Uint8Array],
    YDecoder: Unit,
    YEncoder: Instantiable0[UpdateEncoderV1 | UpdateEncoderV2]
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeUpdatesV2")(updates.asInstanceOf[js.Any], YDecoder.asInstanceOf[js.Any], YEncoder.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def parseUpdateMeta(update: js.typedarray.Uint8Array): From = ^.asInstanceOf[js.Dynamic].applyDynamic("parseUpdateMeta")(update.asInstanceOf[js.Any]).asInstanceOf[From]
  
  inline def parseUpdateMetaV2(update: js.typedarray.Uint8Array): From = ^.asInstanceOf[js.Dynamic].applyDynamic("parseUpdateMetaV2")(update.asInstanceOf[js.Any]).asInstanceOf[From]
  inline def parseUpdateMetaV2(update: js.typedarray.Uint8Array, YDecoder: Instantiable0[UpdateDecoderV1 | UpdateDecoderV2]): From = (^.asInstanceOf[js.Dynamic].applyDynamic("parseUpdateMetaV2")(update.asInstanceOf[js.Any], YDecoder.asInstanceOf[js.Any])).asInstanceOf[From]
}
