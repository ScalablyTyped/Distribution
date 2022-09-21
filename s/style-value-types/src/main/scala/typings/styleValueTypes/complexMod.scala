package typings.styleValueTypes

import typings.styleValueTypes.typesMod.Color
import typings.styleValueTypes.typesMod.HSLA
import typings.styleValueTypes.typesMod.RGBA
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object complexMod {
  
  object complex {
    
    @JSImport("style-value-types/lib/complex", "complex")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("style-value-types/lib/complex", "complex.createTransformer")
    @js.native
    def createTransformer: js.Function1[
        /* v */ String | Double, 
        js.Function1[/* v */ js.Array[Color | Double | String], String]
      ] = js.native
    inline def createTransformer(v: String): js.Function1[/* v */ js.Array[Color | Double | String], String] = ^.asInstanceOf[js.Dynamic].applyDynamic("createTransformer")(v.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* v */ js.Array[Color | Double | String], String]]
    inline def createTransformer(v: Double): js.Function1[/* v */ js.Array[Color | Double | String], String] = ^.asInstanceOf[js.Dynamic].applyDynamic("createTransformer")(v.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* v */ js.Array[Color | Double | String], String]]
    inline def createTransformer_=(
      x: js.Function1[
          /* v */ String | Double, 
          js.Function1[/* v */ js.Array[Color | Double | String], String]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createTransformer")(x.asInstanceOf[js.Any])
    
    @JSImport("style-value-types/lib/complex", "complex.getAnimatableNone")
    @js.native
    def getAnimatableNone: js.Function1[/* v */ String | Double, String] = js.native
    inline def getAnimatableNone(v: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAnimatableNone")(v.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def getAnimatableNone(v: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAnimatableNone")(v.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def getAnimatableNone_=(x: js.Function1[/* v */ String | Double, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getAnimatableNone")(x.asInstanceOf[js.Any])
    
    @JSImport("style-value-types/lib/complex", "complex.parse")
    @js.native
    def parse: js.Function1[/* v */ String | Double, js.Array[Double | RGBA | HSLA]] = js.native
    inline def parse(v: String): js.Array[Double | RGBA | HSLA] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(v.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double | RGBA | HSLA]]
    inline def parse(v: Double): js.Array[Double | RGBA | HSLA] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(v.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double | RGBA | HSLA]]
    inline def parse_=(x: js.Function1[/* v */ String | Double, js.Array[Double | RGBA | HSLA]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parse")(x.asInstanceOf[js.Any])
    
    @JSImport("style-value-types/lib/complex", "complex.test")
    @js.native
    def test: js.Function1[/* v */ Any, Boolean] = js.native
    inline def test(v: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("test")(v.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def test_=(x: js.Function1[/* v */ Any, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("test")(x.asInstanceOf[js.Any])
  }
}
