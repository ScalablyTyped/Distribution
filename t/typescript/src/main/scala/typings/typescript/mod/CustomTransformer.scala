package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomTransformer extends js.Object {
  
  def transformBundle(node: Bundle): Bundle = js.native
  
  def transformSourceFile(node: SourceFile): SourceFile = js.native
}
object CustomTransformer {
  
  @scala.inline
  def apply(transformBundle: Bundle => Bundle, transformSourceFile: SourceFile => SourceFile): CustomTransformer = {
    val __obj = js.Dynamic.literal(transformBundle = js.Any.fromFunction1(transformBundle), transformSourceFile = js.Any.fromFunction1(transformSourceFile))
    __obj.asInstanceOf[CustomTransformer]
  }
  
  @scala.inline
  implicit class CustomTransformerOps[Self <: CustomTransformer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTransformBundle(value: Bundle => Bundle): Self = this.set("transformBundle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTransformSourceFile(value: SourceFile => SourceFile): Self = this.set("transformSourceFile", js.Any.fromFunction1(value))
  }
}
