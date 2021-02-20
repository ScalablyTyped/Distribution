package typings.typeorm.mongodbTypingsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SessionOptions extends StObject {
  
  /**
    * Whether causal consistency should be enabled on this session
    */
  var causalConsistency: js.UndefOr[Boolean] = js.native
  
  /**
    * The default TransactionOptions to use for transactions started on this session.
    */
  var defaultTransactionOptions: js.UndefOr[TransactionOptions] = js.native
}
object SessionOptions {
  
  @scala.inline
  def apply(): SessionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SessionOptions]
  }
  
  @scala.inline
  implicit class SessionOptionsMutableBuilder[Self <: SessionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCausalConsistency(value: Boolean): Self = StObject.set(x, "causalConsistency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCausalConsistencyUndefined: Self = StObject.set(x, "causalConsistency", js.undefined)
    
    @scala.inline
    def setDefaultTransactionOptions(value: TransactionOptions): Self = StObject.set(x, "defaultTransactionOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultTransactionOptionsUndefined: Self = StObject.set(x, "defaultTransactionOptions", js.undefined)
  }
}
