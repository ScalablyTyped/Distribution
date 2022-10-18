package typings.victoryCore.libMod

import typings.react.mod.ReactElement
import typings.victoryCore.anon.PathComponent
import typings.victoryCore.libVictoryPrimitivesPointMod.PointProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Point {
  
  inline def apply(props: PointProps): ReactElement = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  @JSImport("victory-core/lib", "Point")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("victory-core/lib", "Point.defaultProps")
  @js.native
  def defaultProps: PathComponent = js.native
  inline def defaultProps_=(x: PathComponent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("victory-core/lib", "Point.propTypes")
  @js.native
  def propTypes: typings.victoryCore.anon.Data = js.native
  inline def propTypes_=(x: typings.victoryCore.anon.Data): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
