package typings.vaultAuthAws.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Creds extends js.Object {
  var accessKeyId: js.UndefOr[String] = js.undefined
  var secretAccessKey: js.UndefOr[String] = js.undefined
  var sessionToken: js.UndefOr[String] = js.undefined
}

object Creds {
  @scala.inline
  def apply(accessKeyId: String = null, secretAccessKey: String = null, sessionToken: String = null): Creds = {
    val __obj = js.Dynamic.literal()
    if (accessKeyId != null) __obj.updateDynamic("accessKeyId")(accessKeyId.asInstanceOf[js.Any])
    if (secretAccessKey != null) __obj.updateDynamic("secretAccessKey")(secretAccessKey.asInstanceOf[js.Any])
    if (sessionToken != null) __obj.updateDynamic("sessionToken")(sessionToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Creds]
  }
}

