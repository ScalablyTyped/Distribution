package typings.wordpressBlocks.anon

import typings.wordpressBlocks.AttributeSource.None
import typings.wordpressBlocks.wordpressBlocksStrings.`object`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  type :'object',   default :object | undefined} & {  source :never | undefined} */
trait typeobjectdefaultobjectun
  extends StObject
     with None {
  
  var default: js.UndefOr[js.Object] = js.undefined
  
  var source: js.UndefOr[scala.Nothing] = js.undefined
  
  var `type`: `object`
}
object typeobjectdefaultobjectun {
  
  inline def apply(): typeobjectdefaultobjectun = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("object")
    __obj.asInstanceOf[typeobjectdefaultobjectun]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: typeobjectdefaultobjectun] (val x: Self) extends AnyVal {
    
    inline def setDefault(value: js.Object): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setType(value: `object`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
