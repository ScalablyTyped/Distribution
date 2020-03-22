package typings.webpack.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ P in webpack.webpack.LibraryTarget ]: string} */
trait AuxiliaryCommentObject extends js.Object {
  var amd: String
  var assign: String
  var commonjs: String
  var commonjs2: String
  var global: String
  var jsonp: String
  var `this`: String
  var umd: String
  var `var`: String
  var window: String
}

object AuxiliaryCommentObject {
  @scala.inline
  def apply(
    amd: String,
    assign: String,
    commonjs: String,
    commonjs2: String,
    global: String,
    jsonp: String,
    `this`: String,
    umd: String,
    `var`: String,
    window: String
  ): AuxiliaryCommentObject = {
    val __obj = js.Dynamic.literal(amd = amd.asInstanceOf[js.Any], assign = assign.asInstanceOf[js.Any], commonjs = commonjs.asInstanceOf[js.Any], commonjs2 = commonjs2.asInstanceOf[js.Any], global = global.asInstanceOf[js.Any], jsonp = jsonp.asInstanceOf[js.Any], umd = umd.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.updateDynamic("this")(`this`.asInstanceOf[js.Any])
    __obj.updateDynamic("var")(`var`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuxiliaryCommentObject]
  }
}

