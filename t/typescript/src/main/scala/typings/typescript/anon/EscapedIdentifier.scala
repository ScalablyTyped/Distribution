package typings.typescript.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EscapedIdentifier extends StObject {
  
  var __escapedIdentifier: Unit = js.native
}
object EscapedIdentifier {
  
  @scala.inline
  def apply(__escapedIdentifier: Unit): EscapedIdentifier = {
    val __obj = js.Dynamic.literal(__escapedIdentifier = __escapedIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[EscapedIdentifier]
  }
  
  @scala.inline
  implicit class EscapedIdentifierMutableBuilder[Self <: EscapedIdentifier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set__escapedIdentifier(value: Unit): Self = StObject.set(x, "__escapedIdentifier", value.asInstanceOf[js.Any])
  }
}
