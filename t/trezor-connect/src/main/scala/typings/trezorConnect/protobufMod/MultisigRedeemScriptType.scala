package typings.trezorConnect.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultisigRedeemScriptType extends StObject {
  
  var address_n: js.UndefOr[js.Array[Double]] = js.undefined
  
  var m: Double
  
  var nodes: js.UndefOr[js.Array[HDNodeType]] = js.undefined
  
  var pubkeys: js.Array[HDNodePathType]
  
  var signatures: js.Array[String]
}
object MultisigRedeemScriptType {
  
  inline def apply(m: Double, pubkeys: js.Array[HDNodePathType], signatures: js.Array[String]): MultisigRedeemScriptType = {
    val __obj = js.Dynamic.literal(m = m.asInstanceOf[js.Any], pubkeys = pubkeys.asInstanceOf[js.Any], signatures = signatures.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultisigRedeemScriptType]
  }
  
  extension [Self <: MultisigRedeemScriptType](x: Self) {
    
    inline def setAddress_n(value: js.Array[Double]): Self = StObject.set(x, "address_n", value.asInstanceOf[js.Any])
    
    inline def setAddress_nUndefined: Self = StObject.set(x, "address_n", js.undefined)
    
    inline def setAddress_nVarargs(value: Double*): Self = StObject.set(x, "address_n", js.Array(value*))
    
    inline def setM(value: Double): Self = StObject.set(x, "m", value.asInstanceOf[js.Any])
    
    inline def setNodes(value: js.Array[HDNodeType]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesUndefined: Self = StObject.set(x, "nodes", js.undefined)
    
    inline def setNodesVarargs(value: HDNodeType*): Self = StObject.set(x, "nodes", js.Array(value*))
    
    inline def setPubkeys(value: js.Array[HDNodePathType]): Self = StObject.set(x, "pubkeys", value.asInstanceOf[js.Any])
    
    inline def setPubkeysVarargs(value: HDNodePathType*): Self = StObject.set(x, "pubkeys", js.Array(value*))
    
    inline def setSignatures(value: js.Array[String]): Self = StObject.set(x, "signatures", value.asInstanceOf[js.Any])
    
    inline def setSignaturesVarargs(value: String*): Self = StObject.set(x, "signatures", js.Array(value*))
  }
}
