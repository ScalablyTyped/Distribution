package typings.typedoc.anon

import typings.typedoc.schemaMod.ModelToObject
import typings.typedoc.schemaMod._ModelToObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<typedoc.typedoc/dist/lib/serialization/schema.SourceReference> */
trait PartialSourceReference extends StObject {
  
  var character: js.UndefOr[ModelToObject[Double] | Double] = js.undefined
  
  var fileName: js.UndefOr[ModelToObject[String] | String] = js.undefined
  
  var line: js.UndefOr[ModelToObject[Double] | Double] = js.undefined
}
object PartialSourceReference {
  
  @scala.inline
  def apply(): PartialSourceReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSourceReference]
  }
  
  @scala.inline
  implicit class PartialSourceReferenceMutableBuilder[Self <: PartialSourceReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCharacter(value: ModelToObject[Double] | Double): Self = StObject.set(x, "character", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharacterUndefined: Self = StObject.set(x, "character", js.undefined)
    
    @scala.inline
    def setCharacterVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "character", js.Array(value :_*))
    
    @scala.inline
    def setFileName(value: ModelToObject[String] | String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
    
    @scala.inline
    def setFileNameVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "fileName", js.Array(value :_*))
    
    @scala.inline
    def setLine(value: ModelToObject[Double] | Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    @scala.inline
    def setLineVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "line", js.Array(value :_*))
  }
}
