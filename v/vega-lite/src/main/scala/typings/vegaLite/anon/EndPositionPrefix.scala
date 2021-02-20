package typings.vegaLite.anon

import typings.vegaLite.compositemarkCommonMod.PartsMixins
import typings.vegaLite.exprMod.ExprRef
import typings.vegaLite.srcMarkMod.Mark
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EndPositionPrefix[P /* <: PartsMixins[_] */] extends StObject {
  
  var endPositionPrefix: js.UndefOr[String] = js.native
  
  var extraEncoding: js.UndefOr[typings.vegaLite.encodingMod.Encoding[String]] = js.native
  
  var mark: Mark | (typings.vegaLite.srcMarkMod.MarkDef[Mark, ExprRef | SignalRef]) = js.native
  
  var partName: /* keyof P */ String = js.native
  
  var positionPrefix: String = js.native
}
object EndPositionPrefix {
  
  @scala.inline
  def apply[P /* <: PartsMixins[_] */](
    mark: Mark | (typings.vegaLite.srcMarkMod.MarkDef[Mark, ExprRef | SignalRef]),
    partName: /* keyof P */ String,
    positionPrefix: String
  ): EndPositionPrefix[P] = {
    val __obj = js.Dynamic.literal(mark = mark.asInstanceOf[js.Any], partName = partName.asInstanceOf[js.Any], positionPrefix = positionPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndPositionPrefix[P]]
  }
  
  @scala.inline
  implicit class EndPositionPrefixMutableBuilder[Self <: EndPositionPrefix[_], P /* <: PartsMixins[_] */] (val x: Self with EndPositionPrefix[P]) extends AnyVal {
    
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
