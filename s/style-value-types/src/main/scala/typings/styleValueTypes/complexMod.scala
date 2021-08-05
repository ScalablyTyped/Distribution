package typings.styleValueTypes

import typings.styleValueTypes.typesMod.HSLA
import typings.styleValueTypes.typesMod.RGBA
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object complexMod {
  
  object complex {
    
    @JSImport("style-value-types/lib/value-types/complex", "complex")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createTransformer(prop: String): js.Function1[/* v */ js.Array[Double | RGBA | HSLA], String] = ^.asInstanceOf[js.Dynamic].applyDynamic("createTransformer")(prop.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* v */ js.Array[Double | RGBA | HSLA], String]]
    
    inline def getAnimatableNone(target: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAnimatableNone")(target.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def parse(v: js.Any): js.Array[Double | RGBA | HSLA] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(v.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double | RGBA | HSLA]]
    
    inline def test(v: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("test")(v.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
}
