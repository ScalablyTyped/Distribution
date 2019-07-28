package typings.atTensorflowTfjsDashCore.distTypesMod

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecursiveArray[T /* <: js.Any */] extends /* index */ NumberDictionary[T | RecursiveArray[T]]

object RecursiveArray {
  @scala.inline
  def apply[T /* <: js.Any */](NumberDictionary: /* index */ NumberDictionary[T | RecursiveArray[T]] = null): RecursiveArray[T] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[RecursiveArray[T]]
  }
}

