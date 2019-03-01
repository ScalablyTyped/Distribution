package typings
package webpackLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HashDigest extends js.Object {
  var hashDigest: js.UndefOr[java.lang.String] = js.undefined
  var hashDigestLength: js.UndefOr[scala.Double] = js.undefined
  var hashFunction: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_HashDigest {
  @scala.inline
  def apply(
    hashDigest: java.lang.String = null,
    hashDigestLength: scala.Int | scala.Double = null,
    hashFunction: java.lang.String = null
  ): Anon_HashDigest = {
    val __obj = js.Dynamic.literal()
    if (hashDigest != null) __obj.updateDynamic("hashDigest")(hashDigest)
    if (hashDigestLength != null) __obj.updateDynamic("hashDigestLength")(hashDigestLength.asInstanceOf[js.Any])
    if (hashFunction != null) __obj.updateDynamic("hashFunction")(hashFunction)
    __obj.asInstanceOf[Anon_HashDigest]
  }
}

