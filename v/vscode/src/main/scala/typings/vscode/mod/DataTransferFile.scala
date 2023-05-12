package typings.vscode.mod

import typings.vscode.Thenable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataTransferFile extends StObject {
  
  /**
  		 * The full file contents of the file.
  		 */
  def data(): Thenable[js.typedarray.Uint8Array]
  
  /**
  		 * The name of the file.
  		 */
  val name: String
  
  /**
  		 * The full file path of the file.
  		 *
  		 * May be `undefined` on web.
  		 */
  val uri: js.UndefOr[Uri] = js.undefined
}
object DataTransferFile {
  
  inline def apply(data: () => Thenable[js.typedarray.Uint8Array], name: String): DataTransferFile = {
    val __obj = js.Dynamic.literal(data = js.Any.fromFunction0(data), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTransferFile]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataTransferFile] (val x: Self) extends AnyVal {
    
    inline def setData(value: () => Thenable[js.typedarray.Uint8Array]): Self = StObject.set(x, "data", js.Any.fromFunction0(value))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setUri(value: Uri): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
