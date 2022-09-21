package typings.three

import typings.three.colorMod.Color
import typings.three.threeBooleans.`true`
import typings.three.utilsMod.ColorRepresentation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fogMod {
  
  @JSImport("three/src/scenes/Fog", "Fog")
  @js.native
  open class Fog protected ()
    extends StObject
       with FogBase {
    def this(color: ColorRepresentation) = this()
    def this(color: ColorRepresentation, near: Double) = this()
    def this(color: ColorRepresentation, near: Double, far: Double) = this()
    def this(color: ColorRepresentation, near: Unit, far: Double) = this()
    
    /* CompleteClass */
    var color: Color = js.native
    
    /**
      * The maximum distance at which fog stops being calculated and applied. Objects that are more than 'far' units away from the active camera won't be affected by fog.
      * @default 1000
      */
    var far: Double = js.native
    
    val isFog: `true` = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    /**
      * The minimum distance to start applying fog. Objects that are less than 'near' units from the active camera won't be affected by fog.
      * @default 1
      */
    var near: Double = js.native
    
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  trait FogBase extends StObject {
    
    var color: Color
    
    var name: String
    
    def toJSON(): Any
  }
  object FogBase {
    
    inline def apply(color: Color, name: String, toJSON: () => Any): FogBase = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
      __obj.asInstanceOf[FogBase]
    }
    
    extension [Self <: FogBase](x: Self) {
      
      inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setToJSON(value: () => Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    }
  }
}
