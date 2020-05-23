package typings.webpack.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HashDigest extends js.Object {
  var hashDigest: js.UndefOr[String] = js.undefined
  var hashDigestLength: js.UndefOr[Double] = js.undefined
  var hashFunction: js.UndefOr[String] = js.undefined
}

object HashDigest {
  @scala.inline
  def apply(
    hashDigest: String = null,
    hashDigestLength: js.UndefOr[Double] = js.undefined,
    hashFunction: String = null
  ): HashDigest = {
    val __obj = js.Dynamic.literal()
    if (hashDigest != null) __obj.updateDynamic("hashDigest")(hashDigest.asInstanceOf[js.Any])
    if (!js.isUndefined(hashDigestLength)) __obj.updateDynamic("hashDigestLength")(hashDigestLength.get.asInstanceOf[js.Any])
    if (hashFunction != null) __obj.updateDynamic("hashFunction")(hashFunction.asInstanceOf[js.Any])
    __obj.asInstanceOf[HashDigest]
  }
}

