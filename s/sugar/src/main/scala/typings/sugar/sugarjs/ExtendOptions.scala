package typings.sugar.sugarjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtendOptions extends js.Object {
  var enhance: js.UndefOr[Boolean] = js.native
  var enhanceArray: js.UndefOr[Boolean] = js.native
  var enhanceString: js.UndefOr[Boolean] = js.native
  var except: js.UndefOr[typings.sugar.Array[java.lang.String | NativeConstructor]] = js.native
  var methods: js.UndefOr[typings.sugar.Array[java.lang.String]] = js.native
  var namespaces: js.UndefOr[typings.sugar.Array[NativeConstructor]] = js.native
  var objectPrototype: js.UndefOr[Boolean] = js.native
}

object ExtendOptions {
  @scala.inline
  def apply(): ExtendOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtendOptions]
  }
  @scala.inline
  implicit class ExtendOptionsOps[Self <: ExtendOptions] (val x: Self) extends AnyVal {
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
    def setEnhance(value: Boolean): Self = this.set("enhance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnhance: Self = this.set("enhance", js.undefined)
    @scala.inline
    def setEnhanceArray(value: Boolean): Self = this.set("enhanceArray", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnhanceArray: Self = this.set("enhanceArray", js.undefined)
    @scala.inline
    def setEnhanceString(value: Boolean): Self = this.set("enhanceString", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnhanceString: Self = this.set("enhanceString", js.undefined)
    @scala.inline
    def setExcept(value: typings.sugar.Array[java.lang.String | NativeConstructor]): Self = this.set("except", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcept: Self = this.set("except", js.undefined)
    @scala.inline
    def setMethods(value: typings.sugar.Array[java.lang.String]): Self = this.set("methods", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethods: Self = this.set("methods", js.undefined)
    @scala.inline
    def setNamespaces(value: typings.sugar.Array[NativeConstructor]): Self = this.set("namespaces", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamespaces: Self = this.set("namespaces", js.undefined)
    @scala.inline
    def setObjectPrototype(value: Boolean): Self = this.set("objectPrototype", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectPrototype: Self = this.set("objectPrototype", js.undefined)
  }
  
}

