package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceControlResourceThemableDecorations extends StObject {
  
  /**
  		 * The icon path for a specific
  		 * {@link SourceControlResourceState source control resource state}.
  		 */
  val iconPath: js.UndefOr[String | Uri | ThemeIcon] = js.undefined
}
object SourceControlResourceThemableDecorations {
  
  inline def apply(): SourceControlResourceThemableDecorations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceControlResourceThemableDecorations]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SourceControlResourceThemableDecorations] (val x: Self) extends AnyVal {
    
    inline def setIconPath(value: String | Uri | ThemeIcon): Self = StObject.set(x, "iconPath", value.asInstanceOf[js.Any])
    
    inline def setIconPathUndefined: Self = StObject.set(x, "iconPath", js.undefined)
  }
}
