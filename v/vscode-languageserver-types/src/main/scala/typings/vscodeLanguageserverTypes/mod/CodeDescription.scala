package typings.vscodeLanguageserverTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeDescription extends StObject {
  
  /**
    * An URI to open with more information about the diagnostic error.
    */
  var href: URI
}
object CodeDescription {
  
  inline def apply(href: URI): CodeDescription = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeDescription]
  }
  
  @JSImport("vscode-languageserver-types", "CodeDescription")
  @js.native
  val ^ : js.Any = js.native
  
  inline def is(value: Any): /* is vscode-languageserver-types.vscode-languageserver-types.CodeDescription */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.CodeDescription */ Boolean]
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CodeDescription] (val x: Self) extends AnyVal {
    
    inline def setHref(value: URI): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
  }
}
