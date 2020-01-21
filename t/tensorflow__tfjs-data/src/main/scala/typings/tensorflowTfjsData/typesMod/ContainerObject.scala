package typings.tensorflowTfjsData.typesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerObject[T]
  extends /* x */ StringDictionary[ContainerOrT[T]]
     with Container[T]

object ContainerObject {
  @scala.inline
  def apply[T](StringDictionary: /* x */ StringDictionary[ContainerOrT[T]] = null): ContainerObject[T] = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ContainerObject[T]]
  }
}

