package typings.web3CoreMethod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  trait Method extends StObject {
    
    var abiCoder: js.UndefOr[js.Any] = js.undefined
    
    var call: String
    
    var defaultAccount: js.UndefOr[String | Null] = js.undefined
    
    var defaultBlock: js.UndefOr[String] = js.undefined
    
    var extraFormatters: js.UndefOr[js.Any] = js.undefined
    
    var handleRevert: js.UndefOr[Boolean] = js.undefined
    
    var inputFormatter: js.UndefOr[js.Array[js.Function0[Unit] | Null]] = js.undefined
    
    var name: String
    
    var outputFormatter: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var params: js.UndefOr[Double] = js.undefined
    
    var transformPayload: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object Method {
    
    inline def apply(call: String, name: String): Method = {
      val __obj = js.Dynamic.literal(call = call.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Method]
    }
    
    extension [Self <: Method](x: Self) {
      
      inline def setAbiCoder(value: js.Any): Self = StObject.set(x, "abiCoder", value.asInstanceOf[js.Any])
      
      inline def setAbiCoderUndefined: Self = StObject.set(x, "abiCoder", js.undefined)
      
      inline def setCall(value: String): Self = StObject.set(x, "call", value.asInstanceOf[js.Any])
      
      inline def setDefaultAccount(value: String): Self = StObject.set(x, "defaultAccount", value.asInstanceOf[js.Any])
      
      inline def setDefaultAccountNull: Self = StObject.set(x, "defaultAccount", null)
      
      inline def setDefaultAccountUndefined: Self = StObject.set(x, "defaultAccount", js.undefined)
      
      inline def setDefaultBlock(value: String): Self = StObject.set(x, "defaultBlock", value.asInstanceOf[js.Any])
      
      inline def setDefaultBlockUndefined: Self = StObject.set(x, "defaultBlock", js.undefined)
      
      inline def setExtraFormatters(value: js.Any): Self = StObject.set(x, "extraFormatters", value.asInstanceOf[js.Any])
      
      inline def setExtraFormattersUndefined: Self = StObject.set(x, "extraFormatters", js.undefined)
      
      inline def setHandleRevert(value: Boolean): Self = StObject.set(x, "handleRevert", value.asInstanceOf[js.Any])
      
      inline def setHandleRevertUndefined: Self = StObject.set(x, "handleRevert", js.undefined)
      
      inline def setInputFormatter(value: js.Array[js.Function0[Unit] | Null]): Self = StObject.set(x, "inputFormatter", value.asInstanceOf[js.Any])
      
      inline def setInputFormatterUndefined: Self = StObject.set(x, "inputFormatter", js.undefined)
      
      inline def setInputFormatterVarargs(value: (js.Function0[Unit] | Null)*): Self = StObject.set(x, "inputFormatter", js.Array(value :_*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOutputFormatter(value: () => Unit): Self = StObject.set(x, "outputFormatter", js.Any.fromFunction0(value))
      
      inline def setOutputFormatterUndefined: Self = StObject.set(x, "outputFormatter", js.undefined)
      
      inline def setParams(value: Double): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setTransformPayload(value: () => Unit): Self = StObject.set(x, "transformPayload", js.Any.fromFunction0(value))
      
      inline def setTransformPayloadUndefined: Self = StObject.set(x, "transformPayload", js.undefined)
    }
  }
}
