package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DecorationInstanceRenderOptions
  extends StObject
     with ThemableDecorationInstanceRenderOptions {
  
  /**
    * Overwrite options for dark themes.
    */
  var dark: js.UndefOr[ThemableDecorationInstanceRenderOptions] = js.undefined
  
  /**
    * Overwrite options for light themes.
    */
  var light: js.UndefOr[ThemableDecorationInstanceRenderOptions] = js.undefined
}
object DecorationInstanceRenderOptions {
  
  @scala.inline
  def apply(): DecorationInstanceRenderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DecorationInstanceRenderOptions]
  }
  
  @scala.inline
  implicit class DecorationInstanceRenderOptionsMutableBuilder[Self <: DecorationInstanceRenderOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDark(value: ThemableDecorationInstanceRenderOptions): Self = StObject.set(x, "dark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDarkUndefined: Self = StObject.set(x, "dark", js.undefined)
    
    @scala.inline
    def setLight(value: ThemableDecorationInstanceRenderOptions): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLightUndefined: Self = StObject.set(x, "light", js.undefined)
  }
}
