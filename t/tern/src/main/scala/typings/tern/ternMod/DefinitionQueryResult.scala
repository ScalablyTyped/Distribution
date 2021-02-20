package typings.tern.ternMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefinitionQueryResult extends StObject {
  
  /** A slice of the code in front of the definition Can be used to find a definition’s location in a modified file. */
  var context: js.UndefOr[String] = js.native
  
  /** The offset from the start of the context to the actual definition. Can be used to find a definition’s location in a modified file. */
  var contextOffset: js.UndefOr[Double] = js.native
  
  /** If the definition had documentation associated with it, these will also be returned. */
  var doc: js.UndefOr[String] = js.native
  
  /** The end position of the expression. */
  var end: js.UndefOr[Double | Position] = js.native
  
  /** The file in which the definition was defined. */
  var file: js.UndefOr[String] = js.native
  
  /** If the definition had origin information associated with it, these will also be returned. */
  var origin: js.UndefOr[String] = js.native
  
  /** The start position of the expression. */
  var start: js.UndefOr[Double | Position] = js.native
  
  /** If the definition had urls associated with it, these will also be returned. */
  var url: js.UndefOr[String] = js.native
}
object DefinitionQueryResult {
  
  @scala.inline
  def apply(): DefinitionQueryResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefinitionQueryResult]
  }
  
  @scala.inline
  implicit class DefinitionQueryResultMutableBuilder[Self <: DefinitionQueryResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextOffset(value: Double): Self = StObject.set(x, "contextOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextOffsetUndefined: Self = StObject.set(x, "contextOffset", js.undefined)
    
    @scala.inline
    def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    @scala.inline
    def setDoc(value: String): Self = StObject.set(x, "doc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocUndefined: Self = StObject.set(x, "doc", js.undefined)
    
    @scala.inline
    def setEnd(value: Double | Position): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    @scala.inline
    def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    
    @scala.inline
    def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    @scala.inline
    def setStart(value: Double | Position): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
