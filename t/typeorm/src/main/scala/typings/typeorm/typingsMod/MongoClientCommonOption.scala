package typings.typeorm.typingsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MongoClientCommonOption extends StObject {
  
  /**
    * Do not make the db an event listener to the original connection.
    */
  var noListener: js.UndefOr[Boolean] = js.native
  
  /**
    * Control if you want to return a cached instance or have a new one created
    */
  var returnNonCachedInstance: js.UndefOr[Boolean] = js.native
}
object MongoClientCommonOption {
  
  @scala.inline
  def apply(): MongoClientCommonOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MongoClientCommonOption]
  }
  
  @scala.inline
  implicit class MongoClientCommonOptionMutableBuilder[Self <: MongoClientCommonOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNoListener(value: Boolean): Self = StObject.set(x, "noListener", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoListenerUndefined: Self = StObject.set(x, "noListener", js.undefined)
    
    @scala.inline
    def setReturnNonCachedInstance(value: Boolean): Self = StObject.set(x, "returnNonCachedInstance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnNonCachedInstanceUndefined: Self = StObject.set(x, "returnNonCachedInstance", js.undefined)
  }
}
