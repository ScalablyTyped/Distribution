package typings.swiftclick

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SwiftClickObject extends StObject {
  
  def addNodeNamesToTrack(nodeNamesArray: js.Array[String]): Unit
  
  def replaceNodeNamesToTrack(nodeNamesArray: js.Array[String]): Unit
  
  def useCssParser(useParser: Boolean): Unit
}
object SwiftClickObject {
  
  inline def apply(
    addNodeNamesToTrack: js.Array[String] => Unit,
    replaceNodeNamesToTrack: js.Array[String] => Unit,
    useCssParser: Boolean => Unit
  ): SwiftClickObject = {
    val __obj = js.Dynamic.literal(addNodeNamesToTrack = js.Any.fromFunction1(addNodeNamesToTrack), replaceNodeNamesToTrack = js.Any.fromFunction1(replaceNodeNamesToTrack), useCssParser = js.Any.fromFunction1(useCssParser))
    __obj.asInstanceOf[SwiftClickObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SwiftClickObject] (val x: Self) extends AnyVal {
    
    inline def setAddNodeNamesToTrack(value: js.Array[String] => Unit): Self = StObject.set(x, "addNodeNamesToTrack", js.Any.fromFunction1(value))
    
    inline def setReplaceNodeNamesToTrack(value: js.Array[String] => Unit): Self = StObject.set(x, "replaceNodeNamesToTrack", js.Any.fromFunction1(value))
    
    inline def setUseCssParser(value: Boolean => Unit): Self = StObject.set(x, "useCssParser", js.Any.fromFunction1(value))
  }
}
