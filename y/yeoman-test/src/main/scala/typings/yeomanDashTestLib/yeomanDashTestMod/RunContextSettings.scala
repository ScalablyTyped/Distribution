package typings
package yeomanDashTestLib.yeomanDashTestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RunContextSettings extends js.Object {
  /**
  	 * Namespace (only used if Generator is a constructor)
  	 * @default 'gen:test'
  	 */
  var namespace: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * File path to the generator (only used if Generator is a constructor)
  	 */
  var resolved: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Automatically run this generator in a tmp dir
  	 * @default true
  	 */
  var tmpdir: js.UndefOr[scala.Boolean] = js.undefined
}

