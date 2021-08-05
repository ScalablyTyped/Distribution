package typings.ws

import typings.node.Buffer
import typings.node.httpMod.IncomingMessage
import typings.std.DataView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
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
    
    extension [Self <: Binary](x: Self) {
      
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
    
    var dictionary: js.UndefOr[Buffer | js.Array[Buffer] | DataView] = js.undefined
    
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
    
    extension [Self <: ChunkSize](x: Self) {
      
      inline def setChunkSize(value: Double): Self = StObject.set(x, "chunkSize", value.asInstanceOf[js.Any])
      
      inline def setChunkSizeUndefined: Self = StObject.set(x, "chunkSize", js.undefined)
      
      inline def setDictionary(value: Buffer | js.Array[Buffer] | DataView): Self = StObject.set(x, "dictionary", value.asInstanceOf[js.Any])
      
      inline def setDictionaryUndefined: Self = StObject.set(x, "dictionary", js.undefined)
      
      inline def setDictionaryVarargs(value: Buffer*): Self = StObject.set(x, "dictionary", js.Array(value :_*))
      
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
  
  trait Code extends StObject {
    
    var code: Double
    
    var reason: String
    
    var target: this.type
    
    var wasClean: Boolean
  }
  object Code {
    
    inline def apply(code: Double, reason: String, target: Code, wasClean: Boolean): Code = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], wasClean = wasClean.asInstanceOf[js.Any])
      __obj.asInstanceOf[Code]
    }
    
    extension [Self <: Code](x: Self) {
      
      inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: Code): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setWasClean(value: Boolean): Self = StObject.set(x, "wasClean", value.asInstanceOf[js.Any])
    }
  }
  
  trait Data extends StObject {
    
    var data: js.Any
    
    var target: this.type
    
    var `type`: String
  }
  object Data {
    
    inline def apply(data: js.Any, target: Data, `type`: String): Data = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    extension [Self <: Data](x: Self) {
      
      inline def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: Data): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Error extends StObject {
    
    var error: js.Any
    
    var message: js.Any
    
    var target: this.type
    
    var `type`: String
  }
  object Error {
    
    inline def apply(error: js.Any, message: js.Any, target: Error, `type`: String): Error = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Error]
    }
    
    extension [Self <: Error](x: Self) {
      
      inline def setError(value: js.Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: js.Any): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: Error): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
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
    
    extension [Self <: Origin](x: Self) {
      
      inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setReq(value: IncomingMessage): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
      
      inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
    }
  }
  
  trait Target extends StObject {
    
    var target: this.type
  }
  object Target {
    
    inline def apply(target: Target): Target = {
      val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[Target]
    }
    
    extension [Self <: Target](x: Self) {
      
      inline def setTarget(value: Target): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
}
