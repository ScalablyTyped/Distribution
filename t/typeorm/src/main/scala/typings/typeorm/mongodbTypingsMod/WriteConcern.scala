package typings.typeorm.mongodbTypingsMod

import typings.typeorm.typeormStrings.majority
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WriteConcern extends StObject {
  
  /**
    * requests acknowledgement from MongoDB that the write operation has
    * been written to the journal
    */
  var j: js.UndefOr[Boolean] = js.native
  
  /**
    * requests acknowledgement that the write operation has
    * propagated to a specified number of mongod hosts
    */
  var w: js.UndefOr[scala.Double | majority | String] = js.native
  
  /**
    * a time limit, in milliseconds, for the write concern
    */
  var wtimeout: js.UndefOr[scala.Double] = js.native
}
object WriteConcern {
  
  @scala.inline
  def apply(): WriteConcern = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WriteConcern]
  }
  
  @scala.inline
  implicit class WriteConcernMutableBuilder[Self <: WriteConcern] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJ(value: Boolean): Self = StObject.set(x, "j", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJUndefined: Self = StObject.set(x, "j", js.undefined)
    
    @scala.inline
    def setW(value: scala.Double | majority | String): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWUndefined: Self = StObject.set(x, "w", js.undefined)
    
    @scala.inline
    def setWtimeout(value: scala.Double): Self = StObject.set(x, "wtimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWtimeoutUndefined: Self = StObject.set(x, "wtimeout", js.undefined)
  }
}
