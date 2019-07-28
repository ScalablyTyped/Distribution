package typings.yargs.yargsMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequireDirectoryOptions extends js.Object {
  /** Blacklist certain modules. */
  var exclude: js.UndefOr[RegExp | (js.Function1[/* pathToFile */ String, Boolean])] = js.undefined
  /** The types of files to look for when requiring command modules. */
  var extensions: js.UndefOr[js.Array[String]] = js.undefined
  /** Whitelist certain modules */
  var include: js.UndefOr[RegExp | (js.Function1[/* pathToFile */ String, Boolean])] = js.undefined
  /** Look for command modules in all subdirectories and apply them as a flattened (non-hierarchical) list. */
  var recurse: js.UndefOr[Boolean] = js.undefined
  /**
    * A synchronous function called for each command module encountered.
    * Accepts `commandObject`, `pathToFile`, and `filename` as arguments.
    * Returns `commandObject` to include the command; any falsy value to exclude/skip it.
    */
  var visit: js.UndefOr[
    js.Function3[
      /* commandObject */ js.Any, 
      /* pathToFile */ js.UndefOr[String], 
      /* filename */ js.UndefOr[String], 
      _
    ]
  ] = js.undefined
}

object RequireDirectoryOptions {
  @scala.inline
  def apply(
    exclude: RegExp | (js.Function1[/* pathToFile */ String, Boolean]) = null,
    extensions: js.Array[String] = null,
    include: RegExp | (js.Function1[/* pathToFile */ String, Boolean]) = null,
    recurse: js.UndefOr[Boolean] = js.undefined,
    visit: (/* commandObject */ js.Any, /* pathToFile */ js.UndefOr[String], /* filename */ js.UndefOr[String]) => _ = null
  ): RequireDirectoryOptions = {
    val __obj = js.Dynamic.literal()
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions)
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (!js.isUndefined(recurse)) __obj.updateDynamic("recurse")(recurse)
    if (visit != null) __obj.updateDynamic("visit")(js.Any.fromFunction3(visit))
    __obj.asInstanceOf[RequireDirectoryOptions]
  }
}

