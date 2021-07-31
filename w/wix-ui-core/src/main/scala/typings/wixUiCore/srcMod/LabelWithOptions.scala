package typings.wixUiCore.srcMod

import typings.wixUiCore.anon.InitialSelectedIds
import typings.wixUiCore.anon.PartialOption
import typings.wixUiCore.labelWithOptionsLabelWithOptionsMod.LabelWithOptionsProps
import typings.wixUiCore.optionFactoryMod.Option
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wix-ui-core/dist/src", "LabelWithOptions")
@js.native
class LabelWithOptions protected ()
  extends typings.wixUiCore.labelWithOptionsMod.LabelWithOptions {
  def this(props: LabelWithOptionsProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: LabelWithOptionsProps, context: js.Any) = this()
}
/* static members */
object LabelWithOptions {
  
  @JSImport("wix-ui-core/dist/src", "LabelWithOptions")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def createDivider(): Option = ^.asInstanceOf[js.Dynamic].applyDynamic("createDivider")().asInstanceOf[Option]
  @scala.inline
  def createDivider(value: js.Any): Option = ^.asInstanceOf[js.Dynamic].applyDynamic("createDivider")(value.asInstanceOf[js.Any]).asInstanceOf[Option]
  
  @scala.inline
  def createOption(): Option = ^.asInstanceOf[js.Dynamic].applyDynamic("createOption")().asInstanceOf[Option]
  @scala.inline
  def createOption(option: PartialOption): Option = ^.asInstanceOf[js.Dynamic].applyDynamic("createOption")(option.asInstanceOf[js.Any]).asInstanceOf[Option]
  
  @JSImport("wix-ui-core/dist/src", "LabelWithOptions.defaultProps")
  @js.native
  def defaultProps: InitialSelectedIds = js.native
  @scala.inline
  def defaultProps_=(x: InitialSelectedIds): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-ui-core/dist/src", "LabelWithOptions.displayName")
  @js.native
  def displayName: String = js.native
  @scala.inline
  def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
}
