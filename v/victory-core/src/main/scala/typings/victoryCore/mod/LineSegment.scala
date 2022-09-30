package typings.victoryCore.mod

import typings.react.mod.ReactElement
import typings.victoryCore.anon.Datum
import typings.victoryCore.anon.LineComponent
import typings.victoryCore.lineSegmentMod.LineSegmentProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LineSegment {
  
  inline def apply(props: LineSegmentProps): ReactElement = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  @JSImport("victory-core/lib", "LineSegment")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("victory-core/lib", "LineSegment.defaultProps")
  @js.native
  def defaultProps: LineComponent = js.native
  inline def defaultProps_=(x: LineComponent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("victory-core/lib", "LineSegment.propTypes")
  @js.native
  def propTypes: Datum = js.native
  inline def propTypes_=(x: Datum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
