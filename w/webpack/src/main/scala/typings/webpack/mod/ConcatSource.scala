package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConcatSource
  extends StObject
     with Source {
  
  def add(item: String): Unit = js.native
  def add(item: Source): Unit = js.native
  
  def addAllSkipOptimizing(items: js.Array[Source]): Unit = js.native
  
  def getChildren(): js.Array[Source] = js.native
}
