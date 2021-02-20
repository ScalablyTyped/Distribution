package typings.webgme.Gme

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransactionResult extends StObject {
  
  var hash: String = js.native
  
  /**
    * may be: 'SYNCED' or 'FORKED'
    */
  var status: String = js.native
}
object TransactionResult {
  
  @scala.inline
  def apply(hash: String, status: String): TransactionResult = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionResult]
  }
  
  @scala.inline
  implicit class TransactionResultMutableBuilder[Self <: TransactionResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
