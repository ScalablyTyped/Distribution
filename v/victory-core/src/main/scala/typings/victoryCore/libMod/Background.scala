package typings.victoryCore.libMod

import typings.react.mod.ReactElement
import typings.victoryCore.anon.AriaLabel_
import typings.victoryCore.anon.CircleComponent
import typings.victoryCore.libVictoryPrimitivesBackgroundMod.BackgroundProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Background {
  
  inline def apply(props: BackgroundProps): ReactElement = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  @JSImport("victory-core/lib", "Background")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("victory-core/lib", "Background.defaultProps")
  @js.native
  def defaultProps: CircleComponent = js.native
  inline def defaultProps_=(x: CircleComponent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("victory-core/lib", "Background.propTypes")
  @js.native
  def propTypes: AriaLabel_ = js.native
  inline def propTypes_=(x: AriaLabel_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
