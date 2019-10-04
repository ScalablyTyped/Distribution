package typings.wixDashStyleDashReact

import typings.react.reactMod.ComponentType
import typings.wixDashStyleDashReact.baseComponentsMod.WixComponentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object wixDashStyleDashReactComponents extends wixDashStyleDashReactProps {
  @scala.inline
  def BaseComponents[T /* <: WixComponentProps */]: ComponentType[T] = js.constructorOf[typings.wixDashStyleDashReact.baseComponentsMod.default[T]].asInstanceOf[typings.react.reactMod.ComponentType[T]]
  @scala.inline
  def Button: ComponentType[typings.wixDashStyleDashReact.buttonMod.ButtonProps] = js.constructorOf[typings.wixDashStyleDashReact.buttonMod.default].asInstanceOf[typings.react.reactMod.ComponentType[typings.wixDashStyleDashReact.buttonMod.ButtonProps]]
  @scala.inline
  def Loader: ComponentType[typings.wixDashStyleDashReact.loaderMod.LoaderProps] = js.constructorOf[typings.wixDashStyleDashReact.loaderMod.default].asInstanceOf[typings.react.reactMod.ComponentType[typings.wixDashStyleDashReact.loaderMod.LoaderProps]]
  @scala.inline
  def Text: ComponentType[typings.wixDashStyleDashReact.textMod.TextProps] = typings.wixDashStyleDashReact.textMod.^.default.asInstanceOf[typings.react.reactMod.ComponentType[typings.wixDashStyleDashReact.textMod.TextProps]]
  @scala.inline
  def WixComponent[T /* <: WixComponentProps */]: ComponentType[T] = js.constructorOf[typings.wixDashStyleDashReact.wixDashStyleDashReactMod.WixComponent[T]].asInstanceOf[typings.react.reactMod.ComponentType[T]]
}

