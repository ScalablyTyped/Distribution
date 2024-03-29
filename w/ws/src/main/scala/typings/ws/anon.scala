package typings.ws

import typings.node.bufferMod.global.Buffer
import typings.node.httpMod.IncomingMessage
import typings.ws.mod._BufferLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0`
    extends StObject
       with _BufferLike
  
  trait `1`
    extends StObject
       with _BufferLike
  
  trait `2`
    extends StObject
       with _BufferLike
  
  trait `3`
    extends StObject
       with _BufferLike
  
  trait Binary extends StObject {
    
    var binary: js.UndefOr[Boolean] = js.undefined
    
    var compress: js.UndefOr[Boolean] = js.undefined
    
    var fin: js.UndefOr[Boolean] = js.undefined
    
    var mask: js.UndefOr[Boolean] = js.undefined
  }
  object Binary {
    
    inline def apply(): Binary = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Binary]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Binary] (val x: Self) extends AnyVal {
      
      inline def setBinary(value: Boolean): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
      
      inline def setBinaryUndefined: Self = StObject.set(x, "binary", js.undefined)
      
      inline def setCompress(value: Boolean): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
      
      inline def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
      
      inline def setFin(value: Boolean): Self = StObject.set(x, "fin", value.asInstanceOf[js.Any])
      
      inline def setFinUndefined: Self = StObject.set(x, "fin", js.undefined)
      
      inline def setMask(value: Boolean): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
    }
  }
  
  trait ChunkSize extends StObject {
    
    var chunkSize: js.UndefOr[Double] = js.undefined
    
    var dictionary: js.UndefOr[Buffer | js.Array[Buffer] | js.typedarray.DataView] = js.undefined
    
    var finishFlush: js.UndefOr[Double] = js.undefined
    
    var flush: js.UndefOr[Double] = js.undefined
    
    var info: js.UndefOr[Boolean] = js.undefined
    
    var level: js.UndefOr[Double] = js.undefined
    
    var memLevel: js.UndefOr[Double] = js.undefined
    
    var strategy: js.UndefOr[Double] = js.undefined
    
    var windowBits: js.UndefOr[Double] = js.undefined
  }
  object ChunkSize {
    
    inline def apply(): ChunkSize = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChunkSize]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ChunkSize] (val x: Self) extends AnyVal {
      
      inline def setChunkSize(value: Double): Self = StObject.set(x, "chunkSize", value.asInstanceOf[js.Any])
      
      inline def setChunkSizeUndefined: Self = StObject.set(x, "chunkSize", js.undefined)
      
      inline def setDictionary(value: Buffer | js.Array[Buffer] | js.typedarray.DataView): Self = StObject.set(x, "dictionary", value.asInstanceOf[js.Any])
      
      inline def setDictionaryUndefined: Self = StObject.set(x, "dictionary", js.undefined)
      
      inline def setDictionaryVarargs(value: Buffer*): Self = StObject.set(x, "dictionary", js.Array(value*))
      
      inline def setFinishFlush(value: Double): Self = StObject.set(x, "finishFlush", value.asInstanceOf[js.Any])
      
      inline def setFinishFlushUndefined: Self = StObject.set(x, "finishFlush", js.undefined)
      
      inline def setFlush(value: Double): Self = StObject.set(x, "flush", value.asInstanceOf[js.Any])
      
      inline def setFlushUndefined: Self = StObject.set(x, "flush", js.undefined)
      
      inline def setInfo(value: Boolean): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
      
      inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      inline def setMemLevel(value: Double): Self = StObject.set(x, "memLevel", value.asInstanceOf[js.Any])
      
      inline def setMemLevelUndefined: Self = StObject.set(x, "memLevel", js.undefined)
      
      inline def setStrategy(value: Double): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
      
      inline def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
      
      inline def setWindowBits(value: Double): Self = StObject.set(x, "windowBits", value.asInstanceOf[js.Any])
      
      inline def setWindowBitsUndefined: Self = StObject.set(x, "windowBits", js.undefined)
    }
  }
  
  trait Origin extends StObject {
    
    var origin: String
    
    var req: IncomingMessage
    
    var secure: Boolean
  }
  object Origin {
    
    inline def apply(origin: String, req: IncomingMessage, secure: Boolean): Origin = {
      val __obj = js.Dynamic.literal(origin = origin.asInstanceOf[js.Any], req = req.asInstanceOf[js.Any], secure = secure.asInstanceOf[js.Any])
      __obj.asInstanceOf[Origin]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Origin] (val x: Self) extends AnyVal {
      
      inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setReq(value: IncomingMessage): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
      
      inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ToPrimitive
    extends StObject
       with _BufferLike {
    
    @JSName(js.Symbol.toPrimitive)
    var toPrimitive: js.Function1[/* hint */ String, String] = js.native
  }
  
  trait TypeofWebSocket extends StObject {
    
    /* standard dom */
    val CLOSED: typings.ws.wsInts.`3`
    
    /* standard dom */
    val CLOSING: typings.ws.wsInts.`2`
    
    /* standard dom */
    val CONNECTING: typings.ws.wsInts.`0`
    
    /* standard dom */
    val OPEN: typings.ws.wsInts.`1`
  }
  object TypeofWebSocket {
    
    inline def apply(): TypeofWebSocket = {
      val __obj = js.Dynamic.literal(CLOSED = 3, CLOSING = 2, CONNECTING = 0, OPEN = 1)
      __obj.asInstanceOf[TypeofWebSocket]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TypeofWebSocket] (val x: Self) extends AnyVal {
      
      inline def setCLOSED(value: typings.ws.wsInts.`3`): Self = StObject.set(x, "CLOSED", value.asInstanceOf[js.Any])
      
      inline def setCLOSING(value: typings.ws.wsInts.`2`): Self = StObject.set(x, "CLOSING", value.asInstanceOf[js.Any])
      
      inline def setCONNECTING(value: typings.ws.wsInts.`0`): Self = StObject.set(x, "CONNECTING", value.asInstanceOf[js.Any])
      
      inline def setOPEN(value: typings.ws.wsInts.`1`): Self = StObject.set(x, "OPEN", value.asInstanceOf[js.Any])
    }
  }
  
  trait ValueOf
    extends StObject
       with _BufferLike
}
