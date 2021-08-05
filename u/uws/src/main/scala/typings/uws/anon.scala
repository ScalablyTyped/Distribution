package typings.uws

import typings.node.httpMod.IncomingMessage
import typings.uws.mod.WebSocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var target: this.type
  }
  object `0` {
    
    inline def apply(target: `0`): `0` = {
      val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[`0`]
    }
    
    extension [Self <: `0`](x: Self) {
      
      inline def setTarget(value: `0`): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  trait Binary extends StObject {
    
    var binary: js.UndefOr[Boolean] = js.undefined
    
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
      
      inline def setMask(value: Boolean): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
    }
  }
  
  trait BinaryBoolean extends StObject {
    
    var binary: Boolean
  }
  object BinaryBoolean {
    
    inline def apply(binary: Boolean): BinaryBoolean = {
      val __obj = js.Dynamic.literal(binary = binary.asInstanceOf[js.Any])
      __obj.asInstanceOf[BinaryBoolean]
    }
    
    extension [Self <: BinaryBoolean](x: Self) {
      
      inline def setBinary(value: Boolean): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
    }
  }
  
  trait Code extends StObject {
    
    var code: Double
    
    var reason: String
    
    var target: WebSocket
    
    var wasClean: Boolean
  }
  object Code {
    
    inline def apply(code: Double, reason: String, target: WebSocket, wasClean: Boolean): Code = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], wasClean = wasClean.asInstanceOf[js.Any])
      __obj.asInstanceOf[Code]
    }
    
    extension [Self <: Code](x: Self) {
      
      inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: WebSocket): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setWasClean(value: Boolean): Self = StObject.set(x, "wasClean", value.asInstanceOf[js.Any])
    }
  }
  
  trait Data extends StObject {
    
    var data: js.Any
    
    var target: WebSocket
    
    var `type`: String
  }
  object Data {
    
    inline def apply(data: js.Any, target: WebSocket, `type`: String): Data = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    extension [Self <: Data](x: Self) {
      
      inline def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: WebSocket): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
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
  
  trait Reason extends StObject {
    
    var code: Double
    
    var reason: String
    
    var target: this.type
    
    var wasClean: Boolean
  }
  object Reason {
    
    inline def apply(code: Double, reason: String, target: Reason, wasClean: Boolean): Reason = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], wasClean = wasClean.asInstanceOf[js.Any])
      __obj.asInstanceOf[Reason]
    }
    
    extension [Self <: Reason](x: Self) {
      
      inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: Reason): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setWasClean(value: Boolean): Self = StObject.set(x, "wasClean", value.asInstanceOf[js.Any])
    }
  }
  
  trait Target extends StObject {
    
    var target: WebSocket
  }
  object Target {
    
    inline def apply(target: WebSocket): Target = {
      val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[Target]
    }
    
    extension [Self <: Target](x: Self) {
      
      inline def setTarget(value: WebSocket): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  trait Type extends StObject {
    
    var data: js.Any
    
    var target: this.type
    
    var `type`: String
  }
  object Type {
    
    inline def apply(data: js.Any, target: Type, `type`: String): Type = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Type]
    }
    
    extension [Self <: Type](x: Self) {
      
      inline def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: Type): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
