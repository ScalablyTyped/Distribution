package typings.sugarCore.sugarjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtendOptions extends js.Object {
  var enhance: js.UndefOr[Boolean] = js.undefined
  var enhanceArray: js.UndefOr[Boolean] = js.undefined
  var enhanceString: js.UndefOr[Boolean] = js.undefined
  var except: js.UndefOr[js.Array[java.lang.String | NativeConstructor]] = js.undefined
  var methods: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var namespaces: js.UndefOr[js.Array[NativeConstructor]] = js.undefined
  var objectPrototype: js.UndefOr[Boolean] = js.undefined
}

object ExtendOptions {
  @scala.inline
  def apply(
    enhance: js.UndefOr[Boolean] = js.undefined,
    enhanceArray: js.UndefOr[Boolean] = js.undefined,
    enhanceString: js.UndefOr[Boolean] = js.undefined,
    except: js.Array[java.lang.String | NativeConstructor] = null,
    methods: js.Array[java.lang.String] = null,
    namespaces: js.Array[NativeConstructor] = null,
    objectPrototype: js.UndefOr[Boolean] = js.undefined
  ): ExtendOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enhance)) __obj.updateDynamic("enhance")(enhance.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enhanceArray)) __obj.updateDynamic("enhanceArray")(enhanceArray.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enhanceString)) __obj.updateDynamic("enhanceString")(enhanceString.get.asInstanceOf[js.Any])
    if (except != null) __obj.updateDynamic("except")(except.asInstanceOf[js.Any])
    if (methods != null) __obj.updateDynamic("methods")(methods.asInstanceOf[js.Any])
    if (namespaces != null) __obj.updateDynamic("namespaces")(namespaces.asInstanceOf[js.Any])
    if (!js.isUndefined(objectPrototype)) __obj.updateDynamic("objectPrototype")(objectPrototype.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendOptions]
  }
}

