package typings.atXstyledSystem.atXstyledSystemMod

import typings.atXstyledSystem.TypeofReact
import typings.react.reactMod.ComponentType
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@xstyled/system", "createSystemComponent")
@js.native
object createSystemComponent extends js.Object {
  def apply[T](react: TypeofReact): // tslint:disable-next-line no-unnecessary-generics
  ComponentType[T] = js.native
  def apply[T](react: TypeofReact, defaultComponent: String): // tslint:disable-next-line no-unnecessary-generics
  ComponentType[T] = js.native
  def apply[T](react: TypeofReact, defaultComponent: String, system: StyleFunc): // tslint:disable-next-line no-unnecessary-generics
  ComponentType[T] = js.native
  def apply[T](react: TypeofReact, defaultComponent: ReactNode): // tslint:disable-next-line no-unnecessary-generics
  ComponentType[T] = js.native
  def apply[T](react: TypeofReact, defaultComponent: ReactNode, system: StyleFunc): // tslint:disable-next-line no-unnecessary-generics
  ComponentType[T] = js.native
}

