package typings.webicon.sizeableOptionsMod

import typings.webicon.sizeableMod.Sizeable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SizeableOptions extends Sizeable {
  /**
    * An alias of the `iconSize`-property.
    */
  var size: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: this['iconSize'] */ js.Any
  ] = js.native
  /**
    * An alias of the `iconSize`-property.
    */
  var svgIconSize: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: this['iconSize'] */ js.Any
  ] = js.native
}

object SizeableOptions {
  @scala.inline
  def apply(): SizeableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SizeableOptions]
  }
  @scala.inline
  implicit class SizeableOptionsOps[Self <: SizeableOptions] (val x: Self) extends AnyVal {
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
    def setSize(
      value: /* import warning: importer.ImportType#apply Failed type conversion: this['iconSize'] */ js.Any
    ): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setSvgIconSize(
      value: /* import warning: importer.ImportType#apply Failed type conversion: this['iconSize'] */ js.Any
    ): Self = this.set("svgIconSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSvgIconSize: Self = this.set("svgIconSize", js.undefined)
  }
  
}

