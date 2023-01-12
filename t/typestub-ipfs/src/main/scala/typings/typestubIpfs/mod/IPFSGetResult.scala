package typings.typestubIpfs.mod

import typings.node.bufferMod.global.Buffer
import typings.typestubIpfs.typestubIpfsStrings.file
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPFSGetResult extends StObject {
  
  var content: Buffer
  
  var depth: Double
  
  var hash: Buffer
  
  var name: String
  
  var path: String
  
  var size: Double
  
  var `type`: file | String
}
object IPFSGetResult {
  
  inline def apply(
    content: Buffer,
    depth: Double,
    hash: Buffer,
    name: String,
    path: String,
    size: Double,
    `type`: file | String
  ): IPFSGetResult = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPFSGetResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IPFSGetResult] (val x: Self) extends AnyVal {
    
    inline def setContent(value: Buffer): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    inline def setHash(value: Buffer): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setType(value: file | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
