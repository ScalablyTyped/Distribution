package typings.xregexp.xregexpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// scopes: 'default', 'class', or 'all'
/*
  Native flags:
  g - global
  i - ignore case
  m - multiline anchors
  y - sticky (Firefox 3+)
  Additional XRegExp flags:
  n - explicit capture
  s - dot matches all (aka singleline)
  x - free-spacing and line comments (aka extended)
  */
trait TokenOpts extends js.Object {
  var customFlags: js.UndefOr[String] = js.undefined
  var scope: js.UndefOr[String] = js.undefined
  var trigger: js.UndefOr[js.Function0[Boolean]] = js.undefined
}

object TokenOpts {
  @scala.inline
  def apply(customFlags: String = null, scope: String = null, trigger: () => Boolean = null): TokenOpts = {
    val __obj = js.Dynamic.literal()
    if (customFlags != null) __obj.updateDynamic("customFlags")(customFlags.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (trigger != null) __obj.updateDynamic("trigger")(js.Any.fromFunction0(trigger))
    __obj.asInstanceOf[TokenOpts]
  }
}

