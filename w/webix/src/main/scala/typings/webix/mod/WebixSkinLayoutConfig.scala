package typings.webix.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebixSkinLayoutConfig extends StObject {
  
  var accordion: Double
  
  var clean: Double
  
  var form: Double
  
  var head: Double
  
  var line: Double
  
  var space: Double
  
  var toolbar: Double
  
  var wide: Double
}
object WebixSkinLayoutConfig {
  
  inline def apply(
    accordion: Double,
    clean: Double,
    form: Double,
    head: Double,
    line: Double,
    space: Double,
    toolbar: Double,
    wide: Double
  ): WebixSkinLayoutConfig = {
    val __obj = js.Dynamic.literal(accordion = accordion.asInstanceOf[js.Any], clean = clean.asInstanceOf[js.Any], form = form.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], space = space.asInstanceOf[js.Any], toolbar = toolbar.asInstanceOf[js.Any], wide = wide.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebixSkinLayoutConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebixSkinLayoutConfig] (val x: Self) extends AnyVal {
    
    inline def setAccordion(value: Double): Self = StObject.set(x, "accordion", value.asInstanceOf[js.Any])
    
    inline def setClean(value: Double): Self = StObject.set(x, "clean", value.asInstanceOf[js.Any])
    
    inline def setForm(value: Double): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    inline def setHead(value: Double): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
    
    inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setSpace(value: Double): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
    
    inline def setToolbar(value: Double): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
    
    inline def setWide(value: Double): Self = StObject.set(x, "wide", value.asInstanceOf[js.Any])
  }
}
