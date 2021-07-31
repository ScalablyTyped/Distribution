package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FolderAscending extends StObject {
  
  var folderAscending: scala.Double
  
  var folderDescending: scala.Double
  
  var none: scala.Double
}
object FolderAscending {
  
  @scala.inline
  def apply(folderAscending: scala.Double, folderDescending: scala.Double, none: scala.Double): FolderAscending = {
    val __obj = js.Dynamic.literal(folderAscending = folderAscending.asInstanceOf[js.Any], folderDescending = folderDescending.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
    __obj.asInstanceOf[FolderAscending]
  }
  
  @scala.inline
  implicit class FolderAscendingMutableBuilder[Self <: FolderAscending] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFolderAscending(value: scala.Double): Self = StObject.set(x, "folderAscending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFolderDescending(value: scala.Double): Self = StObject.set(x, "folderDescending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNone(value: scala.Double): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
  }
}
