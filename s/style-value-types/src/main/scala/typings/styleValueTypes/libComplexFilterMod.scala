package typings.styleValueTypes

import typings.styleValueTypes.libTypesMod.HSLA
import typings.styleValueTypes.libTypesMod.RGBA
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComplexFilterMod {
  
  object filter {
    
    @JSImport("style-value-types/lib/complex/filter", "filter")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createTransformer(v: String): js.Function1[/* v */ js.Array[String | Double | RGBA | HSLA], String] = ^.asInstanceOf[js.Dynamic].applyDynamic("createTransformer")(v.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* v */ js.Array[String | Double | RGBA | HSLA], String]]
    inline def createTransformer(v: Double): js.Function1[/* v */ js.Array[String | Double | RGBA | HSLA], String] = ^.asInstanceOf[js.Dynamic].applyDynamic("createTransformer")(v.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* v */ js.Array[String | Double | RGBA | HSLA], String]]
    
    inline def getAnimatableNone(v: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAnimatableNone")(v.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def parse(v: String): js.Array[Double | RGBA | HSLA] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(v.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double | RGBA | HSLA]]
    inline def parse(v: Double): js.Array[Double | RGBA | HSLA] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(v.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double | RGBA | HSLA]]
    
    inline def test(v: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("test")(v.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
}
