package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SvnMappingDetails extends StObject {
  
  /**
    * The depth.
    */
  var depth: Double = js.native
  
  /**
    * Indicates whether to ignore externals.
    */
  var ignoreExternals: Boolean = js.native
  
  /**
    * The local path.
    */
  var localPath: String = js.native
  
  /**
    * The revision.
    */
  var revision: String = js.native
  
  /**
    * The server path.
    */
  var serverPath: String = js.native
}
object SvnMappingDetails {
  
  @scala.inline
  def apply(depth: Double, ignoreExternals: Boolean, localPath: String, revision: String, serverPath: String): SvnMappingDetails = {
    val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any], ignoreExternals = ignoreExternals.asInstanceOf[js.Any], localPath = localPath.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], serverPath = serverPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[SvnMappingDetails]
  }
  
  @scala.inline
  implicit class SvnMappingDetailsMutableBuilder[Self <: SvnMappingDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreExternals(value: Boolean): Self = StObject.set(x, "ignoreExternals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalPath(value: String): Self = StObject.set(x, "localPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevision(value: String): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerPath(value: String): Self = StObject.set(x, "serverPath", value.asInstanceOf[js.Any])
  }
}
