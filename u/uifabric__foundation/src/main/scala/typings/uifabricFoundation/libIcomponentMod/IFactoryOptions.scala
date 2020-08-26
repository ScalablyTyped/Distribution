package typings.uifabricFoundation.libIcomponentMod

import typings.uifabricFoundation.uifabricFoundationStrings.children
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFactoryOptions[TProps] extends js.Object {
  /**
    * Default prop for which to map primitive values.
    */
  var defaultProp: js.UndefOr[(/* keyof TProps */ String) | children] = js.native
}

object IFactoryOptions {
  @scala.inline
  def apply[TProps](): IFactoryOptions[TProps] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFactoryOptions[TProps]]
  }
  @scala.inline
  implicit class IFactoryOptionsOps[Self <: IFactoryOptions[_], TProps] (val x: Self with IFactoryOptions[TProps]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDefaultProp(value: (/* keyof TProps */ String) | children): Self = this.set("defaultProp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultProp: Self = this.set("defaultProp", js.undefined)
  }
  
}

