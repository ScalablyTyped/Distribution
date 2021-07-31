package typings.tabris.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LastModified extends StObject {
  
  var lastModified: js.UndefOr[Double] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object LastModified {
  
  @scala.inline
  def apply(): LastModified = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LastModified]
  }
  
  @scala.inline
  implicit class LastModifiedMutableBuilder[Self <: LastModified] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLastModified(value: Double): Self = StObject.set(x, "lastModified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedUndefined: Self = StObject.set(x, "lastModified", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
