package typings.utilPromisify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofpromisify extends js.Object {
  /**
  		 * @deprecated
  		 * Not exposed by native `util.promisify` or supported by browserify's `util.promisify`.
  		 *
  		 * Use `util.promisify.custom` instead.
  		 */
  val customPromisifyArgs: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: typeof polyfill.customPromisifyArgs */ js.Any
  ] = js.undefined
}

object Typeofpromisify {
  @scala.inline
  def apply(
    customPromisifyArgs: /* import warning: importer.ImportType#apply Failed type conversion: typeof polyfill.customPromisifyArgs */ js.Any = null
  ): Typeofpromisify = {
    val __obj = js.Dynamic.literal()
    if (customPromisifyArgs != null) __obj.updateDynamic("customPromisifyArgs")(customPromisifyArgs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofpromisify]
  }
}

