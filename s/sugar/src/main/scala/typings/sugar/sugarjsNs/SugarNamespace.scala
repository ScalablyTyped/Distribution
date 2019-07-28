package typings.sugar.sugarjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SugarNamespace extends js.Object {
  def alias(toName: String): this.type = js.native
  def alias(toName: String, from: String): this.type = js.native
  def alias(toName: String, from: js.Function): this.type = js.native
  def defineInstance(methodName: String, methodFn: js.Function): this.type = js.native
  def defineInstance(methods: js.Object): this.type = js.native
  def defineInstanceAndStatic(methodName: String, methodFn: js.Function): this.type = js.native
  def defineInstanceAndStatic(methods: js.Object): this.type = js.native
  def defineInstancePolyfill(methodName: String, methodFn: js.Function): this.type = js.native
  def defineInstancePolyfill(methods: js.Object): this.type = js.native
  def defineInstanceWithArguments(methodName: String, methodFn: js.Function): this.type = js.native
  def defineInstanceWithArguments(methods: js.Object): this.type = js.native
  def defineStatic(methodName: String, methodFn: js.Function): this.type = js.native
  def defineStatic(methods: js.Object): this.type = js.native
  def defineStaticPolyfill(methodName: String, methodFn: js.Function): this.type = js.native
  def defineStaticPolyfill(methods: js.Object): this.type = js.native
  def defineStaticWithArguments(methodName: String, methodFn: js.Function): this.type = js.native
  def defineStaticWithArguments(methods: js.Object): this.type = js.native
  def extend(): this.type = js.native
  def extend(opts: ExtendOptions): this.type = js.native
}

