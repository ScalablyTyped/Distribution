package typings.uiDashBox

import typings.react.reactMod.ComponentProps
import typings.react.reactMod.ElementType
import typings.react.reactMod.ReactElement
import typings.react.reactMod.WeakValidationMap
import typings.std.Exclude
import typings.std.Partial
import typings.std.Pick
import typings.uiDashBox.distTypesBoxDashTypesMod.BoxProps
import typings.uiDashBox.distTypesBoxDashTypesMod.InheritedProps
import typings.uiDashBox.distTypesBoxDashTypesMod.Is
import typings.uiDashBox.distTypesBoxDashTypesMod.Without
import typings.uiDashBox.distTypesBoxDashTypesMod.WithoutBoxProps
import typings.uiDashBox.distTypesEnhancersMod.EnhancerProps
import typings.uiDashBox.uiDashBoxStrings.innerRef
import typings.uiDashBox.uiDashBoxStrings.is
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ui-box/dist/types/box-types", JSImport.Namespace)
@js.native
object distTypesBoxDashTypesMod extends js.Object {
  @js.native
  trait BoxComponent extends js.Object {
    var defaultProps: js.UndefOr[Partial[js.Object]] = js.native
    var displayName: js.UndefOr[String] = js.native
    var propTypes: js.UndefOr[WeakValidationMap[js.Object]] = js.native
    def apply[T /* <: Is[_] */](props: BoxProps[T]): ReactElement | Null = js.native
  }
  
  type BoxProps[T /* <: Is[_] */] = InheritedProps[T] with EnhancerProps with Anon_InnerRef[T]
  /**
    * Grab components passed to the `is` prop and return their props
    * @template T Component type
    */
  type InheritedProps[T /* <: Is[_] */] = WithoutBoxProps[ComponentProps[T]]
  type Is[P] = ElementType[P]
  type Without[T, K] = Pick[T, Exclude[String, K]]
  /**
    * Remove box props from object `T` if they're present
    * @template T Object
    */
  type WithoutBoxProps[T] = Without[T, is | innerRef]
}

