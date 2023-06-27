package typings.webix.webix

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait skin extends StObject {
  
  @JSName("$active")
  var $active: WebixSkinConfig
  
  @JSName("$name")
  var $name: String
  
  var compact: WebixSkinConfig
  
  var contrast: WebixSkinConfig
  
  var dark: WebixSkinConfig
  
  var flat: WebixSkinConfig
  
  var material: WebixSkinConfig
  
  var mini: WebixSkinConfig
  
  def set(skin: String): Unit
  
  var willow: WebixSkinConfig
}
object skin {
  
  inline def apply(
    $active: WebixSkinConfig,
    $name: String,
    compact: WebixSkinConfig,
    contrast: WebixSkinConfig,
    dark: WebixSkinConfig,
    flat: WebixSkinConfig,
    material: WebixSkinConfig,
    mini: WebixSkinConfig,
    set: String => Unit,
    willow: WebixSkinConfig
  ): skin = {
    val __obj = js.Dynamic.literal($active = $active.asInstanceOf[js.Any], $name = $name.asInstanceOf[js.Any], compact = compact.asInstanceOf[js.Any], contrast = contrast.asInstanceOf[js.Any], dark = dark.asInstanceOf[js.Any], flat = flat.asInstanceOf[js.Any], material = material.asInstanceOf[js.Any], mini = mini.asInstanceOf[js.Any], set = js.Any.fromFunction1(set), willow = willow.asInstanceOf[js.Any])
    __obj.asInstanceOf[skin]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: skin] (val x: Self) extends AnyVal {
    
    inline def set$active(value: WebixSkinConfig): Self = StObject.set(x, "$active", value.asInstanceOf[js.Any])
    
    inline def set$name(value: String): Self = StObject.set(x, "$name", value.asInstanceOf[js.Any])
    
    inline def setCompact(value: WebixSkinConfig): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
    
    inline def setContrast(value: WebixSkinConfig): Self = StObject.set(x, "contrast", value.asInstanceOf[js.Any])
    
    inline def setDark(value: WebixSkinConfig): Self = StObject.set(x, "dark", value.asInstanceOf[js.Any])
    
    inline def setFlat(value: WebixSkinConfig): Self = StObject.set(x, "flat", value.asInstanceOf[js.Any])
    
    inline def setMaterial(value: WebixSkinConfig): Self = StObject.set(x, "material", value.asInstanceOf[js.Any])
    
    inline def setMini(value: WebixSkinConfig): Self = StObject.set(x, "mini", value.asInstanceOf[js.Any])
    
    inline def setSet(value: String => Unit): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
    
    inline def setWillow(value: WebixSkinConfig): Self = StObject.set(x, "willow", value.asInstanceOf[js.Any])
  }
}
