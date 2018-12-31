package typings
package xregexpLib.xregexpMod.OuterXRegExpNs

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
  var customFlags: js.UndefOr[java.lang.String] = js.undefined
  var scope: js.UndefOr[java.lang.String] = js.undefined
  var trigger: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
}

