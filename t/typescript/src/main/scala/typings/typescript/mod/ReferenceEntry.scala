package typings.typescript.mod

import typings.typescript.typescriptBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReferenceEntry extends DocumentSpan {
  
  var isDefinition: Boolean = js.native
  
  var isInString: js.UndefOr[`true`] = js.native
  
  var isWriteAccess: Boolean = js.native
}
object ReferenceEntry {
  
  @scala.inline
  def apply(fileName: java.lang.String, isDefinition: Boolean, isWriteAccess: Boolean, textSpan: TextSpan): ReferenceEntry = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], isDefinition = isDefinition.asInstanceOf[js.Any], isWriteAccess = isWriteAccess.asInstanceOf[js.Any], textSpan = textSpan.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReferenceEntry]
  }
  
  @scala.inline
  implicit class ReferenceEntryMutableBuilder[Self <: ReferenceEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsDefinition(value: Boolean): Self = StObject.set(x, "isDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsInString(value: `true`): Self = StObject.set(x, "isInString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsInStringUndefined: Self = StObject.set(x, "isInString", js.undefined)
    
    @scala.inline
    def setIsWriteAccess(value: Boolean): Self = StObject.set(x, "isWriteAccess", value.asInstanceOf[js.Any])
  }
}
