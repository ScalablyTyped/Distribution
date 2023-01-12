package typings.yaDisk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SystemFolders extends StObject {
  
  var applications: String
  
  var downloads: String
}
object SystemFolders {
  
  inline def apply(applications: String, downloads: String): SystemFolders = {
    val __obj = js.Dynamic.literal(applications = applications.asInstanceOf[js.Any], downloads = downloads.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemFolders]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SystemFolders] (val x: Self) extends AnyVal {
    
    inline def setApplications(value: String): Self = StObject.set(x, "applications", value.asInstanceOf[js.Any])
    
    inline def setDownloads(value: String): Self = StObject.set(x, "downloads", value.asInstanceOf[js.Any])
  }
}
