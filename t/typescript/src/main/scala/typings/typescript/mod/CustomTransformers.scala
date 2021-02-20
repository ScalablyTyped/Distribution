package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomTransformers extends StObject {
  
  /** Custom transformers to evaluate after built-in .js transformations. */
  var after: js.UndefOr[js.Array[TransformerFactory[SourceFile] | CustomTransformerFactory]] = js.native
  
  /** Custom transformers to evaluate after built-in .d.ts transformations. */
  var afterDeclarations: js.UndefOr[js.Array[(TransformerFactory[Bundle | SourceFile]) | CustomTransformerFactory]] = js.native
  
  /** Custom transformers to evaluate before built-in .js transformations. */
  var before: js.UndefOr[js.Array[TransformerFactory[SourceFile] | CustomTransformerFactory]] = js.native
}
object CustomTransformers {
  
  @scala.inline
  def apply(): CustomTransformers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomTransformers]
  }
  
  @scala.inline
  implicit class CustomTransformersMutableBuilder[Self <: CustomTransformers] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAfter(value: js.Array[TransformerFactory[SourceFile] | CustomTransformerFactory]): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterDeclarations(value: js.Array[(TransformerFactory[Bundle | SourceFile]) | CustomTransformerFactory]): Self = StObject.set(x, "afterDeclarations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterDeclarationsUndefined: Self = StObject.set(x, "afterDeclarations", js.undefined)
    
    @scala.inline
    def setAfterDeclarationsVarargs(value: ((TransformerFactory[Bundle | SourceFile]) | CustomTransformerFactory)*): Self = StObject.set(x, "afterDeclarations", js.Array(value :_*))
    
    @scala.inline
    def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
    
    @scala.inline
    def setAfterVarargs(value: (TransformerFactory[SourceFile] | CustomTransformerFactory)*): Self = StObject.set(x, "after", js.Array(value :_*))
    
    @scala.inline
    def setBefore(value: js.Array[TransformerFactory[SourceFile] | CustomTransformerFactory]): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
    
    @scala.inline
    def setBeforeVarargs(value: (TransformerFactory[SourceFile] | CustomTransformerFactory)*): Self = StObject.set(x, "before", js.Array(value :_*))
  }
}
