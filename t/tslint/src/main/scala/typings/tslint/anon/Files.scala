package typings.tslint.anon

import typings.typescript.mod.Program
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Files extends StObject {
  
  var files: js.Array[String]
  
  var program: js.UndefOr[Program] = js.undefined
}
object Files {
  
  inline def apply(files: js.Array[String]): Files = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any])
    __obj.asInstanceOf[Files]
  }
  
  extension [Self <: Files](x: Self) {
    
    inline def setFiles(value: js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value*))
    
    inline def setProgram(value: Program): Self = StObject.set(x, "program", value.asInstanceOf[js.Any])
    
    inline def setProgramUndefined: Self = StObject.set(x, "program", js.undefined)
  }
}
