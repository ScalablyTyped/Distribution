package typings.sugar.sugarjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SugarNamespace extends StObject {
  
  def alias(toName: java.lang.String, fn: js.UndefOr[scala.Nothing]): this.type = js.native
  def alias(toName: java.lang.String, from: java.lang.String): this.type = js.native
  def alias(toName: java.lang.String, from: typings.sugar.Function): this.type = js.native
  
  def defineInstance(methodName: java.lang.String, methodFn: typings.sugar.Function): this.type = js.native
  def defineInstance(methods: js.Object): this.type = js.native
  
  def defineInstanceAndStatic(methodName: java.lang.String, methodFn: typings.sugar.Function): this.type = js.native
  def defineInstanceAndStatic(methods: js.Object): this.type = js.native
  
  def defineInstancePolyfill(methodName: java.lang.String, methodFn: typings.sugar.Function): this.type = js.native
  def defineInstancePolyfill(methods: js.Object): this.type = js.native
  
  def defineInstanceWithArguments(methodName: java.lang.String, methodFn: typings.sugar.Function): this.type = js.native
  def defineInstanceWithArguments(methods: js.Object): this.type = js.native
  
  def defineStatic(methodName: java.lang.String, methodFn: typings.sugar.Function): this.type = js.native
  def defineStatic(methods: js.Object): this.type = js.native
  
  def defineStaticPolyfill(methodName: java.lang.String, methodFn: typings.sugar.Function): this.type = js.native
  def defineStaticPolyfill(methods: js.Object): this.type = js.native
  
  def defineStaticWithArguments(methodName: java.lang.String, methodFn: typings.sugar.Function): this.type = js.native
  def defineStaticWithArguments(methods: js.Object): this.type = js.native
  
  def extend(): this.type = js.native
  def extend(opts: ExtendOptions): this.type = js.native
}
