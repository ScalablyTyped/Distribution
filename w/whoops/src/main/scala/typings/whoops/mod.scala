package typings.whoops

import typings.std.Error
import typings.std.Record
import typings.whoops.whoopsStrings.EvalError
import typings.whoops.whoopsStrings.RangeError
import typings.whoops.whoopsStrings.ReferenceError
import typings.whoops.whoopsStrings.SyntaxError
import typings.whoops.whoopsStrings.TypeError
import typings.whoops.whoopsStrings.URIError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("whoops", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(): ExtendError[Error, _] = js.native
  def apply(className: js.UndefOr[scala.Nothing], props: Record[String, _]): ExtendError[Error, _] = js.native
  def apply(className: String): ExtendError[Error, _] = js.native
  def apply(className: String, props: Record[String, _]): ExtendError[Error, _] = js.native
  def apply(className: EvalError): ExtendError[typings.std.EvalError, _] = js.native
  def apply(className: EvalError, props: Record[String, _]): ExtendError[typings.std.EvalError, _] = js.native
  def apply(className: RangeError): ExtendError[typings.std.RangeError, _] = js.native
  def apply(className: RangeError, props: Record[String, _]): ExtendError[typings.std.RangeError, _] = js.native
  def apply(className: ReferenceError): ExtendError[typings.std.ReferenceError, _] = js.native
  def apply(className: ReferenceError, props: Record[String, _]): ExtendError[typings.std.ReferenceError, _] = js.native
  def apply(className: SyntaxError): ExtendError[typings.std.SyntaxError, _] = js.native
  def apply(className: SyntaxError, props: Record[String, _]): ExtendError[typings.std.SyntaxError, _] = js.native
  def apply(className: TypeError): ExtendError[typings.std.TypeError, _] = js.native
  def apply(className: TypeError, props: Record[String, _]): ExtendError[typings.std.TypeError, _] = js.native
  def apply(className: URIError): ExtendError[typings.std.URIError, _] = js.native
  def apply(className: URIError, props: Record[String, _]): ExtendError[typings.std.URIError, _] = js.native
  
  def range(): ExtendError[typings.std.RangeError, _] = js.native
  def range(className: js.UndefOr[scala.Nothing], props: Record[String, _]): ExtendError[typings.std.RangeError, _] = js.native
  def range(className: String): ExtendError[typings.std.RangeError, _] = js.native
  def range(className: String, props: Record[String, _]): ExtendError[typings.std.RangeError, _] = js.native
  
  def reference(): ExtendError[typings.std.ReferenceError, _] = js.native
  def reference(className: js.UndefOr[scala.Nothing], props: Record[String, _]): ExtendError[typings.std.ReferenceError, _] = js.native
  def reference(className: String): ExtendError[typings.std.ReferenceError, _] = js.native
  def reference(className: String, props: Record[String, _]): ExtendError[typings.std.ReferenceError, _] = js.native
  
  // function eval(className?: string, props?: Record<string, any>): ExtendError<EvalError>;
  def syntax(): ExtendError[typings.std.SyntaxError, _] = js.native
  def syntax(className: js.UndefOr[scala.Nothing], props: Record[String, _]): ExtendError[typings.std.SyntaxError, _] = js.native
  def syntax(className: String): ExtendError[typings.std.SyntaxError, _] = js.native
  def syntax(className: String, props: Record[String, _]): ExtendError[typings.std.SyntaxError, _] = js.native
  
  def `type`(): ExtendError[typings.std.TypeError, _] = js.native
  def `type`(className: js.UndefOr[scala.Nothing], props: Record[String, _]): ExtendError[typings.std.TypeError, _] = js.native
  def `type`(className: String): ExtendError[typings.std.TypeError, _] = js.native
  def `type`(className: String, props: Record[String, _]): ExtendError[typings.std.TypeError, _] = js.native
  
  def uri(): ExtendError[typings.std.URIError, _] = js.native
  def uri(className: js.UndefOr[scala.Nothing], props: Record[String, _]): ExtendError[typings.std.URIError, _] = js.native
  def uri(className: String): ExtendError[typings.std.URIError, _] = js.native
  def uri(className: String, props: Record[String, _]): ExtendError[typings.std.URIError, _] = js.native
  
  type ExtendError[E /* <: Error */, P /* <: Record[String, _] */] = js.Function1[/* propsOrMessage */ js.UndefOr[P | String], E with P]
}
