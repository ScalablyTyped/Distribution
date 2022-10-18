package typings.svgPathdata

import typings.svgPathdata.anon.MaxX
import typings.svgPathdata.libTypesMod.SVGCommand
import typings.svgPathdata.libTypesMod.TransformFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSvgpathdatatransformerMod {
  
  object SVGPathDataTransformer {
    
    @JSImport("svg-pathdata/lib/SVGPathDataTransformer", "SVGPathDataTransformer")
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
}
