package typings.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstallationTarget extends StObject {
  
  var target: String = js.native
  
  var targetVersion: String = js.native
}
object InstallationTarget {
  
  @scala.inline
  def apply(target: String, targetVersion: String): InstallationTarget = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any], targetVersion = targetVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstallationTarget]
  }
  
  @scala.inline
  implicit class InstallationTargetMutableBuilder[Self <: InstallationTarget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetVersion(value: String): Self = StObject.set(x, "targetVersion", value.asInstanceOf[js.Any])
  }
}
