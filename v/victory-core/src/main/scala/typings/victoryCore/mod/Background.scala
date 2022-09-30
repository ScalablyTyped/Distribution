package typings.victoryCore.mod

import typings.react.mod.ReactElement
import typings.victoryCore.anon.AriaLabel_
import typings.victoryCore.anon.RectComponent
import typings.victoryCore.backgroundMod.BackgroundProps
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
  def defaultProps: RectComponent = js.native
  inline def defaultProps_=(x: RectComponent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("victory-core/lib", "Background.propTypes")
  @js.native
  def propTypes: AriaLabel_ = js.native
  inline def propTypes_=(x: AriaLabel_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
