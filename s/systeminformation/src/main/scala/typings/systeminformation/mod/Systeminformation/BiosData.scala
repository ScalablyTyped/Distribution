package typings.systeminformation.mod.Systeminformation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BiosData extends StObject {
  
  var releaseDate: String
  
  var revision: String
  
  var vendor: String
  
  var version: String
}
object BiosData {
  
  @scala.inline
  def apply(releaseDate: String, revision: String, vendor: String, version: String): BiosData = {
    val __obj = js.Dynamic.literal(releaseDate = releaseDate.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], vendor = vendor.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[BiosData]
  }
  
  @scala.inline
  implicit class BiosDataMutableBuilder[Self <: BiosData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReleaseDate(value: String): Self = StObject.set(x, "releaseDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevision(value: String): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVendor(value: String): Self = StObject.set(x, "vendor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
