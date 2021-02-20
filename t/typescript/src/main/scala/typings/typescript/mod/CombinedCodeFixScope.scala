package typings.typescript.mod

import typings.typescript.typescriptStrings.file
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CombinedCodeFixScope extends StObject {
  
  var fileName: java.lang.String = js.native
  
  var `type`: file = js.native
}
object CombinedCodeFixScope {
  
  @scala.inline
  def apply(fileName: java.lang.String, `type`: file): CombinedCodeFixScope = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CombinedCodeFixScope]
  }
  
  @scala.inline
  implicit class CombinedCodeFixScopeMutableBuilder[Self <: CombinedCodeFixScope] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileName(value: java.lang.String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: file): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
