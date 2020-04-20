package typings.swaggerStats

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBucketcurrent extends js.Object {
  var bucket_current: Double
  var bucket_duration: Double
  var length: Double
}

object AnonBucketcurrent {
  @scala.inline
  def apply(bucket_current: Double, bucket_duration: Double, length: Double): AnonBucketcurrent = {
    val __obj = js.Dynamic.literal(bucket_current = bucket_current.asInstanceOf[js.Any], bucket_duration = bucket_duration.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBucketcurrent]
  }
}

