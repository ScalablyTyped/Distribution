package typings.uifabricUtilities.baseComponentTypesMod

import typings.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBaseProps[T] extends js.Object {
  var componentRef: js.UndefOr[IRefObject[T]] = js.undefined
}

object IBaseProps {
  @scala.inline
  def apply[T](componentRef: IRefObject[T] = null): IBaseProps[T] = {
    val __obj = js.Dynamic.literal()
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBaseProps[T]]
  }
}

