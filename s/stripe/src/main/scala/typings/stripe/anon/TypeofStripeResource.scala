package typings.stripe.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typings.stripe.mod.Stripe.Response
import typings.stripe.mod.Stripe.StripeResource
import typings.stripe.mod.Stripe.StripeResourceExtension
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofStripeResource
  extends StObject
     with Instantiable0[StripeResource] {
  
  //eslint-disable-line @typescript-eslint/no-explicit-any
  var MAX_BUFFERED_REQUEST_METRICS: Double = js.native
  
  def extend[// eslint-disable-next-line @typescript-eslint/no-explicit-any
  T /* <: StringDictionary[Any] */](spec: T): StripeResourceExtension[T] = js.native
  
  def method[ResponseObject](spec: FullPath): js.Function1[/* repeated */ Any, Response[ResponseObject]] = js.native
}
