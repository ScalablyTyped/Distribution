package typings.vsoNodeApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReleaseUpdateMetadata extends StObject {
  
  /**
    * Sets comment for release.
    */
  var comment: String
  
  /**
    * Set 'true' to exclude the release from retention policies.
    */
  var keepForever: Boolean
  
  /**
    * Sets list of manual environments.
    */
  var manualEnvironments: js.Array[String]
  
  /**
    * Sets status of the release.
    */
  var status: ReleaseStatus
}
object ReleaseUpdateMetadata {
  
  inline def apply(comment: String, keepForever: Boolean, manualEnvironments: js.Array[String], status: ReleaseStatus): ReleaseUpdateMetadata = {
    val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any], keepForever = keepForever.asInstanceOf[js.Any], manualEnvironments = manualEnvironments.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseUpdateMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReleaseUpdateMetadata] (val x: Self) extends AnyVal {
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setKeepForever(value: Boolean): Self = StObject.set(x, "keepForever", value.asInstanceOf[js.Any])
    
    inline def setManualEnvironments(value: js.Array[String]): Self = StObject.set(x, "manualEnvironments", value.asInstanceOf[js.Any])
    
    inline def setManualEnvironmentsVarargs(value: String*): Self = StObject.set(x, "manualEnvironments", js.Array(value*))
    
    inline def setStatus(value: ReleaseStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
