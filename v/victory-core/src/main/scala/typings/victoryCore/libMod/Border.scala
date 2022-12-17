package typings.victoryCore.libMod

import typings.react.mod.ReactElement
import typings.victoryCore.anon.Role
import typings.victoryCore.libVictoryPrimitivesBorderMod.BorderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Border {
  
  inline def apply(props: BorderProps): ReactElement = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  @JSImport("victory-core/lib", "Border")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("victory-core/lib", "Border.defaultProps")
  @js.native
  def defaultProps: Role = js.native
  inline def defaultProps_=(x: Role): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("victory-core/lib", "Border.propTypes")
  @js.native
  def propTypes: typings.victoryCore.anon.ClipPath = js.native
  inline def propTypes_=(x: typings.victoryCore.anon.ClipPath): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
