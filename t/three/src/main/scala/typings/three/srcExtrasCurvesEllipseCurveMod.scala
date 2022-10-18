package typings.three

import typings.three.srcExtrasCoreCurveMod.Curve
import typings.three.srcMathVector2Mod.Vector2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcExtrasCurvesEllipseCurveMod {
  
  @JSImport("three/src/extras/curves/EllipseCurve", "EllipseCurve")
  @js.native
  open class EllipseCurve protected () extends Curve[Vector2] {
    def this(
      aX: Double,
      aY: Double,
      xRadius: Double,
      yRadius: Double,
      aStartAngle: Double,
      aEndAngle: Double,
      aClockwise: Boolean,
      aRotation: Double
    ) = this()
    
    /**
      * @default false
      */
    var aClockwise: Boolean = js.native
    
    /**
      * @default 2 * Math.PI
      */
    var aEndAngle: Double = js.native
    
    /**
      * @default 0
      */
    var aRotation: Double = js.native
    
    /**
      * @default 0
      */
    var aStartAngle: Double = js.native
    
    /**
      * @default 0
      */
    var aX: Double = js.native
    
    /**
      * @default 0
      */
    var aY: Double = js.native
    
    /**
      * @default 1
      */
    var xRadius: Double = js.native
    
    /**
      * @default 1
      */
    var yRadius: Double = js.native
  }
}
