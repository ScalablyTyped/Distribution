package typings.weighted

import org.scalablytyped.runtime.StringDictionary
import typings.weighted.weightedMod.RandomFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("weighted", JSImport.Namespace)
  @js.native
  def apply(obj: StringDictionary[Double]): String = js.native
  @JSImport("weighted", JSImport.Namespace)
  @js.native
  def apply(obj: StringDictionary[Double], rand: RandomFunc): String = js.native
  /**
    * Weighted returns a Function additionally available as `weighted.select`
    */
  @JSImport("weighted", JSImport.Namespace)
  @js.native
  def apply[T](set: js.Array[T], weights: js.Array[Double]): T = js.native
  @JSImport("weighted", JSImport.Namespace)
  @js.native
  def apply[T](set: js.Array[T], weights: js.Array[Double], rand: RandomFunc): T = js.native
  
  @JSImport("weighted", "select")
  @js.native
  val select: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof weighted */ js.Any = js.native
}
