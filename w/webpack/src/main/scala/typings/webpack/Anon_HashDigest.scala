package typings.webpack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HashDigest extends js.Object {
  var hashDigest: js.UndefOr[String] = js.undefined
  var hashDigestLength: js.UndefOr[Double] = js.undefined
  var hashFunction: js.UndefOr[String] = js.undefined
}

object Anon_HashDigest {
  @scala.inline
  def apply(hashDigest: String = null, hashDigestLength: Int | Double = null, hashFunction: String = null): Anon_HashDigest = {
    val __obj = js.Dynamic.literal()
    if (hashDigest != null) __obj.updateDynamic("hashDigest")(hashDigest.asInstanceOf[js.Any])
    if (hashDigestLength != null) __obj.updateDynamic("hashDigestLength")(hashDigestLength.asInstanceOf[js.Any])
    if (hashFunction != null) __obj.updateDynamic("hashFunction")(hashFunction.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_HashDigest]
  }
}

