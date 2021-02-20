package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Folder extends StObject {
  
  var folder: scala.Double = js.native
  
  var invalid: scala.Double = js.native
  
  var ref: scala.Double = js.native
}
object Folder {
  
  @scala.inline
  def apply(folder: scala.Double, invalid: scala.Double, ref: scala.Double): Folder = {
    val __obj = js.Dynamic.literal(folder = folder.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[Folder]
  }
  
  @scala.inline
  implicit class FolderMutableBuilder[Self <: Folder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFolder(value: scala.Double): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvalid(value: scala.Double): Self = StObject.set(x, "invalid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRef(value: scala.Double): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
  }
}
