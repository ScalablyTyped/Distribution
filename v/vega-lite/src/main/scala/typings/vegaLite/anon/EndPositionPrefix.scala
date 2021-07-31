package typings.vegaLite.anon

import typings.vegaLite.compositemarkCommonMod.PartsMixins
import typings.vegaLite.exprMod.ExprRef
import typings.vegaLite.srcMarkMod.Mark
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndPositionPrefix[P /* <: PartsMixins[js.Any] */] extends StObject {
  
  var endPositionPrefix: js.UndefOr[String] = js.undefined
  
  var extraEncoding: js.UndefOr[typings.vegaLite.encodingMod.Encoding[String]] = js.undefined
  
  var mark: Mark | (typings.vegaLite.srcMarkMod.MarkDef[Mark, ExprRef | SignalRef])
  
  var partName: /* keyof P */ String
  
  var positionPrefix: String
}
object EndPositionPrefix {
  
  @scala.inline
  def apply[P /* <: PartsMixins[js.Any] */](
    mark: Mark | (typings.vegaLite.srcMarkMod.MarkDef[Mark, ExprRef | SignalRef]),
    partName: /* keyof P */ String,
    positionPrefix: String
  ): EndPositionPrefix[P] = {
    val __obj = js.Dynamic.literal(mark = mark.asInstanceOf[js.Any], partName = partName.asInstanceOf[js.Any], positionPrefix = positionPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndPositionPrefix[P]]
  }
  
  @scala.inline
  implicit class EndPositionPrefixMutableBuilder[Self <: EndPositionPrefix[?], P /* <: PartsMixins[js.Any] */] (val x: Self & EndPositionPrefix[P]) extends AnyVal {
    
    @scala.inline
    def setEndPositionPrefix(value: String): Self = StObject.set(x, "endPositionPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndPositionPrefixUndefined: Self = StObject.set(x, "endPositionPrefix", js.undefined)
    
    @scala.inline
    def setExtraEncoding(value: typings.vegaLite.encodingMod.Encoding[String]): Self = StObject.set(x, "extraEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraEncodingUndefined: Self = StObject.set(x, "extraEncoding", js.undefined)
    
    @scala.inline
    def setMark(value: Mark | (typings.vegaLite.srcMarkMod.MarkDef[Mark, ExprRef | SignalRef])): Self = StObject.set(x, "mark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartName(value: /* keyof P */ String): Self = StObject.set(x, "partName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionPrefix(value: String): Self = StObject.set(x, "positionPrefix", value.asInstanceOf[js.Any])
  }
}
