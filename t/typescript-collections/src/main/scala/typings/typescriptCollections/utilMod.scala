package typings.typescriptCollections

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("typescript-collections/dist/lib/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compareToEquals[T](compareFunction: ICompareFunction[T]): IEqualsFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("compareToEquals")(compareFunction.asInstanceOf[js.Any]).asInstanceOf[IEqualsFunction[T]]
  
  inline def defaultCompare[T](a: T, b: T): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultCompare")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def defaultEquals[T](a: T, b: T): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultEquals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def defaultToString(item: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultToString")(item.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def has(obj: Any, prop: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("has")(obj.asInstanceOf[js.Any], prop.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def isFunction(func: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(func.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isString(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isUndefined(obj: Any): /* is undefined */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUndefined")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is undefined */ Boolean]
  
  inline def makeString[T](item: T): String = ^.asInstanceOf[js.Dynamic].applyDynamic("makeString")(item.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def makeString[T](item: T, join: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("makeString")(item.asInstanceOf[js.Any], join.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def reverseCompareFunction[T](): ICompareFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("reverseCompareFunction")().asInstanceOf[ICompareFunction[T]]
  inline def reverseCompareFunction[T](compareFunction: ICompareFunction[T]): ICompareFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("reverseCompareFunction")(compareFunction.asInstanceOf[js.Any]).asInstanceOf[ICompareFunction[T]]
  
  type ICompareFunction[T] = js.Function2[/* a */ T, /* b */ T, Double]
  
  type IEqualsFunction[T] = js.Function2[/* a */ T, /* b */ T, Boolean]
  
  type ILoopFunction[T] = js.Function1[/* a */ T, Boolean | Unit]
}
