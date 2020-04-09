package typings.webpack.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.webpack.webpackStrings.`var`
  - typings.webpack.webpackStrings.assign
  - typings.webpack.webpackStrings.`this`
  - typings.webpack.webpackStrings.window
  - typings.webpack.webpackStrings.global
  - typings.webpack.webpackStrings.commonjs
  - typings.webpack.webpackStrings.commonjs2
  - typings.webpack.webpackStrings.amd
  - typings.webpack.webpackStrings.umd
  - typings.webpack.webpackStrings.jsonp
  - typings.webpack.webpackStrings.system
*/
trait LibraryTarget extends js.Object

object LibraryTarget {
  @scala.inline
  def amd: typings.webpack.webpackStrings.amd = this.cast("amd")
  @scala.inline
  def assign: typings.webpack.webpackStrings.assign = this.cast("assign")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def commonjs: typings.webpack.webpackStrings.commonjs = this.cast("commonjs")
  @scala.inline
  def commonjs2: typings.webpack.webpackStrings.commonjs2 = this.cast("commonjs2")
  @scala.inline
  def global: typings.webpack.webpackStrings.global = this.cast("global")
  @scala.inline
  def jsonp: typings.webpack.webpackStrings.jsonp = this.cast("jsonp")
  @scala.inline
  def system: typings.webpack.webpackStrings.system = this.cast("system")
  @scala.inline
  def `this`: typings.webpack.webpackStrings.`this` = this.cast("this")
  @scala.inline
  def umd: typings.webpack.webpackStrings.umd = this.cast("umd")
  @scala.inline
  def `var`: typings.webpack.webpackStrings.`var` = this.cast("var")
  @scala.inline
  def window: typings.webpack.webpackStrings.window = this.cast("window")
}

