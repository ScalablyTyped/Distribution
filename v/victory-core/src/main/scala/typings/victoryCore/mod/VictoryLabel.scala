package typings.victoryCore.mod

import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import typings.victoryCore.anon.Fill
import typings.victoryCore.anon.PartialVictoryLabelProps
import typings.victoryCore.anon.WeakValidationMapVictoryL
import typings.victoryCore.victoryLabelMod.VictoryLabelProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  role :string,   defaultStyles :{  fill :string,   fontSize :number,   fontFamily :string,   stroke :string}} & react.react.FC<victory-core.victory-core/lib/victory-label/victory-label.VictoryLabelProps> */
object VictoryLabel {
  
  inline def apply(props: VictoryLabelProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
  inline def apply(props: VictoryLabelProps, context: Any): ReactElement | Null = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[ReactElement | Null]
  
  @JSImport("victory-core/lib", "VictoryLabel")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("victory-core/lib", "VictoryLabel.contextTypes")
  @js.native
  def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
  inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
  
  @JSImport("victory-core/lib", "VictoryLabel.defaultProps")
  @js.native
  def defaultProps: js.UndefOr[PartialVictoryLabelProps] = js.native
  inline def defaultProps_=(x: js.UndefOr[PartialVictoryLabelProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("victory-core/lib", "VictoryLabel.defaultStyles")
  @js.native
  def defaultStyles: Fill = js.native
  inline def defaultStyles_=(x: Fill): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultStyles")(x.asInstanceOf[js.Any])
  
  @JSImport("victory-core/lib", "VictoryLabel.displayName")
  @js.native
  def displayName: js.UndefOr[String] = js.native
  inline def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  
  @JSImport("victory-core/lib", "VictoryLabel.propTypes")
  @js.native
  def propTypes: js.UndefOr[WeakValidationMapVictoryL] = js.native
  inline def propTypes_=(x: js.UndefOr[WeakValidationMapVictoryL]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  
  @JSImport("victory-core/lib", "VictoryLabel.role")
  @js.native
  def role: String = js.native
  inline def role_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("role")(x.asInstanceOf[js.Any])
}
