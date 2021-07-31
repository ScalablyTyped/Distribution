package typings.ts3NodejsLibrary.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Permid extends StObject {
  
  var permid: js.UndefOr[Double] = js.undefined
  
  var permsid: js.UndefOr[String] = js.undefined
  
  var permvalue: Double
}
object Permid {
  
  @scala.inline
  def apply(permvalue: Double): Permid = {
    val __obj = js.Dynamic.literal(permvalue = permvalue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Permid]
  }
  
  @scala.inline
  implicit class PermidMutableBuilder[Self <: Permid] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPermid(value: Double): Self = StObject.set(x, "permid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermidUndefined: Self = StObject.set(x, "permid", js.undefined)
    
    @scala.inline
    def setPermsid(value: String): Self = StObject.set(x, "permsid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermsidUndefined: Self = StObject.set(x, "permsid", js.undefined)
    
    @scala.inline
    def setPermvalue(value: Double): Self = StObject.set(x, "permvalue", value.asInstanceOf[js.Any])
  }
}
