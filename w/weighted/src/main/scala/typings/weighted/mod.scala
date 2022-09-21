package typings.weighted

import org.scalablytyped.runtime.StringDictionary
import typings.weighted.weightedMod.RandomFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(obj: StringDictionary[Double]): String = ^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(obj: StringDictionary[Double], rand: RandomFunc): String = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], rand.asInstanceOf[js.Any])).asInstanceOf[String]
  /**
    * Weighted returns a Function additionally available as `weighted.select`
    */
  inline def apply[T](set: js.Array[T], weights: js.Array[Double]): T = (^.asInstanceOf[js.Dynamic].apply(set.asInstanceOf[js.Any], weights.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def apply[T](set: js.Array[T], weights: js.Array[Double], rand: RandomFunc): T = (^.asInstanceOf[js.Dynamic].apply(set.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], rand.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @JSImport("weighted", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("weighted", "select")
  @js.native
  val select: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof weighted */ Any = js.native
}
