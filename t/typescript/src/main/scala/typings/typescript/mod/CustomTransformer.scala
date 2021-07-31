package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomTransformer extends StObject {
  
  def transformBundle(node: Bundle): Bundle
  
  def transformSourceFile(node: SourceFile): SourceFile
}
object CustomTransformer {
  
  @scala.inline
  def apply(transformBundle: Bundle => Bundle, transformSourceFile: SourceFile => SourceFile): CustomTransformer = {
    val __obj = js.Dynamic.literal(transformBundle = js.Any.fromFunction1(transformBundle), transformSourceFile = js.Any.fromFunction1(transformSourceFile))
    __obj.asInstanceOf[CustomTransformer]
  }
  
  @scala.inline
  implicit class CustomTransformerMutableBuilder[Self <: CustomTransformer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTransformBundle(value: Bundle => Bundle): Self = StObject.set(x, "transformBundle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTransformSourceFile(value: SourceFile => SourceFile): Self = StObject.set(x, "transformSourceFile", js.Any.fromFunction1(value))
  }
}
