package typings.yjs

import typings.lib0.encodingMod.Encoder
import typings.lib0.encodingMod.IntDiffOptRleEncoder
import typings.lib0.encodingMod.RleEncoder
import typings.lib0.encodingMod.StringEncoder
import typings.lib0.encodingMod.UintOptRleEncoder
import typings.std.Map
import typings.yjs.distSrcUtilsIDMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcUtilsUpdateEncoderMod {
  
  @JSImport("yjs/dist/src/utils/UpdateEncoder", "DSEncoderV1")
  @js.native
  open class DSEncoderV1 () extends StObject {
    
    def resetDsCurVal(): Unit = js.native
    
    var restEncoder: Encoder = js.native
    
    def toUint8Array(): js.typedarray.Uint8Array = js.native
    
    /**
      * @param {number} clock
      */
    def writeDsClock(clock: Double): Unit = js.native
    
    /**
      * @param {number} len
      */
    def writeDsLen(len: Double): Unit = js.native
  }
  
  @JSImport("yjs/dist/src/utils/UpdateEncoder", "DSEncoderV2")
  @js.native
  open class DSEncoderV2 () extends StObject {
    
    var dsCurrVal: Double = js.native
    
    def resetDsCurVal(): Unit = js.native
    
    var restEncoder: Encoder = js.native
    
    def toUint8Array(): js.typedarray.Uint8Array = js.native
    
    /**
      * @param {number} clock
      */
    def writeDsClock(clock: Double): Unit = js.native
    
    /**
      * @param {number} len
      */
    def writeDsLen(len: Double): Unit = js.native
  }
  
  @JSImport("yjs/dist/src/utils/UpdateEncoder", "UpdateEncoderV1")
  @js.native
  open class UpdateEncoderV1 () extends DSEncoderV1 {
    
    /**
      * @param {any} any
      */
    def writeAny(any: Any): Unit = js.native
    
    /**
      * @param {Uint8Array} buf
      */
    def writeBuf(buf: js.typedarray.Uint8Array): Unit = js.native
    
    /**
      * Use writeClient and writeClock instead of writeID if possible.
      * @param {number} client
      */
    def writeClient(client: Double): Unit = js.native
    
    /**
      * @param {number} info An unsigned 8-bit integer
      */
    def writeInfo(info: Double): Unit = js.native
    
    /**
      * @param {any} embed
      */
    def writeJSON(embed: Any): Unit = js.native
    
    /**
      * @param {string} key
      */
    def writeKey(key: String): Unit = js.native
    
    /**
      * @param {ID} id
      */
    def writeLeftID(id: ID): Unit = js.native
    
    /**
      * Write len of a struct - well suited for Opt RLE encoder.
      *
      * @param {number} len
      */
    def writeLen(len: Double): Unit = js.native
    
    /**
      * @param {boolean} isYKey
      */
    def writeParentInfo(isYKey: Boolean): Unit = js.native
    
    /**
      * @param {ID} id
      */
    def writeRightID(id: ID): Unit = js.native
    
    /**
      * @param {string} s
      */
    def writeString(s: String): Unit = js.native
    
    /**
      * @param {number} info An unsigned 8-bit integer
      */
    def writeTypeRef(info: Double): Unit = js.native
  }
  
  @JSImport("yjs/dist/src/utils/UpdateEncoder", "UpdateEncoderV2")
  @js.native
  open class UpdateEncoderV2 () extends DSEncoderV2 {
    
    var clientEncoder: UintOptRleEncoder = js.native
    
    var infoEncoder: RleEncoder[Double] = js.native
    
    /**
      * Refers to the next uniqe key-identifier to me used.
      * See writeKey method for more information.
      *
      * @type {number}
      */
    var keyClock: Double = js.native
    
    var keyClockEncoder: IntDiffOptRleEncoder = js.native
    
    /**
      * @type {Map<string,number>}
      */
    var keyMap: Map[String, Double] = js.native
    
    var leftClockEncoder: IntDiffOptRleEncoder = js.native
    
    var lenEncoder: UintOptRleEncoder = js.native
    
    var parentInfoEncoder: RleEncoder[Double] = js.native
    
    var rightClockEncoder: IntDiffOptRleEncoder = js.native
    
    var stringEncoder: StringEncoder = js.native
    
    var typeRefEncoder: UintOptRleEncoder = js.native
    
    /**
      * @param {any} any
      */
    def writeAny(any: Any): Unit = js.native
    
    /**
      * @param {Uint8Array} buf
      */
    def writeBuf(buf: js.typedarray.Uint8Array): Unit = js.native
    
    /**
      * @param {number} client
      */
    def writeClient(client: Double): Unit = js.native
    
    /**
      * @param {number} info An unsigned 8-bit integer
      */
    def writeInfo(info: Double): Unit = js.native
    
    /**
      * This is mainly here for legacy purposes.
      *
      * Initial we incoded objects using JSON. Now we use the much faster lib0/any-encoder. This method mainly exists for legacy purposes for the v1 encoder.
      *
      * @param {any} embed
      */
    def writeJSON(embed: Any): Unit = js.native
    
    /**
      * Property keys are often reused. For example, in y-prosemirror the key `bold` might
      * occur very often. For a 3d application, the key `position` might occur very often.
      *
      * We cache these keys in a Map and refer to them via a unique number.
      *
      * @param {string} key
      */
    def writeKey(key: String): Unit = js.native
    
    /**
      * @param {ID} id
      */
    def writeLeftID(id: ID): Unit = js.native
    
    /**
      * Write len of a struct - well suited for Opt RLE encoder.
      *
      * @param {number} len
      */
    def writeLen(len: Double): Unit = js.native
    
    /**
      * @param {boolean} isYKey
      */
    def writeParentInfo(isYKey: Boolean): Unit = js.native
    
    /**
      * @param {ID} id
      */
    def writeRightID(id: ID): Unit = js.native
    
    /**
      * @param {string} s
      */
    def writeString(s: String): Unit = js.native
    
    /**
      * @param {number} info An unsigned 8-bit integer
      */
    def writeTypeRef(info: Double): Unit = js.native
  }
}
