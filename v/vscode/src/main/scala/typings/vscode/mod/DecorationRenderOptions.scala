package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DecorationRenderOptions
  extends StObject
     with ThemableDecorationRenderOptions {
  
  /**
    * Overwrite options for dark themes.
    */
  var dark: js.UndefOr[ThemableDecorationRenderOptions] = js.undefined
  
  /**
    * Should the decoration be rendered also on the whitespace after the line text.
    * Defaults to `false`.
    */
  var isWholeLine: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Overwrite options for light themes.
    */
  var light: js.UndefOr[ThemableDecorationRenderOptions] = js.undefined
  
  /**
    * The position in the overview ruler where the decoration should be rendered.
    */
  var overviewRulerLane: js.UndefOr[OverviewRulerLane] = js.undefined
  
  /**
    * Customize the growing behavior of the decoration when edits occur at the edges of the decoration's range.
    * Defaults to `DecorationRangeBehavior.OpenOpen`.
    */
  var rangeBehavior: js.UndefOr[DecorationRangeBehavior] = js.undefined
}
object DecorationRenderOptions {
  
  @scala.inline
  def apply(): DecorationRenderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DecorationRenderOptions]
  }
  
  @scala.inline
  implicit class DecorationRenderOptionsMutableBuilder[Self <: DecorationRenderOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDark(value: ThemableDecorationRenderOptions): Self = StObject.set(x, "dark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDarkUndefined: Self = StObject.set(x, "dark", js.undefined)
    
    @scala.inline
    def setIsWholeLine(value: Boolean): Self = StObject.set(x, "isWholeLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsWholeLineUndefined: Self = StObject.set(x, "isWholeLine", js.undefined)
    
    @scala.inline
    def setLight(value: ThemableDecorationRenderOptions): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLightUndefined: Self = StObject.set(x, "light", js.undefined)
    
    @scala.inline
    def setOverviewRulerLane(value: OverviewRulerLane): Self = StObject.set(x, "overviewRulerLane", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverviewRulerLaneUndefined: Self = StObject.set(x, "overviewRulerLane", js.undefined)
    
    @scala.inline
    def setRangeBehavior(value: DecorationRangeBehavior): Self = StObject.set(x, "rangeBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeBehaviorUndefined: Self = StObject.set(x, "rangeBehavior", js.undefined)
  }
}
