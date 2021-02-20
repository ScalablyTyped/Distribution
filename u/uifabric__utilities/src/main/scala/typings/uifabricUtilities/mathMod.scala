package typings.uifabricUtilities

import typings.uifabricUtilities.isizeMod.ISize
import typings.uifabricUtilities.pointMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mathMod {
  
  @JSImport("@uifabric/utilities/lib/math", "calculatePrecision")
  @js.native
  def calculatePrecision(value: String): Double = js.native
  @JSImport("@uifabric/utilities/lib/math", "calculatePrecision")
  @js.native
  def calculatePrecision(value: Double): Double = js.native
  
  @JSImport("@uifabric/utilities/lib/math", "fitContentToBounds")
  @js.native
  def fitContentToBounds(options: IFitContentToBoundsOptions): ISize = js.native
  
  @JSImport("@uifabric/utilities/lib/math", "getDistanceBetweenPoints")
  @js.native
  def getDistanceBetweenPoints(point1: Point, point2: Point): Double = js.native
  
  @JSImport("@uifabric/utilities/lib/math", "precisionRound")
  @js.native
  def precisionRound(value: Double, precision: Double): Double = js.native
  @JSImport("@uifabric/utilities/lib/math", "precisionRound")
  @js.native
  def precisionRound(value: Double, precision: Double, base: Double): Double = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.uifabricUtilities.uifabricUtilitiesStrings.contain
    - typings.uifabricUtilities.uifabricUtilitiesStrings.cover
  */
  trait FitMode extends StObject
  object FitMode {
    
    @scala.inline
    def contain: typings.uifabricUtilities.uifabricUtilitiesStrings.contain = "contain".asInstanceOf[typings.uifabricUtilities.uifabricUtilitiesStrings.contain]
    
    @scala.inline
    def cover: typings.uifabricUtilities.uifabricUtilitiesStrings.cover = "cover".asInstanceOf[typings.uifabricUtilities.uifabricUtilitiesStrings.cover]
  }
  
  @js.native
  trait IFitContentToBoundsOptions extends StObject {
    
    /**
      * The size of the bounds.
      */
    var boundsSize: ISize = js.native
    
    /**
      * The size of the content to fit to the bounds.
      * The output will be proportional to this value.
      */
    var contentSize: ISize = js.native
    
    /**
      * An optional maximum scale factor to apply. The default is 1.
      * Use Infinity for an unbounded resize.
      */
    var maxScale: js.UndefOr[Double] = js.native
    
    /**
      * The fit mode to apply, either 'contain' or 'cover'.
      */
    var mode: FitMode = js.native
  }
  object IFitContentToBoundsOptions {
    
    @scala.inline
    def apply(boundsSize: ISize, contentSize: ISize, mode: FitMode): IFitContentToBoundsOptions = {
      val __obj = js.Dynamic.literal(boundsSize = boundsSize.asInstanceOf[js.Any], contentSize = contentSize.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
      __obj.asInstanceOf[IFitContentToBoundsOptions]
    }
    
    @scala.inline
    implicit class IFitContentToBoundsOptionsMutableBuilder[Self <: IFitContentToBoundsOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBoundsSize(value: ISize): Self = StObject.set(x, "boundsSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentSize(value: ISize): Self = StObject.set(x, "contentSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxScale(value: Double): Self = StObject.set(x, "maxScale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxScaleUndefined: Self = StObject.set(x, "maxScale", js.undefined)
      
      @scala.inline
      def setMode(value: FitMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    }
  }
}
