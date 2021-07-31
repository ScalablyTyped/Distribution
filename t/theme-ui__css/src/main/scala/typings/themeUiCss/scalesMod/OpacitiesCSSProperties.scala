package typings.themeUiCss.scalesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpacitiesCSSProperties extends StObject {
  
  /**
    * The **`opacity`** CSS property sets the transparency of an element or the degree to which content behind an element is visible.
    *
    * **Syntax**: `<alpha-value>`
    *
    * **Initial value**: `1.0`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **2**  | **12** | **9** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/opacity
    */
  var opacity: js.UndefOr[Opacities] = js.undefined
}
object OpacitiesCSSProperties {
  
  @scala.inline
  def apply(): OpacitiesCSSProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpacitiesCSSProperties]
  }
  
  @scala.inline
  implicit class OpacitiesCSSPropertiesMutableBuilder[Self <: OpacitiesCSSProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOpacity(value: Opacities): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
  }
}
