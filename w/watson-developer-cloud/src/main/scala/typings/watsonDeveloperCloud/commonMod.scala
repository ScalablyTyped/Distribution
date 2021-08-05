package typings.watsonDeveloperCloud

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonMod {
  
  @JSImport("watson-developer-cloud/lib/common", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getSdkHeaders(serviceName: String, serviceVersion: String, operationId: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getSdkHeaders")(serviceName.asInstanceOf[js.Any], serviceVersion.asInstanceOf[js.Any], operationId.asInstanceOf[js.Any])).asInstanceOf[js.Any]
}
