package typings.svgPathdata

import typings.svgPathdata.anon.MaxX
import typings.svgPathdata.svgPathdataInts.`128`
import typings.svgPathdata.svgPathdataInts.`16`
import typings.svgPathdata.svgPathdataInts.`1`
import typings.svgPathdata.svgPathdataInts.`256`
import typings.svgPathdata.svgPathdataInts.`2`
import typings.svgPathdata.svgPathdataInts.`32`
import typings.svgPathdata.svgPathdataInts.`4`
import typings.svgPathdata.svgPathdataInts.`512`
import typings.svgPathdata.svgPathdataInts.`64`
import typings.svgPathdata.svgPathdataInts.`8`
import typings.svgPathdata.transformableSVGMod.TransformableSVG
import typings.svgPathdata.typesMod.SVGCommand
import typings.svgPathdata.typesMod.TransformFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("svg-pathdata", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object COMMAND_ARG_COUNTS {
    
    @JSImport("svg-pathdata", "COMMAND_ARG_COUNTS.1")
    @js.native
    val `1`: Double = js.native
    
    @JSImport("svg-pathdata", "COMMAND_ARG_COUNTS.128")
    @js.native
    val `128`: Double = js.native
    
    @JSImport("svg-pathdata", "COMMAND_ARG_COUNTS.16")
    @js.native
    val `16`: Double = js.native
    
    @JSImport("svg-pathdata", "COMMAND_ARG_COUNTS.2")
    @js.native
    val `2`: Double = js.native
    
    @JSImport("svg-pathdata", "COMMAND_ARG_COUNTS.256")
    @js.native
    val `256`: Double = js.native
    
    @JSImport("svg-pathdata", "COMMAND_ARG_COUNTS.32")
    @js.native
    val `32`: Double = js.native
    
    @JSImport("svg-pathdata", "COMMAND_ARG_COUNTS.4")
    @js.native
    val `4`: Double = js.native
    
    @JSImport("svg-pathdata", "COMMAND_ARG_COUNTS.512")
    @js.native
    val `512`: Double = js.native
    
    @JSImport("svg-pathdata", "COMMAND_ARG_COUNTS.64")
    @js.native
    val `64`: Double = js.native
    
    @JSImport("svg-pathdata", "COMMAND_ARG_COUNTS.8")
    @js.native
    val `8`: Double = js.native
  }
  
  @JSImport("svg-pathdata", "SVGPathData")
  @js.native
  open class SVGPathData protected () extends TransformableSVG {
    def this(content: String) = this()
    def this(content: js.Array[SVGCommand]) = this()
    
    var commands: js.Array[SVGCommand] = js.native
    
    def encode(): String = js.native
    
    def getBounds(): TransformFunction & MaxX = js.native
  }
  /* static members */
  object SVGPathData {
    
    @JSImport("svg-pathdata", "SVGPathData")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("svg-pathdata", "SVGPathData.ARC")
    @js.native
    val ARC: `512` = js.native
    
    @JSImport("svg-pathdata", "SVGPathData.CLOSE_PATH")
    @js.native
    val CLOSE_PATH: `1` = js.native
    
    @JSImport("svg-pathdata", "SVGPathData.CURVE_TO")
    @js.native
    val CURVE_TO: `32` = js.native
    
    @JSImport("svg-pathdata", "SVGPathData.DRAWING_COMMANDS")
    @js.native
    val DRAWING_COMMANDS: Double = js.native
    
    @JSImport("svg-pathdata", "SVGPathData.HORIZ_LINE_TO")
    @js.native
    val HORIZ_LINE_TO: `4` = js.native
    
    @JSImport("svg-pathdata", "SVGPathData.LINE_COMMANDS")
    @js.native
    val LINE_COMMANDS: Double = js.native
    
    @JSImport("svg-pathdata", "SVGPathData.LINE_TO")
    @js.native
    val LINE_TO: `16` = js.native
    
    @JSImport("svg-pathdata", "SVGPathData.MOVE_TO")
    @js.native
    val MOVE_TO: `2` = js.native
    
    @JSImport("svg-pathdata", "SVGPathData.QUAD_TO")
    @js.native
    val QUAD_TO: `128` = js.native
    
    @JSImport("svg-pathdata", "SVGPathData.SMOOTH_CURVE_TO")
    @js.native
    val SMOOTH_CURVE_TO: `64` = js.native
    
    @JSImport("svg-pathdata", "SVGPathData.SMOOTH_QUAD_TO")
    @js.native
    val SMOOTH_QUAD_TO: `256` = js.native
    
    @JSImport("svg-pathdata", "SVGPathData.VERT_LINE_TO")
    @js.native
    val VERT_LINE_TO: `8` = js.native
    
    inline def encode(commands: js.Array[SVGCommand]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(commands.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def parse(path: String): js.Array[SVGCommand] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(path.asInstanceOf[js.Any]).asInstanceOf[js.Array[SVGCommand]]
  }
  
  @JSImport("svg-pathdata", "SVGPathDataParser")
  @js.native
  open class SVGPathDataParser ()
    extends typings.svgPathdata.svgpathdataparserMod.SVGPathDataParser
  
  object SVGPathDataTransformer {
    
    @JSImport("svg-pathdata", "SVGPathDataTransformer")
    @js.native
    val ^ : js.Any = js.native
    
    inline def ANNOTATE_ARCS(): js.Function1[/* command */ Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("ANNOTATE_ARCS")().asInstanceOf[js.Function1[/* command */ Any, Any]]
    
    inline def A_TO_C(): js.Function1[/* command */ Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("A_TO_C")().asInstanceOf[js.Function1[/* command */ Any, Any]]
    
    inline def CALCULATE_BOUNDS(): TransformFunction & MaxX = ^.asInstanceOf[js.Dynamic].applyDynamic("CALCULATE_BOUNDS")().asInstanceOf[TransformFunction & MaxX]
    
    inline def CLONE(): js.Function1[/* c */ SVGCommand, SVGCommand] = ^.asInstanceOf[js.Dynamic].applyDynamic("CLONE")().asInstanceOf[js.Function1[/* c */ SVGCommand, SVGCommand]]
    
    inline def INFO(
      f: js.Function5[
          /* command */ Any, 
          /* prevXAbs */ Double, 
          /* prevYAbs */ Double, 
          /* pathStartXAbs */ Double, 
          /* pathStartYAbs */ Double, 
          Any | js.Array[Any]
        ]
    ): js.Function1[/* command */ Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("INFO")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* command */ Any, Any]]
    
    inline def MATRIX(a: Double, b: Double, c: Double, d: Double, e: Double, f: Double): js.Function1[/* command */ Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("MATRIX")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any], e.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* command */ Any, Any]]
    
    inline def NORMALIZE_HVZ(): js.Function1[/* command */ Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("NORMALIZE_HVZ")().asInstanceOf[js.Function1[/* command */ Any, Any]]
    inline def NORMALIZE_HVZ(normalizeZ: Boolean): js.Function1[/* command */ Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("NORMALIZE_HVZ")(normalizeZ.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* command */ Any, Any]]
    inline def NORMALIZE_HVZ(normalizeZ: Boolean, normalizeH: Boolean): js.Function1[/* command */ Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("NORMALIZE_HVZ")(normalizeZ.asInstanceOf[js.Any], normalizeH.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* command */ Any, Any]]
    inline def NORMALIZE_HVZ(normalizeZ: Boolean, normalizeH: Boolean, normalizeV: Boolean): js.Function1[/* command */ Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("NORMALIZE_HVZ")(normalizeZ.asInstanceOf[js.Any], normalizeH.asInstanceOf[js.Any], normalizeV.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* command */ Any, Any]]
    inline def NORMALIZE_HVZ(normalizeZ: Boolean, normalizeH: Unit, normalizeV: Boolean): js.Function1[/* command */ Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("NORMALIZE_HVZ")(normalizeZ.asInstanceOf[js.Any], normalizeH.asInstanceOf[js.Any], normalizeV.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* command */ Any, Any]]
    inline def NORMALIZE_HVZ(normalizeZ: Unit, normalizeH: Boolean): js.Function1[/* command */ Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("NORMALIZE_HVZ")(normalizeZ.asInstanceOf[js.Any], normalizeH.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* command */ Any, Any]]
    inline def NORMALIZE_HVZ(normalizeZ: Unit, normalizeH: Boolean, normalizeV: Boolean): js.Function1[/* command */ Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("NORMALIZE_HVZ")(normalizeZ.asInstanceOf[js.Any], normalizeH.asInstanceOf[js.Any], normalizeV.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* command */ Any, Any]]
    inline def NORMALIZE_HVZ(normalizeZ: Unit, normalizeH: Unit, normalizeV: Boolean): js.Function1[/* command */ Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("NORMALIZE_HVZ")(normalizeZ.asInstanceOf[js.Any], normalizeH.asInstanceOf[js.Any], normalizeV.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* command */ Any, Any]]
    
    inline def NORMALIZE_ST(): js.Function1[/* command */ Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("NORMALIZE_ST")().asInstanceOf[js.Function1[/* command */ Any, Any]]
    
    inline def QT_TO_C(): js.Function1[/* command */ Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("QT_TO_C")().asInstanceOf[js.Function1[/* command */ Any, Any]]
    
    inline def ROTATE(a: Double): js.Function1[/* command */ Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("ROTATE")(a.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* command */ Any, Any]]
    inline def ROTATE(a: Double, x: Double): js.Function1[/* command */ Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("ROTATE")(a.asInstanceOf[js.Any], x.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* command */ Any, Any]]
    inline def ROTATE(a: Double, x: Double, y: Double): js.Function1[/* command */ Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("ROTATE")(a.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* command */ Any, Any]]
    inline def ROTATE(a: Double, x: Unit, y: Double): js.Function1[/* command */ Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("ROTATE")(a.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* command */ Any, Any]]
    
    inline def ROUND(): js.Function1[/* command */ Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("ROUND")().asInstanceOf[js.Function1[/* command */ Any, Any]]
    inline def ROUND(roundVal: Double): js.Function1[/* command */ Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("ROUND")(roundVal.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* command */ Any, Any]]
    
    inline def SANITIZE(): js.Function1[/* command */ Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("SANITIZE")().asInstanceOf[js.Function1[/* command */ Any, Any]]
    inline def SANITIZE(EPS: Double): js.Function1[/* command */ Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("SANITIZE")(EPS.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* command */ Any, Any]]
    
    inline def SCALE(dX: Double): js.Function1[/* command */ Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("SCALE")(dX.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* command */ Any, Any]]
    inline def SCALE(dX: Double, dY: Double): js.Function1[/* command */ Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("SCALE")(dX.asInstanceOf[js.Any], dY.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* command */ Any, Any]]
    
    inline def SKEW_X(a: Double): js.Function1[/* command */ Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("SKEW_X")(a.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* command */ Any, Any]]
    
    inline def SKEW_Y(a: Double): js.Function1[/* command */ Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("SKEW_Y")(a.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* command */ Any, Any]]
    
    inline def TO_ABS(): js.Function1[/* command */ Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("TO_ABS")().asInstanceOf[js.Function1[/* command */ Any, Any]]
    
    inline def TO_REL(): js.Function1[/* command */ Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("TO_REL")().asInstanceOf[js.Function1[/* command */ Any, Any]]
    
    inline def TRANSLATE(dX: Double): js.Function1[/* command */ Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("TRANSLATE")(dX.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* command */ Any, Any]]
    inline def TRANSLATE(dX: Double, dY: Double): js.Function1[/* command */ Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("TRANSLATE")(dX.asInstanceOf[js.Any], dY.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* command */ Any, Any]]
    
    inline def X_AXIS_SYMMETRY(): js.Function1[/* command */ Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("X_AXIS_SYMMETRY")().asInstanceOf[js.Function1[/* command */ Any, Any]]
    inline def X_AXIS_SYMMETRY(xOffset: Double): js.Function1[/* command */ Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("X_AXIS_SYMMETRY")(xOffset.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* command */ Any, Any]]
    
    inline def Y_AXIS_SYMMETRY(): js.Function1[/* command */ Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("Y_AXIS_SYMMETRY")().asInstanceOf[js.Function1[/* command */ Any, Any]]
    inline def Y_AXIS_SYMMETRY(yOffset: Double): js.Function1[/* command */ Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("Y_AXIS_SYMMETRY")(yOffset.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* command */ Any, Any]]
  }
  
  inline def encodeSVGPath(commands: js.Array[SVGCommand]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeSVGPath")(commands.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def encodeSVGPath(commands: SVGCommand): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeSVGPath")(commands.asInstanceOf[js.Any]).asInstanceOf[String]
}
