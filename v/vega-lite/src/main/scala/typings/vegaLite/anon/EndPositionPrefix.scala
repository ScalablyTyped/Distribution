package typings.vegaLite.anon

import typings.vegaLite.buildSrcCompositemarkCommonMod.PartsMixins
import typings.vegaLite.buildSrcExprMod.ExprRef
import typings.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndPositionPrefix[P /* <: PartsMixins[Any] */] extends StObject {
  
  var endPositionPrefix: js.UndefOr[String] = js.undefined
  
  var extraEncoding: js.UndefOr[typings.vegaLite.buildSrcEncodingMod.Encoding[String]] = js.undefined
  
  var mark: typings.vegaLite.buildSrcMarkMod.Mark | (typings.vegaLite.buildSrcMarkMod.MarkDef[typings.vegaLite.buildSrcMarkMod.Mark, ExprRef | SignalRef])
  
  var partName: /* keyof P */ String
  
  var positionPrefix: String
}
object EndPositionPrefix {
  
  inline def apply[P /* <: PartsMixins[Any] */](
    mark: typings.vegaLite.buildSrcMarkMod.Mark | (typings.vegaLite.buildSrcMarkMod.MarkDef[typings.vegaLite.buildSrcMarkMod.Mark, ExprRef | SignalRef]),
    partName: /* keyof P */ String,
    positionPrefix: String
  ): EndPositionPrefix[P] = {
    val __obj = js.Dynamic.literal(mark = mark.asInstanceOf[js.Any], partName = partName.asInstanceOf[js.Any], positionPrefix = positionPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndPositionPrefix[P]]
  }
  
  extension [Self <: EndPositionPrefix[?], P /* <: PartsMixins[Any] */](x: Self & EndPositionPrefix[P]) {
    
    inline def setEndPositionPrefix(value: String): Self = StObject.set(x, "endPositionPrefix", value.asInstanceOf[js.Any])
    
    inline def setEndPositionPrefixUndefined: Self = StObject.set(x, "endPositionPrefix", js.undefined)
    
    inline def setExtraEncoding(value: typings.vegaLite.buildSrcEncodingMod.Encoding[String]): Self = StObject.set(x, "extraEncoding", value.asInstanceOf[js.Any])
    
    inline def setExtraEncodingUndefined: Self = StObject.set(x, "extraEncoding", js.undefined)
    
    inline def setMark(
      value: typings.vegaLite.buildSrcMarkMod.Mark | (typings.vegaLite.buildSrcMarkMod.MarkDef[typings.vegaLite.buildSrcMarkMod.Mark, ExprRef | SignalRef])
    ): Self = StObject.set(x, "mark", value.asInstanceOf[js.Any])
    
    inline def setPartName(value: /* keyof P */ String): Self = StObject.set(x, "partName", value.asInstanceOf[js.Any])
    
    inline def setPositionPrefix(value: String): Self = StObject.set(x, "positionPrefix", value.asInstanceOf[js.Any])
  }
}
