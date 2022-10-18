package typings.victoryCore.libMod

import typings.react.mod.ReactElement
import typings.victoryCore.anon.ClassName
import typings.victoryCore.anon.RectComponent
import typings.victoryCore.libVictoryPrimitivesBorderMod.BorderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Box {
  
  inline def apply(props: BorderProps): ReactElement = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  @JSImport("victory-core/lib", "Box")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("victory-core/lib", "Box.defaultProps")
  @js.native
  def defaultProps: RectComponent = js.native
  inline def defaultProps_=(x: RectComponent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("victory-core/lib", "Box.propTypes")
  @js.native
  def propTypes: ClassName = js.native
  inline def propTypes_=(x: ClassName): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
