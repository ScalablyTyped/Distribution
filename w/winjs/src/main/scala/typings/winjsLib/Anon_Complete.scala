package typings
package winjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Complete extends js.Object {
  /**
    * All sections are loaded and animations are complete.
    **/
  var complete: java.lang.String
  /**
    * The Hub is loading sections.
    **/
  var loading: java.lang.String
}

object Anon_Complete {
  @scala.inline
  def apply(complete: java.lang.String, loading: java.lang.String): Anon_Complete = {
    val __obj = js.Dynamic.literal(complete = complete, loading = loading)
  
    __obj.asInstanceOf[Anon_Complete]
  }
}

