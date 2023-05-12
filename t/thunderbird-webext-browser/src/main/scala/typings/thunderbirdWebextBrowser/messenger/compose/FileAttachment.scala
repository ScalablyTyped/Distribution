package typings.thunderbirdWebextBrowser.messenger.compose

import typings.std.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileAttachment extends StObject {
  
  /** The new content for the attachment. */
  var file: js.UndefOr[File] = js.undefined
  
  /**
    * The new name for the attachment, as displayed to the user. If not
    * specified, the name of the provided `file` object is used.
    */
  var name: js.UndefOr[String] = js.undefined
}
object FileAttachment {
  
  inline def apply(): FileAttachment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileAttachment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FileAttachment] (val x: Self) extends AnyVal {
    
    inline def setFile(value: File): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
