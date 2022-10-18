package typings.vegaLite

import typings.vegaLite.vegaLiteStrings.geojson
import typings.vegaLite.vegaLiteStrings.nominal
import typings.vegaLite.vegaLiteStrings.ordinal
import typings.vegaLite.vegaLiteStrings.quantitative
import typings.vegaLite.vegaLiteStrings.temporal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcTypeMod {
  
  @JSImport("vega-lite/build/src/type", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vega-lite/build/src/type", "GEOJSON")
  @js.native
  val GEOJSON: geojson = js.native
  
  @JSImport("vega-lite/build/src/type", "NOMINAL")
  @js.native
  val NOMINAL: nominal = js.native
  
  @JSImport("vega-lite/build/src/type", "ORDINAL")
  @js.native
  val ORDINAL: ordinal = js.native
  
  @JSImport("vega-lite/build/src/type", "QUANTITATIVE")
  @js.native
  val QUANTITATIVE: quantitative = js.native
  
  @JSImport("vega-lite/build/src/type", "TEMPORAL")
  @js.native
  val TEMPORAL: temporal = js.native
  
  @JSImport("vega-lite/build/src/type", "TYPES")
  @js.native
  val TYPES: js.Array[ordinal | geojson | quantitative | temporal | nominal] = js.native
  
  /* keyof vega-lite.anon.Geojson */ /* Rewritten from type alias, can be one of: 
    - typings.vegaLite.vegaLiteStrings.quantitative
    - typings.vegaLite.vegaLiteStrings.ordinal
    - typings.vegaLite.vegaLiteStrings.temporal
    - typings.vegaLite.vegaLiteStrings.nominal
    - typings.vegaLite.vegaLiteStrings.geojson
  */
  trait Type extends StObject
  object Type {
    
    @JSImport("vega-lite/build/src/type", "Type.geojson")
    @js.native
    val geojson: typings.vegaLite.vegaLiteStrings.geojson = js.native
    
    @JSImport("vega-lite/build/src/type", "Type.nominal")
    @js.native
    val nominal: typings.vegaLite.vegaLiteStrings.nominal = js.native
    
    @JSImport("vega-lite/build/src/type", "Type.ordinal")
    @js.native
    val ordinal: typings.vegaLite.vegaLiteStrings.ordinal = js.native
    
    @JSImport("vega-lite/build/src/type", "Type.quantitative")
    @js.native
    val quantitative: typings.vegaLite.vegaLiteStrings.quantitative = js.native
    
    @JSImport("vega-lite/build/src/type", "Type.temporal")
    @js.native
    val temporal: typings.vegaLite.vegaLiteStrings.temporal = js.native
  }
  
  inline def getFullName(`type`: String): js.UndefOr[Type] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFullName")(`type`.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Type]]
  inline def getFullName(`type`: Type): js.UndefOr[Type] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFullName")(`type`.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Type]]
  
  inline def isContinuous(`type`: Type): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isContinuous")(`type`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isDiscrete(`type`: Type): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDiscrete")(`type`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isType(t: Any): /* is vega-lite.vega-lite/build/src/type.Type */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isType")(t.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/type.Type */ Boolean]
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaLite.vegaLiteStrings.quantitative
    - typings.vegaLite.vegaLiteStrings.ordinal
    - typings.vegaLite.vegaLiteStrings.temporal
    - typings.vegaLite.vegaLiteStrings.nominal
  */
  trait StandardType extends StObject
  object StandardType {
    
    inline def nominal: typings.vegaLite.vegaLiteStrings.nominal = "nominal".asInstanceOf[typings.vegaLite.vegaLiteStrings.nominal]
    
    inline def ordinal: typings.vegaLite.vegaLiteStrings.ordinal = "ordinal".asInstanceOf[typings.vegaLite.vegaLiteStrings.ordinal]
    
    inline def quantitative: typings.vegaLite.vegaLiteStrings.quantitative = "quantitative".asInstanceOf[typings.vegaLite.vegaLiteStrings.quantitative]
    
    inline def temporal: typings.vegaLite.vegaLiteStrings.temporal = "temporal".asInstanceOf[typings.vegaLite.vegaLiteStrings.temporal]
  }
}
