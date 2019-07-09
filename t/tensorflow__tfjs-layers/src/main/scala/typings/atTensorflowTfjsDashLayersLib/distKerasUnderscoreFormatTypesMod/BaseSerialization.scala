package typings
package atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseSerialization[N /* <: java.lang.String */, T /* <: PyJson[stdLib.Extract[java.lang.String, java.lang.String]] */] extends PyJsonDict {
  var class_name: N
  var config: T
}

object BaseSerialization {
  @scala.inline
  def apply[N /* <: java.lang.String */, T /* <: PyJson[stdLib.Extract[java.lang.String, java.lang.String]] */](class_name: N, config: T): BaseSerialization[N, T] = {
    val __obj = js.Dynamic.literal(class_name = class_name.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BaseSerialization[N, T]]
  }
}

