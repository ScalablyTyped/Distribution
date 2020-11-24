package typings.typescriptCollections

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-collections/dist/lib/util", JSImport.Namespace)
@js.native
object utilMod extends js.Object {
  
  def compareToEquals[T](compareFunction: ICompareFunction[T]): IEqualsFunction[T] = js.native
  
  def defaultCompare[T](a: T, b: T): Double = js.native
  
  def defaultEquals[T](a: T, b: T): Boolean = js.native
  
  def defaultToString(item: js.Any): String = js.native
  
  def has(obj: js.Any, prop: js.Any): js.Any = js.native
  
  def isFunction(func: js.Any): Boolean = js.native
  
  def isString(obj: js.Any): Boolean = js.native
  
  def isUndefined(obj: js.Any): /* is undefined */ Boolean = js.native
  
  def makeString[T](item: T): String = js.native
  def makeString[T](item: T, join: String): String = js.native
  
  def reverseCompareFunction[T](): ICompareFunction[T] = js.native
  def reverseCompareFunction[T](compareFunction: ICompareFunction[T]): ICompareFunction[T] = js.native
  
  type ICompareFunction[T] = js.Function2[/* a */ T, /* b */ T, Double]
  
  type IEqualsFunction[T] = js.Function2[/* a */ T, /* b */ T, Boolean]
  
  type ILoopFunction[T] = js.Function1[/* a */ T, Boolean | Unit]
}
