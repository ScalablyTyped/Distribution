package typings.three

import typings.three.srcMathColorMod.Color
import typings.three.srcMathColorMod.ColorRepresentation
import typings.three.srcScenesFogMod.FogBase
import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcScenesFogExp2Mod {
  
  @JSImport("three/src/scenes/FogExp2", "FogExp2")
  @js.native
  open class FogExp2 protected ()
    extends StObject
       with FogBase {
    /**
      * The color parameter is passed to the {@link THREE.Color | Color} constructor to set the color property
      * @remarks Color can be a hexadecimal integer or a CSS-style string.
      * @param color
      * @param density Expects a `Float`
      */
    def this(color: ColorRepresentation) = this()
    def this(color: ColorRepresentation, density: Double) = this()
    
    /**
      * Fog color.
      * @remarks If set to black, far away objects will be rendered black.
      */
    /* CompleteClass */
    var color: Color = js.native
    
    /**
      * Defines how fast the fog will grow dense.
      * @defaultValue `0.00025`
      * @remarks Expects a `Float`
      */
    var density: Double = js.native
    
    /**
      * Read-only flag to check if a given object is of type {@link FogExp2}.
      * @remarks This is a _constant_ value
      * @defaultValue `true`
      */
    val isFogExp2: `true` = js.native
    
    /**
      * Optional name of the `Fog` object
      * @remarks _(doesn't need to be unique)_.
      * @defaultValue `""`
      */
    /* CompleteClass */
    var name: String = js.native
    
    /**
      * Return Fog data in JSON format.
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
}
