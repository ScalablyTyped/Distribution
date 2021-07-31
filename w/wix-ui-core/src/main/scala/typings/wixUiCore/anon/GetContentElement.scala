package typings.wixUiCore.anon

import typings.unidriverCore.mod.UniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetContentElement extends StObject {
  
  def getContentElement(): js.Promise[UniDriver[js.Any]]
  
  def queryDocumentOrElement(query: String): js.Promise[UniDriver[js.Any]]
}
object GetContentElement {
  
  @scala.inline
  def apply(
    getContentElement: () => js.Promise[UniDriver[js.Any]],
    queryDocumentOrElement: String => js.Promise[UniDriver[js.Any]]
  ): GetContentElement = {
    val __obj = js.Dynamic.literal(getContentElement = js.Any.fromFunction0(getContentElement), queryDocumentOrElement = js.Any.fromFunction1(queryDocumentOrElement))
    __obj.asInstanceOf[GetContentElement]
  }
  
  @scala.inline
  implicit class GetContentElementMutableBuilder[Self <: GetContentElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetContentElement(value: () => js.Promise[UniDriver[js.Any]]): Self = StObject.set(x, "getContentElement", js.Any.fromFunction0(value))
    
    @scala.inline
    def setQueryDocumentOrElement(value: String => js.Promise[UniDriver[js.Any]]): Self = StObject.set(x, "queryDocumentOrElement", js.Any.fromFunction1(value))
  }
}
