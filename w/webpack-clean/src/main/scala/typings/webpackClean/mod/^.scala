package typings.webpackClean.mod

import typings.webpack.mod.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A webpack plugin to clean specified files after build
  */
@JSImport("webpack-clean", JSImport.Namespace)
@js.native
class ^ protected () extends Plugin {
  /**
    * @param files  array of files or string for a single file relative to the basePath
    * or to the context of your config (if the basePath param is not specified)
    */
  def this(files: String) = this()
  def this(files: js.Array[String]) = this()
  def this(files: String, options: Options) = this()
  def this(files: js.Array[String], options: Options) = this()
}

