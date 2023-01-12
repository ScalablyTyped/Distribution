package typings.winrt.Windows.Storage.Pickers.Provider

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IFileRemovedEventArgs extends StObject {
  
  var id: String
}
object IFileRemovedEventArgs {
  
  inline def apply(id: String): IFileRemovedEventArgs = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFileRemovedEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IFileRemovedEventArgs] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
