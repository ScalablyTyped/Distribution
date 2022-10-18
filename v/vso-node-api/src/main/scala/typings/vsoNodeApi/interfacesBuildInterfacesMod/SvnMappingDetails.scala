package typings.vsoNodeApi.interfacesBuildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SvnMappingDetails extends StObject {
  
  /**
    * The depth.
    */
  var depth: Double
  
  /**
    * Indicates whether to ignore externals.
    */
  var ignoreExternals: Boolean
  
  /**
    * The local path.
    */
  var localPath: String
  
  /**
    * The revision.
    */
  var revision: String
  
  /**
    * The server path.
    */
  var serverPath: String
}
object SvnMappingDetails {
  
  inline def apply(depth: Double, ignoreExternals: Boolean, localPath: String, revision: String, serverPath: String): SvnMappingDetails = {
    val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any], ignoreExternals = ignoreExternals.asInstanceOf[js.Any], localPath = localPath.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], serverPath = serverPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[SvnMappingDetails]
  }
  
  extension [Self <: SvnMappingDetails](x: Self) {
    
    inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    inline def setIgnoreExternals(value: Boolean): Self = StObject.set(x, "ignoreExternals", value.asInstanceOf[js.Any])
    
    inline def setLocalPath(value: String): Self = StObject.set(x, "localPath", value.asInstanceOf[js.Any])
    
    inline def setRevision(value: String): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    
    inline def setServerPath(value: String): Self = StObject.set(x, "serverPath", value.asInstanceOf[js.Any])
  }
}
