package typings.typestubIpfs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPFSFile extends StObject {
  
  var content: js.UndefOr[FileContent] = js.undefined
  
  var hash: String
  
  var path: String
  
  var size: Double
}
object IPFSFile {
  
  @scala.inline
  def apply(hash: String, path: String, size: Double): IPFSFile = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPFSFile]
  }
  
  @scala.inline
  implicit class IPFSFileMutableBuilder[Self <: IPFSFile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: FileContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
