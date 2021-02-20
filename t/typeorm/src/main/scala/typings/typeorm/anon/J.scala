package typings.typeorm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait J extends StObject {
  
  var j: js.UndefOr[Boolean] = js.native
  
  var upsert: js.UndefOr[Boolean] = js.native
  
  var w: js.UndefOr[js.Any] = js.native
  
  var wtimeout: js.UndefOr[Double] = js.native
}
object J {
  
  @scala.inline
  def apply(): J = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[J]
  }
  
  @scala.inline
  implicit class JMutableBuilder[Self <: J] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJ(value: Boolean): Self = StObject.set(x, "j", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJUndefined: Self = StObject.set(x, "j", js.undefined)
    
    @scala.inline
    def setUpsert(value: Boolean): Self = StObject.set(x, "upsert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpsertUndefined: Self = StObject.set(x, "upsert", js.undefined)
    
    @scala.inline
    def setW(value: js.Any): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWUndefined: Self = StObject.set(x, "w", js.undefined)
    
    @scala.inline
    def setWtimeout(value: Double): Self = StObject.set(x, "wtimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWtimeoutUndefined: Self = StObject.set(x, "wtimeout", js.undefined)
  }
}
