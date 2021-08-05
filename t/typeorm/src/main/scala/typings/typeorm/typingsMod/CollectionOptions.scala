package typings.typeorm.typingsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollectionOptions extends StObject {
  
  /**
    * Specify a journal write concern.
    */
  var j: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The write concern.
    */
  var w: js.UndefOr[scala.Double | String] = js.undefined
  
  /**
    * The write concern timeout.
    */
  var wtimeout: js.UndefOr[scala.Double] = js.undefined
}
object CollectionOptions {
  
  inline def apply(): CollectionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectionOptions]
  }
  
  extension [Self <: CollectionOptions](x: Self) {
    
    inline def setJ(value: Boolean): Self = StObject.set(x, "j", value.asInstanceOf[js.Any])
    
    inline def setJUndefined: Self = StObject.set(x, "j", js.undefined)
    
    inline def setW(value: scala.Double | String): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
    
    inline def setWUndefined: Self = StObject.set(x, "w", js.undefined)
    
    inline def setWtimeout(value: scala.Double): Self = StObject.set(x, "wtimeout", value.asInstanceOf[js.Any])
    
    inline def setWtimeoutUndefined: Self = StObject.set(x, "wtimeout", js.undefined)
  }
}
