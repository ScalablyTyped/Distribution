package typings
package styledDashComponentsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined styled-components.styled-components.ThemedStyledProps<{}, T> */
trait ThemedStyledPropsT[T /* <: js.Object */] extends js.Object {
  var theme: T
}

object ThemedStyledPropsT {
  @scala.inline
  def apply[T /* <: js.Object */](theme: T): ThemedStyledPropsT[T] = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ThemedStyledPropsT[T]]
  }
}

