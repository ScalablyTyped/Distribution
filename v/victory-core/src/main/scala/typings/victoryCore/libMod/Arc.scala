package typings.victoryCore.libMod

import typings.react.mod.ReactElement
import typings.victoryCore.anon.Active
import typings.victoryCore.anon.PathComponent
import typings.victoryCore.libVictoryPrimitivesArcMod.ArcProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Arc {
  
  inline def apply(props: ArcProps): ReactElement = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  @JSImport("victory-core/lib", "Arc")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("victory-core/lib", "Arc.defaultProps")
  @js.native
  def defaultProps: PathComponent = js.native
  inline def defaultProps_=(x: PathComponent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("victory-core/lib", "Arc.propTypes")
  @js.native
  def propTypes: Active = js.native
  inline def propTypes_=(x: Active): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
