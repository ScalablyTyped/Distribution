package typings.uifabricUtilities

import typings.uifabricUtilities.libIsizeMod.ISize
import typings.uifabricUtilities.libPointMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMathMod {
  
  @JSImport("@uifabric/utilities/lib/math", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def calculatePrecision(value: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("calculatePrecision")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def calculatePrecision(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("calculatePrecision")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def fitContentToBounds(options: IFitContentToBoundsOptions): ISize = ^.asInstanceOf[js.Dynamic].applyDynamic("fitContentToBounds")(options.asInstanceOf[js.Any]).asInstanceOf[ISize]
  
  inline def getDistanceBetweenPoints(point1: Point, point2: Point): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getDistanceBetweenPoints")(point1.asInstanceOf[js.Any], point2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def precisionRound(value: Double, precision: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("precisionRound")(value.asInstanceOf[js.Any], precision.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def precisionRound(value: Double, precision: Double, base: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("precisionRound")(value.asInstanceOf[js.Any], precision.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /* Rewritten from type alias, can be one of: 
    - typings.uifabricUtilities.uifabricUtilitiesStrings.contain
    - typings.uifabricUtilities.uifabricUtilitiesStrings.cover
  */
  trait FitMode extends StObject
  object FitMode {
    
    inline def contain: typings.uifabricUtilities.uifabricUtilitiesStrings.contain = "contain".asInstanceOf[typings.uifabricUtilities.uifabricUtilitiesStrings.contain]
    
    inline def cover: typings.uifabricUtilities.uifabricUtilitiesStrings.cover = "cover".asInstanceOf[typings.uifabricUtilities.uifabricUtilitiesStrings.cover]
  }
  
  trait IFitContentToBoundsOptions extends StObject {
    
    /**
      * The size of the bounds.
      */
    var boundsSize: ISize
    
    /**
      * The size of the content to fit to the bounds.
      * The output will be proportional to this value.
      */
    var contentSize: ISize
    
    /**
      * An optional maximum scale factor to apply. The default is 1.
      * Use Infinity for an unbounded resize.
      */
    var maxScale: js.UndefOr[Double] = js.undefined
    
    /**
      * The fit mode to apply, either 'contain' or 'cover'.
      */
    var mode: FitMode
  }
  object IFitContentToBoundsOptions {
    
    inline def apply(boundsSize: ISize, contentSize: ISize, mode: FitMode): IFitContentToBoundsOptions = {
      val __obj = js.Dynamic.literal(boundsSize = boundsSize.asInstanceOf[js.Any], contentSize = contentSize.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
      __obj.asInstanceOf[IFitContentToBoundsOptions]
    }
    
    extension [Self <: IFitContentToBoundsOptions](x: Self) {
      
      inline def setBoundsSize(value: ISize): Self = StObject.set(x, "boundsSize", value.asInstanceOf[js.Any])
      
      inline def setContentSize(value: ISize): Self = StObject.set(x, "contentSize", value.asInstanceOf[js.Any])
      
      inline def setMaxScale(value: Double): Self = StObject.set(x, "maxScale", value.asInstanceOf[js.Any])
      
      inline def setMaxScaleUndefined: Self = StObject.set(x, "maxScale", js.undefined)
      
      inline def setMode(value: FitMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    }
  }
}
