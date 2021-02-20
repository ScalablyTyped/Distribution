package typings.three

import typings.three.colorMod.Color
import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fogMod {
  
  @JSImport("three/src/scenes/Fog", "Fog")
  @js.native
  class Fog protected () extends IFog {
    def this(color: String) = this()
    def this(color: Double) = this()
    def this(color: Color) = this()
    def this(color: String, near: Double) = this()
    def this(color: Double, near: Double) = this()
    def this(color: Color, near: Double) = this()
    def this(color: String, near: js.UndefOr[scala.Nothing], far: Double) = this()
    def this(color: String, near: Double, far: Double) = this()
    def this(color: Double, near: js.UndefOr[scala.Nothing], far: Double) = this()
    def this(color: Double, near: Double, far: Double) = this()
    def this(color: Color, near: js.UndefOr[scala.Nothing], far: Double) = this()
    def this(color: Color, near: Double, far: Double) = this()
    
    /**
    	 * The maximum distance at which fog stops being calculated and applied. Objects that are more than 'far' units away from the active camera won't be affected by fog.
    	 * @default 1000
    	 */
    var far: Double = js.native
    
    val isFog: `true` = js.native
    
    /**
    	 * The minimum distance to start applying fog. Objects that are less than 'near' units from the active camera won't be affected by fog.
    	 * @default 1
    	 */
    var near: Double = js.native
  }
  
  @js.native
  trait IFog extends StObject {
    
    var color: Color = js.native
    
    var name: String = js.native
    
    def toJSON(): js.Any = js.native
  }
  object IFog {
    
    @scala.inline
    def apply(color: Color, name: String, toJSON: () => js.Any): IFog = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
      __obj.asInstanceOf[IFog]
    }
    
    @scala.inline
    implicit class IFogMutableBuilder[Self <: IFog] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    }
  }
}
