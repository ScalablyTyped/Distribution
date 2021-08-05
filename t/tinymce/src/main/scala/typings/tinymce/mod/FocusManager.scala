package typings.tinymce.mod

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tinymce", "FocusManager")
@js.native
class FocusManager () extends StObject
/* static members */
object FocusManager {
  
  @JSImport("tinymce", "FocusManager")
  @js.native
  val ^ : js.Any = js.native
  
  inline def isEditorUIElement(elm: Element): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEditorUIElement")(elm.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
