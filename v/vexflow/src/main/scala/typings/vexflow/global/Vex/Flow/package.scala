package typings.vexflow.global.Vex.Flow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


//inconsistent API: this should be private and have a wrapper function like the other tables
@scala.inline
def DEFAULT_NOTATION_FONT_SCALE: scala.Double = typings.vexflow.global.Vex.Flow.^.asInstanceOf[js.Dynamic].selectDynamic("DEFAULT_NOTATION_FONT_SCALE").asInstanceOf[scala.Double]

@scala.inline
def RESOLUTION: scala.Double = typings.vexflow.global.Vex.Flow.^.asInstanceOf[js.Dynamic].selectDynamic("RESOLUTION").asInstanceOf[scala.Double]

@scala.inline
def STAVE_LINE_THICKNESS: scala.Double = typings.vexflow.global.Vex.Flow.^.asInstanceOf[js.Dynamic].selectDynamic("STAVE_LINE_THICKNESS").asInstanceOf[scala.Double]

@scala.inline
def STEM_HEIGHT: scala.Double = typings.vexflow.global.Vex.Flow.^.asInstanceOf[js.Dynamic].selectDynamic("STEM_HEIGHT").asInstanceOf[scala.Double]

// from tables.js:
@scala.inline
def STEM_WIDTH: scala.Double = typings.vexflow.global.Vex.Flow.^.asInstanceOf[js.Dynamic].selectDynamic("STEM_WIDTH").asInstanceOf[scala.Double]

@scala.inline
def accidentalCodes(acc: java.lang.String): typings.vexflow.anon.Gracenotewidth = typings.vexflow.global.Vex.Flow.^.asInstanceOf[js.Dynamic].applyDynamic("accidentalCodes")(acc.asInstanceOf[js.Any]).asInstanceOf[typings.vexflow.anon.Gracenotewidth]

@scala.inline
def articulationCodes(artic: java.lang.String): typings.vexflow.anon.Betweenlines = typings.vexflow.global.Vex.Flow.^.asInstanceOf[js.Dynamic].applyDynamic("articulationCodes")(artic.asInstanceOf[js.Any]).asInstanceOf[typings.vexflow.anon.Betweenlines]

@scala.inline
def clefProperties(clef: java.lang.String): typings.vexflow.anon.Lineshift = typings.vexflow.global.Vex.Flow.^.asInstanceOf[js.Dynamic].applyDynamic("clefProperties")(clef.asInstanceOf[js.Any]).asInstanceOf[typings.vexflow.anon.Lineshift]

@scala.inline
def durationToFraction(duration: java.lang.String): typings.vexflow.Vex.Flow.Fraction = typings.vexflow.global.Vex.Flow.^.asInstanceOf[js.Dynamic].applyDynamic("durationToFraction")(duration.asInstanceOf[js.Any]).asInstanceOf[typings.vexflow.Vex.Flow.Fraction]

@scala.inline
def durationToGlyph(duration: java.lang.String, `type`: java.lang.String): typings.vexflow.anon.Codehead = (typings.vexflow.global.Vex.Flow.^.asInstanceOf[js.Dynamic].applyDynamic("durationToGlyph")(duration.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[typings.vexflow.anon.Codehead]

@scala.inline
def durationToNumber(duration: java.lang.String): scala.Double = typings.vexflow.global.Vex.Flow.^.asInstanceOf[js.Dynamic].applyDynamic("durationToNumber")(duration.asInstanceOf[js.Any]).asInstanceOf[scala.Double]

@scala.inline
def durationToTicks(duration: java.lang.String): scala.Double = typings.vexflow.global.Vex.Flow.^.asInstanceOf[js.Dynamic].applyDynamic("durationToTicks")(duration.asInstanceOf[js.Any]).asInstanceOf[scala.Double]

@scala.inline
def integerToNote(integer: scala.Double): java.lang.String = typings.vexflow.global.Vex.Flow.^.asInstanceOf[js.Dynamic].applyDynamic("integerToNote")(integer.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]

@scala.inline
def keyProperties(key: java.lang.String, clef: java.lang.String, params: typings.vexflow.anon.Octaveshift): typings.vexflow.anon.Accidental = (typings.vexflow.global.Vex.Flow.^.asInstanceOf[js.Dynamic].applyDynamic("keyProperties")(key.asInstanceOf[js.Any], clef.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[typings.vexflow.anon.Accidental]

@scala.inline
def keySignature(spec: java.lang.String): js.Array[typings.vexflow.anon.Line] = typings.vexflow.global.Vex.Flow.^.asInstanceOf[js.Dynamic].applyDynamic("keySignature")(spec.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.vexflow.anon.Line]]

@scala.inline
def ornamentCodes(acc: java.lang.String): typings.vexflow.anon.Shiftdown = typings.vexflow.global.Vex.Flow.^.asInstanceOf[js.Dynamic].applyDynamic("ornamentCodes")(acc.asInstanceOf[js.Any]).asInstanceOf[typings.vexflow.anon.Shiftdown]

@scala.inline
def parseNoteData(noteData: typings.vexflow.anon.Dots): typings.vexflow.anon.Duration = typings.vexflow.global.Vex.Flow.^.asInstanceOf[js.Dynamic].applyDynamic("parseNoteData")(noteData.asInstanceOf[js.Any]).asInstanceOf[typings.vexflow.anon.Duration]

@scala.inline
def parseNoteDurationString(durationString: java.lang.String): typings.vexflow.anon.Dots = typings.vexflow.global.Vex.Flow.^.asInstanceOf[js.Dynamic].applyDynamic("parseNoteDurationString")(durationString.asInstanceOf[js.Any]).asInstanceOf[typings.vexflow.anon.Dots]

// from glyph.js:
@scala.inline
def renderGlyph(
  ctx: typings.vexflow.Vex.IRenderContext,
  x_pos: scala.Double,
  y_pos: scala.Double,
  point: scala.Double,
  `val`: java.lang.String,
  nocache: scala.Boolean
): scala.Unit = (typings.vexflow.global.Vex.Flow.^.asInstanceOf[js.Dynamic].applyDynamic("renderGlyph")(ctx.asInstanceOf[js.Any], x_pos.asInstanceOf[js.Any], y_pos.asInstanceOf[js.Any], point.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any], nocache.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def tabToGlyph(fret: java.lang.String): typings.vexflow.anon.Code = typings.vexflow.global.Vex.Flow.^.asInstanceOf[js.Dynamic].applyDynamic("tabToGlyph")(fret.asInstanceOf[js.Any]).asInstanceOf[typings.vexflow.anon.Code]

@scala.inline
def textWidth(text: java.lang.String): scala.Double = typings.vexflow.global.Vex.Flow.^.asInstanceOf[js.Dynamic].applyDynamic("textWidth")(text.asInstanceOf[js.Any]).asInstanceOf[scala.Double]
