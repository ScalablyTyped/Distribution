package typings.vegaLite

import typings.vegaLite.anon.MarkDef
import typings.vegaLite.buildSrcVegaDotschemaMod.VgValueRef
import typings.vegaLite.vegaLiteStrings.encoding
import typings.vegaLite.vegaLiteStrings.visual
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCompileMarkEncodeOffsetMod {
  
  @JSImport("vega-lite/build/src/compile/mark/encode/offset", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def positionOffset(param0: MarkDef): Offset = ^.asInstanceOf[js.Dynamic].applyDynamic("positionOffset")(param0.asInstanceOf[js.Any]).asInstanceOf[Offset]
  
  trait Offset extends StObject {
    
    var offset: js.UndefOr[Double | VgValueRef] = js.undefined
    
    var offsetType: js.UndefOr[visual | encoding] = js.undefined
  }
  object Offset {
    
    inline def apply(): Offset = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Offset]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Offset] (val x: Self) extends AnyVal {
      
      inline def setOffset(value: Double | VgValueRef): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetType(value: visual | encoding): Self = StObject.set(x, "offsetType", value.asInstanceOf[js.Any])
      
      inline def setOffsetTypeUndefined: Self = StObject.set(x, "offsetType", js.undefined)
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    }
  }
}
