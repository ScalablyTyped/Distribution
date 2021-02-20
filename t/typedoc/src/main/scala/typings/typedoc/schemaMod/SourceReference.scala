package typings.typedoc.schemaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.S<typedoc.typedoc/dist/lib/models.SourceReference, 'fileName' | 'line' | 'character'> */
@js.native
trait SourceReference
  extends __ModelToObject[js.Any] {
  
  var character: ModelToObject[Double] | Double = js.native
  
  var fileName: ModelToObject[String] | String = js.native
  
  var line: ModelToObject[Double] | Double = js.native
}
object SourceReference {
  
  @scala.inline
  def apply(
    character: ModelToObject[Double] | Double,
    fileName: ModelToObject[String] | String,
    line: ModelToObject[Double] | Double
  ): SourceReference = {
    val __obj = js.Dynamic.literal(character = character.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceReference]
  }
  
  @scala.inline
  implicit class SourceReferenceMutableBuilder[Self <: SourceReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCharacter(value: ModelToObject[Double] | Double): Self = StObject.set(x, "character", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharacterVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "character", js.Array(value :_*))
    
    @scala.inline
    def setFileName(value: ModelToObject[String] | String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileNameVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "fileName", js.Array(value :_*))
    
    @scala.inline
    def setLine(value: ModelToObject[Double] | Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "line", js.Array(value :_*))
  }
}
