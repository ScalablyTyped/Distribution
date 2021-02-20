package typings.syncRequest

import typings.httpBasic.httpVerbMod.HttpVerb
import typings.node.Buffer
import typings.node.httpMod.IncomingHttpHeaders
import typings.syncRequest.optionsMod.MessageOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messagesMod {
  
  @js.native
  trait Req extends StObject {
    
    var m: HttpVerb = js.native
    
    var o: js.UndefOr[MessageOptions] = js.native
    
    var u: String = js.native
  }
  object Req {
    
    @scala.inline
    def apply(m: HttpVerb, u: String): Req = {
      val __obj = js.Dynamic.literal(m = m.asInstanceOf[js.Any], u = u.asInstanceOf[js.Any])
      __obj.asInstanceOf[Req]
    }
    
    @scala.inline
    implicit class ReqMutableBuilder[Self <: Req] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setM(value: HttpVerb): Self = StObject.set(x, "m", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setO(value: MessageOptions): Self = StObject.set(x, "o", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOUndefined: Self = StObject.set(x, "o", js.undefined)
      
      @scala.inline
      def setU(value: String): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Res extends StObject {
    
    var b: Buffer | String = js.native
    
    var h: IncomingHttpHeaders = js.native
    
    var s: Double = js.native
    
    var u: String = js.native
  }
  object Res {
    
    @scala.inline
    def apply(b: Buffer | String, h: IncomingHttpHeaders, s: Double, u: String): Res = {
      val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], u = u.asInstanceOf[js.Any])
      __obj.asInstanceOf[Res]
    }
    
    @scala.inline
    implicit class ResMutableBuilder[Self <: Res] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setB(value: Buffer | String): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setH(value: IncomingHttpHeaders): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS(value: Double): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setU(value: String): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
    }
  }
}
