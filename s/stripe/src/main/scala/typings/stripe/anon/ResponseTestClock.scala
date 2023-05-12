package typings.stripe.anon

import typings.stripe.mod.Stripe.TestHelpers.TestClock.Status
import typings.stripe.stripeStrings.test_helpersDottest_clock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined stripe.stripe.Stripe.Response<stripe.stripe.Stripe.TestHelpers.TestClock> */
trait ResponseTestClock extends StObject {
  
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double
  
  var deleted: js.UndefOr[Unit] = js.undefined
  
  /**
    * Time at which this clock is scheduled to auto delete.
    */
  var deletes_after: Double
  
  /**
    * Time at which all objects belonging to this clock are frozen.
    */
  var frozen_time: Double
  
  /**
    * Unique identifier for the object.
    */
  var id: String
  
  var lastResponse: ApiVersion
  
  /**
    * Has the value `true` if the object exists in live mode or the value `false` if the object exists in test mode.
    */
  var livemode: Boolean
  
  /**
    * The custom name supplied at creation.
    */
  var name: String | Null
  
  /**
    * String representing the object's type. Objects of the same type share the same value.
    */
  var `object`: test_helpersDottest_clock
  
  /**
    * The status of the Test Clock.
    */
  var status: Status
}
object ResponseTestClock {
  
  inline def apply(
    created: Double,
    deletes_after: Double,
    frozen_time: Double,
    id: String,
    lastResponse: ApiVersion,
    livemode: Boolean,
    status: Status
  ): ResponseTestClock = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], deletes_after = deletes_after.asInstanceOf[js.Any], frozen_time = frozen_time.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastResponse = lastResponse.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], name = null)
    __obj.updateDynamic("object")("test_helpers.test_clock")
    __obj.asInstanceOf[ResponseTestClock]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseTestClock] (val x: Self) extends AnyVal {
    
    inline def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setDeleted(value: Unit): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    inline def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    inline def setDeletes_after(value: Double): Self = StObject.set(x, "deletes_after", value.asInstanceOf[js.Any])
    
    inline def setFrozen_time(value: Double): Self = StObject.set(x, "frozen_time", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLastResponse(value: ApiVersion): Self = StObject.set(x, "lastResponse", value.asInstanceOf[js.Any])
    
    inline def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setObject(value: test_helpersDottest_clock): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
