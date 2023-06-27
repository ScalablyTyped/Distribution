package typings.vextab.mod.Vex.Flow

import typings.vexflow.anon.Leftshift
import typings.vexflow.anon.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vextab", "Vex.Flow.Bend")
@js.native
open class Bend protected ()
  extends typings.vexflow.mod.Flow.Bend {
  def this(text: String) = this()
  def this(text: String, release: Boolean) = this()
  def this(text: String, release: Boolean, phrase: js.Array[Text]) = this()
  def this(text: String, release: Unit, phrase: js.Array[Text]) = this()
}
object Bend {
  
  @JSImport("vextab", "Vex.Flow.Bend")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vextab", "Vex.Flow.Bend.CATEGORY")
  @js.native
  val CATEGORY: String = js.native
  
  /* static member */
  @JSImport("vextab", "Vex.Flow.Bend.DOWN")
  @js.native
  def DOWN: Double = js.native
  inline def DOWN_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DOWN")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("vextab", "Vex.Flow.Bend.UP")
  @js.native
  def UP: Double = js.native
  inline def UP_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UP")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def format(bends: js.Array[typings.vexflow.Vex.Flow.Bend], state: Leftshift): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(bends.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
