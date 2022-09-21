package typings.vueRuntimeDom.mod

import typings.std.Element
import typings.vueRuntimeCore.mod.BaseTransitionProps
import typings.vueRuntimeDom.anon.Enter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransitionProps
  extends StObject
     with BaseTransitionProps[Element] {
  
  var appearActiveClass: js.UndefOr[String] = js.undefined
  
  var appearFromClass: js.UndefOr[String] = js.undefined
  
  var appearToClass: js.UndefOr[String] = js.undefined
  
  var css: js.UndefOr[Boolean] = js.undefined
  
  var duration: js.UndefOr[Double | Enter] = js.undefined
  
  var enterActiveClass: js.UndefOr[String] = js.undefined
  
  var enterFromClass: js.UndefOr[String] = js.undefined
  
  var enterToClass: js.UndefOr[String] = js.undefined
  
  var leaveActiveClass: js.UndefOr[String] = js.undefined
  
  var leaveFromClass: js.UndefOr[String] = js.undefined
  
  var leaveToClass: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[/* "transition" */ String] = js.undefined
}
object TransitionProps {
  
  inline def apply(): TransitionProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitionProps]
  }
  
  extension [Self <: TransitionProps](x: Self) {
    
    inline def setAppearActiveClass(value: String): Self = StObject.set(x, "appearActiveClass", value.asInstanceOf[js.Any])
    
    inline def setAppearActiveClassUndefined: Self = StObject.set(x, "appearActiveClass", js.undefined)
    
    inline def setAppearFromClass(value: String): Self = StObject.set(x, "appearFromClass", value.asInstanceOf[js.Any])
    
    inline def setAppearFromClassUndefined: Self = StObject.set(x, "appearFromClass", js.undefined)
    
    inline def setAppearToClass(value: String): Self = StObject.set(x, "appearToClass", value.asInstanceOf[js.Any])
    
    inline def setAppearToClassUndefined: Self = StObject.set(x, "appearToClass", js.undefined)
    
    inline def setCss(value: Boolean): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
    
    inline def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
    
    inline def setDuration(value: Double | Enter): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setEnterActiveClass(value: String): Self = StObject.set(x, "enterActiveClass", value.asInstanceOf[js.Any])
    
    inline def setEnterActiveClassUndefined: Self = StObject.set(x, "enterActiveClass", js.undefined)
    
    inline def setEnterFromClass(value: String): Self = StObject.set(x, "enterFromClass", value.asInstanceOf[js.Any])
    
    inline def setEnterFromClassUndefined: Self = StObject.set(x, "enterFromClass", js.undefined)
    
    inline def setEnterToClass(value: String): Self = StObject.set(x, "enterToClass", value.asInstanceOf[js.Any])
    
    inline def setEnterToClassUndefined: Self = StObject.set(x, "enterToClass", js.undefined)
    
    inline def setLeaveActiveClass(value: String): Self = StObject.set(x, "leaveActiveClass", value.asInstanceOf[js.Any])
    
    inline def setLeaveActiveClassUndefined: Self = StObject.set(x, "leaveActiveClass", js.undefined)
    
    inline def setLeaveFromClass(value: String): Self = StObject.set(x, "leaveFromClass", value.asInstanceOf[js.Any])
    
    inline def setLeaveFromClassUndefined: Self = StObject.set(x, "leaveFromClass", js.undefined)
    
    inline def setLeaveToClass(value: String): Self = StObject.set(x, "leaveToClass", value.asInstanceOf[js.Any])
    
    inline def setLeaveToClassUndefined: Self = StObject.set(x, "leaveToClass", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setType(value: /* "transition" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
