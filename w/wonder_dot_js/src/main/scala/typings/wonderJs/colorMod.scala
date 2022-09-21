package typings.wonderJs

import typings.wonderJs.vector3Mod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colorMod {
  
  @JSImport("wonder.js/dist/es2015/structure/Color", "Color")
  @js.native
  open class Color () extends StObject {
    
    var a: Double = js.native
    
    var b: Double = js.native
    
    var dirty: Boolean = js.native
    
    var g: Double = js.native
    
    def initWhenCreate(): Unit = js.native
    def initWhenCreate(colorVal: String): Unit = js.native
    
    def isEqual(color: Color): Boolean = js.native
    
    var r: Double = js.native
    
    def toVector3(): Vector3 = js.native
    
    def toVector4(): Any = js.native
  }
  /* static members */
  object Color {
    
    @JSImport("wonder.js/dist/es2015/structure/Color", "Color")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(): Color = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Color]
    inline def create(colorVal: String): Color = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(colorVal.asInstanceOf[js.Any]).asInstanceOf[Color]
  }
}
