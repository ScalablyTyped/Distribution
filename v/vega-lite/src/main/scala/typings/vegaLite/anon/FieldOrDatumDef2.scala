package typings.vegaLite.anon

import typings.vegaLite.binMod.BinParams
import typings.vegaLite.channeldefMod.SecondaryFieldDef
import typings.vegaLite.channeldefMod.TypedFieldDef
import typings.vegaLite.vegaLiteStrings.binned
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FieldOrDatumDef2 extends StObject {
  
  var band: Double = js.native
  
  var fieldOrDatumDef: TypedFieldDef[String, _, Boolean | BinParams | binned | Null] = js.native
  
  var fieldOrDatumDef2: js.UndefOr[SecondaryFieldDef[String]] = js.native
  
  var offset: Double | SignalRef = js.native
  
  var scaleName: String = js.native
  
  var startSuffix: js.UndefOr[String] = js.native
}
object FieldOrDatumDef2 {
  
  @scala.inline
  def apply(
    band: Double,
    fieldOrDatumDef: TypedFieldDef[String, _, Boolean | BinParams | binned | Null],
    offset: Double | SignalRef,
    scaleName: String
  ): FieldOrDatumDef2 = {
    val __obj = js.Dynamic.literal(band = band.asInstanceOf[js.Any], fieldOrDatumDef = fieldOrDatumDef.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], scaleName = scaleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldOrDatumDef2]
  }
  
  @scala.inline
  implicit class FieldOrDatumDef2MutableBuilder[Self <: FieldOrDatumDef2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBand(value: Double): Self = StObject.set(x, "band", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldOrDatumDef(value: TypedFieldDef[String, _, Boolean | BinParams | binned | Null]): Self = StObject.set(x, "fieldOrDatumDef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldOrDatumDef2(value: SecondaryFieldDef[String]): Self = StObject.set(x, "fieldOrDatumDef2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldOrDatumDef2Undefined: Self = StObject.set(x, "fieldOrDatumDef2", js.undefined)
    
    @scala.inline
    def setOffset(value: Double | SignalRef): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleName(value: String): Self = StObject.set(x, "scaleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartSuffix(value: String): Self = StObject.set(x, "startSuffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartSuffixUndefined: Self = StObject.set(x, "startSuffix", js.undefined)
  }
}
