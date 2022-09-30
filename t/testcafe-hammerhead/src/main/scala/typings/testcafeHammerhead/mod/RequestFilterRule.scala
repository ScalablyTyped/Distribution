package typings.testcafeHammerhead.mod

import typings.testcafeHammerhead.RequestFilterRuleOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("testcafe-hammerhead", "RequestFilterRule")
@js.native
open class RequestFilterRule protected () extends StObject {
  /** Creates a request filter rule instance **/
  def this(options: RequestFilterRuleInit) = this()
  
  /** Unique identifier of the RequestFilterRule instance **/
  var id: String = js.native
  
  /** Indicates that request filter rule defines as a function **/
  var isPredicate: Boolean = js.native
  
  /** Prepared request filter rule options **/
  def options(requestInfo: RequestInfo): js.Promise[Boolean] | RequestFilterRuleOptions = js.native
}
/* static members */
object RequestFilterRule {
  
  @JSImport("testcafe-hammerhead", "RequestFilterRule")
  @js.native
  val ^ : js.Any = js.native
  
  /** Returns the value that accepts any request  **/
  @JSImport("testcafe-hammerhead", "RequestFilterRule.ANY")
  @js.native
  def ANY: RequestFilterRule = js.native
  inline def ANY_=(x: RequestFilterRule): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ANY")(x.asInstanceOf[js.Any])
  
  /** Creates a RequestFilterRule instance from the RequestFilterRule initializer **/
  inline def from(): RequestFilterRule = ^.asInstanceOf[js.Dynamic].applyDynamic("from")().asInstanceOf[RequestFilterRule]
  inline def from(rule: RequestFilterRuleInit): RequestFilterRule = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(rule.asInstanceOf[js.Any]).asInstanceOf[RequestFilterRule]
  
  /** Creates RequestFilterRule instances from RequestFilterRule initializers **/
  inline def fromArray(): js.Array[RequestFilterRule] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")().asInstanceOf[js.Array[RequestFilterRule]]
  inline def fromArray(rules: js.Array[RequestFilterRuleInit]): js.Array[RequestFilterRule] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(rules.asInstanceOf[js.Any]).asInstanceOf[js.Array[RequestFilterRule]]
  inline def fromArray(rules: RequestFilterRuleInit): js.Array[RequestFilterRule] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(rules.asInstanceOf[js.Any]).asInstanceOf[js.Array[RequestFilterRule]]
  
  /** Check whether the specified RequestFilterRule instance accepts any request **/
  inline def isANY(instance: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isANY")(instance.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
