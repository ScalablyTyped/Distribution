package typings.svgOutlineStroke

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Transform svg strokes into filled paths
    */
  inline def apply(input: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def apply(input: String, params: Options): js.Promise[String] = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def apply(input: Buffer): js.Promise[String] = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def apply(input: Buffer, params: Options): js.Promise[String] = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  @JSImport("svg-outline-stroke", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    var alphaMax: js.UndefOr[Double] = js.undefined
    
    var background: js.UndefOr[String] = js.undefined
    
    var blackOnWhite: js.UndefOr[Boolean] = js.undefined
    
    var color: js.UndefOr[String] = js.undefined
    
    var optCurve: js.UndefOr[Boolean] = js.undefined
    
    var optTolerance: js.UndefOr[Double] = js.undefined
    
    var threshold: js.UndefOr[Double] = js.undefined
    
    var turdSize: js.UndefOr[Double] = js.undefined
    
    var turnPolicy: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setAlphaMax(value: Double): Self = StObject.set(x, "alphaMax", value.asInstanceOf[js.Any])
      
      inline def setAlphaMaxUndefined: Self = StObject.set(x, "alphaMax", js.undefined)
      
      inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setBlackOnWhite(value: Boolean): Self = StObject.set(x, "blackOnWhite", value.asInstanceOf[js.Any])
      
      inline def setBlackOnWhiteUndefined: Self = StObject.set(x, "blackOnWhite", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setOptCurve(value: Boolean): Self = StObject.set(x, "optCurve", value.asInstanceOf[js.Any])
      
      inline def setOptCurveUndefined: Self = StObject.set(x, "optCurve", js.undefined)
      
      inline def setOptTolerance(value: Double): Self = StObject.set(x, "optTolerance", value.asInstanceOf[js.Any])
      
      inline def setOptToleranceUndefined: Self = StObject.set(x, "optTolerance", js.undefined)
      
      inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
      
      inline def setTurdSize(value: Double): Self = StObject.set(x, "turdSize", value.asInstanceOf[js.Any])
      
      inline def setTurdSizeUndefined: Self = StObject.set(x, "turdSize", js.undefined)
      
      inline def setTurnPolicy(value: String): Self = StObject.set(x, "turnPolicy", value.asInstanceOf[js.Any])
      
      inline def setTurnPolicyUndefined: Self = StObject.set(x, "turnPolicy", js.undefined)
    }
  }
}
