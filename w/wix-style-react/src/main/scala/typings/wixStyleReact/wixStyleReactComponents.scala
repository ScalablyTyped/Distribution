package typings.wixStyleReact

import typings.react.mod.ComponentType
import typings.wixStyleReact.baseComponentsMod.WixComponentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object wixStyleReactComponents extends wixStyleReactProps {
  @scala.inline
  def BaseComponents[T /* <: WixComponentProps */]: ComponentType[T] = js.constructorOf[typings.wixStyleReact.baseComponentsMod.default[T]].asInstanceOf[typings.react.mod.ComponentType[T]]
  @scala.inline
  def Button: ComponentType[ButtonProps] = js.constructorOf[typings.wixStyleReact.buttonMod.default].asInstanceOf[typings.react.mod.ComponentType[ButtonProps]]
  @scala.inline
  def Loader: ComponentType[LoaderProps] = js.constructorOf[typings.wixStyleReact.loaderMod.default].asInstanceOf[typings.react.mod.ComponentType[LoaderProps]]
  @scala.inline
  def Text: ComponentType[TextProps] = typings.wixStyleReact.textMod.default.asInstanceOf[typings.react.mod.ComponentType[TextProps]]
  @scala.inline
  def WixComponent[T /* <: WixComponentProps */]: ComponentType[T] = js.constructorOf[typings.wixStyleReact.mod.WixComponent[T]].asInstanceOf[typings.react.mod.ComponentType[T]]
}

