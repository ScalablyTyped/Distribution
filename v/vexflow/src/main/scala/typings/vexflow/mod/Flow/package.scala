package typings.vexflow.mod.Flow

import typings.vexflow.Vex.IRenderContext
import typings.vexflow.anon.Betweenlines
import typings.vexflow.anon.Code
import typings.vexflow.anon.Codehead
import typings.vexflow.anon.Dots
import typings.vexflow.anon.Duration
import typings.vexflow.anon.Gracenotewidth
import typings.vexflow.anon.Line
import typings.vexflow.anon.Lineshift
import typings.vexflow.anon.Octaveshift
import typings.vexflow.anon.Shiftdown
import typings.vexflow.mod.Flow.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


//inconsistent API: this should be private and have a wrapper function like the other tables
inline def DEFAULT_NOTATION_FONT_SCALE: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("DEFAULT_NOTATION_FONT_SCALE").asInstanceOf[Double]

inline def RESOLUTION: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("RESOLUTION").asInstanceOf[Double]

inline def STAVE_LINE_THICKNESS: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("STAVE_LINE_THICKNESS").asInstanceOf[Double]

inline def STEM_HEIGHT: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("STEM_HEIGHT").asInstanceOf[Double]

// from tables.js:
inline def STEM_WIDTH: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("STEM_WIDTH").asInstanceOf[Double]

inline def accidentalCodes(acc: String): Gracenotewidth = ^.asInstanceOf[js.Dynamic].applyDynamic("accidentalCodes")(acc.asInstanceOf[js.Any]).asInstanceOf[Gracenotewidth]

inline def articulationCodes(artic: String): Betweenlines = ^.asInstanceOf[js.Dynamic].applyDynamic("articulationCodes")(artic.asInstanceOf[js.Any]).asInstanceOf[Betweenlines]

inline def clefProperties(clef: String): Lineshift = ^.asInstanceOf[js.Dynamic].applyDynamic("clefProperties")(clef.asInstanceOf[js.Any]).asInstanceOf[Lineshift]

inline def durationToFraction(duration: String): typings.vexflow.Vex.Flow.Fraction = ^.asInstanceOf[js.Dynamic].applyDynamic("durationToFraction")(duration.asInstanceOf[js.Any]).asInstanceOf[typings.vexflow.Vex.Flow.Fraction]

inline def durationToGlyph(duration: String, `type`: String): Codehead = (^.asInstanceOf[js.Dynamic].applyDynamic("durationToGlyph")(duration.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Codehead]

inline def durationToNumber(duration: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("durationToNumber")(duration.asInstanceOf[js.Any]).asInstanceOf[Double]

inline def durationToTicks(duration: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("durationToTicks")(duration.asInstanceOf[js.Any]).asInstanceOf[Double]

inline def integerToNote(integer: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("integerToNote")(integer.asInstanceOf[js.Any]).asInstanceOf[String]

inline def keyProperties(key: String, clef: String, params: Octaveshift): typings.vexflow.anon.Accidental = (^.asInstanceOf[js.Dynamic].applyDynamic("keyProperties")(key.asInstanceOf[js.Any], clef.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[typings.vexflow.anon.Accidental]

inline def keySignature(spec: String): js.Array[Line] = ^.asInstanceOf[js.Dynamic].applyDynamic("keySignature")(spec.asInstanceOf[js.Any]).asInstanceOf[js.Array[Line]]

inline def ornamentCodes(acc: String): Shiftdown = ^.asInstanceOf[js.Dynamic].applyDynamic("ornamentCodes")(acc.asInstanceOf[js.Any]).asInstanceOf[Shiftdown]

inline def parseNoteData(noteData: Dots): Duration = ^.asInstanceOf[js.Dynamic].applyDynamic("parseNoteData")(noteData.asInstanceOf[js.Any]).asInstanceOf[Duration]

inline def parseNoteDurationString(durationString: String): Dots = ^.asInstanceOf[js.Dynamic].applyDynamic("parseNoteDurationString")(durationString.asInstanceOf[js.Any]).asInstanceOf[Dots]

// from glyph.js:
inline def renderGlyph(ctx: IRenderContext, x_pos: Double, y_pos: Double, point: Double, `val`: String, nocache: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderGlyph")(ctx.asInstanceOf[js.Any], x_pos.asInstanceOf[js.Any], y_pos.asInstanceOf[js.Any], point.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any], nocache.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def tabToGlyph(fret: String): Code = ^.asInstanceOf[js.Dynamic].applyDynamic("tabToGlyph")(fret.asInstanceOf[js.Any]).asInstanceOf[Code]

inline def textWidth(text: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("textWidth")(text.asInstanceOf[js.Any]).asInstanceOf[Double]
