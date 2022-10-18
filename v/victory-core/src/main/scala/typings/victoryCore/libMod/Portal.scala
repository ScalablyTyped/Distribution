package typings.victoryCore.libMod

import typings.victoryCore.anon.Height
import typings.victoryCore.libVictoryPortalPortalMod.PortalProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("victory-core/lib", "Portal")
@js.native
open class Portal protected ()
  extends typings.victoryCore.libVictoryPortalPortalMod.Portal {
  def this(props: PortalProps) = this()
}
/* static members */
object Portal {
  
  @JSImport("victory-core/lib", "Portal")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("victory-core/lib", "Portal.displayName")
  @js.native
  def displayName: String = js.native
  inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  
  @JSImport("victory-core/lib", "Portal.propTypes")
  @js.native
  def propTypes: Height = js.native
  inline def propTypes_=(x: Height): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
