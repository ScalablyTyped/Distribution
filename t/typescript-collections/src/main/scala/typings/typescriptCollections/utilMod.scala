package typings.typescriptCollections

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("typescript-collections/dist/lib/util", "compareToEquals")
  @js.native
  def compareToEquals[T](compareFunction: ICompareFunction[T]): IEqualsFunction[T] = js.native
  
  @JSImport("typescript-collections/dist/lib/util", "defaultCompare")
  @js.native
  def defaultCompare[T](a: T, b: T): Double = js.native
  
  @JSImport("typescript-collections/dist/lib/util", "defaultEquals")
  @js.native
  def defaultEquals[T](a: T, b: T): Boolean = js.native
  
  @JSImport("typescript-collections/dist/lib/util", "defaultToString")
  @js.native
  def defaultToString(item: js.Any): String = js.native
  
  @JSImport("typescript-collections/dist/lib/util", "has")
  @js.native
  def has(obj: js.Any, prop: js.Any): js.Any = js.native
  
  @JSImport("typescript-collections/dist/lib/util", "isFunction")
  @js.native
  def isFunction(func: js.Any): Boolean = js.native
  
  @JSImport("typescript-collections/dist/lib/util", "isString")
  @js.native
  def isString(obj: js.Any): Boolean = js.native
  
  @JSImport("typescript-collections/dist/lib/util", "isUndefined")
  @js.native
  def isUndefined(obj: js.Any): /* is undefined */ Boolean = js.native
  
  @JSImport("typescript-collections/dist/lib/util", "makeString")
  @js.native
  def makeString[T](item: T): String = js.native
  @JSImport("typescript-collections/dist/lib/util", "makeString")
  @js.native
  def makeString[T](item: T, join: String): String = js.native
  
  @JSImport("typescript-collections/dist/lib/util", "reverseCompareFunction")
  @js.native
  def reverseCompareFunction[T](): ICompareFunction[T] = js.native
  @JSImport("typescript-collections/dist/lib/util", "reverseCompareFunction")
  @js.native
  def reverseCompareFunction[T](compareFunction: ICompareFunction[T]): ICompareFunction[T] = js.native
  
  type ICompareFunction[T] = js.Function2[/* a */ T, /* b */ T, Double]
  
  type IEqualsFunction[T] = js.Function2[/* a */ T, /* b */ T, Boolean]
  
  type ILoopFunction[T] = js.Function1[/* a */ T, Boolean | Unit]
}
