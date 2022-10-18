package typings.styleValueTypes

import typings.styleValueTypes.libTypesMod.Color
import typings.styleValueTypes.libTypesMod.HSLA
import typings.styleValueTypes.libTypesMod.RGBA
import typings.styleValueTypes.libTypesMod.ValueType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("style-value-types", "alpha")
  @js.native
  val alpha: ValueType = js.native
  
  @JSImport("style-value-types", "color")
  @js.native
  val color: ValueType = js.native
  
  object complex {
    
    @JSImport("style-value-types", "complex")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("style-value-types", "complex.createTransformer")
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
    
    @JSImport("style-value-types", "complex.getAnimatableNone")
    @js.native
    def getAnimatableNone: js.Function1[/* v */ String | Double, String] = js.native
    inline def getAnimatableNone(v: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAnimatableNone")(v.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def getAnimatableNone(v: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAnimatableNone")(v.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def getAnimatableNone_=(x: js.Function1[/* v */ String | Double, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getAnimatableNone")(x.asInstanceOf[js.Any])
    
    @JSImport("style-value-types", "complex.parse")
    @js.native
    def parse: js.Function1[/* v */ String | Double, js.Array[Double | RGBA | HSLA]] = js.native
    inline def parse(v: String): js.Array[Double | RGBA | HSLA] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(v.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double | RGBA | HSLA]]
    inline def parse(v: Double): js.Array[Double | RGBA | HSLA] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(v.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double | RGBA | HSLA]]
    inline def parse_=(x: js.Function1[/* v */ String | Double, js.Array[Double | RGBA | HSLA]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parse")(x.asInstanceOf[js.Any])
    
    @JSImport("style-value-types", "complex.test")
    @js.native
    def test: js.Function1[/* v */ Any, Boolean] = js.native
    inline def test(v: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("test")(v.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def test_=(x: js.Function1[/* v */ Any, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("test")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("style-value-types", "degrees")
  @js.native
  val degrees: ValueType = js.native
  
  object filter {
    
    @JSImport("style-value-types", "filter")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createTransformer(v: String): js.Function1[/* v */ js.Array[String | Double | RGBA | HSLA], String] = ^.asInstanceOf[js.Dynamic].applyDynamic("createTransformer")(v.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* v */ js.Array[String | Double | RGBA | HSLA], String]]
    inline def createTransformer(v: Double): js.Function1[/* v */ js.Array[String | Double | RGBA | HSLA], String] = ^.asInstanceOf[js.Dynamic].applyDynamic("createTransformer")(v.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* v */ js.Array[String | Double | RGBA | HSLA], String]]
    
    inline def getAnimatableNone(v: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAnimatableNone")(v.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def parse(v: String): js.Array[Double | RGBA | HSLA] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(v.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double | RGBA | HSLA]]
    inline def parse(v: Double): js.Array[Double | RGBA | HSLA] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(v.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double | RGBA | HSLA]]
    
    inline def test(v: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("test")(v.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  @JSImport("style-value-types", "hex")
  @js.native
  val hex: ValueType = js.native
  
  @JSImport("style-value-types", "hsla")
  @js.native
  val hsla: ValueType = js.native
  
  @JSImport("style-value-types", "number")
  @js.native
  val number: ValueType = js.native
  
  @JSImport("style-value-types", "percent")
  @js.native
  val percent: ValueType = js.native
  
  @JSImport("style-value-types", "progressPercentage")
  @js.native
  val progressPercentage: ValueType = js.native
  
  @JSImport("style-value-types", "px")
  @js.native
  val px: ValueType = js.native
  
  @JSImport("style-value-types", "rgbUnit")
  @js.native
  val rgbUnit: ValueType = js.native
  
  @JSImport("style-value-types", "rgba")
  @js.native
  val rgba: ValueType = js.native
  
  @JSImport("style-value-types", "scale")
  @js.native
  val scale: ValueType = js.native
  
  @JSImport("style-value-types", "vh")
  @js.native
  val vh: ValueType = js.native
  
  @JSImport("style-value-types", "vw")
  @js.native
  val vw: ValueType = js.native
}
