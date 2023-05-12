package typings.wordpressBlocks.anon

import typings.wordpressBlocks.AttributeSource.None
import typings.wordpressBlocks.wordpressBlocksStrings.array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  type :'array',   default :std.Array<any> | undefined} & {  source :never | undefined} */
trait typearraydefaultArrayanyu
  extends StObject
     with None {
  
  var default: js.UndefOr[js.Array[Any]] = js.undefined
  
  var source: js.UndefOr[scala.Nothing] = js.undefined
  
  var `type`: array
}
object typearraydefaultArrayanyu {
  
  inline def apply(): typearraydefaultArrayanyu = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("array")
    __obj.asInstanceOf[typearraydefaultArrayanyu]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: typearraydefaultArrayanyu] (val x: Self) extends AnyVal {
    
    inline def setDefault(value: js.Array[Any]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setDefaultVarargs(value: Any*): Self = StObject.set(x, "default", js.Array(value*))
    
    inline def setType(value: array): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
