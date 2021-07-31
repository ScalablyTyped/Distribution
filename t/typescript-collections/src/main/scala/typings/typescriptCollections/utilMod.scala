package typings.typescriptCollections

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("typescript-collections/dist/lib/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def compareToEquals[T](compareFunction: ICompareFunction[T]): IEqualsFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("compareToEquals")(compareFunction.asInstanceOf[js.Any]).asInstanceOf[IEqualsFunction[T]]
  
  @scala.inline
  def defaultCompare[T](a: T, b: T): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultCompare")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def defaultEquals[T](a: T, b: T): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultEquals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def defaultToString(item: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultToString")(item.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def has(obj: js.Any, prop: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("has")(obj.asInstanceOf[js.Any], prop.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def isFunction(func: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(func.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isString(obj: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isUndefined(obj: js.Any): /* is undefined */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUndefined")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is undefined */ Boolean]
  
  @scala.inline
  def makeString[T](item: T): String = ^.asInstanceOf[js.Dynamic].applyDynamic("makeString")(item.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def makeString[T](item: T, join: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("makeString")(item.asInstanceOf[js.Any], join.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def reverseCompareFunction[T](): ICompareFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("reverseCompareFunction")().asInstanceOf[ICompareFunction[T]]
  @scala.inline
  def reverseCompareFunction[T](compareFunction: ICompareFunction[T]): ICompareFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("reverseCompareFunction")(compareFunction.asInstanceOf[js.Any]).asInstanceOf[ICompareFunction[T]]
  
  type ICompareFunction[T] = js.Function2[/* a */ T, /* b */ T, Double]
  
  type IEqualsFunction[T] = js.Function2[/* a */ T, /* b */ T, Boolean]
  
  type ILoopFunction[T] = js.Function1[/* a */ T, Boolean | Unit]
}
