package typings
package webgmeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BasePathsDefault extends js.Object {
  /**
    * Array of base paths for the layouts.
    *  basePaths = ['../src/client/js/Layouts']
    * 
    * @type {string[]}
    */
  var basePaths: js.Array[java.lang.String]
  /**
    * default = 'DefaultLayout'
    */
  var default: java.lang.String
}

object Anon_BasePathsDefault {
  @scala.inline
  def apply(basePaths: js.Array[java.lang.String], default: java.lang.String): Anon_BasePathsDefault = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("basePaths")(basePaths)
    __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[Anon_BasePathsDefault]
  }
}

