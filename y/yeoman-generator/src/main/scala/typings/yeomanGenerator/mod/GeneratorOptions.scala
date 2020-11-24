package typings.yeomanGenerator.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides options for generators.
  */
@js.native
trait GeneratorOptions
  extends /**
  * Gets or sets additional properties.
  */
/* name */ StringDictionary[js.Any] {
  
  /**
    * Gets or sets a collection of custom priorities.
    */
  var customPriorities: js.UndefOr[js.Array[Priority]] = js.native
}
object GeneratorOptions {
  
  @scala.inline
  def apply(): GeneratorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeneratorOptions]
  }
  
  @scala.inline
  implicit class GeneratorOptionsOps[Self <: GeneratorOptions] (val x: Self) extends AnyVal {
    
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
    def setCustomPrioritiesVarargs(value: Priority*): Self = this.set("customPriorities", js.Array(value :_*))
    
    @scala.inline
    def setCustomPriorities(value: js.Array[Priority]): Self = this.set("customPriorities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomPriorities: Self = this.set("customPriorities", js.undefined)
  }
}
