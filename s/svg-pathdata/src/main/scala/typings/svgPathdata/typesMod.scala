package typings.svgPathdata

import typings.svgPathdata.svgPathdataInts.`0`
import typings.svgPathdata.svgPathdataInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  trait CommandA
    extends StObject
       with SVGCommand {
    
    var cX: js.UndefOr[Double] = js.undefined
    
    var cY: js.UndefOr[Double] = js.undefined
    
    var lArcFlag: `0` | `1`
    
    var phi1: js.UndefOr[Double] = js.undefined
    
    var phi2: js.UndefOr[Double] = js.undefined
    
    var rX: Double
    
    var rY: Double
    
    var relative: Boolean
    
    var sweepFlag: `0` | `1`
    
    var `type`: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SVGPathData.ARC */ Any
    
    var x: Double
    
    var xRot: Double
    
    var y: Double
  }
  object CommandA {
    
    inline def apply(
      lArcFlag: `0` | `1`,
      rX: Double,
      rY: Double,
      relative: Boolean,
      sweepFlag: `0` | `1`,
      `type`: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SVGPathData.ARC */ Any,
      x: Double,
      xRot: Double,
      y: Double
    ): CommandA = {
      val __obj = js.Dynamic.literal(lArcFlag = lArcFlag.asInstanceOf[js.Any], rX = rX.asInstanceOf[js.Any], rY = rY.asInstanceOf[js.Any], relative = relative.asInstanceOf[js.Any], sweepFlag = sweepFlag.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], xRot = xRot.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommandA]
    }
    
    extension [Self <: CommandA](x: Self) {
      
      inline def setCX(value: Double): Self = StObject.set(x, "cX", value.asInstanceOf[js.Any])
      
      inline def setCXUndefined: Self = StObject.set(x, "cX", js.undefined)
      
      inline def setCY(value: Double): Self = StObject.set(x, "cY", value.asInstanceOf[js.Any])
      
      inline def setCYUndefined: Self = StObject.set(x, "cY", js.undefined)
      
      inline def setLArcFlag(value: `0` | `1`): Self = StObject.set(x, "lArcFlag", value.asInstanceOf[js.Any])
      
      inline def setPhi1(value: Double): Self = StObject.set(x, "phi1", value.asInstanceOf[js.Any])
      
      inline def setPhi1Undefined: Self = StObject.set(x, "phi1", js.undefined)
      
      inline def setPhi2(value: Double): Self = StObject.set(x, "phi2", value.asInstanceOf[js.Any])
      
      inline def setPhi2Undefined: Self = StObject.set(x, "phi2", js.undefined)
      
      inline def setRX(value: Double): Self = StObject.set(x, "rX", value.asInstanceOf[js.Any])
      
      inline def setRY(value: Double): Self = StObject.set(x, "rY", value.asInstanceOf[js.Any])
      
      inline def setRelative(value: Boolean): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
      
      inline def setSweepFlag(value: `0` | `1`): Self = StObject.set(x, "sweepFlag", value.asInstanceOf[js.Any])
      
      inline def setType(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SVGPathData.ARC */ Any
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXRot(value: Double): Self = StObject.set(x, "xRot", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait CommandC
    extends StObject
       with SVGCommand {
    
    var relative: Boolean
    
    var `type`: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SVGPathData.CURVE_TO */ Any
    
    var x: Double
    
    var x1: Double
    
    var x2: Double
    
    var y: Double
    
    var y1: Double
    
    var y2: Double
  }
  object CommandC {
    
    inline def apply(
      relative: Boolean,
      `type`: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SVGPathData.CURVE_TO */ Any,
      x: Double,
      x1: Double,
      x2: Double,
      y: Double,
      y1: Double,
      y2: Double
    ): CommandC = {
      val __obj = js.Dynamic.literal(relative = relative.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommandC]
    }
    
    extension [Self <: CommandC](x: Self) {
      
      inline def setRelative(value: Boolean): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
      
      inline def setType(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SVGPathData.CURVE_TO */ Any
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setX1(value: Double): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
      
      inline def setX2(value: Double): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setY1(value: Double): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
      
      inline def setY2(value: Double): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
    }
  }
  
  trait CommandH
    extends StObject
       with SVGCommand {
    
    var relative: Boolean
    
    var `type`: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SVGPathData.HORIZ_LINE_TO */ Any
    
    var x: Double
  }
  object CommandH {
    
    inline def apply(
      relative: Boolean,
      `type`: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SVGPathData.HORIZ_LINE_TO */ Any,
      x: Double
    ): CommandH = {
      val __obj = js.Dynamic.literal(relative = relative.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommandH]
    }
    
    extension [Self <: CommandH](x: Self) {
      
      inline def setRelative(value: Boolean): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
      
      inline def setType(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SVGPathData.HORIZ_LINE_TO */ Any
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    }
  }
  
  trait CommandL
    extends StObject
       with SVGCommand {
    
    var relative: Boolean
    
    var `type`: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SVGPathData.LINE_TO */ Any
    
    var x: Double
    
    var y: Double
  }
  object CommandL {
    
    inline def apply(
      relative: Boolean,
      `type`: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SVGPathData.LINE_TO */ Any,
      x: Double,
      y: Double
    ): CommandL = {
      val __obj = js.Dynamic.literal(relative = relative.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommandL]
    }
    
    extension [Self <: CommandL](x: Self) {
      
      inline def setRelative(value: Boolean): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
      
      inline def setType(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SVGPathData.LINE_TO */ Any
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait CommandM
    extends StObject
       with SVGCommand {
    
    var relative: Boolean
    
    var `type`: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SVGPathData.MOVE_TO */ Any
    
    var x: Double
    
    var y: Double
  }
  object CommandM {
    
    inline def apply(
      relative: Boolean,
      `type`: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SVGPathData.MOVE_TO */ Any,
      x: Double,
      y: Double
    ): CommandM = {
      val __obj = js.Dynamic.literal(relative = relative.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommandM]
    }
    
    extension [Self <: CommandM](x: Self) {
      
      inline def setRelative(value: Boolean): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
      
      inline def setType(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SVGPathData.MOVE_TO */ Any
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait CommandQ
    extends StObject
       with SVGCommand {
    
    var relative: Boolean
    
    var `type`: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SVGPathData.QUAD_TO */ Any
    
    var x: Double
    
    var x1: Double
    
    var y: Double
    
    var y1: Double
  }
  object CommandQ {
    
    inline def apply(
      relative: Boolean,
      `type`: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SVGPathData.QUAD_TO */ Any,
      x: Double,
      x1: Double,
      y: Double,
      y1: Double
    ): CommandQ = {
      val __obj = js.Dynamic.literal(relative = relative.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommandQ]
    }
    
    extension [Self <: CommandQ](x: Self) {
      
      inline def setRelative(value: Boolean): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
      
      inline def setType(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SVGPathData.QUAD_TO */ Any
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setX1(value: Double): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setY1(value: Double): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
    }
  }
  
  trait CommandS
    extends StObject
       with SVGCommand {
    
    var relative: Boolean
    
    var `type`: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SVGPathData.SMOOTH_CURVE_TO */ Any
    
    var x: Double
    
    var x2: Double
    
    var y: Double
    
    var y2: Double
  }
  object CommandS {
    
    inline def apply(
      relative: Boolean,
      `type`: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SVGPathData.SMOOTH_CURVE_TO */ Any,
      x: Double,
      x2: Double,
      y: Double,
      y2: Double
    ): CommandS = {
      val __obj = js.Dynamic.literal(relative = relative.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommandS]
    }
    
    extension [Self <: CommandS](x: Self) {
      
      inline def setRelative(value: Boolean): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
      
      inline def setType(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SVGPathData.SMOOTH_CURVE_TO */ Any
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setX2(value: Double): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setY2(value: Double): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
    }
  }
  
  trait CommandT
    extends StObject
       with SVGCommand {
    
    var relative: Boolean
    
    var `type`: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SVGPathData.SMOOTH_QUAD_TO */ Any
    
    var x: Double
    
    var y: Double
  }
  object CommandT {
    
    inline def apply(
      relative: Boolean,
      `type`: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SVGPathData.SMOOTH_QUAD_TO */ Any,
      x: Double,
      y: Double
    ): CommandT = {
      val __obj = js.Dynamic.literal(relative = relative.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommandT]
    }
    
    extension [Self <: CommandT](x: Self) {
      
      inline def setRelative(value: Boolean): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
      
      inline def setType(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SVGPathData.SMOOTH_QUAD_TO */ Any
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait CommandV
    extends StObject
       with SVGCommand {
    
    var relative: Boolean
    
    var `type`: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SVGPathData.VERT_LINE_TO */ Any
    
    var y: Double
  }
  object CommandV {
    
    inline def apply(
      relative: Boolean,
      `type`: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SVGPathData.VERT_LINE_TO */ Any,
      y: Double
    ): CommandV = {
      val __obj = js.Dynamic.literal(relative = relative.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommandV]
    }
    
    extension [Self <: CommandV](x: Self) {
      
      inline def setRelative(value: Boolean): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
      
      inline def setType(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SVGPathData.VERT_LINE_TO */ Any
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait CommandZ
    extends StObject
       with SVGCommand {
    
    var `type`: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SVGPathData.CLOSE_PATH */ Any
  }
  object CommandZ {
    
    inline def apply(
      `type`: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SVGPathData.CLOSE_PATH */ Any
    ): CommandZ = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommandZ]
    }
    
    extension [Self <: CommandZ](x: Self) {
      
      inline def setType(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SVGPathData.CLOSE_PATH */ Any
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.svgPathdata.typesMod.CommandM
    - typings.svgPathdata.typesMod.CommandL
    - typings.svgPathdata.typesMod.CommandH
    - typings.svgPathdata.typesMod.CommandV
    - typings.svgPathdata.typesMod.CommandZ
    - typings.svgPathdata.typesMod.CommandQ
    - typings.svgPathdata.typesMod.CommandT
    - typings.svgPathdata.typesMod.CommandC
    - typings.svgPathdata.typesMod.CommandS
    - typings.svgPathdata.typesMod.CommandA
  */
  trait SVGCommand extends StObject
  object SVGCommand {
    
    inline def CommandA(
      lArcFlag: `0` | `1`,
      rX: Double,
      rY: Double,
      relative: Boolean,
      sweepFlag: `0` | `1`,
      `type`: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SVGPathData.ARC */ Any,
      x: Double,
      xRot: Double,
      y: Double
    ): typings.svgPathdata.typesMod.CommandA = {
      val __obj = js.Dynamic.literal(lArcFlag = lArcFlag.asInstanceOf[js.Any], rX = rX.asInstanceOf[js.Any], rY = rY.asInstanceOf[js.Any], relative = relative.asInstanceOf[js.Any], sweepFlag = sweepFlag.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], xRot = xRot.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.svgPathdata.typesMod.CommandA]
    }
    
    inline def CommandC(
      relative: Boolean,
      `type`: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SVGPathData.CURVE_TO */ Any,
      x: Double,
      x1: Double,
      x2: Double,
      y: Double,
      y1: Double,
      y2: Double
    ): typings.svgPathdata.typesMod.CommandC = {
      val __obj = js.Dynamic.literal(relative = relative.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.svgPathdata.typesMod.CommandC]
    }
    
    inline def CommandH(
      relative: Boolean,
      `type`: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SVGPathData.HORIZ_LINE_TO */ Any,
      x: Double
    ): typings.svgPathdata.typesMod.CommandH = {
      val __obj = js.Dynamic.literal(relative = relative.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.svgPathdata.typesMod.CommandH]
    }
    
    inline def CommandL(
      relative: Boolean,
      `type`: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SVGPathData.LINE_TO */ Any,
      x: Double,
      y: Double
    ): typings.svgPathdata.typesMod.CommandL = {
      val __obj = js.Dynamic.literal(relative = relative.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.svgPathdata.typesMod.CommandL]
    }
    
    inline def CommandM(
      relative: Boolean,
      `type`: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SVGPathData.MOVE_TO */ Any,
      x: Double,
      y: Double
    ): typings.svgPathdata.typesMod.CommandM = {
      val __obj = js.Dynamic.literal(relative = relative.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.svgPathdata.typesMod.CommandM]
    }
    
    inline def CommandQ(
      relative: Boolean,
      `type`: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SVGPathData.QUAD_TO */ Any,
      x: Double,
      x1: Double,
      y: Double,
      y1: Double
    ): typings.svgPathdata.typesMod.CommandQ = {
      val __obj = js.Dynamic.literal(relative = relative.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.svgPathdata.typesMod.CommandQ]
    }
    
    inline def CommandS(
      relative: Boolean,
      `type`: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SVGPathData.SMOOTH_CURVE_TO */ Any,
      x: Double,
      x2: Double,
      y: Double,
      y2: Double
    ): typings.svgPathdata.typesMod.CommandS = {
      val __obj = js.Dynamic.literal(relative = relative.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.svgPathdata.typesMod.CommandS]
    }
    
    inline def CommandT(
      relative: Boolean,
      `type`: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SVGPathData.SMOOTH_QUAD_TO */ Any,
      x: Double,
      y: Double
    ): typings.svgPathdata.typesMod.CommandT = {
      val __obj = js.Dynamic.literal(relative = relative.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.svgPathdata.typesMod.CommandT]
    }
    
    inline def CommandV(
      relative: Boolean,
      `type`: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SVGPathData.VERT_LINE_TO */ Any,
      y: Double
    ): typings.svgPathdata.typesMod.CommandV = {
      val __obj = js.Dynamic.literal(relative = relative.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.svgPathdata.typesMod.CommandV]
    }
    
    inline def CommandZ(
      `type`: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SVGPathData.CLOSE_PATH */ Any
    ): typings.svgPathdata.typesMod.CommandZ = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.svgPathdata.typesMod.CommandZ]
    }
  }
  
  type TransformFunction = js.Function1[/* input */ SVGCommand, SVGCommand | js.Array[SVGCommand]]
}
