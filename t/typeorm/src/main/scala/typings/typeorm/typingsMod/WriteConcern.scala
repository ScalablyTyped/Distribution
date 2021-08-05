package typings.typeorm.typingsMod

import typings.typeorm.typeormStrings.majority
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WriteConcern extends StObject {
  
  /**
    * requests acknowledgement from MongoDB that the write operation has
    * been written to the journal
    */
  var j: js.UndefOr[Boolean] = js.undefined
  
  /**
    * requests acknowledgement that the write operation has
    * propagated to a specified number of mongod hosts
    */
  var w: js.UndefOr[scala.Double | majority | String] = js.undefined
  
  /**
    * a time limit, in milliseconds, for the write concern
    */
  var wtimeout: js.UndefOr[scala.Double] = js.undefined
}
object WriteConcern {
  
  inline def apply(): WriteConcern = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WriteConcern]
  }
  
  extension [Self <: WriteConcern](x: Self) {
    
    inline def setJ(value: Boolean): Self = StObject.set(x, "j", value.asInstanceOf[js.Any])
    
    inline def setJUndefined: Self = StObject.set(x, "j", js.undefined)
    
    inline def setW(value: scala.Double | majority | String): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
    
    inline def setWUndefined: Self = StObject.set(x, "w", js.undefined)
    
    inline def setWtimeout(value: scala.Double): Self = StObject.set(x, "wtimeout", value.asInstanceOf[js.Any])
    
    inline def setWtimeoutUndefined: Self = StObject.set(x, "wtimeout", js.undefined)
  }
}
