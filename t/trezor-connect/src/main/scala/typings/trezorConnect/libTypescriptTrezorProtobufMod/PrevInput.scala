package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrevInput extends StObject {
  
  var decred_tree: js.UndefOr[Double] = js.undefined
  
  var prev_hash: String
  
  var prev_index: Double
  
  var script_sig: String
  
  var sequence: Double
}
object PrevInput {
  
  inline def apply(prev_hash: String, prev_index: Double, script_sig: String, sequence: Double): PrevInput = {
    val __obj = js.Dynamic.literal(prev_hash = prev_hash.asInstanceOf[js.Any], prev_index = prev_index.asInstanceOf[js.Any], script_sig = script_sig.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrevInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PrevInput] (val x: Self) extends AnyVal {
    
    inline def setDecred_tree(value: Double): Self = StObject.set(x, "decred_tree", value.asInstanceOf[js.Any])
    
    inline def setDecred_treeUndefined: Self = StObject.set(x, "decred_tree", js.undefined)
    
    inline def setPrev_hash(value: String): Self = StObject.set(x, "prev_hash", value.asInstanceOf[js.Any])
    
    inline def setPrev_index(value: Double): Self = StObject.set(x, "prev_index", value.asInstanceOf[js.Any])
    
    inline def setScript_sig(value: String): Self = StObject.set(x, "script_sig", value.asInstanceOf[js.Any])
    
    inline def setSequence(value: Double): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
  }
}
