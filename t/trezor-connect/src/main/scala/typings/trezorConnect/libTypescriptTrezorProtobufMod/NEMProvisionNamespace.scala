package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NEMProvisionNamespace extends StObject {
  
  var fee: UintType
  
  var namespace: String
  
  var parent: js.UndefOr[String] = js.undefined
  
  var sink: String
}
object NEMProvisionNamespace {
  
  inline def apply(fee: UintType, namespace: String, sink: String): NEMProvisionNamespace = {
    val __obj = js.Dynamic.literal(fee = fee.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], sink = sink.asInstanceOf[js.Any])
    __obj.asInstanceOf[NEMProvisionNamespace]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NEMProvisionNamespace] (val x: Self) extends AnyVal {
    
    inline def setFee(value: UintType): Self = StObject.set(x, "fee", value.asInstanceOf[js.Any])
    
    inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setSink(value: String): Self = StObject.set(x, "sink", value.asInstanceOf[js.Any])
  }
}
