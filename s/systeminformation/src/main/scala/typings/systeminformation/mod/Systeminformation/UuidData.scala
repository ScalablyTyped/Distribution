package typings.systeminformation.mod.Systeminformation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UuidData extends StObject {
  
  var os: String
}
object UuidData {
  
  @scala.inline
  def apply(os: String): UuidData = {
    val __obj = js.Dynamic.literal(os = os.asInstanceOf[js.Any])
    __obj.asInstanceOf[UuidData]
  }
  
  @scala.inline
  implicit class UuidDataMutableBuilder[Self <: UuidData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOs(value: String): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
  }
}
