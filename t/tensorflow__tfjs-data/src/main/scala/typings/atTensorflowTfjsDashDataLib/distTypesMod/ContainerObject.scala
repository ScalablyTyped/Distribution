package typings
package atTensorflowTfjsDashDataLib.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerObject[T]
  extends /* x */ org.scalablytyped.runtime.StringDictionary[ContainerOrT[T]]
     with Container[T]

object ContainerObject {
  @scala.inline
  def apply[T](StringDictionary: /* x */ org.scalablytyped.runtime.StringDictionary[ContainerOrT[T]] = null): ContainerObject[T] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ContainerObject[T]]
  }
}

