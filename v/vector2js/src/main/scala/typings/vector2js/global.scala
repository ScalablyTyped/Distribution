package typings.vector2js

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Vector {
    
    @JSGlobal("Vector")
    @js.native
    open class ^ protected ()
      extends typings.vector2js.mod.^ {
      def this(x: Double, y: Double) = this()
    }
    
    @JSGlobal("Vector")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Vector.down")
    @js.native
    val down: typings.vector2js.mod.Vector = js.native
    
    @JSGlobal("Vector.downLeft")
    @js.native
    val downLeft: typings.vector2js.mod.Vector = js.native
    
    @JSGlobal("Vector.downRight")
    @js.native
    val downRight: typings.vector2js.mod.Vector = js.native
    
    /**
      * @description Creates a Vector from an array
      * @param Array: [10,10]
      * @return Vector
      */
    /* static member */
    inline def fromArray(array: js.Array[Double]): typings.vector2js.mod.Vector = ^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(array.asInstanceOf[js.Any]).asInstanceOf[typings.vector2js.mod.Vector]
    
    /**
      * @description Creates a Vector from an angle
      * @param angle in degrees
      * @return Vector
      */
    /* static member */
    inline def fromDegrees(angle: Double): typings.vector2js.mod.Vector = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(angle.asInstanceOf[js.Any]).asInstanceOf[typings.vector2js.mod.Vector]
    
    /**
      * @description Creates a Vector from an angle
      * @param angle in radians
      * @return Vector
      */
    /* static member */
    inline def fromRadians(agnle: Double): typings.vector2js.mod.Vector = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRadians")(agnle.asInstanceOf[js.Any]).asInstanceOf[typings.vector2js.mod.Vector]
    
    /**
      * @description Creates a Vector from string
      * @param string format: x,y 10,10
      * @return Vector
      */
    /* static member */
    inline def fromString(s: String): typings.vector2js.mod.Vector = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(s.asInstanceOf[js.Any]).asInstanceOf[typings.vector2js.mod.Vector]
    
    @JSGlobal("Vector.left")
    @js.native
    val left: typings.vector2js.mod.Vector = js.native
    
    @JSGlobal("Vector.one")
    @js.native
    val one: typings.vector2js.mod.Vector = js.native
    
    @JSGlobal("Vector.right")
    @js.native
    val right: typings.vector2js.mod.Vector = js.native
    
    @JSGlobal("Vector.up")
    @js.native
    val up: typings.vector2js.mod.Vector = js.native
    
    @JSGlobal("Vector.upLeft")
    @js.native
    val upLeft: typings.vector2js.mod.Vector = js.native
    
    @JSGlobal("Vector.upRight")
    @js.native
    val upRight: typings.vector2js.mod.Vector = js.native
    
    @JSGlobal("Vector.zero")
    @js.native
    val zero: typings.vector2js.mod.Vector = js.native
  }
}
