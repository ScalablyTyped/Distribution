package typings
package vexflowLib.VexNs.FlowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.Music")
@js.native
object MusicNs extends js.Object {
  val NUM_TONES: scala.Double = js.native
  val accidentals: js.Array[java.lang.String] = js.native
  val canonical_notes: js.Array[java.lang.String] = js.native
  val diatonic_intervals: js.Array[java.lang.String] = js.native
  val root_values: js.Array[scala.Double] = js.native
  val roots: js.Array[java.lang.String] = js.native
  @js.native
  object diatonic_accidentals
    extends /* diatonic_interval */ org.scalablytyped.runtime.StringDictionary[vexflowLib.Anon_AccidentalNoteNumber]
  
  @js.native
  object intervals
    extends /* interval */ org.scalablytyped.runtime.StringDictionary[scala.Double]
  
  @js.native
  object noteValues
    extends /* value */ org.scalablytyped.runtime.StringDictionary[vexflowLib.Anon_Intval]
  
  @js.native
  object root_indices
    extends /* root */ org.scalablytyped.runtime.StringDictionary[scala.Double]
  
  @js.native
  object scales
    extends /* scale */ org.scalablytyped.runtime.StringDictionary[js.Array[scala.Double]]
  
}

