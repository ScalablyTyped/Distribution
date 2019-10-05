package typings.umbraco.umbraco.services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Tree args
  */
trait ITreeArgs extends js.Object {
  var cacheKey: js.UndefOr[String] = js.undefined
  var section: String
}

object ITreeArgs {
  @scala.inline
  def apply(section: String, cacheKey: String = null): ITreeArgs = {
    val __obj = js.Dynamic.literal(section = section)
    if (cacheKey != null) __obj.updateDynamic("cacheKey")(cacheKey)
    __obj.asInstanceOf[ITreeArgs]
  }
}

