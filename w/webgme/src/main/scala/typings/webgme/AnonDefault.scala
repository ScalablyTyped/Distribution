package typings.webgme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDefault extends js.Object {
  /**
    * Array of base paths for the layouts.
    *  basePaths = ['../src/client/js/Layouts']
    * 
    * @type {string[]}
    */
  var basePaths: js.Array[String]
  /**
    * default = 'DefaultLayout'
    */
  var default: String
}

object AnonDefault {
  @scala.inline
  def apply(basePaths: js.Array[String], default: String): AnonDefault = {
    val __obj = js.Dynamic.literal(basePaths = basePaths.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDefault]
  }
}

