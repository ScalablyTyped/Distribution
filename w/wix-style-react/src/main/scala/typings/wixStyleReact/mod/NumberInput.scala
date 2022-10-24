package typings.wixStyleReact.mod

import typings.react.mod.ReactElement
import typings.wixStyleReact.anon.DefaultValue
import typings.wixStyleReact.anon.HideStepper
import typings.wixStyleReact.distTypesNumberInputNumberInputDottypesMod.NumberInputProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NumberInput {
  
  inline def apply(param0: NumberInputProps): ReactElement = ^.asInstanceOf[js.Dynamic].apply(param0.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  @JSImport("wix-style-react", "NumberInput")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("wix-style-react", "NumberInput.defaultProps")
  @js.native
  def defaultProps: HideStepper = js.native
  inline def defaultProps_=(x: HideStepper): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-style-react", "NumberInput.displayName")
  @js.native
  def displayName: String = js.native
  inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-style-react", "NumberInput.propTypes")
  @js.native
  def propTypes: DefaultValue = js.native
  inline def propTypes_=(x: DefaultValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
