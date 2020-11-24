package typings.yeomanEnvironment.mod

import typings.yeomanGenerator.mod.GeneratorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides options for instantiating a generator.
  */
@js.native
trait InstantiateOptions[TOptions /* <: GeneratorOptions */] extends js.Object {
  
  /**
    * The arguments to pass to the generator.
    */
  var arguments: js.UndefOr[String | js.Array[String]] = js.native
  
  /**
    * The options for creating the generator.
    */
  var options: js.UndefOr[TOptions] = js.native
}
object InstantiateOptions {
  
  @scala.inline
  def apply[TOptions /* <: GeneratorOptions */](): InstantiateOptions[TOptions] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstantiateOptions[TOptions]]
  }
  
  @scala.inline
  implicit class InstantiateOptionsOps[Self <: InstantiateOptions[_], TOptions /* <: GeneratorOptions */] (val x: Self with InstantiateOptions[TOptions]) extends AnyVal {
    
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
    def setArgumentsVarargs(value: String*): Self = this.set("arguments", js.Array(value :_*))
    
    @scala.inline
    def setArguments(value: String | js.Array[String]): Self = this.set("arguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArguments: Self = this.set("arguments", js.undefined)
    
    @scala.inline
    def setOptions(value: TOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
  }
}
