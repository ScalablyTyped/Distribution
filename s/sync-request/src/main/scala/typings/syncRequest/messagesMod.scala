package typings.syncRequest

import typings.httpBasic.httpVerbMod.HttpVerb
import typings.node.Buffer
import typings.node.httpMod.IncomingHttpHeaders
import typings.syncRequest.optionsMod.MessageOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messagesMod {
  
  trait Req extends StObject {
    
    var m: HttpVerb
    
    var o: js.UndefOr[MessageOptions] = js.undefined
    
    var u: String
  }
  object Req {
    
    inline def apply(m: HttpVerb, u: String): Req = {
      val __obj = js.Dynamic.literal(m = m.asInstanceOf[js.Any], u = u.asInstanceOf[js.Any])
      __obj.asInstanceOf[Req]
    }
    
    extension [Self <: Req](x: Self) {
      
      inline def setM(value: HttpVerb): Self = StObject.set(x, "m", value.asInstanceOf[js.Any])
      
      inline def setO(value: MessageOptions): Self = StObject.set(x, "o", value.asInstanceOf[js.Any])
      
      inline def setOUndefined: Self = StObject.set(x, "o", js.undefined)
      
      inline def setU(value: String): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
    }
  }
  
  trait Res extends StObject {
    
    var b: Buffer | String
    
    var h: IncomingHttpHeaders
    
    var s: Double
    
    var u: String
  }
  object Res {
    
    inline def apply(b: Buffer | String, h: IncomingHttpHeaders, s: Double, u: String): Res = {
      val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], u = u.asInstanceOf[js.Any])
      __obj.asInstanceOf[Res]
    }
    
    extension [Self <: Res](x: Self) {
      
      inline def setB(value: Buffer | String): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      inline def setH(value: IncomingHttpHeaders): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      inline def setS(value: Double): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
      
      inline def setU(value: String): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
    }
  }
}
