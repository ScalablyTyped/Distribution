package typings.vexflow.mod.Flow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


//inconsistent API: this should be private and have a wrapper function like the other tables
inline def DEFAULT_NOTATION_FONT_SCALE: scala.Double = typings.vexflow.mod.Flow.^.asInstanceOf[js.Dynamic].selectDynamic("DEFAULT_NOTATION_FONT_SCALE").asInstanceOf[scala.Double]

inline def RESOLUTION: scala.Double = typings.vexflow.mod.Flow.^.asInstanceOf[js.Dynamic].selectDynamic("RESOLUTION").asInstanceOf[scala.Double]

inline def STAVE_LINE_THICKNESS: scala.Double = typings.vexflow.mod.Flow.^.asInstanceOf[js.Dynamic].selectDynamic("STAVE_LINE_THICKNESS").asInstanceOf[scala.Double]

inline def STEM_HEIGHT: scala.Double = typings.vexflow.mod.Flow.^.asInstanceOf[js.Dynamic].selectDynamic("STEM_HEIGHT").asInstanceOf[scala.Double]

// from tables.js:
inline def STEM_WIDTH: scala.Double = typings.vexflow.mod.Flow.^.asInstanceOf[js.Dynamic].selectDynamic("STEM_WIDTH").asInstanceOf[scala.Double]

inline def accidentalCodes(acc: java.lang.String): typings.vexflow.anon.Gracenotewidth = typings.vexflow.mod.Flow.^.asInstanceOf[js.Dynamic].applyDynamic("accidentalCodes")(acc.asInstanceOf[js.Any]).asInstanceOf[typings.vexflow.anon.Gracenotewidth]

inline def articulationCodes(artic: java.lang.String): typings.vexflow.anon.Betweenlines = typings.vexflow.mod.Flow.^.asInstanceOf[js.Dynamic].applyDynamic("articulationCodes")(artic.asInstanceOf[js.Any]).asInstanceOf[typings.vexflow.anon.Betweenlines]

inline def clefProperties(clef: java.lang.String): typings.vexflow.anon.Lineshift = typings.vexflow.mod.Flow.^.asInstanceOf[js.Dynamic].applyDynamic("clefProperties")(clef.asInstanceOf[js.Any]).asInstanceOf[typings.vexflow.anon.Lineshift]

inline def durationToFraction(duration: java.lang.String): typings.vexflow.Vex.Flow.Fraction = typings.vexflow.mod.Flow.^.asInstanceOf[js.Dynamic].applyDynamic("durationToFraction")(duration.asInstanceOf[js.Any]).asInstanceOf[typings.vexflow.Vex.Flow.Fraction]

inline def durationToGlyph(duration: java.lang.String, `type`: java.lang.String): typings.vexflow.anon.Codehead = (typings.vexflow.mod.Flow.^.asInstanceOf[js.Dynamic].applyDynamic("durationToGlyph")(duration.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[typings.vexflow.anon.Codehead]

inline def durationToNumber(duration: java.lang.String): scala.Double = typings.vexflow.mod.Flow.^.asInstanceOf[js.Dynamic].applyDynamic("durationToNumber")(duration.asInstanceOf[js.Any]).asInstanceOf[scala.Double]

inline def durationToTicks(duration: java.lang.String): scala.Double = typings.vexflow.mod.Flow.^.asInstanceOf[js.Dynamic].applyDynamic("durationToTicks")(duration.asInstanceOf[js.Any]).asInstanceOf[scala.Double]

inline def integerToNote(integer: scala.Double): java.lang.String = typings.vexflow.mod.Flow.^.asInstanceOf[js.Dynamic].applyDynamic("integerToNote")(integer.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]

inline def keyProperties(key: java.lang.String, clef: java.lang.String, params: typings.vexflow.anon.Octaveshift): typings.vexflow.anon.Accidental = (typings.vexflow.mod.Flow.^.asInstanceOf[js.Dynamic].applyDynamic("keyProperties")(key.asInstanceOf[js.Any], clef.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[typings.vexflow.anon.Accidental]

inline def keySignature(spec: java.lang.String): js.Array[typings.vexflow.anon.Line] = typings.vexflow.mod.Flow.^.asInstanceOf[js.Dynamic].applyDynamic("keySignature")(spec.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.vexflow.anon.Line]]

inline def ornamentCodes(acc: java.lang.String): typings.vexflow.anon.Shiftdown = typings.vexflow.mod.Flow.^.asInstanceOf[js.Dynamic].applyDynamic("ornamentCodes")(acc.asInstanceOf[js.Any]).asInstanceOf[typings.vexflow.anon.Shiftdown]

inline def parseNoteData(noteData: typings.vexflow.anon.Dots): typings.vexflow.anon.Duration = typings.vexflow.mod.Flow.^.asInstanceOf[js.Dynamic].applyDynamic("parseNoteData")(noteData.asInstanceOf[js.Any]).asInstanceOf[typings.vexflow.anon.Duration]

inline def parseNoteDurationString(durationString: java.lang.String): typings.vexflow.anon.Dots = typings.vexflow.mod.Flow.^.asInstanceOf[js.Dynamic].applyDynamic("parseNoteDurationString")(durationString.asInstanceOf[js.Any]).asInstanceOf[typings.vexflow.anon.Dots]

// from glyph.js:
inline def renderGlyph(
  ctx: typings.vexflow.Vex.IRenderContext,
  x_pos: scala.Double,
  y_pos: scala.Double,
  point: scala.Double,
  `val`: java.lang.String,
  nocache: scala.Boolean
): scala.Unit = (typings.vexflow.mod.Flow.^.asInstanceOf[js.Dynamic].applyDynamic("renderGlyph")(ctx.asInstanceOf[js.Any], x_pos.asInstanceOf[js.Any], y_pos.asInstanceOf[js.Any], point.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any], nocache.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

inline def tabToGlyph(fret: java.lang.String): typings.vexflow.anon.Code = typings.vexflow.mod.Flow.^.asInstanceOf[js.Dynamic].applyDynamic("tabToGlyph")(fret.asInstanceOf[js.Any]).asInstanceOf[typings.vexflow.anon.Code]

inline def textWidth(text: java.lang.String): scala.Double = typings.vexflow.mod.Flow.^.asInstanceOf[js.Dynamic].applyDynamic("textWidth")(text.asInstanceOf[js.Any]).asInstanceOf[scala.Double]
