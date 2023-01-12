package typings.vegaTypings.typesSpecMarkMod

import typings.vegaTypings.typesSpecOnTriggerMod.OnMarkTrigger
import typings.vegaTypings.typesSpecSignalMod.SignalRef
import typings.vegaTypings.typesSpecTransformMod.Transforms
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseMark extends StObject {
  
  var aria: js.UndefOr[Boolean] = js.undefined
  
  var clip: js.UndefOr[Clip] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var from: js.UndefOr[From] = js.undefined
  
  var interactive: js.UndefOr[Boolean | SignalRef] = js.undefined
  
  var key: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var on: js.UndefOr[js.Array[OnMarkTrigger]] = js.undefined
  
  var role: js.UndefOr[String] = js.undefined
  
  var sort: js.UndefOr[Compare] = js.undefined
  
  var style: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var transform: js.UndefOr[js.Array[Transforms]] = js.undefined
  
  var zindex: js.UndefOr[Double] = js.undefined
}
object BaseMark {
  
  inline def apply(): BaseMark = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseMark]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseMark] (val x: Self) extends AnyVal {
    
    inline def setAria(value: Boolean): Self = StObject.set(x, "aria", value.asInstanceOf[js.Any])
    
    inline def setAriaUndefined: Self = StObject.set(x, "aria", js.undefined)
    
    inline def setClip(value: Clip): Self = StObject.set(x, "clip", value.asInstanceOf[js.Any])
    
    inline def setClipUndefined: Self = StObject.set(x, "clip", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFrom(value: From): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setInteractive(value: Boolean | SignalRef): Self = StObject.set(x, "interactive", value.asInstanceOf[js.Any])
    
    inline def setInteractiveUndefined: Self = StObject.set(x, "interactive", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOn(value: js.Array[OnMarkTrigger]): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
    
    inline def setOnUndefined: Self = StObject.set(x, "on", js.undefined)
    
    inline def setOnVarargs(value: OnMarkTrigger*): Self = StObject.set(x, "on", js.Array(value*))
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setSort(value: Compare): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    inline def setStyle(value: String | js.Array[String]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setStyleVarargs(value: String*): Self = StObject.set(x, "style", js.Array(value*))
    
    inline def setTransform(value: js.Array[Transforms]): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    
    inline def setTransformVarargs(value: Transforms*): Self = StObject.set(x, "transform", js.Array(value*))
    
    inline def setZindex(value: Double): Self = StObject.set(x, "zindex", value.asInstanceOf[js.Any])
    
    inline def setZindexUndefined: Self = StObject.set(x, "zindex", js.undefined)
  }
}
