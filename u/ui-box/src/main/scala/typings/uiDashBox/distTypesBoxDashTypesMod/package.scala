package typings.uiDashBox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distTypesBoxDashTypesMod {
  import typings.react.reactMod.ComponentProps
  import typings.react.reactMod.ElementType
  import typings.std.Exclude
  import typings.std.Pick
  import typings.uiDashBox.Anon_InnerRef
  import typings.uiDashBox.distTypesEnhancersMod.EnhancerProps
  import typings.uiDashBox.uiDashBoxStrings.innerRef
  import typings.uiDashBox.uiDashBoxStrings.is

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
