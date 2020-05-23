package typings.uiBox

import typings.react.mod.ComponentPropsWithoutRef
import typings.react.mod.ElementType
import typings.react.mod.ReactElement
import typings.react.mod.WeakValidationMap
import typings.std.Exclude
import typings.std.Partial
import typings.std.Pick
import typings.uiBox.anon.InnerRef
import typings.uiBox.typesEnhancersMod.EnhancerProps
import typings.uiBox.uiBoxStrings.innerRef
import typings.uiBox.uiBoxStrings.is
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ui-box/dist/types/box-types", JSImport.Namespace)
@js.native
object boxTypesMod extends js.Object {
  @js.native
  trait BoxComponent extends js.Object {
    var defaultProps: js.UndefOr[Partial[js.Object]] = js.native
    var displayName: js.UndefOr[String] = js.native
    var propTypes: js.UndefOr[WeakValidationMap[js.Object]] = js.native
    def apply[T /* <: Is[_] */](props: BoxProps[T]): ReactElement | Null = js.native
  }
  
  type BoxProps[T /* <: Is[_] */] = InheritedProps[T] with EnhancerProps with InnerRef[T]
  /**
    * Grab components passed to the `is` prop and return their props
    * @template T Component type
    */
  type InheritedProps[T /* <: Is[_] */] = WithoutBoxProps[ComponentPropsWithoutRef[T]]
  type Is[P] = ElementType[P]
  type RefType[T] = /* import warning: importer.ImportType#apply Failed type conversion: T['prototype'] */ js.Any
  type Without[T, K] = Pick[T, Exclude[/* keyof T */ String, K]]
  /**
    * Remove box props from object `T` if they're present
    * @template T Object
    */
  type WithoutBoxProps[T] = Without[T, is | innerRef]
}

