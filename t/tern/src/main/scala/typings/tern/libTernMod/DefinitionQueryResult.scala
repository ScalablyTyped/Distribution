package typings.tern.libTernMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefinitionQueryResult extends StObject {
  
  /** A slice of the code in front of the definition Can be used to find a definition’s location in a modified file. */
  var context: js.UndefOr[String] = js.undefined
  
  /** The offset from the start of the context to the actual definition. Can be used to find a definition’s location in a modified file. */
  var contextOffset: js.UndefOr[Double] = js.undefined
  
  /** If the definition had documentation associated with it, these will also be returned. */
  var doc: js.UndefOr[String] = js.undefined
  
  /** The end position of the expression. */
  var end: js.UndefOr[Double | Position] = js.undefined
  
  /** The file in which the definition was defined. */
  var file: js.UndefOr[String] = js.undefined
  
  /** If the definition had origin information associated with it, these will also be returned. */
  var origin: js.UndefOr[String] = js.undefined
  
  /** The start position of the expression. */
  var start: js.UndefOr[Double | Position] = js.undefined
  
  /** If the definition had urls associated with it, these will also be returned. */
  var url: js.UndefOr[String] = js.undefined
}
object DefinitionQueryResult {
  
  inline def apply(): DefinitionQueryResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefinitionQueryResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DefinitionQueryResult] (val x: Self) extends AnyVal {
    
    inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextOffset(value: Double): Self = StObject.set(x, "contextOffset", value.asInstanceOf[js.Any])
    
    inline def setContextOffsetUndefined: Self = StObject.set(x, "contextOffset", js.undefined)
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setDoc(value: String): Self = StObject.set(x, "doc", value.asInstanceOf[js.Any])
    
    inline def setDocUndefined: Self = StObject.set(x, "doc", js.undefined)
    
    inline def setEnd(value: Double | Position): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    
    inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    inline def setStart(value: Double | Position): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
