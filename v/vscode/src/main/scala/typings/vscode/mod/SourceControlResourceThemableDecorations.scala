package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceControlResourceThemableDecorations extends StObject {
  
  /**
    * The icon path for a specific
    * [source control resource state](#SourceControlResourceState).
    */
  val iconPath: js.UndefOr[String | Uri] = js.undefined
}
object SourceControlResourceThemableDecorations {
  
  @scala.inline
  def apply(): SourceControlResourceThemableDecorations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceControlResourceThemableDecorations]
  }
  
  @scala.inline
  implicit class SourceControlResourceThemableDecorationsMutableBuilder[Self <: SourceControlResourceThemableDecorations] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIconPath(value: String | Uri): Self = StObject.set(x, "iconPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconPathUndefined: Self = StObject.set(x, "iconPath", js.undefined)
  }
}
