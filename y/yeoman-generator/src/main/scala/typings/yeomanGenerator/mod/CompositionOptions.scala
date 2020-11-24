package typings.yeomanGenerator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents options for composing a generator.
  */
@js.native
trait CompositionOptions extends js.Object {
  
  /**
    * The constructor of the generator.
    */
  var Generator: GeneratorConstructor = js.native
  
  /**
    * The path to the file containing the generator.
    */
  var path: String = js.native
}
object CompositionOptions {
  
  @scala.inline
  def apply(Generator: GeneratorConstructor, path: String): CompositionOptions = {
    val __obj = js.Dynamic.literal(Generator = Generator.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompositionOptions]
  }
  
  @scala.inline
  implicit class CompositionOptionsOps[Self <: CompositionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGenerator(value: GeneratorConstructor): Self = this.set("Generator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
  }
}
