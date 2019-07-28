package typings.webgme

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
  var basePaths: js.Array[String]
  /**
    * default = 'DefaultLayout'
    */
  var default: String
}

object Anon_BasePathsDefault {
  @scala.inline
  def apply(basePaths: js.Array[String], default: String): Anon_BasePathsDefault = {
    val __obj = js.Dynamic.literal(basePaths = basePaths, default = default)
  
    __obj.asInstanceOf[Anon_BasePathsDefault]
  }
}

