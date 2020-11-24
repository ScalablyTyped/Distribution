package typings.unified.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Transform an AST node/tree into text
  */
@js.native
trait Compiler extends js.Object {
  
  /**
    * Transform an AST node/tree into text
    *
    * @returns Compiled text
    */
  def compile(): String = js.native
}
object Compiler {
  
  @scala.inline
  def apply(compile: () => String): Compiler = {
    val __obj = js.Dynamic.literal(compile = js.Any.fromFunction0(compile))
    __obj.asInstanceOf[Compiler]
  }
  
  @scala.inline
  implicit class CompilerOps[Self <: Compiler] (val x: Self) extends AnyVal {
    
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
    def setCompile(value: () => String): Self = this.set("compile", js.Any.fromFunction0(value))
  }
}
