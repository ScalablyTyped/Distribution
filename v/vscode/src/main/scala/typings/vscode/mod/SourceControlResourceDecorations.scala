package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceControlResourceDecorations
  extends StObject
     with SourceControlResourceThemableDecorations {
  
  /**
    * The dark theme decorations.
    */
  val dark: js.UndefOr[SourceControlResourceThemableDecorations] = js.undefined
  
  /**
    * Whether the [source control resource state](#SourceControlResourceState) should
    * be faded in the UI.
    */
  val faded: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The light theme decorations.
    */
  val light: js.UndefOr[SourceControlResourceThemableDecorations] = js.undefined
  
  /**
    * Whether the [source control resource state](#SourceControlResourceState) should
    * be striked-through in the UI.
    */
  val strikeThrough: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The title for a specific
    * [source control resource state](#SourceControlResourceState).
    */
  val tooltip: js.UndefOr[String] = js.undefined
}
object SourceControlResourceDecorations {
  
  @scala.inline
  def apply(): SourceControlResourceDecorations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceControlResourceDecorations]
  }
  
  @scala.inline
  implicit class SourceControlResourceDecorationsMutableBuilder[Self <: SourceControlResourceDecorations] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDark(value: SourceControlResourceThemableDecorations): Self = StObject.set(x, "dark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDarkUndefined: Self = StObject.set(x, "dark", js.undefined)
    
    @scala.inline
    def setFaded(value: Boolean): Self = StObject.set(x, "faded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFadedUndefined: Self = StObject.set(x, "faded", js.undefined)
    
    @scala.inline
    def setLight(value: SourceControlResourceThemableDecorations): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLightUndefined: Self = StObject.set(x, "light", js.undefined)
    
    @scala.inline
    def setStrikeThrough(value: Boolean): Self = StObject.set(x, "strikeThrough", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrikeThroughUndefined: Self = StObject.set(x, "strikeThrough", js.undefined)
    
    @scala.inline
    def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
  }
}
