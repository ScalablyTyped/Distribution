package typings.yjs

import typings.lib0.decodingMod.Decoder
import typings.lib0.decodingMod.IntDiffOptRleDecoder
import typings.lib0.decodingMod.RleDecoder
import typings.lib0.decodingMod.StringDecoder
import typings.lib0.decodingMod.UintOptRleDecoder
import typings.yjs.distSrcUtilsIDMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcUtilsUpdateDecoderMod {
  
  @JSImport("yjs/dist/src/utils/UpdateDecoder", "DSDecoderV1")
  @js.native
  open class DSDecoderV1 protected () extends StObject {
    /**
      * @param {decoding.Decoder} decoder
      */
    def this(decoder: Decoder) = this()
    
    /**
      * @return {number}
      */
    def readDsClock(): Double = js.native
    
    /**
      * @return {number}
      */
    def readDsLen(): Double = js.native
    
    def resetDsCurVal(): Unit = js.native
    
    var restDecoder: Decoder = js.native
  }
  
  @JSImport("yjs/dist/src/utils/UpdateDecoder", "DSDecoderV2")
  @js.native
  open class DSDecoderV2 protected () extends StObject {
    /**
      * @param {decoding.Decoder} decoder
      */
    def this(decoder: Decoder) = this()
    
    /**
      * @private
      */
    /* private */ var dsCurrVal: Any = js.native
    
    /**
      * @return {number}
      */
    def readDsClock(): Double = js.native
    
    /**
      * @return {number}
      */
    def readDsLen(): Double = js.native
    
    def resetDsCurVal(): Unit = js.native
    
    var restDecoder: Decoder = js.native
  }
  
  @JSImport("yjs/dist/src/utils/UpdateDecoder", "UpdateDecoderV1")
  @js.native
  open class UpdateDecoderV1 protected () extends DSDecoderV1 {
    /**
      * @param {decoding.Decoder} decoder
      */
    def this(decoder: Decoder) = this()
    
    /**
      * @return {any}
      */
    def readAny(): Any = js.native
    
    /**
      * @return {Uint8Array}
      */
    def readBuf(): js.typedarray.Uint8Array = js.native
    
    /**
      * Read the next client id.
      * Use this in favor of readID whenever possible to reduce the number of objects created.
      */
    def readClient(): Double = js.native
    
    /**
      * @return {number} info An unsigned 8-bit integer
      */
    def readInfo(): Double = js.native
    
    /**
      * Legacy implementation uses JSON parse. We use any-decoding in v2.
      *
      * @return {any}
      */
    def readJSON(): Any = js.native
    
    /**
      * @return {string}
      */
    def readKey(): String = js.native
    
    /**
      * @return {ID}
      */
    def readLeftID(): ID = js.native
    
    /**
      * Write len of a struct - well suited for Opt RLE encoder.
      *
      * @return {number} len
      */
    def readLen(): Double = js.native
    
    /**
      * @return {boolean} isKey
      */
    def readParentInfo(): Boolean = js.native
    
    /**
      * @return {ID}
      */
    def readRightID(): ID = js.native
    
    /**
      * @return {string}
      */
    def readString(): String = js.native
    
    /**
      * @return {number} info An unsigned 8-bit integer
      */
    def readTypeRef(): Double = js.native
  }
  
  @JSImport("yjs/dist/src/utils/UpdateDecoder", "UpdateDecoderV2")
  @js.native
  open class UpdateDecoderV2 protected () extends DSDecoderV2 {
    /**
      * @param {decoding.Decoder} decoder
      */
    def this(decoder: Decoder) = this()
    
    var clientDecoder: UintOptRleDecoder = js.native
    
    var infoDecoder: RleDecoder[Double] = js.native
    
    var keyClockDecoder: IntDiffOptRleDecoder = js.native
    
    /**
      * List of cached keys. If the keys[id] does not exist, we read a new key
      * from stringEncoder and push it to keys.
      *
      * @type {Array<string>}
      */
    var keys: js.Array[String] = js.native
    
    var leftClockDecoder: IntDiffOptRleDecoder = js.native
    
    var lenDecoder: UintOptRleDecoder = js.native
    
    var parentInfoDecoder: RleDecoder[Double] = js.native
    
    /**
      * @return {any}
      */
    def readAny(): Any = js.native
    
    /**
      * @return {Uint8Array}
      */
    def readBuf(): js.typedarray.Uint8Array = js.native
    
    /**
      * Read the next client id.
      * Use this in favor of readID whenever possible to reduce the number of objects created.
      */
    def readClient(): Double = js.native
    
    /**
      * @return {number} info An unsigned 8-bit integer
      */
    def readInfo(): Double = js.native
    
    /**
      * This is mainly here for legacy purposes.
      *
      * Initial we incoded objects using JSON. Now we use the much faster lib0/any-encoder. This method mainly exists for legacy purposes for the v1 encoder.
      *
      * @return {any}
      */
    def readJSON(): Any = js.native
    
    /**
      * @return {string}
      */
    def readKey(): String = js.native
    
    /**
      * @return {ID}
      */
    def readLeftID(): ID = js.native
    
    /**
      * Write len of a struct - well suited for Opt RLE encoder.
      *
      * @return {number}
      */
    def readLen(): Double = js.native
    
    /**
      * @return {boolean}
      */
    def readParentInfo(): Boolean = js.native
    
    /**
      * @return {ID}
      */
    def readRightID(): ID = js.native
    
    /**
      * @return {string}
      */
    def readString(): String = js.native
    
    /**
      * @return {number} An unsigned 8-bit integer
      */
    def readTypeRef(): Double = js.native
    
    var rightClockDecoder: IntDiffOptRleDecoder = js.native
    
    var stringDecoder: StringDecoder = js.native
    
    var typeRefDecoder: UintOptRleDecoder = js.native
  }
}
