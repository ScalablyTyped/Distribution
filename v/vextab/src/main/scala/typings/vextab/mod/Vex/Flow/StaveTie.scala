package typings.vextab.mod.Vex.Flow

import typings.vexflow.anon.Lastindices
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vextab", "Vex.Flow.StaveTie")
@js.native
open class StaveTie protected ()
  extends typings.vexflow.mod.Flow.StaveTie {
  /**
    * @see https://github.com/0xfe/vexflow/blob/master/src/stavetie.js#L12
    *
    * Notes is a struct that has:
    *
    *  {
    *    first_note: Note,
    *    last_note: Note,
    *    first_indices: [n1, n2, n3],
    *    last_indices: [n1, n2, n3]
    *  }
    * All properties are optional, since ties can span line breaks in which case
    * two ties can be used, each with either "first_note" or "last_note" missing.
    *
    **/
  def this(notes: Lastindices) = this()
  def this(notes: Lastindices, text: String) = this()
}
