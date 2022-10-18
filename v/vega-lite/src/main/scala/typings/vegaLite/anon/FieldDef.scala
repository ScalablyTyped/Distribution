package typings.vegaLite.anon

import typings.vegaLite.buildSrcBinMod.BinParams
import typings.vegaLite.buildSrcChanneldefMod.TypedFieldDef
import typings.vegaLite.vegaLiteStrings.binned
import typings.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldDef extends StObject {
  
  var bandPosition: Double | SignalRef
  
  var fieldDef: TypedFieldDef[String, Any, Boolean | BinParams | binned | Null]
  
  var offset: js.UndefOr[Double | SignalRef] = js.undefined
  
  var scaleName: String
}
object FieldDef {
  
  inline def apply(
    bandPosition: Double | SignalRef,
    fieldDef: TypedFieldDef[String, Any, Boolean | BinParams | binned | Null],
    scaleName: String
  ): FieldDef = {
    val __obj = js.Dynamic.literal(bandPosition = bandPosition.asInstanceOf[js.Any], fieldDef = fieldDef.asInstanceOf[js.Any], scaleName = scaleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldDef]
  }
  
  extension [Self <: FieldDef](x: Self) {
    
    inline def setBandPosition(value: Double | SignalRef): Self = StObject.set(x, "bandPosition", value.asInstanceOf[js.Any])
    
    inline def setFieldDef(value: TypedFieldDef[String, Any, Boolean | BinParams | binned | Null]): Self = StObject.set(x, "fieldDef", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Double | SignalRef): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setScaleName(value: String): Self = StObject.set(x, "scaleName", value.asInstanceOf[js.Any])
  }
}
