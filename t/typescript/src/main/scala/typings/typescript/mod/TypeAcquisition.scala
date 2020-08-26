package typings.typescript.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeAcquisition
  extends /* option */ StringDictionary[js.UndefOr[js.Array[java.lang.String] | Boolean]] {
  var enable: js.UndefOr[Boolean] = js.native
  /**
    * @deprecated typingOptions.enableAutoDiscovery
    * Use typeAcquisition.enable instead.
    */
  var enableAutoDiscovery: js.UndefOr[Boolean] = js.native
  var exclude: js.UndefOr[js.Array[java.lang.String]] = js.native
  var include: js.UndefOr[js.Array[java.lang.String]] = js.native
}

object TypeAcquisition {
  @scala.inline
  def apply(): TypeAcquisition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TypeAcquisition]
  }
  @scala.inline
  implicit class TypeAcquisitionOps[Self <: TypeAcquisition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEnable(value: Boolean): Self = this.set("enable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnable: Self = this.set("enable", js.undefined)
    @scala.inline
    def setEnableAutoDiscovery(value: Boolean): Self = this.set("enableAutoDiscovery", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableAutoDiscovery: Self = this.set("enableAutoDiscovery", js.undefined)
    @scala.inline
    def setExcludeVarargs(value: java.lang.String*): Self = this.set("exclude", js.Array(value :_*))
    @scala.inline
    def setExclude(value: js.Array[java.lang.String]): Self = this.set("exclude", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExclude: Self = this.set("exclude", js.undefined)
    @scala.inline
    def setIncludeVarargs(value: java.lang.String*): Self = this.set("include", js.Array(value :_*))
    @scala.inline
    def setInclude(value: js.Array[java.lang.String]): Self = this.set("include", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInclude: Self = this.set("include", js.undefined)
  }
  
}

