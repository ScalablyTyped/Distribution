package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * A relative pattern is a helper to construct glob patterns that are matched
	 * relatively to a base path. The base path can either be an absolute file path
	 * or a [workspace folder](#WorkspaceFolder).
	 */
trait RelativePattern extends js.Object {
  /**
  		 * A base file path to which this pattern will be matched against relatively.
  		 */
  var base: java.lang.String
  /**
  		 * A file glob pattern like `*.{ts,js}` that will be matched on file paths
  		 * relative to the base path.
  		 *
  		 * Example: Given a base of `/home/work/folder` and a file path of `/home/work/folder/index.js`,
  		 * the file glob pattern will match on `index.js`.
  		 */
  var pattern: java.lang.String
}

object RelativePattern {
  @scala.inline
  def apply(base: java.lang.String, pattern: java.lang.String): RelativePattern = {
    val __obj = js.Dynamic.literal(base = base, pattern = pattern)
  
    __obj.asInstanceOf[RelativePattern]
  }
}

