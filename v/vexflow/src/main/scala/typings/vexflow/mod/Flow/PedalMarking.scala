package typings.vexflow.mod.Flow

import org.scalablytyped.runtime.StringDictionary
import typings.vexflow.AnonCodeXshift
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vexflow", "Flow.PedalMarking")
@js.native
class PedalMarking protected ()
  extends typings.vexflow.Vex.Flow.PedalMarking {
  def this(notes: js.Array[typings.vexflow.Vex.Flow.Note]) = this()
}

/* static members */
@JSImport("vexflow", "Flow.PedalMarking")
@js.native
object PedalMarking extends js.Object {
   //inconsistent name: 'notes' is called 'type', suggesting string (is Note[])
  var DEBUG: Boolean = js.native
  def createSostenuto(notes: js.Array[typings.vexflow.Vex.Flow.Note]): typings.vexflow.Vex.Flow.PedalMarking = js.native
  def createSustain(notes: js.Array[typings.vexflow.Vex.Flow.Note]): typings.vexflow.Vex.Flow.PedalMarking = js.native
  def createUnaCorda(notes: js.Array[typings.vexflow.Vex.Flow.Note]): typings.vexflow.Vex.Flow.PedalMarking = js.native
  @js.native
  object GLYPHS extends /* name */ StringDictionary[AnonCodeXshift]
  
}

