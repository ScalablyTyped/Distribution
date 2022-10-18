package typings.three

import typings.three.examplesJsmGeometriesLightningStrikeMod.LightningStrike
import typings.three.examplesJsmGeometriesLightningStrikeMod.RayParameters
import typings.three.srcCoreEventDispatcherMod.Event
import typings.three.srcThreeMod.Material
import typings.three.srcThreeMod.Object3D
import typings.three.srcThreeMod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmObjectsLightningStormMod {
  
  @JSImport("three/examples/jsm/objects/LightningStorm", "LightningStorm")
  @js.native
  open class LightningStorm () extends Object3D[Event] {
    def this(stormParams: StormParams) = this()
    
    def update(time: Double): Unit = js.native
  }
  
  trait StormParams extends StObject {
    
    var isEternal: js.UndefOr[Boolean] = js.undefined
    
    var lightningMaterial: js.UndefOr[Material] = js.undefined
    
    var lightningMaxDuration: js.UndefOr[Double] = js.undefined
    
    var lightningMaxPeriod: js.UndefOr[Double] = js.undefined
    
    var lightningMinDuration: js.UndefOr[Double] = js.undefined
    
    var lightningMinPeriod: js.UndefOr[Double] = js.undefined
    
    var lightningParameters: js.UndefOr[RayParameters] = js.undefined
    
    var maxHeight: js.UndefOr[Double] = js.undefined
    
    var maxLightnings: js.UndefOr[Double] = js.undefined
    
    var maxSlope: js.UndefOr[Double] = js.undefined
    
    var minHeight: js.UndefOr[Double] = js.undefined
    
    var onLightningDown: js.UndefOr[js.Function1[/* lightning */ LightningStrike, Unit]] = js.undefined
    
    var onRayPosition: js.UndefOr[js.Function2[/* source */ Vector3, /* dest */ Vector3, Unit]] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
  }
  object StormParams {
    
    inline def apply(): StormParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StormParams]
    }
    
    extension [Self <: StormParams](x: Self) {
      
      inline def setIsEternal(value: Boolean): Self = StObject.set(x, "isEternal", value.asInstanceOf[js.Any])
      
      inline def setIsEternalUndefined: Self = StObject.set(x, "isEternal", js.undefined)
      
      inline def setLightningMaterial(value: Material): Self = StObject.set(x, "lightningMaterial", value.asInstanceOf[js.Any])
      
      inline def setLightningMaterialUndefined: Self = StObject.set(x, "lightningMaterial", js.undefined)
      
      inline def setLightningMaxDuration(value: Double): Self = StObject.set(x, "lightningMaxDuration", value.asInstanceOf[js.Any])
      
      inline def setLightningMaxDurationUndefined: Self = StObject.set(x, "lightningMaxDuration", js.undefined)
      
      inline def setLightningMaxPeriod(value: Double): Self = StObject.set(x, "lightningMaxPeriod", value.asInstanceOf[js.Any])
      
      inline def setLightningMaxPeriodUndefined: Self = StObject.set(x, "lightningMaxPeriod", js.undefined)
      
      inline def setLightningMinDuration(value: Double): Self = StObject.set(x, "lightningMinDuration", value.asInstanceOf[js.Any])
      
      inline def setLightningMinDurationUndefined: Self = StObject.set(x, "lightningMinDuration", js.undefined)
      
      inline def setLightningMinPeriod(value: Double): Self = StObject.set(x, "lightningMinPeriod", value.asInstanceOf[js.Any])
      
      inline def setLightningMinPeriodUndefined: Self = StObject.set(x, "lightningMinPeriod", js.undefined)
      
      inline def setLightningParameters(value: RayParameters): Self = StObject.set(x, "lightningParameters", value.asInstanceOf[js.Any])
      
      inline def setLightningParametersUndefined: Self = StObject.set(x, "lightningParameters", js.undefined)
      
      inline def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      inline def setMaxLightnings(value: Double): Self = StObject.set(x, "maxLightnings", value.asInstanceOf[js.Any])
      
      inline def setMaxLightningsUndefined: Self = StObject.set(x, "maxLightnings", js.undefined)
      
      inline def setMaxSlope(value: Double): Self = StObject.set(x, "maxSlope", value.asInstanceOf[js.Any])
      
      inline def setMaxSlopeUndefined: Self = StObject.set(x, "maxSlope", js.undefined)
      
      inline def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
      
      inline def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
      
      inline def setOnLightningDown(value: /* lightning */ LightningStrike => Unit): Self = StObject.set(x, "onLightningDown", js.Any.fromFunction1(value))
      
      inline def setOnLightningDownUndefined: Self = StObject.set(x, "onLightningDown", js.undefined)
      
      inline def setOnRayPosition(value: (/* source */ Vector3, /* dest */ Vector3) => Unit): Self = StObject.set(x, "onRayPosition", js.Any.fromFunction2(value))
      
      inline def setOnRayPositionUndefined: Self = StObject.set(x, "onRayPosition", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
}
