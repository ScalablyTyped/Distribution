package typings.vscodeLanguageserver.anon

import typings.vscodeLanguageserverProtocol.libCommonProtocolDotnotebookMod.NotebookCell
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Old extends StObject {
  
  var `new`: NotebookCell
  
  var old: NotebookCell
}
object Old {
  
  inline def apply(`new`: NotebookCell, old: NotebookCell): Old = {
    val __obj = js.Dynamic.literal(old = old.asInstanceOf[js.Any])
    __obj.updateDynamic("new")(`new`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Old]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Old] (val x: Self) extends AnyVal {
    
    inline def setNew(value: NotebookCell): Self = StObject.set(x, "new", value.asInstanceOf[js.Any])
    
    inline def setOld(value: NotebookCell): Self = StObject.set(x, "old", value.asInstanceOf[js.Any])
  }
}
