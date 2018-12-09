package typings
package wepyLib.componentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait component extends js.Object {
  @JSName("$isComponent")
  var $isComponent: scala.Boolean = js.native
  @JSName("$prefix")
  var $prefix: java.lang.String = js.native
  var computed: js.UndefOr[
    ScalablyTyped.runtime.StringDictionary[js.Function1[/* self */ js.UndefOr[component], _]]
  ] = js.native
  var data: ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
  var methods: js.UndefOr[
    ScalablyTyped.runtime.StringDictionary[js.Function1[/* evt */ js.UndefOr[wepyLib.eventMod.default], _]]
  ] = js.native
  @JSName("$apply")
  def $apply(fn: js.Function0[scala.Unit]): scala.Unit = js.native
  @JSName("$getComponent")
  def $getComponent(com: js.Any): js.Any = js.native
  @JSName("$init")
  def $init($wxpage: js.Any, $root: js.Any, $parent: js.Any): scala.Unit = js.native
  @JSName("$initMixins")
  def $initMixins(): scala.Unit = js.native
  @JSName("$nextTick")
  def $nextTick(fn: js.Function0[scala.Unit]): scala.Unit = js.native
  @JSName("$setIndex")
  def $setIndex(index: scala.Double): scala.Unit = js.native
  def getWxPage(): js.Any = js.native
  def onLoad(): scala.Unit = js.native
  def setData(k: java.lang.String, v: js.Any): scala.Unit = js.native
  def setData(k: js.Array[java.lang.String], v: js.Any): scala.Unit = js.native
}

