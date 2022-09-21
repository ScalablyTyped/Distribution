package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InitFragment[Context] extends StObject {
  
  var content: String | Source = js.native
  
  def deserialize(): Unit = js.native
  def deserialize(context: Any): Unit = js.native
  
  var endContent: js.UndefOr[String | Source] = js.native
  
  def getContent(context: Context): String | Source = js.native
  
  def getEndContent(context: Context): js.UndefOr[String | Source] = js.native
  
  var key: js.UndefOr[String] = js.native
  
  var merge: Any = js.native
  
  var position: Double = js.native
  
  def serialize(): Unit = js.native
  def serialize(context: Any): Unit = js.native
  
  var stage: Double = js.native
}
