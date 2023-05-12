package typings.vscode.anon

import typings.vscode.mod.DataTransferFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Contents extends StObject {
  
  /**
  			 * The initial contents of the new file.
  			 *
  			 * If creating a file from a {@link DocumentDropEditProvider drop operation}, you can
  			 * pass in a {@link DataTransferFile} to improve performance by avoiding extra data copying.
  			 */
  val contents: js.UndefOr[js.typedarray.Uint8Array | DataTransferFile] = js.undefined
  
  val ignoreIfExists: js.UndefOr[Boolean] = js.undefined
  
  val overwrite: js.UndefOr[Boolean] = js.undefined
}
object Contents {
  
  inline def apply(): Contents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Contents]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Contents] (val x: Self) extends AnyVal {
    
    inline def setContents(value: js.typedarray.Uint8Array | DataTransferFile): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    inline def setContentsUndefined: Self = StObject.set(x, "contents", js.undefined)
    
    inline def setIgnoreIfExists(value: Boolean): Self = StObject.set(x, "ignoreIfExists", value.asInstanceOf[js.Any])
    
    inline def setIgnoreIfExistsUndefined: Self = StObject.set(x, "ignoreIfExists", js.undefined)
    
    inline def setOverwrite(value: Boolean): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
    
    inline def setOverwriteUndefined: Self = StObject.set(x, "overwrite", js.undefined)
  }
}
