package typings.victoryCore.mod

import typings.victoryCore.anon.Ariadescribedby
import typings.victoryCore.anon.ClassName
import typings.victoryCore.victoryAccessibleGroupMod.VictoryAccessibleGroupProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("victory-core/lib", "VictoryAccessibleGroup")
@js.native
open class VictoryAccessibleGroup protected ()
  extends typings.victoryCore.victoryAccessibleGroupMod.VictoryAccessibleGroup {
  def this(props: VictoryAccessibleGroupProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: VictoryAccessibleGroupProps, context: Any) = this()
}
/* static members */
object VictoryAccessibleGroup {
  
  @JSImport("victory-core/lib", "VictoryAccessibleGroup")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("victory-core/lib", "VictoryAccessibleGroup.defaultProps")
  @js.native
  def defaultProps: ClassName = js.native
  inline def defaultProps_=(x: ClassName): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("victory-core/lib", "VictoryAccessibleGroup.displayName")
  @js.native
  def displayName: String = js.native
  inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  
  @JSImport("victory-core/lib", "VictoryAccessibleGroup.propTypes")
  @js.native
  def propTypes: Ariadescribedby = js.native
  inline def propTypes_=(x: Ariadescribedby): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
