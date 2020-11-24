package typings.tstl.errorGeneratorMod

import typings.tstl.invalidArgumentMod.InvalidArgument
import typings.tstl.outOfRangeMod.OutOfRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tstl/internal/exception/ErrorGenerator", "ErrorGenerator")
@js.native
object ErrorGenerator extends js.Object {
  
  def empty(instance: Instance, method: String): OutOfRange = js.native
  
  @JSName("erased_iterator")
  def erasedIterator(instance: Instance, method: String): InvalidArgument = js.native
  
  @JSName("excessive_index")
  def excessiveIndex(instance: Instance, method: String, index: Double, size: Double): OutOfRange = js.native
  
  @JSName("get_class_name")
  def getClassName(instance: String): String = js.native
  @JSName("get_class_name")
  def getClassName(instance: Instance): String = js.native
  
  @JSName("iterator_end_value")
  def iteratorEndValue(instance: Instance): OutOfRange = js.native
  @JSName("iterator_end_value")
  def iteratorEndValue(instance: Instance, method: String): OutOfRange = js.native
  
  @JSName("key_nout_found")
  def keyNoutFound[Key](instance: Instance, method: String, key: Key): OutOfRange = js.native
  
  @JSName("negative_index")
  def negativeIndex(instance: Instance, method: String, index: Double): OutOfRange = js.native
  
  @JSName("negative_iterator")
  def negativeIterator(instance: Instance, method: String, index: Double): OutOfRange = js.native
  
  @JSName("not_my_iterator")
  def notMyIterator(instance: Instance, method: String): InvalidArgument = js.native
}
