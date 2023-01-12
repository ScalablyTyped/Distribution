package typings.vegaLite.buildSrcDataMod

import typings.vegaTypings.typesSpecUtilMod.Vector2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GraticuleParams extends StObject {
  
  /**
    * Sets both the major and minor extents to the same values.
    */
  var extent: js.UndefOr[Vector2[Vector2[Double]]] = js.undefined
  
  /**
    * The major extent of the graticule as a two-element array of coordinates.
    */
  var extentMajor: js.UndefOr[Vector2[Vector2[Double]]] = js.undefined
  
  /**
    * The minor extent of the graticule as a two-element array of coordinates.
    */
  var extentMinor: js.UndefOr[Vector2[Vector2[Double]]] = js.undefined
  
  /**
    * The precision of the graticule in degrees.
    *
    * __Default value:__ `2.5`
    */
  var precision: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets both the major and minor step angles to the same values.
    */
  var step: js.UndefOr[Vector2[Double]] = js.undefined
  
  /**
    * The major step angles of the graticule.
    *
    *
    * __Default value:__ `[90, 360]`
    */
  var stepMajor: js.UndefOr[Vector2[Double]] = js.undefined
  
  /**
    * The minor step angles of the graticule.
    *
    * __Default value:__ `[10, 10]`
    */
  var stepMinor: js.UndefOr[Vector2[Double]] = js.undefined
}
object GraticuleParams {
  
  inline def apply(): GraticuleParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GraticuleParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GraticuleParams] (val x: Self) extends AnyVal {
    
    inline def setExtent(value: Vector2[Vector2[Double]]): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
    
    inline def setExtentMajor(value: Vector2[Vector2[Double]]): Self = StObject.set(x, "extentMajor", value.asInstanceOf[js.Any])
    
    inline def setExtentMajorUndefined: Self = StObject.set(x, "extentMajor", js.undefined)
    
    inline def setExtentMinor(value: Vector2[Vector2[Double]]): Self = StObject.set(x, "extentMinor", value.asInstanceOf[js.Any])
    
    inline def setExtentMinorUndefined: Self = StObject.set(x, "extentMinor", js.undefined)
    
    inline def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
    
    inline def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
    
    inline def setStep(value: Vector2[Double]): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setStepMajor(value: Vector2[Double]): Self = StObject.set(x, "stepMajor", value.asInstanceOf[js.Any])
    
    inline def setStepMajorUndefined: Self = StObject.set(x, "stepMajor", js.undefined)
    
    inline def setStepMinor(value: Vector2[Double]): Self = StObject.set(x, "stepMinor", value.asInstanceOf[js.Any])
    
    inline def setStepMinorUndefined: Self = StObject.set(x, "stepMinor", js.undefined)
    
    inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
  }
}
