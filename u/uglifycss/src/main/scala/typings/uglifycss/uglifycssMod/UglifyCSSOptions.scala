package typings.uglifycss.uglifycssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UglifyCSSOptions extends js.Object {
  /**
    * Preserves newlines within and around preserved comments
    */
  var cuteComments: js.UndefOr[Boolean] = js.undefined
  /**
    * eEpands variables; by default, @variables blocks are preserved and var(x)s are not expanded
    */
  var expandVars: js.UndefOr[Boolean] = js.undefined
  /**
    * Adds a newline (approx.) every n characters; 0 means no newline and is the default value
    */
  var maxLineLen: js.UndefOr[Double] = js.undefined
  /**
    * Removes newlines within preserved comments; by default, newlines are preserved
    */
  var uglyComments: js.UndefOr[Boolean] = js.undefined
}

object UglifyCSSOptions {
  @scala.inline
  def apply(
    cuteComments: js.UndefOr[Boolean] = js.undefined,
    expandVars: js.UndefOr[Boolean] = js.undefined,
    maxLineLen: Int | Double = null,
    uglyComments: js.UndefOr[Boolean] = js.undefined
  ): UglifyCSSOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cuteComments)) __obj.updateDynamic("cuteComments")(cuteComments.asInstanceOf[js.Any])
    if (!js.isUndefined(expandVars)) __obj.updateDynamic("expandVars")(expandVars.asInstanceOf[js.Any])
    if (maxLineLen != null) __obj.updateDynamic("maxLineLen")(maxLineLen.asInstanceOf[js.Any])
    if (!js.isUndefined(uglyComments)) __obj.updateDynamic("uglyComments")(uglyComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[UglifyCSSOptions]
  }
}

