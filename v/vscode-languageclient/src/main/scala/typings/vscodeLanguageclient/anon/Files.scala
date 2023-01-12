package typings.vscodeLanguageclient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Files[I] extends StObject {
  
  val files: js.Array[I]
}
object Files {
  
  inline def apply[I](files: js.Array[I]): Files[I] = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any])
    __obj.asInstanceOf[Files[I]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Files[?], I] (val x: Self & Files[I]) extends AnyVal {
    
    inline def setFiles(value: js.Array[I]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setFilesVarargs(value: I*): Self = StObject.set(x, "files", js.Array(value*))
  }
}
