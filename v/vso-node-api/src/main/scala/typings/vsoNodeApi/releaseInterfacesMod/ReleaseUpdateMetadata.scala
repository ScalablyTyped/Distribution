package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReleaseUpdateMetadata extends StObject {
  
  /**
    * Sets comment for release.
    */
  var comment: String = js.native
  
  /**
    * Set 'true' to exclude the release from retention policies.
    */
  var keepForever: Boolean = js.native
  
  /**
    * Sets list of manual environments.
    */
  var manualEnvironments: js.Array[String] = js.native
  
  /**
    * Sets status of the release.
    */
  var status: ReleaseStatus = js.native
}
object ReleaseUpdateMetadata {
  
  @scala.inline
  def apply(comment: String, keepForever: Boolean, manualEnvironments: js.Array[String], status: ReleaseStatus): ReleaseUpdateMetadata = {
    val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any], keepForever = keepForever.asInstanceOf[js.Any], manualEnvironments = manualEnvironments.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseUpdateMetadata]
  }
  
  @scala.inline
  implicit class ReleaseUpdateMetadataMutableBuilder[Self <: ReleaseUpdateMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepForever(value: Boolean): Self = StObject.set(x, "keepForever", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManualEnvironments(value: js.Array[String]): Self = StObject.set(x, "manualEnvironments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManualEnvironmentsVarargs(value: String*): Self = StObject.set(x, "manualEnvironments", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: ReleaseStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
