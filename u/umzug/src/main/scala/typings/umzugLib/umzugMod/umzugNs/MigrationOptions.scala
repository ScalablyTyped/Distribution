package typings
package umzugLib.umzugMod.umzugNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MigrationOptions extends js.Object {
  /**
    * A function that maps a file path to a migration object in the form
    * { up: Function, down: Function }. The default for this is to require(...)
    * the file as javascript, but you can use this to transpile TypeScript,
    * read raw sql etc.
    * See https://github.com/sequelize/umzug/tree/master/test/fixtures
    * for examples.
    */
  var customResolver: js.UndefOr[js.Function1[/* path */ java.lang.String, umzugLib.Anon_Down]] = js.undefined
  /*
    * The params that gets passed to the migrations.
    * Might be an array or a synchronous function which returns an array.
    */
  var params: js.UndefOr[js.Array[_]] = js.undefined
  /** The path to the migrations directory. */
  var path: js.UndefOr[java.lang.String] = js.undefined
  /** The pattern that determines whether or not a file is a migration. */
  var pattern: js.UndefOr[stdLib.RegExp] = js.undefined
  /**
    * A function that receives and returns the to be executed function.
    * This can be used to modify the function.
    */
  var wrap: js.UndefOr[js.Function1[/* fn */ js.Any, _]] = js.undefined
}

object MigrationOptions {
  @scala.inline
  def apply(
    customResolver: js.Function1[/* path */ java.lang.String, umzugLib.Anon_Down] = null,
    params: js.Array[_] = null,
    path: java.lang.String = null,
    pattern: stdLib.RegExp = null,
    wrap: js.Function1[/* fn */ js.Any, _] = null
  ): MigrationOptions = {
    val __obj = js.Dynamic.literal()
    if (customResolver != null) __obj.updateDynamic("customResolver")(customResolver)
    if (params != null) __obj.updateDynamic("params")(params)
    if (path != null) __obj.updateDynamic("path")(path)
    if (pattern != null) __obj.updateDynamic("pattern")(pattern)
    if (wrap != null) __obj.updateDynamic("wrap")(wrap)
    __obj.asInstanceOf[MigrationOptions]
  }
}

