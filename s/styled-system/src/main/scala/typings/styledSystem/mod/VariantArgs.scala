package typings.styledSystem.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VariantArgs[TStyle, K /* <: String */, TPropName] extends js.Object {
  
  var key: js.UndefOr[String] = js.native
  
  /** Component prop, defaults to "variant" */
  var prop: js.UndefOr[TPropName] = js.native
  
  /** theme key for variant definitions */
  var scale: js.UndefOr[String] = js.native
  
  /** inline theme aware variants definitions  */
  var variants: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in K ]: TStyle}
    */ typings.styledSystem.styledSystemStrings.VariantArgs with TopLevel[js.Any]
  ] = js.native
}
object VariantArgs {
  
  @scala.inline
  def apply[TStyle, K /* <: String */, TPropName](): VariantArgs[TStyle, K, TPropName] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VariantArgs[TStyle, K, TPropName]]
  }
  
  @scala.inline
  implicit class VariantArgsOps[Self <: VariantArgs[_, _, _], TStyle, K /* <: String */, TPropName] (val x: Self with (VariantArgs[TStyle, K, TPropName])) extends AnyVal {
    
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setProp(value: TPropName): Self = this.set("prop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProp: Self = this.set("prop", js.undefined)
    
    @scala.inline
    def setScale(value: String): Self = this.set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    
    @scala.inline
    def setVariants(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in K ]: TStyle}
      */ typings.styledSystem.styledSystemStrings.VariantArgs with TopLevel[js.Any]
    ): Self = this.set("variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVariants: Self = this.set("variants", js.undefined)
  }
}
