package typings.victoryCore.mod

import typings.react.mod.ReactElement
import typings.victoryCore.anon.DisableInlineStyles
import typings.victoryCore.anon.ShapeRendering
import typings.victoryCore.whiskerMod.WhiskerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Whisker {
  
  inline def apply(props: WhiskerProps): ReactElement = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  @JSImport("victory-core/lib", "Whisker")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("victory-core/lib", "Whisker.defaultProps")
  @js.native
  def defaultProps: ShapeRendering = js.native
  inline def defaultProps_=(x: ShapeRendering): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("victory-core/lib", "Whisker.propTypes")
  @js.native
  def propTypes: DisableInlineStyles = js.native
  inline def propTypes_=(x: DisableInlineStyles): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
