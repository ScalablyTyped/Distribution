package typings.vexflow.global.Vex.Flow

import typings.vexflow.anon.Leftshift
import typings.vexflow.anon.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Vex.Flow.Bend")
@js.native
class Bend protected ()
  extends typings.vexflow.Vex.Flow.Bend {
  def this(text: String) = this()
  def this(text: String, release: Boolean) = this()
  def this(text: String, release: js.UndefOr[scala.Nothing], phrase: js.Array[Text]) = this()
  def this(text: String, release: Boolean, phrase: js.Array[Text]) = this()
}
object Bend {
  
  @JSGlobal("Vex.Flow.Bend")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("Vex.Flow.Bend.CATEGORY")
  @js.native
  val CATEGORY: String = js.native
  
  /* static member */
  @JSGlobal("Vex.Flow.Bend.DOWN")
  @js.native
  def DOWN: Double = js.native
  @scala.inline
  def DOWN_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DOWN")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Vex.Flow.Bend.UP")
  @js.native
  def UP: Double = js.native
  @scala.inline
  def UP_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UP")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Vex.Flow.Bend.format")
  @js.native
  def format(bends: js.Array[typings.vexflow.Vex.Flow.Bend], state: Leftshift): Boolean = js.native
}
