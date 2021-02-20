package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndexInfo extends StObject {
  
  var declaration: js.UndefOr[IndexSignatureDeclaration] = js.native
  
  var isReadonly: Boolean = js.native
  
  var `type`: Type = js.native
}
object IndexInfo {
  
  @scala.inline
  def apply(isReadonly: Boolean, `type`: Type): IndexInfo = {
    val __obj = js.Dynamic.literal(isReadonly = isReadonly.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexInfo]
  }
  
  @scala.inline
  implicit class IndexInfoMutableBuilder[Self <: IndexInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeclaration(value: IndexSignatureDeclaration): Self = StObject.set(x, "declaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclarationUndefined: Self = StObject.set(x, "declaration", js.undefined)
    
    @scala.inline
    def setIsReadonly(value: Boolean): Self = StObject.set(x, "isReadonly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
