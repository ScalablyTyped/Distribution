package typings.vexflow.VexNs.FlowNs

import org.scalablytyped.runtime.StringDictionary
import typings.vexflow.Anon_AccidentalNoteNumber
import typings.vexflow.Anon_Intval
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.Music")
@js.native
object MusicNs extends js.Object {
  val NUM_TONES: Double = js.native
  val accidentals: js.Array[String] = js.native
  val canonical_notes: js.Array[String] = js.native
  val diatonic_intervals: js.Array[String] = js.native
  val root_values: js.Array[Double] = js.native
  val roots: js.Array[String] = js.native
  @js.native
  object diatonic_accidentals extends /* diatonic_interval */ StringDictionary[Anon_AccidentalNoteNumber]
  
  @js.native
  object intervals extends /* interval */ StringDictionary[Double]
  
  @js.native
  object noteValues extends /* value */ StringDictionary[Anon_Intval]
  
  @js.native
  object root_indices extends /* root */ StringDictionary[Double]
  
  @js.native
  object scales
    extends /* scale */ StringDictionary[js.Array[Double]]
  
}

