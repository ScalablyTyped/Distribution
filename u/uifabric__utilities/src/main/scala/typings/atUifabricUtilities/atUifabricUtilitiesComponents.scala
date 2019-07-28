package typings.atUifabricUtilities

import typings.atUifabricUtilities.libBaseComponentDotTypesMod.IBaseProps
import typings.atUifabricUtilities.libCustomizationsCustomizerDotTypesMod.ICustomizerProps
import typings.atUifabricUtilities.libDelayedRenderMod.IDelayedRenderProps
import typings.react.reactMod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object atUifabricUtilitiesComponents extends atUifabricUtilitiesProps {
  @scala.inline
  def BaseComponent[TProps /* <: IBaseProps[_] */, TState]: ComponentType[TProps] = js.constructorOf[typings.atUifabricUtilities.libBaseComponentMod.BaseComponent[TProps, TState]].asInstanceOf[typings.react.reactMod.ComponentType[TProps]]
  @scala.inline
  def Customizer: ComponentType[ICustomizerProps] = js.constructorOf[typings.atUifabricUtilities.atUifabricUtilitiesMod.Customizer].asInstanceOf[typings.react.reactMod.ComponentType[
  typings.atUifabricUtilities.libCustomizationsCustomizerDotTypesMod.ICustomizerProps]]
  @scala.inline
  def DelayedRender: ComponentType[IDelayedRenderProps] = js.constructorOf[typings.atUifabricUtilities.libDelayedRenderMod.DelayedRender].asInstanceOf[typings.react.reactMod.ComponentType[typings.atUifabricUtilities.libDelayedRenderMod.IDelayedRenderProps]]
}

