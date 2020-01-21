package typings.webpackConfigUtils.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.webpackConfigUtils.webpackConfigUtilsStrings.production
  - typings.webpackConfigUtils.webpackConfigUtilsStrings.prod
  - typings.webpackConfigUtils.webpackConfigUtilsStrings.test
  - typings.webpackConfigUtils.webpackConfigUtilsStrings.development
  - typings.webpackConfigUtils.webpackConfigUtilsStrings.dev
*/
trait EnvVars extends js.Object

object EnvVars {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dev: typings.webpackConfigUtils.webpackConfigUtilsStrings.dev = this.cast("dev")
  @scala.inline
  def development: typings.webpackConfigUtils.webpackConfigUtilsStrings.development = this.cast("development")
  @scala.inline
  def prod: typings.webpackConfigUtils.webpackConfigUtilsStrings.prod = this.cast("prod")
  @scala.inline
  def production: typings.webpackConfigUtils.webpackConfigUtilsStrings.production = this.cast("production")
  @scala.inline
  def test: typings.webpackConfigUtils.webpackConfigUtilsStrings.test = this.cast("test")
}

