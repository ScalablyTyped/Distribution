package typings.winrtUwp.Windows.Management.Deployment

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Preview {
  
  @js.native
  trait ClassicAppManager extends StObject
  
  @js.native
  trait InstalledClassicAppInfo extends StObject {
    
    var displayName: js.Any = js.native
    
    /* unmapped type */
    var displayVersion: js.Any = js.native
  }
  object InstalledClassicAppInfo {
    
    @scala.inline
    def apply(displayName: js.Any, displayVersion: js.Any): InstalledClassicAppInfo = {
      val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], displayVersion = displayVersion.asInstanceOf[js.Any])
      __obj.asInstanceOf[InstalledClassicAppInfo]
    }
    
    @scala.inline
    implicit class InstalledClassicAppInfoMutableBuilder[Self <: InstalledClassicAppInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisplayName(value: js.Any): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayVersion(value: js.Any): Self = StObject.set(x, "displayVersion", value.asInstanceOf[js.Any])
    }
  }
}
