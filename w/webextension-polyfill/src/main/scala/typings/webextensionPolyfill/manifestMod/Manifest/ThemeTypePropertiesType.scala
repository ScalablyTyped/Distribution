package typings.webextensionPolyfill.manifestMod.Manifest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThemeTypePropertiesType extends StObject {
  
  /**
    * Optional.
    */
  var additional_backgrounds_alignment: js.UndefOr[js.Array[ThemeTypePropertiesAdditionalBackgroundsAlignmentItemEnum]] = js.undefined
  
  /**
    * Optional.
    */
  var additional_backgrounds_tiling: js.UndefOr[js.Array[ThemeTypePropertiesAdditionalBackgroundsTilingItemEnum]] = js.undefined
  
  /**
    * Optional.
    */
  var color_scheme: js.UndefOr[ThemeTypePropertiesColorSchemeEnum] = js.undefined
  
  /**
    * Optional.
    */
  var content_color_scheme: js.UndefOr[ThemeTypePropertiesContentColorSchemeEnum] = js.undefined
}
object ThemeTypePropertiesType {
  
  inline def apply(): ThemeTypePropertiesType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThemeTypePropertiesType]
  }
  
  extension [Self <: ThemeTypePropertiesType](x: Self) {
    
    inline def setAdditional_backgrounds_alignment(value: js.Array[ThemeTypePropertiesAdditionalBackgroundsAlignmentItemEnum]): Self = StObject.set(x, "additional_backgrounds_alignment", value.asInstanceOf[js.Any])
    
    inline def setAdditional_backgrounds_alignmentUndefined: Self = StObject.set(x, "additional_backgrounds_alignment", js.undefined)
    
    inline def setAdditional_backgrounds_alignmentVarargs(value: ThemeTypePropertiesAdditionalBackgroundsAlignmentItemEnum*): Self = StObject.set(x, "additional_backgrounds_alignment", js.Array(value*))
    
    inline def setAdditional_backgrounds_tiling(value: js.Array[ThemeTypePropertiesAdditionalBackgroundsTilingItemEnum]): Self = StObject.set(x, "additional_backgrounds_tiling", value.asInstanceOf[js.Any])
    
    inline def setAdditional_backgrounds_tilingUndefined: Self = StObject.set(x, "additional_backgrounds_tiling", js.undefined)
    
    inline def setAdditional_backgrounds_tilingVarargs(value: ThemeTypePropertiesAdditionalBackgroundsTilingItemEnum*): Self = StObject.set(x, "additional_backgrounds_tiling", js.Array(value*))
    
    inline def setColor_scheme(value: ThemeTypePropertiesColorSchemeEnum): Self = StObject.set(x, "color_scheme", value.asInstanceOf[js.Any])
    
    inline def setColor_schemeUndefined: Self = StObject.set(x, "color_scheme", js.undefined)
    
    inline def setContent_color_scheme(value: ThemeTypePropertiesContentColorSchemeEnum): Self = StObject.set(x, "content_color_scheme", value.asInstanceOf[js.Any])
    
    inline def setContent_color_schemeUndefined: Self = StObject.set(x, "content_color_scheme", js.undefined)
  }
}
