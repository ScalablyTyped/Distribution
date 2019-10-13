package typings.atUifabricUtilities

import typings.atUifabricUtilities.libBaseComponentDotTypesMod.IBaseProps
import typings.react.reactMod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object atUifabricUtilitiesComponents extends atUifabricUtilitiesProps {
  @scala.inline
  def BaseComponent[TProps /* <: IBaseProps[_] */, TState]: ComponentType[TProps] = js.constructorOf[typings.atUifabricUtilities.libBaseComponentMod.BaseComponent[TProps, TState]].asInstanceOf[typings.react.reactMod.ComponentType[TProps]]
  @scala.inline
  def Customizer: ComponentType[CustomizerProps] = js.constructorOf[typings.atUifabricUtilities.atUifabricUtilitiesMod.Customizer].asInstanceOf[typings.react.reactMod.ComponentType[CustomizerProps]]
  @scala.inline
  def DelayedRender: ComponentType[DelayedRenderProps] = js.constructorOf[typings.atUifabricUtilities.libDelayedRenderMod.DelayedRender].asInstanceOf[typings.react.reactMod.ComponentType[DelayedRenderProps]]
}

