package typings.wxServerSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Created extends js.Object {
  var created: typings.wxServerSdk.wxServerSdkNumbers.`0` | typings.wxServerSdk.wxServerSdkNumbers.`1`
  var updated: typings.wxServerSdk.wxServerSdkNumbers.`0` | typings.wxServerSdk.wxServerSdkNumbers.`1`
}

object Created {
  @scala.inline
  def apply(
    created: typings.wxServerSdk.wxServerSdkNumbers.`0` | typings.wxServerSdk.wxServerSdkNumbers.`1`,
    updated: typings.wxServerSdk.wxServerSdkNumbers.`0` | typings.wxServerSdk.wxServerSdkNumbers.`1`
  ): Created = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[Created]
  }
}

