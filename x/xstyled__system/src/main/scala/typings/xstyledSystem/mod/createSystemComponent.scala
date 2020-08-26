package typings.xstyledSystem.mod

import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.xstyledSystem.anon.TypeofReact
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@xstyled/system", "createSystemComponent")
@js.native
object createSystemComponent extends js.Object {
  def apply[T](react: TypeofReact): // tslint:disable-next-line no-unnecessary-generics
  ComponentType[T] = js.native
  def apply[T](react: TypeofReact, defaultComponent: js.UndefOr[ReactNode], system: StyleFunc): // tslint:disable-next-line no-unnecessary-generics
  ComponentType[T] = js.native
  def apply[T](react: TypeofReact, defaultComponent: String): // tslint:disable-next-line no-unnecessary-generics
  ComponentType[T] = js.native
  def apply[T](react: TypeofReact, defaultComponent: String, system: StyleFunc): // tslint:disable-next-line no-unnecessary-generics
  ComponentType[T] = js.native
  def apply[T](react: TypeofReact, defaultComponent: ReactNode): // tslint:disable-next-line no-unnecessary-generics
  ComponentType[T] = js.native
}

