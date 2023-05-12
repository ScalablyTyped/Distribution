package typings.wordpressBlocks.anon

import typings.wordpressBlocks.AttributeSource.None
import typings.wordpressBlocks.wordpressBlocksStrings.number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  type :'number',   default :number | undefined} & {  source :never | undefined} */
trait typenumberdefaultnumberunDefault
  extends StObject
     with None {
  
  var default: js.UndefOr[Double] = js.undefined
  
  var source: js.UndefOr[scala.Nothing] = js.undefined
  
  var `type`: number
}
object typenumberdefaultnumberunDefault {
  
  inline def apply(): typenumberdefaultnumberunDefault = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("number")
    __obj.asInstanceOf[typenumberdefaultnumberunDefault]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: typenumberdefaultnumberunDefault] (val x: Self) extends AnyVal {
    
    inline def setDefault(value: Double): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setType(value: number): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
