package typings.typeorm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined typeorm.typeorm/driver/mongodb/typings.CollectionOptions & {  single :boolean | undefined} */
@js.native
trait CollectionOptionssinglebo extends StObject {
  
  /**
    * Specify a journal write concern.
    */
  var j: js.UndefOr[Boolean] = js.native
  
  var single: js.UndefOr[Boolean] = js.native
  
  /**
    * The write concern.
    */
  var w: js.UndefOr[Double | String] = js.native
  
  /**
    * The write concern timeout.
    */
  var wtimeout: js.UndefOr[Double] = js.native
}
object CollectionOptionssinglebo {
  
  @scala.inline
  def apply(): CollectionOptionssinglebo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectionOptionssinglebo]
  }
  
  @scala.inline
  implicit class CollectionOptionssingleboMutableBuilder[Self <: CollectionOptionssinglebo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJ(value: Boolean): Self = StObject.set(x, "j", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJUndefined: Self = StObject.set(x, "j", js.undefined)
    
    @scala.inline
    def setSingle(value: Boolean): Self = StObject.set(x, "single", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingleUndefined: Self = StObject.set(x, "single", js.undefined)
    
    @scala.inline
    def setW(value: Double | String): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWUndefined: Self = StObject.set(x, "w", js.undefined)
    
    @scala.inline
    def setWtimeout(value: Double): Self = StObject.set(x, "wtimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWtimeoutUndefined: Self = StObject.set(x, "wtimeout", js.undefined)
  }
}
