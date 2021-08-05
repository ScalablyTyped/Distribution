package typings.wxServerSdk.anon

import typings.node.Buffer
import typings.node.fsMod.ReadStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloudPath extends StObject {
  
  var cloudPath: String
  
  var fileContent: Buffer | ReadStream
}
object CloudPath {
  
  inline def apply(cloudPath: String, fileContent: Buffer | ReadStream): CloudPath = {
    val __obj = js.Dynamic.literal(cloudPath = cloudPath.asInstanceOf[js.Any], fileContent = fileContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudPath]
  }
  
  extension [Self <: CloudPath](x: Self) {
    
    inline def setCloudPath(value: String): Self = StObject.set(x, "cloudPath", value.asInstanceOf[js.Any])
    
    inline def setFileContent(value: Buffer | ReadStream): Self = StObject.set(x, "fileContent", value.asInstanceOf[js.Any])
  }
}
